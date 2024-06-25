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
 * the value of a Solution Run Template parameter for a Runner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-25T13:28:00.347802700Z[Etc/UTC]")
public class RunnerRunTemplateParameterValue {
  public static final String SERIALIZED_NAME_PARAMETER_ID = "parameterId";
  @SerializedName(SERIALIZED_NAME_PARAMETER_ID)
  private String parameterId;

  public static final String SERIALIZED_NAME_VAR_TYPE = "varType";
  @SerializedName(SERIALIZED_NAME_VAR_TYPE)
  private String varType;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_IS_INHERITED = "isInherited";
  @SerializedName(SERIALIZED_NAME_IS_INHERITED)
  private Boolean isInherited;

  public RunnerRunTemplateParameterValue() {
  }

  public RunnerRunTemplateParameterValue(
     String varType
  ) {
    this();
    this.varType = varType;
  }

  public RunnerRunTemplateParameterValue parameterId(String parameterId) {
    this.parameterId = parameterId;
    return this;
  }

   /**
   * the parameter Id
   * @return parameterId
  **/
  @javax.annotation.Nonnull
  public String getParameterId() {
    return parameterId;
  }

  public void setParameterId(String parameterId) {
    this.parameterId = parameterId;
  }


   /**
   * the parameter value type
   * @return varType
  **/
  @javax.annotation.Nullable
  public String getVarType() {
    return varType;
  }



  public RunnerRunTemplateParameterValue value(String value) {
    this.value = value;
    return this;
  }

   /**
   * the parameter value
   * @return value
  **/
  @javax.annotation.Nonnull
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  public RunnerRunTemplateParameterValue isInherited(Boolean isInherited) {
    this.isInherited = isInherited;
    return this;
  }

   /**
   * whether or not the value is inherited from parent or has been changed
   * @return isInherited
  **/
  @javax.annotation.Nullable
  public Boolean getIsInherited() {
    return isInherited;
  }

  public void setIsInherited(Boolean isInherited) {
    this.isInherited = isInherited;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunnerRunTemplateParameterValue runnerRunTemplateParameterValue = (RunnerRunTemplateParameterValue) o;
    return Objects.equals(this.parameterId, runnerRunTemplateParameterValue.parameterId) &&
        Objects.equals(this.varType, runnerRunTemplateParameterValue.varType) &&
        Objects.equals(this.value, runnerRunTemplateParameterValue.value) &&
        Objects.equals(this.isInherited, runnerRunTemplateParameterValue.isInherited);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameterId, varType, value, isInherited);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunnerRunTemplateParameterValue {\n");
    sb.append("    parameterId: ").append(toIndentedString(parameterId)).append("\n");
    sb.append("    varType: ").append(toIndentedString(varType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    isInherited: ").append(toIndentedString(isInherited)).append("\n");
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
    openapiFields.add("isInherited");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("parameterId");
    openapiRequiredFields.add("value");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RunnerRunTemplateParameterValue
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RunnerRunTemplateParameterValue.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RunnerRunTemplateParameterValue is not found in the empty JSON string", RunnerRunTemplateParameterValue.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RunnerRunTemplateParameterValue.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RunnerRunTemplateParameterValue` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RunnerRunTemplateParameterValue.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("parameterId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parameterId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parameterId").toString()));
      }
      if ((jsonObj.get("varType") != null && !jsonObj.get("varType").isJsonNull()) && !jsonObj.get("varType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `varType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("varType").toString()));
      }
      if (!jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RunnerRunTemplateParameterValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RunnerRunTemplateParameterValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RunnerRunTemplateParameterValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RunnerRunTemplateParameterValue.class));

       return (TypeAdapter<T>) new TypeAdapter<RunnerRunTemplateParameterValue>() {
           @Override
           public void write(JsonWriter out, RunnerRunTemplateParameterValue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RunnerRunTemplateParameterValue read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RunnerRunTemplateParameterValue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RunnerRunTemplateParameterValue
  * @throws IOException if the JSON string is invalid with respect to RunnerRunTemplateParameterValue
  */
  public static RunnerRunTemplateParameterValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RunnerRunTemplateParameterValue.class);
  }

 /**
  * Convert an instance of RunnerRunTemplateParameterValue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

