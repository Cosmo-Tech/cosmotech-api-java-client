/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 2.4.1-SNAPSHOT
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.cosmotech.client.model.ScenarioRunContainerLogs;
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
 * the scenariorun logs returned by all containers
 */
@ApiModel(description = "the scenariorun logs returned by all containers")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-11T09:55:41.523580394Z[Etc/UTC]")
public class ScenarioRunLogs {
  public static final String SERIALIZED_NAME_SCENARIORUN_ID = "scenariorunId";
  @SerializedName(SERIALIZED_NAME_SCENARIORUN_ID)
  private String scenariorunId;

  public static final String SERIALIZED_NAME_CONTAINERS = "containers";
  @SerializedName(SERIALIZED_NAME_CONTAINERS)
  private Map<String, ScenarioRunContainerLogs> containers = null;

  public ScenarioRunLogs() { 
  }

  
  public ScenarioRunLogs(
     String scenariorunId, 
     Map<String, ScenarioRunContainerLogs> containers
  ) {
    this();
    this.scenariorunId = scenariorunId;
    this.containers = containers;
  }

   /**
   * the ScenarioRun Id
   * @return scenariorunId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the ScenarioRun Id")

  public String getScenariorunId() {
    return scenariorunId;
  }




   /**
   * the container map of logs
   * @return containers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the container map of logs")

  public Map<String, ScenarioRunContainerLogs> getContainers() {
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
    ScenarioRunLogs scenarioRunLogs = (ScenarioRunLogs) o;
    return Objects.equals(this.scenariorunId, scenarioRunLogs.scenariorunId) &&
        Objects.equals(this.containers, scenarioRunLogs.containers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scenariorunId, containers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScenarioRunLogs {\n");
    sb.append("    scenariorunId: ").append(toIndentedString(scenariorunId)).append("\n");
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

