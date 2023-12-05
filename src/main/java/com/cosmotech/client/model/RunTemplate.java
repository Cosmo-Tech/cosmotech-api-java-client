/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.0.19-SNAPSHOT
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.cosmotech.client.model.DeleteHistoricalData;
import com.cosmotech.client.model.RunTemplateOrchestrator;
import com.cosmotech.client.model.RunTemplateResourceSizing;
import com.cosmotech.client.model.RunTemplateStepSource;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * a Solution Run Template
 */
@ApiModel(description = "a Solution Run Template")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-05T13:42:06.749496881Z[Etc/UTC]")
public class RunTemplate {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CSM_SIMULATION = "csmSimulation";
  @SerializedName(SERIALIZED_NAME_CSM_SIMULATION)
  private String csmSimulation;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_COMPUTE_SIZE = "computeSize";
  @SerializedName(SERIALIZED_NAME_COMPUTE_SIZE)
  private String computeSize;

  public static final String SERIALIZED_NAME_RUN_SIZING = "runSizing";
  @SerializedName(SERIALIZED_NAME_RUN_SIZING)
  private RunTemplateResourceSizing runSizing;

  public static final String SERIALIZED_NAME_NO_DATA_INGESTION_STATE = "noDataIngestionState";
  @SerializedName(SERIALIZED_NAME_NO_DATA_INGESTION_STATE)
  private Boolean noDataIngestionState;

  public static final String SERIALIZED_NAME_FETCH_DATASETS = "fetchDatasets";
  @SerializedName(SERIALIZED_NAME_FETCH_DATASETS)
  private Boolean fetchDatasets;

  public static final String SERIALIZED_NAME_SCENARIO_DATA_DOWNLOAD_TRANSFORM = "scenarioDataDownloadTransform";
  @SerializedName(SERIALIZED_NAME_SCENARIO_DATA_DOWNLOAD_TRANSFORM)
  private Boolean scenarioDataDownloadTransform;

  public static final String SERIALIZED_NAME_FETCH_SCENARIO_PARAMETERS = "fetchScenarioParameters";
  @SerializedName(SERIALIZED_NAME_FETCH_SCENARIO_PARAMETERS)
  private Boolean fetchScenarioParameters;

  public static final String SERIALIZED_NAME_APPLY_PARAMETERS = "applyParameters";
  @SerializedName(SERIALIZED_NAME_APPLY_PARAMETERS)
  private Boolean applyParameters;

  public static final String SERIALIZED_NAME_VALIDATE_DATA = "validateData";
  @SerializedName(SERIALIZED_NAME_VALIDATE_DATA)
  private Boolean validateData;

  public static final String SERIALIZED_NAME_SEND_DATASETS_TO_DATA_WAREHOUSE = "sendDatasetsToDataWarehouse";
  @SerializedName(SERIALIZED_NAME_SEND_DATASETS_TO_DATA_WAREHOUSE)
  private Boolean sendDatasetsToDataWarehouse;

  public static final String SERIALIZED_NAME_SEND_INPUT_PARAMETERS_TO_DATA_WAREHOUSE = "sendInputParametersToDataWarehouse";
  @SerializedName(SERIALIZED_NAME_SEND_INPUT_PARAMETERS_TO_DATA_WAREHOUSE)
  private Boolean sendInputParametersToDataWarehouse;

  public static final String SERIALIZED_NAME_PRE_RUN = "preRun";
  @SerializedName(SERIALIZED_NAME_PRE_RUN)
  private Boolean preRun;

  public static final String SERIALIZED_NAME_RUN = "run";
  @SerializedName(SERIALIZED_NAME_RUN)
  private Boolean run;

  public static final String SERIALIZED_NAME_POST_RUN = "postRun";
  @SerializedName(SERIALIZED_NAME_POST_RUN)
  private Boolean postRun;

  public static final String SERIALIZED_NAME_PARAMETERS_JSON = "parametersJson";
  @SerializedName(SERIALIZED_NAME_PARAMETERS_JSON)
  private Boolean parametersJson;

