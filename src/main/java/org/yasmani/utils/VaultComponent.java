package org.yasmani.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class VaultComponent {

	@Value("${username}")
	private String username;
	
	
	public VaultComponent() {
		super();
	}

	public String showCredentials() {
		return "Username:" + username.toUpperCase(); 
	}
}
