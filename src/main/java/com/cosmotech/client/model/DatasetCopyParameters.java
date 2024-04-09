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
 * the Dataset Copy Parameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-09T12:17:43.308816464Z[Etc/UTC]")
public class DatasetCopyParameters {
  public static final String SERIALIZED_NAME_SOURCE_ID = "sourceId";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private String sourceId;

  public static final String SERIALIZED_NAME_TARGET_ID = "targetId";
  @SerializedName(SERIALIZED_NAME_TARGET_ID)
  private String targetId;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private Map<String, Object> options = new HashMap<>();

  public DatasetCopyParameters() {
  }

  public DatasetCopyParameters sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

   /**
   * the source Dataset id
   * @return sourceId
  **/
  @javax.annotation.Nullable
  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  public DatasetCopyParameters targetId(String targetId) {
    this.targetId = targetId;
    return this;
  }

   /**
   * the target Dataset id
   * @return targetId
  **/
  @javax.annotation.Nullable
  public String getTargetId() {
    return targetId;
  }

  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }


  public DatasetCopyParameters options(Map<String, Object> options) {
    this.options = options;
    return this;
  }

  public DatasetCopyParameters putOptionsItem(String key, Object optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

   /**
   * freeform options to path to connectors
   * @return options
  **/
  @javax.annotation.Nullable
  public Map<String, Object> getOptions() {
    return options;
  }

  public void setOptions(Map<String, Object> options) {
    this.options = options;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetCopyParameters datasetCopyParameters = (DatasetCopyParameters) o;
    return Objects.equals(this.sourceId, datasetCopyParameters.sourceId) &&
        Objects.equals(this.targetId, datasetCopyParameters.targetId) &&
        Objects.equals(this.options, datasetCopyParameters.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, targetId, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetCopyParameters {\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
    openapiFields.add("sourceId");
    openapiFields.add("targetId");
    openapiFields.add("options");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DatasetCopyParameters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DatasetCopyParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatasetCopyParameters is not found in the empty JSON string", DatasetCopyParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DatasetCopyParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DatasetCopyParameters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("sourceId") != null && !jsonObj.get("sourceId").isJsonNull()) && !jsonObj.get("sourceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceId").toString()));
      }
      if ((jsonObj.get("targetId") != null && !jsonObj.get("targetId").isJsonNull()) && !jsonObj.get("targetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatasetCopyParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatasetCopyParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatasetCopyParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatasetCopyParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<DatasetCopyParameters>() {
           @Override
           public void write(JsonWriter out, DatasetCopyParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DatasetCopyParameters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DatasetCopyParameters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DatasetCopyParameters
  * @throws IOException if the JSON string is invalid with respect to DatasetCopyParameters
  */
  public static DatasetCopyParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatasetCopyParameters.class);
  }

 /**
  * Convert an instance of DatasetCopyParameters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

