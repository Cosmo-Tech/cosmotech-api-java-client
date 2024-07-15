/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 4.0.2-onprem
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import com.cosmotech.client.model.WorkspaceSecurity;
import com.cosmotech.client.model.WorkspaceSolution;
import com.cosmotech.client.model.WorkspaceWebApp;
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
 * a Workspace
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-15T15:29:24.019802059Z[Etc/UTC]")
@com.redis.om.spring.annotations.Document
public class Workspace {
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

  public static final String SERIALIZED_NAME_LINKED_DATASET_ID_LIST = "linkedDatasetIdList";
  @SerializedName(SERIALIZED_NAME_LINKED_DATASET_ID_LIST)
  private List<String> linkedDatasetIdList;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags;

  public static final String SERIALIZED_NAME_OWNER_ID = "ownerId";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  public static final String SERIALIZED_NAME_SOLUTION = "solution";
  @SerializedName(SERIALIZED_NAME_SOLUTION)
  private WorkspaceSolution solution;

  public static final String SERIALIZED_NAME_WEB_APP = "webApp";
  @SerializedName(SERIALIZED_NAME_WEB_APP)
  private WorkspaceWebApp webApp;

  public static final String SERIALIZED_NAME_SEND_INPUT_TO_DATA_WAREHOUSE = "sendInputToDataWarehouse";
  @SerializedName(SERIALIZED_NAME_SEND_INPUT_TO_DATA_WAREHOUSE)
  private Boolean sendInputToDataWarehouse;

  public static final String SERIALIZED_NAME_USE_DEDICATED_EVENT_HUB_NAMESPACE = "useDedicatedEventHubNamespace";
  @SerializedName(SERIALIZED_NAME_USE_DEDICATED_EVENT_HUB_NAMESPACE)
  private Boolean useDedicatedEventHubNamespace = false;

  public static final String SERIALIZED_NAME_DEDICATED_EVENT_HUB_SAS_KEY_NAME = "dedicatedEventHubSasKeyName";
  @SerializedName(SERIALIZED_NAME_DEDICATED_EVENT_HUB_SAS_KEY_NAME)
  private String dedicatedEventHubSasKeyName;

  public static final String SERIALIZED_NAME_DEDICATED_EVENT_HUB_AUTHENTICATION_STRATEGY = "dedicatedEventHubAuthenticationStrategy";
  @SerializedName(SERIALIZED_NAME_DEDICATED_EVENT_HUB_AUTHENTICATION_STRATEGY)
  private String dedicatedEventHubAuthenticationStrategy;

  public static final String SERIALIZED_NAME_SEND_SCENARIO_RUN_TO_EVENT_HUB = "sendScenarioRunToEventHub";
  @SerializedName(SERIALIZED_NAME_SEND_SCENARIO_RUN_TO_EVENT_HUB)
  private Boolean sendScenarioRunToEventHub = true;

  public static final String SERIALIZED_NAME_SEND_SCENARIO_METADATA_TO_EVENT_HUB = "sendScenarioMetadataToEventHub";
  @SerializedName(SERIALIZED_NAME_SEND_SCENARIO_METADATA_TO_EVENT_HUB)
  private Boolean sendScenarioMetadataToEventHub = false;

  public static final String SERIALIZED_NAME_DATASET_COPY = "datasetCopy";
  @SerializedName(SERIALIZED_NAME_DATASET_COPY)
  private Boolean datasetCopy = true;

  public static final String SERIALIZED_NAME_SECURITY = "security";
  @SerializedName(SERIALIZED_NAME_SECURITY)
  @com.redis.om.spring.annotations.Indexed
  private WorkspaceSecurity security;

  public Workspace() {
  }

  public Workspace(
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
   * Workspace unique identifier generated by the API
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }



   /**
   * Organization unique identifier under which the workspace resides
   * @return organizationId
  **/
  @javax.annotation.Nullable
  public String getOrganizationId() {
    return organizationId;
  }



  public Workspace key(String key) {
    this.key = key;
    return this;
  }

