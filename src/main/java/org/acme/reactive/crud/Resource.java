package org.acme.reactive.crud;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Resource {
  String url;
  String format;
}
