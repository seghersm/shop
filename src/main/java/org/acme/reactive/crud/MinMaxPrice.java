package org.acme.reactive.crud;

import java.math.BigDecimal;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MinMaxPrice {
  private BigDecimal minimum;
  private BigDecimal maximum;
}
