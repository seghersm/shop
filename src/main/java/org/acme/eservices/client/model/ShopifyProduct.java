package org.acme.eservices.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShopifyProduct {
  String id;
  String sku;
  String title;
  String body_html;
  String vendor;
  String product_type;
  String created_at; //": "2021-01-11T18:12:26-05:00",;
  String handle; // ": "ipod-nano",
  String updated_at; //": "2021-01-11T18:12:26-05:00",
  String published_at; //": "2007-12-31T19:00:00-05:00",
  List<Image> images;
  List<Variant> variants;

//      "template_suffix": null,
 //     "published_scope": "web",
  //    "tags": "Emotive, Flash Memory, MP3, Music",
  //    "admin_graphql_api_id": "gid://shopify/Product/632910392",
   /*   "variants": [
    {
      "id": 808950810,
        "product_id": 632910392,
        "title": "Pink",
        "price": "199.00",
        "sku": "IPOD2008PINK",
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
        "admin_graphql_api_id": "gid://shopify/ProductVariant/808950810",
        "presentment_prices": [
      {
        "price": {
        "currency_code": "USD",
            "amount": "199.00"
      },
        "compare_at_price": null
      }
          ]
    },
    {
      "id": 49148385,
        "product_id": 632910392,
        "title": "Red",
        "price": "199.00",
        "sku": "IPOD2008RED",
        "position": 2,
        "inventory_policy": "continue",
        "compare_at_price": null,
        "fulfillment_service": "manual",
        "inventory_management": "shopify",
        "option1": "Red",
        "option2": null,
        "option3": null,
        "created_at": "2021-01-11T18:12:26-05:00",
        "updated_at": "2021-01-11T18:12:26-05:00",
        "taxable": true,
        "barcode": "1234_red",
        "grams": 567,
        "image_id": null,
        "weight": 1.25,
        "weight_unit": "lb",
        "inventory_item_id": 49148385,
        "inventory_quantity": 20,
        "old_inventory_quantity": 20,
        "requires_shipping": true,
        "admin_graphql_api_id": "gid://shopify/ProductVariant/49148385",
        "presentment_prices": [
      {
        "price": {
        "currency_code": "USD",
            "amount": "199.00"
      },
        "compare_at_price": null
      }
          ]
    },
    {
      "id": 39072856,
        "product_id": 632910392,
        "title": "Green",
        "price": "199.00",
        "sku": "IPOD2008GREEN",
        "position": 3,
        "inventory_policy": "continue",
        "compare_at_price": null,
        "f*/
}
