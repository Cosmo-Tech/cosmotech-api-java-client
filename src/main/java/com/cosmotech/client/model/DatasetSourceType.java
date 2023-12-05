/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.0.18-dev
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * the Dataset Source Type
 */
@JsonAdapter(DatasetSourceType.Adapter.class)
public enum DatasetSourceType {
  
  ADT("ADT"),
  
  AZURESTORAGE("AzureStorage"),
  
  FILE("File"),
  
  NONE("None"),
  
  TWINCACHE("Twincache");

  private String value;

  DatasetSourceType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DatasetSourceType fromValue(String value) {
    for (DatasetSourceType b : DatasetSourceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DatasetSourceType> {
    @Override
    public void write(final JsonWriter jsonWriter, final DatasetSourceType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DatasetSourceType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DatasetSourceType.fromValue(value);
    }
  }
}

