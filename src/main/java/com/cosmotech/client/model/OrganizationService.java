/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.2.4
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
 * a cloud service resource
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-31T14:25:13.832483486Z[Etc/UTC]")
public class OrganizationService {
  public static final String SERIALIZED_NAME_CLOUD_SERVICE = "cloudService";
  @SerializedName(SERIALIZED_NAME_CLOUD_SERVICE)
  private String cloudService;

  public static final String SERIALIZED_NAME_BASE_URI = "baseUri";
  @SerializedName(SERIALIZED_NAME_BASE_URI)
  private String baseUri;

  public static final String SERIALIZED_NAME_PLATFORM_SERVICE = "platformService";
  @SerializedName(SERIALIZED_NAME_PLATFORM_SERVICE)
  private String platformService;

  public static final String SERIALIZED_NAME_RESOURCE_URI = "resourceUri";
  @SerializedName(SERIALIZED_NAME_RESOURCE_URI)
  private String resourceUri;

  public static final String SERIALIZED_NAME_CREDENTIALS = "credentials";
  @SerializedName(SERIALIZED_NAME_CREDENTIALS)
  private Map<String, Object> credentials = new HashMap<>();

  public OrganizationService() {
  }

  public OrganizationService cloudService(String cloudService) {
    this.cloudService = cloudService;
    return this;
  }

   /**
   * the cloud service name
   * @return cloudService
  **/
  @javax.annotation.Nullable
  public String getCloudService() {
    return cloudService;
  }

  public void setCloudService(String cloudService) {
    this.cloudService = cloudService;
  }


  public OrganizationService baseUri(String baseUri) {
    this.baseUri = baseUri;
    return this;
  }

   /**
   * the platform base uri for this service
   * @return baseUri
  **/
  @javax.annotation.Nullable
  public String getBaseUri() {
    return baseUri;
  }

  public void setBaseUri(String baseUri) {
    this.baseUri = baseUri;
  }


  public OrganizationService platformService(String platformService) {
    this.platformService = platformService;
    return this;
  }

   /**
   * the Platform service associated to the resource
   * @return platformService
  **/
  @javax.annotation.Nullable
  public String getPlatformService() {
    return platformService;
  }

  public void setPlatformService(String platformService) {
    this.platformService = platformService;
  }


  public OrganizationService resourceUri(String resourceUri) {
    this.resourceUri = resourceUri;
    return this;
  }

   /**
   * the Organization specific uri for this service resource
   * @return resourceUri
  **/
  @javax.annotation.Nullable
  public String getResourceUri() {
    return resourceUri;
  }

  public void setResourceUri(String resourceUri) {
    this.resourceUri = resourceUri;
  }


  public OrganizationService credentials(Map<String, Object> credentials) {
    this.credentials = credentials;
    return this;
  }

  public OrganizationService putCredentialsItem(String key, Object credentialsItem) {
    if (this.credentials == null) {
      this.credentials = new HashMap<>();
    }
    this.credentials.put(key, credentialsItem);
    return this;
  }

   /**
   * a freeform credentials object. Structure depends on service
   * @return credentials
  **/
  @javax.annotation.Nullable
  public Map<String, Object> getCredentials() {
    return credentials;
  }

  public void setCredentials(Map<String, Object> credentials) {
    this.credentials = credentials;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationService organizationService = (OrganizationService) o;
    return Objects.equals(this.cloudService, organizationService.cloudService) &&
        Objects.equals(this.baseUri, organizationService.baseUri) &&
        Objects.equals(this.platformService, organizationService.platformService) &&
        Objects.equals(this.resourceUri, organizationService.resourceUri) &&
        Objects.equals(this.credentials, organizationService.credentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudService, baseUri, platformService, resourceUri, credentials);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationService {\n");
    sb.append("    cloudService: ").append(toIndentedString(cloudService)).append("\n");
    sb.append("    baseUri: ").append(toIndentedString(baseUri)).append("\n");
    sb.append("    platformService: ").append(toIndentedString(platformService)).append("\n");
    sb.append("    resourceUri: ").append(toIndentedString(resourceUri)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
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
    openapiFields.add("cloudService");
    openapiFields.add("baseUri");
    openapiFields.add("platformService");
    openapiFields.add("resourceUri");
    openapiFields.add("credentials");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrganizationService
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrganizationService.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrganizationService is not found in the empty JSON string", OrganizationService.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrganizationService.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrganizationService` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cloudService") != null && !jsonObj.get("cloudService").isJsonNull()) && !jsonObj.get("cloudService").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cloudService` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cloudService").toString()));
      }
      if ((jsonObj.get("baseUri") != null && !jsonObj.get("baseUri").isJsonNull()) && !jsonObj.get("baseUri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `baseUri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("baseUri").toString()));
      }
      if ((jsonObj.get("platformService") != null && !jsonObj.get("platformService").isJsonNull()) && !jsonObj.get("platformService").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `platformService` to be a primitive type in the JSON string but got `%s`", jsonObj.get("platformService").toString()));
      }
      if ((jsonObj.get("resourceUri") != null && !jsonObj.get("resourceUri").isJsonNull()) && !jsonObj.get("resourceUri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourceUri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resourceUri").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrganizationService.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrganizationService' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrganizationService> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrganizationService.class));

       return (TypeAdapter<T>) new TypeAdapter<OrganizationService>() {
           @Override
           public void write(JsonWriter out, OrganizationService value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrganizationService read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrganizationService given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrganizationService
  * @throws IOException if the JSON string is invalid with respect to OrganizationService
  */
  public static OrganizationService fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrganizationService.class);
  }

 /**
  * Convert an instance of OrganizationService to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

