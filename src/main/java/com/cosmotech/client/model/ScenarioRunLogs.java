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
import com.cosmotech.client.model.ScenarioRunContainerLogs;
import com.cosmotech.client.model.ScenarioRunLogsOptions;
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
 * the scenariorun logs returned by all containers
 */
@ApiModel(description = "the scenariorun logs returned by all containers")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-22T12:27:09.848905+02:00[Europe/Paris]")
public class ScenarioRunLogs {
  public static final String SERIALIZED_NAME_SCENARIORUN_ID = "scenariorunId";
  @SerializedName(SERIALIZED_NAME_SCENARIORUN_ID)
  private String scenariorunId;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private ScenarioRunLogsOptions options;

  public static final String SERIALIZED_NAME_FETCH_DATASET_LOGS = "fetchDatasetLogs";
  @SerializedName(SERIALIZED_NAME_FETCH_DATASET_LOGS)
  private List<ScenarioRunContainerLogs> fetchDatasetLogs = null;

  public static final String SERIALIZED_NAME_FETCH_SCENARIO_PARAMETERS_LOG = "fetchScenarioParametersLog";
  @SerializedName(SERIALIZED_NAME_FETCH_SCENARIO_PARAMETERS_LOG)
  private ScenarioRunContainerLogs fetchScenarioParametersLog;

  public static final String SERIALIZED_NAME_APPLY_PARAMETERS_LOGS = "applyParametersLogs";
  @SerializedName(SERIALIZED_NAME_APPLY_PARAMETERS_LOGS)
  private ScenarioRunContainerLogs applyParametersLogs;

  public static final String SERIALIZED_NAME_VALIDATE_DATA_LOGS = "validateDataLogs";
  @SerializedName(SERIALIZED_NAME_VALIDATE_DATA_LOGS)
  private ScenarioRunContainerLogs validateDataLogs;

  public static final String SERIALIZED_NAME_SEND_DATA_WAREHOUSE_LOGS = "sendDataWarehouseLogs";
  @SerializedName(SERIALIZED_NAME_SEND_DATA_WAREHOUSE_LOGS)
  private ScenarioRunContainerLogs sendDataWarehouseLogs;

  public static final String SERIALIZED_NAME_PRE_RUN_LOGS = "preRunLogs";
  @SerializedName(SERIALIZED_NAME_PRE_RUN_LOGS)
  private ScenarioRunContainerLogs preRunLogs;

  public static final String SERIALIZED_NAME_RUN_LOGS = "runLogs";
  @SerializedName(SERIALIZED_NAME_RUN_LOGS)
  private ScenarioRunContainerLogs runLogs;

  public static final String SERIALIZED_NAME_POST_RUN_LOGS = "postRunLogs";
  @SerializedName(SERIALIZED_NAME_POST_RUN_LOGS)
  private ScenarioRunContainerLogs postRunLogs;


