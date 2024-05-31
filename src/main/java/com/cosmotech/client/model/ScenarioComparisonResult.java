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
import com.cosmotech.client.model.ScenarioChangedParameterValue;
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
 * the result of the comparison of two scenarios
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-31T13:21:14.970707110Z[Etc/UTC]")
public class ScenarioComparisonResult {
  public static final String SERIALIZED_NAME_SCENARIO_ID = "scenarioId";
  @SerializedName(SERIALIZED_NAME_SCENARIO_ID)
  private String scenarioId;

  public static final String SERIALIZED_NAME_COMPARED_SCENARIO_ID = "comparedScenarioId";
  @SerializedName(SERIALIZED_NAME_COMPARED_SCENARIO_ID)
  private String comparedScenarioId;

  public static final String SERIALIZED_NAME_CHANGED_VALUES = "changedValues";
  @SerializedName(SERIALIZED_NAME_CHANGED_VALUES)
  private List<ScenarioChangedParameterValue> changedValues;

  public ScenarioComparisonResult() {
  }

  public ScenarioComparisonResult(
     String scenarioId, 
     String comparedScenarioId, 
     List<ScenarioChangedParameterValue> changedValues
  ) {
    this();
    this.scenarioId = scenarioId;
    this.comparedScenarioId = comparedScenarioId;
    this.changedValues = changedValues;
  }

   /**
   * the Scenario Id which is the reference for the comparison
   * @return scenarioId
  **/
  @javax.annotation.Nullable
  public String getScenarioId() {
    return scenarioId;
  }



   /**
   * the Scenario Id the reference Scenario is compared to
   * @return comparedScenarioId
  **/
  @javax.annotation.Nullable
  public String getComparedScenarioId() {
    return comparedScenarioId;
  }



   /**
   * the list of changed values for parameters
   * @return changedValues
  **/
  @javax.annotation.Nullable
  public List<ScenarioChangedParameterValue> getChangedValues() {
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
    ScenarioComparisonResult scenarioComparisonResult = (ScenarioComparisonResult) o;
    return Objects.equals(this.scenarioId, scenarioComparisonResult.scenarioId) &&
        Objects.equals(this.comparedScenarioId, scenarioComparisonResult.comparedScenarioId) &&
        Objects.equals(this.changedValues, scenarioComparisonResult.changedValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scenarioId, comparedScenarioId, changedValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScenarioComparisonResult {\n");
    sb.append("    scenarioId: ").append(toIndentedString(scenarioId)).append("\n");
    sb.append("    comparedScenarioId: ").append(toIndentedString(comparedScenarioId)).append("\n");
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
    openapiFields.add("scenarioId");
    openapiFields.add("comparedScenarioId");
    openapiFields.add("changedValues");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ScenarioComparisonResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ScenarioComparisonResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ScenarioComparisonResult is not found in the empty JSON string", ScenarioComparisonResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ScenarioComparisonResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ScenarioComparisonResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("scenarioId") != null && !jsonObj.get("scenarioId").isJsonNull()) && !jsonObj.get("scenarioId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scenarioId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scenarioId").toString()));
      }
      if ((jsonObj.get("comparedScenarioId") != null && !jsonObj.get("comparedScenarioId").isJsonNull()) && !jsonObj.get("comparedScenarioId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comparedScenarioId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comparedScenarioId").toString()));
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
            ScenarioChangedParameterValue.validateJsonElement(jsonArraychangedValues.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ScenarioComparisonResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ScenarioComparisonResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ScenarioComparisonResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ScenarioComparisonResult.class));

       return (TypeAdapter<T>) new TypeAdapter<ScenarioComparisonResult>() {
           @Override
           public void write(JsonWriter out, ScenarioComparisonResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ScenarioComparisonResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ScenarioComparisonResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ScenarioComparisonResult
  * @throws IOException if the JSON string is invalid with respect to ScenarioComparisonResult
  */
  public static ScenarioComparisonResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ScenarioComparisonResult.class);
  }

 /**
  * Convert an instance of ScenarioComparisonResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

