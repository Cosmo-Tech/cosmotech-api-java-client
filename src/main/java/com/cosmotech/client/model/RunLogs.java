/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.1.4
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.cosmotech.client.model.RunContainerLogs;
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
 * the run logs returned by all containers
 */
@ApiModel(description = "the run logs returned by all containers")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T15:21:26.429591157Z[Etc/UTC]")
public class RunLogs {
  public static final String SERIALIZED_NAME_RUN_ID = "runId";
  @SerializedName(SERIALIZED_NAME_RUN_ID)
  private String runId;

  public static final String SERIALIZED_NAME_CONTAINERS = "containers";
  @SerializedName(SERIALIZED_NAME_CONTAINERS)
  private Map<String, RunContainerLogs> containers = null;

  public RunLogs() { 
  }

  
  public RunLogs(
     String runId, 
     Map<String, RunContainerLogs> containers
  ) {
    this();
    this.runId = runId;
    this.containers = containers;
  }

   /**
   * the Run Id
   * @return runId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Run Id")

  public String getRunId() {
    return runId;
  }




   /**
   * the container map of logs
   * @return containers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the container map of logs")

  public Map<String, RunContainerLogs> getContainers() {
    return containers;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunLogs runLogs = (RunLogs) o;
    return Objects.equals(this.runId, runLogs.runId) &&
        Objects.equals(this.containers, runLogs.containers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runId, containers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunLogs {\n");
    sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
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

