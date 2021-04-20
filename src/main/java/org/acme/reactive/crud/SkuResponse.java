package org.acme.reactive.crud;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SkuResponse {

  List<Sku> content;
  int totalCount;
}
