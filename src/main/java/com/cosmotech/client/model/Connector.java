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
import com.cosmotech.client.model.ConnectorParameterGroup;
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
 * a version of a Connector
 */
@ApiModel(description = "a version of a Connector")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T13:16:00.927778392Z[Etc/UTC]")
public class Connector {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_REPOSITORY = "repository";
  @SerializedName(SERIALIZED_NAME_REPOSITORY)
  private String repository;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_OWNER_ID = "ownerId";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_AZURE_MANAGED_IDENTITY = "azureManagedIdentity";
  @SerializedName(SERIALIZED_NAME_AZURE_MANAGED_IDENTITY)
  private Boolean azureManagedIdentity;

  public static final String SERIALIZED_NAME_AZURE_AUTHENTICATION_WITH_CUSTOMER_APP_REGISTRATION = "azureAuthenticationWithCustomerAppRegistration";
  @SerializedName(SERIALIZED_NAME_AZURE_AUTHENTICATION_WITH_CUSTOMER_APP_REGISTRATION)
  private Boolean azureAuthenticationWithCustomerAppRegistration;

  /**
   * The read and write capabilities of connector
   */
  @JsonAdapter(IoTypesEnum.Adapter.class)
  public enum IoTypesEnum {
    READ("read"),
    
    WRITE("write");

    private String value;

    IoTypesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IoTypesEnum fromValue(String value) {
      for (IoTypesEnum b : IoTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IoTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IoTypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IoTypesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IoTypesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_IO_TYPES = "ioTypes";
  @SerializedName(SERIALIZED_NAME_IO_TYPES)
  private List<IoTypesEnum> ioTypes = new ArrayList<IoTypesEnum>();

  public static final String SERIALIZED_NAME_PARAMETER_GROUPS = "parameterGroups";
  @SerializedName(SERIALIZED_NAME_PARAMETER_GROUPS)
  private List<ConnectorParameterGroup> parameterGroups = null;

  public Connector() { 
  }

  
  public Connector(
     String id, 
     String ownerId
  ) {
    this();
    this.id = id;
    this.ownerId = ownerId;
  }

   /**
   * the Connector version unique identifier
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Connector version unique identifier")

  public String getId() {
    return id;
  }




  public Connector key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * the Connector key which group Connector versions
   * @return key
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the Connector key which group Connector versions")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public Connector name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * the Connector name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the Connector name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Connector description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * the Connector description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Connector description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Connector repository(String repository) {
    
    this.repository = repository;
    return this;
  }

   /**
   * the registry repository containing the image
   * @return repository
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the registry repository containing the image")

  public String getRepository() {
    return repository;
  }


  public void setRepository(String repository) {
    this.repository = repository;
  }


  public Connector version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * the Connector version MAJOR.MINOR.PATCH. Must be aligned with an existing repository tag
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the Connector version MAJOR.MINOR.PATCH. Must be aligned with an existing repository tag")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public Connector tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public Connector addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * the list of tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the list of tags")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


   /**
   * the user id which own this connector version
   * @return ownerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the user id which own this connector version")

  public String getOwnerId() {
    return ownerId;
  }




  public Connector url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * an optional URL link to connector page
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "an optional URL link to connector page")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public Connector azureManagedIdentity(Boolean azureManagedIdentity) {
    
    this.azureManagedIdentity = azureManagedIdentity;
    return this;
  }

   /**
   * whether or not the connector uses Azure Managed Identity
   * @return azureManagedIdentity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "whether or not the connector uses Azure Managed Identity")

  public Boolean getAzureManagedIdentity() {
    return azureManagedIdentity;
  }


  public void setAzureManagedIdentity(Boolean azureManagedIdentity) {
    this.azureManagedIdentity = azureManagedIdentity;
  }


  public Connector azureAuthenticationWithCustomerAppRegistration(Boolean azureAuthenticationWithCustomerAppRegistration) {
    
    this.azureAuthenticationWithCustomerAppRegistration = azureAuthenticationWithCustomerAppRegistration;
    return this;
  }

   /**
   * whether to authenticate against Azure using the app registration credentials provided by the customer
   * @return azureAuthenticationWithCustomerAppRegistration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "whether to authenticate against Azure using the app registration credentials provided by the customer")

  public Boolean getAzureAuthenticationWithCustomerAppRegistration() {
    return azureAuthenticationWithCustomerAppRegistration;
  }


  public void setAzureAuthenticationWithCustomerAppRegistration(Boolean azureAuthenticationWithCustomerAppRegistration) {
    this.azureAuthenticationWithCustomerAppRegistration = azureAuthenticationWithCustomerAppRegistration;
  }


  public Connector ioTypes(List<IoTypesEnum> ioTypes) {
    
    this.ioTypes = ioTypes;
    return this;
  }

  public Connector addIoTypesItem(IoTypesEnum ioTypesItem) {
    this.ioTypes.add(ioTypesItem);
    return this;
  }

   /**
   * Get ioTypes
   * @return ioTypes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<IoTypesEnum> getIoTypes() {
    return ioTypes;
  }


  public void setIoTypes(List<IoTypesEnum> ioTypes) {
    this.ioTypes = ioTypes;
  }


  public Connector parameterGroups(List<ConnectorParameterGroup> parameterGroups) {
    
    this.parameterGroups = parameterGroups;
    return this;
  }

  public Connector addParameterGroupsItem(ConnectorParameterGroup parameterGroupsItem) {
    if (this.parameterGroups == null) {
      this.parameterGroups = new ArrayList<ConnectorParameterGroup>();
    }
    this.parameterGroups.add(parameterGroupsItem);
    return this;
  }

   /**
   * the list of connector parameters groups
   * @return parameterGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the list of connector parameters groups")

  public List<ConnectorParameterGroup> getParameterGroups() {
    return parameterGroups;
  }


  public void setParameterGroups(List<ConnectorParameterGroup> parameterGroups) {
    this.parameterGroups = parameterGroups;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Connector connector = (Connector) o;
    return Objects.equals(this.id, connector.id) &&
        Objects.equals(this.key, connector.key) &&
        Objects.equals(this.name, connector.name) &&
        Objects.equals(this.description, connector.description) &&
        Objects.equals(this.repository, connector.repository) &&
        Objects.equals(this.version, connector.version) &&
        Objects.equals(this.tags, connector.tags) &&
        Objects.equals(this.ownerId, connector.ownerId) &&
        Objects.equals(this.url, connector.url) &&
        Objects.equals(this.azureManagedIdentity, connector.azureManagedIdentity) &&
        Objects.equals(this.azureAuthenticationWithCustomerAppRegistration, connector.azureAuthenticationWithCustomerAppRegistration) &&
        Objects.equals(this.ioTypes, connector.ioTypes) &&
        Objects.equals(this.parameterGroups, connector.parameterGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key, name, description, repository, version, tags, ownerId, url, azureManagedIdentity, azureAuthenticationWithCustomerAppRegistration, ioTypes, parameterGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connector {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    azureManagedIdentity: ").append(toIndentedString(azureManagedIdentity)).append("\n");
    sb.append("    azureAuthenticationWithCustomerAppRegistration: ").append(toIndentedString(azureAuthenticationWithCustomerAppRegistration)).append("\n");
    sb.append("    ioTypes: ").append(toIndentedString(ioTypes)).append("\n");
    sb.append("    parameterGroups: ").append(toIndentedString(parameterGroups)).append("\n");
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

