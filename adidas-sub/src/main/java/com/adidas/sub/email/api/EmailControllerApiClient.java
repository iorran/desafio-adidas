package com.adidas.sub.email.api;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;

import com.adidas.sub.config.ClientConfiguration;

@FeignClient(name = "ADIDAS-EMAIL", fallback = EmailFallback.class, configuration = ClientConfiguration.class)
@RibbonClient("ADIDAS-EMAIL")
public interface EmailControllerApiClient extends EmailControllerApi {
}