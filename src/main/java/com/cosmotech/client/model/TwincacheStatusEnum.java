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
 * the twincache data status
 */
@JsonAdapter(TwincacheStatusEnum.Adapter.class)
public enum TwincacheStatusEnum {
  
  EMPTY("EMPTY"),
  
  FULL("FULL");

  private String value;

  TwincacheStatusEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TwincacheStatusEnum fromValue(String value) {
    for (TwincacheStatusEnum b : TwincacheStatusEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<TwincacheStatusEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final TwincacheStatusEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TwincacheStatusEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TwincacheStatusEnum.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    TwincacheStatusEnum.fromValue(value);
  }
}

