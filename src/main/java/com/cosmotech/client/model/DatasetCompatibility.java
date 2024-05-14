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
 * a Dataset compatibility constraint to a Solution version open range
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-14T14:08:28.288954497Z[Etc/UTC]")
public class DatasetCompatibility {
  public static final String SERIALIZED_NAME_SOLUTION_KEY = "solutionKey";
  @SerializedName(SERIALIZED_NAME_SOLUTION_KEY)
  private String solutionKey;

  public static final String SERIALIZED_NAME_MINIMUM_VERSION = "minimumVersion";
  @SerializedName(SERIALIZED_NAME_MINIMUM_VERSION)
  private String minimumVersion;

  public static final String SERIALIZED_NAME_MAXIMUM_VERSION = "maximumVersion";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_VERSION)
  private String maximumVersion;

  public DatasetCompatibility() {
  }

  public DatasetCompatibility solutionKey(String solutionKey) {
    this.solutionKey = solutionKey;
    return this;
  }

   /**
   * the Solution key which group Solution versions
   * @return solutionKey
  **/
  @javax.annotation.Nonnull
  public String getSolutionKey() {
    return solutionKey;
  }

  public void setSolutionKey(String solutionKey) {
    this.solutionKey = solutionKey;
  }


  public DatasetCompatibility minimumVersion(String minimumVersion) {
    this.minimumVersion = minimumVersion;
    return this;
  }

   /**
   * the Solution minimum version compatibility (version included)
   * @return minimumVersion
  **/
  @javax.annotation.Nullable
  public String getMinimumVersion() {
    return minimumVersion;
  }

  public void setMinimumVersion(String minimumVersion) {
    this.minimumVersion = minimumVersion;
  }


  public DatasetCompatibility maximumVersion(String maximumVersion) {
    this.maximumVersion = maximumVersion;
    return this;
  }

   /**
   * the Solution maximum version compatibility (version included)
   * @return maximumVersion
  **/
  @javax.annotation.Nullable
  public String getMaximumVersion() {
    return maximumVersion;
  }

  public void setMaximumVersion(String maximumVersion) {
    this.maximumVersion = maximumVersion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetCompatibility datasetCompatibility = (DatasetCompatibility) o;
    return Objects.equals(this.solutionKey, datasetCompatibility.solutionKey) &&
        Objects.equals(this.minimumVersion, datasetCompatibility.minimumVersion) &&
        Objects.equals(this.maximumVersion, datasetCompatibility.maximumVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(solutionKey, minimumVersion, maximumVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetCompatibility {\n");
    sb.append("    solutionKey: ").append(toIndentedString(solutionKey)).append("\n");
    sb.append("    minimumVersion: ").append(toIndentedString(minimumVersion)).append("\n");
    sb.append("    maximumVersion: ").append(toIndentedString(maximumVersion)).append("\n");
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
    openapiFields.add("solutionKey");
    openapiFields.add("minimumVersion");
    openapiFields.add("maximumVersion");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("solutionKey");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DatasetCompatibility
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DatasetCompatibility.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatasetCompatibility is not found in the empty JSON string", DatasetCompatibility.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DatasetCompatibility.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DatasetCompatibility` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DatasetCompatibility.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("solutionKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `solutionKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("solutionKey").toString()));
      }
      if ((jsonObj.get("minimumVersion") != null && !jsonObj.get("minimumVersion").isJsonNull()) && !jsonObj.get("minimumVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `minimumVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("minimumVersion").toString()));
      }
      if ((jsonObj.get("maximumVersion") != null && !jsonObj.get("maximumVersion").isJsonNull()) && !jsonObj.get("maximumVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maximumVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maximumVersion").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatasetCompatibility.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatasetCompatibility' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatasetCompatibility> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatasetCompatibility.class));

       return (TypeAdapter<T>) new TypeAdapter<DatasetCompatibility>() {
           @Override
           public void write(JsonWriter out, DatasetCompatibility value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DatasetCompatibility read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DatasetCompatibility given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DatasetCompatibility
  * @throws IOException if the JSON string is invalid with respect to DatasetCompatibility
  */
  public static DatasetCompatibility fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatasetCompatibility.class);
  }

 /**
  * Convert an instance of DatasetCompatibility to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

