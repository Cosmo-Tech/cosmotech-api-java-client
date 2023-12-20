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
import com.cosmotech.client.model.OrganizationService;
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
 * the cloud service resources of the Organization
 */
@ApiModel(description = "the cloud service resources of the Organization")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T13:33:21.643874989Z[Etc/UTC]")
public class OrganizationServices {
  public static final String SERIALIZED_NAME_TENANT_CREDENTIALS = "tenantCredentials";
  @SerializedName(SERIALIZED_NAME_TENANT_CREDENTIALS)
  private Map<String, Object> tenantCredentials = null;

  public static final String SERIALIZED_NAME_STORAGE = "storage";
  @SerializedName(SERIALIZED_NAME_STORAGE)
  private OrganizationService storage;

  public static final String SERIALIZED_NAME_SOLUTIONS_CONTAINER_REGISTRY = "solutionsContainerRegistry";
  @SerializedName(SERIALIZED_NAME_SOLUTIONS_CONTAINER_REGISTRY)
  private OrganizationService solutionsContainerRegistry;

  public OrganizationServices() { 
  }

  public OrganizationServices tenantCredentials(Map<String, Object> tenantCredentials) {
    
    this.tenantCredentials = tenantCredentials;
    return this;
  }

  public OrganizationServices putTenantCredentialsItem(String key, Object tenantCredentialsItem) {
    if (this.tenantCredentials == null) {
      this.tenantCredentials = new HashMap<String, Object>();
    }
    this.tenantCredentials.put(key, tenantCredentialsItem);
    return this;
  }

   /**
   * a freeform credentials object for the Organization tenant. Structure depends on cloud provider
   * @return tenantCredentials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "a freeform credentials object for the Organization tenant. Structure depends on cloud provider")

  public Map<String, Object> getTenantCredentials() {
    return tenantCredentials;
  }


  public void setTenantCredentials(Map<String, Object> tenantCredentials) {
    this.tenantCredentials = tenantCredentials;
  }


  public OrganizationServices storage(OrganizationService storage) {
    
    this.storage = storage;
    return this;
  }

   /**
   * Get storage
   * @return storage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OrganizationService getStorage() {
    return storage;
  }


  public void setStorage(OrganizationService storage) {
    this.storage = storage;
  }


  public OrganizationServices solutionsContainerRegistry(OrganizationService solutionsContainerRegistry) {
    
    this.solutionsContainerRegistry = solutionsContainerRegistry;
    return this;
  }

   /**
   * Get solutionsContainerRegistry
   * @return solutionsContainerRegistry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OrganizationService getSolutionsContainerRegistry() {
    return solutionsContainerRegistry;
  }


  public void setSolutionsContainerRegistry(OrganizationService solutionsContainerRegistry) {
    this.solutionsContainerRegistry = solutionsContainerRegistry;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationServices organizationServices = (OrganizationServices) o;
    return Objects.equals(this.tenantCredentials, organizationServices.tenantCredentials) &&
        Objects.equals(this.storage, organizationServices.storage) &&
        Objects.equals(this.solutionsContainerRegistry, organizationServices.solutionsContainerRegistry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantCredentials, storage, solutionsContainerRegistry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationServices {\n");
    sb.append("    tenantCredentials: ").append(toIndentedString(tenantCredentials)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    solutionsContainerRegistry: ").append(toIndentedString(solutionsContainerRegistry)).append("\n");
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

