package com.adidas.sub.event.api;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.adidas.sub.event.model.Event;

@Component
class EventFallback implements EventControllerApiClient {

	@Override
	public ResponseEntity<Event> findAllEvents() {
		Event evt = new Event();
		evt.setDescription("Circuit break in action, maybe your event service is not running!");
		return ResponseEntity.ok(evt);
	} 
}