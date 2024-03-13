/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.1.1-SNAPSHOT
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
 * RunnerRootLastRun
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-13T20:46:23.451733025Z[Etc/UTC]")
public class RunnerRootLastRun {
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

  public RunnerRootLastRun() {
  }

  public RunnerRootLastRun runnerRunId(String runnerRunId) {
    this.runnerRunId = runnerRunId;
    return this;
  }

   /**
   * the last Runner Run id
   * @return runnerRunId
  **/
  @javax.annotation.Nullable
  public String getRunnerRunId() {
    return runnerRunId;
  }

  public void setRunnerRunId(String runnerRunId) {
    this.runnerRunId = runnerRunId;
  }


  public RunnerRootLastRun csmSimulationRun(String csmSimulationRun) {
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


  public RunnerRootLastRun workflowId(String workflowId) {
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


  public RunnerRootLastRun workflowName(String workflowName) {
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
    RunnerRootLastRun runnerRootLastRun = (RunnerRootLastRun) o;
    return Objects.equals(this.runnerRunId, runnerRootLastRun.runnerRunId) &&
        Objects.equals(this.csmSimulationRun, runnerRootLastRun.csmSimulationRun) &&
        Objects.equals(this.workflowId, runnerRootLastRun.workflowId) &&
        Objects.equals(this.workflowName, runnerRootLastRun.workflowName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runnerRunId, csmSimulationRun, workflowId, workflowName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunnerRootLastRun {\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("runnerRunId");
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
  * @throws IOException if the JSON Element is invalid with respect to RunnerRootLastRun
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RunnerRootLastRun.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RunnerRootLastRun is not found in the empty JSON string", RunnerRootLastRun.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RunnerRootLastRun.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RunnerRootLastRun` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("runnerRunId") != null && !jsonObj.get("runnerRunId").isJsonNull()) && !jsonObj.get("runnerRunId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `runnerRunId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("runnerRunId").toString()));
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
       if (!RunnerRootLastRun.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RunnerRootLastRun' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RunnerRootLastRun> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RunnerRootLastRun.class));

       return (TypeAdapter<T>) new TypeAdapter<RunnerRootLastRun>() {
           @Override
           public void write(JsonWriter out, RunnerRootLastRun value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RunnerRootLastRun read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RunnerRootLastRun given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RunnerRootLastRun
  * @throws IOException if the JSON string is invalid with respect to RunnerRootLastRun
  */
  public static RunnerRootLastRun fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RunnerRootLastRun.class);
  }

 /**
  * Convert an instance of RunnerRootLastRun to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

