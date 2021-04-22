/*
 * Cosmo Tech Plaform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 0.0.1-SNAPSHOT
 * 
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-22T12:34:21.716581+02:00[Europe/Paris]")
public class RunTemplateParameter {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, Object> labels = new HashMap<String, Object>();

  public static final String SERIALIZED_NAME_VAR_TYPE = "varType";
  @SerializedName(SERIALIZED_NAME_VAR_TYPE)
  private String varType;

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
  @ApiModelProperty(required = true, value = "the Parameter id")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public RunTemplateParameter labels(Map<String, Object> labels) {
    
    this.labels = labels;
    return this;
  }

  public RunTemplateParameter putLabelsItem(String key, Object labelsItem) {
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * a translated label with key as ISO 639-1 code
   * @return labels
  **/
  @ApiModelProperty(required = true, value = "a translated label with key as ISO 639-1 code")

  public Map<String, Object> getLabels() {
    return labels;
  }


  public void setLabels(Map<String, Object> labels) {
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
  @ApiModelProperty(required = true, value = "the variable type for the parameter. Basic types or special type %DATASETID%")

  public String getVarType() {
    return varType;
  }


  public void setVarType(String varType) {
    this.varType = varType;
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
        Objects.equals(this.options, runTemplateParameter.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, labels, varType, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunTemplateParameter {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    varType: ").append(toIndentedString(varType)).append("\n");
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

