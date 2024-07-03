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
 * a twin graph query in cypher language
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-03T15:45:45.646859636Z[Etc/UTC]")
public class DatasetTwinGraphInfo {
  public static final String SERIALIZED_NAME_JOB_ID = "jobId";
  @SerializedName(SERIALIZED_NAME_JOB_ID)
  private String jobId;

  public static final String SERIALIZED_NAME_DATASET_ID = "datasetId";
  @SerializedName(SERIALIZED_NAME_DATASET_ID)
  private String datasetId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public DatasetTwinGraphInfo() {
  }

  public DatasetTwinGraphInfo jobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

   /**
   * the import job id
   * @return jobId
  **/
  @javax.annotation.Nullable
  public String getJobId() {
    return jobId;
  }

  public void setJobId(String jobId) {
    this.jobId = jobId;
  }


  public DatasetTwinGraphInfo datasetId(String datasetId) {
    this.datasetId = datasetId;
    return this;
  }

   /**
   * the Dataset id
   * @return datasetId
  **/
  @javax.annotation.Nullable
  public String getDatasetId() {
    return datasetId;
  }

  public void setDatasetId(String datasetId) {
    this.datasetId = datasetId;
  }


  public DatasetTwinGraphInfo status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Twingraph status
   * @return status
  **/
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetTwinGraphInfo datasetTwinGraphInfo = (DatasetTwinGraphInfo) o;
    return Objects.equals(this.jobId, datasetTwinGraphInfo.jobId) &&
        Objects.equals(this.datasetId, datasetTwinGraphInfo.datasetId) &&
        Objects.equals(this.status, datasetTwinGraphInfo.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, datasetId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetTwinGraphInfo {\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("jobId");
    openapiFields.add("datasetId");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DatasetTwinGraphInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DatasetTwinGraphInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatasetTwinGraphInfo is not found in the empty JSON string", DatasetTwinGraphInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DatasetTwinGraphInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DatasetTwinGraphInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("jobId") != null && !jsonObj.get("jobId").isJsonNull()) && !jsonObj.get("jobId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jobId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jobId").toString()));
      }
      if ((jsonObj.get("datasetId") != null && !jsonObj.get("datasetId").isJsonNull()) && !jsonObj.get("datasetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datasetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datasetId").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatasetTwinGraphInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatasetTwinGraphInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatasetTwinGraphInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatasetTwinGraphInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DatasetTwinGraphInfo>() {
           @Override
           public void write(JsonWriter out, DatasetTwinGraphInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DatasetTwinGraphInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DatasetTwinGraphInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DatasetTwinGraphInfo
  * @throws IOException if the JSON string is invalid with respect to DatasetTwinGraphInfo
  */
  public static DatasetTwinGraphInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatasetTwinGraphInfo.class);
  }

 /**
  * Convert an instance of DatasetTwinGraphInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

