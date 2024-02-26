/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.0.3-SNAPSHOT
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.cosmotech.client.model.ContainerResourceSizing;
import com.cosmotech.client.model.RunContainerArtifact;
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
 * a Run container description
 */
@ApiModel(description = "a Run container description")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T10:45:46.197512505Z[Etc/UTC]")
public class RunContainer {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = null;

  public static final String SERIALIZED_NAME_ENV_VARS = "envVars";
  @SerializedName(SERIALIZED_NAME_ENV_VARS)
  private Map<String, String> envVars = null;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_ENTRYPOINT = "entrypoint";
  @SerializedName(SERIALIZED_NAME_ENTRYPOINT)
  private String entrypoint;

  public static final String SERIALIZED_NAME_RUN_ARGS = "runArgs";
  @SerializedName(SERIALIZED_NAME_RUN_ARGS)
  private List<String> runArgs = null;

  public static final String SERIALIZED_NAME_DEPENDENCIES = "dependencies";
  @SerializedName(SERIALIZED_NAME_DEPENDENCIES)
  private List<String> dependencies = null;

  public static final String SERIALIZED_NAME_SOLUTION_CONTAINER = "solutionContainer";
  @SerializedName(SERIALIZED_NAME_SOLUTION_CONTAINER)
  private Boolean solutionContainer;

  public static final String SERIALIZED_NAME_NODE_LABEL = "nodeLabel";
  @SerializedName(SERIALIZED_NAME_NODE_LABEL)
  private String nodeLabel;

  public static final String SERIALIZED_NAME_RUN_SIZING = "runSizing";
  @SerializedName(SERIALIZED_NAME_RUN_SIZING)
  private ContainerResourceSizing runSizing;

  public static final String SERIALIZED_NAME_ARTIFACTS = "artifacts";
  @SerializedName(SERIALIZED_NAME_ARTIFACTS)
  private List<RunContainerArtifact> artifacts = null;

  public RunContainer() { 
  }

  
  public RunContainer(
     String id, 
     Boolean solutionContainer
  ) {
    this();
    this.id = id;
    this.solutionContainer = solutionContainer;
  }

