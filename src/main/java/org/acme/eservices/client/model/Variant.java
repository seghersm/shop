package org.acme.eservices.client.model;

import javax.xml.bind.annotation.XmlAttribute;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Variant {
  String id;
  String price;
  String sku;
  String option1;
  int inventory_quantity;
   // "weight": 1.25,
    //    "weight_unit": "lb",

  /*": "IPOD2008PINK",
       "position": 1,
       "inventory_policy": "continue",
       "compare_at_price": null,
       "fulfillment_service": "manual",
       "inventory_management": "shopify",
       "option1": "Pink",
       "option2": null,
       "option3": null,
       "created_at": "2021-01-11T18:12:26-05:00",
       "updated_at": "2021-01-11T18:12:26-05:00",
       "taxable": true,
       "barcode": "1234_pink",
       "grams": 567,
       "image_id": 562641783,
       "weight": 1.25,
       "weight_unit": "lb",
       "inventory_item_id": 808950810,
       "inventory_quantity": 10,
       "old_inventory_quantity": 10,
       "requires_shipping": true,
       "admin_graphql_api_id": "gid://shopify/ProductVariant*/
}
