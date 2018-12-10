package com.adidas.sub.subscription;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.adidas.sub.email.api.EmailControllerApiClient;
import com.adidas.sub.event.api.EventControllerApiClient;
import com.adidas.sub.subscription.api.SubscriptionControllerApiClient;
import com.adidas.sub.subscription.model.Subscription;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class SubscriptionService {
	@Autowired
	private SubscriptionControllerApiClient subscriptionControllerApi;

	@Autowired
	private EventControllerApiClient eventControllerApiClient;

	@Autowired
	private EmailControllerApiClient emailControllerApi;
	
	public ResponseEntity<Subscription> findById(Long id) {
		logEmail();
		LogEvent();
		return subscriptionControllerApi.findSubscriptionById(id);
	}
	
	public ResponseEntity<List<Subscription>> findAll() {
		logEmail();
		LogEvent();
		return subscriptionControllerApi.findAllSubscription();
	}

	public ResponseEntity<Long> save(Subscription subscription) {
		logEmail();
		LogEvent();
		return subscriptionControllerApi.createSubscription(subscription);
	}

	private void LogEvent() {
		log.info("Do somenthing event service {}", eventControllerApiClient.findAllEvents());
	} 
	
	private void logEmail() {
		log.info("Do somenthing email service {}", emailControllerApi.findAllEmails());
	}  
}