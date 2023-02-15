/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 2.3.1-dev
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.cosmotech.client.model.ScenarioChangedParameterValue;
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
 * the result of the comparison of two scenarios
 */
@ApiModel(description = "the result of the comparison of two scenarios")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-15T10:42:18.335296895Z[Etc/UTC]")
public class ScenarioComparisonResult {
  public static final String SERIALIZED_NAME_SCENARIO_ID = "scenarioId";
  @SerializedName(SERIALIZED_NAME_SCENARIO_ID)
  private String scenarioId;

  public static final String SERIALIZED_NAME_COMPARED_SCENARIO_ID = "comparedScenarioId";
  @SerializedName(SERIALIZED_NAME_COMPARED_SCENARIO_ID)
  private String comparedScenarioId;

  public static final String SERIALIZED_NAME_CHANGED_VALUES = "changedValues";
  @SerializedName(SERIALIZED_NAME_CHANGED_VALUES)
  private List<ScenarioChangedParameterValue> changedValues = null;

  public ScenarioComparisonResult() { 
  }

  
  public ScenarioComparisonResult(
     String scenarioId, 
     String comparedScenarioId, 
     List<ScenarioChangedParameterValue> changedValues
  ) {
    this();
    this.scenarioId = scenarioId;
    this.comparedScenarioId = comparedScenarioId;
    this.changedValues = changedValues;
  }

   /**
   * the Scenario Id which is the reference for the comparison
   * @return scenarioId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Scenario Id which is the reference for the comparison")

  public String getScenarioId() {
    return scenarioId;
  }




   /**
   * the Scenario Id the reference Scenario is compared to
   * @return comparedScenarioId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Scenario Id the reference Scenario is compared to")

  public String getComparedScenarioId() {
    return comparedScenarioId;
  }




   /**
   * the list of changed values for parameters
   * @return changedValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the list of changed values for parameters")

  public List<ScenarioChangedParameterValue> getChangedValues() {
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
    ScenarioComparisonResult scenarioComparisonResult = (ScenarioComparisonResult) o;
    return Objects.equals(this.scenarioId, scenarioComparisonResult.scenarioId) &&
        Objects.equals(this.comparedScenarioId, scenarioComparisonResult.comparedScenarioId) &&
        Objects.equals(this.changedValues, scenarioComparisonResult.changedValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scenarioId, comparedScenarioId, changedValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScenarioComparisonResult {\n");
    sb.append("    scenarioId: ").append(toIndentedString(scenarioId)).append("\n");
    sb.append("    comparedScenarioId: ").append(toIndentedString(comparedScenarioId)).append("\n");
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

