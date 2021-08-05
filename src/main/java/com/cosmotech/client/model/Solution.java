/*
 * Cosmo Tech Plaform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 0.0.8-SNAPSHOT
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.cosmotech.client.model.RunTemplate;
import com.cosmotech.client.model.RunTemplateParameter;
import com.cosmotech.client.model.RunTemplateParameterGroup;
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
 * a version of a Solution
 */
@ApiModel(description = "a version of a Solution")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-05T15:08:28.895691175Z[Etc/UTC]")
public class Solution {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_REPOSITORY = "repository";
  @SerializedName(SERIALIZED_NAME_REPOSITORY)
  private String repository;

  public static final String SERIALIZED_NAME_CSM_SIMULATOR = "csmSimulator";
  @SerializedName(SERIALIZED_NAME_CSM_SIMULATOR)
  private String csmSimulator;

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

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<RunTemplateParameter> parameters = null;

  public static final String SERIALIZED_NAME_PARAMETER_GROUPS = "parameterGroups";
  @SerializedName(SERIALIZED_NAME_PARAMETER_GROUPS)
  private List<RunTemplateParameterGroup> parameterGroups = null;

  public static final String SERIALIZED_NAME_RUN_TEMPLATES = "runTemplates";
  @SerializedName(SERIALIZED_NAME_RUN_TEMPLATES)
  private List<RunTemplate> runTemplates = new ArrayList<RunTemplate>();


   /**
   * the Solution version unique identifier
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Solution version unique identifier")

  public String getId() {
    return id;
  }




  public Solution key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * the Solution key which group Solution versions
   * @return key
  **/
  @ApiModelProperty(required = true, value = "the Solution key which group Solution versions")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public Solution name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * the Solution name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "the Solution name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Solution description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * the Solution description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Solution description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Solution repository(String repository) {
    
    this.repository = repository;
    return this;
  }

   /**
   * the registry repository containing the image
   * @return repository
  **/
  @ApiModelProperty(required = true, value = "the registry repository containing the image")

  public String getRepository() {
    return repository;
  }


  public void setRepository(String repository) {
    this.repository = repository;
  }


  public Solution csmSimulator(String csmSimulator) {
    
    this.csmSimulator = csmSimulator;
    return this;
  }

   /**
   * the main Cosmo Tech simulator name used in standard Run Template
   * @return csmSimulator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the main Cosmo Tech simulator name used in standard Run Template")

  public String getCsmSimulator() {
    return csmSimulator;
  }


  public void setCsmSimulator(String csmSimulator) {
    this.csmSimulator = csmSimulator;
  }


  public Solution version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * the Solution version MAJOR.MINOR.PATCH. Must be aligned with an existing repository tag
   * @return version
  **/
  @ApiModelProperty(required = true, value = "the Solution version MAJOR.MINOR.PATCH. Must be aligned with an existing repository tag")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


   /**
   * the User id which own this Solution
   * @return ownerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the User id which own this Solution")

  public String getOwnerId() {
    return ownerId;
  }




  public Solution url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * an optional URL link to solution page
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "an optional URL link to solution page")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public Solution tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public Solution addTagsItem(String tagsItem) {
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


  public Solution parameters(List<RunTemplateParameter> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public Solution addParametersItem(RunTemplateParameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<RunTemplateParameter>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * the list of Run Template Parameters
   * @return parameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the list of Run Template Parameters")

  public List<RunTemplateParameter> getParameters() {
    return parameters;
  }


  public void setParameters(List<RunTemplateParameter> parameters) {
    this.parameters = parameters;
  }


  public Solution parameterGroups(List<RunTemplateParameterGroup> parameterGroups) {
    
    this.parameterGroups = parameterGroups;
    return this;
  }

  public Solution addParameterGroupsItem(RunTemplateParameterGroup parameterGroupsItem) {
    if (this.parameterGroups == null) {
      this.parameterGroups = new ArrayList<RunTemplateParameterGroup>();
    }
    this.parameterGroups.add(parameterGroupsItem);
    return this;
  }

   /**
   * the list of parameters groups for the Run Templates
   * @return parameterGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the list of parameters groups for the Run Templates")

  public List<RunTemplateParameterGroup> getParameterGroups() {
    return parameterGroups;
  }


  public void setParameterGroups(List<RunTemplateParameterGroup> parameterGroups) {
    this.parameterGroups = parameterGroups;
  }


  public Solution runTemplates(List<RunTemplate> runTemplates) {
    
    this.runTemplates = runTemplates;
    return this;
  }

  public Solution addRunTemplatesItem(RunTemplate runTemplatesItem) {
    this.runTemplates.add(runTemplatesItem);
    return this;
  }

   /**
   * list of Run Template
   * @return runTemplates
  **/
  @ApiModelProperty(required = true, value = "list of Run Template")

  public List<RunTemplate> getRunTemplates() {
    return runTemplates;
  }


  public void setRunTemplates(List<RunTemplate> runTemplates) {
    this.runTemplates = runTemplates;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Solution solution = (Solution) o;
    return Objects.equals(this.id, solution.id) &&
        Objects.equals(this.key, solution.key) &&
        Objects.equals(this.name, solution.name) &&
        Objects.equals(this.description, solution.description) &&
        Objects.equals(this.repository, solution.repository) &&
        Objects.equals(this.csmSimulator, solution.csmSimulator) &&
        Objects.equals(this.version, solution.version) &&
        Objects.equals(this.ownerId, solution.ownerId) &&
        Objects.equals(this.url, solution.url) &&
        Objects.equals(this.tags, solution.tags) &&
        Objects.equals(this.parameters, solution.parameters) &&
        Objects.equals(this.parameterGroups, solution.parameterGroups) &&
        Objects.equals(this.runTemplates, solution.runTemplates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key, name, description, repository, csmSimulator, version, ownerId, url, tags, parameters, parameterGroups, runTemplates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Solution {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
    sb.append("    csmSimulator: ").append(toIndentedString(csmSimulator)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    parameterGroups: ").append(toIndentedString(parameterGroups)).append("\n");
    sb.append("    runTemplates: ").append(toIndentedString(runTemplates)).append("\n");
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

