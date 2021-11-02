/*
 * Cosmo Tech Plaform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 0.0.10-SNAPSHOT
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.cosmotech.client.model.ScenarioRunContainer;
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
 * the parameters to run directly containers
 */
@ApiModel(description = "the parameters to run directly containers")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-02T09:27:06.790811210Z[Etc/UTC]")
public class ScenarioRunStartContainers {
  public static final String SERIALIZED_NAME_GENERATE_NAME = "generateName";
  @SerializedName(SERIALIZED_NAME_GENERATE_NAME)
  private String generateName;

  public static final String SERIALIZED_NAME_CSM_SIMULATION_ID = "csmSimulationId";
  @SerializedName(SERIALIZED_NAME_CSM_SIMULATION_ID)
  private String csmSimulationId;

  public static final String SERIALIZED_NAME_NODE_LABEL = "nodeLabel";
  @SerializedName(SERIALIZED_NAME_NODE_LABEL)
  private String nodeLabel;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = null;

  public static final String SERIALIZED_NAME_CONTAINERS = "containers";
  @SerializedName(SERIALIZED_NAME_CONTAINERS)
  private List<ScenarioRunContainer> containers = new ArrayList<ScenarioRunContainer>();


  public ScenarioRunStartContainers generateName(String generateName) {
    
    this.generateName = generateName;
    return this;
  }

   /**
   * the base name for workflow name generation
   * @return generateName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the base name for workflow name generation")

  public String getGenerateName() {
    return generateName;
  }


  public void setGenerateName(String generateName) {
    this.generateName = generateName;
  }


  public ScenarioRunStartContainers csmSimulationId(String csmSimulationId) {
    
    this.csmSimulationId = csmSimulationId;
    return this;
  }

   /**
   * Cosmo Tech Simulation Run Id
   * @return csmSimulationId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Cosmo Tech Simulation Run Id")

  public String getCsmSimulationId() {
    return csmSimulationId;
  }


  public void setCsmSimulationId(String csmSimulationId) {
    this.csmSimulationId = csmSimulationId;
  }


  public ScenarioRunStartContainers nodeLabel(String nodeLabel) {
    
    this.nodeLabel = nodeLabel;
    return this;
  }

   /**
   * the node label request
   * @return nodeLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the node label request")

  public String getNodeLabel() {
    return nodeLabel;
  }


  public void setNodeLabel(String nodeLabel) {
    this.nodeLabel = nodeLabel;
  }


  public ScenarioRunStartContainers labels(Map<String, String> labels) {
    
    this.labels = labels;
    return this;
  }

  public ScenarioRunStartContainers putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<String, String>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * the workflow labels
   * @return labels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the workflow labels")

  public Map<String, String> getLabels() {
    return labels;
  }


  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public ScenarioRunStartContainers containers(List<ScenarioRunContainer> containers) {
    
    this.containers = containers;
    return this;
  }

  public ScenarioRunStartContainers addContainersItem(ScenarioRunContainer containersItem) {
    this.containers.add(containersItem);
    return this;
  }

   /**
   * the containerslist
   * @return containers
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the containerslist")

  public List<ScenarioRunContainer> getContainers() {
    return containers;
  }


  public void setContainers(List<ScenarioRunContainer> containers) {
    this.containers = containers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScenarioRunStartContainers scenarioRunStartContainers = (ScenarioRunStartContainers) o;
    return Objects.equals(this.generateName, scenarioRunStartContainers.generateName) &&
        Objects.equals(this.csmSimulationId, scenarioRunStartContainers.csmSimulationId) &&
        Objects.equals(this.nodeLabel, scenarioRunStartContainers.nodeLabel) &&
        Objects.equals(this.labels, scenarioRunStartContainers.labels) &&
        Objects.equals(this.containers, scenarioRunStartContainers.containers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generateName, csmSimulationId, nodeLabel, labels, containers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScenarioRunStartContainers {\n");
    sb.append("    generateName: ").append(toIndentedString(generateName)).append("\n");
    sb.append("    csmSimulationId: ").append(toIndentedString(csmSimulationId)).append("\n");
    sb.append("    nodeLabel: ").append(toIndentedString(nodeLabel)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
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

