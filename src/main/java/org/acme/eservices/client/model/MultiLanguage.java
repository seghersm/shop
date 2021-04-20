package org.acme.eservices.client.model;

import java.util.ArrayList;

public class MultiLanguage extends ArrayList<Translated> {

  public String getForLanguage(String language) {
    return getForLanguage(language, null);
  }

  public String getForLanguage(String language, String other) {
    return stream().filter(t -> t.getLanguage().equals(language)).findFirst().map(t -> t.getText())
        .orElse(other);
  }
}
