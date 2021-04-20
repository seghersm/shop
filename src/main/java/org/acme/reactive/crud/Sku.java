package org.acme.reactive.crud;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Sku {

  private String sku;
  private String ean;
  private List<SizeContainer> size;
  private Weight netWeight;
  //    private Weight grossWeight;
  private int stock;

  private Instant lastModifiedDate;
  private LocalDate availabilityDate;

  public boolean isActive() {
    return stock > 0 || availabilityDate != null;
  }

  public String getCup(String sizeUnit) {
    return size.stream().filter(s -> sizeUnit.equals(s.getSizeStandard())).findFirst()
        .map(s -> s.getSizeDetail().getCup()).orElse(null);
  }

  public String getSize(String sizeUnit) {
    return size.stream().filter(s -> sizeUnit.equals(s.getSizeStandard())).findFirst()
        .map(s -> s.getSizeDetail().getMeasurement() + (s.getSizeDetail().getCup() != null ? s
            .getSizeDetail().getCup() : "")).orElse(null);
  }
}