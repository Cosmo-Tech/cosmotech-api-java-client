/*
 * Cosmo Tech Plaform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 1.0.5-SNAPSHOT
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
import java.util.ArrayList;
import java.util.List;

/**
 * the list of User roles for a Workspace
 */
@ApiModel(description = "the list of User roles for a Workspace")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-30T08:21:20.095090669Z[Etc/UTC]")
public class UserWorkspace {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<String> roles = null;

  public UserWorkspace() { 
  }

  
  public UserWorkspace(
     String id, 
     String name
  ) {
    this();
    this.id = id;
    this.name = name;
  }

   /**
   * the Workspace Id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Workspace Id")

  public String getId() {
    return id;
  }




   /**
   * the Workspace name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Workspace name")

  public String getName() {
    return name;
  }




  public UserWorkspace roles(List<String> roles) {
    
    this.roles = roles;
    return this;
  }

  public UserWorkspace addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<String>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * the roles of the User in the Workspace
   * @return roles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the roles of the User in the Workspace")

  public List<String> getRoles() {
    return roles;
  }


  public void setRoles(List<String> roles) {
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
    UserWorkspace userWorkspace = (UserWorkspace) o;
    return Objects.equals(this.id, userWorkspace.id) &&
        Objects.equals(this.name, userWorkspace.name) &&
        Objects.equals(this.roles, userWorkspace.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserWorkspace {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

