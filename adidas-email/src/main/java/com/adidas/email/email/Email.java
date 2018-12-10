package com.adidas.email.email;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Api("Email Entity")
public class Email {
	 
	@ApiModelProperty(value = "email message", required = true, dataType="String")
	@NotNull
	@Builder.Default private String message = "Hello! I'm a mock email service"; 
}
