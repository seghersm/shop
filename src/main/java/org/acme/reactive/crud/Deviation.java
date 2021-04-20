package org.acme.reactive.crud;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Deviation {

  private String countryCode;
  private Date firstDeliveryDate;
}
