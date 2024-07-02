package com.sbiepay.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Client {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String clientId;
    private String clientSecret;
    private String redirectUri;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getClientSecret() {
		return clientSecret;
	}
	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}
	public String getRedirectUri() {
		return redirectUri;
	}
	public void setRedirectUri(String redirectUri) {
		this.redirectUri = redirectUri;
	}
    
    

}
