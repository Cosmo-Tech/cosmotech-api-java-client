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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
 * a Workspace Web Application
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-15T14:27:29.263795843Z[Etc/UTC]")
public class WorkspaceWebApp {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_IFRAMES = "iframes";
  @SerializedName(SERIALIZED_NAME_IFRAMES)
  private Map<String, Object> iframes = new HashMap<>();

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private Map<String, Object> options = new HashMap<>();

  public WorkspaceWebApp() {
  }

  public WorkspaceWebApp url(String url) {
    this.url = url;
    return this;
  }

   /**
   * the Workspace Web Application URL
   * @return url
  **/
  @javax.annotation.Nonnull
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public WorkspaceWebApp iframes(Map<String, Object> iframes) {
    this.iframes = iframes;
    return this;
  }

  public WorkspaceWebApp putIframesItem(String key, Object iframesItem) {
    if (this.iframes == null) {
      this.iframes = new HashMap<>();
    }
    this.iframes.put(key, iframesItem);
    return this;
  }

   /**
   * a map of iframeKey/iframeURL
   * @return iframes
  **/
  @javax.annotation.Nullable
  public Map<String, Object> getIframes() {
    return iframes;
  }

  public void setIframes(Map<String, Object> iframes) {
    this.iframes = iframes;
  }


  public WorkspaceWebApp options(Map<String, Object> options) {
    this.options = options;
    return this;
  }

  public WorkspaceWebApp putOptionsItem(String key, Object optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

   /**
   * free form options for Web Application
   * @return options
  **/
  @javax.annotation.Nullable
  public Map<String, Object> getOptions() {
    return options;
  }

  public void setOptions(Map<String, Object> options) {
    this.options = options;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkspaceWebApp workspaceWebApp = (WorkspaceWebApp) o;
    return Objects.equals(this.url, workspaceWebApp.url) &&
        Objects.equals(this.iframes, workspaceWebApp.iframes) &&
        Objects.equals(this.options, workspaceWebApp.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, iframes, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceWebApp {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    iframes: ").append(toIndentedString(iframes)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
    openapiFields.add("url");
    openapiFields.add("iframes");
    openapiFields.add("options");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("url");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WorkspaceWebApp
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WorkspaceWebApp.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkspaceWebApp is not found in the empty JSON string", WorkspaceWebApp.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WorkspaceWebApp.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkspaceWebApp` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WorkspaceWebApp.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkspaceWebApp.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkspaceWebApp' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkspaceWebApp> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkspaceWebApp.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkspaceWebApp>() {
           @Override
           public void write(JsonWriter out, WorkspaceWebApp value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkspaceWebApp read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WorkspaceWebApp given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkspaceWebApp
  * @throws IOException if the JSON string is invalid with respect to WorkspaceWebApp
  */
  public static WorkspaceWebApp fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkspaceWebApp.class);
  }

 /**
  * Convert an instance of WorkspaceWebApp to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

