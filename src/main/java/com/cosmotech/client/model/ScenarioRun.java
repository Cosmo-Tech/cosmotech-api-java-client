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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T16:36:13.668505+02:00[Europe/Paris]")
public class ScenarioRun {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_WORKFLOW_ID = "workflowId";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_ID)
  private String workflowId;

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


   /**
   * the ScenarioRun
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the ScenarioRun")

  public String getId() {
    return id;
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
   * the containers list
   * @return containers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the containers list")

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
        Objects.equals(this.workflowId, scenarioRun.workflowId) &&
        Objects.equals(this.generateName, scenarioRun.generateName) &&
        Objects.equals(this.workflowName, scenarioRun.workflowName) &&
        Objects.equals(this.ownerId, scenarioRun.ownerId) &&
        Objects.equals(this.workspaceId, scenarioRun.workspaceId) &&
        Objects.equals(this.workspaceKey, scenarioRun.workspaceKey) &&
        Objects.equals(this.scenarioId, scenarioRun.scenarioId) &&
        Objects.equals(this.solutionId, scenarioRun.solutionId) &&
        Objects.equals(this.runTemplateId, scenarioRun.runTemplateId) &&
        Objects.equals(this.computeSize, scenarioRun.computeSize) &&
        Objects.equals(this.state, scenarioRun.state) &&
        Objects.equals(this.failedStep, scenarioRun.failedStep) &&
        Objects.equals(this.failedContainerId, scenarioRun.failedContainerId) &&
        Objects.equals(this.startTime, scenarioRun.startTime) &&
        Objects.equals(this.endTime, scenarioRun.endTime) &&
        Objects.equals(this.datasetList, scenarioRun.datasetList) &&
        Objects.equals(this.parametersValues, scenarioRun.parametersValues) &&
        Objects.equals(this.sendDatasetsToDataWarehouse, scenarioRun.sendDatasetsToDataWarehouse) &&
        Objects.equals(this.sendInputParametersToDataWarehouse, scenarioRun.sendInputParametersToDataWarehouse) &&
        Objects.equals(this.nodeLabel, scenarioRun.nodeLabel) &&
        Objects.equals(this.containers, scenarioRun.containers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, workflowId, generateName, workflowName, ownerId, workspaceId, workspaceKey, scenarioId, solutionId, runTemplateId, computeSize, state, failedStep, failedContainerId, startTime, endTime, datasetList, parametersValues, sendDatasetsToDataWarehouse, sendInputParametersToDataWarehouse, nodeLabel, containers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScenarioRun {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
    sb.append("    generateName: ").append(toIndentedString(generateName)).append("\n");
    sb.append("    workflowName: ").append(toIndentedString(workflowName)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
    sb.append("    workspaceKey: ").append(toIndentedString(workspaceKey)).append("\n");
    sb.append("    scenarioId: ").append(toIndentedString(scenarioId)).append("\n");
    sb.append("    solutionId: ").append(toIndentedString(solutionId)).append("\n");
    sb.append("    runTemplateId: ").append(toIndentedString(runTemplateId)).append("\n");
    sb.append("    computeSize: ").append(toIndentedString(computeSize)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    failedStep: ").append(toIndentedString(failedStep)).append("\n");
    sb.append("    failedContainerId: ").append(toIndentedString(failedContainerId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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

