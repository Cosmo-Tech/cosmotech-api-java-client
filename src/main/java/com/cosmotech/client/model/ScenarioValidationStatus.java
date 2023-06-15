/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 2.4.4-dev
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
 * the validation status of the scenario
 */
@JsonAdapter(ScenarioValidationStatus.Adapter.class)
public enum ScenarioValidationStatus {
  
  DRAFT("Draft"),
  
  REJECTED("Rejected"),
  
  UNKNOWN("Unknown"),
  
  VALIDATED("Validated");

  private String value;

  ScenarioValidationStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ScenarioValidationStatus fromValue(String value) {
    for (ScenarioValidationStatus b : ScenarioValidationStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ScenarioValidationStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ScenarioValidationStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ScenarioValidationStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ScenarioValidationStatus.fromValue(value);
    }
  }
}

