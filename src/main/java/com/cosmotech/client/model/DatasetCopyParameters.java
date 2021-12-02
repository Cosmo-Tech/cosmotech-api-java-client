/*
 * Cosmo Tech Plaform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 0.0.11-SNAPSHOT
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
 * the Dataset Copy Parameters
 */
@ApiModel(description = "the Dataset Copy Parameters")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-02T10:55:59.729085509Z[Etc/UTC]")
public class DatasetCopyParameters {
  public static final String SERIALIZED_NAME_SOURCE_ID = "sourceId";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private String sourceId;

  public static final String SERIALIZED_NAME_TARGET_ID = "targetId";
  @SerializedName(SERIALIZED_NAME_TARGET_ID)
  private String targetId;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private Map<String, Object> options = null;


  public DatasetCopyParameters sourceId(String sourceId) {
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * the source Dataset id
   * @return sourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the source Dataset id")

  public String getSourceId() {
    return sourceId;
  }


  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  public DatasetCopyParameters targetId(String targetId) {
    
    this.targetId = targetId;
    return this;
  }

   /**
   * the target Dataset id
   * @return targetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the target Dataset id")

  public String getTargetId() {
    return targetId;
  }


  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }


  public DatasetCopyParameters options(Map<String, Object> options) {
    
    this.options = options;
    return this;
  }

  public DatasetCopyParameters putOptionsItem(String key, Object optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<String, Object>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

   /**
   * freeform options to path to connectors
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "freeform options to path to connectors")

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
    DatasetCopyParameters datasetCopyParameters = (DatasetCopyParameters) o;
    return Objects.equals(this.sourceId, datasetCopyParameters.sourceId) &&
        Objects.equals(this.targetId, datasetCopyParameters.targetId) &&
        Objects.equals(this.options, datasetCopyParameters.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, targetId, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetCopyParameters {\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
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

