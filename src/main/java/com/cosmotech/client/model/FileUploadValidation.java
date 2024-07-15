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
import com.cosmotech.client.model.FileUploadMetadata;
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
 * files read on upload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-15T13:27:00.308151830Z[Etc/UTC]")
public class FileUploadValidation {
  public static final String SERIALIZED_NAME_NODES = "nodes";
  @SerializedName(SERIALIZED_NAME_NODES)
  private List<FileUploadMetadata> nodes;

  public static final String SERIALIZED_NAME_EDGES = "edges";
  @SerializedName(SERIALIZED_NAME_EDGES)
  private List<FileUploadMetadata> edges;

  public FileUploadValidation() {
  }

  public FileUploadValidation nodes(List<FileUploadMetadata> nodes) {
    this.nodes = nodes;
    return this;
  }

  public FileUploadValidation addNodesItem(FileUploadMetadata nodesItem) {
    if (this.nodes == null) {
      this.nodes = new ArrayList<>();
    }
    this.nodes.add(nodesItem);
    return this;
  }

   /**
   * list of filename found on nodes folder
   * @return nodes
  **/
  @javax.annotation.Nullable
  public List<FileUploadMetadata> getNodes() {
    return nodes;
  }

  public void setNodes(List<FileUploadMetadata> nodes) {
    this.nodes = nodes;
  }


  public FileUploadValidation edges(List<FileUploadMetadata> edges) {
    this.edges = edges;
    return this;
  }

  public FileUploadValidation addEdgesItem(FileUploadMetadata edgesItem) {
    if (this.edges == null) {
      this.edges = new ArrayList<>();
    }
    this.edges.add(edgesItem);
    return this;
  }

   /**
   * list of filename found on edges folder
   * @return edges
  **/
  @javax.annotation.Nullable
  public List<FileUploadMetadata> getEdges() {
    return edges;
  }

  public void setEdges(List<FileUploadMetadata> edges) {
    this.edges = edges;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileUploadValidation fileUploadValidation = (FileUploadValidation) o;
    return Objects.equals(this.nodes, fileUploadValidation.nodes) &&
        Objects.equals(this.edges, fileUploadValidation.edges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodes, edges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileUploadValidation {\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    edges: ").append(toIndentedString(edges)).append("\n");
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
    openapiFields.add("nodes");
    openapiFields.add("edges");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FileUploadValidation
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FileUploadValidation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FileUploadValidation is not found in the empty JSON string", FileUploadValidation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FileUploadValidation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FileUploadValidation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("nodes") != null && !jsonObj.get("nodes").isJsonNull()) {
        JsonArray jsonArraynodes = jsonObj.getAsJsonArray("nodes");
        if (jsonArraynodes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("nodes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `nodes` to be an array in the JSON string but got `%s`", jsonObj.get("nodes").toString()));
          }

          // validate the optional field `nodes` (array)
          for (int i = 0; i < jsonArraynodes.size(); i++) {
            FileUploadMetadata.validateJsonElement(jsonArraynodes.get(i));
          };
        }
      }
      if (jsonObj.get("edges") != null && !jsonObj.get("edges").isJsonNull()) {
        JsonArray jsonArrayedges = jsonObj.getAsJsonArray("edges");
        if (jsonArrayedges != null) {
          // ensure the json data is an array
          if (!jsonObj.get("edges").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `edges` to be an array in the JSON string but got `%s`", jsonObj.get("edges").toString()));
          }

          // validate the optional field `edges` (array)
          for (int i = 0; i < jsonArrayedges.size(); i++) {
            FileUploadMetadata.validateJsonElement(jsonArrayedges.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileUploadValidation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileUploadValidation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileUploadValidation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileUploadValidation.class));

       return (TypeAdapter<T>) new TypeAdapter<FileUploadValidation>() {
           @Override
           public void write(JsonWriter out, FileUploadValidation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileUploadValidation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileUploadValidation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileUploadValidation
  * @throws IOException if the JSON string is invalid with respect to FileUploadValidation
  */
  public static FileUploadValidation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileUploadValidation.class);
  }

 /**
  * Convert an instance of FileUploadValidation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

