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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * the search options
 */
@ApiModel(description = "the search options")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-15T18:07:38.724376+02:00[Europe/Paris]")
public class SimulationSearch {
  public static final String SERIALIZED_NAME_SIMULATOR_ID = "simulatorId";
  @SerializedName(SERIALIZED_NAME_SIMULATOR_ID)
  private String simulatorId;

  public static final String SERIALIZED_NAME_SIMULATOR_ANALYSIS_ID = "simulatorAnalysisId";
  @SerializedName(SERIALIZED_NAME_SIMULATOR_ANALYSIS_ID)
  private String simulatorAnalysisId;

  public static final String SERIALIZED_NAME_WORKSPACE_ID = "workspaceId";
  @SerializedName(SERIALIZED_NAME_WORKSPACE_ID)
  private String workspaceId;

  public static final String SERIALIZED_NAME_SCENARIO_ID = "scenarioId";
  @SerializedName(SERIALIZED_NAME_SCENARIO_ID)
  private String scenarioId;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_JOB_ID = "jobId";
  @SerializedName(SERIALIZED_NAME_JOB_ID)
  private String jobId;

  public static final String SERIALIZED_NAME_OWNER_ID = "ownerId";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;


  public SimulationSearch simulatorId(String simulatorId) {
    
    this.simulatorId = simulatorId;
    return this;
  }

   /**
   * the Simulator Id to search
   * @return simulatorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Simulator Id to search")

  public String getSimulatorId() {
    return simulatorId;
  }


  public void setSimulatorId(String simulatorId) {
    this.simulatorId = simulatorId;
  }


  public SimulationSearch simulatorAnalysisId(String simulatorAnalysisId) {
    
    this.simulatorAnalysisId = simulatorAnalysisId;
    return this;
  }

   /**
   * the Simulator Analysis Id to search
   * @return simulatorAnalysisId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Simulator Analysis Id to search")

  public String getSimulatorAnalysisId() {
    return simulatorAnalysisId;
  }


  public void setSimulatorAnalysisId(String simulatorAnalysisId) {
    this.simulatorAnalysisId = simulatorAnalysisId;
  }


  public SimulationSearch workspaceId(String workspaceId) {
    
    this.workspaceId = workspaceId;
    return this;
  }

   /**
   * the Workspace Id to search
   * @return workspaceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Workspace Id to search")

  public String getWorkspaceId() {
    return workspaceId;
  }


  public void setWorkspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
  }


  public SimulationSearch scenarioId(String scenarioId) {
    
    this.scenarioId = scenarioId;
    return this;
  }

   /**
   * the Scenario Id to search
   * @return scenarioId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Scenario Id to search")

  public String getScenarioId() {
    return scenarioId;
  }


  public void setScenarioId(String scenarioId) {
    this.scenarioId = scenarioId;
  }


  public SimulationSearch state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * the state to search
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the state to search")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public SimulationSearch jobId(String jobId) {
    
    this.jobId = jobId;
    return this;
  }

   /**
   * the Cosmo Tech compute cluster Job Id to search
   * @return jobId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Cosmo Tech compute cluster Job Id to search")

  public String getJobId() {
    return jobId;
  }


  public void setJobId(String jobId) {
    this.jobId = jobId;
  }


  public SimulationSearch ownerId(String ownerId) {
    
    this.ownerId = ownerId;
    return this;
  }

   /**
   * the owner Id to search
   * @return ownerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the owner Id to search")

  public String getOwnerId() {
    return ownerId;
  }


  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimulationSearch simulationSearch = (SimulationSearch) o;
    return Objects.equals(this.simulatorId, simulationSearch.simulatorId) &&
        Objects.equals(this.simulatorAnalysisId, simulationSearch.simulatorAnalysisId) &&
        Objects.equals(this.workspaceId, simulationSearch.workspaceId) &&
        Objects.equals(this.scenarioId, simulationSearch.scenarioId) &&
        Objects.equals(this.state, simulationSearch.state) &&
        Objects.equals(this.jobId, simulationSearch.jobId) &&
        Objects.equals(this.ownerId, simulationSearch.ownerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(simulatorId, simulatorAnalysisId, workspaceId, scenarioId, state, jobId, ownerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimulationSearch {\n");
    sb.append("    simulatorId: ").append(toIndentedString(simulatorId)).append("\n");
    sb.append("    simulatorAnalysisId: ").append(toIndentedString(simulatorAnalysisId)).append("\n");
    sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
    sb.append("    scenarioId: ").append(toIndentedString(scenarioId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
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

