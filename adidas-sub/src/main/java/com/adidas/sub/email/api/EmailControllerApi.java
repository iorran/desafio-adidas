/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.adidas.sub.email.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.adidas.sub.email.model.Email;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-09T19:37:16.118Z")

@Api(value = "EmailController", description = "the EmailController API")
public interface EmailControllerApi {

    @ApiOperation(value = "Recovery all email", nickname = "findAllEmails", notes = "", response = Email.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "email-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Email.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/emails",
        produces = "*/*",
        consumes = "",
        method = RequestMethod.GET)
    ResponseEntity<Email> findAllEmails();

}