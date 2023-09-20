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
import com.cosmotech.client.model.ScenarioJobState;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Scenario data download job info
 */
@ApiModel(description = "Scenario data download job info")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-20T14:23:47.634222005Z[Etc/UTC]")
public class ScenarioDataDownloadInfo {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private ScenarioJobState state;

  public ScenarioDataDownloadInfo() { 
  }

  
  public ScenarioDataDownloadInfo(
     String url
  ) {
    this();
    this.url = url;
  }

   /**
   * the Scenario Data Download URL
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Scenario Data Download URL")

  public String getUrl() {
    return url;
  }




  public ScenarioDataDownloadInfo state(ScenarioJobState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScenarioJobState getState() {
    return state;
  }


  public void setState(ScenarioJobState state) {
    this.state = state;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScenarioDataDownloadInfo scenarioDataDownloadInfo = (ScenarioDataDownloadInfo) o;
    return Objects.equals(this.url, scenarioDataDownloadInfo.url) &&
        Objects.equals(this.state, scenarioDataDownloadInfo.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScenarioDataDownloadInfo {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

