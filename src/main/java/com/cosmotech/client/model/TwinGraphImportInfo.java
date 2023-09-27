/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.0.3-test
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
 * a twin graph query in cypher language
 */
@ApiModel(description = "a twin graph query in cypher language")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-27T13:37:53.342702267Z[Etc/UTC]")
public class TwinGraphImportInfo {
  public static final String SERIALIZED_NAME_JOB_ID = "jobId";
  @SerializedName(SERIALIZED_NAME_JOB_ID)
  private String jobId;

  public static final String SERIALIZED_NAME_GRAPH_NAME = "graphName";
  @SerializedName(SERIALIZED_NAME_GRAPH_NAME)
  private String graphName;

  public TwinGraphImportInfo() { 
  }

  public TwinGraphImportInfo jobId(String jobId) {
    
    this.jobId = jobId;
    return this;
  }

   /**
   * the import job id
   * @return jobId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the import job id")

  public String getJobId() {
    return jobId;
  }


  public void setJobId(String jobId) {
    this.jobId = jobId;
  }


  public TwinGraphImportInfo graphName(String graphName) {
    
    this.graphName = graphName;
    return this;
  }

   /**
   * the twin graph name
   * @return graphName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the twin graph name")

  public String getGraphName() {
    return graphName;
  }


  public void setGraphName(String graphName) {
    this.graphName = graphName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TwinGraphImportInfo twinGraphImportInfo = (TwinGraphImportInfo) o;
    return Objects.equals(this.jobId, twinGraphImportInfo.jobId) &&
        Objects.equals(this.graphName, twinGraphImportInfo.graphName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, graphName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TwinGraphImportInfo {\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    graphName: ").append(toIndentedString(graphName)).append("\n");
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

