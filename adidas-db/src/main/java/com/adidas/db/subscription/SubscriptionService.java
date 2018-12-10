package com.adidas.db.subscription;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SubscriptionService{

	@Autowired
	private SubscriptionRepository subscriptionRepository;

	@Transactional(readOnly = true)
	public Optional<Subscription> findById(Long id) {
		return subscriptionRepository.findById(id);
	}
	
	@Transactional(readOnly = true)
	public List<Subscription> findAll() {
		return subscriptionRepository.findAll();
	}

	public Long save(Subscription event) { 
		return subscriptionRepository.save(event).getId();
	}
}