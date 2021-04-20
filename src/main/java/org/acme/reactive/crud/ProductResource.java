package org.acme.reactive.crud;

import java.util.List;
import java.util.StringJoiner;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.acme.eservices.client.EservicesClient;
import org.acme.eservices.client.ShopifyClient;
import org.acme.eservices.client.model.CreateProductRequest;
import org.acme.eservices.client.model.Image;
import org.acme.eservices.client.model.ShopifyProduct;
import org.acme.eservices.client.model.StyleColor;
import org.acme.eservices.client.model.Variant;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path("products")
public class ProductResource {

  static final String language = "nl";
  public static final String TESTB2B = "TESTB2B";
  private static final String EU = "EU" ;

  @Inject
  @RestClient
  EservicesClient eservicesClient;

  @Inject
  @RestClient
  ShopifyClient shopifyClient;

  @ConfigProperty(name = "eservices-client.subscriptionkey")
  String subscriptionKey;

  @GET
  @Path("/{id}")
  public StyleColor get(@PathParam String id) {

    final StyleColor styleColor = eservicesClient.getByCode("TESTB2B", id);
    final CreateProductRequest map = map(styleColor);
  //  map.getProduct().setVariants(mapSkus(eservicesClient.getSkus(id)));
    shopifyClient.createProduct(map);
    return styleColor;
  }

  @GET
  @Path("/sync/{brand}/{season}")
  public void sync( @PathParam String brand, @PathParam String season){
    CompletableFuture.runAsync(() -> doSync(brand, season));
//    return "Sync started";
  }

  private void doSync(String brand, String season) {
      eservicesClient.getStyleColors( TESTB2B, brand, season).getContent().stream().forEach(
          styleColor -> {
            try {
              final PriceResponse price = eservicesClient
                  .getPrice(TESTB2B, styleColor.getCode());
              final List<Sku> skus = eservicesClient.getSkus(TESTB2B, styleColor.getCode()).content;
              final CreateProductRequest product = map(styleColor);
              product.getProduct().setVariants(mapVariants(styleColor, skus, price));
              shopifyClient.createProduct(product);
            }catch (Exception e){
              int i = 0;
              i++;
            }
          });
  }

  private List<Variant> mapVariants(StyleColor styleColor, List<Sku> skus, PriceResponse price) {
    return skus.parallelStream().map(sku ->
      Variant.builder().sku(sku.getSku())
          .inventory_quantity(sku.getStock())
          .option1(sku.getCup(EU))
          .option2(sku.getSize(EU))
          .price(price.getRecommendedRetailPrice().getMaximum().toString()).build()
    ).collect(Collectors.toList());
  }

  private CreateProductRequest map(StyleColor styleColor) {
    return CreateProductRequest.builder().product(ShopifyProduct.builder()
        .sku(styleColor.getCode())
        .title(styleColor.getName().getForLanguage(language))
        .body_html(getDescription(styleColor))
        .images(getImages(styleColor))
        .product_type(styleColor.getProductType().getForLanguage(language))
        .build()).build();
  }

  private List<Image> getImages(StyleColor styleColor) {
    return styleColor.getMedia().stream().map(ProductResource::map).collect(Collectors.toList());
  }

  private String getDescription(StyleColor styleColor) {
    StringJoiner  joiner = new StringJoiner(" ");
    joiner.add(styleColor.getShapeDescription().getForLanguage(language));
    joiner.add(styleColor.getStyleDescription().getForLanguage(language));
    joiner.add(styleColor.getColorDescription().getForLanguage(language));
    return joiner.toString();
  }

  private static Image map(Media media){
    return Image.builder().src(media.getResources().get(0).getUrl()).build();
  }

}