/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 2.4.2-dev
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
 * GraphProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-16T14:32:19.972569845Z[Etc/UTC]")
public class GraphProperties {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private String target;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PARAMS = "params";
  @SerializedName(SERIALIZED_NAME_PARAMS)
  private String params;

  public GraphProperties() { 
  }

  public GraphProperties type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * the type of the relationship
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the type of the relationship")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public GraphProperties source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * the source node of the relationship
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the source node of the relationship")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public GraphProperties target(String target) {
    
    this.target = target;
    return this;
  }

   /**
   * the target node of the relationship
   * @return target
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the target node of the relationship")

  public String getTarget() {
    return target;
  }


  public void setTarget(String target) {
    this.target = target;
  }


  public GraphProperties name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * the name of the graph data object
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the name of the graph data object")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GraphProperties params(String params) {
    
    this.params = params;
    return this;
  }

   /**
   * the parameters of the graph data object
   * @return params
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the parameters of the graph data object")

  public String getParams() {
    return params;
  }


  public void setParams(String params) {
    this.params = params;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GraphProperties graphProperties = (GraphProperties) o;
    return Objects.equals(this.type, graphProperties.type) &&
        Objects.equals(this.source, graphProperties.source) &&
        Objects.equals(this.target, graphProperties.target) &&
        Objects.equals(this.name, graphProperties.name) &&
        Objects.equals(this.params, graphProperties.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, source, target, name, params);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GraphProperties {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
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

