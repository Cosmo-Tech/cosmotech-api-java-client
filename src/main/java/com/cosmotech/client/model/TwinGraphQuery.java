/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.2.7
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
 * a twin graph query in cypher language
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-27T12:27:08.224198532Z[Etc/UTC]")
public class TwinGraphQuery {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private String query;

  public TwinGraphQuery() {
  }

  public TwinGraphQuery version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Twin graph version
   * @return version
  **/
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  public TwinGraphQuery query(String query) {
    this.query = query;
    return this;
  }

   /**
   * the query in cypher language
   * @return query
  **/
  @javax.annotation.Nonnull
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TwinGraphQuery twinGraphQuery = (TwinGraphQuery) o;
    return Objects.equals(this.version, twinGraphQuery.version) &&
        Objects.equals(this.query, twinGraphQuery.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TwinGraphQuery {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
    openapiFields.add("version");
    openapiFields.add("query");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("query");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TwinGraphQuery
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TwinGraphQuery.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TwinGraphQuery is not found in the empty JSON string", TwinGraphQuery.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TwinGraphQuery.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TwinGraphQuery` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TwinGraphQuery.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      if (!jsonObj.get("query").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `query` to be a primitive type in the JSON string but got `%s`", jsonObj.get("query").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TwinGraphQuery.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TwinGraphQuery' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TwinGraphQuery> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TwinGraphQuery.class));

       return (TypeAdapter<T>) new TypeAdapter<TwinGraphQuery>() {
           @Override
           public void write(JsonWriter out, TwinGraphQuery value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TwinGraphQuery read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TwinGraphQuery given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TwinGraphQuery
  * @throws IOException if the JSON string is invalid with respect to TwinGraphQuery
  */
  public static TwinGraphQuery fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TwinGraphQuery.class);
  }

 /**
  * Convert an instance of TwinGraphQuery to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

