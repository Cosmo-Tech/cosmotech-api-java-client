/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.1.7
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.cosmotech.client.model.RunnerChangedParameterValue;
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
 * the result of the comparison of two runners
 */
@ApiModel(description = "the result of the comparison of two runners")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-30T15:12:08.256807733Z[Etc/UTC]")
public class RunnerComparisonResult {
  public static final String SERIALIZED_NAME_RUNNER_ID = "runnerId";
  @SerializedName(SERIALIZED_NAME_RUNNER_ID)
  private String runnerId;

  public static final String SERIALIZED_NAME_COMPARED_RUNNER_ID = "comparedRunnerId";
  @SerializedName(SERIALIZED_NAME_COMPARED_RUNNER_ID)
  private String comparedRunnerId;

  public static final String SERIALIZED_NAME_CHANGED_VALUES = "changedValues";
  @SerializedName(SERIALIZED_NAME_CHANGED_VALUES)
  private List<RunnerChangedParameterValue> changedValues = null;

  public RunnerComparisonResult() { 
  }

  
  public RunnerComparisonResult(
     String runnerId, 
     String comparedRunnerId, 
     List<RunnerChangedParameterValue> changedValues
  ) {
    this();
    this.runnerId = runnerId;
    this.comparedRunnerId = comparedRunnerId;
    this.changedValues = changedValues;
  }

   /**
   * the Runner Id which is the reference for the comparison
   * @return runnerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Runner Id which is the reference for the comparison")

  public String getRunnerId() {
    return runnerId;
  }




   /**
   * the Runner Id the reference Runner is compared to
   * @return comparedRunnerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Runner Id the reference Runner is compared to")

  public String getComparedRunnerId() {
    return comparedRunnerId;
  }




   /**
   * the list of changed values for parameters
   * @return changedValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the list of changed values for parameters")

  public List<RunnerChangedParameterValue> getChangedValues() {
    return changedValues;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunnerComparisonResult runnerComparisonResult = (RunnerComparisonResult) o;
    return Objects.equals(this.runnerId, runnerComparisonResult.runnerId) &&
        Objects.equals(this.comparedRunnerId, runnerComparisonResult.comparedRunnerId) &&
        Objects.equals(this.changedValues, runnerComparisonResult.changedValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runnerId, comparedRunnerId, changedValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunnerComparisonResult {\n");
    sb.append("    runnerId: ").append(toIndentedString(runnerId)).append("\n");
    sb.append("    comparedRunnerId: ").append(toIndentedString(comparedRunnerId)).append("\n");
    sb.append("    changedValues: ").append(toIndentedString(changedValues)).append("\n");
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

