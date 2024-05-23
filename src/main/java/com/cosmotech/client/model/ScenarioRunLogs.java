/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.2.2
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import com.cosmotech.client.model.ScenarioRunContainerLogs;
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
 * the scenariorun logs returned by all containers
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-23T14:46:17.231404Z[Etc/UTC]")
public class ScenarioRunLogs {
  public static final String SERIALIZED_NAME_SCENARIORUN_ID = "scenariorunId";
  @SerializedName(SERIALIZED_NAME_SCENARIORUN_ID)
  private String scenariorunId;

  public static final String SERIALIZED_NAME_CONTAINERS = "containers";
  @SerializedName(SERIALIZED_NAME_CONTAINERS)
  private Map<String, ScenarioRunContainerLogs> containers = new HashMap<>();

  public ScenarioRunLogs() {
  }

  public ScenarioRunLogs(
     String scenariorunId, 
     Map<String, ScenarioRunContainerLogs> containers
  ) {
    this();
    this.scenariorunId = scenariorunId;
    this.containers = containers;
  }

   /**
   * the ScenarioRun Id
   * @return scenariorunId
  **/
  @javax.annotation.Nullable
  public String getScenariorunId() {
    return scenariorunId;
  }



   /**
   * the container map of logs
   * @return containers
  **/
  @javax.annotation.Nullable
  public Map<String, ScenarioRunContainerLogs> getContainers() {
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
    ScenarioRunLogs scenarioRunLogs = (ScenarioRunLogs) o;
    return Objects.equals(this.scenariorunId, scenarioRunLogs.scenariorunId) &&
        Objects.equals(this.containers, scenarioRunLogs.containers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scenariorunId, containers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScenarioRunLogs {\n");
    sb.append("    scenariorunId: ").append(toIndentedString(scenariorunId)).append("\n");
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
    openapiFields.add("scenariorunId");
    openapiFields.add("containers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ScenarioRunLogs
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ScenarioRunLogs.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ScenarioRunLogs is not found in the empty JSON string", ScenarioRunLogs.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ScenarioRunLogs.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ScenarioRunLogs` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("scenariorunId") != null && !jsonObj.get("scenariorunId").isJsonNull()) && !jsonObj.get("scenariorunId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scenariorunId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scenariorunId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ScenarioRunLogs.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ScenarioRunLogs' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ScenarioRunLogs> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ScenarioRunLogs.class));

       return (TypeAdapter<T>) new TypeAdapter<ScenarioRunLogs>() {
           @Override
           public void write(JsonWriter out, ScenarioRunLogs value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ScenarioRunLogs read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ScenarioRunLogs given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ScenarioRunLogs
  * @throws IOException if the JSON string is invalid with respect to ScenarioRunLogs
  */
  public static ScenarioRunLogs fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ScenarioRunLogs.class);
  }

 /**
  * Convert an instance of ScenarioRunLogs to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

