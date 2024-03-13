/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.1.1-SNAPSHOT
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import com.cosmotech.client.model.RunTemplate;
import com.cosmotech.client.model.RunTemplateParameter;
import com.cosmotech.client.model.RunTemplateParameterGroup;
import com.cosmotech.client.model.SolutionSecurity;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.cosmotech.client.JSON;

/**
 * a version of a Solution
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-13T13:59:17.065547087Z[Etc/UTC]")
@com.redis.om.spring.annotations.Document
public class Solution {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @org.springframework.data.annotation.Id
  private String id;

  public static final String SERIALIZED_NAME_ORGANIZATION_ID = "organizationId";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_ID)
  @com.redis.om.spring.annotations.Indexed
  private String organizationId;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @com.redis.om.spring.annotations.Searchable
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_REPOSITORY = "repository";
  @SerializedName(SERIALIZED_NAME_REPOSITORY)
  private String repository;

  public static final String SERIALIZED_NAME_ALWAYS_PULL = "alwaysPull";
  @SerializedName(SERIALIZED_NAME_ALWAYS_PULL)
  private Boolean alwaysPull = false;

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
  private List<String> tags;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<RunTemplateParameter> parameters;

  public static final String SERIALIZED_NAME_PARAMETER_GROUPS = "parameterGroups";
  @SerializedName(SERIALIZED_NAME_PARAMETER_GROUPS)
  private List<RunTemplateParameterGroup> parameterGroups;

  public static final String SERIALIZED_NAME_RUN_TEMPLATES = "runTemplates";
  @SerializedName(SERIALIZED_NAME_RUN_TEMPLATES)
  private List<RunTemplate> runTemplates;

  public static final String SERIALIZED_NAME_SECURITY = "security";
  @SerializedName(SERIALIZED_NAME_SECURITY)
  @com.redis.om.spring.annotations.Indexed
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
  public String getId() {
    return id;
  }



   /**
   * the Organization unique identifier
   * @return organizationId
  **/
  @javax.annotation.Nullable
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
  public String getRepository() {
    return repository;
  }

  public void setRepository(String repository) {
    this.repository = repository;
  }


  public Solution alwaysPull(Boolean alwaysPull) {
    this.alwaysPull = alwaysPull;
    return this;
  }

   /**
   * set to true if the runtemplate wants to always pull the image
   * @return alwaysPull
  **/
  @javax.annotation.Nullable
  public Boolean getAlwaysPull() {
    return alwaysPull;
  }

  public void setAlwaysPull(Boolean alwaysPull) {
    this.alwaysPull = alwaysPull;
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
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * the list of tags
   * @return tags
  **/
  @javax.annotation.Nullable
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
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * the list of Run Template Parameters
   * @return parameters
  **/
  @javax.annotation.Nullable
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
      this.parameterGroups = new ArrayList<>();
    }
    this.parameterGroups.add(parameterGroupsItem);
    return this;
  }

   /**
   * the list of parameters groups for the Run Templates
   * @return parameterGroups
  **/
  @javax.annotation.Nullable
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
      this.runTemplates = new ArrayList<>();
    }
    this.runTemplates.add(runTemplatesItem);
    return this;
  }

   /**
   * list of Run Template
   * @return runTemplates
  **/
  @javax.annotation.Nullable
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
        Objects.equals(this.alwaysPull, solution.alwaysPull) &&
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

  @Override
  public int hashCode() {
    return Objects.hash(id, organizationId, key, name, description, repository, alwaysPull, csmSimulator, version, ownerId, sdkVersion, url, tags, parameters, parameterGroups, runTemplates, security);
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
    sb.append("    alwaysPull: ").append(toIndentedString(alwaysPull)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("organizationId");
    openapiFields.add("key");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("repository");
    openapiFields.add("alwaysPull");
    openapiFields.add("csmSimulator");
    openapiFields.add("version");
    openapiFields.add("ownerId");
    openapiFields.add("sdkVersion");
    openapiFields.add("url");
    openapiFields.add("tags");
    openapiFields.add("parameters");
    openapiFields.add("parameterGroups");
    openapiFields.add("runTemplates");
    openapiFields.add("security");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Solution
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Solution.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Solution is not found in the empty JSON string", Solution.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Solution.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Solution` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("organizationId") != null && !jsonObj.get("organizationId").isJsonNull()) && !jsonObj.get("organizationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organizationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organizationId").toString()));
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("repository") != null && !jsonObj.get("repository").isJsonNull()) && !jsonObj.get("repository").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `repository` to be a primitive type in the JSON string but got `%s`", jsonObj.get("repository").toString()));
      }
      if ((jsonObj.get("csmSimulator") != null && !jsonObj.get("csmSimulator").isJsonNull()) && !jsonObj.get("csmSimulator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `csmSimulator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("csmSimulator").toString()));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      if ((jsonObj.get("ownerId") != null && !jsonObj.get("ownerId").isJsonNull()) && !jsonObj.get("ownerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ownerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ownerId").toString()));
      }
      if ((jsonObj.get("sdkVersion") != null && !jsonObj.get("sdkVersion").isJsonNull()) && !jsonObj.get("sdkVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sdkVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sdkVersion").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull() && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if (jsonObj.get("parameters") != null && !jsonObj.get("parameters").isJsonNull()) {
        JsonArray jsonArrayparameters = jsonObj.getAsJsonArray("parameters");
        if (jsonArrayparameters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("parameters").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `parameters` to be an array in the JSON string but got `%s`", jsonObj.get("parameters").toString()));
          }

          // validate the optional field `parameters` (array)
          for (int i = 0; i < jsonArrayparameters.size(); i++) {
            RunTemplateParameter.validateJsonElement(jsonArrayparameters.get(i));
          };
        }
      }
      if (jsonObj.get("parameterGroups") != null && !jsonObj.get("parameterGroups").isJsonNull()) {
        JsonArray jsonArrayparameterGroups = jsonObj.getAsJsonArray("parameterGroups");
        if (jsonArrayparameterGroups != null) {
          // ensure the json data is an array
          if (!jsonObj.get("parameterGroups").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `parameterGroups` to be an array in the JSON string but got `%s`", jsonObj.get("parameterGroups").toString()));
          }

          // validate the optional field `parameterGroups` (array)
          for (int i = 0; i < jsonArrayparameterGroups.size(); i++) {
            RunTemplateParameterGroup.validateJsonElement(jsonArrayparameterGroups.get(i));
          };
        }
      }
      if (jsonObj.get("runTemplates") != null && !jsonObj.get("runTemplates").isJsonNull()) {
        JsonArray jsonArrayrunTemplates = jsonObj.getAsJsonArray("runTemplates");
        if (jsonArrayrunTemplates != null) {
          // ensure the json data is an array
          if (!jsonObj.get("runTemplates").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `runTemplates` to be an array in the JSON string but got `%s`", jsonObj.get("runTemplates").toString()));
          }

          // validate the optional field `runTemplates` (array)
          for (int i = 0; i < jsonArrayrunTemplates.size(); i++) {
            RunTemplate.validateJsonElement(jsonArrayrunTemplates.get(i));
          };
        }
      }
      // validate the optional field `security`
      if (jsonObj.get("security") != null && !jsonObj.get("security").isJsonNull()) {
        SolutionSecurity.validateJsonElement(jsonObj.get("security"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Solution.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Solution' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Solution> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Solution.class));

       return (TypeAdapter<T>) new TypeAdapter<Solution>() {
           @Override
           public void write(JsonWriter out, Solution value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Solution read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Solution given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Solution
  * @throws IOException if the JSON string is invalid with respect to Solution
  */
  public static Solution fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Solution.class);
  }

 /**
  * Convert an instance of Solution to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

