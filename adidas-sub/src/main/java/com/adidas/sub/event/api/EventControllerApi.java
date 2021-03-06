/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.adidas.sub.event.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.adidas.sub.event.model.Event;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-09T19:37:13.369Z")

@Api(value = "EventController", description = "the EventController API")
public interface EventControllerApi {

    @ApiOperation(value = "Recovery all event", nickname = "findAllEvents", notes = "", response = Event.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "event-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Event.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/events",
        produces = "*/*",
        consumes = "",
        method = RequestMethod.GET)
    ResponseEntity<Event> findAllEvents();

}
