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
 * Configuration of scenario runs deletion automatic mecanism
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-13T09:42:25.561258220Z[Etc/UTC]")
public class DeleteHistoricalData {
  public static final String SERIALIZED_NAME_ENABLE = "enable";
  @SerializedName(SERIALIZED_NAME_ENABLE)
  private Boolean enable = true;

  public static final String SERIALIZED_NAME_POLL_FREQUENCY = "pollFrequency";
  @SerializedName(SERIALIZED_NAME_POLL_FREQUENCY)
  private Integer pollFrequency = 10000;

  public static final String SERIALIZED_NAME_TIME_OUT = "timeOut";
  @SerializedName(SERIALIZED_NAME_TIME_OUT)
  private Integer timeOut = 28800;

  public DeleteHistoricalData() {
  }

  public DeleteHistoricalData enable(Boolean enable) {
    this.enable = enable;
    return this;
  }

   /**
   * Activate or Deactivate historical data deletion
   * @return enable
  **/
  @javax.annotation.Nonnull
  public Boolean getEnable() {
    return enable;
  }

  public void setEnable(Boolean enable) {
    this.enable = enable;
  }


  public DeleteHistoricalData pollFrequency(Integer pollFrequency) {
    this.pollFrequency = pollFrequency;
    return this;
  }

   /**
   * define the polling frequency of scenario run status (in millis)
   * @return pollFrequency
  **/
  @javax.annotation.Nullable
  public Integer getPollFrequency() {
    return pollFrequency;
  }

  public void setPollFrequency(Integer pollFrequency) {
    this.pollFrequency = pollFrequency;
  }


  public DeleteHistoricalData timeOut(Integer timeOut) {
    this.timeOut = timeOut;
    return this;
  }

   /**
   * define the polling timeout
   * @return timeOut
  **/
  @javax.annotation.Nullable
  public Integer getTimeOut() {
    return timeOut;
  }

  public void setTimeOut(Integer timeOut) {
    this.timeOut = timeOut;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteHistoricalData deleteHistoricalData = (DeleteHistoricalData) o;
    return Objects.equals(this.enable, deleteHistoricalData.enable) &&
        Objects.equals(this.pollFrequency, deleteHistoricalData.pollFrequency) &&
        Objects.equals(this.timeOut, deleteHistoricalData.timeOut);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, pollFrequency, timeOut);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteHistoricalData {\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    pollFrequency: ").append(toIndentedString(pollFrequency)).append("\n");
    sb.append("    timeOut: ").append(toIndentedString(timeOut)).append("\n");
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
    openapiFields.add("enable");
    openapiFields.add("pollFrequency");
    openapiFields.add("timeOut");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("enable");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DeleteHistoricalData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DeleteHistoricalData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeleteHistoricalData is not found in the empty JSON string", DeleteHistoricalData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DeleteHistoricalData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeleteHistoricalData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DeleteHistoricalData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeleteHistoricalData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeleteHistoricalData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeleteHistoricalData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeleteHistoricalData.class));

       return (TypeAdapter<T>) new TypeAdapter<DeleteHistoricalData>() {
           @Override
           public void write(JsonWriter out, DeleteHistoricalData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeleteHistoricalData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeleteHistoricalData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeleteHistoricalData
  * @throws IOException if the JSON string is invalid with respect to DeleteHistoricalData
  */
  public static DeleteHistoricalData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeleteHistoricalData.class);
  }

 /**
  * Convert an instance of DeleteHistoricalData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

