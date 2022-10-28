/*
 * Cosmo Tech Plaform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 2.0.4-SNAPSHOT
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
 * a Validator to validate a Dataset
 */
@ApiModel(description = "a Validator to validate a Dataset")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-28T07:11:21.291466242Z[Etc/UTC]")
public class Validator {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_REPOSITORY = "repository";
  @SerializedName(SERIALIZED_NAME_REPOSITORY)
  private String repository;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_OWNER_ID = "ownerId";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public Validator() { 
  }

  
  public Validator(
     String id, 
     String ownerId
  ) {
    this();
    this.id = id;
    this.ownerId = ownerId;
  }

   /**
   * the Validator id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the Validator id")

  public String getId() {
    return id;
  }




  public Validator name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * the Validator name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the Validator name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Validator description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * the Validator description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Validator description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Validator repository(String repository) {
    
    this.repository = repository;
    return this;
  }

   /**
   * the registry repository containing the Validator image
   * @return repository
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the registry repository containing the Validator image")

  public String getRepository() {
    return repository;
  }


  public void setRepository(String repository) {
    this.repository = repository;
  }


  public Validator version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * the Validator version MAJOR.MINOR.PATCH. Must be aligned with an existing repository tag
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the Validator version MAJOR.MINOR.PATCH. Must be aligned with an existing repository tag")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


   /**
   * the User id which own this Validator
   * @return ownerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the User id which own this Validator")

  public String getOwnerId() {
    return ownerId;
  }




  public Validator url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * an optional URL link to Validator page
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "an optional URL link to Validator page")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public Validator tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public Validator addTagsItem(String tagsItem) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Validator validator = (Validator) o;
    return Objects.equals(this.id, validator.id) &&
        Objects.equals(this.name, validator.name) &&
        Objects.equals(this.description, validator.description) &&
        Objects.equals(this.repository, validator.repository) &&
        Objects.equals(this.version, validator.version) &&
        Objects.equals(this.ownerId, validator.ownerId) &&
        Objects.equals(this.url, validator.url) &&
        Objects.equals(this.tags, validator.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, repository, version, ownerId, url, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Validator {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

