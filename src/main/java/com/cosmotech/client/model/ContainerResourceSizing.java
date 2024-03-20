/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.1.2
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.cosmotech.client.model.ContainerResourceSizeInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * a description object for resource requests and limits (default same configuration as basic sizing)
 */
@ApiModel(description = "a description object for resource requests and limits (default same configuration as basic sizing)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-20T15:04:12.533647075Z[Etc/UTC]")
public class ContainerResourceSizing {
  public static final String SERIALIZED_NAME_REQUESTS = "requests";
  @SerializedName(SERIALIZED_NAME_REQUESTS)
  private ContainerResourceSizeInfo requests;

  public static final String SERIALIZED_NAME_LIMITS = "limits";
  @SerializedName(SERIALIZED_NAME_LIMITS)
  private ContainerResourceSizeInfo limits;

  public ContainerResourceSizing() { 
  }

  public ContainerResourceSizing requests(ContainerResourceSizeInfo requests) {
    
    this.requests = requests;
    return this;
  }

   /**
   * Get requests
   * @return requests
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ContainerResourceSizeInfo getRequests() {
    return requests;
  }


  public void setRequests(ContainerResourceSizeInfo requests) {
    this.requests = requests;
  }


  public ContainerResourceSizing limits(ContainerResourceSizeInfo limits) {
    
    this.limits = limits;
    return this;
  }

   /**
   * Get limits
   * @return limits
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ContainerResourceSizeInfo getLimits() {
    return limits;
  }


  public void setLimits(ContainerResourceSizeInfo limits) {
    this.limits = limits;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerResourceSizing containerResourceSizing = (ContainerResourceSizing) o;
    return Objects.equals(this.requests, containerResourceSizing.requests) &&
        Objects.equals(this.limits, containerResourceSizing.limits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requests, limits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerResourceSizing {\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
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

