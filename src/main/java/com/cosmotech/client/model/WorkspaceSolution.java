/*
 * Cosmo Tech Plaform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.0.0-dev
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * the Workspace Solution configuration
 */
@ApiModel(description = "the Workspace Solution configuration")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-21T07:34:58.115912961Z[Etc/UTC]")
public class WorkspaceSolution {
  public static final String SERIALIZED_NAME_SOLUTION_ID = "solutionId";
  @SerializedName(SERIALIZED_NAME_SOLUTION_ID)
  private String solutionId;

  public static final String SERIALIZED_NAME_RUN_TEMPLATE_FILTER = "runTemplateFilter";
  @SerializedName(SERIALIZED_NAME_RUN_TEMPLATE_FILTER)
  private List<String> runTemplateFilter = null;

  public static final String SERIALIZED_NAME_DEFAULT_RUN_TEMPLATE_DATASET = "defaultRunTemplateDataset";
  @SerializedName(SERIALIZED_NAME_DEFAULT_RUN_TEMPLATE_DATASET)
  private Map<String, Object> defaultRunTemplateDataset = null;

  public WorkspaceSolution() { 
  }

  public WorkspaceSolution solutionId(String solutionId) {
    
    this.solutionId = solutionId;
    return this;
  }

   /**
   * the Solution Id attached to this workspace
   * @return solutionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Solution Id attached to this workspace")

  public String getSolutionId() {
    return solutionId;
  }


  public void setSolutionId(String solutionId) {
    this.solutionId = solutionId;
  }


  public WorkspaceSolution runTemplateFilter(List<String> runTemplateFilter) {
    
    this.runTemplateFilter = runTemplateFilter;
    return this;
  }

  public WorkspaceSolution addRunTemplateFilterItem(String runTemplateFilterItem) {
    if (this.runTemplateFilter == null) {
      this.runTemplateFilter = new ArrayList<String>();
    }
    this.runTemplateFilter.add(runTemplateFilterItem);
    return this;
  }

   /**
   * the list of Solution Run Template Id to filter
   * @return runTemplateFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the list of Solution Run Template Id to filter")

  public List<String> getRunTemplateFilter() {
    return runTemplateFilter;
  }


  public void setRunTemplateFilter(List<String> runTemplateFilter) {
    this.runTemplateFilter = runTemplateFilter;
  }


  public WorkspaceSolution defaultRunTemplateDataset(Map<String, Object> defaultRunTemplateDataset) {
    
    this.defaultRunTemplateDataset = defaultRunTemplateDataset;
    return this;
  }

  public WorkspaceSolution putDefaultRunTemplateDatasetItem(String key, Object defaultRunTemplateDatasetItem) {
    if (this.defaultRunTemplateDataset == null) {
      this.defaultRunTemplateDataset = new HashMap<String, Object>();
    }
    this.defaultRunTemplateDataset.put(key, defaultRunTemplateDatasetItem);
    return this;
  }

   /**
   * a map of RunTemplateId/DatasetId to set a default dataset for a Run Template
   * @return defaultRunTemplateDataset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "a map of RunTemplateId/DatasetId to set a default dataset for a Run Template")

  public Map<String, Object> getDefaultRunTemplateDataset() {
    return defaultRunTemplateDataset;
  }


  public void setDefaultRunTemplateDataset(Map<String, Object> defaultRunTemplateDataset) {
    this.defaultRunTemplateDataset = defaultRunTemplateDataset;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkspaceSolution workspaceSolution = (WorkspaceSolution) o;
    return Objects.equals(this.solutionId, workspaceSolution.solutionId) &&
        Objects.equals(this.runTemplateFilter, workspaceSolution.runTemplateFilter) &&
        Objects.equals(this.defaultRunTemplateDataset, workspaceSolution.defaultRunTemplateDataset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(solutionId, runTemplateFilter, defaultRunTemplateDataset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceSolution {\n");
    sb.append("    solutionId: ").append(toIndentedString(solutionId)).append("\n");
    sb.append("    runTemplateFilter: ").append(toIndentedString(runTemplateFilter)).append("\n");
    sb.append("    defaultRunTemplateDataset: ").append(toIndentedString(defaultRunTemplateDataset)).append("\n");
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

