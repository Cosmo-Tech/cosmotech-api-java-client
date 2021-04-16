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
import com.cosmotech.client.model.SimulationContainers;
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
 * the parameters to run directly containers
 */
@ApiModel(description = "the parameters to run directly containers")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T16:41:35.745089+02:00[Europe/Paris]")
public class SimulationStartContainers {
  public static final String SERIALIZED_NAME_NODE_LABEL = "nodeLabel";
  @SerializedName(SERIALIZED_NAME_NODE_LABEL)
  private String nodeLabel;

  public static final String SERIALIZED_NAME_INIT_CONTAINERS = "initContainers";
  @SerializedName(SERIALIZED_NAME_INIT_CONTAINERS)
  private List<SimulationContainers> initContainers = null;

  public static final String SERIALIZED_NAME_MAIN_CONTAINER = "mainContainer";
  @SerializedName(SERIALIZED_NAME_MAIN_CONTAINER)
  private SimulationContainers mainContainer;


  public SimulationStartContainers nodeLabel(String nodeLabel) {
    
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


  public SimulationStartContainers initContainers(List<SimulationContainers> initContainers) {
    
    this.initContainers = initContainers;
    return this;
  }

  public SimulationStartContainers addInitContainersItem(SimulationContainers initContainersItem) {
    if (this.initContainers == null) {
      this.initContainers = new ArrayList<SimulationContainers>();
    }
    this.initContainers.add(initContainersItem);
    return this;
  }

   /**
   * the list of init containers
   * @return initContainers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the list of init containers")

  public List<SimulationContainers> getInitContainers() {
    return initContainers;
  }


  public void setInitContainers(List<SimulationContainers> initContainers) {
    this.initContainers = initContainers;
  }


  public SimulationStartContainers mainContainer(SimulationContainers mainContainer) {
    
    this.mainContainer = mainContainer;
    return this;
  }

   /**
   * Get mainContainer
   * @return mainContainer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SimulationContainers getMainContainer() {
    return mainContainer;
  }


  public void setMainContainer(SimulationContainers mainContainer) {
    this.mainContainer = mainContainer;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimulationStartContainers simulationStartContainers = (SimulationStartContainers) o;
    return Objects.equals(this.nodeLabel, simulationStartContainers.nodeLabel) &&
        Objects.equals(this.initContainers, simulationStartContainers.initContainers) &&
        Objects.equals(this.mainContainer, simulationStartContainers.mainContainer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeLabel, initContainers, mainContainer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimulationStartContainers {\n");
    sb.append("    nodeLabel: ").append(toIndentedString(nodeLabel)).append("\n");
    sb.append("    initContainers: ").append(toIndentedString(initContainers)).append("\n");
    sb.append("    mainContainer: ").append(toIndentedString(mainContainer)).append("\n");
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

