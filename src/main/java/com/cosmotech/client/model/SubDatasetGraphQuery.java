/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.0.12-SNAPSHOT
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
import java.util.ArrayList;
import java.util.List;

/**
 * a twin graph query in cypher language
 */
@ApiModel(description = "a twin graph query in cypher language")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-13T13:20:17.172727254Z[Etc/UTC]")
public class SubDatasetGraphQuery {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_QUERIES = "queries";
  @SerializedName(SERIALIZED_NAME_QUERIES)
  private List<String> queries = null;

  public static final String SERIALIZED_NAME_MAIN = "main";
  @SerializedName(SERIALIZED_NAME_MAIN)
  private Boolean main;

  public SubDatasetGraphQuery() { 
  }

  public SubDatasetGraphQuery name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * the name of the subdataset
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the name of the subdataset")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SubDatasetGraphQuery description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * the description of the subdataset
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the description of the subdataset")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public SubDatasetGraphQuery queries(List<String> queries) {
    
    this.queries = queries;
    return this;
  }

  public SubDatasetGraphQuery addQueriesItem(String queriesItem) {
    if (this.queries == null) {
      this.queries = new ArrayList<String>();
    }
    this.queries.add(queriesItem);
    return this;
  }

   /**
   * the query in cypher language
   * @return queries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the query in cypher language")

  public List<String> getQueries() {
    return queries;
  }


  public void setQueries(List<String> queries) {
    this.queries = queries;
  }


  public SubDatasetGraphQuery main(Boolean main) {
    
    this.main = main;
    return this;
  }

   /**
   * is this the main dataset
   * @return main
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "is this the main dataset")

  public Boolean getMain() {
    return main;
  }


  public void setMain(Boolean main) {
    this.main = main;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubDatasetGraphQuery subDatasetGraphQuery = (SubDatasetGraphQuery) o;
    return Objects.equals(this.name, subDatasetGraphQuery.name) &&
        Objects.equals(this.description, subDatasetGraphQuery.description) &&
        Objects.equals(this.queries, subDatasetGraphQuery.queries) &&
        Objects.equals(this.main, subDatasetGraphQuery.main);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, queries, main);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubDatasetGraphQuery {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    main: ").append(toIndentedString(main)).append("\n");
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

