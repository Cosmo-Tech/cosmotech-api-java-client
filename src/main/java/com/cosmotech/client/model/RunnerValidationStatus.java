/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 4.0.2-SNAPSHOT
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
 * the validation status of the runner
 */
@JsonAdapter(RunnerValidationStatus.Adapter.class)
public enum RunnerValidationStatus {
  
  DRAFT("Draft"),
  
  REJECTED("Rejected"),
  
  UNKNOWN("Unknown"),
  
  VALIDATED("Validated");

  private String value;

  RunnerValidationStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RunnerValidationStatus fromValue(String value) {
    for (RunnerValidationStatus b : RunnerValidationStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<RunnerValidationStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final RunnerValidationStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RunnerValidationStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RunnerValidationStatus.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    RunnerValidationStatus.fromValue(value);
  }
}

