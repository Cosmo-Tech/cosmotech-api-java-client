/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 2.3.8
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
 * a twin graph query in cypher language
 */
@ApiModel(description = "a twin graph query in cypher language")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-12T09:15:24.857302936Z[Etc/UTC]")
public class TwinGraphQuery {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private String query;

  public TwinGraphQuery() { 
  }

  public TwinGraphQuery version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Twin graph version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Twin graph version")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public TwinGraphQuery query(String query) {
    
    this.query = query;
    return this;
  }

   /**
   * the query in cypher language
   * @return query
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the query in cypher language")

  public String getQuery() {
    return query;
  }


  public void setQuery(String query) {
    this.query = query;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TwinGraphQuery twinGraphQuery = (TwinGraphQuery) o;
    return Objects.equals(this.version, twinGraphQuery.version) &&
        Objects.equals(this.query, twinGraphQuery.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TwinGraphQuery {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

