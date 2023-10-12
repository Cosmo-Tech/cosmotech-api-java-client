/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.0.4-SNAPSHOT
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-12T10:00:29.320936458Z[Etc/UTC]")
public class DatasetTwinGraphInfo {
  public static final String SERIALIZED_NAME_JOB_ID = "jobId";
  @SerializedName(SERIALIZED_NAME_JOB_ID)
  private String jobId;

  public static final String SERIALIZED_NAME_DATASET_ID = "datasetId";
  @SerializedName(SERIALIZED_NAME_DATASET_ID)
  private String datasetId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public DatasetTwinGraphInfo() { 
  }

  public DatasetTwinGraphInfo jobId(String jobId) {
    
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


  public DatasetTwinGraphInfo datasetId(String datasetId) {
    
    this.datasetId = datasetId;
    return this;
  }

   /**
   * the Dataset id
   * @return datasetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Dataset id")

  public String getDatasetId() {
    return datasetId;
  }


  public void setDatasetId(String datasetId) {
    this.datasetId = datasetId;
  }


  public DatasetTwinGraphInfo status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Twingraph status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Twingraph status")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetTwinGraphInfo datasetTwinGraphInfo = (DatasetTwinGraphInfo) o;
    return Objects.equals(this.jobId, datasetTwinGraphInfo.jobId) &&
        Objects.equals(this.datasetId, datasetTwinGraphInfo.datasetId) &&
        Objects.equals(this.status, datasetTwinGraphInfo.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, datasetId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetTwinGraphInfo {\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

