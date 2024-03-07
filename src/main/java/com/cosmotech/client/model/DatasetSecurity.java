/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.1.3-SNAPSHOT
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.cosmotech.client.model.DatasetAccessControl;
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
 * the dataset security information
 */
@ApiModel(description = "the dataset security information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-07T10:20:08.482961198Z[Etc/UTC]")
public class DatasetSecurity {
  public static final String SERIALIZED_NAME_DEFAULT = "default";
  @SerializedName(SERIALIZED_NAME_DEFAULT)
  private String _default;

  public static final String SERIALIZED_NAME_ACCESS_CONTROL_LIST = "accessControlList";
  @SerializedName(SERIALIZED_NAME_ACCESS_CONTROL_LIST)
  private List<DatasetAccessControl> accessControlList = new ArrayList<DatasetAccessControl>();

  public DatasetSecurity() { 
  }

  public DatasetSecurity _default(String _default) {
    
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


  public DatasetSecurity accessControlList(List<DatasetAccessControl> accessControlList) {
    
    this.accessControlList = accessControlList;
    return this;
  }

  public DatasetSecurity addAccessControlListItem(DatasetAccessControl accessControlListItem) {
    this.accessControlList.add(accessControlListItem);
    return this;
  }

   /**
   * the list which can access this Dataset with detailed access control information
   * @return accessControlList
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the list which can access this Dataset with detailed access control information")

  public List<DatasetAccessControl> getAccessControlList() {
    return accessControlList;
  }


  public void setAccessControlList(List<DatasetAccessControl> accessControlList) {
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
    DatasetSecurity datasetSecurity = (DatasetSecurity) o;
    return Objects.equals(this._default, datasetSecurity._default) &&
        Objects.equals(this.accessControlList, datasetSecurity.accessControlList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_default, accessControlList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetSecurity {\n");
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