   /**
   * the container Id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the container Id")

  public String getId() {
    return id;
  }




  public RunContainer name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * the container name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the container name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public RunContainer labels(Map<String, String> labels) {
    
    this.labels = labels;
    return this;
  }

  public RunContainer putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<String, String>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * the metadata labels
   * @return labels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the metadata labels")

  public Map<String, String> getLabels() {
    return labels;
  }


  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public RunContainer envVars(Map<String, String> envVars) {
    
    this.envVars = envVars;
    return this;
  }

  public RunContainer putEnvVarsItem(String key, String envVarsItem) {
    if (this.envVars == null) {
      this.envVars = new HashMap<String, String>();
    }
    this.envVars.put(key, envVarsItem);
    return this;
  }

   /**
   * environment variable map
   * @return envVars
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "environment variable map")

  public Map<String, String> getEnvVars() {
    return envVars;
  }


  public void setEnvVars(Map<String, String> envVars) {
    this.envVars = envVars;
  }


  public RunContainer image(String image) {
    
    this.image = image;
    return this;
  }

   /**
   * the container image URI
   * @return image
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the container image URI")

  public String getImage() {
    return image;
  }


  public void setImage(String image) {
    this.image = image;
  }


  public RunContainer entrypoint(String entrypoint) {
    
    this.entrypoint = entrypoint;
    return this;
  }

   /**
   * the container entry point
   * @return entrypoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the container entry point")

  public String getEntrypoint() {
    return entrypoint;
  }


  public void setEntrypoint(String entrypoint) {
    this.entrypoint = entrypoint;
  }


  public RunContainer runArgs(List<String> runArgs) {
    
    this.runArgs = runArgs;
    return this;
  }

  public RunContainer addRunArgsItem(String runArgsItem) {
    if (this.runArgs == null) {
      this.runArgs = new ArrayList<String>();
    }
    this.runArgs.add(runArgsItem);
    return this;
  }

   /**
   * the list of run arguments for the container
   * @return runArgs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the list of run arguments for the container")

  public List<String> getRunArgs() {
    return runArgs;
  }


  public void setRunArgs(List<String> runArgs) {
    this.runArgs = runArgs;
  }


  public RunContainer dependencies(List<String> dependencies) {
    
    this.dependencies = dependencies;
    return this;
  }

  public RunContainer addDependenciesItem(String dependenciesItem) {
    if (this.dependencies == null) {
      this.dependencies = new ArrayList<String>();
    }
    this.dependencies.add(dependenciesItem);
    return this;
  }

   /**
   * the list of dependencies container name to run this container
   * @return dependencies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the list of dependencies container name to run this container")

  public List<String> getDependencies() {
    return dependencies;
  }


  public void setDependencies(List<String> dependencies) {
    this.dependencies = dependencies;
  }


   /**
   * whether or not this container is a Cosmo Tech solution container
   * @return solutionContainer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "whether or not this container is a Cosmo Tech solution container")

  public Boolean getSolutionContainer() {
    return solutionContainer;
  }




  public RunContainer nodeLabel(String nodeLabel) {
    
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


  public RunContainer runSizing(ContainerResourceSizing runSizing) {
    
    this.runSizing = runSizing;
    return this;
  }

   /**
   * Get runSizing
   * @return runSizing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContainerResourceSizing getRunSizing() {
    return runSizing;
  }


  public void setRunSizing(ContainerResourceSizing runSizing) {
    this.runSizing = runSizing;
  }


  public RunContainer artifacts(List<RunContainerArtifact> artifacts) {
    
    this.artifacts = artifacts;
    return this;
  }

  public RunContainer addArtifactsItem(RunContainerArtifact artifactsItem) {
    if (this.artifacts == null) {
      this.artifacts = new ArrayList<RunContainerArtifact>();
    }
    this.artifacts.add(artifactsItem);
    return this;
  }

   /**
   * the list of artifacts
   * @return artifacts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the list of artifacts")

  public List<RunContainerArtifact> getArtifacts() {
    return artifacts;
  }


  public void setArtifacts(List<RunContainerArtifact> artifacts) {
    this.artifacts = artifacts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunContainer runContainer = (RunContainer) o;
    return Objects.equals(this.id, runContainer.id) &&
        Objects.equals(this.name, runContainer.name) &&
        Objects.equals(this.labels, runContainer.labels) &&
        Objects.equals(this.envVars, runContainer.envVars) &&
        Objects.equals(this.image, runContainer.image) &&
        Objects.equals(this.entrypoint, runContainer.entrypoint) &&
        Objects.equals(this.runArgs, runContainer.runArgs) &&
        Objects.equals(this.dependencies, runContainer.dependencies) &&
        Objects.equals(this.solutionContainer, runContainer.solutionContainer) &&
        Objects.equals(this.nodeLabel, runContainer.nodeLabel) &&
        Objects.equals(this.runSizing, runContainer.runSizing) &&
        Objects.equals(this.artifacts, runContainer.artifacts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, labels, envVars, image, entrypoint, runArgs, dependencies, solutionContainer, nodeLabel, runSizing, artifacts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunContainer {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    envVars: ").append(toIndentedString(envVars)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    entrypoint: ").append(toIndentedString(entrypoint)).append("\n");
    sb.append("    runArgs: ").append(toIndentedString(runArgs)).append("\n");
    sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
    sb.append("    solutionContainer: ").append(toIndentedString(solutionContainer)).append("\n");
    sb.append("    nodeLabel: ").append(toIndentedString(nodeLabel)).append("\n");
    sb.append("    runSizing: ").append(toIndentedString(runSizing)).append("\n");
    sb.append("    artifacts: ").append(toIndentedString(artifacts)).append("\n");
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

