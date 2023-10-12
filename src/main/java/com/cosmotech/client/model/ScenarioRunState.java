/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.0.4-SNAPSHOT
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
 * the ScenarioRun end-to-end state
 */
@JsonAdapter(ScenarioRunState.Adapter.class)
public enum ScenarioRunState {
  
  RUNNING("Running"),
  
  SUCCESSFUL("Successful"),
  
  FAILED("Failed"),
  
  UNKNOWN("Unknown"),
  
  DATAINGESTIONINPROGRESS("DataIngestionInProgress"),
  
  DATAINGESTIONFAILURE("DataIngestionFailure");

  private String value;

  ScenarioRunState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ScenarioRunState fromValue(String value) {
    for (ScenarioRunState b : ScenarioRunState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ScenarioRunState> {
    @Override
    public void write(final JsonWriter jsonWriter, final ScenarioRunState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ScenarioRunState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ScenarioRunState.fromValue(value);
    }
  }
}

