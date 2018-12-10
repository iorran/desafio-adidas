package com.adidas.db.subscription;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Entity
@Api("Subscription Entity")
public class Subscription {
	@ApiModelProperty(value = "subscription id generated value", dataType="Long")
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

	@ApiModelProperty(value = "user email", required = true, dataType="String")
	@NotNull
	private String email;

	@ApiModelProperty(value = "user name", dataType="String")
	private String firstName;

	@ApiModelProperty(value = "gender", dataType="GenderType")
	@Enumerated(EnumType.STRING)
	private GenderType gender;

	@ApiModelProperty(value = "user date of bith", required = true, dataType="LocalDate")
	@NotNull
	private LocalDate dateOfBith;

	@ApiModelProperty(value = "flag for consent", required = true, dataType="Boolean")
	@NotNull
	private Boolean consent;

	@ApiModelProperty(value = "newsletter Id corresponding to the campaign", required = true, dataType="Long")
	@NotNull
	private Long newsletterId; 
}
