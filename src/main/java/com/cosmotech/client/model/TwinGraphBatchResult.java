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
 * Processing result
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-14T14:08:28.288954497Z[Etc/UTC]")
public class TwinGraphBatchResult {
  public static final String SERIALIZED_NAME_TOTAL_LINES = "totalLines";
  @SerializedName(SERIALIZED_NAME_TOTAL_LINES)
  private Integer totalLines;

  public static final String SERIALIZED_NAME_PROCESSED_LINES = "processedLines";
  @SerializedName(SERIALIZED_NAME_PROCESSED_LINES)
  private Integer processedLines;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<String> errors = new ArrayList<>();

  public TwinGraphBatchResult() {
  }

  public TwinGraphBatchResult totalLines(Integer totalLines) {
    this.totalLines = totalLines;
    return this;
  }

   /**
   * Get totalLines
   * @return totalLines
  **/
  @javax.annotation.Nonnull
  public Integer getTotalLines() {
    return totalLines;
  }

  public void setTotalLines(Integer totalLines) {
    this.totalLines = totalLines;
  }


  public TwinGraphBatchResult processedLines(Integer processedLines) {
    this.processedLines = processedLines;
    return this;
  }

   /**
   * Get processedLines
   * @return processedLines
  **/
  @javax.annotation.Nonnull
  public Integer getProcessedLines() {
    return processedLines;
  }

  public void setProcessedLines(Integer processedLines) {
    this.processedLines = processedLines;
  }


  public TwinGraphBatchResult errors(List<String> errors) {
    this.errors = errors;
    return this;
  }

  public TwinGraphBatchResult addErrorsItem(String errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nonnull
  public List<String> getErrors() {
    return errors;
  }

  public void setErrors(List<String> errors) {
    this.errors = errors;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TwinGraphBatchResult twinGraphBatchResult = (TwinGraphBatchResult) o;
    return Objects.equals(this.totalLines, twinGraphBatchResult.totalLines) &&
        Objects.equals(this.processedLines, twinGraphBatchResult.processedLines) &&
        Objects.equals(this.errors, twinGraphBatchResult.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalLines, processedLines, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TwinGraphBatchResult {\n");
    sb.append("    totalLines: ").append(toIndentedString(totalLines)).append("\n");
    sb.append("    processedLines: ").append(toIndentedString(processedLines)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
    openapiFields.add("totalLines");
    openapiFields.add("processedLines");
    openapiFields.add("errors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("totalLines");
    openapiRequiredFields.add("processedLines");
    openapiRequiredFields.add("errors");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TwinGraphBatchResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TwinGraphBatchResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TwinGraphBatchResult is not found in the empty JSON string", TwinGraphBatchResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TwinGraphBatchResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TwinGraphBatchResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TwinGraphBatchResult.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("errors") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("errors").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `errors` to be an array in the JSON string but got `%s`", jsonObj.get("errors").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TwinGraphBatchResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TwinGraphBatchResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TwinGraphBatchResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TwinGraphBatchResult.class));

       return (TypeAdapter<T>) new TypeAdapter<TwinGraphBatchResult>() {
           @Override
           public void write(JsonWriter out, TwinGraphBatchResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TwinGraphBatchResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TwinGraphBatchResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TwinGraphBatchResult
  * @throws IOException if the JSON string is invalid with respect to TwinGraphBatchResult
  */
  public static TwinGraphBatchResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TwinGraphBatchResult.class);
  }

 /**
  * Convert an instance of TwinGraphBatchResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

