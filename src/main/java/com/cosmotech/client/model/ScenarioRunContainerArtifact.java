/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 2.3.12-SNAPSHOT
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

/**
 * a scenario run container artifact
 */
@ApiModel(description = "a scenario run container artifact")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-19T15:14:30.964247403Z[Etc/UTC]")
public class ScenarioRunContainerArtifact {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public ScenarioRunContainerArtifact() { 
  }

  public ScenarioRunContainerArtifact name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * the artifact name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the artifact name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ScenarioRunContainerArtifact path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * the artifact path (relative to /var/csmoutput)
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the artifact path (relative to /var/csmoutput)")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScenarioRunContainerArtifact scenarioRunContainerArtifact = (ScenarioRunContainerArtifact) o;
    return Objects.equals(this.name, scenarioRunContainerArtifact.name) &&
        Objects.equals(this.path, scenarioRunContainerArtifact.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScenarioRunContainerArtifact {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

