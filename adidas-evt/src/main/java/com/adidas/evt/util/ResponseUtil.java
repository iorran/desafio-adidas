package com.adidas.evt.util;

import java.util.Optional;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * Utility class for ResponseEntity creation.
 */
public final class ResponseUtil {

	private ResponseUtil() {
	} 
	
	public static <X> ResponseEntity<X> wrapOrNotFound(Optional<X> maybeResponse) {
		return wrapOrNotFound(maybeResponse, null);
	}
 
	public static <X> ResponseEntity<X> wrapOrNotFound(Optional<X> maybeResponse, HttpHeaders header) {
		return maybeResponse.map(response -> ResponseEntity.ok()
			.headers(header)
			.body(response))
			.orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

}