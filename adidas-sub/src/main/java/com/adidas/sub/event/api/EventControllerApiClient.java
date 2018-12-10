package com.adidas.sub.event.api;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;

import com.adidas.sub.config.ClientConfiguration;

@FeignClient(name = "ADIDAS-EVT", fallback = EventFallback.class, configuration = ClientConfiguration.class)
@RibbonClient("ADIDAS-EVT")
public interface EventControllerApiClient extends EventControllerApi {
}