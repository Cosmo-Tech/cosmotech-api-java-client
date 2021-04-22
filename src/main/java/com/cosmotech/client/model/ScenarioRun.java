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
import com.cosmotech.client.model.ScenarioRunContainer;
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
 * a ScenarioRun with only base properties
 */
@ApiModel(description = "a ScenarioRun with only base properties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-22T12:27:09.848905+02:00[Europe/Paris]")
public class ScenarioRun {
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

  /**
   * the ScenarioRun state
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    FETCHINGDATASETS("FetchingDatasets"),
    
    FETCHINGSCENARIOPARAMETERS("FetchingScenarioParameters"),
    
    APPLYINGSCENARIOPARAMETERS("ApplyingScenarioParameters"),
    
    VALIDATINGSCENARIODATA("ValidatingScenarioData"),
    
    SENDINGSCENARIODATATODATAWAREHOUSE("SendingScenarioDataToDataWarehouse"),
    
    PRERUN("PreRun"),
    
    RUNNING("Running"),
    
    POSTRUN("PostRun"),
    
    SUCCESS("Success"),
    
    FAILED("Failed");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public static final String SERIALIZED_NAME_FAILED_STEP = "failedStep";
  @SerializedName(SERIALIZED_NAME_FAILED_STEP)
  private String failedStep;

  public static final String SERIALIZED_NAME_FAILED_CONTAINER_ID = "failedContainerId";
  @SerializedName(SERIALIZED_NAME_FAILED_CONTAINER_ID)
  private String failedContainerId;

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

  public static final String SERIALIZED_NAME_SCENARIORUN_EVENT_BUS_RESOURCE_URI = "scenariorunEventBusResourceUri";
  @SerializedName(SERIALIZED_NAME_SCENARIORUN_EVENT_BUS_RESOURCE_URI)
  private String scenariorunEventBusResourceUri;

  public static final String SERIALIZED_NAME_NODE_LABEL = "nodeLabel";
  @SerializedName(SERIALIZED_NAME_NODE_LABEL)
  private String nodeLabel;

  public static final String SERIALIZED_NAME_FETCH_DATASET_CONTAINERS = "fetchDatasetContainers";
  @SerializedName(SERIALIZED_NAME_FETCH_DATASET_CONTAINERS)
  private List<ScenarioRunContainer> fetchDatasetContainers = null;

  public static final String SERIALIZED_NAME_FETCH_SCENARIO_PARAMETERS_CONTAINER = "fetchScenarioParametersContainer";
  @SerializedName(SERIALIZED_NAME_FETCH_SCENARIO_PARAMETERS_CONTAINER)
  private ScenarioRunContainer fetchScenarioParametersContainer;

  public static final String SERIALIZED_NAME_APPLY_PARAMETERS_CONTAINER = "applyParametersContainer";
  @SerializedName(SERIALIZED_NAME_APPLY_PARAMETERS_CONTAINER)
  private ScenarioRunContainer applyParametersContainer;

  public static final String SERIALIZED_NAME_VALIDATE_DATA_CONTAINER = "validateDataContainer";
  @SerializedName(SERIALIZED_NAME_VALIDATE_DATA_CONTAINER)
  private ScenarioRunContainer validateDataContainer;

  public static final String SERIALIZED_NAME_SEND_DATA_WAREHOUSE_CONTAINER = "sendDataWarehouseContainer";
  @SerializedName(SERIALIZED_NAME_SEND_DATA_WAREHOUSE_CONTAINER)
  private ScenarioRunContainer sendDataWarehouseContainer;

  public static final String SERIALIZED_NAME_PRE_RUN_CONTAINER = "preRunContainer";
  @SerializedName(SERIALIZED_NAME_PRE_RUN_CONTAINER)
  private ScenarioRunContainer preRunContainer;

  public static final String SERIALIZED_NAME_RUN_CONTAINER = "runContainer";
  @SerializedName(SERIALIZED_NAME_RUN_CONTAINER)
  private ScenarioRunContainer runContainer;

  public static final String SERIALIZED_NAME_POST_RUN_CONTAINER = "postRunContainer";
  @SerializedName(SERIALIZED_NAME_POST_RUN_CONTAINER)
  private ScenarioRunContainer postRunContainer;


   /**
   * the ScenarioRun
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the ScenarioRun")

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
   * the ScenarioRun state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the ScenarioRun state")

  public StateEnum getState() {
    return state;
  }




   /**
   * the failed step if state is Failed
   * @return failedStep
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the failed step if state is Failed")

  public String getFailedStep() {
    return failedStep;
  }




   /**
   * the failed container Id if state is Failed
   * @return failedContainerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the failed container Id if state is Failed")

  public String getFailedContainerId() {
    return failedContainerId;
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




   /**
   * the ScenarioRun end Date Time
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the ScenarioRun end Date Time")

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
   * whether or not the Dataset values and the input parameters values are send to the DataWarehouse prior to ScenarioRun Run
   * @return sendInputToDataWarehouse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "whether or not the Dataset values and the input parameters values are send to the DataWarehouse prior to ScenarioRun Run")

  public Boolean getSendInputToDataWarehouse() {
    return sendInputToDataWarehouse;
  }




  public ScenarioRun dataWarehouseDB(String dataWarehouseDB) {
    
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


  public ScenarioRun resultsEventBusResourceUri(String resultsEventBusResourceUri) {
    
    this.resultsEventBusResourceUri = resultsEventBusResourceUri;
    return this;
  }

   /**
   * the event bus which receive Workspace ScenarioRun results messages. Message won&#39;t be send if this is not set
   * @return resultsEventBusResourceUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the event bus which receive Workspace ScenarioRun results messages. Message won't be send if this is not set")

  public String getResultsEventBusResourceUri() {
    return resultsEventBusResourceUri;
  }


  public void setResultsEventBusResourceUri(String resultsEventBusResourceUri) {
    this.resultsEventBusResourceUri = resultsEventBusResourceUri;
  }


  public ScenarioRun scenariorunEventBusResourceUri(String scenariorunEventBusResourceUri) {
    
    this.scenariorunEventBusResourceUri = scenariorunEventBusResourceUri;
    return this;
  }

   /**
   * the event bus which receive Workspace ScenarioRun events messages. Message won&#39;t be send if this is not set
   * @return scenariorunEventBusResourceUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the event bus which receive Workspace ScenarioRun events messages. Message won't be send if this is not set")

  public String getScenariorunEventBusResourceUri() {
    return scenariorunEventBusResourceUri;
  }


  public void setScenariorunEventBusResourceUri(String scenariorunEventBusResourceUri) {
    this.scenariorunEventBusResourceUri = scenariorunEventBusResourceUri;
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
   * the containers which fetch the Scenario Datasets
   * @return fetchDatasetContainers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the containers which fetch the Scenario Datasets")

  public List<ScenarioRunContainer> getFetchDatasetContainers() {
    return fetchDatasetContainers;
  }




  public ScenarioRun fetchScenarioParametersContainer(ScenarioRunContainer fetchScenarioParametersContainer) {
    
    this.fetchScenarioParametersContainer = fetchScenarioParametersContainer;
    return this;
  }

   /**
   * Get fetchScenarioParametersContainer
   * @return fetchScenarioParametersContainer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScenarioRunContainer getFetchScenarioParametersContainer() {
    return fetchScenarioParametersContainer;
  }


  public void setFetchScenarioParametersContainer(ScenarioRunContainer fetchScenarioParametersContainer) {
    this.fetchScenarioParametersContainer = fetchScenarioParametersContainer;
  }


  public ScenarioRun applyParametersContainer(ScenarioRunContainer applyParametersContainer) {
    
    this.applyParametersContainer = applyParametersContainer;
    return this;
  }

   /**
   * Get applyParametersContainer
   * @return applyParametersContainer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScenarioRunContainer getApplyParametersContainer() {
    return applyParametersContainer;
  }


  public void setApplyParametersContainer(ScenarioRunContainer applyParametersContainer) {
    this.applyParametersContainer = applyParametersContainer;
  }


  public ScenarioRun validateDataContainer(ScenarioRunContainer validateDataContainer) {
    
    this.validateDataContainer = validateDataContainer;
    return this;
  }

   /**
   * Get validateDataContainer
   * @return validateDataContainer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScenarioRunContainer getValidateDataContainer() {
    return validateDataContainer;
  }


  public void setValidateDataContainer(ScenarioRunContainer validateDataContainer) {
    this.validateDataContainer = validateDataContainer;
  }


  public ScenarioRun sendDataWarehouseContainer(ScenarioRunContainer sendDataWarehouseContainer) {
    
    this.sendDataWarehouseContainer = sendDataWarehouseContainer;
    return this;
  }

   /**
   * Get sendDataWarehouseContainer
   * @return sendDataWarehouseContainer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScenarioRunContainer getSendDataWarehouseContainer() {
    return sendDataWarehouseContainer;
  }


  public void setSendDataWarehouseContainer(ScenarioRunContainer sendDataWarehouseContainer) {
    this.sendDataWarehouseContainer = sendDataWarehouseContainer;
  }


  public ScenarioRun preRunContainer(ScenarioRunContainer preRunContainer) {
    
    this.preRunContainer = preRunContainer;
    return this;
  }

   /**
   * Get preRunContainer
   * @return preRunContainer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScenarioRunContainer getPreRunContainer() {
    return preRunContainer;
  }


  public void setPreRunContainer(ScenarioRunContainer preRunContainer) {
    this.preRunContainer = preRunContainer;
  }


  public ScenarioRun runContainer(ScenarioRunContainer runContainer) {
    
    this.runContainer = runContainer;
    return this;
  }

   /**
   * Get runContainer
   * @return runContainer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScenarioRunContainer getRunContainer() {
    return runContainer;
  }


  public void setRunContainer(ScenarioRunContainer runContainer) {
    this.runContainer = runContainer;
  }


  public ScenarioRun postRunContainer(ScenarioRunContainer postRunContainer) {
    
    this.postRunContainer = postRunContainer;
    return this;
  }

   /**
   * Get postRunContainer
   * @return postRunContainer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScenarioRunContainer getPostRunContainer() {
    return postRunContainer;
  }


  public void setPostRunContainer(ScenarioRunContainer postRunContainer) {
    this.postRunContainer = postRunContainer;
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
        Objects.equals(this.jobId, scenarioRun.jobId) &&
        Objects.equals(this.ownerId, scenarioRun.ownerId) &&
        Objects.equals(this.workspaceId, scenarioRun.workspaceId) &&
        Objects.equals(this.workspaceName, scenarioRun.workspaceName) &&
        Objects.equals(this.scenarioId, scenarioRun.scenarioId) &&
        Objects.equals(this.scenarioName, scenarioRun.scenarioName) &&
        Objects.equals(this.solutionId, scenarioRun.solutionId) &&
        Objects.equals(this.solutionName, scenarioRun.solutionName) &&
        Objects.equals(this.solutionVersion, scenarioRun.solutionVersion) &&
        Objects.equals(this.runTemplateId, scenarioRun.runTemplateId) &&
        Objects.equals(this.runTemplateName, scenarioRun.runTemplateName) &&
        Objects.equals(this.computeSize, scenarioRun.computeSize) &&
        Objects.equals(this.state, scenarioRun.state) &&
        Objects.equals(this.failedStep, scenarioRun.failedStep) &&
        Objects.equals(this.failedContainerId, scenarioRun.failedContainerId) &&
        Objects.equals(this.startTime, scenarioRun.startTime) &&
        Objects.equals(this.endTime, scenarioRun.endTime) &&
        Objects.equals(this.datasetList, scenarioRun.datasetList) &&
        Objects.equals(this.parametersValues, scenarioRun.parametersValues) &&
        Objects.equals(this.sendInputToDataWarehouse, scenarioRun.sendInputToDataWarehouse) &&
        Objects.equals(this.dataWarehouseDB, scenarioRun.dataWarehouseDB) &&
        Objects.equals(this.resultsEventBusResourceUri, scenarioRun.resultsEventBusResourceUri) &&
        Objects.equals(this.scenariorunEventBusResourceUri, scenarioRun.scenariorunEventBusResourceUri) &&
        Objects.equals(this.nodeLabel, scenarioRun.nodeLabel) &&
        Objects.equals(this.fetchDatasetContainers, scenarioRun.fetchDatasetContainers) &&
        Objects.equals(this.fetchScenarioParametersContainer, scenarioRun.fetchScenarioParametersContainer) &&
        Objects.equals(this.applyParametersContainer, scenarioRun.applyParametersContainer) &&
        Objects.equals(this.validateDataContainer, scenarioRun.validateDataContainer) &&
        Objects.equals(this.sendDataWarehouseContainer, scenarioRun.sendDataWarehouseContainer) &&
        Objects.equals(this.preRunContainer, scenarioRun.preRunContainer) &&
        Objects.equals(this.runContainer, scenarioRun.runContainer) &&
        Objects.equals(this.postRunContainer, scenarioRun.postRunContainer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, jobId, ownerId, workspaceId, workspaceName, scenarioId, scenarioName, solutionId, solutionName, solutionVersion, runTemplateId, runTemplateName, computeSize, state, failedStep, failedContainerId, startTime, endTime, datasetList, parametersValues, sendInputToDataWarehouse, dataWarehouseDB, resultsEventBusResourceUri, scenariorunEventBusResourceUri, nodeLabel, fetchDatasetContainers, fetchScenarioParametersContainer, applyParametersContainer, validateDataContainer, sendDataWarehouseContainer, preRunContainer, runContainer, postRunContainer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScenarioRun {\n");
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
    sb.append("    failedStep: ").append(toIndentedString(failedStep)).append("\n");
    sb.append("    failedContainerId: ").append(toIndentedString(failedContainerId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    datasetList: ").append(toIndentedString(datasetList)).append("\n");
    sb.append("    parametersValues: ").append(toIndentedString(parametersValues)).append("\n");
    sb.append("    sendInputToDataWarehouse: ").append(toIndentedString(sendInputToDataWarehouse)).append("\n");
    sb.append("    dataWarehouseDB: ").append(toIndentedString(dataWarehouseDB)).append("\n");
    sb.append("    resultsEventBusResourceUri: ").append(toIndentedString(resultsEventBusResourceUri)).append("\n");
    sb.append("    scenariorunEventBusResourceUri: ").append(toIndentedString(scenariorunEventBusResourceUri)).append("\n");
    sb.append("    nodeLabel: ").append(toIndentedString(nodeLabel)).append("\n");
    sb.append("    fetchDatasetContainers: ").append(toIndentedString(fetchDatasetContainers)).append("\n");
    sb.append("    fetchScenarioParametersContainer: ").append(toIndentedString(fetchScenarioParametersContainer)).append("\n");
    sb.append("    applyParametersContainer: ").append(toIndentedString(applyParametersContainer)).append("\n");
    sb.append("    validateDataContainer: ").append(toIndentedString(validateDataContainer)).append("\n");
    sb.append("    sendDataWarehouseContainer: ").append(toIndentedString(sendDataWarehouseContainer)).append("\n");
    sb.append("    preRunContainer: ").append(toIndentedString(preRunContainer)).append("\n");
    sb.append("    runContainer: ").append(toIndentedString(runContainer)).append("\n");
    sb.append("    postRunContainer: ").append(toIndentedString(postRunContainer)).append("\n");
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

