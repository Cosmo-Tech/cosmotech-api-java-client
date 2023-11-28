/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.0.16-SNAPSHOT
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.cosmotech.client.model.ScenarioJobState;
import com.cosmotech.client.model.ScenarioLastRun;
import com.cosmotech.client.model.ScenarioResourceSizing;
import com.cosmotech.client.model.ScenarioRunTemplateParameterValue;
import com.cosmotech.client.model.ScenarioSecurity;
import com.cosmotech.client.model.ScenarioValidationStatus;
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
 * a Scenario with base information
 */
@ApiModel(description = "a Scenario with base information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-28T14:33:04.788872243Z[Etc/UTC]")
public class Scenario {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_PARENT_ID = "parentId";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private String parentId;

  public static final String SERIALIZED_NAME_OWNER_ID = "ownerId";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  public static final String SERIALIZED_NAME_ROOT_ID = "rootId";
  @SerializedName(SERIALIZED_NAME_ROOT_ID)
  private String rootId;

  public static final String SERIALIZED_NAME_SOLUTION_ID = "solutionId";
  @SerializedName(SERIALIZED_NAME_SOLUTION_ID)
  private String solutionId;

  public static final String SERIALIZED_NAME_RUN_TEMPLATE_ID = "runTemplateId";
  @SerializedName(SERIALIZED_NAME_RUN_TEMPLATE_ID)
  private String runTemplateId;

