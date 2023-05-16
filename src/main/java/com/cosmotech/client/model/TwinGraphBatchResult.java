/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 2.4.2-SNAPSHOT
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
import java.util.ArrayList;
import java.util.List;

/**
 * Processing result
 */
@ApiModel(description = "Processing result")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-16T12:50:56.292120877Z[Etc/UTC]")
public class TwinGraphBatchResult {
  public static final String SERIALIZED_NAME_TOTAL_LINES = "totalLines";
  @SerializedName(SERIALIZED_NAME_TOTAL_LINES)
  private Integer totalLines;

  public static final String SERIALIZED_NAME_PROCESSED_LINES = "processedLines";
  @SerializedName(SERIALIZED_NAME_PROCESSED_LINES)
  private Integer processedLines;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<String> errors = new ArrayList<String>();

  public TwinGraphBatchResult() { 
  }

  public TwinGraphBatchResult totalLines(Integer totalLines) {
    
    this.totalLines = totalLines;
    return this;
  }

   /**
   * Get totalLines
   * @return totalLines
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getTotalLines() {
    return totalLines;
  }


  public void setTotalLines(Integer totalLines) {
    this.totalLines = totalLines;
  }


  public TwinGraphBatchResult processedLines(Integer processedLines) {
    
    this.processedLines = processedLines;
    return this;
  }

   /**
   * Get processedLines
   * @return processedLines
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getProcessedLines() {
    return processedLines;
  }


  public void setProcessedLines(Integer processedLines) {
    this.processedLines = processedLines;
  }


  public TwinGraphBatchResult errors(List<String> errors) {
    
    this.errors = errors;
    return this;
  }

  public TwinGraphBatchResult addErrorsItem(String errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getErrors() {
    return errors;
  }


  public void setErrors(List<String> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TwinGraphBatchResult twinGraphBatchResult = (TwinGraphBatchResult) o;
    return Objects.equals(this.totalLines, twinGraphBatchResult.totalLines) &&
        Objects.equals(this.processedLines, twinGraphBatchResult.processedLines) &&
        Objects.equals(this.errors, twinGraphBatchResult.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalLines, processedLines, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TwinGraphBatchResult {\n");
    sb.append("    totalLines: ").append(toIndentedString(totalLines)).append("\n");
    sb.append("    processedLines: ").append(toIndentedString(processedLines)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

