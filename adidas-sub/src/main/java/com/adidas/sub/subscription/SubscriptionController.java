package com.adidas.sub.subscription;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adidas.sub.subscription.model.Subscription;
import com.adidas.sub.util.HeaderUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Authorization;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Api(value = "subscriptions")
@RestController
@RequestMapping("subscriptions")
public class SubscriptionController{
	private static final String ENTITY_NAME = "Subscription";

	@Autowired
	private SubscriptionService subscriptionService;
	
	@ApiOperation(value = "Create a new subscription", httpMethod = "POST", nickname = "createSubscription", authorizations = {@Authorization(value="basicAuth")})
	@PostMapping
	public ResponseEntity<Long> createSubscription(@RequestBody Subscription subscription) throws URISyntaxException{ 
		if (subscription.getId() != null) {
			return ResponseEntity.badRequest().headers(
					HeaderUtil.createFailureAlert(ENTITY_NAME, "idexists", "A new subscription cannot already have an ID"))
					.body(null);
		}
		Long result = subscriptionService.save(subscription).getBody();
		return ResponseEntity.created(new URI("subscriptions/" + result.toString()))
				.headers(HeaderUtil.createEntityCreationAlert(ENTITY_NAME, result.toString())).body(result);
	}

	@ApiOperation(value = "Recovery subscription by id", httpMethod = "GET", nickname = "findSubscriptionById", authorizations = {@Authorization(value="basicAuth")})
	@GetMapping("{id}")
	public ResponseEntity<Subscription> findSubscriptionById(@ApiParam(value = "Subscription Id", required = true, type = "Long") @PathVariable Long id) {
		log.debug("REST request to get Subscription : {}", id);
		return subscriptionService.findById(id); 
	} 

	@ApiOperation(value = "Recovery all subscriptions", httpMethod = "GET", nickname = "findAllSubscription", authorizations = {@Authorization(value="basicAuth")})
	@GetMapping
	public ResponseEntity<List<Subscription>> findAllSubscription() {
		log.debug("REST request to get all Subscriptions"); 
		return subscriptionService.findAll(); 
	}
}