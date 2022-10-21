/*
 * Cosmo Tech Plaform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.0.0-dev
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
 * the search options
 */
@ApiModel(description = "the search options")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-21T07:34:58.115912961Z[Etc/UTC]")
public class DatasetSearch {
  public static final String SERIALIZED_NAME_DATASET_TAGS = "datasetTags";
  @SerializedName(SERIALIZED_NAME_DATASET_TAGS)
  private List<String> datasetTags = new ArrayList<String>();

  public DatasetSearch() { 
  }

  public DatasetSearch datasetTags(List<String> datasetTags) {
    
    this.datasetTags = datasetTags;
    return this;
  }

  public DatasetSearch addDatasetTagsItem(String datasetTagsItem) {
    this.datasetTags.add(datasetTagsItem);
    return this;
  }

   /**
   * the dataset tag list to search
   * @return datasetTags
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the dataset tag list to search")

  public List<String> getDatasetTags() {
    return datasetTags;
  }


  public void setDatasetTags(List<String> datasetTags) {
    this.datasetTags = datasetTags;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetSearch datasetSearch = (DatasetSearch) o;
    return Objects.equals(this.datasetTags, datasetSearch.datasetTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasetTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetSearch {\n");
    sb.append("    datasetTags: ").append(toIndentedString(datasetTags)).append("\n");
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

