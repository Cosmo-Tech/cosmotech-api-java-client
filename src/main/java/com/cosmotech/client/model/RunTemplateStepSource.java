/*
 * Cosmo Tech Plaform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 0.0.8-SNAPSHOT
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
 * the source local or cloud
 */
@JsonAdapter(RunTemplateStepSource.Adapter.class)
public enum RunTemplateStepSource {
  
  LOCAL("local"),
  
  CLOUD("cloud");

  private String value;

  RunTemplateStepSource(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RunTemplateStepSource fromValue(String value) {
    for (RunTemplateStepSource b : RunTemplateStepSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<RunTemplateStepSource> {
    @Override
    public void write(final JsonWriter jsonWriter, final RunTemplateStepSource enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RunTemplateStepSource read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RunTemplateStepSource.fromValue(value);
    }
  }
}
