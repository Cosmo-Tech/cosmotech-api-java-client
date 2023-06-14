/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 2.3.11
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.cosmotech.client.model.ScenarioRunState;
import com.cosmotech.client.model.ScenarioRunStatusNode;
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
 * a ScenarioRun status
 */
@ApiModel(description = "a ScenarioRun status")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-14T09:12:21.858332756Z[Etc/UTC]")
public class ScenarioRunStatus {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ORGANIZATION_ID = "organizationId";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_ID)
  private String organizationId;

  public static final String SERIALIZED_NAME_WORKFLOW_ID = "workflowId";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_ID)
  private String workflowId;

  public static final String SERIALIZED_NAME_WORKFLOW_NAME = "workflowName";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_NAME)
  private String workflowName;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public static final String SERIALIZED_NAME_END_TIME = "endTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public static final String SERIALIZED_NAME_PHASE = "phase";
  @SerializedName(SERIALIZED_NAME_PHASE)
  private String phase;

  public static final String SERIALIZED_NAME_PROGRESS = "progress";
  @SerializedName(SERIALIZED_NAME_PROGRESS)
  private String progress;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_ESTIMATED_DURATION = "estimatedDuration";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_DURATION)
  private Integer estimatedDuration;

  public static final String SERIALIZED_NAME_NODES = "nodes";
  @SerializedName(SERIALIZED_NAME_NODES)
  private List<ScenarioRunStatusNode> nodes = null;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private ScenarioRunState state;

  public ScenarioRunStatus() { 
  }

  public ScenarioRunStatus id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * the ScenarioRun id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the ScenarioRun id")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ScenarioRunStatus organizationId(String organizationId) {
    
    this.organizationId = organizationId;
    return this;
  }

   /**
   * the ScenarioRun id
   * @return organizationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the ScenarioRun id")

  public String getOrganizationId() {
    return organizationId;
  }


  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }


  public ScenarioRunStatus workflowId(String workflowId) {
    
    this.workflowId = workflowId;
    return this;
  }

   /**
   * the Cosmo Tech compute cluster Argo Workflow Id to search
   * @return workflowId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Cosmo Tech compute cluster Argo Workflow Id to search")

  public String getWorkflowId() {
    return workflowId;
  }


  public void setWorkflowId(String workflowId) {
    this.workflowId = workflowId;
  }


  public ScenarioRunStatus workflowName(String workflowName) {
    
    this.workflowName = workflowName;
    return this;
  }

   /**
   * the Cosmo Tech compute cluster Argo Workflow Name
   * @return workflowName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Cosmo Tech compute cluster Argo Workflow Name")

  public String getWorkflowName() {
    return workflowName;
  }


  public void setWorkflowName(String workflowName) {
    this.workflowName = workflowName;
  }


  public ScenarioRunStatus startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * the ScenarioRun start Date Time
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the ScenarioRun start Date Time")

  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public ScenarioRunStatus endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * the ScenarioRun end Date Time
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the ScenarioRun end Date Time")

  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public ScenarioRunStatus phase(String phase) {
    
    this.phase = phase;
    return this;
  }

   /**
   * high-level summary of where the workflow is in its lifecycle
   * @return phase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "high-level summary of where the workflow is in its lifecycle")

  public String getPhase() {
    return phase;
  }


  public void setPhase(String phase) {
    this.phase = phase;
  }


  public ScenarioRunStatus progress(String progress) {
    
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


  public ScenarioRunStatus message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * a  human readable message indicating details about why the workflow is in this condition
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "a  human readable message indicating details about why the workflow is in this condition")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public ScenarioRunStatus estimatedDuration(Integer estimatedDuration) {
    
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


  public ScenarioRunStatus nodes(List<ScenarioRunStatusNode> nodes) {
    
    this.nodes = nodes;
    return this;
  }

  public ScenarioRunStatus addNodesItem(ScenarioRunStatusNode nodesItem) {
    if (this.nodes == null) {
      this.nodes = new ArrayList<ScenarioRunStatusNode>();
    }
    this.nodes.add(nodesItem);
    return this;
  }

   /**
   * status of ScenarioRun nodes
   * @return nodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "status of ScenarioRun nodes")

  public List<ScenarioRunStatusNode> getNodes() {
    return nodes;
  }


  public void setNodes(List<ScenarioRunStatusNode> nodes) {
    this.nodes = nodes;
  }


  public ScenarioRunStatus state(ScenarioRunState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScenarioRunState getState() {
    return state;
  }


  public void setState(ScenarioRunState state) {
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
    ScenarioRunStatus scenarioRunStatus = (ScenarioRunStatus) o;
    return Objects.equals(this.id, scenarioRunStatus.id) &&
        Objects.equals(this.organizationId, scenarioRunStatus.organizationId) &&
        Objects.equals(this.workflowId, scenarioRunStatus.workflowId) &&
        Objects.equals(this.workflowName, scenarioRunStatus.workflowName) &&
        Objects.equals(this.startTime, scenarioRunStatus.startTime) &&
        Objects.equals(this.endTime, scenarioRunStatus.endTime) &&
        Objects.equals(this.phase, scenarioRunStatus.phase) &&
        Objects.equals(this.progress, scenarioRunStatus.progress) &&
        Objects.equals(this.message, scenarioRunStatus.message) &&
        Objects.equals(this.estimatedDuration, scenarioRunStatus.estimatedDuration) &&
        Objects.equals(this.nodes, scenarioRunStatus.nodes) &&
        Objects.equals(this.state, scenarioRunStatus.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, organizationId, workflowId, workflowName, startTime, endTime, phase, progress, message, estimatedDuration, nodes, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScenarioRunStatus {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
    sb.append("    workflowName: ").append(toIndentedString(workflowName)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    estimatedDuration: ").append(toIndentedString(estimatedDuration)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
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

