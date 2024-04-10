/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.1.3
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
 * Source job import information
 */
@ApiModel(description = "Source job import information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-10T09:17:15.563644478Z[Etc/UTC]")
public class SourceInfo {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_JOB_ID = "jobId";
  @SerializedName(SERIALIZED_NAME_JOB_ID)
  private String jobId;

  public SourceInfo() { 
  }

  public SourceInfo name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * the source name containing the files to import
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the source name containing the files to import")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SourceInfo location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * the source location containing the files to import
   * @return location
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the source location containing the files to import")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public SourceInfo path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * the source location containing the files to import
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the source location containing the files to import")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public SourceInfo jobId(String jobId) {
    
    this.jobId = jobId;
    return this;
  }

   /**
   * indicate the last import jobId
   * @return jobId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "indicate the last import jobId")

  public String getJobId() {
    return jobId;
  }


  public void setJobId(String jobId) {
    this.jobId = jobId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceInfo sourceInfo = (SourceInfo) o;
    return Objects.equals(this.name, sourceInfo.name) &&
        Objects.equals(this.location, sourceInfo.location) &&
        Objects.equals(this.path, sourceInfo.path) &&
        Objects.equals(this.jobId, sourceInfo.jobId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, location, path, jobId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceInfo {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
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

