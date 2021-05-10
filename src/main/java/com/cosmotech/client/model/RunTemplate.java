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
import com.cosmotech.client.model.RunTemplateResourceStorage;
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
 * a Solution Run Template
 */
@ApiModel(description = "a Solution Run Template")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-07T19:33:04.431588+02:00[Europe/Paris]")
public class RunTemplate {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CSM_SIMULATION = "csmSimulation";
  @SerializedName(SERIALIZED_NAME_CSM_SIMULATION)
  private String csmSimulation;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_COMPUTE_SIZE = "computeSize";
  @SerializedName(SERIALIZED_NAME_COMPUTE_SIZE)
  private String computeSize;

  public static final String SERIALIZED_NAME_PARAMETERS_HANDLER_RESOURCE = "parametersHandlerResource";
  @SerializedName(SERIALIZED_NAME_PARAMETERS_HANDLER_RESOURCE)
  private RunTemplateResourceStorage parametersHandlerResource;

  public static final String SERIALIZED_NAME_DATASET_VALIDATOR_RESOURCE = "datasetValidatorResource";
  @SerializedName(SERIALIZED_NAME_DATASET_VALIDATOR_RESOURCE)
  private RunTemplateResourceStorage datasetValidatorResource;

  public static final String SERIALIZED_NAME_PRE_RUN_RESOURCE = "preRunResource";
  @SerializedName(SERIALIZED_NAME_PRE_RUN_RESOURCE)
  private RunTemplateResourceStorage preRunResource;

  public static final String SERIALIZED_NAME_ENGINE_RESOURCE = "engineResource";
  @SerializedName(SERIALIZED_NAME_ENGINE_RESOURCE)
  private RunTemplateResourceStorage engineResource;

  public static final String SERIALIZED_NAME_POST_RUN_RESOURCE = "postRunResource";
  @SerializedName(SERIALIZED_NAME_POST_RUN_RESOURCE)
  private RunTemplateResourceStorage postRunResource;

  public static final String SERIALIZED_NAME_SEND_DATASETS_TO_DATA_WAREHOUSE = "sendDatasetsToDataWarehouse";
  @SerializedName(SERIALIZED_NAME_SEND_DATASETS_TO_DATA_WAREHOUSE)
  private Boolean sendDatasetsToDataWarehouse = true;

  public static final String SERIALIZED_NAME_SEND_INPUT_PARAMETERS_TO_DATA_WAREHOUSE = "sendInputParametersToDataWarehouse";
  @SerializedName(SERIALIZED_NAME_SEND_INPUT_PARAMETERS_TO_DATA_WAREHOUSE)
  private Boolean sendInputParametersToDataWarehouse = true;

  public static final String SERIALIZED_NAME_PARAMETER_GROUPS = "parameterGroups";
  @SerializedName(SERIALIZED_NAME_PARAMETER_GROUPS)
  private List<String> parameterGroups = null;


