package org.acme.eservices.client;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.core.MultivaluedMap;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.ext.ClientHeadersFactory;
import org.jboss.resteasy.specimpl.MultivaluedMapImpl;

@ApplicationScoped
public class AuthHeaders implements ClientHeadersFactory {

  public static final String OCP_APIM_SUBSCRIPTION_KEY = "Ocp-Apim-Subscription-Key";
  @ConfigProperty(name = "eservices-client.subscriptionkey")
  private String subscriptionKey;

  @Override
  public MultivaluedMap<String, String> update(MultivaluedMap<String, String> incomingHeaders,
      MultivaluedMap<String, String> clientOutgoingHeaders) {
    MultivaluedMap<String, String> result = new MultivaluedMapImpl<>();
    result.add(OCP_APIM_SUBSCRIPTION_KEY, subscriptionKey);
    return result;
  }
}