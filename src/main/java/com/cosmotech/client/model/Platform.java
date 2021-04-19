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
import com.cosmotech.client.model.PlatformServices;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * a Platform
 */
@ApiModel(description = "a Platform")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-19T18:57:39.320413+02:00[Europe/Paris]")
public class Platform {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_OWNER_ID = "ownerId";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  public static final String SERIALIZED_NAME_API_HOST = "apiHost";
  @SerializedName(SERIALIZED_NAME_API_HOST)
  private String apiHost;

  public static final String SERIALIZED_NAME_WEB_APP_URL = "webAppUrl";
  @SerializedName(SERIALIZED_NAME_WEB_APP_URL)
  private String webAppUrl;

  public static final String SERIALIZED_NAME_SERVICES = "services";
  @SerializedName(SERIALIZED_NAME_SERVICES)
  private PlatformServices services;


  public Platform name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * the Platform name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "the Platform name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Platform description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * the Platform description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Platform description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Platform version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * the Platform version MAJOR.MINOR.PATCH.
   * @return version
  **/
  @ApiModelProperty(required = true, value = "the Platform version MAJOR.MINOR.PATCH.")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public Platform ownerId(String ownerId) {
    
    this.ownerId = ownerId;
    return this;
  }

   /**
   * the Platform owner Id
   * @return ownerId
  **/
  @ApiModelProperty(required = true, value = "the Platform owner Id")

  public String getOwnerId() {
    return ownerId;
  }


  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }


  public Platform apiHost(String apiHost) {
    
    this.apiHost = apiHost;
    return this;
  }

   /**
   * Platform host name
   * @return apiHost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Platform host name")

  public String getApiHost() {
    return apiHost;
  }


  public void setApiHost(String apiHost) {
    this.apiHost = apiHost;
  }


  public Platform webAppUrl(String webAppUrl) {
    
    this.webAppUrl = webAppUrl;
    return this;
  }

   /**
   * the Web Application Portal to use the Platform
   * @return webAppUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Web Application Portal to use the Platform")

  public String getWebAppUrl() {
    return webAppUrl;
  }


  public void setWebAppUrl(String webAppUrl) {
    this.webAppUrl = webAppUrl;
  }


  public Platform services(PlatformServices services) {
    
    this.services = services;
    return this;
  }

   /**
   * Get services
   * @return services
  **/
  @ApiModelProperty(required = true, value = "")

  public PlatformServices getServices() {
    return services;
  }


  public void setServices(PlatformServices services) {
    this.services = services;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Platform platform = (Platform) o;
    return Objects.equals(this.name, platform.name) &&
        Objects.equals(this.description, platform.description) &&
        Objects.equals(this.version, platform.version) &&
        Objects.equals(this.ownerId, platform.ownerId) &&
        Objects.equals(this.apiHost, platform.apiHost) &&
        Objects.equals(this.webAppUrl, platform.webAppUrl) &&
        Objects.equals(this.services, platform.services);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, version, ownerId, apiHost, webAppUrl, services);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Platform {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    apiHost: ").append(toIndentedString(apiHost)).append("\n");
    sb.append("    webAppUrl: ").append(toIndentedString(webAppUrl)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
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

