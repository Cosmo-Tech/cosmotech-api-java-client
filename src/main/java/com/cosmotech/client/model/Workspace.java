/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.0.4-test
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.cosmotech.client.model.WorkspaceSecurity;
import com.cosmotech.client.model.WorkspaceSolution;
import com.cosmotech.client.model.WorkspaceWebApp;
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
 * a Workspace
 */
@ApiModel(description = "a Workspace")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-06T12:12:15.813022670Z[Etc/UTC]")
public class Workspace {
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

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

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

  public static final String SERIALIZED_NAME_SECURITY = "security";
  @SerializedName(SERIALIZED_NAME_SECURITY)
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
   * the Workspace version unique identifier
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Workspace version unique identifier")

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




  public Workspace key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * technical key for resource name convention and version grouping. Must be unique
   * @return key
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "technical key for resource name convention and version grouping. Must be unique")

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
   * the Workspace name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the Workspace name")

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
  @ApiModelProperty(value = "the Workspace description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
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
  @ApiModelProperty(value = "the Workspace version MAJOR.MINOR.PATCH.")

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


   /**
   * the user id which own this workspace
   * @return ownerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the user id which own this workspace")

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
  @ApiModelProperty(required = true, value = "")

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
  @ApiModelProperty(value = "")

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
  @ApiModelProperty(value = "default setting for all Scenarios and Run Templates to set whether or not the Dataset values and the input parameters values are send to the DataWarehouse prior to the ScenarioRun")

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
  @ApiModelProperty(value = "Set this property to true to use a dedicated Azure Event Hub Namespace for this Workspace. The Event Hub Namespace must be named \\'<organization_id\\>-<workspace_id\\>\\' (in lower case). This Namespace must also contain two Event Hubs named \\'probesmeasures\\' and \\'scenariorun\\'.")

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
  @ApiModelProperty(value = "the Dedicated Event Hub SAS key name, default to RootManageSharedAccessKey. Use the /secret endpoint to set the key value")

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
  @ApiModelProperty(value = "the Event Hub authentication strategy, SHARED_ACCESS_POLICY or TENANT_CLIENT_CREDENTIALS. Default to the one defined for the tenant.")

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
  @ApiModelProperty(value = "default setting for all Scenarios and Run Templates to set whether or not the ScenarioRun is send to the Event Hub")

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
  @ApiModelProperty(value = "Set this property to false to not send scenario metada to Azure Event Hub Namespace for this Workspace. The Event Hub Namespace must be named \\'<organization_id\\>-<workspace_id\\>\\' (in lower case). This Namespace must also contain two Event Hubs named \\'scenariometadata\\' and \\'scenariorunmetadata\\'.")

  public Boolean getSendScenarioMetadataToEventHub() {
    return sendScenarioMetadataToEventHub;
  }


  public void setSendScenarioMetadataToEventHub(Boolean sendScenarioMetadataToEventHub) {
    this.sendScenarioMetadataToEventHub = sendScenarioMetadataToEventHub;
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
  @ApiModelProperty(value = "")

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
        Objects.equals(this.security, workspace.security);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, organizationId, key, name, description, version, tags, ownerId, solution, webApp, sendInputToDataWarehouse, useDedicatedEventHubNamespace, dedicatedEventHubSasKeyName, dedicatedEventHubAuthenticationStrategy, sendScenarioRunToEventHub, sendScenarioMetadataToEventHub, security);
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
    sb.append("class Workspace {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

