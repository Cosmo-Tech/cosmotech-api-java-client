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
 * a Parameter Group for a Run Template
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-05T15:35:23.021239139Z[Etc/UTC]")
public class RunTemplateParameterGroup {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = new HashMap<>();

  public static final String SERIALIZED_NAME_IS_TABLE = "isTable";
  @SerializedName(SERIALIZED_NAME_IS_TABLE)
  private Boolean isTable;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private Map<String, Object> options = new HashMap<>();

  public static final String SERIALIZED_NAME_PARENT_ID = "parentId";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private String parentId;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<String> parameters;

  public RunTemplateParameterGroup() {
  }

  public RunTemplateParameterGroup id(String id) {
    this.id = id;
    return this;
  }

   /**
   * the Parameter Group id
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public RunTemplateParameterGroup labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public RunTemplateParameterGroup putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * a translated label with key as ISO 639-1 code
   * @return labels
  **/
  @javax.annotation.Nullable
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public RunTemplateParameterGroup isTable(Boolean isTable) {
    this.isTable = isTable;
    return this;
  }

   /**
   * does the group define a table
   * @return isTable
  **/
  @javax.annotation.Nullable
  public Boolean getIsTable() {
    return isTable;
  }

  public void setIsTable(Boolean isTable) {
    this.isTable = isTable;
  }


  public RunTemplateParameterGroup options(Map<String, Object> options) {
    this.options = options;
    return this;
  }

  public RunTemplateParameterGroup putOptionsItem(String key, Object optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

   /**
   * freeform options
   * @return options
  **/
  @javax.annotation.Nullable
  public Map<String, Object> getOptions() {
    return options;
  }

  public void setOptions(Map<String, Object> options) {
    this.options = options;
  }


  public RunTemplateParameterGroup parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * the Run Template Group parent Id
   * @return parentId
  **/
  @javax.annotation.Nullable
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  public RunTemplateParameterGroup parameters(List<String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public RunTemplateParameterGroup addParametersItem(String parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * an ordered list of Run Template Parameters
   * @return parameters
  **/
  @javax.annotation.Nullable
  public List<String> getParameters() {
    return parameters;
  }

  public void setParameters(List<String> parameters) {
    this.parameters = parameters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunTemplateParameterGroup runTemplateParameterGroup = (RunTemplateParameterGroup) o;
    return Objects.equals(this.id, runTemplateParameterGroup.id) &&
        Objects.equals(this.labels, runTemplateParameterGroup.labels) &&
        Objects.equals(this.isTable, runTemplateParameterGroup.isTable) &&
        Objects.equals(this.options, runTemplateParameterGroup.options) &&
        Objects.equals(this.parentId, runTemplateParameterGroup.parentId) &&
        Objects.equals(this.parameters, runTemplateParameterGroup.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, labels, isTable, options, parentId, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunTemplateParameterGroup {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    isTable: ").append(toIndentedString(isTable)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
    openapiFields.add("labels");
    openapiFields.add("isTable");
    openapiFields.add("options");
    openapiFields.add("parentId");
    openapiFields.add("parameters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RunTemplateParameterGroup
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RunTemplateParameterGroup.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RunTemplateParameterGroup is not found in the empty JSON string", RunTemplateParameterGroup.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RunTemplateParameterGroup.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RunTemplateParameterGroup` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RunTemplateParameterGroup.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("parentId") != null && !jsonObj.get("parentId").isJsonNull()) && !jsonObj.get("parentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("parameters") != null && !jsonObj.get("parameters").isJsonNull() && !jsonObj.get("parameters").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `parameters` to be an array in the JSON string but got `%s`", jsonObj.get("parameters").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RunTemplateParameterGroup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RunTemplateParameterGroup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RunTemplateParameterGroup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RunTemplateParameterGroup.class));

       return (TypeAdapter<T>) new TypeAdapter<RunTemplateParameterGroup>() {
           @Override
           public void write(JsonWriter out, RunTemplateParameterGroup value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RunTemplateParameterGroup read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RunTemplateParameterGroup given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RunTemplateParameterGroup
  * @throws IOException if the JSON string is invalid with respect to RunTemplateParameterGroup
  */
  public static RunTemplateParameterGroup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RunTemplateParameterGroup.class);
  }

 /**
  * Convert an instance of RunTemplateParameterGroup to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

