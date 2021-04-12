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
import com.cosmotech.client.model.SimulatorAnalysis;
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
 * a version of a Simulator
 */
@ApiModel(description = "a version of a Simulator")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-12T19:02:40.729704+02:00[Europe/Paris]")
public class Simulator {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SIMULATOR_KEY = "simulatorKey";
  @SerializedName(SERIALIZED_NAME_SIMULATOR_KEY)
  private String simulatorKey;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_REPOSITORY = "repository";
  @SerializedName(SERIALIZED_NAME_REPOSITORY)
  private String repository;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_OWNER_ID = "ownerId";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_ANALYSIS = "analysis";
  @SerializedName(SERIALIZED_NAME_ANALYSIS)
  private List<SimulatorAnalysis> analysis = null;


   /**
   * the Simulator version unique identifier
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Simulator version unique identifier")

  public String getId() {
    return id;
  }




  public Simulator simulatorKey(String simulatorKey) {
    
    this.simulatorKey = simulatorKey;
    return this;
  }

   /**
   * the Simulator key which group Simulator versions
   * @return simulatorKey
  **/
  @ApiModelProperty(required = true, value = "the Simulator key which group Simulator versions")

  public String getSimulatorKey() {
    return simulatorKey;
  }


  public void setSimulatorKey(String simulatorKey) {
    this.simulatorKey = simulatorKey;
  }


  public Simulator name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * the Simulator name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "the Simulator name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Simulator description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * the Simulator description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Simulator description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Simulator repository(String repository) {
    
    this.repository = repository;
    return this;
  }

   /**
   * the registry repository containing the image
   * @return repository
  **/
  @ApiModelProperty(required = true, value = "the registry repository containing the image")

  public String getRepository() {
    return repository;
  }


  public void setRepository(String repository) {
    this.repository = repository;
  }


  public Simulator version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * the Simulator version MAJOR.MINOR.PATCH. Must be aligned with an existing repository tag
   * @return version
  **/
  @ApiModelProperty(required = true, value = "the Simulator version MAJOR.MINOR.PATCH. Must be aligned with an existing repository tag")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


   /**
   * the User id which own this Simulator
   * @return ownerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the User id which own this Simulator")

  public String getOwnerId() {
    return ownerId;
  }




  public Simulator url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * an optional URL link to simulator page
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "an optional URL link to simulator page")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public Simulator tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public Simulator addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * the list of tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the list of tags")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public Simulator analysis(List<SimulatorAnalysis> analysis) {
    
    this.analysis = analysis;
    return this;
  }

  public Simulator addAnalysisItem(SimulatorAnalysis analysisItem) {
    if (this.analysis == null) {
      this.analysis = new ArrayList<SimulatorAnalysis>();
    }
    this.analysis.add(analysisItem);
    return this;
  }

   /**
   * list of Simulator Analysis
   * @return analysis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "list of Simulator Analysis")

  public List<SimulatorAnalysis> getAnalysis() {
    return analysis;
  }


  public void setAnalysis(List<SimulatorAnalysis> analysis) {
    this.analysis = analysis;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Simulator simulator = (Simulator) o;
    return Objects.equals(this.id, simulator.id) &&
        Objects.equals(this.simulatorKey, simulator.simulatorKey) &&
        Objects.equals(this.name, simulator.name) &&
        Objects.equals(this.description, simulator.description) &&
        Objects.equals(this.repository, simulator.repository) &&
        Objects.equals(this.version, simulator.version) &&
        Objects.equals(this.ownerId, simulator.ownerId) &&
        Objects.equals(this.url, simulator.url) &&
        Objects.equals(this.tags, simulator.tags) &&
        Objects.equals(this.analysis, simulator.analysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, simulatorKey, name, description, repository, version, ownerId, url, tags, analysis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Simulator {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    simulatorKey: ").append(toIndentedString(simulatorKey)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    analysis: ").append(toIndentedString(analysis)).append("\n");
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

