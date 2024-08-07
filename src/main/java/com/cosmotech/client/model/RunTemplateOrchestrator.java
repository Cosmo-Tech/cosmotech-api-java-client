/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 4.0.3-SNAPSHOT
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
 * the Orchestrator to use for the Run Template
 */
@JsonAdapter(RunTemplateOrchestrator.Adapter.class)
public enum RunTemplateOrchestrator {
  
  ARGOWORKFLOW("argoWorkflow"),
  
  CSMORC("csmOrc");

  private String value;

  RunTemplateOrchestrator(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RunTemplateOrchestrator fromValue(String value) {
    for (RunTemplateOrchestrator b : RunTemplateOrchestrator.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<RunTemplateOrchestrator> {
    @Override
    public void write(final JsonWriter jsonWriter, final RunTemplateOrchestrator enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RunTemplateOrchestrator read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RunTemplateOrchestrator.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    RunTemplateOrchestrator.fromValue(value);
  }
}

