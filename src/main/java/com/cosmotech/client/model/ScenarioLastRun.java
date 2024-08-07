/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.2.8
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
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
 * ScenarioLastRun
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-16T12:45:04.926402752Z[Etc/UTC]")
public class ScenarioLastRun {
  public static final String SERIALIZED_NAME_SCENARIO_RUN_ID = "scenarioRunId";
  @SerializedName(SERIALIZED_NAME_SCENARIO_RUN_ID)
  private String scenarioRunId;

  public static final String SERIALIZED_NAME_CSM_SIMULATION_RUN = "csmSimulationRun";
  @SerializedName(SERIALIZED_NAME_CSM_SIMULATION_RUN)
  private String csmSimulationRun;

  public static final String SERIALIZED_NAME_WORKFLOW_ID = "workflowId";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_ID)
  private String workflowId;

  public static final String SERIALIZED_NAME_WORKFLOW_NAME = "workflowName";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_NAME)
  private String workflowName;

  public ScenarioLastRun() {
  }

  public ScenarioLastRun scenarioRunId(String scenarioRunId) {
    this.scenarioRunId = scenarioRunId;
    return this;
  }

   /**
   * the last Scenario Run id
   * @return scenarioRunId
  **/
  @javax.annotation.Nullable
  public String getScenarioRunId() {
    return scenarioRunId;
  }

  public void setScenarioRunId(String scenarioRunId) {
    this.scenarioRunId = scenarioRunId;
  }


  public ScenarioLastRun csmSimulationRun(String csmSimulationRun) {
    this.csmSimulationRun = csmSimulationRun;
    return this;
  }

   /**
   * the last Cosmo Tech Simulation Run id
   * @return csmSimulationRun
  **/
  @javax.annotation.Nullable
  public String getCsmSimulationRun() {
    return csmSimulationRun;
  }

  public void setCsmSimulationRun(String csmSimulationRun) {
    this.csmSimulationRun = csmSimulationRun;
  }


  public ScenarioLastRun workflowId(String workflowId) {
    this.workflowId = workflowId;
    return this;
  }

   /**
   * the last Workflow Id
   * @return workflowId
  **/
  @javax.annotation.Nullable
  public String getWorkflowId() {
    return workflowId;
  }

  public void setWorkflowId(String workflowId) {
    this.workflowId = workflowId;
  }


  public ScenarioLastRun workflowName(String workflowName) {
    this.workflowName = workflowName;
    return this;
  }

   /**
   * the last Workflow name
   * @return workflowName
  **/
  @javax.annotation.Nullable
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
    ScenarioLastRun scenarioLastRun = (ScenarioLastRun) o;
    return Objects.equals(this.scenarioRunId, scenarioLastRun.scenarioRunId) &&
        Objects.equals(this.csmSimulationRun, scenarioLastRun.csmSimulationRun) &&
        Objects.equals(this.workflowId, scenarioLastRun.workflowId) &&
        Objects.equals(this.workflowName, scenarioLastRun.workflowName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scenarioRunId, csmSimulationRun, workflowId, workflowName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScenarioLastRun {\n");
    sb.append("    scenarioRunId: ").append(toIndentedString(scenarioRunId)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("scenarioRunId");
    openapiFields.add("csmSimulationRun");
    openapiFields.add("workflowId");
    openapiFields.add("workflowName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ScenarioLastRun
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ScenarioLastRun.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ScenarioLastRun is not found in the empty JSON string", ScenarioLastRun.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ScenarioLastRun.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ScenarioLastRun` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("scenarioRunId") != null && !jsonObj.get("scenarioRunId").isJsonNull()) && !jsonObj.get("scenarioRunId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scenarioRunId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scenarioRunId").toString()));
      }
      if ((jsonObj.get("csmSimulationRun") != null && !jsonObj.get("csmSimulationRun").isJsonNull()) && !jsonObj.get("csmSimulationRun").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `csmSimulationRun` to be a primitive type in the JSON string but got `%s`", jsonObj.get("csmSimulationRun").toString()));
      }
      if ((jsonObj.get("workflowId") != null && !jsonObj.get("workflowId").isJsonNull()) && !jsonObj.get("workflowId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workflowId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workflowId").toString()));
      }
      if ((jsonObj.get("workflowName") != null && !jsonObj.get("workflowName").isJsonNull()) && !jsonObj.get("workflowName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workflowName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workflowName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ScenarioLastRun.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ScenarioLastRun' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ScenarioLastRun> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ScenarioLastRun.class));

       return (TypeAdapter<T>) new TypeAdapter<ScenarioLastRun>() {
           @Override
           public void write(JsonWriter out, ScenarioLastRun value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ScenarioLastRun read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ScenarioLastRun given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ScenarioLastRun
  * @throws IOException if the JSON string is invalid with respect to ScenarioLastRun
  */
  public static ScenarioLastRun fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ScenarioLastRun.class);
  }

 /**
  * Convert an instance of ScenarioLastRun to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

