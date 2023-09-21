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
import com.cosmotech.client.model.SourceInfo;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-21T09:54:51.614583481Z[Etc/UTC]")
public class TwinGraphImport {
  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private SourceInfo source;

  public static final String SERIALIZED_NAME_GRAPH_ID = "graphId";
  @SerializedName(SERIALIZED_NAME_GRAPH_ID)
  private String graphId;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public TwinGraphImport() { 
  }

  public TwinGraphImport source(SourceInfo source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public SourceInfo getSource() {
    return source;
  }


  public void setSource(SourceInfo source) {
    this.source = source;
  }


  public TwinGraphImport graphId(String graphId) {
    
    this.graphId = graphId;
    return this;
  }

   /**
   * the graph id to import to
   * @return graphId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the graph id to import to")

  public String getGraphId() {
    return graphId;
  }


  public void setGraphId(String graphId) {
    this.graphId = graphId;
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
    return Objects.equals(this.source, twinGraphImport.source) &&
        Objects.equals(this.graphId, twinGraphImport.graphId) &&
        Objects.equals(this.version, twinGraphImport.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, graphId, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TwinGraphImport {\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    graphId: ").append(toIndentedString(graphId)).append("\n");
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

