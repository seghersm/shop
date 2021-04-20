package org.acme.eservices.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import lombok.Data;
import org.acme.reactive.crud.Media;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class StyleColor {

  private String code = null;
  private Code brand = null;
  private MultiLanguage name = null;
  private List<Code> seasons = null;
  private Code series = null;
  private Code family = null;
  private Code style = null;
  private Code introSeason = null;
  private List<Code> otherColors = null;
  private MultiLanguage styleName = null;
  private MultiLanguage styleDescription = null;
  private MultiLanguage productCategory = null;
  private MultiLanguage productType = null;
  private MultiLanguage productShape = null;
  private MultiLanguage mainColor = null;
  private MultiLanguage commercialColor = null;
  private MultiLanguage colorDescription = null;
  private MultiLanguage shapeDescription = null;
  private MultiLanguage stylingEffect = null;
  private MultiLanguage washInstructions = null;
  private MultiLanguage bleachInstructions = null;
  private MultiLanguage dryInstructions = null;
  private MultiLanguage ironInstructions = null;
  private MultiLanguage dryCleanInstructions = null;
  private List<String> assortmentIds = null;
  private List<Code> synonyms = null;
  private boolean stayerB2B;

  private List<Media> media;
/*
  private List<InformationAboutAvailableMedia> media = null;
  private List<Composition> composition = null;
  private List<Feature> features = null;
  private List<Sku> skus;
  private Period preOrderPeriod;
  private DeliveryDates firstDeliveryDates;*/
}