   /**
   * the ScenarioRun Id
   * @return scenariorunId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the ScenarioRun Id")

  public String getScenariorunId() {
    return scenariorunId;
  }




  public ScenarioRunLogs options(ScenarioRunLogsOptions options) {
    
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScenarioRunLogsOptions getOptions() {
    return options;
  }


  public void setOptions(ScenarioRunLogsOptions options) {
    this.options = options;
  }


   /**
   * logs for the containers which fetch the Scenario Datasets
   * @return fetchDatasetLogs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "logs for the containers which fetch the Scenario Datasets")

  public List<ScenarioRunContainerLogs> getFetchDatasetLogs() {
    return fetchDatasetLogs;
  }




  public ScenarioRunLogs fetchScenarioParametersLog(ScenarioRunContainerLogs fetchScenarioParametersLog) {
    
    this.fetchScenarioParametersLog = fetchScenarioParametersLog;
    return this;
  }

   /**
   * Get fetchScenarioParametersLog
   * @return fetchScenarioParametersLog
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScenarioRunContainerLogs getFetchScenarioParametersLog() {
    return fetchScenarioParametersLog;
  }


  public void setFetchScenarioParametersLog(ScenarioRunContainerLogs fetchScenarioParametersLog) {
    this.fetchScenarioParametersLog = fetchScenarioParametersLog;
  }


  public ScenarioRunLogs applyParametersLogs(ScenarioRunContainerLogs applyParametersLogs) {
    
    this.applyParametersLogs = applyParametersLogs;
    return this;
  }

   /**
   * Get applyParametersLogs
   * @return applyParametersLogs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScenarioRunContainerLogs getApplyParametersLogs() {
    return applyParametersLogs;
  }


  public void setApplyParametersLogs(ScenarioRunContainerLogs applyParametersLogs) {
    this.applyParametersLogs = applyParametersLogs;
  }


  public ScenarioRunLogs validateDataLogs(ScenarioRunContainerLogs validateDataLogs) {
    
    this.validateDataLogs = validateDataLogs;
    return this;
  }

   /**
   * Get validateDataLogs
   * @return validateDataLogs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScenarioRunContainerLogs getValidateDataLogs() {
    return validateDataLogs;
  }


  public void setValidateDataLogs(ScenarioRunContainerLogs validateDataLogs) {
    this.validateDataLogs = validateDataLogs;
  }


  public ScenarioRunLogs sendDataWarehouseLogs(ScenarioRunContainerLogs sendDataWarehouseLogs) {
    
    this.sendDataWarehouseLogs = sendDataWarehouseLogs;
    return this;
  }

   /**
   * Get sendDataWarehouseLogs
   * @return sendDataWarehouseLogs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScenarioRunContainerLogs getSendDataWarehouseLogs() {
    return sendDataWarehouseLogs;
  }


  public void setSendDataWarehouseLogs(ScenarioRunContainerLogs sendDataWarehouseLogs) {
    this.sendDataWarehouseLogs = sendDataWarehouseLogs;
  }


  public ScenarioRunLogs preRunLogs(ScenarioRunContainerLogs preRunLogs) {
    
    this.preRunLogs = preRunLogs;
    return this;
  }

   /**
   * Get preRunLogs
   * @return preRunLogs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScenarioRunContainerLogs getPreRunLogs() {
    return preRunLogs;
  }


  public void setPreRunLogs(ScenarioRunContainerLogs preRunLogs) {
    this.preRunLogs = preRunLogs;
  }


  public ScenarioRunLogs runLogs(ScenarioRunContainerLogs runLogs) {
    
    this.runLogs = runLogs;
    return this;
  }

   /**
   * Get runLogs
   * @return runLogs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScenarioRunContainerLogs getRunLogs() {
    return runLogs;
  }


  public void setRunLogs(ScenarioRunContainerLogs runLogs) {
    this.runLogs = runLogs;
  }


  public ScenarioRunLogs postRunLogs(ScenarioRunContainerLogs postRunLogs) {
    
    this.postRunLogs = postRunLogs;
    return this;
  }

   /**
   * Get postRunLogs
   * @return postRunLogs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScenarioRunContainerLogs getPostRunLogs() {
    return postRunLogs;
  }


  public void setPostRunLogs(ScenarioRunContainerLogs postRunLogs) {
    this.postRunLogs = postRunLogs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScenarioRunLogs scenarioRunLogs = (ScenarioRunLogs) o;
    return Objects.equals(this.scenariorunId, scenarioRunLogs.scenariorunId) &&
        Objects.equals(this.options, scenarioRunLogs.options) &&
        Objects.equals(this.fetchDatasetLogs, scenarioRunLogs.fetchDatasetLogs) &&
        Objects.equals(this.fetchScenarioParametersLog, scenarioRunLogs.fetchScenarioParametersLog) &&
        Objects.equals(this.applyParametersLogs, scenarioRunLogs.applyParametersLogs) &&
        Objects.equals(this.validateDataLogs, scenarioRunLogs.validateDataLogs) &&
        Objects.equals(this.sendDataWarehouseLogs, scenarioRunLogs.sendDataWarehouseLogs) &&
        Objects.equals(this.preRunLogs, scenarioRunLogs.preRunLogs) &&
        Objects.equals(this.runLogs, scenarioRunLogs.runLogs) &&
        Objects.equals(this.postRunLogs, scenarioRunLogs.postRunLogs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scenariorunId, options, fetchDatasetLogs, fetchScenarioParametersLog, applyParametersLogs, validateDataLogs, sendDataWarehouseLogs, preRunLogs, runLogs, postRunLogs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScenarioRunLogs {\n");
    sb.append("    scenariorunId: ").append(toIndentedString(scenariorunId)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    fetchDatasetLogs: ").append(toIndentedString(fetchDatasetLogs)).append("\n");
    sb.append("    fetchScenarioParametersLog: ").append(toIndentedString(fetchScenarioParametersLog)).append("\n");
    sb.append("    applyParametersLogs: ").append(toIndentedString(applyParametersLogs)).append("\n");
    sb.append("    validateDataLogs: ").append(toIndentedString(validateDataLogs)).append("\n");
    sb.append("    sendDataWarehouseLogs: ").append(toIndentedString(sendDataWarehouseLogs)).append("\n");
    sb.append("    preRunLogs: ").append(toIndentedString(preRunLogs)).append("\n");
    sb.append("    runLogs: ").append(toIndentedString(runLogs)).append("\n");
    sb.append("    postRunLogs: ").append(toIndentedString(postRunLogs)).append("\n");
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