  public RunTemplate id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * the Solution Run Template id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "the Solution Run Template id")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public RunTemplate name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * the Run Template name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "the Run Template name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public RunTemplate description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * the Run Template description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Run Template description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public RunTemplate csmSimulation(String csmSimulation) {
    
    this.csmSimulation = csmSimulation;
    return this;
  }

   /**
   * the Cosmo Tech simulation name. This information is send to the Engine. Mandatory information if no Engine is defined
   * @return csmSimulation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Cosmo Tech simulation name. This information is send to the Engine. Mandatory information if no Engine is defined")

  public String getCsmSimulation() {
    return csmSimulation;
  }


  public void setCsmSimulation(String csmSimulation) {
    this.csmSimulation = csmSimulation;
  }


  public RunTemplate tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public RunTemplate addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * the list of Run Template tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the list of Run Template tags")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public RunTemplate computeSize(String computeSize) {
    
    this.computeSize = computeSize;
    return this;
  }

   /**
   * the compute size needed for this Run Template. Standard sizes are basic and highcpu. Default is basic
   * @return computeSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the compute size needed for this Run Template. Standard sizes are basic and highcpu. Default is basic")

  public String getComputeSize() {
    return computeSize;
  }


  public void setComputeSize(String computeSize) {
    this.computeSize = computeSize;
  }


  public RunTemplate parametersHandlerResource(RunTemplateResourceStorage parametersHandlerResource) {
    
    this.parametersHandlerResource = parametersHandlerResource;
    return this;
  }

   /**
   * Get parametersHandlerResource
   * @return parametersHandlerResource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RunTemplateResourceStorage getParametersHandlerResource() {
    return parametersHandlerResource;
  }


  public void setParametersHandlerResource(RunTemplateResourceStorage parametersHandlerResource) {
    this.parametersHandlerResource = parametersHandlerResource;
  }


  public RunTemplate datasetValidatorResource(RunTemplateResourceStorage datasetValidatorResource) {
    
    this.datasetValidatorResource = datasetValidatorResource;
    return this;
  }

   /**
   * Get datasetValidatorResource
   * @return datasetValidatorResource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RunTemplateResourceStorage getDatasetValidatorResource() {
    return datasetValidatorResource;
  }


  public void setDatasetValidatorResource(RunTemplateResourceStorage datasetValidatorResource) {
    this.datasetValidatorResource = datasetValidatorResource;
  }


  public RunTemplate preRunResource(RunTemplateResourceStorage preRunResource) {
    
    this.preRunResource = preRunResource;
    return this;
  }

   /**
   * Get preRunResource
   * @return preRunResource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RunTemplateResourceStorage getPreRunResource() {
    return preRunResource;
  }


  public void setPreRunResource(RunTemplateResourceStorage preRunResource) {
    this.preRunResource = preRunResource;
  }


  public RunTemplate engineResource(RunTemplateResourceStorage engineResource) {
    
    this.engineResource = engineResource;
    return this;
  }

   /**
   * Get engineResource
   * @return engineResource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RunTemplateResourceStorage getEngineResource() {
    return engineResource;
  }


  public void setEngineResource(RunTemplateResourceStorage engineResource) {
    this.engineResource = engineResource;
  }


  public RunTemplate postRunResource(RunTemplateResourceStorage postRunResource) {
    
    this.postRunResource = postRunResource;
    return this;
  }

   /**
   * Get postRunResource
   * @return postRunResource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RunTemplateResourceStorage getPostRunResource() {
    return postRunResource;
  }


  public void setPostRunResource(RunTemplateResourceStorage postRunResource) {
    this.postRunResource = postRunResource;
  }


  public RunTemplate sendDatasetsToDataWarehouse(Boolean sendDatasetsToDataWarehouse) {
    
    this.sendDatasetsToDataWarehouse = sendDatasetsToDataWarehouse;
    return this;
  }

   /**
   * whether or not the Datasets values are send to the DataWarehouse prior to Simulation Run
   * @return sendDatasetsToDataWarehouse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "whether or not the Datasets values are send to the DataWarehouse prior to Simulation Run")

  public Boolean getSendDatasetsToDataWarehouse() {
    return sendDatasetsToDataWarehouse;
  }


  public void setSendDatasetsToDataWarehouse(Boolean sendDatasetsToDataWarehouse) {
    this.sendDatasetsToDataWarehouse = sendDatasetsToDataWarehouse;
  }


  public RunTemplate sendInputParametersToDataWarehouse(Boolean sendInputParametersToDataWarehouse) {
    
    this.sendInputParametersToDataWarehouse = sendInputParametersToDataWarehouse;
    return this;
  }

   /**
   * whether or not the input parameters values are send to the DataWarehouse prior to Simulation Run
   * @return sendInputParametersToDataWarehouse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "whether or not the input parameters values are send to the DataWarehouse prior to Simulation Run")

  public Boolean getSendInputParametersToDataWarehouse() {
    return sendInputParametersToDataWarehouse;
  }


  public void setSendInputParametersToDataWarehouse(Boolean sendInputParametersToDataWarehouse) {
    this.sendInputParametersToDataWarehouse = sendInputParametersToDataWarehouse;
  }


  public RunTemplate parameterGroups(List<String> parameterGroups) {
    
    this.parameterGroups = parameterGroups;
    return this;
  }

  public RunTemplate addParameterGroupsItem(String parameterGroupsItem) {
    if (this.parameterGroups == null) {
      this.parameterGroups = new ArrayList<String>();
    }
    this.parameterGroups.add(parameterGroupsItem);
    return this;
  }

   /**
   * the ordered list of parameters groups for the Run Template
   * @return parameterGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the ordered list of parameters groups for the Run Template")

  public List<String> getParameterGroups() {
    return parameterGroups;
  }


  public void setParameterGroups(List<String> parameterGroups) {
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
    RunTemplate runTemplate = (RunTemplate) o;
    return Objects.equals(this.id, runTemplate.id) &&
        Objects.equals(this.name, runTemplate.name) &&
        Objects.equals(this.description, runTemplate.description) &&
        Objects.equals(this.csmSimulation, runTemplate.csmSimulation) &&
        Objects.equals(this.tags, runTemplate.tags) &&
        Objects.equals(this.computeSize, runTemplate.computeSize) &&
        Objects.equals(this.parametersHandlerResource, runTemplate.parametersHandlerResource) &&
        Objects.equals(this.datasetValidatorResource, runTemplate.datasetValidatorResource) &&
        Objects.equals(this.preRunResource, runTemplate.preRunResource) &&
        Objects.equals(this.engineResource, runTemplate.engineResource) &&
        Objects.equals(this.postRunResource, runTemplate.postRunResource) &&
        Objects.equals(this.sendDatasetsToDataWarehouse, runTemplate.sendDatasetsToDataWarehouse) &&
        Objects.equals(this.sendInputParametersToDataWarehouse, runTemplate.sendInputParametersToDataWarehouse) &&
        Objects.equals(this.parameterGroups, runTemplate.parameterGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, csmSimulation, tags, computeSize, parametersHandlerResource, datasetValidatorResource, preRunResource, engineResource, postRunResource, sendDatasetsToDataWarehouse, sendInputParametersToDataWarehouse, parameterGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunTemplate {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    csmSimulation: ").append(toIndentedString(csmSimulation)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    computeSize: ").append(toIndentedString(computeSize)).append("\n");
    sb.append("    parametersHandlerResource: ").append(toIndentedString(parametersHandlerResource)).append("\n");
    sb.append("    datasetValidatorResource: ").append(toIndentedString(datasetValidatorResource)).append("\n");
    sb.append("    preRunResource: ").append(toIndentedString(preRunResource)).append("\n");
    sb.append("    engineResource: ").append(toIndentedString(engineResource)).append("\n");
    sb.append("    postRunResource: ").append(toIndentedString(postRunResource)).append("\n");
    sb.append("    sendDatasetsToDataWarehouse: ").append(toIndentedString(sendDatasetsToDataWarehouse)).append("\n");
    sb.append("    sendInputParametersToDataWarehouse: ").append(toIndentedString(sendInputParametersToDataWarehouse)).append("\n");
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

