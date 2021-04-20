package org.acme.reactive.crud;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Media {

  String type;
  String imageType;
  String containsExplicitContent;
  List<Resource> resources;
}
