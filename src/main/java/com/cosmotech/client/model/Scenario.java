/*
 * Cosmo Tech Plaform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 0.0.1-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.cosmotech.client.model.ScenarioAllOf;
import com.cosmotech.client.model.ScenarioAnalysis;
import com.cosmotech.client.model.ScenarioBase;
import com.cosmotech.client.model.ScenarioUser;
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
 * Scenario
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T16:41:35.745089+02:00[Europe/Paris]")
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

  public static final String SERIALIZED_NAME_SIMULATOR_ID = "simulatorId";
  @SerializedName(SERIALIZED_NAME_SIMULATOR_ID)
  private String simulatorId;

  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private List<ScenarioUser> users = null;

  public static final String SERIALIZED_NAME_SIMULATOR_NAME = "simulatorName";
  @SerializedName(SERIALIZED_NAME_SIMULATOR_NAME)
  private String simulatorName;

  public static final String SERIALIZED_NAME_SIMULATOR_ANALYSIS_NAME = "simulatorAnalysisName";
  @SerializedName(SERIALIZED_NAME_SIMULATOR_ANALYSIS_NAME)
  private String simulatorAnalysisName;

  public static final String SERIALIZED_NAME_ANALYSIS = "analysis";
  @SerializedName(SERIALIZED_NAME_ANALYSIS)
  private ScenarioAnalysis analysis;

  public static final String SERIALIZED_NAME_SEND_INPUT_TO_DATA_WAREHOUSE = "sendInputToDataWarehouse";
  @SerializedName(SERIALIZED_NAME_SEND_INPUT_TO_DATA_WAREHOUSE)
  private Boolean sendInputToDataWarehouse;


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
  @ApiModelProperty(required = true, value = "the Scenario name")

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
   * the Simulator Id associated with this Scenario
   * @return simulatorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Simulator Id associated with this Scenario")

  public String getSimulatorId() {
    return simulatorId;
  }




  public Scenario users(List<ScenarioUser> users) {
    
    this.users = users;
    return this;
  }

  public Scenario addUsersItem(ScenarioUser usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<ScenarioUser>();
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

  public List<ScenarioUser> getUsers() {
    return users;
  }


  public void setUsers(List<ScenarioUser> users) {
    this.users = users;
  }


  public Scenario simulatorName(String simulatorName) {
    
    this.simulatorName = simulatorName;
    return this;
  }

   /**
   * Get simulatorName
   * @return simulatorName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSimulatorName() {
    return simulatorName;
  }


  public void setSimulatorName(String simulatorName) {
    this.simulatorName = simulatorName;
  }


  public Scenario simulatorAnalysisName(String simulatorAnalysisName) {
    
    this.simulatorAnalysisName = simulatorAnalysisName;
    return this;
  }

   /**
   * Get simulatorAnalysisName
   * @return simulatorAnalysisName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSimulatorAnalysisName() {
    return simulatorAnalysisName;
  }


  public void setSimulatorAnalysisName(String simulatorAnalysisName) {
    this.simulatorAnalysisName = simulatorAnalysisName;
  }


  public Scenario analysis(ScenarioAnalysis analysis) {
    
    this.analysis = analysis;
    return this;
  }

   /**
   * Get analysis
   * @return analysis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScenarioAnalysis getAnalysis() {
    return analysis;
  }


  public void setAnalysis(ScenarioAnalysis analysis) {
    this.analysis = analysis;
  }


  public Scenario sendInputToDataWarehouse(Boolean sendInputToDataWarehouse) {
    
    this.sendInputToDataWarehouse = sendInputToDataWarehouse;
    return this;
  }

   /**
   * default setting for all Analysis to set whether or not the Dataset values and the input parameters values are send to the DataWarehouse prior to Simulation Run
   * @return sendInputToDataWarehouse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "default setting for all Analysis to set whether or not the Dataset values and the input parameters values are send to the DataWarehouse prior to Simulation Run")

  public Boolean getSendInputToDataWarehouse() {
    return sendInputToDataWarehouse;
  }


  public void setSendInputToDataWarehouse(Boolean sendInputToDataWarehouse) {
    this.sendInputToDataWarehouse = sendInputToDataWarehouse;
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
        Objects.equals(this.simulatorId, scenario.simulatorId) &&
        Objects.equals(this.users, scenario.users) &&
        Objects.equals(this.simulatorName, scenario.simulatorName) &&
        Objects.equals(this.simulatorAnalysisName, scenario.simulatorAnalysisName) &&
        Objects.equals(this.analysis, scenario.analysis) &&
        Objects.equals(this.sendInputToDataWarehouse, scenario.sendInputToDataWarehouse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, tags, parentId, ownerId, simulatorId, users, simulatorName, simulatorAnalysisName, analysis, sendInputToDataWarehouse);
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
    sb.append("    simulatorId: ").append(toIndentedString(simulatorId)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    simulatorName: ").append(toIndentedString(simulatorName)).append("\n");
    sb.append("    simulatorAnalysisName: ").append(toIndentedString(simulatorAnalysisName)).append("\n");
    sb.append("    analysis: ").append(toIndentedString(analysis)).append("\n");
    sb.append("    sendInputToDataWarehouse: ").append(toIndentedString(sendInputToDataWarehouse)).append("\n");
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

