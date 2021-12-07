/*
 * Cosmo Tech Plaform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 0.0.11-SNAPSHOT
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.cosmotech.client.model.DatasetCompatibility;
import com.cosmotech.client.model.DatasetConnector;
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
 * a Dataset
 */
@ApiModel(description = "a Dataset")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-07T10:07:09.465296324Z[Etc/UTC]")
public class Dataset {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_OWNER_ID = "ownerId";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_CONNECTOR = "connector";
  @SerializedName(SERIALIZED_NAME_CONNECTOR)
  private DatasetConnector connector;

  public static final String SERIALIZED_NAME_FRAGMENTS_IDS = "fragmentsIds";
  @SerializedName(SERIALIZED_NAME_FRAGMENTS_IDS)
  private List<String> fragmentsIds = null;

  public static final String SERIALIZED_NAME_VALIDATOR_ID = "validatorId";
  @SerializedName(SERIALIZED_NAME_VALIDATOR_ID)
  private String validatorId;

  public static final String SERIALIZED_NAME_COMPATIBILITY = "compatibility";
  @SerializedName(SERIALIZED_NAME_COMPATIBILITY)
  private List<DatasetCompatibility> compatibility = null;


   /**
   * the Dataset unique identifier
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Dataset unique identifier")

  public String getId() {
    return id;
  }




  public Dataset name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * the Dataset name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Dataset name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Dataset description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * the Dataset description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Dataset description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


   /**
   * the User id which own this Dataset
   * @return ownerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the User id which own this Dataset")

  public String getOwnerId() {
    return ownerId;
  }




  public Dataset tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public Dataset addTagsItem(String tagsItem) {
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


  public Dataset connector(DatasetConnector connector) {
    
    this.connector = connector;
    return this;
  }

   /**
   * Get connector
   * @return connector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DatasetConnector getConnector() {
    return connector;
  }


  public void setConnector(DatasetConnector connector) {
    this.connector = connector;
  }


  public Dataset fragmentsIds(List<String> fragmentsIds) {
    
    this.fragmentsIds = fragmentsIds;
    return this;
  }

  public Dataset addFragmentsIdsItem(String fragmentsIdsItem) {
    if (this.fragmentsIds == null) {
      this.fragmentsIds = new ArrayList<String>();
    }
    this.fragmentsIds.add(fragmentsIdsItem);
    return this;
  }

   /**
   * the list of other Datasets ids to compose as fragments
   * @return fragmentsIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the list of other Datasets ids to compose as fragments")

  public List<String> getFragmentsIds() {
    return fragmentsIds;
  }


  public void setFragmentsIds(List<String> fragmentsIds) {
    this.fragmentsIds = fragmentsIds;
  }


  public Dataset validatorId(String validatorId) {
    
    this.validatorId = validatorId;
    return this;
  }

   /**
   * the validator id
   * @return validatorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the validator id")

  public String getValidatorId() {
    return validatorId;
  }


  public void setValidatorId(String validatorId) {
    this.validatorId = validatorId;
  }


  public Dataset compatibility(List<DatasetCompatibility> compatibility) {
    
    this.compatibility = compatibility;
    return this;
  }

  public Dataset addCompatibilityItem(DatasetCompatibility compatibilityItem) {
    if (this.compatibility == null) {
      this.compatibility = new ArrayList<DatasetCompatibility>();
    }
    this.compatibility.add(compatibilityItem);
    return this;
  }

   /**
   * the list of compatible Solutions versions
   * @return compatibility
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the list of compatible Solutions versions")

  public List<DatasetCompatibility> getCompatibility() {
    return compatibility;
  }


  public void setCompatibility(List<DatasetCompatibility> compatibility) {
    this.compatibility = compatibility;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dataset dataset = (Dataset) o;
    return Objects.equals(this.id, dataset.id) &&
        Objects.equals(this.name, dataset.name) &&
        Objects.equals(this.description, dataset.description) &&
        Objects.equals(this.ownerId, dataset.ownerId) &&
        Objects.equals(this.tags, dataset.tags) &&
        Objects.equals(this.connector, dataset.connector) &&
        Objects.equals(this.fragmentsIds, dataset.fragmentsIds) &&
        Objects.equals(this.validatorId, dataset.validatorId) &&
        Objects.equals(this.compatibility, dataset.compatibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, ownerId, tags, connector, fragmentsIds, validatorId, compatibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dataset {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    connector: ").append(toIndentedString(connector)).append("\n");
    sb.append("    fragmentsIds: ").append(toIndentedString(fragmentsIds)).append("\n");
    sb.append("    validatorId: ").append(toIndentedString(validatorId)).append("\n");
    sb.append("    compatibility: ").append(toIndentedString(compatibility)).append("\n");
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

