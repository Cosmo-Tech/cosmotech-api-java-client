/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 4.0.2-SNAPSHOT
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import com.cosmotech.client.model.RunContainerLogs;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
 * the run logs returned by all containers
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-15T09:25:01.456446282Z[Etc/UTC]")
public class RunLogs {
  public static final String SERIALIZED_NAME_RUN_ID = "runId";
  @SerializedName(SERIALIZED_NAME_RUN_ID)
  private String runId;

  public static final String SERIALIZED_NAME_CONTAINERS = "containers";
  @SerializedName(SERIALIZED_NAME_CONTAINERS)
  private Map<String, RunContainerLogs> containers = new HashMap<>();

  public RunLogs() {
  }

  public RunLogs(
     String runId, 
     Map<String, RunContainerLogs> containers
  ) {
    this();
    this.runId = runId;
    this.containers = containers;
  }

   /**
   * the Run Id
   * @return runId
  **/
  @javax.annotation.Nullable
  public String getRunId() {
    return runId;
  }



   /**
   * the container map of logs
   * @return containers
  **/
  @javax.annotation.Nullable
  public Map<String, RunContainerLogs> getContainers() {
    return containers;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunLogs runLogs = (RunLogs) o;
    return Objects.equals(this.runId, runLogs.runId) &&
        Objects.equals(this.containers, runLogs.containers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runId, containers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunLogs {\n");
    sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("runId");
    openapiFields.add("containers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RunLogs
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RunLogs.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RunLogs is not found in the empty JSON string", RunLogs.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RunLogs.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RunLogs` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("runId") != null && !jsonObj.get("runId").isJsonNull()) && !jsonObj.get("runId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `runId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("runId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RunLogs.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RunLogs' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RunLogs> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RunLogs.class));

       return (TypeAdapter<T>) new TypeAdapter<RunLogs>() {
           @Override
           public void write(JsonWriter out, RunLogs value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RunLogs read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RunLogs given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RunLogs
  * @throws IOException if the JSON string is invalid with respect to RunLogs
  */
  public static RunLogs fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RunLogs.class);
  }

 /**
  * Convert an instance of RunLogs to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

