/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.0.18-SNAPSHOT
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.cosmotech.client.model.RunTemplateParameterValue;
import com.cosmotech.client.model.ScenarioRunContainer;
import com.cosmotech.client.model.ScenarioRunState;
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
 * a ScenarioRun with only base properties
 */
@ApiModel(description = "a ScenarioRun with only base properties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-05T08:55:13.581515453Z[Etc/UTC]")
public class ScenarioRun {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private ScenarioRunState state;

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

  public static final String SERIALIZED_NAME_SCENARIO_ID = "scenarioId";
  @SerializedName(SERIALIZED_NAME_SCENARIO_ID)
  private String scenarioId;

  public static final String SERIALIZED_NAME_SOLUTION_ID = "solutionId";
  @SerializedName(SERIALIZED_NAME_SOLUTION_ID)
  private String solutionId;

  public static final String SERIALIZED_NAME_RUN_TEMPLATE_ID = "runTemplateId";
  @SerializedName(SERIALIZED_NAME_RUN_TEMPLATE_ID)
  private String runTemplateId;

  public static final String SERIALIZED_NAME_COMPUTE_SIZE = "computeSize";
  @SerializedName(SERIALIZED_NAME_COMPUTE_SIZE)
  private String computeSize;

  public static final String SERIALIZED_NAME_SDK_VERSION = "sdkVersion";
  @SerializedName(SERIALIZED_NAME_SDK_VERSION)
  private String sdkVersion;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_NO_DATA_INGESTION_STATE = "noDataIngestionState";
  @SerializedName(SERIALIZED_NAME_NO_DATA_INGESTION_STATE)
  private Boolean noDataIngestionState;

  public static final String SERIALIZED_NAME_DATASET_LIST = "datasetList";
  @SerializedName(SERIALIZED_NAME_DATASET_LIST)
  private List<String> datasetList = null;

  public static final String SERIALIZED_NAME_PARAMETERS_VALUES = "parametersValues";
  @SerializedName(SERIALIZED_NAME_PARAMETERS_VALUES)
  private List<RunTemplateParameterValue> parametersValues = null;

  public static final String SERIALIZED_NAME_SEND_DATASETS_TO_DATA_WAREHOUSE = "sendDatasetsToDataWarehouse";
  @SerializedName(SERIALIZED_NAME_SEND_DATASETS_TO_DATA_WAREHOUSE)
  private Boolean sendDatasetsToDataWarehouse;

  public static final String SERIALIZED_NAME_SEND_INPUT_PARAMETERS_TO_DATA_WAREHOUSE = "sendInputParametersToDataWarehouse";
  @SerializedName(SERIALIZED_NAME_SEND_INPUT_PARAMETERS_TO_DATA_WAREHOUSE)
  private Boolean sendInputParametersToDataWarehouse;

  public static final String SERIALIZED_NAME_NODE_LABEL = "nodeLabel";
  @SerializedName(SERIALIZED_NAME_NODE_LABEL)
  private String nodeLabel;

  public static final String SERIALIZED_NAME_CONTAINERS = "containers";
  @SerializedName(SERIALIZED_NAME_CONTAINERS)
  private List<ScenarioRunContainer> containers = null;

  public ScenarioRun() { 
  }

  
  public ScenarioRun(
     String id, 
     String csmSimulationRun, 
     String ownerId, 
     String workspaceId, 
     String workspaceKey, 
     String scenarioId, 
     String solutionId, 
     String runTemplateId, 
     String computeSize, 
     String createdAt, 
     List<String> datasetList, 
     List<RunTemplateParameterValue> parametersValues, 
     Boolean sendDatasetsToDataWarehouse, 
     Boolean sendInputParametersToDataWarehouse, 
     String nodeLabel
  ) {
    this();
    this.id = id;
    this.csmSimulationRun = csmSimulationRun;
    this.ownerId = ownerId;
    this.workspaceId = workspaceId;
    this.workspaceKey = workspaceKey;
    this.scenarioId = scenarioId;
    this.solutionId = solutionId;
    this.runTemplateId = runTemplateId;
    this.computeSize = computeSize;
    this.createdAt = createdAt;
    this.datasetList = datasetList;
    this.parametersValues = parametersValues;
    this.sendDatasetsToDataWarehouse = sendDatasetsToDataWarehouse;
    this.sendInputParametersToDataWarehouse = sendInputParametersToDataWarehouse;
    this.nodeLabel = nodeLabel;
  }

