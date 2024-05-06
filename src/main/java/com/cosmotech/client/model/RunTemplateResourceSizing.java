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
import com.cosmotech.client.model.ResourceSizeInfo;
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
 * a description object for resource requests and limits (default same configuration as basic sizing)
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-06T14:27:15.869910227Z[Etc/UTC]")
public class RunTemplateResourceSizing {
  public static final String SERIALIZED_NAME_REQUESTS = "requests";
  @SerializedName(SERIALIZED_NAME_REQUESTS)
  private ResourceSizeInfo requests;

  public static final String SERIALIZED_NAME_LIMITS = "limits";
  @SerializedName(SERIALIZED_NAME_LIMITS)
  private ResourceSizeInfo limits;

  public RunTemplateResourceSizing() {
  }

  public RunTemplateResourceSizing requests(ResourceSizeInfo requests) {
    this.requests = requests;
    return this;
  }

   /**
   * Get requests
   * @return requests
  **/
  @javax.annotation.Nonnull
  public ResourceSizeInfo getRequests() {
    return requests;
  }

  public void setRequests(ResourceSizeInfo requests) {
    this.requests = requests;
  }


  public RunTemplateResourceSizing limits(ResourceSizeInfo limits) {
    this.limits = limits;
    return this;
  }

   /**
   * Get limits
   * @return limits
  **/
  @javax.annotation.Nonnull
  public ResourceSizeInfo getLimits() {
    return limits;
  }

  public void setLimits(ResourceSizeInfo limits) {
    this.limits = limits;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunTemplateResourceSizing runTemplateResourceSizing = (RunTemplateResourceSizing) o;
    return Objects.equals(this.requests, runTemplateResourceSizing.requests) &&
        Objects.equals(this.limits, runTemplateResourceSizing.limits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requests, limits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunTemplateResourceSizing {\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
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
    openapiFields.add("requests");
    openapiFields.add("limits");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("requests");
    openapiRequiredFields.add("limits");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RunTemplateResourceSizing
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RunTemplateResourceSizing.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RunTemplateResourceSizing is not found in the empty JSON string", RunTemplateResourceSizing.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RunTemplateResourceSizing.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RunTemplateResourceSizing` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RunTemplateResourceSizing.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `requests`
      ResourceSizeInfo.validateJsonElement(jsonObj.get("requests"));
      // validate the required field `limits`
      ResourceSizeInfo.validateJsonElement(jsonObj.get("limits"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RunTemplateResourceSizing.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RunTemplateResourceSizing' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RunTemplateResourceSizing> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RunTemplateResourceSizing.class));

       return (TypeAdapter<T>) new TypeAdapter<RunTemplateResourceSizing>() {
           @Override
           public void write(JsonWriter out, RunTemplateResourceSizing value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RunTemplateResourceSizing read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RunTemplateResourceSizing given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RunTemplateResourceSizing
  * @throws IOException if the JSON string is invalid with respect to RunTemplateResourceSizing
  */
  public static RunTemplateResourceSizing fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RunTemplateResourceSizing.class);
  }

 /**
  * Convert an instance of RunTemplateResourceSizing to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

