/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 2.3.16
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
 * Source job import information
 */
@ApiModel(description = "Source job import information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-19T16:14:14.335770107Z[Etc/UTC]")
public class SourceInfo {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  /**
   * the source type containing the files to import
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ADT("ADT"),
    
    STORAGE("Storage");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public SourceInfo() { 
  }

  public SourceInfo name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * the source name containing the files to import
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the source name containing the files to import")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SourceInfo location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * the source location containing the files to import
   * @return location
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the source location containing the files to import")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public SourceInfo path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * the source location containing the files to import
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the source location containing the files to import")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public SourceInfo type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * the source type containing the files to import
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the source type containing the files to import")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceInfo sourceInfo = (SourceInfo) o;
    return Objects.equals(this.name, sourceInfo.name) &&
        Objects.equals(this.location, sourceInfo.location) &&
        Objects.equals(this.path, sourceInfo.path) &&
        Objects.equals(this.type, sourceInfo.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, location, path, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceInfo {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

