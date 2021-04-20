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
import com.cosmotech.client.model.WorkspaceService;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * the cloud service resources of the Workspace
 */
@ApiModel(description = "the cloud service resources of the Workspace")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-20T11:19:04.423677+02:00[Europe/Paris]")
public class WorkspaceServices {
  public static final String SERIALIZED_NAME_TENANT_CREDENTIALS = "tenantCredentials";
  @SerializedName(SERIALIZED_NAME_TENANT_CREDENTIALS)
  private Map<String, Object> tenantCredentials = null;

  public static final String SERIALIZED_NAME_RESULTS_EVENT_BUS = "resultsEventBus";
  @SerializedName(SERIALIZED_NAME_RESULTS_EVENT_BUS)
  private WorkspaceService resultsEventBus;

  public static final String SERIALIZED_NAME_SCENARIORUN_EVENT_BUS = "scenariorunEventBus";
  @SerializedName(SERIALIZED_NAME_SCENARIORUN_EVENT_BUS)
  private WorkspaceService scenariorunEventBus;

  public static final String SERIALIZED_NAME_DATA_WAREHOUSE = "dataWarehouse";
  @SerializedName(SERIALIZED_NAME_DATA_WAREHOUSE)
  private WorkspaceService dataWarehouse;

  public static final String SERIALIZED_NAME_STORAGE = "storage";
  @SerializedName(SERIALIZED_NAME_STORAGE)
  private WorkspaceService storage;


   /**
   * a freeform credentials object for the Organization tenant. Structure depends on cloud provider
   * @return tenantCredentials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "a freeform credentials object for the Organization tenant. Structure depends on cloud provider")

  public Map<String, Object> getTenantCredentials() {
    return tenantCredentials;
  }




  public WorkspaceServices resultsEventBus(WorkspaceService resultsEventBus) {
    
    this.resultsEventBus = resultsEventBus;
    return this;
  }

   /**
   * Get resultsEventBus
   * @return resultsEventBus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WorkspaceService getResultsEventBus() {
    return resultsEventBus;
  }


  public void setResultsEventBus(WorkspaceService resultsEventBus) {
    this.resultsEventBus = resultsEventBus;
  }


  public WorkspaceServices scenariorunEventBus(WorkspaceService scenariorunEventBus) {
    
    this.scenariorunEventBus = scenariorunEventBus;
    return this;
  }

   /**
   * Get scenariorunEventBus
   * @return scenariorunEventBus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WorkspaceService getScenariorunEventBus() {
    return scenariorunEventBus;
  }


  public void setScenariorunEventBus(WorkspaceService scenariorunEventBus) {
    this.scenariorunEventBus = scenariorunEventBus;
  }


  public WorkspaceServices dataWarehouse(WorkspaceService dataWarehouse) {
    
    this.dataWarehouse = dataWarehouse;
    return this;
  }

   /**
   * Get dataWarehouse
   * @return dataWarehouse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WorkspaceService getDataWarehouse() {
    return dataWarehouse;
  }


  public void setDataWarehouse(WorkspaceService dataWarehouse) {
    this.dataWarehouse = dataWarehouse;
  }


  public WorkspaceServices storage(WorkspaceService storage) {
    
    this.storage = storage;
    return this;
  }

   /**
   * Get storage
   * @return storage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WorkspaceService getStorage() {
    return storage;
  }


  public void setStorage(WorkspaceService storage) {
    this.storage = storage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkspaceServices workspaceServices = (WorkspaceServices) o;
    return Objects.equals(this.tenantCredentials, workspaceServices.tenantCredentials) &&
        Objects.equals(this.resultsEventBus, workspaceServices.resultsEventBus) &&
        Objects.equals(this.scenariorunEventBus, workspaceServices.scenariorunEventBus) &&
        Objects.equals(this.dataWarehouse, workspaceServices.dataWarehouse) &&
        Objects.equals(this.storage, workspaceServices.storage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantCredentials, resultsEventBus, scenariorunEventBus, dataWarehouse, storage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceServices {\n");
    sb.append("    tenantCredentials: ").append(toIndentedString(tenantCredentials)).append("\n");
    sb.append("    resultsEventBus: ").append(toIndentedString(resultsEventBus)).append("\n");
    sb.append("    scenariorunEventBus: ").append(toIndentedString(scenariorunEventBus)).append("\n");
    sb.append("    dataWarehouse: ").append(toIndentedString(dataWarehouse)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
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

