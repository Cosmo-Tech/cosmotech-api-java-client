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
 * the Workspace Solution configuration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-25T13:28:00.347802700Z[Etc/UTC]")
public class WorkspaceSolution {
  public static final String SERIALIZED_NAME_SOLUTION_ID = "solutionId";
  @SerializedName(SERIALIZED_NAME_SOLUTION_ID)
  private String solutionId;

  public static final String SERIALIZED_NAME_RUN_TEMPLATE_FILTER = "runTemplateFilter";
  @SerializedName(SERIALIZED_NAME_RUN_TEMPLATE_FILTER)
  private List<String> runTemplateFilter;

  public static final String SERIALIZED_NAME_DEFAULT_RUN_TEMPLATE_DATASET = "defaultRunTemplateDataset";
  @SerializedName(SERIALIZED_NAME_DEFAULT_RUN_TEMPLATE_DATASET)
  private Map<String, Object> defaultRunTemplateDataset = new HashMap<>();

  public WorkspaceSolution() {
  }

  public WorkspaceSolution solutionId(String solutionId) {
    this.solutionId = solutionId;
    return this;
  }

   /**
   * the Solution Id attached to this workspace
   * @return solutionId
  **/
  @javax.annotation.Nullable
  public String getSolutionId() {
    return solutionId;
  }

  public void setSolutionId(String solutionId) {
    this.solutionId = solutionId;
  }


  public WorkspaceSolution runTemplateFilter(List<String> runTemplateFilter) {
    this.runTemplateFilter = runTemplateFilter;
    return this;
  }

  public WorkspaceSolution addRunTemplateFilterItem(String runTemplateFilterItem) {
    if (this.runTemplateFilter == null) {
      this.runTemplateFilter = new ArrayList<>();
    }
    this.runTemplateFilter.add(runTemplateFilterItem);
    return this;
  }

   /**
   * the list of Solution Run Template Id to filter
   * @return runTemplateFilter
  **/
  @javax.annotation.Nullable
  public List<String> getRunTemplateFilter() {
    return runTemplateFilter;
  }

  public void setRunTemplateFilter(List<String> runTemplateFilter) {
    this.runTemplateFilter = runTemplateFilter;
  }


  public WorkspaceSolution defaultRunTemplateDataset(Map<String, Object> defaultRunTemplateDataset) {
    this.defaultRunTemplateDataset = defaultRunTemplateDataset;
    return this;
  }

  public WorkspaceSolution putDefaultRunTemplateDatasetItem(String key, Object defaultRunTemplateDatasetItem) {
    if (this.defaultRunTemplateDataset == null) {
      this.defaultRunTemplateDataset = new HashMap<>();
    }
    this.defaultRunTemplateDataset.put(key, defaultRunTemplateDatasetItem);
    return this;
  }

   /**
   * a map of RunTemplateId/DatasetId to set a default dataset for a Run Template
   * @return defaultRunTemplateDataset
  **/
  @javax.annotation.Nullable
  public Map<String, Object> getDefaultRunTemplateDataset() {
    return defaultRunTemplateDataset;
  }

  public void setDefaultRunTemplateDataset(Map<String, Object> defaultRunTemplateDataset) {
    this.defaultRunTemplateDataset = defaultRunTemplateDataset;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkspaceSolution workspaceSolution = (WorkspaceSolution) o;
    return Objects.equals(this.solutionId, workspaceSolution.solutionId) &&
        Objects.equals(this.runTemplateFilter, workspaceSolution.runTemplateFilter) &&
        Objects.equals(this.defaultRunTemplateDataset, workspaceSolution.defaultRunTemplateDataset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(solutionId, runTemplateFilter, defaultRunTemplateDataset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceSolution {\n");
    sb.append("    solutionId: ").append(toIndentedString(solutionId)).append("\n");
    sb.append("    runTemplateFilter: ").append(toIndentedString(runTemplateFilter)).append("\n");
    sb.append("    defaultRunTemplateDataset: ").append(toIndentedString(defaultRunTemplateDataset)).append("\n");
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
    openapiFields.add("runTemplateFilter");
    openapiFields.add("defaultRunTemplateDataset");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WorkspaceSolution
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WorkspaceSolution.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkspaceSolution is not found in the empty JSON string", WorkspaceSolution.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WorkspaceSolution.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkspaceSolution` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("solutionId") != null && !jsonObj.get("solutionId").isJsonNull()) && !jsonObj.get("solutionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `solutionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("solutionId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("runTemplateFilter") != null && !jsonObj.get("runTemplateFilter").isJsonNull() && !jsonObj.get("runTemplateFilter").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `runTemplateFilter` to be an array in the JSON string but got `%s`", jsonObj.get("runTemplateFilter").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkspaceSolution.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkspaceSolution' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkspaceSolution> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkspaceSolution.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkspaceSolution>() {
           @Override
           public void write(JsonWriter out, WorkspaceSolution value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkspaceSolution read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WorkspaceSolution given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkspaceSolution
  * @throws IOException if the JSON string is invalid with respect to WorkspaceSolution
  */
  public static WorkspaceSolution fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkspaceSolution.class);
  }

 /**
  * Convert an instance of WorkspaceSolution to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

