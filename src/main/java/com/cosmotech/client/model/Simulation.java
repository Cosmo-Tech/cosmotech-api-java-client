/*
 * Cosmo Tech Plaform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 0.0.1-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.cosmotech.client.model.RunTemplateParameterValue;
import com.cosmotech.client.model.SimulationAllOf;
import com.cosmotech.client.model.SimulationBase;
import com.cosmotech.client.model.SimulationContainers;
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
 * Simulation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-19T18:57:39.320413+02:00[Europe/Paris]")
public class Simulation {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_JOB_ID = "jobId";
  @SerializedName(SERIALIZED_NAME_JOB_ID)
  private String jobId;

  public static final String SERIALIZED_NAME_OWNER_ID = "ownerId";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  public static final String SERIALIZED_NAME_WORKSPACE_ID = "workspaceId";
  @SerializedName(SERIALIZED_NAME_WORKSPACE_ID)
  private String workspaceId;

  public static final String SERIALIZED_NAME_WORKSPACE_NAME = "workspaceName";
  @SerializedName(SERIALIZED_NAME_WORKSPACE_NAME)
  private String workspaceName;

  public static final String SERIALIZED_NAME_SCENARIO_ID = "scenarioId";
  @SerializedName(SERIALIZED_NAME_SCENARIO_ID)
  private String scenarioId;

  public static final String SERIALIZED_NAME_SCENARIO_NAME = "scenarioName";
  @SerializedName(SERIALIZED_NAME_SCENARIO_NAME)
  private String scenarioName;

  public static final String SERIALIZED_NAME_SOLUTION_ID = "solutionId";
  @SerializedName(SERIALIZED_NAME_SOLUTION_ID)
  private String solutionId;

  public static final String SERIALIZED_NAME_SOLUTION_NAME = "solutionName";
  @SerializedName(SERIALIZED_NAME_SOLUTION_NAME)
  private String solutionName;

  public static final String SERIALIZED_NAME_SOLUTION_VERSION = "solutionVersion";
  @SerializedName(SERIALIZED_NAME_SOLUTION_VERSION)
  private String solutionVersion;

  public static final String SERIALIZED_NAME_RUN_TEMPLATE_ID = "runTemplateId";
  @SerializedName(SERIALIZED_NAME_RUN_TEMPLATE_ID)
  private String runTemplateId;

  public static final String SERIALIZED_NAME_RUN_TEMPLATE_NAME = "runTemplateName";
  @SerializedName(SERIALIZED_NAME_RUN_TEMPLATE_NAME)
  private String runTemplateName;

  public static final String SERIALIZED_NAME_COMPUTE_SIZE = "computeSize";
  @SerializedName(SERIALIZED_NAME_COMPUTE_SIZE)
  private String computeSize;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public static final String SERIALIZED_NAME_END_TIME = "endTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public static final String SERIALIZED_NAME_DATASET_LIST = "datasetList";
  @SerializedName(SERIALIZED_NAME_DATASET_LIST)
  private List<String> datasetList = null;

  public static final String SERIALIZED_NAME_PARAMETERS_VALUES = "parametersValues";
  @SerializedName(SERIALIZED_NAME_PARAMETERS_VALUES)
  private List<RunTemplateParameterValue> parametersValues = null;

  public static final String SERIALIZED_NAME_SEND_INPUT_TO_DATA_WAREHOUSE = "sendInputToDataWarehouse";
  @SerializedName(SERIALIZED_NAME_SEND_INPUT_TO_DATA_WAREHOUSE)
  private Boolean sendInputToDataWarehouse;

  public static final String SERIALIZED_NAME_DATA_WAREHOUSE_D_B = "dataWarehouseDB";
  @SerializedName(SERIALIZED_NAME_DATA_WAREHOUSE_D_B)
  private String dataWarehouseDB;

  public static final String SERIALIZED_NAME_RESULTS_EVENT_BUS_RESOURCE_URI = "resultsEventBusResourceUri";
  @SerializedName(SERIALIZED_NAME_RESULTS_EVENT_BUS_RESOURCE_URI)
  private String resultsEventBusResourceUri;

  public static final String SERIALIZED_NAME_SIMULATION_EVENT_BUS_RESOURCE_URI = "simulationEventBusResourceUri";
  @SerializedName(SERIALIZED_NAME_SIMULATION_EVENT_BUS_RESOURCE_URI)
  private String simulationEventBusResourceUri;

  public static final String SERIALIZED_NAME_NODE_LABEL = "nodeLabel";
  @SerializedName(SERIALIZED_NAME_NODE_LABEL)
  private String nodeLabel;

  public static final String SERIALIZED_NAME_INIT_CONTAINERS = "initContainers";
  @SerializedName(SERIALIZED_NAME_INIT_CONTAINERS)
  private List<SimulationContainers> initContainers = null;

  public static final String SERIALIZED_NAME_MAIN_CONTAINER = "mainContainer";
  @SerializedName(SERIALIZED_NAME_MAIN_CONTAINER)
  private SimulationContainers mainContainer;


   /**
   * the Simulation
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Simulation")

  public String getId() {
    return id;
  }




   /**
   * the Platform compute cluster Job Id
   * @return jobId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Platform compute cluster Job Id")

  public String getJobId() {
    return jobId;
  }




   /**
   * the user id which own this simulation
   * @return ownerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the user id which own this simulation")

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
   * the Workspace name
   * @return workspaceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Workspace name")

  public String getWorkspaceName() {
    return workspaceName;
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
   * the Scenario name
   * @return scenarioName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Scenario name")

  public String getScenarioName() {
    return scenarioName;
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
   * the Solution name
   * @return solutionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Solution name")

  public String getSolutionName() {
    return solutionName;
  }




   /**
   * the Solution version
   * @return solutionVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Solution version")

  public String getSolutionVersion() {
    return solutionVersion;
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
   * the Run Template name
   * @return runTemplateName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Run Template name")

  public String getRunTemplateName() {
    return runTemplateName;
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
   * the Simulation state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Simulation state")

  public String getState() {
    return state;
  }




   /**
   * the Simulation start Date Time
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Simulation start Date Time")

  public String getStartTime() {
    return startTime;
  }




   /**
   * the Simulation end Date Time
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Simulation end Date Time")

  public String getEndTime() {
    return endTime;
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
   * whether or not the Dataset values and the input parameters values are send to the DataWarehouse prior to Simulation Run
   * @return sendInputToDataWarehouse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "whether or not the Dataset values and the input parameters values are send to the DataWarehouse prior to Simulation Run")

  public Boolean getSendInputToDataWarehouse() {
    return sendInputToDataWarehouse;
  }




  public Simulation dataWarehouseDB(String dataWarehouseDB) {
    
    this.dataWarehouseDB = dataWarehouseDB;
    return this;
  }

   /**
   * the DataWarehouse database name to send data if sendInputToDataWarehouse is set
   * @return dataWarehouseDB
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the DataWarehouse database name to send data if sendInputToDataWarehouse is set")

  public String getDataWarehouseDB() {
    return dataWarehouseDB;
  }


  public void setDataWarehouseDB(String dataWarehouseDB) {
    this.dataWarehouseDB = dataWarehouseDB;
  }


  public Simulation resultsEventBusResourceUri(String resultsEventBusResourceUri) {
    
    this.resultsEventBusResourceUri = resultsEventBusResourceUri;
    return this;
  }

   /**
   * the event bus which receive Workspace Simulation results messages. Message won&#39;t be send if this is not set
   * @return resultsEventBusResourceUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the event bus which receive Workspace Simulation results messages. Message won't be send if this is not set")

  public String getResultsEventBusResourceUri() {
    return resultsEventBusResourceUri;
  }


  public void setResultsEventBusResourceUri(String resultsEventBusResourceUri) {
    this.resultsEventBusResourceUri = resultsEventBusResourceUri;
  }


  public Simulation simulationEventBusResourceUri(String simulationEventBusResourceUri) {
    
    this.simulationEventBusResourceUri = simulationEventBusResourceUri;
    return this;
  }

   /**
   * the event bus which receive Workspace Simulation events messages. Message won&#39;t be send if this is not set
   * @return simulationEventBusResourceUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the event bus which receive Workspace Simulation events messages. Message won't be send if this is not set")

  public String getSimulationEventBusResourceUri() {
    return simulationEventBusResourceUri;
  }


  public void setSimulationEventBusResourceUri(String simulationEventBusResourceUri) {
    this.simulationEventBusResourceUri = simulationEventBusResourceUri;
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




   /**
   * the list of init containers
   * @return initContainers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the list of init containers")

  public List<SimulationContainers> getInitContainers() {
    return initContainers;
  }




  public Simulation mainContainer(SimulationContainers mainContainer) {
    
    this.mainContainer = mainContainer;
    return this;
  }

   /**
   * Get mainContainer
   * @return mainContainer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SimulationContainers getMainContainer() {
    return mainContainer;
  }


  public void setMainContainer(SimulationContainers mainContainer) {
    this.mainContainer = mainContainer;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Simulation simulation = (Simulation) o;
    return Objects.equals(this.id, simulation.id) &&
        Objects.equals(this.jobId, simulation.jobId) &&
        Objects.equals(this.ownerId, simulation.ownerId) &&
        Objects.equals(this.workspaceId, simulation.workspaceId) &&
        Objects.equals(this.workspaceName, simulation.workspaceName) &&
        Objects.equals(this.scenarioId, simulation.scenarioId) &&
        Objects.equals(this.scenarioName, simulation.scenarioName) &&
        Objects.equals(this.solutionId, simulation.solutionId) &&
        Objects.equals(this.solutionName, simulation.solutionName) &&
        Objects.equals(this.solutionVersion, simulation.solutionVersion) &&
        Objects.equals(this.runTemplateId, simulation.runTemplateId) &&
        Objects.equals(this.runTemplateName, simulation.runTemplateName) &&
        Objects.equals(this.computeSize, simulation.computeSize) &&
        Objects.equals(this.state, simulation.state) &&
        Objects.equals(this.startTime, simulation.startTime) &&
        Objects.equals(this.endTime, simulation.endTime) &&
        Objects.equals(this.datasetList, simulation.datasetList) &&
        Objects.equals(this.parametersValues, simulation.parametersValues) &&
        Objects.equals(this.sendInputToDataWarehouse, simulation.sendInputToDataWarehouse) &&
        Objects.equals(this.dataWarehouseDB, simulation.dataWarehouseDB) &&
        Objects.equals(this.resultsEventBusResourceUri, simulation.resultsEventBusResourceUri) &&
        Objects.equals(this.simulationEventBusResourceUri, simulation.simulationEventBusResourceUri) &&
        Objects.equals(this.nodeLabel, simulation.nodeLabel) &&
        Objects.equals(this.initContainers, simulation.initContainers) &&
        Objects.equals(this.mainContainer, simulation.mainContainer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, jobId, ownerId, workspaceId, workspaceName, scenarioId, scenarioName, solutionId, solutionName, solutionVersion, runTemplateId, runTemplateName, computeSize, state, startTime, endTime, datasetList, parametersValues, sendInputToDataWarehouse, dataWarehouseDB, resultsEventBusResourceUri, simulationEventBusResourceUri, nodeLabel, initContainers, mainContainer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Simulation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
    sb.append("    workspaceName: ").append(toIndentedString(workspaceName)).append("\n");
    sb.append("    scenarioId: ").append(toIndentedString(scenarioId)).append("\n");
    sb.append("    scenarioName: ").append(toIndentedString(scenarioName)).append("\n");
    sb.append("    solutionId: ").append(toIndentedString(solutionId)).append("\n");
    sb.append("    solutionName: ").append(toIndentedString(solutionName)).append("\n");
    sb.append("    solutionVersion: ").append(toIndentedString(solutionVersion)).append("\n");
    sb.append("    runTemplateId: ").append(toIndentedString(runTemplateId)).append("\n");
    sb.append("    runTemplateName: ").append(toIndentedString(runTemplateName)).append("\n");
    sb.append("    computeSize: ").append(toIndentedString(computeSize)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    datasetList: ").append(toIndentedString(datasetList)).append("\n");
    sb.append("    parametersValues: ").append(toIndentedString(parametersValues)).append("\n");
    sb.append("    sendInputToDataWarehouse: ").append(toIndentedString(sendInputToDataWarehouse)).append("\n");
    sb.append("    dataWarehouseDB: ").append(toIndentedString(dataWarehouseDB)).append("\n");
    sb.append("    resultsEventBusResourceUri: ").append(toIndentedString(resultsEventBusResourceUri)).append("\n");
    sb.append("    simulationEventBusResourceUri: ").append(toIndentedString(simulationEventBusResourceUri)).append("\n");
    sb.append("    nodeLabel: ").append(toIndentedString(nodeLabel)).append("\n");
    sb.append("    initContainers: ").append(toIndentedString(initContainers)).append("\n");
    sb.append("    mainContainer: ").append(toIndentedString(mainContainer)).append("\n");
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

