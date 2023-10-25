/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.0.9-SNAPSHOT
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.cosmotech.client.model.OrganizationAccessControl;
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
 * the Organization security information
 */
@ApiModel(description = "the Organization security information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-25T12:33:05.835401052Z[Etc/UTC]")
public class OrganizationSecurity {
  public static final String SERIALIZED_NAME_DEFAULT = "default";
  @SerializedName(SERIALIZED_NAME_DEFAULT)
  private String _default;

  public static final String SERIALIZED_NAME_ACCESS_CONTROL_LIST = "accessControlList";
  @SerializedName(SERIALIZED_NAME_ACCESS_CONTROL_LIST)
  private List<OrganizationAccessControl> accessControlList = new ArrayList<OrganizationAccessControl>();

  public OrganizationSecurity() { 
  }

  public OrganizationSecurity _default(String _default) {
    
    this._default = _default;
    return this;
  }

   /**
   * the role by default
   * @return _default
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the role by default")

  public String getDefault() {
    return _default;
  }


  public void setDefault(String _default) {
    this._default = _default;
  }


  public OrganizationSecurity accessControlList(List<OrganizationAccessControl> accessControlList) {
    
    this.accessControlList = accessControlList;
    return this;
  }

  public OrganizationSecurity addAccessControlListItem(OrganizationAccessControl accessControlListItem) {
    this.accessControlList.add(accessControlListItem);
    return this;
  }

   /**
   * the list which can access this Organization with detailed access control information
   * @return accessControlList
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the list which can access this Organization with detailed access control information")

  public List<OrganizationAccessControl> getAccessControlList() {
    return accessControlList;
  }


  public void setAccessControlList(List<OrganizationAccessControl> accessControlList) {
    this.accessControlList = accessControlList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationSecurity organizationSecurity = (OrganizationSecurity) o;
    return Objects.equals(this._default, organizationSecurity._default) &&
        Objects.equals(this.accessControlList, organizationSecurity.accessControlList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_default, accessControlList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationSecurity {\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    accessControlList: ").append(toIndentedString(accessControlList)).append("\n");
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

