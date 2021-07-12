/*
 * Cosmo Tech Plaform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 0.0.8-SNAPSHOT
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * a Parameter Group for a Run Template
 */
@ApiModel(description = "a Parameter Group for a Run Template")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-12T08:46:28.501213764Z[Etc/UTC]")
public class RunTemplateParameterGroup {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = new HashMap<String, String>();

  public static final String SERIALIZED_NAME_IS_TABLE = "isTable";
  @SerializedName(SERIALIZED_NAME_IS_TABLE)
  private Boolean isTable;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private Map<String, Object> options = null;

  public static final String SERIALIZED_NAME_PARENT_ID = "parentId";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private String parentId;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<String> parameters = new ArrayList<String>();


  public RunTemplateParameterGroup id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * the Parameter Group id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "the Parameter Group id")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public RunTemplateParameterGroup labels(Map<String, String> labels) {
    
    this.labels = labels;
    return this;
  }

  public RunTemplateParameterGroup putLabelsItem(String key, String labelsItem) {
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * a translated label with key as ISO 639-1 code
   * @return labels
  **/
  @ApiModelProperty(required = true, value = "a translated label with key as ISO 639-1 code")

  public Map<String, String> getLabels() {
    return labels;
  }


  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public RunTemplateParameterGroup isTable(Boolean isTable) {
    
    this.isTable = isTable;
    return this;
  }

   /**
   * does the group define a table
   * @return isTable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "does the group define a table")

  public Boolean getIsTable() {
    return isTable;
  }


  public void setIsTable(Boolean isTable) {
    this.isTable = isTable;
  }


  public RunTemplateParameterGroup options(Map<String, Object> options) {
    
    this.options = options;
    return this;
  }

  public RunTemplateParameterGroup putOptionsItem(String key, Object optionsItem) {
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


  public RunTemplateParameterGroup parentId(String parentId) {
    
    this.parentId = parentId;
    return this;
  }

   /**
   * the Run Template Group parent Id
   * @return parentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Run Template Group parent Id")

  public String getParentId() {
    return parentId;
  }


  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  public RunTemplateParameterGroup parameters(List<String> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public RunTemplateParameterGroup addParametersItem(String parametersItem) {
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * an ordered list of Run Template Parameters
   * @return parameters
  **/
  @ApiModelProperty(required = true, value = "an ordered list of Run Template Parameters")

  public List<String> getParameters() {
    return parameters;
  }


  public void setParameters(List<String> parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunTemplateParameterGroup runTemplateParameterGroup = (RunTemplateParameterGroup) o;
    return Objects.equals(this.id, runTemplateParameterGroup.id) &&
        Objects.equals(this.labels, runTemplateParameterGroup.labels) &&
        Objects.equals(this.isTable, runTemplateParameterGroup.isTable) &&
        Objects.equals(this.options, runTemplateParameterGroup.options) &&
        Objects.equals(this.parentId, runTemplateParameterGroup.parentId) &&
        Objects.equals(this.parameters, runTemplateParameterGroup.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, labels, isTable, options, parentId, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunTemplateParameterGroup {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    isTable: ").append(toIndentedString(isTable)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

