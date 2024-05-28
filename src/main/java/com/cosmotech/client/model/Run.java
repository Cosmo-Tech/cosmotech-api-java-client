/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.1.6
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.cosmotech.client.model.RunContainer;
import com.cosmotech.client.model.RunState;
import com.cosmotech.client.model.RunTemplateParameterValue;
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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * a Run with only base properties
 */
@ApiModel(description = "a Run with only base properties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-28T13:09:53.752822870Z[Etc/UTC]")
public class Run {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private RunState state;

  public static final String SERIALIZED_NAME_ORGANIZATION_ID = "organizationId";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_ID)
  private String organizationId;

  public static final String SERIALIZED_NAME_WORKFLOW_ID = "workflowId";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_ID)
  private String workflowId;

  public static final String SERIALIZED_NAME_CSM_SIMULATION_RUN = "csmSimulationRun";
  @SerializedName(SERIALIZED_NAME_CSM_SIMULATION_RUN)
  private String csmSimulationRun;

  public static final String SERIALIZED_NAME_GENERATE_NAME = "generateName";
  @SerializedName(SERIALIZED_NAME_GENERATE_NAME)
  private String generateName;

  public static final String SERIALIZED_NAME_WORKFLOW_NAME = "workflowName";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_NAME)
  private String workflowName;

  public static final String SERIALIZED_NAME_OWNER_ID = "ownerId";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  public static final String SERIALIZED_NAME_WORKSPACE_ID = "workspaceId";
  @SerializedName(SERIALIZED_NAME_WORKSPACE_ID)
  private String workspaceId;

  public static final String SERIALIZED_NAME_WORKSPACE_KEY = "workspaceKey";
  @SerializedName(SERIALIZED_NAME_WORKSPACE_KEY)
  private String workspaceKey;

  public static final String SERIALIZED_NAME_RUNNER_ID = "runnerId";
  @SerializedName(SERIALIZED_NAME_RUNNER_ID)
  private String runnerId;

  public static final String SERIALIZED_NAME_SOLUTION_ID = "solutionId";
  @SerializedName(SERIALIZED_NAME_SOLUTION_ID)
  private String solutionId;

  public static final String SERIALIZED_NAME_RUN_TEMPLATE_ID = "runTemplateId";
  @SerializedName(SERIALIZED_NAME_RUN_TEMPLATE_ID)
  private String runTemplateId;

  public static final String SERIALIZED_NAME_COMPUTE_SIZE = "computeSize";
  @SerializedName(SERIALIZED_NAME_COMPUTE_SIZE)
  private String computeSize;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_DATASET_LIST = "datasetList";
  @SerializedName(SERIALIZED_NAME_DATASET_LIST)
  private List<String> datasetList = null;

  public static final String SERIALIZED_NAME_PARAMETERS_VALUES = "parametersValues";
  @SerializedName(SERIALIZED_NAME_PARAMETERS_VALUES)
  private List<RunTemplateParameterValue> parametersValues = null;

  public static final String SERIALIZED_NAME_NODE_LABEL = "nodeLabel";
  @SerializedName(SERIALIZED_NAME_NODE_LABEL)
  private String nodeLabel;

  public static final String SERIALIZED_NAME_CONTAINERS = "containers";
  @SerializedName(SERIALIZED_NAME_CONTAINERS)
  private List<RunContainer> containers = null;

  public Run() { 
  }

  
  public Run(
     String id, 
     String csmSimulationRun, 
     String ownerId, 
     String workspaceId, 
     String workspaceKey, 
     String runnerId, 
     String solutionId, 
     String runTemplateId, 
     String computeSize, 
     String createdAt, 
     List<String> datasetList, 
     List<RunTemplateParameterValue> parametersValues, 
     String nodeLabel
  ) {
    this();
    this.id = id;
    this.csmSimulationRun = csmSimulationRun;
    this.ownerId = ownerId;
    this.workspaceId = workspaceId;
    this.workspaceKey = workspaceKey;
    this.runnerId = runnerId;
    this.solutionId = solutionId;
    this.runTemplateId = runTemplateId;
    this.computeSize = computeSize;
    this.createdAt = createdAt;
    this.datasetList = datasetList;
    this.parametersValues = parametersValues;
    this.nodeLabel = nodeLabel;
  }

   /**
   * the Run
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Run")

  public String getId() {
    return id;
  }




  public Run state(RunState state) {
    
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


  public Run organizationId(String organizationId) {
    
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


  public Run workflowId(String workflowId) {
    
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


   /**
   * the Cosmo Tech Simulation Run Id
   * @return csmSimulationRun
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Cosmo Tech Simulation Run Id")

  public String getCsmSimulationRun() {
    return csmSimulationRun;
  }




  public Run generateName(String generateName) {
    
    this.generateName = generateName;
    return this;
  }

   /**
   * the base name for workflow name generation
   * @return generateName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the base name for workflow name generation")

  public String getGenerateName() {
    return generateName;
  }


  public void setGenerateName(String generateName) {
    this.generateName = generateName;
  }


  public Run workflowName(String workflowName) {
    
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


   /**
   * the user id which own this run
   * @return ownerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the user id which own this run")

  public String getOwnerId() {
    return ownerId;
  }




   /**
   * the Workspace Id
   * @return workspaceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Workspace Id")

  public String getWorkspaceId() {
    return workspaceId;
  }




   /**
   * technical key for resource name convention and version grouping. Must be unique
   * @return workspaceKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "technical key for resource name convention and version grouping. Must be unique")

  public String getWorkspaceKey() {
    return workspaceKey;
  }




   /**
   * the Runner Id
   * @return runnerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Runner Id")

  public String getRunnerId() {
    return runnerId;
  }




   /**
   * the Solution Id
   * @return solutionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Solution Id")

  public String getSolutionId() {
    return solutionId;
  }




   /**
   * the Solution Run Template id
   * @return runTemplateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Solution Run Template id")

  public String getRunTemplateId() {
    return runTemplateId;
  }




   /**
   * the compute size needed for this Analysis. Standard sizes are basic and highcpu. Default is basic
   * @return computeSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the compute size needed for this Analysis. Standard sizes are basic and highcpu. Default is basic")

  public String getComputeSize() {
    return computeSize;
  }




   /**
   * the Run creation date
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Run creation date")

  public String getCreatedAt() {
    return createdAt;
  }




   /**
   * the list of Dataset Id associated to this Run
   * @return datasetList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the list of Dataset Id associated to this Run")

  public List<String> getDatasetList() {
    return datasetList;
  }




   /**
   * the list of Run Template parameters values
   * @return parametersValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the list of Run Template parameters values")

  public List<RunTemplateParameterValue> getParametersValues() {
    return parametersValues;
  }




   /**
   * the node label request
   * @return nodeLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the node label request")

  public String getNodeLabel() {
    return nodeLabel;
  }




  public Run containers(List<RunContainer> containers) {
    
    this.containers = containers;
    return this;
  }

  public Run addContainersItem(RunContainer containersItem) {
    if (this.containers == null) {
      this.containers = new ArrayList<RunContainer>();
    }
    this.containers.add(containersItem);
    return this;
  }

   /**
   * the containers list. This information is not returned by the API.
   * @return containers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the containers list. This information is not returned by the API.")

  public List<RunContainer> getContainers() {
    return containers;
  }


  public void setContainers(List<RunContainer> containers) {
    this.containers = containers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Run run = (Run) o;
    return Objects.equals(this.id, run.id) &&
        Objects.equals(this.state, run.state) &&
        Objects.equals(this.organizationId, run.organizationId) &&
        Objects.equals(this.workflowId, run.workflowId) &&
        Objects.equals(this.csmSimulationRun, run.csmSimulationRun) &&
        Objects.equals(this.generateName, run.generateName) &&
        Objects.equals(this.workflowName, run.workflowName) &&
        Objects.equals(this.ownerId, run.ownerId) &&
        Objects.equals(this.workspaceId, run.workspaceId) &&
        Objects.equals(this.workspaceKey, run.workspaceKey) &&
        Objects.equals(this.runnerId, run.runnerId) &&
        Objects.equals(this.solutionId, run.solutionId) &&
        Objects.equals(this.runTemplateId, run.runTemplateId) &&
        Objects.equals(this.computeSize, run.computeSize) &&
        Objects.equals(this.createdAt, run.createdAt) &&
        Objects.equals(this.datasetList, run.datasetList) &&
        Objects.equals(this.parametersValues, run.parametersValues) &&
        Objects.equals(this.nodeLabel, run.nodeLabel) &&
        Objects.equals(this.containers, run.containers);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, organizationId, workflowId, csmSimulationRun, generateName, workflowName, ownerId, workspaceId, workspaceKey, runnerId, solutionId, runTemplateId, computeSize, createdAt, datasetList, parametersValues, nodeLabel, containers);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Run {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
    sb.append("    csmSimulationRun: ").append(toIndentedString(csmSimulationRun)).append("\n");
    sb.append("    generateName: ").append(toIndentedString(generateName)).append("\n");
    sb.append("    workflowName: ").append(toIndentedString(workflowName)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
    sb.append("    workspaceKey: ").append(toIndentedString(workspaceKey)).append("\n");
    sb.append("    runnerId: ").append(toIndentedString(runnerId)).append("\n");
    sb.append("    solutionId: ").append(toIndentedString(solutionId)).append("\n");
    sb.append("    runTemplateId: ").append(toIndentedString(runTemplateId)).append("\n");
    sb.append("    computeSize: ").append(toIndentedString(computeSize)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    datasetList: ").append(toIndentedString(datasetList)).append("\n");
    sb.append("    parametersValues: ").append(toIndentedString(parametersValues)).append("\n");
    sb.append("    nodeLabel: ").append(toIndentedString(nodeLabel)).append("\n");
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