  public static final String SERIALIZED_NAME_PARAMETERS_HANDLER_SOURCE = "parametersHandlerSource";
  @SerializedName(SERIALIZED_NAME_PARAMETERS_HANDLER_SOURCE)
  private RunTemplateStepSource parametersHandlerSource;

  public static final String SERIALIZED_NAME_DATASET_VALIDATOR_SOURCE = "datasetValidatorSource";
  @SerializedName(SERIALIZED_NAME_DATASET_VALIDATOR_SOURCE)
  private RunTemplateStepSource datasetValidatorSource;

  public static final String SERIALIZED_NAME_PRE_RUN_SOURCE = "preRunSource";
  @SerializedName(SERIALIZED_NAME_PRE_RUN_SOURCE)
  private RunTemplateStepSource preRunSource;

  public static final String SERIALIZED_NAME_RUN_SOURCE = "runSource";
  @SerializedName(SERIALIZED_NAME_RUN_SOURCE)
  private RunTemplateStepSource runSource;

  public static final String SERIALIZED_NAME_POST_RUN_SOURCE = "postRunSource";
  @SerializedName(SERIALIZED_NAME_POST_RUN_SOURCE)
  private RunTemplateStepSource postRunSource;

  public static final String SERIALIZED_NAME_SCENARIODATA_TRANSFORM_SOURCE = "scenariodataTransformSource";
  @SerializedName(SERIALIZED_NAME_SCENARIODATA_TRANSFORM_SOURCE)
  private RunTemplateStepSource scenariodataTransformSource;

  public static final String SERIALIZED_NAME_PARAMETER_GROUPS = "parameterGroups";
  @SerializedName(SERIALIZED_NAME_PARAMETER_GROUPS)
  private List<String> parameterGroups = null;

  public static final String SERIALIZED_NAME_STACK_STEPS = "stackSteps";
  @SerializedName(SERIALIZED_NAME_STACK_STEPS)
  private Boolean stackSteps;

  public static final String SERIALIZED_NAME_GIT_REPOSITORY_URL = "gitRepositoryUrl";
  @SerializedName(SERIALIZED_NAME_GIT_REPOSITORY_URL)
  private String gitRepositoryUrl;

  public static final String SERIALIZED_NAME_GIT_BRANCH_NAME = "gitBranchName";
  @SerializedName(SERIALIZED_NAME_GIT_BRANCH_NAME)
  private String gitBranchName;

  public static final String SERIALIZED_NAME_RUN_TEMPLATE_SOURCE_DIR = "runTemplateSourceDir";
  @SerializedName(SERIALIZED_NAME_RUN_TEMPLATE_SOURCE_DIR)
  private String runTemplateSourceDir;

  public static final String SERIALIZED_NAME_ORCHESTRATOR_TYPE = "orchestratorType";
  @SerializedName(SERIALIZED_NAME_ORCHESTRATOR_TYPE)
  private RunTemplateOrchestrator orchestratorType;

  public static final String SERIALIZED_NAME_EXECUTION_TIMEOUT = "executionTimeout";
  @SerializedName(SERIALIZED_NAME_EXECUTION_TIMEOUT)
  private Integer executionTimeout;

  public static final String SERIALIZED_NAME_DELETE_HISTORICAL_DATA = "deleteHistoricalData";
  @SerializedName(SERIALIZED_NAME_DELETE_HISTORICAL_DATA)
  private DeleteHistoricalData deleteHistoricalData;

  public RunTemplate() { 
  }

  public RunTemplate id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * the Solution Run Template id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the Solution Run Template id")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public RunTemplate name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * the Run Template name
   * @return name
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Run Template name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public RunTemplate labels(Map<String, String> labels) {
    
    this.labels = labels;
    return this;
  }

