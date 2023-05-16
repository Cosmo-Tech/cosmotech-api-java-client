/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 2.4.2-SNAPSHOT
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
 * define cpus and memory needs
 */
@ApiModel(description = "define cpus and memory needs")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-16T12:53:57.239128567Z[Etc/UTC]")
public class ResourceSizeInfo {
  public static final String SERIALIZED_NAME_CPU = "cpu";
  @SerializedName(SERIALIZED_NAME_CPU)
  private String cpu;

  public static final String SERIALIZED_NAME_MEMORY = "memory";
  @SerializedName(SERIALIZED_NAME_MEMORY)
  private String memory;

  public ResourceSizeInfo() { 
  }

  public ResourceSizeInfo cpu(String cpu) {
    
    this.cpu = cpu;
    return this;
  }

   /**
   * define cpu needs
   * @return cpu
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "define cpu needs")

  public String getCpu() {
    return cpu;
  }


  public void setCpu(String cpu) {
    this.cpu = cpu;
  }


  public ResourceSizeInfo memory(String memory) {
    
    this.memory = memory;
    return this;
  }

   /**
   * define memory needs
   * @return memory
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "define memory needs")

  public String getMemory() {
    return memory;
  }


  public void setMemory(String memory) {
    this.memory = memory;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceSizeInfo resourceSizeInfo = (ResourceSizeInfo) o;
    return Objects.equals(this.cpu, resourceSizeInfo.cpu) &&
        Objects.equals(this.memory, resourceSizeInfo.memory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpu, memory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceSizeInfo {\n");
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
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

