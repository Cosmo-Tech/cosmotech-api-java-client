/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 2.3.12-SNAPSHOT
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
 * a Workspace Web Application
 */
@ApiModel(description = "a Workspace Web Application")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-28T13:29:36.745828105Z[Etc/UTC]")
public class WorkspaceWebApp {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_IFRAMES = "iframes";
  @SerializedName(SERIALIZED_NAME_IFRAMES)
  private Map<String, Object> iframes = null;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private Map<String, Object> options = null;

  public WorkspaceWebApp() { 
  }

  public WorkspaceWebApp url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * the Workspace Web Application URL
   * @return url
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the Workspace Web Application URL")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public WorkspaceWebApp iframes(Map<String, Object> iframes) {
    
    this.iframes = iframes;
    return this;
  }

  public WorkspaceWebApp putIframesItem(String key, Object iframesItem) {
    if (this.iframes == null) {
      this.iframes = new HashMap<String, Object>();
    }
    this.iframes.put(key, iframesItem);
    return this;
  }

   /**
   * a map of iframeKey/iframeURL
   * @return iframes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "a map of iframeKey/iframeURL")

  public Map<String, Object> getIframes() {
    return iframes;
  }


  public void setIframes(Map<String, Object> iframes) {
    this.iframes = iframes;
  }


  public WorkspaceWebApp options(Map<String, Object> options) {
    
    this.options = options;
    return this;
  }

  public WorkspaceWebApp putOptionsItem(String key, Object optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<String, Object>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

   /**
   * free form options for Web Application
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "free form options for Web Application")

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
    WorkspaceWebApp workspaceWebApp = (WorkspaceWebApp) o;
    return Objects.equals(this.url, workspaceWebApp.url) &&
        Objects.equals(this.iframes, workspaceWebApp.iframes) &&
        Objects.equals(this.options, workspaceWebApp.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, iframes, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceWebApp {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    iframes: ").append(toIndentedString(iframes)).append("\n");
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

