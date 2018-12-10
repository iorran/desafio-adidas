package com.adidas.db.config;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.adidas.db.subscription.GenderType;
import com.adidas.db.subscription.Subscription;
import com.adidas.db.subscription.SubscriptionRepository;

@Component
public class DataSetup implements ApplicationRunner{
	@Autowired
	SubscriptionRepository controller;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Subscription sb = Subscription.builder()
				.consent(true)
				.dateOfBith(LocalDate.now())
				.email("teste@gmail.com")
				.firstName("Teste")
				.gender(GenderType.M)
				.newsletterId(10L)
				.build();
				
		controller.save(sb);
	}
} 