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
import com.cosmotech.client.model.RunnerChangedParameterValue;
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
 * the result of the comparison of two runners
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-31T13:55:35.129487759Z[Etc/UTC]")
public class RunnerComparisonResult {
  public static final String SERIALIZED_NAME_RUNNER_ID = "runnerId";
  @SerializedName(SERIALIZED_NAME_RUNNER_ID)
  private String runnerId;

  public static final String SERIALIZED_NAME_COMPARED_RUNNER_ID = "comparedRunnerId";
  @SerializedName(SERIALIZED_NAME_COMPARED_RUNNER_ID)
  private String comparedRunnerId;

  public static final String SERIALIZED_NAME_CHANGED_VALUES = "changedValues";
  @SerializedName(SERIALIZED_NAME_CHANGED_VALUES)
  private List<RunnerChangedParameterValue> changedValues;

  public RunnerComparisonResult() {
  }

  public RunnerComparisonResult(
     String runnerId, 
     String comparedRunnerId, 
     List<RunnerChangedParameterValue> changedValues
  ) {
    this();
    this.runnerId = runnerId;
    this.comparedRunnerId = comparedRunnerId;
    this.changedValues = changedValues;
  }

   /**
   * the Runner Id which is the reference for the comparison
   * @return runnerId
  **/
  @javax.annotation.Nullable
  public String getRunnerId() {
    return runnerId;
  }



   /**
   * the Runner Id the reference Runner is compared to
   * @return comparedRunnerId
  **/
  @javax.annotation.Nullable
  public String getComparedRunnerId() {
    return comparedRunnerId;
  }



   /**
   * the list of changed values for parameters
   * @return changedValues
  **/
  @javax.annotation.Nullable
  public List<RunnerChangedParameterValue> getChangedValues() {
    return changedValues;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunnerComparisonResult runnerComparisonResult = (RunnerComparisonResult) o;
    return Objects.equals(this.runnerId, runnerComparisonResult.runnerId) &&
        Objects.equals(this.comparedRunnerId, runnerComparisonResult.comparedRunnerId) &&
        Objects.equals(this.changedValues, runnerComparisonResult.changedValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runnerId, comparedRunnerId, changedValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunnerComparisonResult {\n");
    sb.append("    runnerId: ").append(toIndentedString(runnerId)).append("\n");
    sb.append("    comparedRunnerId: ").append(toIndentedString(comparedRunnerId)).append("\n");
    sb.append("    changedValues: ").append(toIndentedString(changedValues)).append("\n");
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
    openapiFields.add("runnerId");
    openapiFields.add("comparedRunnerId");
    openapiFields.add("changedValues");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RunnerComparisonResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RunnerComparisonResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RunnerComparisonResult is not found in the empty JSON string", RunnerComparisonResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RunnerComparisonResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RunnerComparisonResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("runnerId") != null && !jsonObj.get("runnerId").isJsonNull()) && !jsonObj.get("runnerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `runnerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("runnerId").toString()));
      }
      if ((jsonObj.get("comparedRunnerId") != null && !jsonObj.get("comparedRunnerId").isJsonNull()) && !jsonObj.get("comparedRunnerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comparedRunnerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comparedRunnerId").toString()));
      }
      if (jsonObj.get("changedValues") != null && !jsonObj.get("changedValues").isJsonNull()) {
        JsonArray jsonArraychangedValues = jsonObj.getAsJsonArray("changedValues");
        if (jsonArraychangedValues != null) {
          // ensure the json data is an array
          if (!jsonObj.get("changedValues").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `changedValues` to be an array in the JSON string but got `%s`", jsonObj.get("changedValues").toString()));
          }

          // validate the optional field `changedValues` (array)
          for (int i = 0; i < jsonArraychangedValues.size(); i++) {
            RunnerChangedParameterValue.validateJsonElement(jsonArraychangedValues.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RunnerComparisonResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RunnerComparisonResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RunnerComparisonResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RunnerComparisonResult.class));

       return (TypeAdapter<T>) new TypeAdapter<RunnerComparisonResult>() {
           @Override
           public void write(JsonWriter out, RunnerComparisonResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RunnerComparisonResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RunnerComparisonResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RunnerComparisonResult
  * @throws IOException if the JSON string is invalid with respect to RunnerComparisonResult
  */
  public static RunnerComparisonResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RunnerComparisonResult.class);
  }

 /**
  * Convert an instance of RunnerComparisonResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

