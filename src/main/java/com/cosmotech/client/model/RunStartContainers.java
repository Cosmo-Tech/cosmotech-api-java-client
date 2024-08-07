/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 4.0.3-SNAPSHOT
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import com.cosmotech.client.model.RunContainer;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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
 * the parameters to run directly containers
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-17T08:55:58.989708539Z[Etc/UTC]")
public class RunStartContainers {
  public static final String SERIALIZED_NAME_GENERATE_NAME = "generateName";
  @SerializedName(SERIALIZED_NAME_GENERATE_NAME)
  private String generateName;

  public static final String SERIALIZED_NAME_CSM_SIMULATION_ID = "csmSimulationId";
  @SerializedName(SERIALIZED_NAME_CSM_SIMULATION_ID)
  private String csmSimulationId;

  public static final String SERIALIZED_NAME_NODE_LABEL = "nodeLabel";
  @SerializedName(SERIALIZED_NAME_NODE_LABEL)
  private String nodeLabel;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = new HashMap<>();

  public static final String SERIALIZED_NAME_CONTAINERS = "containers";
  @SerializedName(SERIALIZED_NAME_CONTAINERS)
  private List<RunContainer> containers = new ArrayList<>();

  public RunStartContainers() {
  }

  public RunStartContainers generateName(String generateName) {
    this.generateName = generateName;
    return this;
  }

   /**
   * the base name for workflow name generation
   * @return generateName
  **/
  @javax.annotation.Nullable
  public String getGenerateName() {
    return generateName;
  }

  public void setGenerateName(String generateName) {
    this.generateName = generateName;
  }


  public RunStartContainers csmSimulationId(String csmSimulationId) {
    this.csmSimulationId = csmSimulationId;
    return this;
  }

   /**
   * Cosmo Tech Simulation Run Id
   * @return csmSimulationId
  **/
  @javax.annotation.Nonnull
  public String getCsmSimulationId() {
    return csmSimulationId;
  }

  public void setCsmSimulationId(String csmSimulationId) {
    this.csmSimulationId = csmSimulationId;
  }


  public RunStartContainers nodeLabel(String nodeLabel) {
    this.nodeLabel = nodeLabel;
    return this;
  }

   /**
   * the node label request
   * @return nodeLabel
  **/
  @javax.annotation.Nullable
  public String getNodeLabel() {
    return nodeLabel;
  }

  public void setNodeLabel(String nodeLabel) {
    this.nodeLabel = nodeLabel;
  }


  public RunStartContainers labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public RunStartContainers putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * the workflow labels
   * @return labels
  **/
  @javax.annotation.Nullable
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public RunStartContainers containers(List<RunContainer> containers) {
    this.containers = containers;
    return this;
  }

  public RunStartContainers addContainersItem(RunContainer containersItem) {
    if (this.containers == null) {
      this.containers = new ArrayList<>();
    }
    this.containers.add(containersItem);
    return this;
  }

   /**
   * the containerslist
   * @return containers
  **/
  @javax.annotation.Nonnull
  public List<RunContainer> getContainers() {
    return containers;
  }

  public void setContainers(List<RunContainer> containers) {
    this.containers = containers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStartContainers runStartContainers = (RunStartContainers) o;
    return Objects.equals(this.generateName, runStartContainers.generateName) &&
        Objects.equals(this.csmSimulationId, runStartContainers.csmSimulationId) &&
        Objects.equals(this.nodeLabel, runStartContainers.nodeLabel) &&
        Objects.equals(this.labels, runStartContainers.labels) &&
        Objects.equals(this.containers, runStartContainers.containers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generateName, csmSimulationId, nodeLabel, labels, containers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStartContainers {\n");
    sb.append("    generateName: ").append(toIndentedString(generateName)).append("\n");
    sb.append("    csmSimulationId: ").append(toIndentedString(csmSimulationId)).append("\n");
    sb.append("    nodeLabel: ").append(toIndentedString(nodeLabel)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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
    openapiFields.add("generateName");
    openapiFields.add("csmSimulationId");
    openapiFields.add("nodeLabel");
    openapiFields.add("labels");
    openapiFields.add("containers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("csmSimulationId");
    openapiRequiredFields.add("containers");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RunStartContainers
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RunStartContainers.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RunStartContainers is not found in the empty JSON string", RunStartContainers.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RunStartContainers.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RunStartContainers` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RunStartContainers.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("generateName") != null && !jsonObj.get("generateName").isJsonNull()) && !jsonObj.get("generateName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `generateName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("generateName").toString()));
      }
      if (!jsonObj.get("csmSimulationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `csmSimulationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("csmSimulationId").toString()));
      }
      if ((jsonObj.get("nodeLabel") != null && !jsonObj.get("nodeLabel").isJsonNull()) && !jsonObj.get("nodeLabel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nodeLabel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nodeLabel").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("containers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `containers` to be an array in the JSON string but got `%s`", jsonObj.get("containers").toString()));
      }

      JsonArray jsonArraycontainers = jsonObj.getAsJsonArray("containers");
      // validate the required field `containers` (array)
      for (int i = 0; i < jsonArraycontainers.size(); i++) {
        RunContainer.validateJsonElement(jsonArraycontainers.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RunStartContainers.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RunStartContainers' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RunStartContainers> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RunStartContainers.class));

       return (TypeAdapter<T>) new TypeAdapter<RunStartContainers>() {
           @Override
           public void write(JsonWriter out, RunStartContainers value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RunStartContainers read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RunStartContainers given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RunStartContainers
  * @throws IOException if the JSON string is invalid with respect to RunStartContainers
  */
  public static RunStartContainers fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RunStartContainers.class);
  }

 /**
  * Convert an instance of RunStartContainers to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

