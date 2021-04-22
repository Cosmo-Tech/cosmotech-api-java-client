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
 * a ScenarioRun container description
 */
@ApiModel(description = "a ScenarioRun container description")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-22T12:27:09.848905+02:00[Europe/Paris]")
public class ScenarioRunContainer {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ENV_VARS = "envVars";
  @SerializedName(SERIALIZED_NAME_ENV_VARS)
  private Map<String, Object> envVars = null;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_RUN_ARGS = "runArgs";
  @SerializedName(SERIALIZED_NAME_RUN_ARGS)
  private List<String> runArgs = null;


   /**
   * the container Id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the container Id")

  public String getId() {
    return id;
  }




  public ScenarioRunContainer envVars(Map<String, Object> envVars) {
    
    this.envVars = envVars;
    return this;
  }

  public ScenarioRunContainer putEnvVarsItem(String key, Object envVarsItem) {
    if (this.envVars == null) {
      this.envVars = new HashMap<String, Object>();
    }
    this.envVars.put(key, envVarsItem);
    return this;
  }

   /**
   * a freeform environment variable map
   * @return envVars
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "a freeform environment variable map")

  public Map<String, Object> getEnvVars() {
    return envVars;
  }


  public void setEnvVars(Map<String, Object> envVars) {
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the container image URI")

  public String getImage() {
    return image;
  }


  public void setImage(String image) {
    this.image = image;
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
        Objects.equals(this.envVars, scenarioRunContainer.envVars) &&
        Objects.equals(this.image, scenarioRunContainer.image) &&
        Objects.equals(this.runArgs, scenarioRunContainer.runArgs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, envVars, image, runArgs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScenarioRunContainer {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    envVars: ").append(toIndentedString(envVars)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    runArgs: ").append(toIndentedString(runArgs)).append("\n");
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

