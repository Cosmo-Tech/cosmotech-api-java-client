/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.2.2
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
 * the state to search
 */
@JsonAdapter(ScenarioRunSearchState.Adapter.class)
public enum ScenarioRunSearchState {
  
  FETCHINGDATASETS("FetchingDatasets"),
  
  FETCHINGSCENARIOPARAMETERS("FetchingScenarioParameters"),
  
  APPLYINGSCENARIOPARAMETERS("ApplyingScenarioParameters"),
  
  VALIDATINGSCENARIODATA("ValidatingScenarioData"),
  
  SENDINGSCENARIODATATODATAWAREHOUSE("SendingScenarioDataToDataWarehouse"),
  
  PRERUN("PreRun"),
  
  RUNNING("Running"),
  
  POSTRUN("PostRun"),
  
  SUCCESS("Success"),
  
  FAILED("Failed");

  private String value;

  ScenarioRunSearchState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ScenarioRunSearchState fromValue(String value) {
    for (ScenarioRunSearchState b : ScenarioRunSearchState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ScenarioRunSearchState> {
    @Override
    public void write(final JsonWriter jsonWriter, final ScenarioRunSearchState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ScenarioRunSearchState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ScenarioRunSearchState.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    ScenarioRunSearchState.fromValue(value);
  }
}

