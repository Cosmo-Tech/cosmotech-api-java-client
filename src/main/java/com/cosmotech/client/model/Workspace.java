/*
 * Cosmo Tech Plaform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 0.0.10-SNAPSHOT
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.cosmotech.client.model.WorkspaceSolution;
import com.cosmotech.client.model.WorkspaceUser;
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

/**
 * a Workspace
 */
@ApiModel(description = "a Workspace")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-08T10:12:14.113861264Z[Etc/UTC]")
public class Workspace {
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

  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private List<WorkspaceUser> users = null;

  public static final String SERIALIZED_NAME_WEB_APP = "webApp";
  @SerializedName(SERIALIZED_NAME_WEB_APP)
  private WorkspaceWebApp webApp;

  public static final String SERIALIZED_NAME_SEND_INPUT_TO_DATA_WAREHOUSE = "sendInputToDataWarehouse";
  @SerializedName(SERIALIZED_NAME_SEND_INPUT_TO_DATA_WAREHOUSE)
  private Boolean sendInputToDataWarehouse;

  public static final String SERIALIZED_NAME_USE_DEDICATED_EVENT_HUB_NAMESPACE = "useDedicatedEventHubNamespace";
  @SerializedName(SERIALIZED_NAME_USE_DEDICATED_EVENT_HUB_NAMESPACE)
  private Boolean useDedicatedEventHubNamespace = false;


   /**
   * the Workspace version unique identifier
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Workspace version unique identifier")

  public String getId() {
    return id;
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


  public Workspace users(List<WorkspaceUser> users) {
    
    this.users = users;
    return this;
  }

  public Workspace addUsersItem(WorkspaceUser usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<WorkspaceUser>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * the list of users Id with their role
   * @return users
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the list of users Id with their role")

  public List<WorkspaceUser> getUsers() {
    return users;
  }


  public void setUsers(List<WorkspaceUser> users) {
    this.users = users;
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
        Objects.equals(this.key, workspace.key) &&
        Objects.equals(this.name, workspace.name) &&
        Objects.equals(this.description, workspace.description) &&
        Objects.equals(this.version, workspace.version) &&
        Objects.equals(this.tags, workspace.tags) &&
        Objects.equals(this.ownerId, workspace.ownerId) &&
        Objects.equals(this.solution, workspace.solution) &&
        Objects.equals(this.users, workspace.users) &&
        Objects.equals(this.webApp, workspace.webApp) &&
        Objects.equals(this.sendInputToDataWarehouse, workspace.sendInputToDataWarehouse) &&
        Objects.equals(this.useDedicatedEventHubNamespace, workspace.useDedicatedEventHubNamespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key, name, description, version, tags, ownerId, solution, users, webApp, sendInputToDataWarehouse, useDedicatedEventHubNamespace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workspace {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    solution: ").append(toIndentedString(solution)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    webApp: ").append(toIndentedString(webApp)).append("\n");
    sb.append("    sendInputToDataWarehouse: ").append(toIndentedString(sendInputToDataWarehouse)).append("\n");
    sb.append("    useDedicatedEventHubNamespace: ").append(toIndentedString(useDedicatedEventHubNamespace)).append("\n");
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

