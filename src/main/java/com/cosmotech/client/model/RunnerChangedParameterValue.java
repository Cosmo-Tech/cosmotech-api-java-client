/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.2.0
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
 * the difference between the values of a parameter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-15T14:21:57.927336614Z[Etc/UTC]")
public class RunnerChangedParameterValue {
  public static final String SERIALIZED_NAME_PARAMETER_ID = "parameterId";
  @SerializedName(SERIALIZED_NAME_PARAMETER_ID)
  private String parameterId;

  public static final String SERIALIZED_NAME_VAR_TYPE = "varType";
  @SerializedName(SERIALIZED_NAME_VAR_TYPE)
  private String varType;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_COMPARED_VALUE = "comparedValue";
  @SerializedName(SERIALIZED_NAME_COMPARED_VALUE)
  private String comparedValue;

  public RunnerChangedParameterValue() {
  }

  public RunnerChangedParameterValue(
     String parameterId, 
     String varType, 
     String value, 
     String comparedValue
  ) {
    this();
    this.parameterId = parameterId;
    this.varType = varType;
    this.value = value;
    this.comparedValue = comparedValue;
  }

   /**
   * the parameter id the values refer to
   * @return parameterId
  **/
  @javax.annotation.Nullable
  public String getParameterId() {
    return parameterId;
  }



   /**
   * the parameter value type
   * @return varType
  **/
  @javax.annotation.Nullable
  public String getVarType() {
    return varType;
  }



   /**
   * the parameter value for the reference Runner
   * @return value
  **/
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }



   /**
   * the parameter value for the compared Runner
   * @return comparedValue
  **/
  @javax.annotation.Nullable
  public String getComparedValue() {
    return comparedValue;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunnerChangedParameterValue runnerChangedParameterValue = (RunnerChangedParameterValue) o;
    return Objects.equals(this.parameterId, runnerChangedParameterValue.parameterId) &&
        Objects.equals(this.varType, runnerChangedParameterValue.varType) &&
        Objects.equals(this.value, runnerChangedParameterValue.value) &&
        Objects.equals(this.comparedValue, runnerChangedParameterValue.comparedValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameterId, varType, value, comparedValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunnerChangedParameterValue {\n");
    sb.append("    parameterId: ").append(toIndentedString(parameterId)).append("\n");
    sb.append("    varType: ").append(toIndentedString(varType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    comparedValue: ").append(toIndentedString(comparedValue)).append("\n");
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
    openapiFields.add("parameterId");
    openapiFields.add("varType");
    openapiFields.add("value");
    openapiFields.add("comparedValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RunnerChangedParameterValue
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RunnerChangedParameterValue.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RunnerChangedParameterValue is not found in the empty JSON string", RunnerChangedParameterValue.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RunnerChangedParameterValue.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RunnerChangedParameterValue` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("parameterId") != null && !jsonObj.get("parameterId").isJsonNull()) && !jsonObj.get("parameterId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parameterId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parameterId").toString()));
      }
      if ((jsonObj.get("varType") != null && !jsonObj.get("varType").isJsonNull()) && !jsonObj.get("varType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `varType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("varType").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      if ((jsonObj.get("comparedValue") != null && !jsonObj.get("comparedValue").isJsonNull()) && !jsonObj.get("comparedValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comparedValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comparedValue").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RunnerChangedParameterValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RunnerChangedParameterValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RunnerChangedParameterValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RunnerChangedParameterValue.class));

       return (TypeAdapter<T>) new TypeAdapter<RunnerChangedParameterValue>() {
           @Override
           public void write(JsonWriter out, RunnerChangedParameterValue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RunnerChangedParameterValue read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RunnerChangedParameterValue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RunnerChangedParameterValue
  * @throws IOException if the JSON string is invalid with respect to RunnerChangedParameterValue
  */
  public static RunnerChangedParameterValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RunnerChangedParameterValue.class);
  }

 /**
  * Convert an instance of RunnerChangedParameterValue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

