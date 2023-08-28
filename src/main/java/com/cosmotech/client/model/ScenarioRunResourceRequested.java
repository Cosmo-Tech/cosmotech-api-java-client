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
 * the memory and CPU requested by the pod
 */
@ApiModel(description = "the memory and CPU requested by the pod")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-28T14:25:39.570218002Z[Etc/UTC]")
public class ScenarioRunResourceRequested {
  public static final String SERIALIZED_NAME_CPU = "cpu";
  @SerializedName(SERIALIZED_NAME_CPU)
  private Long cpu;

  public static final String SERIALIZED_NAME_MEMORY = "memory";
  @SerializedName(SERIALIZED_NAME_MEMORY)
  private Long memory;

  public ScenarioRunResourceRequested() { 
  }

  public ScenarioRunResourceRequested cpu(Long cpu) {
    
    this.cpu = cpu;
    return this;
  }

   /**
   * the cpu requested
   * @return cpu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the cpu requested")

  public Long getCpu() {
    return cpu;
  }


  public void setCpu(Long cpu) {
    this.cpu = cpu;
  }


  public ScenarioRunResourceRequested memory(Long memory) {
    
    this.memory = memory;
    return this;
  }

   /**
   * the memory requested
   * @return memory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the memory requested")

  public Long getMemory() {
    return memory;
  }


  public void setMemory(Long memory) {
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
    ScenarioRunResourceRequested scenarioRunResourceRequested = (ScenarioRunResourceRequested) o;
    return Objects.equals(this.cpu, scenarioRunResourceRequested.cpu) &&
        Objects.equals(this.memory, scenarioRunResourceRequested.memory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpu, memory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScenarioRunResourceRequested {\n");
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

