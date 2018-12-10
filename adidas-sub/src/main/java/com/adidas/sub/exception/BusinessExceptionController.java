package com.adidas.sub.exception;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ControllerAdvice
public class BusinessExceptionController {
 
 
	@ExceptionHandler(value = { Exception.class })
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ResponseBody
	public BusinessError handleException(Exception exception, WebRequest request) {
		List<String> messages = Arrays.asList("Sorry, something wrong happened.");
		log.error(exception.getLocalizedMessage());
		return new BusinessError(messages, exception, BusinessTypeMessageEnum.ERROR);
	}
}