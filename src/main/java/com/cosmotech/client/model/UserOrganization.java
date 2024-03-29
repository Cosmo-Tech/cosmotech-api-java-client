/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 2.3.17
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.cosmotech.client.model.UserWorkspace;
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
 * The organization of the user
 */
@ApiModel(description = "The organization of the user")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-22T13:12:00.806656045Z[Etc/UTC]")
public class UserOrganization {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<String> roles = null;

  public static final String SERIALIZED_NAME_WORKSPACES = "workspaces";
  @SerializedName(SERIALIZED_NAME_WORKSPACES)
  private List<UserWorkspace> workspaces = null;

  public UserOrganization() { 
  }

  
  public UserOrganization(
     List<UserWorkspace> workspaces
  ) {
    this();
    this.workspaces = workspaces;
  }

  public UserOrganization id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * the Organization id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Organization id")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public UserOrganization name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * the Organization name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Organization name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UserOrganization roles(List<String> roles) {
    
    this.roles = roles;
    return this;
  }

  public UserOrganization addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<String>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * the roles of the User in the Organization
   * @return roles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the roles of the User in the Organization")

  public List<String> getRoles() {
    return roles;
  }


  public void setRoles(List<String> roles) {
    this.roles = roles;
  }


   /**
   * the list of Workspaces roles
   * @return workspaces
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the list of Workspaces roles")

  public List<UserWorkspace> getWorkspaces() {
    return workspaces;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserOrganization userOrganization = (UserOrganization) o;
    return Objects.equals(this.id, userOrganization.id) &&
        Objects.equals(this.name, userOrganization.name) &&
        Objects.equals(this.roles, userOrganization.roles) &&
        Objects.equals(this.workspaces, userOrganization.workspaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, roles, workspaces);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserOrganization {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    workspaces: ").append(toIndentedString(workspaces)).append("\n");
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

