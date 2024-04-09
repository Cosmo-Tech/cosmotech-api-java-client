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
import com.cosmotech.client.model.RunResourceRequested;
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
 * status of a Run Node
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-09T12:17:43.308816464Z[Etc/UTC]")
public class RunStatusNode {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CONTAINER_NAME = "containerName";
  @SerializedName(SERIALIZED_NAME_CONTAINER_NAME)
  private String containerName;

  public static final String SERIALIZED_NAME_OUTBOUND_NODES = "outboundNodes";
  @SerializedName(SERIALIZED_NAME_OUTBOUND_NODES)
  private List<String> outboundNodes;

  public static final String SERIALIZED_NAME_RESOURCES_DURATION = "resourcesDuration";
  @SerializedName(SERIALIZED_NAME_RESOURCES_DURATION)
  private RunResourceRequested resourcesDuration;

  public static final String SERIALIZED_NAME_ESTIMATED_DURATION = "estimatedDuration";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_DURATION)
  private Integer estimatedDuration;

  public static final String SERIALIZED_NAME_HOST_NODE_NAME = "hostNodeName";
  @SerializedName(SERIALIZED_NAME_HOST_NODE_NAME)
  private String hostNodeName;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_PHASE = "phase";
  @SerializedName(SERIALIZED_NAME_PHASE)
  private String phase;

  public static final String SERIALIZED_NAME_PROGRESS = "progress";
  @SerializedName(SERIALIZED_NAME_PROGRESS)
  private String progress;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public static final String SERIALIZED_NAME_END_TIME = "endTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public RunStatusNode() {
  }

  public RunStatusNode(
     List<String> outboundNodes
  ) {
    this();
    this.outboundNodes = outboundNodes;
  }

  public RunStatusNode id(String id) {
    this.id = id;
    return this;
  }

   /**
   * the node id
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public RunStatusNode name(String name) {
    this.name = name;
    return this;
  }

   /**
   * the node unique name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public RunStatusNode containerName(String containerName) {
    this.containerName = containerName;
    return this;
  }

   /**
   * the Run container name
   * @return containerName
  **/
  @javax.annotation.Nullable
  public String getContainerName() {
    return containerName;
  }

  public void setContainerName(String containerName) {
    this.containerName = containerName;
  }


   /**
   * the list of outbound nodes
   * @return outboundNodes
  **/
  @javax.annotation.Nullable
  public List<String> getOutboundNodes() {
    return outboundNodes;
  }



  public RunStatusNode resourcesDuration(RunResourceRequested resourcesDuration) {
    this.resourcesDuration = resourcesDuration;
    return this;
  }

   /**
   * Get resourcesDuration
   * @return resourcesDuration
  **/
  @javax.annotation.Nullable
  public RunResourceRequested getResourcesDuration() {
    return resourcesDuration;
  }

  public void setResourcesDuration(RunResourceRequested resourcesDuration) {
    this.resourcesDuration = resourcesDuration;
  }


  public RunStatusNode estimatedDuration(Integer estimatedDuration) {
    this.estimatedDuration = estimatedDuration;
    return this;
  }

   /**
   * estimatedDuration in seconds
   * @return estimatedDuration
  **/
  @javax.annotation.Nullable
  public Integer getEstimatedDuration() {
    return estimatedDuration;
  }

  public void setEstimatedDuration(Integer estimatedDuration) {
    this.estimatedDuration = estimatedDuration;
  }


  public RunStatusNode hostNodeName(String hostNodeName) {
    this.hostNodeName = hostNodeName;
    return this;
  }

   /**
   * HostNodeName name of the Kubernetes node on which the Pod is running, if applicable
   * @return hostNodeName
  **/
  @javax.annotation.Nullable
  public String getHostNodeName() {
    return hostNodeName;
  }

  public void setHostNodeName(String hostNodeName) {
    this.hostNodeName = hostNodeName;
  }


  public RunStatusNode message(String message) {
    this.message = message;
    return this;
  }

   /**
   * a human readable message indicating details about why the node is in this condition
   * @return message
  **/
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  public RunStatusNode phase(String phase) {
    this.phase = phase;
    return this;
  }

   /**
   * high-level summary of where the node is in its lifecycle
   * @return phase
  **/
  @javax.annotation.Nullable
  public String getPhase() {
    return phase;
  }

  public void setPhase(String phase) {
    this.phase = phase;
  }


  public RunStatusNode progress(String progress) {
    this.progress = progress;
    return this;
  }

   /**
   * progress to completion
   * @return progress
  **/
  @javax.annotation.Nullable
  public String getProgress() {
    return progress;
  }

  public void setProgress(String progress) {
    this.progress = progress;
  }


  public RunStatusNode startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * the node start time
   * @return startTime
  **/
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public RunStatusNode endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * the node end time
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStatusNode runStatusNode = (RunStatusNode) o;
    return Objects.equals(this.id, runStatusNode.id) &&
        Objects.equals(this.name, runStatusNode.name) &&
        Objects.equals(this.containerName, runStatusNode.containerName) &&
        Objects.equals(this.outboundNodes, runStatusNode.outboundNodes) &&
        Objects.equals(this.resourcesDuration, runStatusNode.resourcesDuration) &&
        Objects.equals(this.estimatedDuration, runStatusNode.estimatedDuration) &&
        Objects.equals(this.hostNodeName, runStatusNode.hostNodeName) &&
        Objects.equals(this.message, runStatusNode.message) &&
        Objects.equals(this.phase, runStatusNode.phase) &&
        Objects.equals(this.progress, runStatusNode.progress) &&
        Objects.equals(this.startTime, runStatusNode.startTime) &&
        Objects.equals(this.endTime, runStatusNode.endTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, containerName, outboundNodes, resourcesDuration, estimatedDuration, hostNodeName, message, phase, progress, startTime, endTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStatusNode {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
    sb.append("    outboundNodes: ").append(toIndentedString(outboundNodes)).append("\n");
    sb.append("    resourcesDuration: ").append(toIndentedString(resourcesDuration)).append("\n");
    sb.append("    estimatedDuration: ").append(toIndentedString(estimatedDuration)).append("\n");
    sb.append("    hostNodeName: ").append(toIndentedString(hostNodeName)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("containerName");
    openapiFields.add("outboundNodes");
    openapiFields.add("resourcesDuration");
    openapiFields.add("estimatedDuration");
    openapiFields.add("hostNodeName");
    openapiFields.add("message");
    openapiFields.add("phase");
    openapiFields.add("progress");
    openapiFields.add("startTime");
    openapiFields.add("endTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RunStatusNode
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RunStatusNode.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RunStatusNode is not found in the empty JSON string", RunStatusNode.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RunStatusNode.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RunStatusNode` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("containerName") != null && !jsonObj.get("containerName").isJsonNull()) && !jsonObj.get("containerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `containerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("containerName").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("outboundNodes") != null && !jsonObj.get("outboundNodes").isJsonNull() && !jsonObj.get("outboundNodes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `outboundNodes` to be an array in the JSON string but got `%s`", jsonObj.get("outboundNodes").toString()));
      }
      // validate the optional field `resourcesDuration`
      if (jsonObj.get("resourcesDuration") != null && !jsonObj.get("resourcesDuration").isJsonNull()) {
        RunResourceRequested.validateJsonElement(jsonObj.get("resourcesDuration"));
      }
      if ((jsonObj.get("hostNodeName") != null && !jsonObj.get("hostNodeName").isJsonNull()) && !jsonObj.get("hostNodeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostNodeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostNodeName").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("phase") != null && !jsonObj.get("phase").isJsonNull()) && !jsonObj.get("phase").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phase` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phase").toString()));
      }
      if ((jsonObj.get("progress") != null && !jsonObj.get("progress").isJsonNull()) && !jsonObj.get("progress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `progress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("progress").toString()));
      }
      if ((jsonObj.get("startTime") != null && !jsonObj.get("startTime").isJsonNull()) && !jsonObj.get("startTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startTime").toString()));
      }
      if ((jsonObj.get("endTime") != null && !jsonObj.get("endTime").isJsonNull()) && !jsonObj.get("endTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endTime").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RunStatusNode.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RunStatusNode' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RunStatusNode> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RunStatusNode.class));

       return (TypeAdapter<T>) new TypeAdapter<RunStatusNode>() {
           @Override
           public void write(JsonWriter out, RunStatusNode value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RunStatusNode read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RunStatusNode given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RunStatusNode
  * @throws IOException if the JSON string is invalid with respect to RunStatusNode
  */
  public static RunStatusNode fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RunStatusNode.class);
  }

 /**
  * Convert an instance of RunStatusNode to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

