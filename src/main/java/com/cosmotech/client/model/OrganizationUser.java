/*
 * Cosmo Tech Plaform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 2.3.4-SNAPSHOT
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
 * a User
 */
@ApiModel(description = "a User")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-06T15:40:53.826926102Z[Etc/UTC]")
public class OrganizationUser {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Gets or Sets roles
   */
  @JsonAdapter(RolesEnum.Adapter.class)
  public enum RolesEnum {
    ADMIN("Admin"),
    
    USER("User"),
    
    VIEWER("Viewer"),
    
    DEVELOPER("Developer");

    private String value;

    RolesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RolesEnum fromValue(String value) {
      for (RolesEnum b : RolesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RolesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RolesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RolesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RolesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<RolesEnum> roles = new ArrayList<RolesEnum>();

  public OrganizationUser() { 
  }

  
  public OrganizationUser(
     String id
  ) {
    this();
    this.id = id;
  }

   /**
   * the User unique identifier, in response
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the User unique identifier, in response")

  public String getId() {
    return id;
  }




  public OrganizationUser name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * the User name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the User name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public OrganizationUser roles(List<RolesEnum> roles) {
    
    this.roles = roles;
    return this;
  }

  public OrganizationUser addRolesItem(RolesEnum rolesItem) {
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * the User&#39;s roles for the Organization
   * @return roles
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the User's roles for the Organization")

  public List<RolesEnum> getRoles() {
    return roles;
  }


  public void setRoles(List<RolesEnum> roles) {
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
    OrganizationUser organizationUser = (OrganizationUser) o;
    return Objects.equals(this.id, organizationUser.id) &&
        Objects.equals(this.name, organizationUser.name) &&
        Objects.equals(this.roles, organizationUser.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationUser {\n");
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

