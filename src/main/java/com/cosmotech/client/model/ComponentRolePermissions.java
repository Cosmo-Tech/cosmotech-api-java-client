/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 2.3.12-SNAPSHOT
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import java.util.Arrays;
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
 * a RBAC by component
 */
@ApiModel(description = "a RBAC by component")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-30T07:45:01.928035867Z[Etc/UTC]")
public class ComponentRolePermissions {
  public static final String SERIALIZED_NAME_COMPONENT = "component";
  @SerializedName(SERIALIZED_NAME_COMPONENT)
  private String component;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private Map<String, List<String>> roles = null;

  public ComponentRolePermissions() { 
  }

  public ComponentRolePermissions component(String component) {
    
    this.component = component;
    return this;
  }

   /**
   * Get component
   * @return component
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getComponent() {
    return component;
  }


  public void setComponent(String component) {
    this.component = component;
  }


  public ComponentRolePermissions roles(Map<String, List<String>> roles) {
    
    this.roles = roles;
    return this;
  }

  public ComponentRolePermissions putRolesItem(String key, List<String> rolesItem) {
    if (this.roles == null) {
      this.roles = new HashMap<String, List<String>>();
    }
    this.roles.put(key, rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, List<String>> getRoles() {
    return roles;
  }


  public void setRoles(Map<String, List<String>> roles) {
    this.roles = roles;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentRolePermissions componentRolePermissions = (ComponentRolePermissions) o;
    return Objects.equals(this.component, componentRolePermissions.component) &&
        Objects.equals(this.roles, componentRolePermissions.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(component, roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentRolePermissions {\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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

