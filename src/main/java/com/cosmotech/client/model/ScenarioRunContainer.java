/*
 * Cosmo Tech Plaform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 0.0.11-SNAPSHOT
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.cosmotech.client.model.ScenarioRunContainerArtifact;
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
 * a ScenarioRun container description
 */
@ApiModel(description = "a ScenarioRun container description")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-07T10:25:16.318147718Z[Etc/UTC]")
public class ScenarioRunContainer {
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

  public static final String SERIALIZED_NAME_ARTIFACTS = "artifacts";
  @SerializedName(SERIALIZED_NAME_ARTIFACTS)
  private List<ScenarioRunContainerArtifact> artifacts = null;

  public ScenarioRunContainer() { 
  }

  
  public ScenarioRunContainer(
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




  public ScenarioRunContainer name(String name) {
    
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


  public ScenarioRunContainer labels(Map<String, String> labels) {
    
    this.labels = labels;
    return this;
  }

  public ScenarioRunContainer putLabelsItem(String key, String labelsItem) {
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


  public ScenarioRunContainer envVars(Map<String, String> envVars) {
    
    this.envVars = envVars;
    return this;
  }

  public ScenarioRunContainer putEnvVarsItem(String key, String envVarsItem) {
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


  public ScenarioRunContainer image(String image) {
    
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


  public ScenarioRunContainer entrypoint(String entrypoint) {
    
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


  public ScenarioRunContainer runArgs(List<String> runArgs) {
    
    this.runArgs = runArgs;
    return this;
  }

  public ScenarioRunContainer addRunArgsItem(String runArgsItem) {
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


  public ScenarioRunContainer dependencies(List<String> dependencies) {
    
    this.dependencies = dependencies;
    return this;
  }

  public ScenarioRunContainer addDependenciesItem(String dependenciesItem) {
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




  public ScenarioRunContainer artifacts(List<ScenarioRunContainerArtifact> artifacts) {
    
    this.artifacts = artifacts;
    return this;
  }

  public ScenarioRunContainer addArtifactsItem(ScenarioRunContainerArtifact artifactsItem) {
    if (this.artifacts == null) {
      this.artifacts = new ArrayList<ScenarioRunContainerArtifact>();
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

  public List<ScenarioRunContainerArtifact> getArtifacts() {
    return artifacts;
  }


  public void setArtifacts(List<ScenarioRunContainerArtifact> artifacts) {
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
    ScenarioRunContainer scenarioRunContainer = (ScenarioRunContainer) o;
    return Objects.equals(this.id, scenarioRunContainer.id) &&
        Objects.equals(this.name, scenarioRunContainer.name) &&
        Objects.equals(this.labels, scenarioRunContainer.labels) &&
        Objects.equals(this.envVars, scenarioRunContainer.envVars) &&
        Objects.equals(this.image, scenarioRunContainer.image) &&
        Objects.equals(this.entrypoint, scenarioRunContainer.entrypoint) &&
        Objects.equals(this.runArgs, scenarioRunContainer.runArgs) &&
        Objects.equals(this.dependencies, scenarioRunContainer.dependencies) &&
        Objects.equals(this.solutionContainer, scenarioRunContainer.solutionContainer) &&
        Objects.equals(this.artifacts, scenarioRunContainer.artifacts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, labels, envVars, image, entrypoint, runArgs, dependencies, solutionContainer, artifacts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScenarioRunContainer {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    envVars: ").append(toIndentedString(envVars)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    entrypoint: ").append(toIndentedString(entrypoint)).append("\n");
    sb.append("    runArgs: ").append(toIndentedString(runArgs)).append("\n");
    sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
    sb.append("    solutionContainer: ").append(toIndentedString(solutionContainer)).append("\n");
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

