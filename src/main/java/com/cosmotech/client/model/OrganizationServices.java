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
import com.cosmotech.client.model.OrganizationService;
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
 * the cloud service resources of the Organization
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-20T14:14:44.235527802Z[Etc/UTC]")
public class OrganizationServices {
  public static final String SERIALIZED_NAME_TENANT_CREDENTIALS = "tenantCredentials";
  @SerializedName(SERIALIZED_NAME_TENANT_CREDENTIALS)
  private Map<String, Object> tenantCredentials = new HashMap<>();

  public static final String SERIALIZED_NAME_STORAGE = "storage";
  @SerializedName(SERIALIZED_NAME_STORAGE)
  private OrganizationService storage;

  public static final String SERIALIZED_NAME_SOLUTIONS_CONTAINER_REGISTRY = "solutionsContainerRegistry";
  @SerializedName(SERIALIZED_NAME_SOLUTIONS_CONTAINER_REGISTRY)
  private OrganizationService solutionsContainerRegistry;

  public OrganizationServices() {
  }

  public OrganizationServices tenantCredentials(Map<String, Object> tenantCredentials) {
    this.tenantCredentials = tenantCredentials;
    return this;
  }

  public OrganizationServices putTenantCredentialsItem(String key, Object tenantCredentialsItem) {
    if (this.tenantCredentials == null) {
      this.tenantCredentials = new HashMap<>();
    }
    this.tenantCredentials.put(key, tenantCredentialsItem);
    return this;
  }

   /**
   * a freeform credentials object for the Organization tenant. Structure depends on cloud provider
   * @return tenantCredentials
  **/
  @javax.annotation.Nullable
  public Map<String, Object> getTenantCredentials() {
    return tenantCredentials;
  }

  public void setTenantCredentials(Map<String, Object> tenantCredentials) {
    this.tenantCredentials = tenantCredentials;
  }


  public OrganizationServices storage(OrganizationService storage) {
    this.storage = storage;
    return this;
  }

   /**
   * Get storage
   * @return storage
  **/
  @javax.annotation.Nullable
  public OrganizationService getStorage() {
    return storage;
  }

  public void setStorage(OrganizationService storage) {
    this.storage = storage;
  }


  public OrganizationServices solutionsContainerRegistry(OrganizationService solutionsContainerRegistry) {
    this.solutionsContainerRegistry = solutionsContainerRegistry;
    return this;
  }

   /**
   * Get solutionsContainerRegistry
   * @return solutionsContainerRegistry
  **/
  @javax.annotation.Nullable
  public OrganizationService getSolutionsContainerRegistry() {
    return solutionsContainerRegistry;
  }

  public void setSolutionsContainerRegistry(OrganizationService solutionsContainerRegistry) {
    this.solutionsContainerRegistry = solutionsContainerRegistry;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationServices organizationServices = (OrganizationServices) o;
    return Objects.equals(this.tenantCredentials, organizationServices.tenantCredentials) &&
        Objects.equals(this.storage, organizationServices.storage) &&
        Objects.equals(this.solutionsContainerRegistry, organizationServices.solutionsContainerRegistry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantCredentials, storage, solutionsContainerRegistry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationServices {\n");
    sb.append("    tenantCredentials: ").append(toIndentedString(tenantCredentials)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    solutionsContainerRegistry: ").append(toIndentedString(solutionsContainerRegistry)).append("\n");
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
    openapiFields.add("tenantCredentials");
    openapiFields.add("storage");
    openapiFields.add("solutionsContainerRegistry");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrganizationServices
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrganizationServices.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrganizationServices is not found in the empty JSON string", OrganizationServices.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrganizationServices.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrganizationServices` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `storage`
      if (jsonObj.get("storage") != null && !jsonObj.get("storage").isJsonNull()) {
        OrganizationService.validateJsonElement(jsonObj.get("storage"));
      }
      // validate the optional field `solutionsContainerRegistry`
      if (jsonObj.get("solutionsContainerRegistry") != null && !jsonObj.get("solutionsContainerRegistry").isJsonNull()) {
        OrganizationService.validateJsonElement(jsonObj.get("solutionsContainerRegistry"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrganizationServices.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrganizationServices' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrganizationServices> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrganizationServices.class));

       return (TypeAdapter<T>) new TypeAdapter<OrganizationServices>() {
           @Override
           public void write(JsonWriter out, OrganizationServices value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrganizationServices read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrganizationServices given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrganizationServices
  * @throws IOException if the JSON string is invalid with respect to OrganizationServices
  */
  public static OrganizationServices fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrganizationServices.class);
  }

 /**
  * Convert an instance of OrganizationServices to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

