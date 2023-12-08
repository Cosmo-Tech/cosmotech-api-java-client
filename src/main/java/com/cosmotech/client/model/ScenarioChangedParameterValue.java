/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.0.14-dev
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

/**
 * the difference between the values of a parameter
 */
@ApiModel(description = "the difference between the values of a parameter")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-08T08:24:41.395897938Z[Etc/UTC]")
public class ScenarioChangedParameterValue {
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

  public ScenarioChangedParameterValue() { 
  }

  
  public ScenarioChangedParameterValue(
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
  @ApiModelProperty(value = "the parameter id the values refer to")

  public String getParameterId() {
    return parameterId;
  }




   /**
   * the parameter value type
   * @return varType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the parameter value type")

  public String getVarType() {
    return varType;
  }




   /**
   * the parameter value for the reference Scenario
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the parameter value for the reference Scenario")

  public String getValue() {
    return value;
  }




   /**
   * the parameter value for the compared Scenario
   * @return comparedValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the parameter value for the compared Scenario")

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
    ScenarioChangedParameterValue scenarioChangedParameterValue = (ScenarioChangedParameterValue) o;
    return Objects.equals(this.parameterId, scenarioChangedParameterValue.parameterId) &&
        Objects.equals(this.varType, scenarioChangedParameterValue.varType) &&
        Objects.equals(this.value, scenarioChangedParameterValue.value) &&
        Objects.equals(this.comparedValue, scenarioChangedParameterValue.comparedValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameterId, varType, value, comparedValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScenarioChangedParameterValue {\n");
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

}

