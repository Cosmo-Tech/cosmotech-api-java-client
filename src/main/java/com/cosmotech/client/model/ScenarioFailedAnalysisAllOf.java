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

/**
 * a previously ran or running Scenario Analysis with run information
 */
@ApiModel(description = "a previously ran or running Scenario Analysis with run information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-12T19:02:40.729704+02:00[Europe/Paris]")
public class ScenarioFailedAnalysisAllOf {
  public static final String SERIALIZED_NAME_SIMULATION_ID = "simulationId";
  @SerializedName(SERIALIZED_NAME_SIMULATION_ID)
  private String simulationId;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;


   /**
   * the Simulation Run Id
   * @return simulationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Simulation Run Id")

  public String getSimulationId() {
    return simulationId;
  }




   /**
   * the Simulation Run error message
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Simulation Run error message")

  public String getError() {
    return error;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScenarioFailedAnalysisAllOf scenarioFailedAnalysisAllOf = (ScenarioFailedAnalysisAllOf) o;
    return Objects.equals(this.simulationId, scenarioFailedAnalysisAllOf.simulationId) &&
        Objects.equals(this.error, scenarioFailedAnalysisAllOf.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(simulationId, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScenarioFailedAnalysisAllOf {\n");
    sb.append("    simulationId: ").append(toIndentedString(simulationId)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

