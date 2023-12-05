/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.0.18-SNAPSHOT
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * a cloud service resource
 */
@ApiModel(description = "a cloud service resource")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-05T08:55:13.581515453Z[Etc/UTC]")
public class OrganizationService {
  public static final String SERIALIZED_NAME_CLOUD_SERVICE = "cloudService";
  @SerializedName(SERIALIZED_NAME_CLOUD_SERVICE)
  private String cloudService;

  public static final String SERIALIZED_NAME_BASE_URI = "baseUri";
  @SerializedName(SERIALIZED_NAME_BASE_URI)
  private String baseUri;

  public static final String SERIALIZED_NAME_PLATFORM_SERVICE = "platformService";
  @SerializedName(SERIALIZED_NAME_PLATFORM_SERVICE)
  private String platformService;

  public static final String SERIALIZED_NAME_RESOURCE_URI = "resourceUri";
  @SerializedName(SERIALIZED_NAME_RESOURCE_URI)
  private String resourceUri;

  public static final String SERIALIZED_NAME_CREDENTIALS = "credentials";
  @SerializedName(SERIALIZED_NAME_CREDENTIALS)
  private Map<String, Object> credentials = null;

  public OrganizationService() { 
  }

  public OrganizationService cloudService(String cloudService) {
    
    this.cloudService = cloudService;
    return this;
  }

   /**
   * the cloud service name
   * @return cloudService
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the cloud service name")

  public String getCloudService() {
    return cloudService;
  }


  public void setCloudService(String cloudService) {
    this.cloudService = cloudService;
  }


  public OrganizationService baseUri(String baseUri) {
    
    this.baseUri = baseUri;
    return this;
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


  public void setBaseUri(String baseUri) {
    this.baseUri = baseUri;
  }


  public OrganizationService platformService(String platformService) {
    
    this.platformService = platformService;
    return this;
  }

   /**
   * the Platform service associated to the resource
   * @return platformService
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Platform service associated to the resource")

  public String getPlatformService() {
    return platformService;
  }


  public void setPlatformService(String platformService) {
    this.platformService = platformService;
  }


  public OrganizationService resourceUri(String resourceUri) {
    
    this.resourceUri = resourceUri;
    return this;
  }

   /**
   * the Organization specific uri for this service resource
   * @return resourceUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Organization specific uri for this service resource")

  public String getResourceUri() {
    return resourceUri;
  }


  public void setResourceUri(String resourceUri) {
    this.resourceUri = resourceUri;
  }


  public OrganizationService credentials(Map<String, Object> credentials) {
    
    this.credentials = credentials;
    return this;
  }

  public OrganizationService putCredentialsItem(String key, Object credentialsItem) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationService organizationService = (OrganizationService) o;
    return Objects.equals(this.cloudService, organizationService.cloudService) &&
        Objects.equals(this.baseUri, organizationService.baseUri) &&
        Objects.equals(this.platformService, organizationService.platformService) &&
        Objects.equals(this.resourceUri, organizationService.resourceUri) &&
        Objects.equals(this.credentials, organizationService.credentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudService, baseUri, platformService, resourceUri, credentials);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationService {\n");
    sb.append("    cloudService: ").append(toIndentedString(cloudService)).append("\n");
    sb.append("    baseUri: ").append(toIndentedString(baseUri)).append("\n");
    sb.append("    platformService: ").append(toIndentedString(platformService)).append("\n");
    sb.append("    resourceUri: ").append(toIndentedString(resourceUri)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
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

