/*
 * Cosmo Tech Plaform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 2.1.9-SNAPSHOT
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
 * the Run Template step handler identifier
 */
@JsonAdapter(RunTemplateHandlerId.Adapter.class)
public enum RunTemplateHandlerId {
  
  PARAMETERS_HANDLER("parameters_handler"),
  
  VALIDATOR("validator"),
  
  PRERUN("prerun"),
  
  ENGINE("engine"),
  
  POSTRUN("postrun"),
  
  SCENARIODATA_TRANSFORM("scenariodata_transform");

  private String value;

  RunTemplateHandlerId(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RunTemplateHandlerId fromValue(String value) {
    for (RunTemplateHandlerId b : RunTemplateHandlerId.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<RunTemplateHandlerId> {
    @Override
    public void write(final JsonWriter jsonWriter, final RunTemplateHandlerId enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RunTemplateHandlerId read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RunTemplateHandlerId.fromValue(value);
    }
  }
}

