package org.acme.reactive.crud;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PriceResponse {
  private String currency;
  private MinMaxPrice recommendedRetailPrice;
  private MinMaxPrice wholesalePrice;
}
