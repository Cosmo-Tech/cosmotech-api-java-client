/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.1.1-SNAPSHOT
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.cosmotech.client.JSON;

/**
 * a twin graph hash
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-20T14:14:44.235527802Z[Etc/UTC]")
public class DatasetTwinGraphHash {
  public static final String SERIALIZED_NAME_HASH = "hash";
  @SerializedName(SERIALIZED_NAME_HASH)
  private String hash;

  public DatasetTwinGraphHash() {
  }

  public DatasetTwinGraphHash hash(String hash) {
    this.hash = hash;
    return this;
  }

   /**
   * the hash of the graph
   * @return hash
  **/
  @javax.annotation.Nullable
  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetTwinGraphHash datasetTwinGraphHash = (DatasetTwinGraphHash) o;
    return Objects.equals(this.hash, datasetTwinGraphHash.hash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetTwinGraphHash {\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("hash");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DatasetTwinGraphHash
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DatasetTwinGraphHash.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatasetTwinGraphHash is not found in the empty JSON string", DatasetTwinGraphHash.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DatasetTwinGraphHash.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DatasetTwinGraphHash` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("hash") != null && !jsonObj.get("hash").isJsonNull()) && !jsonObj.get("hash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hash").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatasetTwinGraphHash.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatasetTwinGraphHash' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatasetTwinGraphHash> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatasetTwinGraphHash.class));

       return (TypeAdapter<T>) new TypeAdapter<DatasetTwinGraphHash>() {
           @Override
           public void write(JsonWriter out, DatasetTwinGraphHash value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DatasetTwinGraphHash read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DatasetTwinGraphHash given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DatasetTwinGraphHash
  * @throws IOException if the JSON string is invalid with respect to DatasetTwinGraphHash
  */
  public static DatasetTwinGraphHash fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatasetTwinGraphHash.class);
  }

 /**
  * Convert an instance of DatasetTwinGraphHash to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

