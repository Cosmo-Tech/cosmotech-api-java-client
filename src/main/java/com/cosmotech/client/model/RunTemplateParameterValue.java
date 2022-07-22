/*
 * Cosmo Tech Plaform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 1.0.2-SNAPSHOT
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
 * the value of Analysis parameter for a Scenario for this ScenarioRun
 */
@ApiModel(description = "the value of Analysis parameter for a Scenario for this ScenarioRun")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-22T12:41:57.230305676Z[Etc/UTC]")
public class RunTemplateParameterValue {
  public static final String SERIALIZED_NAME_PARAMETER_ID = "parameterId";
  @SerializedName(SERIALIZED_NAME_PARAMETER_ID)
  private String parameterId;

  public static final String SERIALIZED_NAME_VAR_TYPE = "varType";
  @SerializedName(SERIALIZED_NAME_VAR_TYPE)
  private String varType;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public RunTemplateParameterValue() { 
  }

  
  public RunTemplateParameterValue(
     String varType
  ) {
    this();
    this.varType = varType;
  }

  public RunTemplateParameterValue parameterId(String parameterId) {
    
    this.parameterId = parameterId;
    return this;
  }

   /**
   * the parameter Id
   * @return parameterId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the parameter Id")

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
  @ApiModelProperty(value = "the parameter value type")

  public String getVarType() {
    return varType;
  }




  public RunTemplateParameterValue value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * the parameter value
   * @return value
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the parameter value")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunTemplateParameterValue runTemplateParameterValue = (RunTemplateParameterValue) o;
    return Objects.equals(this.parameterId, runTemplateParameterValue.parameterId) &&
        Objects.equals(this.varType, runTemplateParameterValue.varType) &&
        Objects.equals(this.value, runTemplateParameterValue.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameterId, varType, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunTemplateParameterValue {\n");
    sb.append("    parameterId: ").append(toIndentedString(parameterId)).append("\n");
    sb.append("    varType: ").append(toIndentedString(varType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

