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
 * the search options
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-09T14:57:25.758214413Z[Etc/UTC]")
public class DatasetSearch {
  public static final String SERIALIZED_NAME_DATASET_TAGS = "datasetTags";
  @SerializedName(SERIALIZED_NAME_DATASET_TAGS)
  private List<String> datasetTags = new ArrayList<>();

  public DatasetSearch() {
  }

  public DatasetSearch datasetTags(List<String> datasetTags) {
    this.datasetTags = datasetTags;
    return this;
  }

  public DatasetSearch addDatasetTagsItem(String datasetTagsItem) {
    if (this.datasetTags == null) {
      this.datasetTags = new ArrayList<>();
    }
    this.datasetTags.add(datasetTagsItem);
    return this;
  }

   /**
   * the dataset tag list to search
   * @return datasetTags
  **/
  @javax.annotation.Nonnull
  public List<String> getDatasetTags() {
    return datasetTags;
  }

  public void setDatasetTags(List<String> datasetTags) {
    this.datasetTags = datasetTags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetSearch datasetSearch = (DatasetSearch) o;
    return Objects.equals(this.datasetTags, datasetSearch.datasetTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasetTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetSearch {\n");
    sb.append("    datasetTags: ").append(toIndentedString(datasetTags)).append("\n");
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
    openapiFields.add("datasetTags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("datasetTags");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DatasetSearch
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DatasetSearch.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatasetSearch is not found in the empty JSON string", DatasetSearch.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DatasetSearch.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DatasetSearch` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DatasetSearch.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("datasetTags") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("datasetTags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `datasetTags` to be an array in the JSON string but got `%s`", jsonObj.get("datasetTags").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatasetSearch.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatasetSearch' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatasetSearch> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatasetSearch.class));

       return (TypeAdapter<T>) new TypeAdapter<DatasetSearch>() {
           @Override
           public void write(JsonWriter out, DatasetSearch value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DatasetSearch read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DatasetSearch given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DatasetSearch
  * @throws IOException if the JSON string is invalid with respect to DatasetSearch
  */
  public static DatasetSearch fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatasetSearch.class);
  }

 /**
  * Convert an instance of DatasetSearch to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

