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
import com.cosmotech.client.model.OrganizationAccessControl;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * the Organization security information
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-15T10:42:41.945951570Z[Etc/UTC]")
public class OrganizationSecurity {
  public static final String SERIALIZED_NAME_DEFAULT = "default";
  @SerializedName(SERIALIZED_NAME_DEFAULT)
  @com.redis.om.spring.annotations.Indexed
  private String _default;

  public static final String SERIALIZED_NAME_ACCESS_CONTROL_LIST = "accessControlList";
  @SerializedName(SERIALIZED_NAME_ACCESS_CONTROL_LIST)
  @com.redis.om.spring.annotations.Indexed
  private List<OrganizationAccessControl> accessControlList = new ArrayList<>();

  public OrganizationSecurity() {
  }

  public OrganizationSecurity _default(String _default) {
    this._default = _default;
    return this;
  }

   /**
   * the role by default
   * @return _default
  **/
  @javax.annotation.Nonnull
  public String getDefault() {
    return _default;
  }

  public void setDefault(String _default) {
    this._default = _default;
  }


  public OrganizationSecurity accessControlList(List<OrganizationAccessControl> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public OrganizationSecurity addAccessControlListItem(OrganizationAccessControl accessControlListItem) {
    if (this.accessControlList == null) {
      this.accessControlList = new ArrayList<>();
    }
    this.accessControlList.add(accessControlListItem);
    return this;
  }

   /**
   * the list which can access this Organization with detailed access control information
   * @return accessControlList
  **/
  @javax.annotation.Nonnull
  public List<OrganizationAccessControl> getAccessControlList() {
    return accessControlList;
  }

  public void setAccessControlList(List<OrganizationAccessControl> accessControlList) {
    this.accessControlList = accessControlList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationSecurity organizationSecurity = (OrganizationSecurity) o;
    return Objects.equals(this._default, organizationSecurity._default) &&
        Objects.equals(this.accessControlList, organizationSecurity.accessControlList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_default, accessControlList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationSecurity {\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    accessControlList: ").append(toIndentedString(accessControlList)).append("\n");
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
    openapiFields.add("default");
    openapiFields.add("accessControlList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("default");
    openapiRequiredFields.add("accessControlList");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrganizationSecurity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrganizationSecurity.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrganizationSecurity is not found in the empty JSON string", OrganizationSecurity.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrganizationSecurity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrganizationSecurity` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrganizationSecurity.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("default").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `default` to be a primitive type in the JSON string but got `%s`", jsonObj.get("default").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("accessControlList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `accessControlList` to be an array in the JSON string but got `%s`", jsonObj.get("accessControlList").toString()));
      }

      JsonArray jsonArrayaccessControlList = jsonObj.getAsJsonArray("accessControlList");
      // validate the required field `accessControlList` (array)
      for (int i = 0; i < jsonArrayaccessControlList.size(); i++) {
        OrganizationAccessControl.validateJsonElement(jsonArrayaccessControlList.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrganizationSecurity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrganizationSecurity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrganizationSecurity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrganizationSecurity.class));

       return (TypeAdapter<T>) new TypeAdapter<OrganizationSecurity>() {
           @Override
           public void write(JsonWriter out, OrganizationSecurity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrganizationSecurity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrganizationSecurity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrganizationSecurity
  * @throws IOException if the JSON string is invalid with respect to OrganizationSecurity
  */
  public static OrganizationSecurity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrganizationSecurity.class);
  }

 /**
  * Convert an instance of OrganizationSecurity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

