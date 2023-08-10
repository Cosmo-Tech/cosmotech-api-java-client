/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 2.3.12-SNAPSHOT
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
import java.util.List;

/**
 * a connector parameter
 */
@ApiModel(description = "a connector parameter")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-10T08:41:59.041712602Z[Etc/UTC]")
public class ConnectorParameter {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_VALUE_TYPE = "valueType";
  @SerializedName(SERIALIZED_NAME_VALUE_TYPE)
  private String valueType;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<String> options = null;

  public static final String SERIALIZED_NAME_DEFAULT = "default";
  @SerializedName(SERIALIZED_NAME_DEFAULT)
  private String _default;

  public static final String SERIALIZED_NAME_ENV_VAR = "envVar";
  @SerializedName(SERIALIZED_NAME_ENV_VAR)
  private String envVar;

  public ConnectorParameter() { 
  }

  public ConnectorParameter id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * the connector parameter id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the connector parameter id")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ConnectorParameter label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * the list of translated parameter group labels
   * @return label
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the list of translated parameter group labels")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public ConnectorParameter valueType(String valueType) {
    
    this.valueType = valueType;
    return this;
  }

   /**
   * the parameter value type
   * @return valueType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the parameter value type")

  public String getValueType() {
    return valueType;
  }


  public void setValueType(String valueType) {
    this.valueType = valueType;
  }


  public ConnectorParameter options(List<String> options) {
    
    this.options = options;
    return this;
  }

  public ConnectorParameter addOptionsItem(String optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<String>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * the list of available and valid values for the parameter
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the list of available and valid values for the parameter")

  public List<String> getOptions() {
    return options;
  }


  public void setOptions(List<String> options) {
    this.options = options;
  }


  public ConnectorParameter _default(String _default) {
    
    this._default = _default;
    return this;
  }

   /**
   * the default value
   * @return _default
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the default value")

  public String getDefault() {
    return _default;
  }


  public void setDefault(String _default) {
    this._default = _default;
  }


  public ConnectorParameter envVar(String envVar) {
    
    this.envVar = envVar;
    return this;
  }

   /**
   * associated environment variable in connector image
   * @return envVar
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "associated environment variable in connector image")

  public String getEnvVar() {
    return envVar;
  }


  public void setEnvVar(String envVar) {
    this.envVar = envVar;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectorParameter connectorParameter = (ConnectorParameter) o;
    return Objects.equals(this.id, connectorParameter.id) &&
        Objects.equals(this.label, connectorParameter.label) &&
        Objects.equals(this.valueType, connectorParameter.valueType) &&
        Objects.equals(this.options, connectorParameter.options) &&
        Objects.equals(this._default, connectorParameter._default) &&
        Objects.equals(this.envVar, connectorParameter.envVar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label, valueType, options, _default, envVar);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectorParameter {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    envVar: ").append(toIndentedString(envVar)).append("\n");
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

