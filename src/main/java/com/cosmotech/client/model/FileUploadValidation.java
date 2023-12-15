/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.0.15-dev
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.cosmotech.client.model.FileUploadMetadata;
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
 * files read on upload
 */
@ApiModel(description = "files read on upload")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-15T09:32:21.264165260Z[Etc/UTC]")
public class FileUploadValidation {
  public static final String SERIALIZED_NAME_NODES = "nodes";
  @SerializedName(SERIALIZED_NAME_NODES)
  private List<FileUploadMetadata> nodes = null;

  public static final String SERIALIZED_NAME_EDGES = "edges";
  @SerializedName(SERIALIZED_NAME_EDGES)
  private List<FileUploadMetadata> edges = null;

  public FileUploadValidation() { 
  }

  public FileUploadValidation nodes(List<FileUploadMetadata> nodes) {
    
    this.nodes = nodes;
    return this;
  }

  public FileUploadValidation addNodesItem(FileUploadMetadata nodesItem) {
    if (this.nodes == null) {
      this.nodes = new ArrayList<FileUploadMetadata>();
    }
    this.nodes.add(nodesItem);
    return this;
  }

   /**
   * list of filename found on nodes folder
   * @return nodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "list of filename found on nodes folder")

  public List<FileUploadMetadata> getNodes() {
    return nodes;
  }


  public void setNodes(List<FileUploadMetadata> nodes) {
    this.nodes = nodes;
  }


  public FileUploadValidation edges(List<FileUploadMetadata> edges) {
    
    this.edges = edges;
    return this;
  }

  public FileUploadValidation addEdgesItem(FileUploadMetadata edgesItem) {
    if (this.edges == null) {
      this.edges = new ArrayList<FileUploadMetadata>();
    }
    this.edges.add(edgesItem);
    return this;
  }

   /**
   * list of filename found on edges folder
   * @return edges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "list of filename found on edges folder")

  public List<FileUploadMetadata> getEdges() {
    return edges;
  }


  public void setEdges(List<FileUploadMetadata> edges) {
    this.edges = edges;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileUploadValidation fileUploadValidation = (FileUploadValidation) o;
    return Objects.equals(this.nodes, fileUploadValidation.nodes) &&
        Objects.equals(this.edges, fileUploadValidation.edges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodes, edges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileUploadValidation {\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    edges: ").append(toIndentedString(edges)).append("\n");
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

