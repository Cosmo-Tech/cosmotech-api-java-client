/*
 * Cosmo Tech Plaform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 0.0.1-SNAPSHOT
 * 
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * a Cloud Service resource
 */
@ApiModel(description = "a Cloud Service resource")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-22T12:27:09.848905+02:00[Europe/Paris]")
public class PlatformService {
  public static final String SERIALIZED_NAME_CLOUD_SERVICE = "cloudService";
  @SerializedName(SERIALIZED_NAME_CLOUD_SERVICE)
  private String cloudService;

  public static final String SERIALIZED_NAME_BASE_URI = "baseUri";
  @SerializedName(SERIALIZED_NAME_BASE_URI)
  private String baseUri;

  public static final String SERIALIZED_NAME_RESOURCE_URI = "resourceUri";
  @SerializedName(SERIALIZED_NAME_RESOURCE_URI)
  private String resourceUri;

  public static final String SERIALIZED_NAME_CREDENTIALS = "credentials";
  @SerializedName(SERIALIZED_NAME_CREDENTIALS)
  private Map<String, Object> credentials = null;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private Map<String, Object> options = null;


   /**
   * the cloud service name
   * @return cloudService
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the cloud service name")

  public String getCloudService() {
    return cloudService;
  }




   /**
   * the platform base uri for this service
   * @return baseUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the platform base uri for this service")

  public String getBaseUri() {
    return baseUri;
  }




  public PlatformService resourceUri(String resourceUri) {
    
    this.resourceUri = resourceUri;
    return this;
  }

   /**
   * the workspace specific uri for this service resource
   * @return resourceUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the workspace specific uri for this service resource")

  public String getResourceUri() {
    return resourceUri;
  }


  public void setResourceUri(String resourceUri) {
    this.resourceUri = resourceUri;
  }


  public PlatformService credentials(Map<String, Object> credentials) {
    
    this.credentials = credentials;
    return this;
  }

  public PlatformService putCredentialsItem(String key, Object credentialsItem) {
    if (this.credentials == null) {
      this.credentials = new HashMap<String, Object>();
    }
    this.credentials.put(key, credentialsItem);
    return this;
  }

   /**
   * a freeform credentials object. Structure depends on service
   * @return credentials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "a freeform credentials object. Structure depends on service")

  public Map<String, Object> getCredentials() {
    return credentials;
  }


  public void setCredentials(Map<String, Object> credentials) {
    this.credentials = credentials;
  }


  public PlatformService options(Map<String, Object> options) {
    
    this.options = options;
    return this;
  }

  public PlatformService putOptionsItem(String key, Object optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<String, Object>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

   /**
   * the service specific options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the service specific options")

  public Map<String, Object> getOptions() {
    return options;
  }


  public void setOptions(Map<String, Object> options) {
    this.options = options;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlatformService platformService = (PlatformService) o;
    return Objects.equals(this.cloudService, platformService.cloudService) &&
        Objects.equals(this.baseUri, platformService.baseUri) &&
        Objects.equals(this.resourceUri, platformService.resourceUri) &&
        Objects.equals(this.credentials, platformService.credentials) &&
        Objects.equals(this.options, platformService.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudService, baseUri, resourceUri, credentials, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlatformService {\n");
    sb.append("    cloudService: ").append(toIndentedString(cloudService)).append("\n");
    sb.append("    baseUri: ").append(toIndentedString(baseUri)).append("\n");
    sb.append("    resourceUri: ").append(toIndentedString(resourceUri)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

