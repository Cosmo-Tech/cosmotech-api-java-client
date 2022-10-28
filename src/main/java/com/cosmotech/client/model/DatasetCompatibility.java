/*
 * Cosmo Tech Plaform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 2.0.4-SNAPSHOT
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
 * a Dataset compatibility constraint to a Solution version open range
 */
@ApiModel(description = "a Dataset compatibility constraint to a Solution version open range")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-28T09:39:03.416204717Z[Etc/UTC]")
public class DatasetCompatibility {
  public static final String SERIALIZED_NAME_SOLUTION_KEY = "solutionKey";
  @SerializedName(SERIALIZED_NAME_SOLUTION_KEY)
  private String solutionKey;

  public static final String SERIALIZED_NAME_MINIMUM_VERSION = "minimumVersion";
  @SerializedName(SERIALIZED_NAME_MINIMUM_VERSION)
  private String minimumVersion;

  public static final String SERIALIZED_NAME_MAXIMUM_VERSION = "maximumVersion";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_VERSION)
  private String maximumVersion;

  public DatasetCompatibility() { 
  }

  public DatasetCompatibility solutionKey(String solutionKey) {
    
    this.solutionKey = solutionKey;
    return this;
  }

   /**
   * the Solution key which group Solution versions
   * @return solutionKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the Solution key which group Solution versions")

  public String getSolutionKey() {
    return solutionKey;
  }


  public void setSolutionKey(String solutionKey) {
    this.solutionKey = solutionKey;
  }


  public DatasetCompatibility minimumVersion(String minimumVersion) {
    
    this.minimumVersion = minimumVersion;
    return this;
  }

   /**
   * the Solution minimum version compatibility (version included)
   * @return minimumVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Solution minimum version compatibility (version included)")

  public String getMinimumVersion() {
    return minimumVersion;
  }


  public void setMinimumVersion(String minimumVersion) {
    this.minimumVersion = minimumVersion;
  }


  public DatasetCompatibility maximumVersion(String maximumVersion) {
    
    this.maximumVersion = maximumVersion;
    return this;
  }

   /**
   * the Solution maximum version compatibility (version included)
   * @return maximumVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Solution maximum version compatibility (version included)")

  public String getMaximumVersion() {
    return maximumVersion;
  }


  public void setMaximumVersion(String maximumVersion) {
    this.maximumVersion = maximumVersion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetCompatibility datasetCompatibility = (DatasetCompatibility) o;
    return Objects.equals(this.solutionKey, datasetCompatibility.solutionKey) &&
        Objects.equals(this.minimumVersion, datasetCompatibility.minimumVersion) &&
        Objects.equals(this.maximumVersion, datasetCompatibility.maximumVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(solutionKey, minimumVersion, maximumVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetCompatibility {\n");
    sb.append("    solutionKey: ").append(toIndentedString(solutionKey)).append("\n");
    sb.append("    minimumVersion: ").append(toIndentedString(minimumVersion)).append("\n");
    sb.append("    maximumVersion: ").append(toIndentedString(maximumVersion)).append("\n");
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

