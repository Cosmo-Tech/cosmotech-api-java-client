/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 2.4.3-dev
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Configuration of scenario runs deletion automatic mecanism
 */
@ApiModel(description = "Configuration of scenario runs deletion automatic mecanism")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-30T13:20:41.466929757Z[Etc/UTC]")
public class DeleteHistoricalData {
  public static final String SERIALIZED_NAME_ENABLE = "enable";
  @SerializedName(SERIALIZED_NAME_ENABLE)
  private Boolean enable = true;

  public static final String SERIALIZED_NAME_POLL_FREQUENCY = "pollFrequency";
  @SerializedName(SERIALIZED_NAME_POLL_FREQUENCY)
  private Integer pollFrequency = 10000;

  public static final String SERIALIZED_NAME_TIME_OUT = "timeOut";
  @SerializedName(SERIALIZED_NAME_TIME_OUT)
  private Integer timeOut = 28800;

  public DeleteHistoricalData() { 
  }

  public DeleteHistoricalData enable(Boolean enable) {
    
    this.enable = enable;
    return this;
  }

   /**
   * Activate or Deactivate historical data deletion
   * @return enable
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Activate or Deactivate historical data deletion")

  public Boolean getEnable() {
    return enable;
  }


  public void setEnable(Boolean enable) {
    this.enable = enable;
  }


  public DeleteHistoricalData pollFrequency(Integer pollFrequency) {
    
    this.pollFrequency = pollFrequency;
    return this;
  }

   /**
   * define the polling frequency of scenario run status (in millis)
   * @return pollFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "define the polling frequency of scenario run status (in millis)")

  public Integer getPollFrequency() {
    return pollFrequency;
  }


  public void setPollFrequency(Integer pollFrequency) {
    this.pollFrequency = pollFrequency;
  }


  public DeleteHistoricalData timeOut(Integer timeOut) {
    
    this.timeOut = timeOut;
    return this;
  }

   /**
   * define the polling timeout
   * @return timeOut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "define the polling timeout")

  public Integer getTimeOut() {
    return timeOut;
  }


  public void setTimeOut(Integer timeOut) {
    this.timeOut = timeOut;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteHistoricalData deleteHistoricalData = (DeleteHistoricalData) o;
    return Objects.equals(this.enable, deleteHistoricalData.enable) &&
        Objects.equals(this.pollFrequency, deleteHistoricalData.pollFrequency) &&
        Objects.equals(this.timeOut, deleteHistoricalData.timeOut);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, pollFrequency, timeOut);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteHistoricalData {\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    pollFrequency: ").append(toIndentedString(pollFrequency)).append("\n");
    sb.append("    timeOut: ").append(toIndentedString(timeOut)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

