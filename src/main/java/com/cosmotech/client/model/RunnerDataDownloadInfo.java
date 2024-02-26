/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.0.3-SNAPSHOT
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.cosmotech.client.model.RunnerJobState;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Runner data download job info
 */
@ApiModel(description = "Runner data download job info")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T10:45:46.197512505Z[Etc/UTC]")
public class RunnerDataDownloadInfo {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private RunnerJobState state;

  public RunnerDataDownloadInfo() { 
  }

  
  public RunnerDataDownloadInfo(
     String url
  ) {
    this();
    this.url = url;
  }

   /**
   * the Runner Data Download URL
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Runner Data Download URL")

  public String getUrl() {
    return url;
  }




  public RunnerDataDownloadInfo state(RunnerJobState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RunnerJobState getState() {
    return state;
  }


  public void setState(RunnerJobState state) {
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
    RunnerDataDownloadInfo runnerDataDownloadInfo = (RunnerDataDownloadInfo) o;
    return Objects.equals(this.url, runnerDataDownloadInfo.url) &&
        Objects.equals(this.state, runnerDataDownloadInfo.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunnerDataDownloadInfo {\n");
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

