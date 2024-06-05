/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.1.9
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.cosmotech.client.model.RunState;
import com.cosmotech.client.model.RunStatusNode;
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
 * a Run status
 */
@ApiModel(description = "a Run status")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-05T13:51:22.106921124Z[Etc/UTC]")
public class RunStatus {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ORGANIZATION_ID = "organizationId";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_ID)
  private String organizationId;

  public static final String SERIALIZED_NAME_WORKSPACE_ID = "workspaceId";
  @SerializedName(SERIALIZED_NAME_WORKSPACE_ID)
  private String workspaceId;

  public static final String SERIALIZED_NAME_RUNNER_ID = "runnerId";
  @SerializedName(SERIALIZED_NAME_RUNNER_ID)
  private String runnerId;

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
  private List<RunStatusNode> nodes = null;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private RunState state;

  public RunStatus() { 
  }

  public RunStatus id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * the Run id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Run id")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public RunStatus organizationId(String organizationId) {
    
    this.organizationId = organizationId;
    return this;
  }

   /**
   * the Organization id
   * @return organizationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Organization id")

  public String getOrganizationId() {
    return organizationId;
  }


  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }


  public RunStatus workspaceId(String workspaceId) {
    
    this.workspaceId = workspaceId;
    return this;
  }

   /**
   * the Workspace id
   * @return workspaceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Workspace id")

  public String getWorkspaceId() {
    return workspaceId;
  }


  public void setWorkspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
  }


  public RunStatus runnerId(String runnerId) {
    
    this.runnerId = runnerId;
    return this;
  }

   /**
   * the Runner id
   * @return runnerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Runner id")

  public String getRunnerId() {
    return runnerId;
  }


  public void setRunnerId(String runnerId) {
    this.runnerId = runnerId;
  }


  public RunStatus workflowId(String workflowId) {
    
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


  public RunStatus workflowName(String workflowName) {
    
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


  public RunStatus startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * the Run start Date Time
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Run start Date Time")

  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public RunStatus endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * the Run end Date Time
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Run end Date Time")

  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public RunStatus phase(String phase) {
    
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


  public RunStatus progress(String progress) {
    
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


  public RunStatus message(String message) {
    
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


  public RunStatus estimatedDuration(Integer estimatedDuration) {
    
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


  public RunStatus nodes(List<RunStatusNode> nodes) {
    
    this.nodes = nodes;
    return this;
  }

  public RunStatus addNodesItem(RunStatusNode nodesItem) {
    if (this.nodes == null) {
      this.nodes = new ArrayList<RunStatusNode>();
    }
    this.nodes.add(nodesItem);
    return this;
  }

   /**
   * status of Run nodes
   * @return nodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "status of Run nodes")

  public List<RunStatusNode> getNodes() {
    return nodes;
  }


  public void setNodes(List<RunStatusNode> nodes) {
    this.nodes = nodes;
  }


  public RunStatus state(RunState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RunState getState() {
    return state;
  }


  public void setState(RunState state) {
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
    RunStatus runStatus = (RunStatus) o;
    return Objects.equals(this.id, runStatus.id) &&
        Objects.equals(this.organizationId, runStatus.organizationId) &&
        Objects.equals(this.workspaceId, runStatus.workspaceId) &&
        Objects.equals(this.runnerId, runStatus.runnerId) &&
        Objects.equals(this.workflowId, runStatus.workflowId) &&
        Objects.equals(this.workflowName, runStatus.workflowName) &&
        Objects.equals(this.startTime, runStatus.startTime) &&
        Objects.equals(this.endTime, runStatus.endTime) &&
        Objects.equals(this.phase, runStatus.phase) &&
        Objects.equals(this.progress, runStatus.progress) &&
        Objects.equals(this.message, runStatus.message) &&
        Objects.equals(this.estimatedDuration, runStatus.estimatedDuration) &&
        Objects.equals(this.nodes, runStatus.nodes) &&
        Objects.equals(this.state, runStatus.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, organizationId, workspaceId, runnerId, workflowId, workflowName, startTime, endTime, phase, progress, message, estimatedDuration, nodes, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStatus {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
    sb.append("    runnerId: ").append(toIndentedString(runnerId)).append("\n");
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

