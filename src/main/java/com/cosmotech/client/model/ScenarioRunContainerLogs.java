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
import com.cosmotech.client.model.ScenarioRunContainer;
import com.cosmotech.client.model.ScenarioRunContainerLog;
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
 * logs for a given container
 */
@ApiModel(description = "logs for a given container")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-21T17:44:46.276366+02:00[Europe/Paris]")
public class ScenarioRunContainerLogs {
  public static final String SERIALIZED_NAME_CONTAINER = "container";
  @SerializedName(SERIALIZED_NAME_CONTAINER)
  private ScenarioRunContainer container;

  public static final String SERIALIZED_NAME_COMPUTER = "computer";
  @SerializedName(SERIALIZED_NAME_COMPUTER)
  private String computer;

  public static final String SERIALIZED_NAME_LOGS = "logs";
  @SerializedName(SERIALIZED_NAME_LOGS)
  private List<ScenarioRunContainerLog> logs = null;

  public static final String SERIALIZED_NAME_TEXT_LOG = "textLog";
  @SerializedName(SERIALIZED_NAME_TEXT_LOG)
  private String textLog;


  public ScenarioRunContainerLogs container(ScenarioRunContainer container) {
    
    this.container = container;
    return this;
  }

   /**
   * Get container
   * @return container
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScenarioRunContainer getContainer() {
    return container;
  }


  public void setContainer(ScenarioRunContainer container) {
    this.container = container;
  }


   /**
   * computer/node that&#39;s generating the log
   * @return computer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "computer/node that's generating the log")

  public String getComputer() {
    return computer;
  }




   /**
   * the list of container logs in structured format
   * @return logs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the list of container logs in structured format")

  public List<ScenarioRunContainerLog> getLogs() {
    return logs;
  }




  public ScenarioRunContainerLogs textLog(String textLog) {
    
    this.textLog = textLog;
    return this;
  }

   /**
   * the plain text log if plainText option has been set
   * @return textLog
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the plain text log if plainText option has been set")

  public String getTextLog() {
    return textLog;
  }


  public void setTextLog(String textLog) {
    this.textLog = textLog;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScenarioRunContainerLogs scenarioRunContainerLogs = (ScenarioRunContainerLogs) o;
    return Objects.equals(this.container, scenarioRunContainerLogs.container) &&
        Objects.equals(this.computer, scenarioRunContainerLogs.computer) &&
        Objects.equals(this.logs, scenarioRunContainerLogs.logs) &&
        Objects.equals(this.textLog, scenarioRunContainerLogs.textLog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(container, computer, logs, textLog);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScenarioRunContainerLogs {\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    computer: ").append(toIndentedString(computer)).append("\n");
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
    sb.append("    textLog: ").append(toIndentedString(textLog)).append("\n");
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

