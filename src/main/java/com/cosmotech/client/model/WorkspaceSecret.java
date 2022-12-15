/*
 * Cosmo Tech Plaform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 1.0.9-SNAPSHOT
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

/**
 * the secret definition
 */
@ApiModel(description = "the secret definition")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-15T13:45:26.005222667Z[Etc/UTC]")
public class WorkspaceSecret {
  public static final String SERIALIZED_NAME_DEDICATED_EVENT_HUB_KEY = "dedicatedEventHubKey";
  @SerializedName(SERIALIZED_NAME_DEDICATED_EVENT_HUB_KEY)
  private String dedicatedEventHubKey;

  public WorkspaceSecret() { 
  }

  public WorkspaceSecret dedicatedEventHubKey(String dedicatedEventHubKey) {
    
    this.dedicatedEventHubKey = dedicatedEventHubKey;
    return this;
  }

   /**
   * the dedicated event hub shared access key
   * @return dedicatedEventHubKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the dedicated event hub shared access key")

  public String getDedicatedEventHubKey() {
    return dedicatedEventHubKey;
  }


  public void setDedicatedEventHubKey(String dedicatedEventHubKey) {
    this.dedicatedEventHubKey = dedicatedEventHubKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkspaceSecret workspaceSecret = (WorkspaceSecret) o;
    return Objects.equals(this.dedicatedEventHubKey, workspaceSecret.dedicatedEventHubKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dedicatedEventHubKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceSecret {\n");
    sb.append("    dedicatedEventHubKey: ").append(toIndentedString(dedicatedEventHubKey)).append("\n");
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
