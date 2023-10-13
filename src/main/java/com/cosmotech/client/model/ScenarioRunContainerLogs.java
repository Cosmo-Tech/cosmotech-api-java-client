/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.0.7-dev
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
import java.util.ArrayList;
import java.util.List;

/**
 * logs for a given container
 */
@ApiModel(description = "logs for a given container")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-13T11:12:03.755703483Z[Etc/UTC]")
public class ScenarioRunContainerLogs {
  public static final String SERIALIZED_NAME_NODE_ID = "nodeId";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  private String nodeId;

  public static final String SERIALIZED_NAME_CONTAINER_NAME = "containerName";
  @SerializedName(SERIALIZED_NAME_CONTAINER_NAME)
  private String containerName;

  public static final String SERIALIZED_NAME_CHILDREN = "children";
  @SerializedName(SERIALIZED_NAME_CHILDREN)
  private List<String> children = null;

  public static final String SERIALIZED_NAME_LOGS = "logs";
  @SerializedName(SERIALIZED_NAME_LOGS)
  private String logs;

  public ScenarioRunContainerLogs() { 
  }

  
  public ScenarioRunContainerLogs(
     String nodeId, 
     String containerName, 
     List<String> children, 
     String logs
  ) {
    this();
    this.nodeId = nodeId;
    this.containerName = containerName;
    this.children = children;
    this.logs = logs;
  }

   /**
   * the node Id which has executed this log
   * @return nodeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the node Id which has executed this log")

  public String getNodeId() {
    return nodeId;
  }




   /**
   * the container name
   * @return containerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the container name")

  public String getContainerName() {
    return containerName;
  }




   /**
   * the list of children node id
   * @return children
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the list of children node id")

  public List<String> getChildren() {
    return children;
  }




   /**
   * the node logs in plain text
   * @return logs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the node logs in plain text")

  public String getLogs() {
    return logs;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScenarioRunContainerLogs scenarioRunContainerLogs = (ScenarioRunContainerLogs) o;
    return Objects.equals(this.nodeId, scenarioRunContainerLogs.nodeId) &&
        Objects.equals(this.containerName, scenarioRunContainerLogs.containerName) &&
        Objects.equals(this.children, scenarioRunContainerLogs.children) &&
        Objects.equals(this.logs, scenarioRunContainerLogs.logs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeId, containerName, children, logs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScenarioRunContainerLogs {\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
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

