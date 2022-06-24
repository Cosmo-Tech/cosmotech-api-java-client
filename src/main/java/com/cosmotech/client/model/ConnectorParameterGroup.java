/*
 * Cosmo Tech Plaform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 1.0.0-rc
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.cosmotech.client.model.ConnectorParameter;
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
 * a connector parameters group
 */
@ApiModel(description = "a connector parameters group")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-24T10:15:29.123907216Z[Etc/UTC]")
public class ConnectorParameterGroup {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<ConnectorParameter> parameters = new ArrayList<ConnectorParameter>();

  public ConnectorParameterGroup() { 
  }

  public ConnectorParameterGroup id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * the connector parameter group id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the connector parameter group id")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ConnectorParameterGroup label(String label) {
    
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


  public ConnectorParameterGroup parameters(List<ConnectorParameter> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public ConnectorParameterGroup addParametersItem(ConnectorParameter parametersItem) {
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * the list of parameters
   * @return parameters
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the list of parameters")

  public List<ConnectorParameter> getParameters() {
    return parameters;
  }


  public void setParameters(List<ConnectorParameter> parameters) {
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
    ConnectorParameterGroup connectorParameterGroup = (ConnectorParameterGroup) o;
    return Objects.equals(this.id, connectorParameterGroup.id) &&
        Objects.equals(this.label, connectorParameterGroup.label) &&
        Objects.equals(this.parameters, connectorParameterGroup.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectorParameterGroup {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

