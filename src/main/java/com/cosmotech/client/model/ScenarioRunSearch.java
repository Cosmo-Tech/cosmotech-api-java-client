/*
 * Cosmo Tech Plaform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 0.0.8-SNAPSHOT
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
 * the search options
 */
@ApiModel(description = "the search options")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-30T20:18:00.551525359Z[Etc/UTC]")
public class ScenarioRunSearch {
  public static final String SERIALIZED_NAME_SOLUTION_ID = "solutionId";
  @SerializedName(SERIALIZED_NAME_SOLUTION_ID)
  private String solutionId;

  public static final String SERIALIZED_NAME_RUN_TEMPLATE_ID = "runTemplateId";
  @SerializedName(SERIALIZED_NAME_RUN_TEMPLATE_ID)
  private String runTemplateId;

  public static final String SERIALIZED_NAME_WORKSPACE_ID = "workspaceId";
  @SerializedName(SERIALIZED_NAME_WORKSPACE_ID)
  private String workspaceId;

  public static final String SERIALIZED_NAME_SCENARIO_ID = "scenarioId";
  @SerializedName(SERIALIZED_NAME_SCENARIO_ID)
  private String scenarioId;

  /**
   * the state to search
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

  public static final String SERIALIZED_NAME_WORKFLOW_ID = "workflowId";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_ID)
  private String workflowId;

  public static final String SERIALIZED_NAME_WORKFLOW_NAME = "workflowName";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_NAME)
  private String workflowName;

  public static final String SERIALIZED_NAME_OWNER_ID = "ownerId";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;


  public ScenarioRunSearch solutionId(String solutionId) {
    
    this.solutionId = solutionId;
    return this;
  }

   /**
   * the Solution Id to search
   * @return solutionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Solution Id to search")

  public String getSolutionId() {
    return solutionId;
  }


  public void setSolutionId(String solutionId) {
    this.solutionId = solutionId;
  }


  public ScenarioRunSearch runTemplateId(String runTemplateId) {
    
    this.runTemplateId = runTemplateId;
    return this;
  }

   /**
   * the Solution Analysis Id to search
   * @return runTemplateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Solution Analysis Id to search")

  public String getRunTemplateId() {
    return runTemplateId;
  }


  public void setRunTemplateId(String runTemplateId) {
    this.runTemplateId = runTemplateId;
  }


  public ScenarioRunSearch workspaceId(String workspaceId) {
    
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


  public ScenarioRunSearch scenarioId(String scenarioId) {
    
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


  public ScenarioRunSearch state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * the state to search
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the state to search")

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public ScenarioRunSearch workflowId(String workflowId) {
    
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


  public ScenarioRunSearch workflowName(String workflowName) {
    
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


  public ScenarioRunSearch ownerId(String ownerId) {
    
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
    ScenarioRunSearch scenarioRunSearch = (ScenarioRunSearch) o;
    return Objects.equals(this.solutionId, scenarioRunSearch.solutionId) &&
        Objects.equals(this.runTemplateId, scenarioRunSearch.runTemplateId) &&
        Objects.equals(this.workspaceId, scenarioRunSearch.workspaceId) &&
        Objects.equals(this.scenarioId, scenarioRunSearch.scenarioId) &&
        Objects.equals(this.state, scenarioRunSearch.state) &&
        Objects.equals(this.workflowId, scenarioRunSearch.workflowId) &&
        Objects.equals(this.workflowName, scenarioRunSearch.workflowName) &&
        Objects.equals(this.ownerId, scenarioRunSearch.ownerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(solutionId, runTemplateId, workspaceId, scenarioId, state, workflowId, workflowName, ownerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScenarioRunSearch {\n");
    sb.append("    solutionId: ").append(toIndentedString(solutionId)).append("\n");
    sb.append("    runTemplateId: ").append(toIndentedString(runTemplateId)).append("\n");
    sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
    sb.append("    scenarioId: ").append(toIndentedString(scenarioId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
    sb.append("    workflowName: ").append(toIndentedString(workflowName)).append("\n");
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

