package org.yasmani.controller;

import org.apache.hc.core5.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yasmani.utils.VaultComponent;

@RestController
@RequestMapping("/vault")
public class VaultController {

	@Autowired
	private VaultComponent myComponent;
	
	@GetMapping("/credentials")
	public ResponseEntity<String> getVault() {
		String credentials;
	    try {
	        credentials = myComponent.showCredentials();
	        return ResponseEntity.ok("Los valores recuperados son: " + credentials);
	    } catch (Exception e) {
	        return ResponseEntity.status(HttpStatusCode.valueOf(1))
	                .body("Error al recuperar las credenciales: " + e.getMessage());
	    }
		
	}
}
