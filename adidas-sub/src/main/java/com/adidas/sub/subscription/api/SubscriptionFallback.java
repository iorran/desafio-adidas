package com.adidas.sub.subscription.api;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.adidas.sub.subscription.model.Subscription;

@Component
class SubscriptionFallback implements SubscriptionControllerApiClient {
	@Override
	public ResponseEntity<Long> createSubscription(@Valid Subscription subscription) {
		return ResponseEntity.ok(9999L);
	}

	public ResponseEntity<List<Subscription>> findAllSubscription() {
		return ResponseEntity.ok(new ArrayList<Subscription>());
	}

	@Override
	public ResponseEntity<Subscription> findSubscriptionById(Long id) {
		return ResponseEntity.ok(new Subscription());
	}
}