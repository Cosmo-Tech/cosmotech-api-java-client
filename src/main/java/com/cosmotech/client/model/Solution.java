/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.0.19-SNAPSHOT
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
import com.cosmotech.client.model.SolutionSecurity;
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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * a version of a Solution
 */
@ApiModel(description = "a version of a Solution")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-05T16:32:51.500213411Z[Etc/UTC]")
public class Solution {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ORGANIZATION_ID = "organizationId";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_ID)
  private String organizationId;

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

  public static final String SERIALIZED_NAME_SDK_VERSION = "sdkVersion";
  @SerializedName(SERIALIZED_NAME_SDK_VERSION)
  private String sdkVersion;

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
  private List<RunTemplate> runTemplates = null;

  public static final String SERIALIZED_NAME_SECURITY = "security";
  @SerializedName(SERIALIZED_NAME_SECURITY)
  private SolutionSecurity security;

  public Solution() { 
  }

  
  public Solution(
     String id, 
     String organizationId, 
     String ownerId
  ) {
    this();
    this.id = id;
    this.organizationId = organizationId;
    this.ownerId = ownerId;
  }

   /**
   * the Solution version unique identifier
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Solution version unique identifier")

  public String getId() {
    return id;
  }




   /**
   * the Organization unique identifier
   * @return organizationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Organization unique identifier")

  public String getOrganizationId() {
    return organizationId;
  }




  public Solution key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * the Solution key which group Solution versions
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Solution key which group Solution versions")

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Solution name")

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the registry repository containing the image")

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Solution version MAJOR.MINOR.PATCH. Must be aligned with an existing repository tag")

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




  public Solution sdkVersion(String sdkVersion) {
    
    this.sdkVersion = sdkVersion;
    return this;
  }

   /**
   * the MAJOR.MINOR version used to build this solution
   * @return sdkVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the MAJOR.MINOR version used to build this solution")

  public String getSdkVersion() {
    return sdkVersion;
  }


  public void setSdkVersion(String sdkVersion) {
    this.sdkVersion = sdkVersion;
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
    if (this.runTemplates == null) {
      this.runTemplates = new ArrayList<RunTemplate>();
    }
    this.runTemplates.add(runTemplatesItem);
    return this;
  }

   /**
   * list of Run Template
   * @return runTemplates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "list of Run Template")

  public List<RunTemplate> getRunTemplates() {
    return runTemplates;
  }


  public void setRunTemplates(List<RunTemplate> runTemplates) {
    this.runTemplates = runTemplates;
  }


  public Solution security(SolutionSecurity security) {
    
    this.security = security;
    return this;
  }

   /**
   * Get security
   * @return security
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SolutionSecurity getSecurity() {
    return security;
  }


  public void setSecurity(SolutionSecurity security) {
    this.security = security;
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
        Objects.equals(this.organizationId, solution.organizationId) &&
        Objects.equals(this.key, solution.key) &&
        Objects.equals(this.name, solution.name) &&
        Objects.equals(this.description, solution.description) &&
        Objects.equals(this.repository, solution.repository) &&
        Objects.equals(this.csmSimulator, solution.csmSimulator) &&
        Objects.equals(this.version, solution.version) &&
        Objects.equals(this.ownerId, solution.ownerId) &&
        Objects.equals(this.sdkVersion, solution.sdkVersion) &&
        Objects.equals(this.url, solution.url) &&
        Objects.equals(this.tags, solution.tags) &&
        Objects.equals(this.parameters, solution.parameters) &&
        Objects.equals(this.parameterGroups, solution.parameterGroups) &&
        Objects.equals(this.runTemplates, solution.runTemplates) &&
        Objects.equals(this.security, solution.security);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, organizationId, key, name, description, repository, csmSimulator, version, ownerId, sdkVersion, url, tags, parameters, parameterGroups, runTemplates, security);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Solution {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
    sb.append("    csmSimulator: ").append(toIndentedString(csmSimulator)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    sdkVersion: ").append(toIndentedString(sdkVersion)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    parameterGroups: ").append(toIndentedString(parameterGroups)).append("\n");
    sb.append("    runTemplates: ").append(toIndentedString(runTemplates)).append("\n");
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
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

