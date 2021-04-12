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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * the Workspace Simulator configuration
 */
@ApiModel(description = "the Workspace Simulator configuration")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-12T19:02:40.729704+02:00[Europe/Paris]")
public class WorkspaceSimulator {
  public static final String SERIALIZED_NAME_SIMULATOR_ID = "simulatorId";
  @SerializedName(SERIALIZED_NAME_SIMULATOR_ID)
  private String simulatorId;

  public static final String SERIALIZED_NAME_SIMULATOR_ANALYSIS_FILTER = "simulatorAnalysisFilter";
  @SerializedName(SERIALIZED_NAME_SIMULATOR_ANALYSIS_FILTER)
  private List<String> simulatorAnalysisFilter = null;

  public static final String SERIALIZED_NAME_DEFAULT_ANALYSIS_DATASET = "defaultAnalysisDataset";
  @SerializedName(SERIALIZED_NAME_DEFAULT_ANALYSIS_DATASET)
  private Map<String, Object> defaultAnalysisDataset = null;


  public WorkspaceSimulator simulatorId(String simulatorId) {
    
    this.simulatorId = simulatorId;
    return this;
  }

   /**
   * the Simulator Id attached to this workspace
   * @return simulatorId
  **/
  @ApiModelProperty(required = true, value = "the Simulator Id attached to this workspace")

  public String getSimulatorId() {
    return simulatorId;
  }


  public void setSimulatorId(String simulatorId) {
    this.simulatorId = simulatorId;
  }


  public WorkspaceSimulator simulatorAnalysisFilter(List<String> simulatorAnalysisFilter) {
    
    this.simulatorAnalysisFilter = simulatorAnalysisFilter;
    return this;
  }

  public WorkspaceSimulator addSimulatorAnalysisFilterItem(String simulatorAnalysisFilterItem) {
    if (this.simulatorAnalysisFilter == null) {
      this.simulatorAnalysisFilter = new ArrayList<String>();
    }
    this.simulatorAnalysisFilter.add(simulatorAnalysisFilterItem);
    return this;
  }

   /**
   * the list of Simulator Analysis Id to filter
   * @return simulatorAnalysisFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the list of Simulator Analysis Id to filter")

  public List<String> getSimulatorAnalysisFilter() {
    return simulatorAnalysisFilter;
  }


  public void setSimulatorAnalysisFilter(List<String> simulatorAnalysisFilter) {
    this.simulatorAnalysisFilter = simulatorAnalysisFilter;
  }


  public WorkspaceSimulator defaultAnalysisDataset(Map<String, Object> defaultAnalysisDataset) {
    
    this.defaultAnalysisDataset = defaultAnalysisDataset;
    return this;
  }

  public WorkspaceSimulator putDefaultAnalysisDatasetItem(String key, Object defaultAnalysisDatasetItem) {
    if (this.defaultAnalysisDataset == null) {
      this.defaultAnalysisDataset = new HashMap<String, Object>();
    }
    this.defaultAnalysisDataset.put(key, defaultAnalysisDatasetItem);
    return this;
  }

   /**
   * a map of AnalysisId/DatasetId to set a default dataset for an analysis
   * @return defaultAnalysisDataset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "a map of AnalysisId/DatasetId to set a default dataset for an analysis")

  public Map<String, Object> getDefaultAnalysisDataset() {
    return defaultAnalysisDataset;
  }


  public void setDefaultAnalysisDataset(Map<String, Object> defaultAnalysisDataset) {
    this.defaultAnalysisDataset = defaultAnalysisDataset;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkspaceSimulator workspaceSimulator = (WorkspaceSimulator) o;
    return Objects.equals(this.simulatorId, workspaceSimulator.simulatorId) &&
        Objects.equals(this.simulatorAnalysisFilter, workspaceSimulator.simulatorAnalysisFilter) &&
        Objects.equals(this.defaultAnalysisDataset, workspaceSimulator.defaultAnalysisDataset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(simulatorId, simulatorAnalysisFilter, defaultAnalysisDataset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceSimulator {\n");
    sb.append("    simulatorId: ").append(toIndentedString(simulatorId)).append("\n");
    sb.append("    simulatorAnalysisFilter: ").append(toIndentedString(simulatorAnalysisFilter)).append("\n");
    sb.append("    defaultAnalysisDataset: ").append(toIndentedString(defaultAnalysisDataset)).append("\n");
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

