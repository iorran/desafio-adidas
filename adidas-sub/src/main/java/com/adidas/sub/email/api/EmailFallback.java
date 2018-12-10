package com.adidas.sub.email.api;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.adidas.sub.email.model.Email;

@Component
class EmailFallback implements EmailControllerApiClient {

	@Override
	public ResponseEntity<Email> findAllEmails() {
		Email email = new Email();
		email.setMessage("Circuit break in action, maybe your email service is not running!");
		return ResponseEntity.ok(email);
	} 
}