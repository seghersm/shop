package org.acme.eservices.client.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateProductRequest {

  ShopifyProduct product;
}