   /**
   * the ScenarioRun
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the ScenarioRun")

  public String getId() {
    return id;
  }




  public ScenarioRun state(ScenarioRunState state) {
    
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


  public ScenarioRun organizationId(String organizationId) {
    
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


  public ScenarioRun workflowId(String workflowId) {
    
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




  public ScenarioRun generateName(String generateName) {
    
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


  public ScenarioRun workflowName(String workflowName) {
    
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
   * the user id which own this scenariorun
   * @return ownerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the user id which own this scenariorun")

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
   * the Scenario Id
   * @return scenarioId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Scenario Id")

  public String getScenarioId() {
    return scenarioId;
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




  public ScenarioRun sdkVersion(String sdkVersion) {
    
    this.sdkVersion = sdkVersion;
    return this;
  }

   /**
   * the MAJOR.MINOR version used to build the solution solution
   * @return sdkVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the MAJOR.MINOR version used to build the solution solution")

  public String getSdkVersion() {
    return sdkVersion;
  }


  public void setSdkVersion(String sdkVersion) {
    this.sdkVersion = sdkVersion;
  }


   /**
   * the ScenarioRun creation date
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the ScenarioRun creation date")

  public String getCreatedAt() {
    return createdAt;
  }




  public ScenarioRun noDataIngestionState(Boolean noDataIngestionState) {
    
    this.noDataIngestionState = noDataIngestionState;
    return this;
  }

   /**
   * set to true if the run template does not use any Datawarehouse consumers (AMQP consumers for Azure)
   * @return noDataIngestionState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "set to true if the run template does not use any Datawarehouse consumers (AMQP consumers for Azure)")

  public Boolean getNoDataIngestionState() {
    return noDataIngestionState;
  }


  public void setNoDataIngestionState(Boolean noDataIngestionState) {
    this.noDataIngestionState = noDataIngestionState;
  }


   /**
   * the list of Dataset Id associated to this Analysis
   * @return datasetList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the list of Dataset Id associated to this Analysis")

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
   * whether or not the Datasets values are send to the DataWarehouse prior to Simulation Run. If not set follow the Workspace setting
   * @return sendDatasetsToDataWarehouse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "whether or not the Datasets values are send to the DataWarehouse prior to Simulation Run. If not set follow the Workspace setting")

  public Boolean getSendDatasetsToDataWarehouse() {
    return sendDatasetsToDataWarehouse;
  }




   /**
   * whether or not the input parameters values are send to the DataWarehouse prior to Simulation Run. If not set follow the Workspace setting
   * @return sendInputParametersToDataWarehouse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "whether or not the input parameters values are send to the DataWarehouse prior to Simulation Run. If not set follow the Workspace setting")

  public Boolean getSendInputParametersToDataWarehouse() {
    return sendInputParametersToDataWarehouse;
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




  public ScenarioRun containers(List<ScenarioRunContainer> containers) {
    
    this.containers = containers;
    return this;
  }

  public ScenarioRun addContainersItem(ScenarioRunContainer containersItem) {
    if (this.containers == null) {
      this.containers = new ArrayList<ScenarioRunContainer>();
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

  public List<ScenarioRunContainer> getContainers() {
    return containers;
  }


  public void setContainers(List<ScenarioRunContainer> containers) {
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
    ScenarioRun scenarioRun = (ScenarioRun) o;
    return Objects.equals(this.id, scenarioRun.id) &&
        Objects.equals(this.state, scenarioRun.state) &&
        Objects.equals(this.organizationId, scenarioRun.organizationId) &&
        Objects.equals(this.workflowId, scenarioRun.workflowId) &&
        Objects.equals(this.csmSimulationRun, scenarioRun.csmSimulationRun) &&
        Objects.equals(this.generateName, scenarioRun.generateName) &&
        Objects.equals(this.workflowName, scenarioRun.workflowName) &&
        Objects.equals(this.ownerId, scenarioRun.ownerId) &&
        Objects.equals(this.workspaceId, scenarioRun.workspaceId) &&
        Objects.equals(this.workspaceKey, scenarioRun.workspaceKey) &&
        Objects.equals(this.scenarioId, scenarioRun.scenarioId) &&
        Objects.equals(this.solutionId, scenarioRun.solutionId) &&
        Objects.equals(this.runTemplateId, scenarioRun.runTemplateId) &&
        Objects.equals(this.computeSize, scenarioRun.computeSize) &&
        Objects.equals(this.sdkVersion, scenarioRun.sdkVersion) &&
        Objects.equals(this.createdAt, scenarioRun.createdAt) &&
        Objects.equals(this.noDataIngestionState, scenarioRun.noDataIngestionState) &&
        Objects.equals(this.datasetList, scenarioRun.datasetList) &&
        Objects.equals(this.parametersValues, scenarioRun.parametersValues) &&
        Objects.equals(this.sendDatasetsToDataWarehouse, scenarioRun.sendDatasetsToDataWarehouse) &&
        Objects.equals(this.sendInputParametersToDataWarehouse, scenarioRun.sendInputParametersToDataWarehouse) &&
        Objects.equals(this.nodeLabel, scenarioRun.nodeLabel) &&
        Objects.equals(this.containers, scenarioRun.containers);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, organizationId, workflowId, csmSimulationRun, generateName, workflowName, ownerId, workspaceId, workspaceKey, scenarioId, solutionId, runTemplateId, computeSize, sdkVersion, createdAt, noDataIngestionState, datasetList, parametersValues, sendDatasetsToDataWarehouse, sendInputParametersToDataWarehouse, nodeLabel, containers);
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
    sb.append("class ScenarioRun {\n");
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
    sb.append("    scenarioId: ").append(toIndentedString(scenarioId)).append("\n");
    sb.append("    solutionId: ").append(toIndentedString(solutionId)).append("\n");
    sb.append("    runTemplateId: ").append(toIndentedString(runTemplateId)).append("\n");
    sb.append("    computeSize: ").append(toIndentedString(computeSize)).append("\n");
    sb.append("    sdkVersion: ").append(toIndentedString(sdkVersion)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    noDataIngestionState: ").append(toIndentedString(noDataIngestionState)).append("\n");
    sb.append("    datasetList: ").append(toIndentedString(datasetList)).append("\n");
    sb.append("    parametersValues: ").append(toIndentedString(parametersValues)).append("\n");
    sb.append("    sendDatasetsToDataWarehouse: ").append(toIndentedString(sendDatasetsToDataWarehouse)).append("\n");
    sb.append("    sendInputParametersToDataWarehouse: ").append(toIndentedString(sendInputParametersToDataWarehouse)).append("\n");
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

