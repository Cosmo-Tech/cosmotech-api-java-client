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
import com.cosmotech.client.model.ScenarioRunContainerLogs;
import com.cosmotech.client.model.ScenarioRunLogsOptions;
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
 * the scenariorun logs returned by all containers
 */
@ApiModel(description = "the scenariorun logs returned by all containers")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-20T11:19:04.423677+02:00[Europe/Paris]")
public class ScenarioRunLogs {
  public static final String SERIALIZED_NAME_SCENARIORUN_ID = "scenariorunId";
  @SerializedName(SERIALIZED_NAME_SCENARIORUN_ID)
  private String scenariorunId;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private ScenarioRunLogsOptions options;

  public static final String SERIALIZED_NAME_INIT_LOGS = "initLogs";
  @SerializedName(SERIALIZED_NAME_INIT_LOGS)
  private List<ScenarioRunContainerLogs> initLogs = null;

  public static final String SERIALIZED_NAME_MAIN_LOGS = "mainLogs";
  @SerializedName(SERIALIZED_NAME_MAIN_LOGS)
  private ScenarioRunContainerLogs mainLogs;


   /**
   * the ScenarioRun Id
   * @return scenariorunId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the ScenarioRun Id")

  public String getScenariorunId() {
    return scenariorunId;
  }




  public ScenarioRunLogs options(ScenarioRunLogsOptions options) {
    
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScenarioRunLogsOptions getOptions() {
    return options;
  }


  public void setOptions(ScenarioRunLogsOptions options) {
    this.options = options;
  }


   /**
   * the list of scenariorun logs for init containers
   * @return initLogs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the list of scenariorun logs for init containers")

  public List<ScenarioRunContainerLogs> getInitLogs() {
    return initLogs;
  }




  public ScenarioRunLogs mainLogs(ScenarioRunContainerLogs mainLogs) {
    
    this.mainLogs = mainLogs;
    return this;
  }

   /**
   * Get mainLogs
   * @return mainLogs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScenarioRunContainerLogs getMainLogs() {
    return mainLogs;
  }


  public void setMainLogs(ScenarioRunContainerLogs mainLogs) {
    this.mainLogs = mainLogs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScenarioRunLogs scenarioRunLogs = (ScenarioRunLogs) o;
    return Objects.equals(this.scenariorunId, scenarioRunLogs.scenariorunId) &&
        Objects.equals(this.options, scenarioRunLogs.options) &&
        Objects.equals(this.initLogs, scenarioRunLogs.initLogs) &&
        Objects.equals(this.mainLogs, scenarioRunLogs.mainLogs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scenariorunId, options, initLogs, mainLogs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScenarioRunLogs {\n");
    sb.append("    scenariorunId: ").append(toIndentedString(scenariorunId)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    initLogs: ").append(toIndentedString(initLogs)).append("\n");
    sb.append("    mainLogs: ").append(toIndentedString(mainLogs)).append("\n");
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

