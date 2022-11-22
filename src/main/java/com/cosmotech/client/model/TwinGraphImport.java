/*
 * Cosmo Tech Plaform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 2.1.0-dev
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
 * a twin graph import info
 */
@ApiModel(description = "a twin graph import info")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-22T11:03:09.976505377Z[Etc/UTC]")
public class TwinGraphImport {
  public static final String SERIALIZED_NAME_STORAGE_PATH = "storagePath";
  @SerializedName(SERIALIZED_NAME_STORAGE_PATH)
  private String storagePath;

  public static final String SERIALIZED_NAME_GRAPH_NAME = "graphName";
  @SerializedName(SERIALIZED_NAME_GRAPH_NAME)
  private String graphName;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public TwinGraphImport() { 
  }

  public TwinGraphImport storagePath(String storagePath) {
    
    this.storagePath = storagePath;
    return this;
  }

   /**
   * the storage path containing the files to import
   * @return storagePath
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the storage path containing the files to import")

  public String getStoragePath() {
    return storagePath;
  }


  public void setStoragePath(String storagePath) {
    this.storagePath = storagePath;
  }


  public TwinGraphImport graphName(String graphName) {
    
    this.graphName = graphName;
    return this;
  }

   /**
   * the graph name to import to
   * @return graphName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the graph name to import to")

  public String getGraphName() {
    return graphName;
  }


  public void setGraphName(String graphName) {
    this.graphName = graphName;
  }


  public TwinGraphImport version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * The version of the graph to import to.  When not set, the last version before import is upgraded by 1. When set, the targeted graph is replaced 
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The version of the graph to import to.  When not set, the last version before import is upgraded by 1. When set, the targeted graph is replaced ")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TwinGraphImport twinGraphImport = (TwinGraphImport) o;
    return Objects.equals(this.storagePath, twinGraphImport.storagePath) &&
        Objects.equals(this.graphName, twinGraphImport.graphName) &&
        Objects.equals(this.version, twinGraphImport.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storagePath, graphName, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TwinGraphImport {\n");
    sb.append("    storagePath: ").append(toIndentedString(storagePath)).append("\n");
    sb.append("    graphName: ").append(toIndentedString(graphName)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

