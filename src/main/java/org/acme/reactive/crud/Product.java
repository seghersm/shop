package org.acme.reactive.crud;

import java.time.Instant;
import java.time.MonthDay;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;

@Data
public class Product {

  public Product() {
  }

  private String id;
  Map<String, Long> backofficeIds;

  private Reference brand;
  private Reference series;
  private Reference family;
  private Reference style;
  private Reference introSeason;

  private List<String> seasons;

  private Map<String, String> name;
  private Map<String, String> styleName;
  private Map<String, String> styleDescription;
  private Map<String, String> productCategory;
  private Map<String, String> productType;
  private Map<String, String> productShape;
  private Map<String, String> mainColor;
  private Map<String, String> commercialColor;
  private Map<String, String> colorDescription;
  private Map<String, String> shapeDescription;
  private Map<String, String> stylingEffect;
  private Map<String, String> washInstructions;
  private Map<String, String> bleachInstructions;
  private Map<String, String> dryInstructions;
  private Map<String, String> ironInstructions;
  private Map<String, String> dryCleanInstructions;
  private Map<String, Map<String, String>> features;

  private List<Sku> skus;
  private List<Media> media;
  private List<Composition> composition;
  private List<String> otherColors;
  private List<String> assortmentIds;
  private List<String> synonyms;
  private String discount;

  private Instant lastModifiedDate;
  private boolean hidden;
  @Default
  private int sortOrder = Integer.MAX_VALUE;
  private Period preOrderPeriod;
  private DeliveryDates firstDeliveryDates;

  private Set<String> tags;

  private Integer b2bSortOrder;
  private Integer b2cSortOrder;
  private Integer brandSortOrder;
}
