/*
 * Cosmo Tech Plaform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.0.0-dev
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.cosmotech.client.model.UserOrganization;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-24T13:38:14.849224899Z[Etc/UTC]")
public class User {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Gets or Sets platformRoles
   */
  @JsonAdapter(PlatformRolesEnum.Adapter.class)
  public enum PlatformRolesEnum {
    ADMIN("Admin"),
    
    USER("User"),
    
    CONNECTORDEVELOPER("ConnectorDeveloper");

    private String value;

    PlatformRolesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PlatformRolesEnum fromValue(String value) {
      for (PlatformRolesEnum b : PlatformRolesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PlatformRolesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PlatformRolesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PlatformRolesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PlatformRolesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PLATFORM_ROLES = "platformRoles";
  @SerializedName(SERIALIZED_NAME_PLATFORM_ROLES)
  private List<PlatformRolesEnum> platformRoles = null;

  public static final String SERIALIZED_NAME_ORGANIZATIONS = "organizations";
  @SerializedName(SERIALIZED_NAME_ORGANIZATIONS)
  private List<UserOrganization> organizations = null;

  public User() { 
  }

  
  public User(
     String id, 
     List<UserOrganization> organizations
  ) {
    this();
    this.id = id;
    this.organizations = organizations;
  }

   /**
   * the User unique identifier
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the User unique identifier")

  public String getId() {
    return id;
  }




  public User name(String name) {
    
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


  public User platformRoles(List<PlatformRolesEnum> platformRoles) {
    
    this.platformRoles = platformRoles;
    return this;
  }

  public User addPlatformRolesItem(PlatformRolesEnum platformRolesItem) {
    if (this.platformRoles == null) {
      this.platformRoles = new ArrayList<PlatformRolesEnum>();
    }
    this.platformRoles.add(platformRolesItem);
    return this;
  }

   /**
   * the list of Platform roles
   * @return platformRoles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the list of Platform roles")

  public List<PlatformRolesEnum> getPlatformRoles() {
    return platformRoles;
  }


  public void setPlatformRoles(List<PlatformRolesEnum> platformRoles) {
    this.platformRoles = platformRoles;
  }


   /**
   * Get organizations
   * @return organizations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserOrganization> getOrganizations() {
    return organizations;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.name, user.name) &&
        Objects.equals(this.platformRoles, user.platformRoles) &&
        Objects.equals(this.organizations, user.organizations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, platformRoles, organizations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    platformRoles: ").append(toIndentedString(platformRoles)).append("\n");
    sb.append("    organizations: ").append(toIndentedString(organizations)).append("\n");
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

