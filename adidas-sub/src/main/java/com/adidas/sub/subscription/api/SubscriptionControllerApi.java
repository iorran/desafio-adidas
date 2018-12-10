/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.adidas.sub.subscription.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.adidas.sub.subscription.model.Subscription;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-09T18:19:42.961Z")

@Api(value = "SubscriptionController", description = "the SubscriptionController API")
public interface SubscriptionControllerApi {

    @ApiOperation(value = "Create a new subscription", nickname = "createSubscription", notes = "", response = Long.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "subscription-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Long.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/subscriptions",
        produces = "*/*",
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<Long> createSubscription(@ApiParam(value = "subscription" ,required=true )  @Valid @RequestBody Subscription subscription);


    @ApiOperation(value = "Recovery all subscriptions", nickname = "findAllSubscription", notes = "", response = Subscription.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "subscription-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Subscription.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/subscriptions",
        produces = "*/*",
        consumes = "",
        method = RequestMethod.GET)
    ResponseEntity<List<Subscription>> findAllSubscription();


    @ApiOperation(value = "Recovery subscription by id", nickname = "findSubscriptionById", notes = "", response = Subscription.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "subscription-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Subscription.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/subscriptions/{id}",
        produces = "*/*",
        consumes = "",
        method = RequestMethod.GET)
    ResponseEntity<Subscription> findSubscriptionById(@ApiParam(value = "Subscription Id",required=true) @PathVariable("id") Long id);

}