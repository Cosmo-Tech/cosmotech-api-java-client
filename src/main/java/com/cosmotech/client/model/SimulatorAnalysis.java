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
import com.cosmotech.client.model.AnalysisParameterGroup;
import com.cosmotech.client.model.AnalysisResourceStorage;
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
 * a Simulator Analysis run template
 */
@ApiModel(description = "a Simulator Analysis run template")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T12:42:31.121121+02:00[Europe/Paris]")
public class SimulatorAnalysis {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SIMULATION = "simulation";
  @SerializedName(SERIALIZED_NAME_SIMULATION)
  private String simulation;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_COMPUTE_SIZE = "computeSize";
  @SerializedName(SERIALIZED_NAME_COMPUTE_SIZE)
  private String computeSize;

  public static final String SERIALIZED_NAME_PARAMETERS_HANDLER_RESOURCE = "parametersHandlerResource";
  @SerializedName(SERIALIZED_NAME_PARAMETERS_HANDLER_RESOURCE)
  private AnalysisResourceStorage parametersHandlerResource;

  public static final String SERIALIZED_NAME_DATASET_VALIDATOR_RESOURCE = "datasetValidatorResource";
  @SerializedName(SERIALIZED_NAME_DATASET_VALIDATOR_RESOURCE)
  private AnalysisResourceStorage datasetValidatorResource;

  public static final String SERIALIZED_NAME_CUSTOM_DRIVER_RESOURCE = "customDriverResource";
  @SerializedName(SERIALIZED_NAME_CUSTOM_DRIVER_RESOURCE)
  private AnalysisResourceStorage customDriverResource;

  public static final String SERIALIZED_NAME_DATASET_SCHEMA_RESOURCE = "datasetSchemaResource";
  @SerializedName(SERIALIZED_NAME_DATASET_SCHEMA_RESOURCE)
  private AnalysisResourceStorage datasetSchemaResource;

  public static final String SERIALIZED_NAME_PARAMETER_GROUPS = "parameterGroups";
  @SerializedName(SERIALIZED_NAME_PARAMETER_GROUPS)
  private List<AnalysisParameterGroup> parameterGroups = null;


