package com.adidas.evt.event;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adidas.evt.util.ResponseUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Api(value = "events")
@RestController
@RequestMapping("events")
public class EventController{  
	@ApiOperation(value = "Recovery all event", httpMethod = "GET", nickname = "findAllEvents", authorizations = {@Authorization(value="basicAuth")})
	@GetMapping
	public ResponseEntity<Event> findAllEvents() {
		log.debug("REST request to get all events");   
		return ResponseUtil.wrapOrNotFound(Optional.of(Event.builder().build()));
	}
}