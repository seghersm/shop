package org.acme.eservices.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class StyleColorResponse {

  List<StyleColor> content;
  int totalCount;
}
