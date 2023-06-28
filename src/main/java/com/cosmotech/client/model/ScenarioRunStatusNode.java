/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 2.4.6-private
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

/**
 * status of a ScenarioRun Node
 */
@ApiModel(description = "status of a ScenarioRun Node")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-28T15:10:17.167029194Z[Etc/UTC]")
public class ScenarioRunStatusNode {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CONTAINER_NAME = "containerName";
  @SerializedName(SERIALIZED_NAME_CONTAINER_NAME)
  private String containerName;

  public static final String SERIALIZED_NAME_ESTIMATED_DURATION = "estimatedDuration";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_DURATION)
  private Integer estimatedDuration;

  public static final String SERIALIZED_NAME_HOST_NODE_NAME = "hostNodeName";
  @SerializedName(SERIALIZED_NAME_HOST_NODE_NAME)
  private String hostNodeName;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_PHASE = "phase";
  @SerializedName(SERIALIZED_NAME_PHASE)
  private String phase;

  public static final String SERIALIZED_NAME_PROGRESS = "progress";
  @SerializedName(SERIALIZED_NAME_PROGRESS)
  private String progress;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public static final String SERIALIZED_NAME_END_TIME = "endTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public ScenarioRunStatusNode() { 
  }

  public ScenarioRunStatusNode id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * the node id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the node id")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ScenarioRunStatusNode name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * the node unique name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the node unique name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ScenarioRunStatusNode containerName(String containerName) {
    
    this.containerName = containerName;
    return this;
  }

   /**
   * the ScenarioRun container name
   * @return containerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the ScenarioRun container name")

  public String getContainerName() {
    return containerName;
  }


  public void setContainerName(String containerName) {
    this.containerName = containerName;
  }


  public ScenarioRunStatusNode estimatedDuration(Integer estimatedDuration) {
    
    this.estimatedDuration = estimatedDuration;
    return this;
  }

   /**
   * estimatedDuration in seconds
   * @return estimatedDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "estimatedDuration in seconds")

  public Integer getEstimatedDuration() {
    return estimatedDuration;
  }


  public void setEstimatedDuration(Integer estimatedDuration) {
    this.estimatedDuration = estimatedDuration;
  }


  public ScenarioRunStatusNode hostNodeName(String hostNodeName) {
    
    this.hostNodeName = hostNodeName;
    return this;
  }

   /**
   * HostNodeName name of the Kubernetes node on which the Pod is running, if applicable
   * @return hostNodeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "HostNodeName name of the Kubernetes node on which the Pod is running, if applicable")

  public String getHostNodeName() {
    return hostNodeName;
  }


  public void setHostNodeName(String hostNodeName) {
    this.hostNodeName = hostNodeName;
  }


  public ScenarioRunStatusNode message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * a human readable message indicating details about why the node is in this condition
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "a human readable message indicating details about why the node is in this condition")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public ScenarioRunStatusNode phase(String phase) {
    
    this.phase = phase;
    return this;
  }

   /**
   * high-level summary of where the node is in its lifecycle
   * @return phase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "high-level summary of where the node is in its lifecycle")

  public String getPhase() {
    return phase;
  }


  public void setPhase(String phase) {
    this.phase = phase;
  }


  public ScenarioRunStatusNode progress(String progress) {
    
    this.progress = progress;
    return this;
  }

   /**
   * progress to completion
   * @return progress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "progress to completion")

  public String getProgress() {
    return progress;
  }


  public void setProgress(String progress) {
    this.progress = progress;
  }


  public ScenarioRunStatusNode startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * the node start time
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the node start time")

  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public ScenarioRunStatusNode endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * the node end time
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the node end time")

  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScenarioRunStatusNode scenarioRunStatusNode = (ScenarioRunStatusNode) o;
    return Objects.equals(this.id, scenarioRunStatusNode.id) &&
        Objects.equals(this.name, scenarioRunStatusNode.name) &&
        Objects.equals(this.containerName, scenarioRunStatusNode.containerName) &&
        Objects.equals(this.estimatedDuration, scenarioRunStatusNode.estimatedDuration) &&
        Objects.equals(this.hostNodeName, scenarioRunStatusNode.hostNodeName) &&
        Objects.equals(this.message, scenarioRunStatusNode.message) &&
        Objects.equals(this.phase, scenarioRunStatusNode.phase) &&
        Objects.equals(this.progress, scenarioRunStatusNode.progress) &&
        Objects.equals(this.startTime, scenarioRunStatusNode.startTime) &&
        Objects.equals(this.endTime, scenarioRunStatusNode.endTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, containerName, estimatedDuration, hostNodeName, message, phase, progress, startTime, endTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScenarioRunStatusNode {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
    sb.append("    estimatedDuration: ").append(toIndentedString(estimatedDuration)).append("\n");
    sb.append("    hostNodeName: ").append(toIndentedString(hostNodeName)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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

