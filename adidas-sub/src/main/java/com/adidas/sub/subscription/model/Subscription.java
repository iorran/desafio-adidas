package com.adidas.sub.subscription.model;

import java.time.LocalDate;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * Subscription
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-09T18:19:42.961Z")

public class Subscription   {
  @JsonProperty("consent")
  private Boolean consent = null;

  @JsonProperty("dateOfBith")
  private LocalDate dateOfBith = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("firstName")
  private String firstName = null;

  /**
   * gender
   */
  public enum GenderEnum {
    M("M"),
    
    F("F");

    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GenderEnum fromValue(String text) {
      for (GenderEnum b : GenderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("gender")
  private GenderEnum gender = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("newsletterId")
  private Long newsletterId = null;

  public Subscription consent(Boolean consent) {
    this.consent = consent;
    return this;
  }

  /**
   * flag for consent
   * @return consent
  **/
  @ApiModelProperty(required = true, value = "flag for consent")
  @NotNull


  public Boolean isConsent() {
    return consent;
  }

  public void setConsent(Boolean consent) {
    this.consent = consent;
  }

  public Subscription dateOfBith(LocalDate dateOfBith) {
    this.dateOfBith = dateOfBith;
    return this;
  }

  /**
   * user date of bith
   * @return dateOfBith
  **/
  @ApiModelProperty(required = true, value = "user date of bith")
  @NotNull

  @Valid

  public LocalDate getDateOfBith() {
    return dateOfBith;
  }

  public void setDateOfBith(LocalDate dateOfBith) {
    this.dateOfBith = dateOfBith;
  }

  public Subscription email(String email) {
    this.email = email;
    return this;
  }

  /**
   * user email
   * @return email
  **/
  @ApiModelProperty(required = true, value = "user email")
  @NotNull


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Subscription firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * user name
   * @return firstName
  **/
  @ApiModelProperty(value = "user name")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Subscription gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

  /**
   * gender
   * @return gender
  **/
  @ApiModelProperty(value = "gender")


  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public Subscription id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * subscription id generated value
   * @return id
  **/
  @ApiModelProperty(value = "subscription id generated value")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Subscription newsletterId(Long newsletterId) {
    this.newsletterId = newsletterId;
    return this;
  }

  /**
   * newsletter Id corresponding to the campaign
   * @return newsletterId
  **/
  @ApiModelProperty(required = true, value = "newsletter Id corresponding to the campaign")
  @NotNull


  public Long getNewsletterId() {
    return newsletterId;
  }

  public void setNewsletterId(Long newsletterId) {
    this.newsletterId = newsletterId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subscription subscription = (Subscription) o;
    return Objects.equals(this.consent, subscription.consent) &&
        Objects.equals(this.dateOfBith, subscription.dateOfBith) &&
        Objects.equals(this.email, subscription.email) &&
        Objects.equals(this.firstName, subscription.firstName) &&
        Objects.equals(this.gender, subscription.gender) &&
        Objects.equals(this.id, subscription.id) &&
        Objects.equals(this.newsletterId, subscription.newsletterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consent, dateOfBith, email, firstName, gender, id, newsletterId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subscription {\n");
    
    sb.append("    consent: ").append(toIndentedString(consent)).append("\n");
    sb.append("    dateOfBith: ").append(toIndentedString(dateOfBith)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    newsletterId: ").append(toIndentedString(newsletterId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

