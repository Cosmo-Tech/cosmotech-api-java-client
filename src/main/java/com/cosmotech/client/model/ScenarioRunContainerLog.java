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
 * a container log line
 */
@ApiModel(description = "a container log line")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-22T12:27:09.848905+02:00[Europe/Paris]")
public class ScenarioRunContainerLog {
  public static final String SERIALIZED_NAME_TIME_GENERATED = "timeGenerated";
  @SerializedName(SERIALIZED_NAME_TIME_GENERATED)
  private String timeGenerated;

  public static final String SERIALIZED_NAME_ENTRY_SOURCE = "entrySource";
  @SerializedName(SERIALIZED_NAME_ENTRY_SOURCE)
  private String entrySource;

  public static final String SERIALIZED_NAME_LOG_ENTRY = "logEntry";
  @SerializedName(SERIALIZED_NAME_LOG_ENTRY)
  private String logEntry;


   /**
   * date and time the record was created
   * @return timeGenerated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "date and time the record was created")

  public String getTimeGenerated() {
    return timeGenerated;
  }




   /**
   * source of the log line. Possible values are stdout or stderr
   * @return entrySource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "source of the log line. Possible values are stdout or stderr")

  public String getEntrySource() {
    return entrySource;
  }




   /**
   * actual log line
   * @return logEntry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "actual log line")

  public String getLogEntry() {
    return logEntry;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScenarioRunContainerLog scenarioRunContainerLog = (ScenarioRunContainerLog) o;
    return Objects.equals(this.timeGenerated, scenarioRunContainerLog.timeGenerated) &&
        Objects.equals(this.entrySource, scenarioRunContainerLog.entrySource) &&
        Objects.equals(this.logEntry, scenarioRunContainerLog.logEntry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeGenerated, entrySource, logEntry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScenarioRunContainerLog {\n");
    sb.append("    timeGenerated: ").append(toIndentedString(timeGenerated)).append("\n");
    sb.append("    entrySource: ").append(toIndentedString(entrySource)).append("\n");
    sb.append("    logEntry: ").append(toIndentedString(logEntry)).append("\n");
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

