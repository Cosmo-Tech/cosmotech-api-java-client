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
 * a ScenarioRun with only base properties
 */
@ApiModel(description = "a ScenarioRun with only base properties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-20T11:19:04.423677+02:00[Europe/Paris]")
public class ScenarioRunBase {
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

  public String getState() {
    return state;
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




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScenarioRunBase scenarioRunBase = (ScenarioRunBase) o;
    return Objects.equals(this.id, scenarioRunBase.id) &&
        Objects.equals(this.jobId, scenarioRunBase.jobId) &&
        Objects.equals(this.ownerId, scenarioRunBase.ownerId) &&
        Objects.equals(this.workspaceId, scenarioRunBase.workspaceId) &&
        Objects.equals(this.workspaceName, scenarioRunBase.workspaceName) &&
        Objects.equals(this.scenarioId, scenarioRunBase.scenarioId) &&
        Objects.equals(this.scenarioName, scenarioRunBase.scenarioName) &&
        Objects.equals(this.solutionId, scenarioRunBase.solutionId) &&
        Objects.equals(this.solutionName, scenarioRunBase.solutionName) &&
        Objects.equals(this.solutionVersion, scenarioRunBase.solutionVersion) &&
        Objects.equals(this.runTemplateId, scenarioRunBase.runTemplateId) &&
        Objects.equals(this.runTemplateName, scenarioRunBase.runTemplateName) &&
        Objects.equals(this.computeSize, scenarioRunBase.computeSize) &&
        Objects.equals(this.state, scenarioRunBase.state) &&
        Objects.equals(this.startTime, scenarioRunBase.startTime) &&
        Objects.equals(this.endTime, scenarioRunBase.endTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, jobId, ownerId, workspaceId, workspaceName, scenarioId, scenarioName, solutionId, solutionName, solutionVersion, runTemplateId, runTemplateName, computeSize, state, startTime, endTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScenarioRunBase {\n");
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

