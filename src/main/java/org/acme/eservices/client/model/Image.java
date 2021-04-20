package org.acme.eservices.client.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Image {
    String id;
    String product_id;
    int position;
    String src;
}
