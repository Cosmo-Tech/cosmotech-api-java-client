/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.1.1-dev
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RunnerLastRun
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-29T14:34:52.169383607Z[Etc/UTC]")
public class RunnerLastRun {
  public static final String SERIALIZED_NAME_RUNNER_RUN_ID = "runnerRunId";
  @SerializedName(SERIALIZED_NAME_RUNNER_RUN_ID)
  private String runnerRunId;

  public static final String SERIALIZED_NAME_CSM_SIMULATION_RUN = "csmSimulationRun";
  @SerializedName(SERIALIZED_NAME_CSM_SIMULATION_RUN)
  private String csmSimulationRun;

  public static final String SERIALIZED_NAME_WORKFLOW_ID = "workflowId";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_ID)
  private String workflowId;

  public static final String SERIALIZED_NAME_WORKFLOW_NAME = "workflowName";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_NAME)
  private String workflowName;

  public RunnerLastRun() { 
  }

  public RunnerLastRun runnerRunId(String runnerRunId) {
    
    this.runnerRunId = runnerRunId;
    return this;
  }

   /**
   * the last Runner Run id
   * @return runnerRunId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the last Runner Run id")

  public String getRunnerRunId() {
    return runnerRunId;
  }


  public void setRunnerRunId(String runnerRunId) {
    this.runnerRunId = runnerRunId;
  }


  public RunnerLastRun csmSimulationRun(String csmSimulationRun) {
    
    this.csmSimulationRun = csmSimulationRun;
    return this;
  }

   /**
   * the last Cosmo Tech Simulation Run id
   * @return csmSimulationRun
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the last Cosmo Tech Simulation Run id")

  public String getCsmSimulationRun() {
    return csmSimulationRun;
  }


  public void setCsmSimulationRun(String csmSimulationRun) {
    this.csmSimulationRun = csmSimulationRun;
  }


  public RunnerLastRun workflowId(String workflowId) {
    
    this.workflowId = workflowId;
    return this;
  }

   /**
   * the last Workflow Id
   * @return workflowId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the last Workflow Id")

  public String getWorkflowId() {
    return workflowId;
  }


  public void setWorkflowId(String workflowId) {
    this.workflowId = workflowId;
  }


  public RunnerLastRun workflowName(String workflowName) {
    
    this.workflowName = workflowName;
    return this;
  }

   /**
   * the last Workflow name
   * @return workflowName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the last Workflow name")

  public String getWorkflowName() {
    return workflowName;
  }


  public void setWorkflowName(String workflowName) {
    this.workflowName = workflowName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunnerLastRun runnerLastRun = (RunnerLastRun) o;
    return Objects.equals(this.runnerRunId, runnerLastRun.runnerRunId) &&
        Objects.equals(this.csmSimulationRun, runnerLastRun.csmSimulationRun) &&
        Objects.equals(this.workflowId, runnerLastRun.workflowId) &&
        Objects.equals(this.workflowName, runnerLastRun.workflowName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runnerRunId, csmSimulationRun, workflowId, workflowName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunnerLastRun {\n");
    sb.append("    runnerRunId: ").append(toIndentedString(runnerRunId)).append("\n");
    sb.append("    csmSimulationRun: ").append(toIndentedString(csmSimulationRun)).append("\n");
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
    sb.append("    workflowName: ").append(toIndentedString(workflowName)).append("\n");
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

