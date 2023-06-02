/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 2.4.3-preview
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
 * the Scenario job state
 */
@JsonAdapter(ScenarioJobState.Adapter.class)
public enum ScenarioJobState {
  
  CREATED("Created"),
  
  RUNNING("Running"),
  
  SUCCESSFUL("Successful"),
  
  FAILED("Failed"),
  
  UNKNOWN("Unknown"),
  
  DATAINGESTIONINPROGRESS("DataIngestionInProgress");

  private String value;

  ScenarioJobState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ScenarioJobState fromValue(String value) {
    for (ScenarioJobState b : ScenarioJobState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ScenarioJobState> {
    @Override
    public void write(final JsonWriter jsonWriter, final ScenarioJobState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ScenarioJobState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ScenarioJobState.fromValue(value);
    }
  }
}

