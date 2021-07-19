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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * a Connector setup
 */
@ApiModel(description = "a Connector setup")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-19T13:02:28.603071475Z[Etc/UTC]")
public class DatasetConnector {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_PARAMETERS_VALUES = "parametersValues";
  @SerializedName(SERIALIZED_NAME_PARAMETERS_VALUES)
  private Map<String, String> parametersValues = null;


  public DatasetConnector id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * the Connector id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Connector id")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public DatasetConnector name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * the Connector name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Connector name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DatasetConnector version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * the Connector version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Connector version")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public DatasetConnector parametersValues(Map<String, String> parametersValues) {
    
    this.parametersValues = parametersValues;
    return this;
  }

  public DatasetConnector putParametersValuesItem(String key, String parametersValuesItem) {
    if (this.parametersValues == null) {
      this.parametersValues = new HashMap<String, String>();
    }
    this.parametersValues.put(key, parametersValuesItem);
    return this;
  }

   /**
   * Get parametersValues
   * @return parametersValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getParametersValues() {
    return parametersValues;
  }


  public void setParametersValues(Map<String, String> parametersValues) {
    this.parametersValues = parametersValues;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetConnector datasetConnector = (DatasetConnector) o;
    return Objects.equals(this.id, datasetConnector.id) &&
        Objects.equals(this.name, datasetConnector.name) &&
        Objects.equals(this.version, datasetConnector.version) &&
        Objects.equals(this.parametersValues, datasetConnector.parametersValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, version, parametersValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetConnector {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    parametersValues: ").append(toIndentedString(parametersValues)).append("\n");
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

