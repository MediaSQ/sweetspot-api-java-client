package com.sweetspot.api.services;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.SSLContext;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class Api {
  private static String HOST = "https://app.sweetspotintelligence.com";
  
  private HttpClient client;
  
  public Api(String user, String password) throws KeyManagementException, NoSuchAlgorithmException, KeyStoreException {
    this.client = HttpClients.custom()
      .setDefaultCredentialsProvider(createCredentialsProvider(user, password))
      .setSslcontext(getSSLContext())
      .build();
  }
  
  public String get(String resource) throws ClientProtocolException, IOException {
    HttpGet httpGet = new HttpGet(Api.HOST + resource);
    HttpResponse response = client.execute(httpGet);
    HttpEntity entity = response.getEntity();
    
    return EntityUtils.toString(entity);
  }

  private CredentialsProvider createCredentialsProvider(String user, String password) {
    CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
    UsernamePasswordCredentials credentials = new UsernamePasswordCredentials(user, password);
    credentialsProvider.setCredentials(AuthScope.ANY, credentials);
    return credentialsProvider;
  }
  
  /*
   * Problems between our CA and JDK7. 
   * Oracle doesn't verify our current certificate so we have implemented a 
   * monkey-patch for accepting all the certificates.
   * 
   * This, kids, is an example of weak code. Don't put this in production...
   */
  private SSLContext getSSLContext() throws KeyManagementException, NoSuchAlgorithmException, KeyStoreException {
    return SSLContexts.custom().loadTrustMaterial(null, new TrustStrategy() {
      @Override
      public boolean isTrusted(final X509Certificate[] chain, final String authType) throws CertificateException {
        return true;
      }
    }).useTLS().build();
  }

}
