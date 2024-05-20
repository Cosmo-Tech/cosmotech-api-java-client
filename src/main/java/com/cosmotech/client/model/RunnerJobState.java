/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.2.1-SNAPSHOT
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * the Runner job state
 */
@JsonAdapter(RunnerJobState.Adapter.class)
public enum RunnerJobState {
  
  CREATED("Created"),
  
  RUNNING("Running"),
  
  SUCCESSFUL("Successful"),
  
  FAILED("Failed"),
  
  UNKNOWN("Unknown"),
  
  DATAINGESTIONINPROGRESS("DataIngestionInProgress");

  private String value;

  RunnerJobState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RunnerJobState fromValue(String value) {
    for (RunnerJobState b : RunnerJobState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<RunnerJobState> {
    @Override
    public void write(final JsonWriter jsonWriter, final RunnerJobState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RunnerJobState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RunnerJobState.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    RunnerJobState.fromValue(value);
  }
}

