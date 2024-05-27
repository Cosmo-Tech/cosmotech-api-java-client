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
import com.cosmotech.client.model.ScenarioRunSearchState;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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
 * the search options
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T14:49:20.767524956Z[Etc/UTC]")
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

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private ScenarioRunSearchState state;

  public static final String SERIALIZED_NAME_WORKFLOW_ID = "workflowId";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_ID)
  private String workflowId;

  public static final String SERIALIZED_NAME_WORKFLOW_NAME = "workflowName";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_NAME)
  private String workflowName;

  public static final String SERIALIZED_NAME_OWNER_ID = "ownerId";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  public ScenarioRunSearch() {
  }

  public ScenarioRunSearch solutionId(String solutionId) {
    this.solutionId = solutionId;
    return this;
  }

   /**
   * the Solution Id to search
   * @return solutionId
  **/
  @javax.annotation.Nullable
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
  public String getScenarioId() {
    return scenarioId;
  }

  public void setScenarioId(String scenarioId) {
    this.scenarioId = scenarioId;
  }


  public ScenarioRunSearch state(ScenarioRunSearchState state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  public ScenarioRunSearchState getState() {
    return state;
  }

  public void setState(ScenarioRunSearchState state) {
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("solutionId");
    openapiFields.add("runTemplateId");
    openapiFields.add("workspaceId");
    openapiFields.add("scenarioId");
    openapiFields.add("state");
    openapiFields.add("workflowId");
    openapiFields.add("workflowName");
    openapiFields.add("ownerId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ScenarioRunSearch
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ScenarioRunSearch.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ScenarioRunSearch is not found in the empty JSON string", ScenarioRunSearch.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ScenarioRunSearch.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ScenarioRunSearch` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("solutionId") != null && !jsonObj.get("solutionId").isJsonNull()) && !jsonObj.get("solutionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `solutionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("solutionId").toString()));
      }
      if ((jsonObj.get("runTemplateId") != null && !jsonObj.get("runTemplateId").isJsonNull()) && !jsonObj.get("runTemplateId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `runTemplateId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("runTemplateId").toString()));
      }
      if ((jsonObj.get("workspaceId") != null && !jsonObj.get("workspaceId").isJsonNull()) && !jsonObj.get("workspaceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workspaceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workspaceId").toString()));
      }
      if ((jsonObj.get("scenarioId") != null && !jsonObj.get("scenarioId").isJsonNull()) && !jsonObj.get("scenarioId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scenarioId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scenarioId").toString()));
      }
      // validate the optional field `state`
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) {
        ScenarioRunSearchState.validateJsonElement(jsonObj.get("state"));
      }
      if ((jsonObj.get("workflowId") != null && !jsonObj.get("workflowId").isJsonNull()) && !jsonObj.get("workflowId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workflowId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workflowId").toString()));
      }
      if ((jsonObj.get("workflowName") != null && !jsonObj.get("workflowName").isJsonNull()) && !jsonObj.get("workflowName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workflowName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workflowName").toString()));
      }
      if ((jsonObj.get("ownerId") != null && !jsonObj.get("ownerId").isJsonNull()) && !jsonObj.get("ownerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ownerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ownerId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ScenarioRunSearch.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ScenarioRunSearch' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ScenarioRunSearch> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ScenarioRunSearch.class));

       return (TypeAdapter<T>) new TypeAdapter<ScenarioRunSearch>() {
           @Override
           public void write(JsonWriter out, ScenarioRunSearch value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ScenarioRunSearch read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ScenarioRunSearch given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ScenarioRunSearch
  * @throws IOException if the JSON string is invalid with respect to ScenarioRunSearch
  */
  public static ScenarioRunSearch fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ScenarioRunSearch.class);
  }

 /**
  * Convert an instance of ScenarioRunSearch to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

