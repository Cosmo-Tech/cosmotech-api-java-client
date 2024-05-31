/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.2.2-SNAPSHOT
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import com.cosmotech.client.model.RunTemplateParameterValue;
import com.cosmotech.client.model.ScenarioRunContainer;
import com.cosmotech.client.model.ScenarioRunState;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.cosmotech.client.JSON;

/**
 * a ScenarioRun with only base properties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-31T13:55:35.129487759Z[Etc/UTC]")
@com.redis.om.spring.annotations.Document
public class ScenarioRun {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @org.springframework.data.annotation.Id
  private String id;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  @com.redis.om.spring.annotations.Searchable
  private ScenarioRunState state;

  public static final String SERIALIZED_NAME_ORGANIZATION_ID = "organizationId";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_ID)
  @com.redis.om.spring.annotations.Indexed
  private String organizationId;

  public static final String SERIALIZED_NAME_WORKFLOW_ID = "workflowId";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_ID)
  @com.redis.om.spring.annotations.Indexed
  private String workflowId;

  public static final String SERIALIZED_NAME_CSM_SIMULATION_RUN = "csmSimulationRun";
  @SerializedName(SERIALIZED_NAME_CSM_SIMULATION_RUN)
  private String csmSimulationRun;

  public static final String SERIALIZED_NAME_GENERATE_NAME = "generateName";
  @SerializedName(SERIALIZED_NAME_GENERATE_NAME)
  private String generateName;

  public static final String SERIALIZED_NAME_WORKFLOW_NAME = "workflowName";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_NAME)
  @com.redis.om.spring.annotations.Indexed
  private String workflowName;

  public static final String SERIALIZED_NAME_OWNER_ID = "ownerId";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  @com.redis.om.spring.annotations.Indexed
  private String ownerId;

  public static final String SERIALIZED_NAME_WORKSPACE_ID = "workspaceId";
  @SerializedName(SERIALIZED_NAME_WORKSPACE_ID)
  @com.redis.om.spring.annotations.Indexed
  private String workspaceId;

  public static final String SERIALIZED_NAME_WORKSPACE_KEY = "workspaceKey";
  @SerializedName(SERIALIZED_NAME_WORKSPACE_KEY)
  private String workspaceKey;

  public static final String SERIALIZED_NAME_SCENARIO_ID = "scenarioId";
  @SerializedName(SERIALIZED_NAME_SCENARIO_ID)
  @com.redis.om.spring.annotations.Indexed
  private String scenarioId;

  public static final String SERIALIZED_NAME_SOLUTION_ID = "solutionId";
  @SerializedName(SERIALIZED_NAME_SOLUTION_ID)
  @com.redis.om.spring.annotations.Indexed
  private String solutionId;

  public static final String SERIALIZED_NAME_RUN_TEMPLATE_ID = "runTemplateId";
  @SerializedName(SERIALIZED_NAME_RUN_TEMPLATE_ID)
  @com.redis.om.spring.annotations.Indexed
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
  private List<String> datasetList;

  public static final String SERIALIZED_NAME_PARAMETERS_VALUES = "parametersValues";
  @SerializedName(SERIALIZED_NAME_PARAMETERS_VALUES)
  private List<RunTemplateParameterValue> parametersValues;

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
  private List<ScenarioRunContainer> containers;

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
  public String getOwnerId() {
    return ownerId;
  }



   /**
   * the Workspace Id
   * @return workspaceId
  **/
  @javax.annotation.Nullable
  public String getWorkspaceId() {
    return workspaceId;
  }



   /**
   * technical key for resource name convention and version grouping. Must be unique
   * @return workspaceKey
  **/
  @javax.annotation.Nullable
  public String getWorkspaceKey() {
    return workspaceKey;
  }



   /**
   * the Scenario Id
   * @return scenarioId
  **/
  @javax.annotation.Nullable
  public String getScenarioId() {
    return scenarioId;
  }



   /**
   * the Solution Id
   * @return solutionId
  **/
  @javax.annotation.Nullable
  public String getSolutionId() {
    return solutionId;
  }



   /**
   * the Solution Run Template id
   * @return runTemplateId
  **/
  @javax.annotation.Nullable
  public String getRunTemplateId() {
    return runTemplateId;
  }



   /**
   * the compute size needed for this Analysis. Standard sizes are basic and highcpu. Default is basic
   * @return computeSize
  **/
  @javax.annotation.Nullable
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
  public List<String> getDatasetList() {
    return datasetList;
  }



   /**
   * the list of Run Template parameters values
   * @return parametersValues
  **/
  @javax.annotation.Nullable
  public List<RunTemplateParameterValue> getParametersValues() {
    return parametersValues;
  }



   /**
   * whether or not the Datasets values are send to the DataWarehouse prior to Simulation Run. If not set follow the Workspace setting
   * @return sendDatasetsToDataWarehouse
  **/
  @javax.annotation.Nullable
  public Boolean getSendDatasetsToDataWarehouse() {
    return sendDatasetsToDataWarehouse;
  }



   /**
   * whether or not the input parameters values are send to the DataWarehouse prior to Simulation Run. If not set follow the Workspace setting
   * @return sendInputParametersToDataWarehouse
  **/
  @javax.annotation.Nullable
  public Boolean getSendInputParametersToDataWarehouse() {
    return sendInputParametersToDataWarehouse;
  }



   /**
   * the node label request
   * @return nodeLabel
  **/
  @javax.annotation.Nullable
  public String getNodeLabel() {
    return nodeLabel;
  }



  public ScenarioRun containers(List<ScenarioRunContainer> containers) {
    this.containers = containers;
    return this;
  }

  public ScenarioRun addContainersItem(ScenarioRunContainer containersItem) {
    if (this.containers == null) {
      this.containers = new ArrayList<>();
    }
    this.containers.add(containersItem);
    return this;
  }

   /**
   * the containers list. This information is not returned by the API.
   * @return containers
  **/
  @javax.annotation.Nullable
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

  @Override
  public int hashCode() {
    return Objects.hash(id, state, organizationId, workflowId, csmSimulationRun, generateName, workflowName, ownerId, workspaceId, workspaceKey, scenarioId, solutionId, runTemplateId, computeSize, sdkVersion, createdAt, noDataIngestionState, datasetList, parametersValues, sendDatasetsToDataWarehouse, sendInputParametersToDataWarehouse, nodeLabel, containers);
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("state");
    openapiFields.add("organizationId");
    openapiFields.add("workflowId");
    openapiFields.add("csmSimulationRun");
    openapiFields.add("generateName");
    openapiFields.add("workflowName");
    openapiFields.add("ownerId");
    openapiFields.add("workspaceId");
    openapiFields.add("workspaceKey");
    openapiFields.add("scenarioId");
    openapiFields.add("solutionId");
    openapiFields.add("runTemplateId");
    openapiFields.add("computeSize");
    openapiFields.add("sdkVersion");
    openapiFields.add("createdAt");
    openapiFields.add("noDataIngestionState");
    openapiFields.add("datasetList");
    openapiFields.add("parametersValues");
    openapiFields.add("sendDatasetsToDataWarehouse");
    openapiFields.add("sendInputParametersToDataWarehouse");
    openapiFields.add("nodeLabel");
    openapiFields.add("containers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ScenarioRun
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ScenarioRun.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ScenarioRun is not found in the empty JSON string", ScenarioRun.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ScenarioRun.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ScenarioRun` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `state`
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) {
        ScenarioRunState.validateJsonElement(jsonObj.get("state"));
      }
      if ((jsonObj.get("organizationId") != null && !jsonObj.get("organizationId").isJsonNull()) && !jsonObj.get("organizationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organizationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organizationId").toString()));
      }
      if ((jsonObj.get("workflowId") != null && !jsonObj.get("workflowId").isJsonNull()) && !jsonObj.get("workflowId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workflowId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workflowId").toString()));
      }
      if ((jsonObj.get("csmSimulationRun") != null && !jsonObj.get("csmSimulationRun").isJsonNull()) && !jsonObj.get("csmSimulationRun").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `csmSimulationRun` to be a primitive type in the JSON string but got `%s`", jsonObj.get("csmSimulationRun").toString()));
      }
      if ((jsonObj.get("generateName") != null && !jsonObj.get("generateName").isJsonNull()) && !jsonObj.get("generateName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `generateName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("generateName").toString()));
      }
      if ((jsonObj.get("workflowName") != null && !jsonObj.get("workflowName").isJsonNull()) && !jsonObj.get("workflowName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workflowName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workflowName").toString()));
      }
      if ((jsonObj.get("ownerId") != null && !jsonObj.get("ownerId").isJsonNull()) && !jsonObj.get("ownerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ownerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ownerId").toString()));
      }
      if ((jsonObj.get("workspaceId") != null && !jsonObj.get("workspaceId").isJsonNull()) && !jsonObj.get("workspaceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workspaceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workspaceId").toString()));
      }
      if ((jsonObj.get("workspaceKey") != null && !jsonObj.get("workspaceKey").isJsonNull()) && !jsonObj.get("workspaceKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workspaceKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workspaceKey").toString()));
      }
      if ((jsonObj.get("scenarioId") != null && !jsonObj.get("scenarioId").isJsonNull()) && !jsonObj.get("scenarioId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scenarioId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scenarioId").toString()));
      }
      if ((jsonObj.get("solutionId") != null && !jsonObj.get("solutionId").isJsonNull()) && !jsonObj.get("solutionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `solutionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("solutionId").toString()));
      }
      if ((jsonObj.get("runTemplateId") != null && !jsonObj.get("runTemplateId").isJsonNull()) && !jsonObj.get("runTemplateId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `runTemplateId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("runTemplateId").toString()));
      }
      if ((jsonObj.get("computeSize") != null && !jsonObj.get("computeSize").isJsonNull()) && !jsonObj.get("computeSize").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `computeSize` to be a primitive type in the JSON string but got `%s`", jsonObj.get("computeSize").toString()));
      }
      if ((jsonObj.get("sdkVersion") != null && !jsonObj.get("sdkVersion").isJsonNull()) && !jsonObj.get("sdkVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sdkVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sdkVersion").toString()));
      }
      if ((jsonObj.get("createdAt") != null && !jsonObj.get("createdAt").isJsonNull()) && !jsonObj.get("createdAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdAt").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("datasetList") != null && !jsonObj.get("datasetList").isJsonNull() && !jsonObj.get("datasetList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `datasetList` to be an array in the JSON string but got `%s`", jsonObj.get("datasetList").toString()));
      }
      if (jsonObj.get("parametersValues") != null && !jsonObj.get("parametersValues").isJsonNull()) {
        JsonArray jsonArrayparametersValues = jsonObj.getAsJsonArray("parametersValues");
        if (jsonArrayparametersValues != null) {
          // ensure the json data is an array
          if (!jsonObj.get("parametersValues").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `parametersValues` to be an array in the JSON string but got `%s`", jsonObj.get("parametersValues").toString()));
          }

          // validate the optional field `parametersValues` (array)
          for (int i = 0; i < jsonArrayparametersValues.size(); i++) {
            RunTemplateParameterValue.validateJsonElement(jsonArrayparametersValues.get(i));
          };
        }
      }
      if ((jsonObj.get("nodeLabel") != null && !jsonObj.get("nodeLabel").isJsonNull()) && !jsonObj.get("nodeLabel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nodeLabel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nodeLabel").toString()));
      }
      if (jsonObj.get("containers") != null && !jsonObj.get("containers").isJsonNull()) {
        JsonArray jsonArraycontainers = jsonObj.getAsJsonArray("containers");
        if (jsonArraycontainers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("containers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `containers` to be an array in the JSON string but got `%s`", jsonObj.get("containers").toString()));
          }

          // validate the optional field `containers` (array)
          for (int i = 0; i < jsonArraycontainers.size(); i++) {
            ScenarioRunContainer.validateJsonElement(jsonArraycontainers.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ScenarioRun.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ScenarioRun' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ScenarioRun> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ScenarioRun.class));

       return (TypeAdapter<T>) new TypeAdapter<ScenarioRun>() {
           @Override
           public void write(JsonWriter out, ScenarioRun value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ScenarioRun read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ScenarioRun given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ScenarioRun
  * @throws IOException if the JSON string is invalid with respect to ScenarioRun
  */
  public static ScenarioRun fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ScenarioRun.class);
  }

 /**
  * Convert an instance of ScenarioRun to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