  public SimulatorAnalysis id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * the Simulator Analysis id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "the Simulator Analysis id")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public SimulatorAnalysis name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * the Simulator Analysis name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "the Simulator Analysis name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SimulatorAnalysis description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * the Simulator Analysis description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Simulator Analysis description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public SimulatorAnalysis simulation(String simulation) {
    
    this.simulation = simulation;
    return this;
  }

   /**
   * the simulation name
   * @return simulation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the simulation name")

  public String getSimulation() {
    return simulation;
  }


  public void setSimulation(String simulation) {
    this.simulation = simulation;
  }


  public SimulatorAnalysis tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public SimulatorAnalysis addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * the list of Simulator Analysis tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the list of Simulator Analysis tags")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public SimulatorAnalysis computeSize(String computeSize) {
    
    this.computeSize = computeSize;
    return this;
  }

   /**
   * the compute size needed for this Analysis. Standard sizes are basic and highcpu. Default is basic
   * @return computeSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the compute size needed for this Analysis. Standard sizes are basic and highcpu. Default is basic")

  public String getComputeSize() {
    return computeSize;
  }


  public void setComputeSize(String computeSize) {
    this.computeSize = computeSize;
  }


  public SimulatorAnalysis parametersHandlerResource(AnalysisResourceStorage parametersHandlerResource) {
    
    this.parametersHandlerResource = parametersHandlerResource;
    return this;
  }

   /**
   * Get parametersHandlerResource
   * @return parametersHandlerResource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AnalysisResourceStorage getParametersHandlerResource() {
    return parametersHandlerResource;
  }


  public void setParametersHandlerResource(AnalysisResourceStorage parametersHandlerResource) {
    this.parametersHandlerResource = parametersHandlerResource;
  }


  public SimulatorAnalysis datasetValidatorResource(AnalysisResourceStorage datasetValidatorResource) {
    
    this.datasetValidatorResource = datasetValidatorResource;
    return this;
  }

   /**
   * Get datasetValidatorResource
   * @return datasetValidatorResource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AnalysisResourceStorage getDatasetValidatorResource() {
    return datasetValidatorResource;
  }


  public void setDatasetValidatorResource(AnalysisResourceStorage datasetValidatorResource) {
    this.datasetValidatorResource = datasetValidatorResource;
  }


  public SimulatorAnalysis customDriverResource(AnalysisResourceStorage customDriverResource) {
    
    this.customDriverResource = customDriverResource;
    return this;
  }

   /**
   * Get customDriverResource
   * @return customDriverResource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AnalysisResourceStorage getCustomDriverResource() {
    return customDriverResource;
  }


  public void setCustomDriverResource(AnalysisResourceStorage customDriverResource) {
    this.customDriverResource = customDriverResource;
  }


  public SimulatorAnalysis datasetSchemaResource(AnalysisResourceStorage datasetSchemaResource) {
    
    this.datasetSchemaResource = datasetSchemaResource;
    return this;
  }

   /**
   * Get datasetSchemaResource
   * @return datasetSchemaResource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AnalysisResourceStorage getDatasetSchemaResource() {
    return datasetSchemaResource;
  }


  public void setDatasetSchemaResource(AnalysisResourceStorage datasetSchemaResource) {
    this.datasetSchemaResource = datasetSchemaResource;
  }


  public SimulatorAnalysis parameterGroups(List<AnalysisParameterGroup> parameterGroups) {
    
    this.parameterGroups = parameterGroups;
    return this;
  }

  public SimulatorAnalysis addParameterGroupsItem(AnalysisParameterGroup parameterGroupsItem) {
    if (this.parameterGroups == null) {
      this.parameterGroups = new ArrayList<AnalysisParameterGroup>();
    }
    this.parameterGroups.add(parameterGroupsItem);
    return this;
  }

   /**
   * the list of parameters groups for the Analysis
   * @return parameterGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the list of parameters groups for the Analysis")

  public List<AnalysisParameterGroup> getParameterGroups() {
    return parameterGroups;
  }


  public void setParameterGroups(List<AnalysisParameterGroup> parameterGroups) {
    this.parameterGroups = parameterGroups;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimulatorAnalysis simulatorAnalysis = (SimulatorAnalysis) o;
    return Objects.equals(this.id, simulatorAnalysis.id) &&
        Objects.equals(this.name, simulatorAnalysis.name) &&
        Objects.equals(this.description, simulatorAnalysis.description) &&
        Objects.equals(this.simulation, simulatorAnalysis.simulation) &&
        Objects.equals(this.tags, simulatorAnalysis.tags) &&
        Objects.equals(this.computeSize, simulatorAnalysis.computeSize) &&
        Objects.equals(this.parametersHandlerResource, simulatorAnalysis.parametersHandlerResource) &&
        Objects.equals(this.datasetValidatorResource, simulatorAnalysis.datasetValidatorResource) &&
        Objects.equals(this.customDriverResource, simulatorAnalysis.customDriverResource) &&
        Objects.equals(this.datasetSchemaResource, simulatorAnalysis.datasetSchemaResource) &&
        Objects.equals(this.parameterGroups, simulatorAnalysis.parameterGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, simulation, tags, computeSize, parametersHandlerResource, datasetValidatorResource, customDriverResource, datasetSchemaResource, parameterGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimulatorAnalysis {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    simulation: ").append(toIndentedString(simulation)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    computeSize: ").append(toIndentedString(computeSize)).append("\n");
    sb.append("    parametersHandlerResource: ").append(toIndentedString(parametersHandlerResource)).append("\n");
    sb.append("    datasetValidatorResource: ").append(toIndentedString(datasetValidatorResource)).append("\n");
    sb.append("    customDriverResource: ").append(toIndentedString(customDriverResource)).append("\n");
    sb.append("    datasetSchemaResource: ").append(toIndentedString(datasetSchemaResource)).append("\n");
    sb.append("    parameterGroups: ").append(toIndentedString(parameterGroups)).append("\n");
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

