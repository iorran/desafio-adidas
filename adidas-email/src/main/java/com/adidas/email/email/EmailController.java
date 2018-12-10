package com.adidas.email.email;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adidas.email.util.ResponseUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Api(value = "emails")
@RestController
@RequestMapping("emails")
public class EmailController{  
	@ApiOperation(value = "Recovery all email", httpMethod = "GET", nickname = "findAllEmails", authorizations = {@Authorization(value="basicAuth")})
	@GetMapping
	public ResponseEntity<Email> findAllEmails() {
		log.debug("REST request to get all emails");   
		return ResponseUtil.wrapOrNotFound(Optional.of(Email.builder().build()));
	}
}