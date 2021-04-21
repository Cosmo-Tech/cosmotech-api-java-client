/*
 * Cosmo Tech Plaform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 0.0.1-SNAPSHOT
 * 
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
 * RunTemplateResourceStorage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-21T17:40:51.775294+02:00[Europe/Paris]")
public class RunTemplateResourceStorage {
  /**
   * the storage type. Use ${CSM_PROJECT_PATH} or ${CSM_STORAGE_SIMULATOR} behind the scene
   */
  @JsonAdapter(StorageTypeEnum.Adapter.class)
  public enum StorageTypeEnum {
    LOCAL("local"),
    
    CLOUD("cloud"),
    
    CUSTOMURI("customUri");

    private String value;

    StorageTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StorageTypeEnum fromValue(String value) {
      for (StorageTypeEnum b : StorageTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StorageTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StorageTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StorageTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StorageTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STORAGE_TYPE = "storageType";
  @SerializedName(SERIALIZED_NAME_STORAGE_TYPE)
  private StorageTypeEnum storageType;

  public static final String SERIALIZED_NAME_RESOURCE_PATH = "resourcePath";
  @SerializedName(SERIALIZED_NAME_RESOURCE_PATH)
  private String resourcePath;

  public static final String SERIALIZED_NAME_CUSTOM_URI = "customUri";
  @SerializedName(SERIALIZED_NAME_CUSTOM_URI)
  private String customUri;


  public RunTemplateResourceStorage storageType(StorageTypeEnum storageType) {
    
    this.storageType = storageType;
    return this;
  }

   /**
   * the storage type. Use ${CSM_PROJECT_PATH} or ${CSM_STORAGE_SIMULATOR} behind the scene
   * @return storageType
  **/
  @ApiModelProperty(required = true, value = "the storage type. Use ${CSM_PROJECT_PATH} or ${CSM_STORAGE_SIMULATOR} behind the scene")

  public StorageTypeEnum getStorageType() {
    return storageType;
  }


  public void setStorageType(StorageTypeEnum storageType) {
    this.storageType = storageType;
  }


  public RunTemplateResourceStorage resourcePath(String resourcePath) {
    
    this.resourcePath = resourcePath;
    return this;
  }

   /**
   * the resource path
   * @return resourcePath
  **/
  @ApiModelProperty(required = true, value = "the resource path")

  public String getResourcePath() {
    return resourcePath;
  }


  public void setResourcePath(String resourcePath) {
    this.resourcePath = resourcePath;
  }


  public RunTemplateResourceStorage customUri(String customUri) {
    
    this.customUri = customUri;
    return this;
  }

   /**
   * a custom Uri to provide the resource in resourcePath
   * @return customUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "a custom Uri to provide the resource in resourcePath")

  public String getCustomUri() {
    return customUri;
  }


  public void setCustomUri(String customUri) {
    this.customUri = customUri;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunTemplateResourceStorage runTemplateResourceStorage = (RunTemplateResourceStorage) o;
    return Objects.equals(this.storageType, runTemplateResourceStorage.storageType) &&
        Objects.equals(this.resourcePath, runTemplateResourceStorage.resourcePath) &&
        Objects.equals(this.customUri, runTemplateResourceStorage.customUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storageType, resourcePath, customUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunTemplateResourceStorage {\n");
    sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
    sb.append("    resourcePath: ").append(toIndentedString(resourcePath)).append("\n");
    sb.append("    customUri: ").append(toIndentedString(customUri)).append("\n");
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

