package org.acme.eservices.client;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import org.acme.eservices.client.model.CreateProductRequest;
import org.acme.eservices.client.model.ShopifyProduct;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/admin/api/2021-01/products.json")
@RegisterRestClient(configKey = "shopify-client")
@RegisterProvider(LoggingFilter.class)
public interface ShopifyClient {

  @POST
  @Path("/")
  void createProduct(CreateProductRequest product);

}