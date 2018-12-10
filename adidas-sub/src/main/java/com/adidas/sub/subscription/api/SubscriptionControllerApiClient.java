package com.adidas.sub.subscription.api;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;

import com.adidas.sub.config.ClientConfiguration;

@FeignClient(name = "ADIDAS-DB", fallback = SubscriptionFallback.class, configuration = ClientConfiguration.class)
@RibbonClient("ADIDAS-DB")
public interface SubscriptionControllerApiClient extends SubscriptionControllerApi {
}