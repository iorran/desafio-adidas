package com.adidas.evt.event;

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
@Api("Event Entity")
public class Event {
	 
	@ApiModelProperty(value = "event description", required = true, dataType="String")
	@NotNull
	@Builder.Default private String description = "Hello! I'm a mock event service"; 
}
