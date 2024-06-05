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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * logs for a given container
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-05T15:35:23.021239139Z[Etc/UTC]")
public class RunContainerLogs {
  public static final String SERIALIZED_NAME_NODE_ID = "nodeId";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  private String nodeId;

  public static final String SERIALIZED_NAME_CONTAINER_NAME = "containerName";
  @SerializedName(SERIALIZED_NAME_CONTAINER_NAME)
  private String containerName;

  public static final String SERIALIZED_NAME_CHILDREN = "children";
  @SerializedName(SERIALIZED_NAME_CHILDREN)
  private List<String> children;

  public static final String SERIALIZED_NAME_LOGS = "logs";
  @SerializedName(SERIALIZED_NAME_LOGS)
  private String logs;

  public RunContainerLogs() {
  }

  public RunContainerLogs(
     String nodeId, 
     String containerName, 
     List<String> children, 
     String logs
  ) {
    this();
    this.nodeId = nodeId;
    this.containerName = containerName;
    this.children = children;
    this.logs = logs;
  }

   /**
   * the node Id which has executed this log
   * @return nodeId
  **/
  @javax.annotation.Nullable
  public String getNodeId() {
    return nodeId;
  }



   /**
   * the container name
   * @return containerName
  **/
  @javax.annotation.Nullable
  public String getContainerName() {
    return containerName;
  }



   /**
   * the list of children node id
   * @return children
  **/
  @javax.annotation.Nullable
  public List<String> getChildren() {
    return children;
  }



   /**
   * the node logs in plain text
   * @return logs
  **/
  @javax.annotation.Nullable
  public String getLogs() {
    return logs;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunContainerLogs runContainerLogs = (RunContainerLogs) o;
    return Objects.equals(this.nodeId, runContainerLogs.nodeId) &&
        Objects.equals(this.containerName, runContainerLogs.containerName) &&
        Objects.equals(this.children, runContainerLogs.children) &&
        Objects.equals(this.logs, runContainerLogs.logs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeId, containerName, children, logs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunContainerLogs {\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
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
    openapiFields.add("nodeId");
    openapiFields.add("containerName");
    openapiFields.add("children");
    openapiFields.add("logs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RunContainerLogs
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RunContainerLogs.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RunContainerLogs is not found in the empty JSON string", RunContainerLogs.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RunContainerLogs.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RunContainerLogs` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("nodeId") != null && !jsonObj.get("nodeId").isJsonNull()) && !jsonObj.get("nodeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nodeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nodeId").toString()));
      }
      if ((jsonObj.get("containerName") != null && !jsonObj.get("containerName").isJsonNull()) && !jsonObj.get("containerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `containerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("containerName").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("children") != null && !jsonObj.get("children").isJsonNull() && !jsonObj.get("children").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `children` to be an array in the JSON string but got `%s`", jsonObj.get("children").toString()));
      }
      if ((jsonObj.get("logs") != null && !jsonObj.get("logs").isJsonNull()) && !jsonObj.get("logs").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logs` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logs").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RunContainerLogs.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RunContainerLogs' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RunContainerLogs> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RunContainerLogs.class));

       return (TypeAdapter<T>) new TypeAdapter<RunContainerLogs>() {
           @Override
           public void write(JsonWriter out, RunContainerLogs value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RunContainerLogs read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RunContainerLogs given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RunContainerLogs
  * @throws IOException if the JSON string is invalid with respect to RunContainerLogs
  */
  public static RunContainerLogs fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RunContainerLogs.class);
  }

 /**
  * Convert an instance of RunContainerLogs to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

