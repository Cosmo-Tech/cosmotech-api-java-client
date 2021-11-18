/*
 * Cosmo Tech Plaform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 0.0.10-SNAPSHOT
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * a Run Template Parameter
 */
@ApiModel(description = "a Run Template Parameter")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-18T16:35:51.326202070Z[Etc/UTC]")
public class RunTemplateParameter {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = new HashMap<String, String>();

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
  private Map<String, Object> options = null;


  public RunTemplateParameter id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * the Parameter id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the Parameter id")

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
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * a translated label with key as ISO 639-1 code
   * @return labels
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "a translated label with key as ISO 639-1 code")

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
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the variable type for the parameter. Basic types or special type %DATASETID%")

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
  @ApiModelProperty(value = "the default value for this parameter")

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
  @ApiModelProperty(value = "the minimum value for this parameter")

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
  @ApiModelProperty(value = "the maximum value for this parameter")

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
  @ApiModelProperty(value = "a regex to validate the value")

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
      this.options = new HashMap<String, Object>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

   /**
   * freeform options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "freeform options")

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

}