  public RunTemplate putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<String, String>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * a translated label with key as ISO 639-1 code
   * @return labels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "a translated label with key as ISO 639-1 code")

  public Map<String, String> getLabels() {
    return labels;
  }


  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public RunTemplate description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * the Run Template description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Run Template description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public RunTemplate csmSimulation(String csmSimulation) {
    
    this.csmSimulation = csmSimulation;
    return this;
  }

   /**
   * the Cosmo Tech simulation name. This information is send to the Engine. Mandatory information if no Engine is defined
   * @return csmSimulation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Cosmo Tech simulation name. This information is send to the Engine. Mandatory information if no Engine is defined")

  public String getCsmSimulation() {
    return csmSimulation;
  }


  public void setCsmSimulation(String csmSimulation) {
    this.csmSimulation = csmSimulation;
  }


  public RunTemplate tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public RunTemplate addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * the list of Run Template tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the list of Run Template tags")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public RunTemplate computeSize(String computeSize) {
    
    this.computeSize = computeSize;
    return this;
  }

   /**
   * the compute size needed for this Run Template. Standard sizes are basic and highcpu. Default is basic
   * @return computeSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the compute size needed for this Run Template. Standard sizes are basic and highcpu. Default is basic")

  public String getComputeSize() {
    return computeSize;
  }


  public void setComputeSize(String computeSize) {
    this.computeSize = computeSize;
  }


  public RunTemplate runSizing(RunTemplateResourceSizing runSizing) {
    
    this.runSizing = runSizing;
    return this;
  }

   /**
   * Get runSizing
   * @return runSizing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RunTemplateResourceSizing getRunSizing() {
    return runSizing;
  }


  public void setRunSizing(RunTemplateResourceSizing runSizing) {
    this.runSizing = runSizing;
  }


  public RunTemplate noDataIngestionState(Boolean noDataIngestionState) {
    
    this.noDataIngestionState = noDataIngestionState;
    return this;
  }

   /**
   * set to true if the run template does not want to check data ingestion state (no probes or not control plane)
   * @return noDataIngestionState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "set to true if the run template does not want to check data ingestion state (no probes or not control plane)")

  public Boolean getNoDataIngestionState() {
    return noDataIngestionState;
  }


  public void setNoDataIngestionState(Boolean noDataIngestionState) {
    this.noDataIngestionState = noDataIngestionState;
  }


  public RunTemplate fetchDatasets(Boolean fetchDatasets) {
    
    this.fetchDatasets = fetchDatasets;
    return this;
  }

   /**
   * whether or not the fetch dataset step is done
   * @return fetchDatasets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "whether or not the fetch dataset step is done")

  public Boolean getFetchDatasets() {
    return fetchDatasets;
  }


  public void setFetchDatasets(Boolean fetchDatasets) {
    this.fetchDatasets = fetchDatasets;
  }


  public RunTemplate scenarioDataDownloadTransform(Boolean scenarioDataDownloadTransform) {
    
    this.scenarioDataDownloadTransform = scenarioDataDownloadTransform;
    return this;
  }

   /**
   * whether or not the scenario data download transform step step is done
   * @return scenarioDataDownloadTransform
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "whether or not the scenario data download transform step step is done")

  public Boolean getScenarioDataDownloadTransform() {
    return scenarioDataDownloadTransform;
  }


  public void setScenarioDataDownloadTransform(Boolean scenarioDataDownloadTransform) {
    this.scenarioDataDownloadTransform = scenarioDataDownloadTransform;
  }


  public RunTemplate fetchScenarioParameters(Boolean fetchScenarioParameters) {
    
    this.fetchScenarioParameters = fetchScenarioParameters;
    return this;
  }

   /**
   * whether or not the fetch parameters step is done
   * @return fetchScenarioParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "whether or not the fetch parameters step is done")

  public Boolean getFetchScenarioParameters() {
    return fetchScenarioParameters;
  }


  public void setFetchScenarioParameters(Boolean fetchScenarioParameters) {
    this.fetchScenarioParameters = fetchScenarioParameters;
  }


  public RunTemplate applyParameters(Boolean applyParameters) {
    
    this.applyParameters = applyParameters;
    return this;
  }

   /**
   * whether or not the apply parameter step is done
   * @return applyParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "whether or not the apply parameter step is done")

  public Boolean getApplyParameters() {
    return applyParameters;
  }


  public void setApplyParameters(Boolean applyParameters) {
    this.applyParameters = applyParameters;
  }


  public RunTemplate validateData(Boolean validateData) {
    
    this.validateData = validateData;
    return this;
  }

   /**
   * whether or not the validate step is done
   * @return validateData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "whether or not the validate step is done")

  public Boolean getValidateData() {
    return validateData;
  }


  public void setValidateData(Boolean validateData) {
    this.validateData = validateData;
  }


  public RunTemplate sendDatasetsToDataWarehouse(Boolean sendDatasetsToDataWarehouse) {
    
    this.sendDatasetsToDataWarehouse = sendDatasetsToDataWarehouse;
    return this;
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


  public void setSendDatasetsToDataWarehouse(Boolean sendDatasetsToDataWarehouse) {
    this.sendDatasetsToDataWarehouse = sendDatasetsToDataWarehouse;
  }


  public RunTemplate sendInputParametersToDataWarehouse(Boolean sendInputParametersToDataWarehouse) {
    
    this.sendInputParametersToDataWarehouse = sendInputParametersToDataWarehouse;
    return this;
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


  public void setSendInputParametersToDataWarehouse(Boolean sendInputParametersToDataWarehouse) {
    this.sendInputParametersToDataWarehouse = sendInputParametersToDataWarehouse;
  }


  public RunTemplate preRun(Boolean preRun) {
    
    this.preRun = preRun;
    return this;
  }

   /**
   * whether or not the pre-run step is done
   * @return preRun
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "whether or not the pre-run step is done")

  public Boolean getPreRun() {
    return preRun;
  }


  public void setPreRun(Boolean preRun) {
    this.preRun = preRun;
  }


  public RunTemplate run(Boolean run) {
    
    this.run = run;
    return this;
  }

   /**
   * whether or not the run step is done
   * @return run
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "whether or not the run step is done")

  public Boolean getRun() {
    return run;
  }


  public void setRun(Boolean run) {
    this.run = run;
  }


  public RunTemplate postRun(Boolean postRun) {
    
    this.postRun = postRun;
    return this;
  }

   /**
   * whether or not the post-run step is done
   * @return postRun
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "whether or not the post-run step is done")

  public Boolean getPostRun() {
    return postRun;
  }


  public void setPostRun(Boolean postRun) {
    this.postRun = postRun;
  }


  public RunTemplate parametersJson(Boolean parametersJson) {
    
    this.parametersJson = parametersJson;
    return this;
  }

   /**
   * whether or not to store the scenario parameters in json instead of csv
   * @return parametersJson
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "whether or not to store the scenario parameters in json instead of csv")

  public Boolean getParametersJson() {
    return parametersJson;
  }


  public void setParametersJson(Boolean parametersJson) {
    this.parametersJson = parametersJson;
  }


  public RunTemplate parametersHandlerSource(RunTemplateStepSource parametersHandlerSource) {
    
    this.parametersHandlerSource = parametersHandlerSource;
    return this;
  }

   /**
   * Get parametersHandlerSource
   * @return parametersHandlerSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RunTemplateStepSource getParametersHandlerSource() {
    return parametersHandlerSource;
  }


  public void setParametersHandlerSource(RunTemplateStepSource parametersHandlerSource) {
    this.parametersHandlerSource = parametersHandlerSource;
  }


  public RunTemplate datasetValidatorSource(RunTemplateStepSource datasetValidatorSource) {
    
    this.datasetValidatorSource = datasetValidatorSource;
    return this;
  }

   /**
   * Get datasetValidatorSource
   * @return datasetValidatorSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RunTemplateStepSource getDatasetValidatorSource() {
    return datasetValidatorSource;
  }


  public void setDatasetValidatorSource(RunTemplateStepSource datasetValidatorSource) {
    this.datasetValidatorSource = datasetValidatorSource;
  }


  public RunTemplate preRunSource(RunTemplateStepSource preRunSource) {
    
    this.preRunSource = preRunSource;
    return this;
  }

   /**
   * Get preRunSource
   * @return preRunSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RunTemplateStepSource getPreRunSource() {
    return preRunSource;
  }


  public void setPreRunSource(RunTemplateStepSource preRunSource) {
    this.preRunSource = preRunSource;
  }


  public RunTemplate runSource(RunTemplateStepSource runSource) {
    
    this.runSource = runSource;
    return this;
  }

   /**
   * Get runSource
   * @return runSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RunTemplateStepSource getRunSource() {
    return runSource;
  }


  public void setRunSource(RunTemplateStepSource runSource) {
    this.runSource = runSource;
  }


  public RunTemplate postRunSource(RunTemplateStepSource postRunSource) {
    
    this.postRunSource = postRunSource;
    return this;
  }

   /**
   * Get postRunSource
   * @return postRunSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RunTemplateStepSource getPostRunSource() {
    return postRunSource;
  }


  public void setPostRunSource(RunTemplateStepSource postRunSource) {
    this.postRunSource = postRunSource;
  }


  public RunTemplate scenariodataTransformSource(RunTemplateStepSource scenariodataTransformSource) {
    
    this.scenariodataTransformSource = scenariodataTransformSource;
    return this;
  }

   /**
   * Get scenariodataTransformSource
   * @return scenariodataTransformSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RunTemplateStepSource getScenariodataTransformSource() {
    return scenariodataTransformSource;
  }


  public void setScenariodataTransformSource(RunTemplateStepSource scenariodataTransformSource) {
    this.scenariodataTransformSource = scenariodataTransformSource;
  }


  public RunTemplate parameterGroups(List<String> parameterGroups) {
    
    this.parameterGroups = parameterGroups;
    return this;
  }

  public RunTemplate addParameterGroupsItem(String parameterGroupsItem) {
    if (this.parameterGroups == null) {
      this.parameterGroups = new ArrayList<String>();
    }
    this.parameterGroups.add(parameterGroupsItem);
    return this;
  }

   /**
   * the ordered list of parameters groups for the Run Template
   * @return parameterGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the ordered list of parameters groups for the Run Template")

  public List<String> getParameterGroups() {
    return parameterGroups;
  }


  public void setParameterGroups(List<String> parameterGroups) {
    this.parameterGroups = parameterGroups;
  }


  public RunTemplate stackSteps(Boolean stackSteps) {
    
    this.stackSteps = stackSteps;
    return this;
  }

   /**
   * whether or not to stack adjacent scenario run steps in one container run which will chain steps
   * @return stackSteps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "whether or not to stack adjacent scenario run steps in one container run which will chain steps")

  public Boolean getStackSteps() {
    return stackSteps;
  }


  public void setStackSteps(Boolean stackSteps) {
    this.stackSteps = stackSteps;
  }


  public RunTemplate gitRepositoryUrl(String gitRepositoryUrl) {
    
    this.gitRepositoryUrl = gitRepositoryUrl;
    return this;
  }

   /**
   * an optional URL to the git repository
   * @return gitRepositoryUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "an optional URL to the git repository")

  public String getGitRepositoryUrl() {
    return gitRepositoryUrl;
  }


  public void setGitRepositoryUrl(String gitRepositoryUrl) {
    this.gitRepositoryUrl = gitRepositoryUrl;
  }


  public RunTemplate gitBranchName(String gitBranchName) {
    
    this.gitBranchName = gitBranchName;
    return this;
  }

   /**
   * an optional git branch name
   * @return gitBranchName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "an optional git branch name")

  public String getGitBranchName() {
    return gitBranchName;
  }


  public void setGitBranchName(String gitBranchName) {
    this.gitBranchName = gitBranchName;
  }


  public RunTemplate runTemplateSourceDir(String runTemplateSourceDir) {
    
    this.runTemplateSourceDir = runTemplateSourceDir;
    return this;
  }

   /**
   * an optional directory where to find the run template source
   * @return runTemplateSourceDir
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "an optional directory where to find the run template source")

  public String getRunTemplateSourceDir() {
    return runTemplateSourceDir;
  }


  public void setRunTemplateSourceDir(String runTemplateSourceDir) {
    this.runTemplateSourceDir = runTemplateSourceDir;
  }


  public RunTemplate orchestratorType(RunTemplateOrchestrator orchestratorType) {
    
    this.orchestratorType = orchestratorType;
    return this;
  }

   /**
   * Get orchestratorType
   * @return orchestratorType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RunTemplateOrchestrator getOrchestratorType() {
    return orchestratorType;
  }


  public void setOrchestratorType(RunTemplateOrchestrator orchestratorType) {
    this.orchestratorType = orchestratorType;
  }


  public RunTemplate executionTimeout(Integer executionTimeout) {
    
    this.executionTimeout = executionTimeout;
    return this;
  }

   /**
   * an optional duration in seconds in which a workflow is allowed to run
   * @return executionTimeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "an optional duration in seconds in which a workflow is allowed to run")

  public Integer getExecutionTimeout() {
    return executionTimeout;
  }


  public void setExecutionTimeout(Integer executionTimeout) {
    this.executionTimeout = executionTimeout;
  }


  public RunTemplate deleteHistoricalData(DeleteHistoricalData deleteHistoricalData) {
    
    this.deleteHistoricalData = deleteHistoricalData;
    return this;
  }

   /**
   * Get deleteHistoricalData
   * @return deleteHistoricalData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeleteHistoricalData getDeleteHistoricalData() {
    return deleteHistoricalData;
  }


  public void setDeleteHistoricalData(DeleteHistoricalData deleteHistoricalData) {
    this.deleteHistoricalData = deleteHistoricalData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunTemplate runTemplate = (RunTemplate) o;
    return Objects.equals(this.id, runTemplate.id) &&
        Objects.equals(this.name, runTemplate.name) &&
        Objects.equals(this.labels, runTemplate.labels) &&
        Objects.equals(this.description, runTemplate.description) &&
        Objects.equals(this.csmSimulation, runTemplate.csmSimulation) &&
        Objects.equals(this.tags, runTemplate.tags) &&
        Objects.equals(this.computeSize, runTemplate.computeSize) &&
        Objects.equals(this.runSizing, runTemplate.runSizing) &&
        Objects.equals(this.noDataIngestionState, runTemplate.noDataIngestionState) &&
        Objects.equals(this.fetchDatasets, runTemplate.fetchDatasets) &&
        Objects.equals(this.scenarioDataDownloadTransform, runTemplate.scenarioDataDownloadTransform) &&
        Objects.equals(this.fetchScenarioParameters, runTemplate.fetchScenarioParameters) &&
        Objects.equals(this.applyParameters, runTemplate.applyParameters) &&
        Objects.equals(this.validateData, runTemplate.validateData) &&
        Objects.equals(this.sendDatasetsToDataWarehouse, runTemplate.sendDatasetsToDataWarehouse) &&
        Objects.equals(this.sendInputParametersToDataWarehouse, runTemplate.sendInputParametersToDataWarehouse) &&
        Objects.equals(this.preRun, runTemplate.preRun) &&
        Objects.equals(this.run, runTemplate.run) &&
        Objects.equals(this.postRun, runTemplate.postRun) &&
        Objects.equals(this.parametersJson, runTemplate.parametersJson) &&
        Objects.equals(this.parametersHandlerSource, runTemplate.parametersHandlerSource) &&
        Objects.equals(this.datasetValidatorSource, runTemplate.datasetValidatorSource) &&
        Objects.equals(this.preRunSource, runTemplate.preRunSource) &&
        Objects.equals(this.runSource, runTemplate.runSource) &&
        Objects.equals(this.postRunSource, runTemplate.postRunSource) &&
        Objects.equals(this.scenariodataTransformSource, runTemplate.scenariodataTransformSource) &&
        Objects.equals(this.parameterGroups, runTemplate.parameterGroups) &&
        Objects.equals(this.stackSteps, runTemplate.stackSteps) &&
        Objects.equals(this.gitRepositoryUrl, runTemplate.gitRepositoryUrl) &&
        Objects.equals(this.gitBranchName, runTemplate.gitBranchName) &&
        Objects.equals(this.runTemplateSourceDir, runTemplate.runTemplateSourceDir) &&
        Objects.equals(this.orchestratorType, runTemplate.orchestratorType) &&
        Objects.equals(this.executionTimeout, runTemplate.executionTimeout) &&
        Objects.equals(this.deleteHistoricalData, runTemplate.deleteHistoricalData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, labels, description, csmSimulation, tags, computeSize, runSizing, noDataIngestionState, fetchDatasets, scenarioDataDownloadTransform, fetchScenarioParameters, applyParameters, validateData, sendDatasetsToDataWarehouse, sendInputParametersToDataWarehouse, preRun, run, postRun, parametersJson, parametersHandlerSource, datasetValidatorSource, preRunSource, runSource, postRunSource, scenariodataTransformSource, parameterGroups, stackSteps, gitRepositoryUrl, gitBranchName, runTemplateSourceDir, orchestratorType, executionTimeout, deleteHistoricalData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunTemplate {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    csmSimulation: ").append(toIndentedString(csmSimulation)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    computeSize: ").append(toIndentedString(computeSize)).append("\n");
    sb.append("    runSizing: ").append(toIndentedString(runSizing)).append("\n");
    sb.append("    noDataIngestionState: ").append(toIndentedString(noDataIngestionState)).append("\n");
    sb.append("    fetchDatasets: ").append(toIndentedString(fetchDatasets)).append("\n");
    sb.append("    scenarioDataDownloadTransform: ").append(toIndentedString(scenarioDataDownloadTransform)).append("\n");
    sb.append("    fetchScenarioParameters: ").append(toIndentedString(fetchScenarioParameters)).append("\n");
    sb.append("    applyParameters: ").append(toIndentedString(applyParameters)).append("\n");
    sb.append("    validateData: ").append(toIndentedString(validateData)).append("\n");
    sb.append("    sendDatasetsToDataWarehouse: ").append(toIndentedString(sendDatasetsToDataWarehouse)).append("\n");
    sb.append("    sendInputParametersToDataWarehouse: ").append(toIndentedString(sendInputParametersToDataWarehouse)).append("\n");
    sb.append("    preRun: ").append(toIndentedString(preRun)).append("\n");
    sb.append("    run: ").append(toIndentedString(run)).append("\n");
    sb.append("    postRun: ").append(toIndentedString(postRun)).append("\n");
    sb.append("    parametersJson: ").append(toIndentedString(parametersJson)).append("\n");
    sb.append("    parametersHandlerSource: ").append(toIndentedString(parametersHandlerSource)).append("\n");
    sb.append("    datasetValidatorSource: ").append(toIndentedString(datasetValidatorSource)).append("\n");
    sb.append("    preRunSource: ").append(toIndentedString(preRunSource)).append("\n");
    sb.append("    runSource: ").append(toIndentedString(runSource)).append("\n");
    sb.append("    postRunSource: ").append(toIndentedString(postRunSource)).append("\n");
    sb.append("    scenariodataTransformSource: ").append(toIndentedString(scenariodataTransformSource)).append("\n");
    sb.append("    parameterGroups: ").append(toIndentedString(parameterGroups)).append("\n");
    sb.append("    stackSteps: ").append(toIndentedString(stackSteps)).append("\n");
    sb.append("    gitRepositoryUrl: ").append(toIndentedString(gitRepositoryUrl)).append("\n");
    sb.append("    gitBranchName: ").append(toIndentedString(gitBranchName)).append("\n");
    sb.append("    runTemplateSourceDir: ").append(toIndentedString(runTemplateSourceDir)).append("\n");
    sb.append("    orchestratorType: ").append(toIndentedString(orchestratorType)).append("\n");
    sb.append("    executionTimeout: ").append(toIndentedString(executionTimeout)).append("\n");
    sb.append("    deleteHistoricalData: ").append(toIndentedString(deleteHistoricalData)).append("\n");
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

