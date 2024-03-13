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
import com.cosmotech.client.model.RunnerJobState;
import com.cosmotech.client.model.RunnerLastRun;
import com.cosmotech.client.model.RunnerParentLastRun;
import com.cosmotech.client.model.RunnerResourceSizing;
import com.cosmotech.client.model.RunnerRootLastRun;
import com.cosmotech.client.model.RunnerRunTemplateParameterValue;
import com.cosmotech.client.model.RunnerSecurity;
import com.cosmotech.client.model.RunnerValidationStatus;
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
 * a Runner with base information
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-13T20:46:23.451733025Z[Etc/UTC]")
@com.redis.om.spring.annotations.Document
public class Runner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @org.springframework.data.annotation.Id
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @com.redis.om.spring.annotations.Searchable
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags;

  public static final String SERIALIZED_NAME_PARENT_ID = "parentId";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  @com.redis.om.spring.annotations.Indexed
  private String parentId;

  public static final String SERIALIZED_NAME_OWNER_ID = "ownerId";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  @com.redis.om.spring.annotations.Indexed
  private String ownerId;

  public static final String SERIALIZED_NAME_ROOT_ID = "rootId";
  @SerializedName(SERIALIZED_NAME_ROOT_ID)
  @com.redis.om.spring.annotations.Indexed
  private String rootId;

  public static final String SERIALIZED_NAME_SOLUTION_ID = "solutionId";
  @SerializedName(SERIALIZED_NAME_SOLUTION_ID)
  private String solutionId;

  public static final String SERIALIZED_NAME_RUN_TEMPLATE_ID = "runTemplateId";
  @SerializedName(SERIALIZED_NAME_RUN_TEMPLATE_ID)
  private String runTemplateId;

  public static final String SERIALIZED_NAME_ORGANIZATION_ID = "organizationId";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_ID)
  @com.redis.om.spring.annotations.Indexed
  private String organizationId;

  public static final String SERIALIZED_NAME_WORKSPACE_ID = "workspaceId";
  @SerializedName(SERIALIZED_NAME_WORKSPACE_ID)
  @com.redis.om.spring.annotations.Indexed
  private String workspaceId;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private RunnerJobState state;

  public static final String SERIALIZED_NAME_CREATION_DATE = "creationDate";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private Long creationDate;

  public static final String SERIALIZED_NAME_LAST_UPDATE = "lastUpdate";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATE)
  private Long lastUpdate;

  public static final String SERIALIZED_NAME_OWNER_NAME = "ownerName";
  @SerializedName(SERIALIZED_NAME_OWNER_NAME)
  private String ownerName;

  public static final String SERIALIZED_NAME_SOLUTION_NAME = "solutionName";
  @SerializedName(SERIALIZED_NAME_SOLUTION_NAME)
  private String solutionName;

  public static final String SERIALIZED_NAME_RUN_TEMPLATE_NAME = "runTemplateName";
  @SerializedName(SERIALIZED_NAME_RUN_TEMPLATE_NAME)
  private String runTemplateName;

  public static final String SERIALIZED_NAME_DATASET_LIST = "datasetList";
  @SerializedName(SERIALIZED_NAME_DATASET_LIST)
  private List<String> datasetList;

  public static final String SERIALIZED_NAME_RUN_SIZING = "runSizing";
  @SerializedName(SERIALIZED_NAME_RUN_SIZING)
  private RunnerResourceSizing runSizing;

  public static final String SERIALIZED_NAME_PARAMETERS_VALUES = "parametersValues";
  @SerializedName(SERIALIZED_NAME_PARAMETERS_VALUES)
  private List<RunnerRunTemplateParameterValue> parametersValues;

  public static final String SERIALIZED_NAME_LAST_RUN = "lastRun";
  @SerializedName(SERIALIZED_NAME_LAST_RUN)
  private RunnerLastRun lastRun;

  public static final String SERIALIZED_NAME_PARENT_LAST_RUN = "parentLastRun";
  @SerializedName(SERIALIZED_NAME_PARENT_LAST_RUN)
  private RunnerParentLastRun parentLastRun;

  public static final String SERIALIZED_NAME_ROOT_LAST_RUN = "rootLastRun";
  @SerializedName(SERIALIZED_NAME_ROOT_LAST_RUN)
  private RunnerRootLastRun rootLastRun;

  public static final String SERIALIZED_NAME_VALIDATION_STATUS = "validationStatus";
  @SerializedName(SERIALIZED_NAME_VALIDATION_STATUS)
  @com.redis.om.spring.annotations.Searchable
  private RunnerValidationStatus validationStatus;

  public static final String SERIALIZED_NAME_SECURITY = "security";
  @SerializedName(SERIALIZED_NAME_SECURITY)
  @com.redis.om.spring.annotations.Indexed
  private RunnerSecurity security;

  public Runner() {
  }

  public Runner(
     String id, 
     String ownerId, 
     String rootId, 
     String solutionId, 
     String organizationId, 
     String workspaceId, 
     Long creationDate, 
     Long lastUpdate, 
     String ownerName, 
     String solutionName, 
     String runTemplateName
  ) {
    this();
    this.id = id;
    this.ownerId = ownerId;
    this.rootId = rootId;
    this.solutionId = solutionId;
    this.organizationId = organizationId;
    this.workspaceId = workspaceId;
    this.creationDate = creationDate;
    this.lastUpdate = lastUpdate;
    this.ownerName = ownerName;
    this.solutionName = solutionName;
    this.runTemplateName = runTemplateName;
  }

   /**
   * the Runner unique identifier
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }



  public Runner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * the Runner name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Runner description(String description) {
    this.description = description;
    return this;
  }

   /**
   * the Runner description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public Runner tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Runner addTagsItem(String tagsItem) {
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


  public Runner parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * the Runner parent id
   * @return parentId
  **/
  @javax.annotation.Nullable
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


   /**
   * the user id which own this Runner
   * @return ownerId
  **/
  @javax.annotation.Nullable
  public String getOwnerId() {
    return ownerId;
  }



   /**
   * the runner root id
   * @return rootId
  **/
  @javax.annotation.Nullable
  public String getRootId() {
    return rootId;
  }



   /**
   * the Solution Id associated with this Runner
   * @return solutionId
  **/
  @javax.annotation.Nullable
  public String getSolutionId() {
    return solutionId;
  }



  public Runner runTemplateId(String runTemplateId) {
    this.runTemplateId = runTemplateId;
    return this;
  }

   /**
   * the Solution Run Template Id associated with this Runner
   * @return runTemplateId
  **/
  @javax.annotation.Nullable
  public String getRunTemplateId() {
    return runTemplateId;
  }

  public void setRunTemplateId(String runTemplateId) {
    this.runTemplateId = runTemplateId;
  }


   /**
   * the associated Organization Id
   * @return organizationId
  **/
  @javax.annotation.Nullable
  public String getOrganizationId() {
    return organizationId;
  }



   /**
   * the associated Workspace Id
   * @return workspaceId
  **/
  @javax.annotation.Nullable
  public String getWorkspaceId() {
    return workspaceId;
  }



  public Runner state(RunnerJobState state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  public RunnerJobState getState() {
    return state;
  }

  public void setState(RunnerJobState state) {
    this.state = state;
  }


   /**
   * the Runner creation date
   * @return creationDate
  **/
  @javax.annotation.Nullable
  public Long getCreationDate() {
    return creationDate;
  }



   /**
   * the last time a Runner was updated
   * @return lastUpdate
  **/
  @javax.annotation.Nullable
  public Long getLastUpdate() {
    return lastUpdate;
  }



   /**
   * the name of the owner
   * @return ownerName
  **/
  @javax.annotation.Nullable
  public String getOwnerName() {
    return ownerName;
  }



   /**
   * the Solution name
   * @return solutionName
  **/
  @javax.annotation.Nullable
  public String getSolutionName() {
    return solutionName;
  }



   /**
   * the Solution Run Template name associated with this Runner
   * @return runTemplateName
  **/
  @javax.annotation.Nullable
  public String getRunTemplateName() {
    return runTemplateName;
  }



  public Runner datasetList(List<String> datasetList) {
    this.datasetList = datasetList;
    return this;
  }

  public Runner addDatasetListItem(String datasetListItem) {
    if (this.datasetList == null) {
      this.datasetList = new ArrayList<>();
    }
    this.datasetList.add(datasetListItem);
    return this;
  }

   /**
   * the list of Dataset Id associated to this Runner Run Template
   * @return datasetList
  **/
  @javax.annotation.Nullable
  public List<String> getDatasetList() {
    return datasetList;
  }

  public void setDatasetList(List<String> datasetList) {
    this.datasetList = datasetList;
  }


  public Runner runSizing(RunnerResourceSizing runSizing) {
    this.runSizing = runSizing;
    return this;
  }

   /**
   * Get runSizing
   * @return runSizing
  **/
  @javax.annotation.Nullable
  public RunnerResourceSizing getRunSizing() {
    return runSizing;
  }

  public void setRunSizing(RunnerResourceSizing runSizing) {
    this.runSizing = runSizing;
  }


  public Runner parametersValues(List<RunnerRunTemplateParameterValue> parametersValues) {
    this.parametersValues = parametersValues;
    return this;
  }

  public Runner addParametersValuesItem(RunnerRunTemplateParameterValue parametersValuesItem) {
    if (this.parametersValues == null) {
      this.parametersValues = new ArrayList<>();
    }
    this.parametersValues.add(parametersValuesItem);
    return this;
  }

   /**
   * the list of Solution Run Template parameters values
   * @return parametersValues
  **/
  @javax.annotation.Nullable
  public List<RunnerRunTemplateParameterValue> getParametersValues() {
    return parametersValues;
  }

  public void setParametersValues(List<RunnerRunTemplateParameterValue> parametersValues) {
    this.parametersValues = parametersValues;
  }


  public Runner lastRun(RunnerLastRun lastRun) {
    this.lastRun = lastRun;
    return this;
  }

   /**
   * Get lastRun
   * @return lastRun
  **/
  @javax.annotation.Nullable
  public RunnerLastRun getLastRun() {
    return lastRun;
  }

  public void setLastRun(RunnerLastRun lastRun) {
    this.lastRun = lastRun;
  }


  public Runner parentLastRun(RunnerParentLastRun parentLastRun) {
    this.parentLastRun = parentLastRun;
    return this;
  }

   /**
   * Get parentLastRun
   * @return parentLastRun
  **/
  @javax.annotation.Nullable
  public RunnerParentLastRun getParentLastRun() {
    return parentLastRun;
  }

  public void setParentLastRun(RunnerParentLastRun parentLastRun) {
    this.parentLastRun = parentLastRun;
  }


  public Runner rootLastRun(RunnerRootLastRun rootLastRun) {
    this.rootLastRun = rootLastRun;
    return this;
  }

   /**
   * Get rootLastRun
   * @return rootLastRun
  **/
  @javax.annotation.Nullable
  public RunnerRootLastRun getRootLastRun() {
    return rootLastRun;
  }

  public void setRootLastRun(RunnerRootLastRun rootLastRun) {
    this.rootLastRun = rootLastRun;
  }


  public Runner validationStatus(RunnerValidationStatus validationStatus) {
    this.validationStatus = validationStatus;
    return this;
  }

   /**
   * Get validationStatus
   * @return validationStatus
  **/
  @javax.annotation.Nullable
  public RunnerValidationStatus getValidationStatus() {
    return validationStatus;
  }

  public void setValidationStatus(RunnerValidationStatus validationStatus) {
    this.validationStatus = validationStatus;
  }


  public Runner security(RunnerSecurity security) {
    this.security = security;
    return this;
  }

   /**
   * Get security
   * @return security
  **/
  @javax.annotation.Nullable
  public RunnerSecurity getSecurity() {
    return security;
  }

  public void setSecurity(RunnerSecurity security) {
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
    Runner runner = (Runner) o;
    return Objects.equals(this.id, runner.id) &&
        Objects.equals(this.name, runner.name) &&
        Objects.equals(this.description, runner.description) &&
        Objects.equals(this.tags, runner.tags) &&
        Objects.equals(this.parentId, runner.parentId) &&
        Objects.equals(this.ownerId, runner.ownerId) &&
        Objects.equals(this.rootId, runner.rootId) &&
        Objects.equals(this.solutionId, runner.solutionId) &&
        Objects.equals(this.runTemplateId, runner.runTemplateId) &&
        Objects.equals(this.organizationId, runner.organizationId) &&
        Objects.equals(this.workspaceId, runner.workspaceId) &&
        Objects.equals(this.state, runner.state) &&
        Objects.equals(this.creationDate, runner.creationDate) &&
        Objects.equals(this.lastUpdate, runner.lastUpdate) &&
        Objects.equals(this.ownerName, runner.ownerName) &&
        Objects.equals(this.solutionName, runner.solutionName) &&
        Objects.equals(this.runTemplateName, runner.runTemplateName) &&
        Objects.equals(this.datasetList, runner.datasetList) &&
        Objects.equals(this.runSizing, runner.runSizing) &&
        Objects.equals(this.parametersValues, runner.parametersValues) &&
        Objects.equals(this.lastRun, runner.lastRun) &&
        Objects.equals(this.parentLastRun, runner.parentLastRun) &&
        Objects.equals(this.rootLastRun, runner.rootLastRun) &&
        Objects.equals(this.validationStatus, runner.validationStatus) &&
        Objects.equals(this.security, runner.security);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, tags, parentId, ownerId, rootId, solutionId, runTemplateId, organizationId, workspaceId, state, creationDate, lastUpdate, ownerName, solutionName, runTemplateName, datasetList, runSizing, parametersValues, lastRun, parentLastRun, rootLastRun, validationStatus, security);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Runner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    rootId: ").append(toIndentedString(rootId)).append("\n");
    sb.append("    solutionId: ").append(toIndentedString(solutionId)).append("\n");
    sb.append("    runTemplateId: ").append(toIndentedString(runTemplateId)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    solutionName: ").append(toIndentedString(solutionName)).append("\n");
    sb.append("    runTemplateName: ").append(toIndentedString(runTemplateName)).append("\n");
    sb.append("    datasetList: ").append(toIndentedString(datasetList)).append("\n");
    sb.append("    runSizing: ").append(toIndentedString(runSizing)).append("\n");
    sb.append("    parametersValues: ").append(toIndentedString(parametersValues)).append("\n");
    sb.append("    lastRun: ").append(toIndentedString(lastRun)).append("\n");
    sb.append("    parentLastRun: ").append(toIndentedString(parentLastRun)).append("\n");
    sb.append("    rootLastRun: ").append(toIndentedString(rootLastRun)).append("\n");
    sb.append("    validationStatus: ").append(toIndentedString(validationStatus)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("tags");
    openapiFields.add("parentId");
    openapiFields.add("ownerId");
    openapiFields.add("rootId");
    openapiFields.add("solutionId");
    openapiFields.add("runTemplateId");
    openapiFields.add("organizationId");
    openapiFields.add("workspaceId");
    openapiFields.add("state");
    openapiFields.add("creationDate");
    openapiFields.add("lastUpdate");
    openapiFields.add("ownerName");
    openapiFields.add("solutionName");
    openapiFields.add("runTemplateName");
    openapiFields.add("datasetList");
    openapiFields.add("runSizing");
    openapiFields.add("parametersValues");
    openapiFields.add("lastRun");
    openapiFields.add("parentLastRun");
    openapiFields.add("rootLastRun");
    openapiFields.add("validationStatus");
    openapiFields.add("security");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Runner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Runner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Runner is not found in the empty JSON string", Runner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Runner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Runner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull() && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if ((jsonObj.get("parentId") != null && !jsonObj.get("parentId").isJsonNull()) && !jsonObj.get("parentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentId").toString()));
      }
      if ((jsonObj.get("ownerId") != null && !jsonObj.get("ownerId").isJsonNull()) && !jsonObj.get("ownerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ownerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ownerId").toString()));
      }
      if ((jsonObj.get("rootId") != null && !jsonObj.get("rootId").isJsonNull()) && !jsonObj.get("rootId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rootId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rootId").toString()));
      }
      if ((jsonObj.get("solutionId") != null && !jsonObj.get("solutionId").isJsonNull()) && !jsonObj.get("solutionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `solutionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("solutionId").toString()));
      }
      if ((jsonObj.get("runTemplateId") != null && !jsonObj.get("runTemplateId").isJsonNull()) && !jsonObj.get("runTemplateId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `runTemplateId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("runTemplateId").toString()));
      }
      if ((jsonObj.get("organizationId") != null && !jsonObj.get("organizationId").isJsonNull()) && !jsonObj.get("organizationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organizationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organizationId").toString()));
      }
      if ((jsonObj.get("workspaceId") != null && !jsonObj.get("workspaceId").isJsonNull()) && !jsonObj.get("workspaceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workspaceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workspaceId").toString()));
      }
      // validate the optional field `state`
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) {
        RunnerJobState.validateJsonElement(jsonObj.get("state"));
      }
      if ((jsonObj.get("ownerName") != null && !jsonObj.get("ownerName").isJsonNull()) && !jsonObj.get("ownerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ownerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ownerName").toString()));
      }
      if ((jsonObj.get("solutionName") != null && !jsonObj.get("solutionName").isJsonNull()) && !jsonObj.get("solutionName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `solutionName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("solutionName").toString()));
      }
      if ((jsonObj.get("runTemplateName") != null && !jsonObj.get("runTemplateName").isJsonNull()) && !jsonObj.get("runTemplateName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `runTemplateName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("runTemplateName").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("datasetList") != null && !jsonObj.get("datasetList").isJsonNull() && !jsonObj.get("datasetList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `datasetList` to be an array in the JSON string but got `%s`", jsonObj.get("datasetList").toString()));
      }
      // validate the optional field `runSizing`
      if (jsonObj.get("runSizing") != null && !jsonObj.get("runSizing").isJsonNull()) {
        RunnerResourceSizing.validateJsonElement(jsonObj.get("runSizing"));
      }
      if (jsonObj.get("parametersValues") != null && !jsonObj.get("parametersValues").isJsonNull()) {
        JsonArray jsonArrayparametersValues = jsonObj.getAsJsonArray("parametersValues");
        if (jsonArrayparametersValues != null) {
          // ensure the json data is an array
          if (!jsonObj.get("parametersValues").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `parametersValues` to be an array in the JSON string but got `%s`", jsonObj.get("parametersValues").toString()));
          }

          // validate the optional field `parametersValues` (array)
          for (int i = 0; i < jsonArrayparametersValues.size(); i++) {
            RunnerRunTemplateParameterValue.validateJsonElement(jsonArrayparametersValues.get(i));
          };
        }
      }
      // validate the optional field `lastRun`
      if (jsonObj.get("lastRun") != null && !jsonObj.get("lastRun").isJsonNull()) {
        RunnerLastRun.validateJsonElement(jsonObj.get("lastRun"));
      }
      // validate the optional field `parentLastRun`
      if (jsonObj.get("parentLastRun") != null && !jsonObj.get("parentLastRun").isJsonNull()) {
        RunnerParentLastRun.validateJsonElement(jsonObj.get("parentLastRun"));
      }
      // validate the optional field `rootLastRun`
      if (jsonObj.get("rootLastRun") != null && !jsonObj.get("rootLastRun").isJsonNull()) {
        RunnerRootLastRun.validateJsonElement(jsonObj.get("rootLastRun"));
      }
      // validate the optional field `validationStatus`
      if (jsonObj.get("validationStatus") != null && !jsonObj.get("validationStatus").isJsonNull()) {
        RunnerValidationStatus.validateJsonElement(jsonObj.get("validationStatus"));
      }
      // validate the optional field `security`
      if (jsonObj.get("security") != null && !jsonObj.get("security").isJsonNull()) {
        RunnerSecurity.validateJsonElement(jsonObj.get("security"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Runner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Runner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Runner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Runner.class));

       return (TypeAdapter<T>) new TypeAdapter<Runner>() {
           @Override
           public void write(JsonWriter out, Runner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Runner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Runner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Runner
  * @throws IOException if the JSON string is invalid with respect to Runner
  */
  public static Runner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Runner.class);
  }

 /**
  * Convert an instance of Runner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