  public static final String SERIALIZED_NAME_ORGANIZATION_ID = "organizationId";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_ID)
  private String organizationId;

  public static final String SERIALIZED_NAME_WORKSPACE_ID = "workspaceId";
  @SerializedName(SERIALIZED_NAME_WORKSPACE_ID)
  private String workspaceId;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private ScenarioJobState state;

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
  private List<String> datasetList = null;

  public static final String SERIALIZED_NAME_RUN_SIZING = "runSizing";
  @SerializedName(SERIALIZED_NAME_RUN_SIZING)
  private ScenarioResourceSizing runSizing;

  public static final String SERIALIZED_NAME_PARAMETERS_VALUES = "parametersValues";
  @SerializedName(SERIALIZED_NAME_PARAMETERS_VALUES)
  private List<ScenarioRunTemplateParameterValue> parametersValues = null;

  public static final String SERIALIZED_NAME_LAST_RUN = "lastRun";
  @SerializedName(SERIALIZED_NAME_LAST_RUN)
  private ScenarioLastRun lastRun;

  public static final String SERIALIZED_NAME_PARENT_LAST_RUN = "parentLastRun";
  @SerializedName(SERIALIZED_NAME_PARENT_LAST_RUN)
  private ScenarioLastRun parentLastRun;

  public static final String SERIALIZED_NAME_ROOT_LAST_RUN = "rootLastRun";
  @SerializedName(SERIALIZED_NAME_ROOT_LAST_RUN)
  private ScenarioLastRun rootLastRun;

  public static final String SERIALIZED_NAME_VALIDATION_STATUS = "validationStatus";
  @SerializedName(SERIALIZED_NAME_VALIDATION_STATUS)
  private ScenarioValidationStatus validationStatus;

  public static final String SERIALIZED_NAME_SECURITY = "security";
  @SerializedName(SERIALIZED_NAME_SECURITY)
  private ScenarioSecurity security;

  public Scenario() { 
  }

  
  public Scenario(
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
   * the Scenario unique identifier
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Scenario unique identifier")

  public String getId() {
    return id;
  }




  public Scenario name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * the Scenario name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Scenario name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Scenario description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * the Scenario description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Scenario description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Scenario tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public Scenario addTagsItem(String tagsItem) {
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


  public Scenario parentId(String parentId) {
    
    this.parentId = parentId;
    return this;
  }

   /**
   * the Scenario parent id
   * @return parentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Scenario parent id")

  public String getParentId() {
    return parentId;
  }


  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


   /**
   * the user id which own this Scenario
   * @return ownerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the user id which own this Scenario")

  public String getOwnerId() {
    return ownerId;
  }




   /**
   * the scenario root id
   * @return rootId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the scenario root id")

  public String getRootId() {
    return rootId;
  }




   /**
   * the Solution Id associated with this Scenario
   * @return solutionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Solution Id associated with this Scenario")

  public String getSolutionId() {
    return solutionId;
  }




  public Scenario runTemplateId(String runTemplateId) {
    
    this.runTemplateId = runTemplateId;
    return this;
  }

   /**
   * the Solution Run Template Id associated with this Scenario
   * @return runTemplateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Solution Run Template Id associated with this Scenario")

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
  @ApiModelProperty(value = "the associated Organization Id")

  public String getOrganizationId() {
    return organizationId;
  }




   /**
   * the associated Workspace Id
   * @return workspaceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the associated Workspace Id")

  public String getWorkspaceId() {
    return workspaceId;
  }




  public Scenario state(ScenarioJobState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScenarioJobState getState() {
    return state;
  }


  public void setState(ScenarioJobState state) {
    this.state = state;
  }


   /**
   * the Scenario creation date
   * @return creationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Scenario creation date")

  public Long getCreationDate() {
    return creationDate;
  }




   /**
   * the last time a Scenario was updated
   * @return lastUpdate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the last time a Scenario was updated")

  public Long getLastUpdate() {
    return lastUpdate;
  }




   /**
   * the name of the owner
   * @return ownerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the name of the owner")

  public String getOwnerName() {
    return ownerName;
  }




   /**
   * the Solution name
   * @return solutionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Solution name")

  public String getSolutionName() {
    return solutionName;
  }




   /**
   * the Solution Run Template name associated with this Scenario
   * @return runTemplateName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Solution Run Template name associated with this Scenario")

  public String getRunTemplateName() {
    return runTemplateName;
  }




  public Scenario datasetList(List<String> datasetList) {
    
    this.datasetList = datasetList;
    return this;
  }

  public Scenario addDatasetListItem(String datasetListItem) {
    if (this.datasetList == null) {
      this.datasetList = new ArrayList<String>();
    }
    this.datasetList.add(datasetListItem);
    return this;
  }

   /**
   * the list of Dataset Id associated to this Scenario Run Template
   * @return datasetList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the list of Dataset Id associated to this Scenario Run Template")

  public List<String> getDatasetList() {
    return datasetList;
  }


  public void setDatasetList(List<String> datasetList) {
    this.datasetList = datasetList;
  }


  public Scenario runSizing(ScenarioResourceSizing runSizing) {
    
    this.runSizing = runSizing;
    return this;
  }

   /**
   * Get runSizing
   * @return runSizing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScenarioResourceSizing getRunSizing() {
    return runSizing;
  }


  public void setRunSizing(ScenarioResourceSizing runSizing) {
    this.runSizing = runSizing;
  }


  public Scenario parametersValues(List<ScenarioRunTemplateParameterValue> parametersValues) {
    
    this.parametersValues = parametersValues;
    return this;
  }

  public Scenario addParametersValuesItem(ScenarioRunTemplateParameterValue parametersValuesItem) {
    if (this.parametersValues == null) {
      this.parametersValues = new ArrayList<ScenarioRunTemplateParameterValue>();
    }
    this.parametersValues.add(parametersValuesItem);
    return this;
  }

   /**
   * the list of Solution Run Template parameters values
   * @return parametersValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the list of Solution Run Template parameters values")

  public List<ScenarioRunTemplateParameterValue> getParametersValues() {
    return parametersValues;
  }


  public void setParametersValues(List<ScenarioRunTemplateParameterValue> parametersValues) {
    this.parametersValues = parametersValues;
  }


  public Scenario lastRun(ScenarioLastRun lastRun) {
    
    this.lastRun = lastRun;
    return this;
  }

   /**
   * Get lastRun
   * @return lastRun
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScenarioLastRun getLastRun() {
    return lastRun;
  }


  public void setLastRun(ScenarioLastRun lastRun) {
    this.lastRun = lastRun;
  }


  public Scenario parentLastRun(ScenarioLastRun parentLastRun) {
    
    this.parentLastRun = parentLastRun;
    return this;
  }

   /**
   * Get parentLastRun
   * @return parentLastRun
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScenarioLastRun getParentLastRun() {
    return parentLastRun;
  }


  public void setParentLastRun(ScenarioLastRun parentLastRun) {
    this.parentLastRun = parentLastRun;
  }


  public Scenario rootLastRun(ScenarioLastRun rootLastRun) {
    
    this.rootLastRun = rootLastRun;
    return this;
  }

   /**
   * Get rootLastRun
   * @return rootLastRun
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScenarioLastRun getRootLastRun() {
    return rootLastRun;
  }


  public void setRootLastRun(ScenarioLastRun rootLastRun) {
    this.rootLastRun = rootLastRun;
  }


  public Scenario validationStatus(ScenarioValidationStatus validationStatus) {
    
    this.validationStatus = validationStatus;
    return this;
  }

   /**
   * Get validationStatus
   * @return validationStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScenarioValidationStatus getValidationStatus() {
    return validationStatus;
  }


  public void setValidationStatus(ScenarioValidationStatus validationStatus) {
    this.validationStatus = validationStatus;
  }


  public Scenario security(ScenarioSecurity security) {
    
    this.security = security;
    return this;
  }

   /**
   * Get security
   * @return security
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScenarioSecurity getSecurity() {
    return security;
  }


  public void setSecurity(ScenarioSecurity security) {
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
    Scenario scenario = (Scenario) o;
    return Objects.equals(this.id, scenario.id) &&
        Objects.equals(this.name, scenario.name) &&
        Objects.equals(this.description, scenario.description) &&
        Objects.equals(this.tags, scenario.tags) &&
        Objects.equals(this.parentId, scenario.parentId) &&
        Objects.equals(this.ownerId, scenario.ownerId) &&
        Objects.equals(this.rootId, scenario.rootId) &&
        Objects.equals(this.solutionId, scenario.solutionId) &&
        Objects.equals(this.runTemplateId, scenario.runTemplateId) &&
        Objects.equals(this.organizationId, scenario.organizationId) &&
        Objects.equals(this.workspaceId, scenario.workspaceId) &&
        Objects.equals(this.state, scenario.state) &&
        Objects.equals(this.creationDate, scenario.creationDate) &&
        Objects.equals(this.lastUpdate, scenario.lastUpdate) &&
        Objects.equals(this.ownerName, scenario.ownerName) &&
        Objects.equals(this.solutionName, scenario.solutionName) &&
        Objects.equals(this.runTemplateName, scenario.runTemplateName) &&
        Objects.equals(this.datasetList, scenario.datasetList) &&
        Objects.equals(this.runSizing, scenario.runSizing) &&
        Objects.equals(this.parametersValues, scenario.parametersValues) &&
        Objects.equals(this.lastRun, scenario.lastRun) &&
        Objects.equals(this.parentLastRun, scenario.parentLastRun) &&
        Objects.equals(this.rootLastRun, scenario.rootLastRun) &&
        Objects.equals(this.validationStatus, scenario.validationStatus) &&
        Objects.equals(this.security, scenario.security);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, tags, parentId, ownerId, rootId, solutionId, runTemplateId, organizationId, workspaceId, state, creationDate, lastUpdate, ownerName, solutionName, runTemplateName, datasetList, runSizing, parametersValues, lastRun, parentLastRun, rootLastRun, validationStatus, security);
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
    sb.append("class Scenario {\n");
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

}