   /**
   * technical key for resource name convention and version grouping. Must be unique
   * @return key
  **/
  @javax.annotation.Nonnull
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }


  public Workspace name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Workspace name. This name is display in the sample webApp
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Workspace description(String description) {
    this.description = description;
    return this;
  }

   /**
   * the Workspace description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public Workspace linkedDatasetIdList(List<String> linkedDatasetIdList) {
    this.linkedDatasetIdList = linkedDatasetIdList;
    return this;
  }

  public Workspace addLinkedDatasetIdListItem(String linkedDatasetIdListItem) {
    if (this.linkedDatasetIdList == null) {
      this.linkedDatasetIdList = new ArrayList<>();
    }
    this.linkedDatasetIdList.add(linkedDatasetIdListItem);
    return this;
  }

   /**
   * list of dataset linked to this dataset
   * @return linkedDatasetIdList
  **/
  @javax.annotation.Nullable
  public List<String> getLinkedDatasetIdList() {
    return linkedDatasetIdList;
  }

  public void setLinkedDatasetIdList(List<String> linkedDatasetIdList) {
    this.linkedDatasetIdList = linkedDatasetIdList;
  }


  public Workspace version(String version) {
    this.version = version;
    return this;
  }

   /**
   * the Workspace version MAJOR.MINOR.PATCH.
   * @return version
  **/
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  public Workspace tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Workspace addTagsItem(String tagsItem) {
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


   /**
   * the user id which own this workspace. set by the API from Authentification service receved id
   * @return ownerId
  **/
  @javax.annotation.Nullable
  public String getOwnerId() {
    return ownerId;
  }



  public Workspace solution(WorkspaceSolution solution) {
    this.solution = solution;
    return this;
  }

   /**
   * Get solution
   * @return solution
  **/
  @javax.annotation.Nonnull
  public WorkspaceSolution getSolution() {
    return solution;
  }

  public void setSolution(WorkspaceSolution solution) {
    this.solution = solution;
  }


  public Workspace webApp(WorkspaceWebApp webApp) {
    this.webApp = webApp;
    return this;
  }

   /**
   * Get webApp
   * @return webApp
  **/
  @javax.annotation.Nullable
  public WorkspaceWebApp getWebApp() {
    return webApp;
  }

  public void setWebApp(WorkspaceWebApp webApp) {
    this.webApp = webApp;
  }


  public Workspace sendInputToDataWarehouse(Boolean sendInputToDataWarehouse) {
    this.sendInputToDataWarehouse = sendInputToDataWarehouse;
    return this;
  }

   /**
   * default setting for all Scenarios and Run Templates to set whether or not the Dataset values and the input parameters values are send to the DataWarehouse prior to the ScenarioRun
   * @return sendInputToDataWarehouse
  **/
  @javax.annotation.Nullable
  public Boolean getSendInputToDataWarehouse() {
    return sendInputToDataWarehouse;
  }

  public void setSendInputToDataWarehouse(Boolean sendInputToDataWarehouse) {
    this.sendInputToDataWarehouse = sendInputToDataWarehouse;
  }


  public Workspace useDedicatedEventHubNamespace(Boolean useDedicatedEventHubNamespace) {
    this.useDedicatedEventHubNamespace = useDedicatedEventHubNamespace;
    return this;
  }

   /**
   * Set this property to true to use a dedicated Azure Event Hub Namespace for this Workspace. The Event Hub Namespace must be named \\&#39;&lt;organization_id\\&gt;-&lt;workspace_id\\&gt;\\&#39; (in lower case). This Namespace must also contain two Event Hubs named \\&#39;probesmeasures\\&#39; and \\&#39;scenariorun\\&#39;.
   * @return useDedicatedEventHubNamespace
  **/
  @javax.annotation.Nullable
  public Boolean getUseDedicatedEventHubNamespace() {
    return useDedicatedEventHubNamespace;
  }

  public void setUseDedicatedEventHubNamespace(Boolean useDedicatedEventHubNamespace) {
    this.useDedicatedEventHubNamespace = useDedicatedEventHubNamespace;
  }


  public Workspace dedicatedEventHubSasKeyName(String dedicatedEventHubSasKeyName) {
    this.dedicatedEventHubSasKeyName = dedicatedEventHubSasKeyName;
    return this;
  }

   /**
   * the Dedicated Event Hub SAS key name, default to RootManageSharedAccessKey. Use the /secret endpoint to set the key value
   * @return dedicatedEventHubSasKeyName
  **/
  @javax.annotation.Nullable
  public String getDedicatedEventHubSasKeyName() {
    return dedicatedEventHubSasKeyName;
  }

  public void setDedicatedEventHubSasKeyName(String dedicatedEventHubSasKeyName) {
    this.dedicatedEventHubSasKeyName = dedicatedEventHubSasKeyName;
  }


  public Workspace dedicatedEventHubAuthenticationStrategy(String dedicatedEventHubAuthenticationStrategy) {
    this.dedicatedEventHubAuthenticationStrategy = dedicatedEventHubAuthenticationStrategy;
    return this;
  }

   /**
   * the Event Hub authentication strategy, SHARED_ACCESS_POLICY or TENANT_CLIENT_CREDENTIALS. Default to the one defined for the tenant.
   * @return dedicatedEventHubAuthenticationStrategy
  **/
  @javax.annotation.Nullable
  public String getDedicatedEventHubAuthenticationStrategy() {
    return dedicatedEventHubAuthenticationStrategy;
  }

  public void setDedicatedEventHubAuthenticationStrategy(String dedicatedEventHubAuthenticationStrategy) {
    this.dedicatedEventHubAuthenticationStrategy = dedicatedEventHubAuthenticationStrategy;
  }


  public Workspace sendScenarioRunToEventHub(Boolean sendScenarioRunToEventHub) {
    this.sendScenarioRunToEventHub = sendScenarioRunToEventHub;
    return this;
  }

   /**
   * default setting for all Scenarios and Run Templates to set whether or not the ScenarioRun is send to the Event Hub
   * @return sendScenarioRunToEventHub
  **/
  @javax.annotation.Nullable
  public Boolean getSendScenarioRunToEventHub() {
    return sendScenarioRunToEventHub;
  }

  public void setSendScenarioRunToEventHub(Boolean sendScenarioRunToEventHub) {
    this.sendScenarioRunToEventHub = sendScenarioRunToEventHub;
  }


  public Workspace sendScenarioMetadataToEventHub(Boolean sendScenarioMetadataToEventHub) {
    this.sendScenarioMetadataToEventHub = sendScenarioMetadataToEventHub;
    return this;
  }

   /**
   * Set this property to false to not send scenario metada to Azure Event Hub Namespace for this Workspace. The Event Hub Namespace must be named \\&#39;&lt;organization_id\\&gt;-&lt;workspace_id\\&gt;\\&#39; (in lower case). This Namespace must also contain two Event Hubs named \\&#39;scenariometadata\\&#39; and \\&#39;scenariorunmetadata\\&#39;.
   * @return sendScenarioMetadataToEventHub
  **/
  @javax.annotation.Nullable
  public Boolean getSendScenarioMetadataToEventHub() {
    return sendScenarioMetadataToEventHub;
  }

  public void setSendScenarioMetadataToEventHub(Boolean sendScenarioMetadataToEventHub) {
    this.sendScenarioMetadataToEventHub = sendScenarioMetadataToEventHub;
  }


  public Workspace datasetCopy(Boolean datasetCopy) {
    this.datasetCopy = datasetCopy;
    return this;
  }

   /**
   * Activate the copy of dataset on scenario creation, meaning that each scenario created in this workspace will make this copy. when false, scenario use directly the dataset specified.
   * @return datasetCopy
  **/
  @javax.annotation.Nullable
  public Boolean getDatasetCopy() {
    return datasetCopy;
  }

  public void setDatasetCopy(Boolean datasetCopy) {
    this.datasetCopy = datasetCopy;
  }


  public Workspace security(WorkspaceSecurity security) {
    this.security = security;
    return this;
  }

   /**
   * Get security
   * @return security
  **/
  @javax.annotation.Nullable
  public WorkspaceSecurity getSecurity() {
    return security;
  }

  public void setSecurity(WorkspaceSecurity security) {
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
    Workspace workspace = (Workspace) o;
    return Objects.equals(this.id, workspace.id) &&
        Objects.equals(this.organizationId, workspace.organizationId) &&
        Objects.equals(this.key, workspace.key) &&
        Objects.equals(this.name, workspace.name) &&
        Objects.equals(this.description, workspace.description) &&
        Objects.equals(this.linkedDatasetIdList, workspace.linkedDatasetIdList) &&
        Objects.equals(this.version, workspace.version) &&
        Objects.equals(this.tags, workspace.tags) &&
        Objects.equals(this.ownerId, workspace.ownerId) &&
        Objects.equals(this.solution, workspace.solution) &&
        Objects.equals(this.webApp, workspace.webApp) &&
        Objects.equals(this.sendInputToDataWarehouse, workspace.sendInputToDataWarehouse) &&
        Objects.equals(this.useDedicatedEventHubNamespace, workspace.useDedicatedEventHubNamespace) &&
        Objects.equals(this.dedicatedEventHubSasKeyName, workspace.dedicatedEventHubSasKeyName) &&
        Objects.equals(this.dedicatedEventHubAuthenticationStrategy, workspace.dedicatedEventHubAuthenticationStrategy) &&
        Objects.equals(this.sendScenarioRunToEventHub, workspace.sendScenarioRunToEventHub) &&
        Objects.equals(this.sendScenarioMetadataToEventHub, workspace.sendScenarioMetadataToEventHub) &&
        Objects.equals(this.datasetCopy, workspace.datasetCopy) &&
        Objects.equals(this.security, workspace.security);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, organizationId, key, name, description, linkedDatasetIdList, version, tags, ownerId, solution, webApp, sendInputToDataWarehouse, useDedicatedEventHubNamespace, dedicatedEventHubSasKeyName, dedicatedEventHubAuthenticationStrategy, sendScenarioRunToEventHub, sendScenarioMetadataToEventHub, datasetCopy, security);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workspace {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    linkedDatasetIdList: ").append(toIndentedString(linkedDatasetIdList)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    solution: ").append(toIndentedString(solution)).append("\n");
    sb.append("    webApp: ").append(toIndentedString(webApp)).append("\n");
    sb.append("    sendInputToDataWarehouse: ").append(toIndentedString(sendInputToDataWarehouse)).append("\n");
    sb.append("    useDedicatedEventHubNamespace: ").append(toIndentedString(useDedicatedEventHubNamespace)).append("\n");
    sb.append("    dedicatedEventHubSasKeyName: ").append(toIndentedString(dedicatedEventHubSasKeyName)).append("\n");
    sb.append("    dedicatedEventHubAuthenticationStrategy: ").append(toIndentedString(dedicatedEventHubAuthenticationStrategy)).append("\n");
    sb.append("    sendScenarioRunToEventHub: ").append(toIndentedString(sendScenarioRunToEventHub)).append("\n");
    sb.append("    sendScenarioMetadataToEventHub: ").append(toIndentedString(sendScenarioMetadataToEventHub)).append("\n");
    sb.append("    datasetCopy: ").append(toIndentedString(datasetCopy)).append("\n");
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
    openapiFields.add("linkedDatasetIdList");
    openapiFields.add("version");
    openapiFields.add("tags");
    openapiFields.add("ownerId");
    openapiFields.add("solution");
    openapiFields.add("webApp");
    openapiFields.add("sendInputToDataWarehouse");
    openapiFields.add("useDedicatedEventHubNamespace");
    openapiFields.add("dedicatedEventHubSasKeyName");
    openapiFields.add("dedicatedEventHubAuthenticationStrategy");
    openapiFields.add("sendScenarioRunToEventHub");
    openapiFields.add("sendScenarioMetadataToEventHub");
    openapiFields.add("datasetCopy");
    openapiFields.add("security");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("key");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("solution");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Workspace
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Workspace.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Workspace is not found in the empty JSON string", Workspace.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Workspace.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Workspace` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Workspace.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("organizationId") != null && !jsonObj.get("organizationId").isJsonNull()) && !jsonObj.get("organizationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organizationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organizationId").toString()));
      }
      if (!jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("linkedDatasetIdList") != null && !jsonObj.get("linkedDatasetIdList").isJsonNull() && !jsonObj.get("linkedDatasetIdList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `linkedDatasetIdList` to be an array in the JSON string but got `%s`", jsonObj.get("linkedDatasetIdList").toString()));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull() && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if ((jsonObj.get("ownerId") != null && !jsonObj.get("ownerId").isJsonNull()) && !jsonObj.get("ownerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ownerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ownerId").toString()));
      }
      // validate the required field `solution`
      WorkspaceSolution.validateJsonElement(jsonObj.get("solution"));
      // validate the optional field `webApp`
      if (jsonObj.get("webApp") != null && !jsonObj.get("webApp").isJsonNull()) {
        WorkspaceWebApp.validateJsonElement(jsonObj.get("webApp"));
      }
      if ((jsonObj.get("dedicatedEventHubSasKeyName") != null && !jsonObj.get("dedicatedEventHubSasKeyName").isJsonNull()) && !jsonObj.get("dedicatedEventHubSasKeyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dedicatedEventHubSasKeyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dedicatedEventHubSasKeyName").toString()));
      }
      if ((jsonObj.get("dedicatedEventHubAuthenticationStrategy") != null && !jsonObj.get("dedicatedEventHubAuthenticationStrategy").isJsonNull()) && !jsonObj.get("dedicatedEventHubAuthenticationStrategy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dedicatedEventHubAuthenticationStrategy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dedicatedEventHubAuthenticationStrategy").toString()));
      }
      // validate the optional field `security`
      if (jsonObj.get("security") != null && !jsonObj.get("security").isJsonNull()) {
        WorkspaceSecurity.validateJsonElement(jsonObj.get("security"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Workspace.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Workspace' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Workspace> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Workspace.class));

       return (TypeAdapter<T>) new TypeAdapter<Workspace>() {
           @Override
           public void write(JsonWriter out, Workspace value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Workspace read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Workspace given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Workspace
  * @throws IOException if the JSON string is invalid with respect to Workspace
  */
  public static Workspace fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Workspace.class);
  }

 /**
  * Convert an instance of Workspace to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

