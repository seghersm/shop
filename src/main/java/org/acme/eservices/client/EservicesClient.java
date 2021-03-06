package org.acme.eservices.client;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.acme.eservices.client.model.StyleColor;
import org.acme.eservices.client.model.StyleColorResponse;
import org.acme.reactive.crud.PriceResponse;
import org.acme.reactive.crud.Sku;
import org.acme.reactive.crud.SkuResponse;
import org.acme.reactive.crud.SkuStock;
import org.eclipse.microprofile.rest.client.annotation.RegisterClientHeaders;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;
import org.jboss.resteasy.annotations.jaxrs.QueryParam;

@Path("/catalog/v2")
@RegisterRestClient(configKey = "eservices-client")
@RegisterClientHeaders(AuthHeaders.class)
@RegisterProvider(LoggingFilter.class)
public interface EservicesClient {

  @GET
  @Path("/{customer}/stylecolors")
  StyleColorResponse getStyleColors(@PathParam String customer, @QueryParam String brandCode,
      @QueryParam String seasonCode);

  @GET
  @Path("/{customer}/stylecolors/{styleColor}")
  StyleColor getByCode(@PathParam String customer, @PathParam String styleColor);

  @GET
  @Path("/{customer}/stylecolors/{styleColor}/skus")
  SkuResponse getSkus(@PathParam String customer, @PathParam String styleColor);

  @GET
  @Path("/{customer}/skus/{sku}")
  SkuStock getStock(@PathParam String customer, @PathParam String sku);

  @GET
  @Path("/{customer}/stylecolors/{styleColor}/price")
  PriceResponse getPrice(@PathParam String customer, @PathParam String styleColor);

}