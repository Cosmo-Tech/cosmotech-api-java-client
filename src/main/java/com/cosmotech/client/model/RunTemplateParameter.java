/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.2.6
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
 * a Run Template Parameter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-18T12:26:15.435424359Z[Etc/UTC]")
public class RunTemplateParameter {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = new HashMap<>();

  public static final String SERIALIZED_NAME_VAR_TYPE = "varType";
  @SerializedName(SERIALIZED_NAME_VAR_TYPE)
  private String varType;

  public static final String SERIALIZED_NAME_DEFAULT_VALUE = "defaultValue";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VALUE)
  private String defaultValue;

  public static final String SERIALIZED_NAME_MIN_VALUE = "minValue";
  @SerializedName(SERIALIZED_NAME_MIN_VALUE)
  private String minValue;

  public static final String SERIALIZED_NAME_MAX_VALUE = "maxValue";
  @SerializedName(SERIALIZED_NAME_MAX_VALUE)
  private String maxValue;

  public static final String SERIALIZED_NAME_REGEX_VALIDATION = "regexValidation";
  @SerializedName(SERIALIZED_NAME_REGEX_VALIDATION)
  private String regexValidation;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private Map<String, Object> options = new HashMap<>();

  public RunTemplateParameter() {
  }

  public RunTemplateParameter id(String id) {
    this.id = id;
    return this;
  }

   /**
   * the Parameter id
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public RunTemplateParameter labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public RunTemplateParameter putLabelsItem(String key, String labelsItem) {
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


  public RunTemplateParameter varType(String varType) {
    this.varType = varType;
    return this;
  }

   /**
   * the variable type for the parameter. Basic types or special type %DATASETID%
   * @return varType
  **/
  @javax.annotation.Nullable
  public String getVarType() {
    return varType;
  }

  public void setVarType(String varType) {
    this.varType = varType;
  }


  public RunTemplateParameter defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * the default value for this parameter
   * @return defaultValue
  **/
  @javax.annotation.Nullable
  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }


  public RunTemplateParameter minValue(String minValue) {
    this.minValue = minValue;
    return this;
  }

   /**
   * the minimum value for this parameter
   * @return minValue
  **/
  @javax.annotation.Nullable
  public String getMinValue() {
    return minValue;
  }

  public void setMinValue(String minValue) {
    this.minValue = minValue;
  }


  public RunTemplateParameter maxValue(String maxValue) {
    this.maxValue = maxValue;
    return this;
  }

   /**
   * the maximum value for this parameter
   * @return maxValue
  **/
  @javax.annotation.Nullable
  public String getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(String maxValue) {
    this.maxValue = maxValue;
  }


  public RunTemplateParameter regexValidation(String regexValidation) {
    this.regexValidation = regexValidation;
    return this;
  }

   /**
   * a regex to validate the value
   * @return regexValidation
  **/
  @javax.annotation.Nullable
  public String getRegexValidation() {
    return regexValidation;
  }

  public void setRegexValidation(String regexValidation) {
    this.regexValidation = regexValidation;
  }


  public RunTemplateParameter options(Map<String, Object> options) {
    this.options = options;
    return this;
  }

  public RunTemplateParameter putOptionsItem(String key, Object optionsItem) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunTemplateParameter runTemplateParameter = (RunTemplateParameter) o;
    return Objects.equals(this.id, runTemplateParameter.id) &&
        Objects.equals(this.labels, runTemplateParameter.labels) &&
        Objects.equals(this.varType, runTemplateParameter.varType) &&
        Objects.equals(this.defaultValue, runTemplateParameter.defaultValue) &&
        Objects.equals(this.minValue, runTemplateParameter.minValue) &&
        Objects.equals(this.maxValue, runTemplateParameter.maxValue) &&
        Objects.equals(this.regexValidation, runTemplateParameter.regexValidation) &&
        Objects.equals(this.options, runTemplateParameter.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, labels, varType, defaultValue, minValue, maxValue, regexValidation, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunTemplateParameter {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    varType: ").append(toIndentedString(varType)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    minValue: ").append(toIndentedString(minValue)).append("\n");
    sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
    sb.append("    regexValidation: ").append(toIndentedString(regexValidation)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("labels");
    openapiFields.add("varType");
    openapiFields.add("defaultValue");
    openapiFields.add("minValue");
    openapiFields.add("maxValue");
    openapiFields.add("regexValidation");
    openapiFields.add("options");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RunTemplateParameter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RunTemplateParameter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RunTemplateParameter is not found in the empty JSON string", RunTemplateParameter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RunTemplateParameter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RunTemplateParameter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RunTemplateParameter.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("varType") != null && !jsonObj.get("varType").isJsonNull()) && !jsonObj.get("varType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `varType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("varType").toString()));
      }
      if ((jsonObj.get("defaultValue") != null && !jsonObj.get("defaultValue").isJsonNull()) && !jsonObj.get("defaultValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `defaultValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("defaultValue").toString()));
      }
      if ((jsonObj.get("minValue") != null && !jsonObj.get("minValue").isJsonNull()) && !jsonObj.get("minValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `minValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("minValue").toString()));
      }
      if ((jsonObj.get("maxValue") != null && !jsonObj.get("maxValue").isJsonNull()) && !jsonObj.get("maxValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maxValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maxValue").toString()));
      }
      if ((jsonObj.get("regexValidation") != null && !jsonObj.get("regexValidation").isJsonNull()) && !jsonObj.get("regexValidation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `regexValidation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("regexValidation").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RunTemplateParameter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RunTemplateParameter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RunTemplateParameter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RunTemplateParameter.class));

       return (TypeAdapter<T>) new TypeAdapter<RunTemplateParameter>() {
           @Override
           public void write(JsonWriter out, RunTemplateParameter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RunTemplateParameter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RunTemplateParameter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RunTemplateParameter
  * @throws IOException if the JSON string is invalid with respect to RunTemplateParameter
  */
  public static RunTemplateParameter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RunTemplateParameter.class);
  }

 /**
  * Convert an instance of RunTemplateParameter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

