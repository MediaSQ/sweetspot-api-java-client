package com.sweetspot.api.services;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

import org.apache.http.client.ClientProtocolException;

import com.sweetspot.api.models.Scorecard;
import com.sweetspot.api.models.ScorecardPanel;
import com.sweetspot.api.models.TypeBuilder;
import com.sweetspot.api.models.User;

public class SweetspotService {	
	private Api api;

	public SweetspotService(String user, String password) throws KeyManagementException, NoSuchAlgorithmException, KeyStoreException {
	  this.api = new Api(user, password);
	}
	
	/*
	 * GET
	 * /users/info.json
	 * 
	 */
	public User getUser() throws ClientProtocolException, IOException {
	  String json = this.api.get("/users/info.json");
	  return TypeBuilder.instance().buildFromJSON(json, User.class);
	}
	
	/*
	 * GET
	 * /v2/users/<user_id>/scorecards/<scorecard_id>.json
	 * 
	 */
	public Scorecard getScorecard(String userId, String scorecardId) throws ClientProtocolException, IOException {
	  String requestUrl = String.format("/v2/users/%s/scorecards/%s.json", userId, scorecardId);
	  String json = this.api.get(requestUrl);
	  
	  return TypeBuilder.instance().buildFromJSON(json, Scorecard.class);
	}
	
	/*
	 * GET
	 * /v2/scorecard_panels/<panel_id>.json
	 * 
	 */
	public ScorecardPanel getScorecardPanel(String panelId) throws ClientProtocolException, IOException {
	  String requestUrl = String.format("/v2/scorecard_panels/%s.json", panelId);
	  String json = this.api.get(requestUrl);
	  
	  return TypeBuilder.instance().buildFromJSON(json, ScorecardPanel.class);
	}
}
