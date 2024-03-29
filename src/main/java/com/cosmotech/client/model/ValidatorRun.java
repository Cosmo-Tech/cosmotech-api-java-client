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
 * a Validator Run
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-26T10:15:21.172923481Z[Etc/UTC]")
public class ValidatorRun {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_VALIDATOR_ID = "validatorId";
  @SerializedName(SERIALIZED_NAME_VALIDATOR_ID)
  private String validatorId;

  public static final String SERIALIZED_NAME_VALIDATOR_NAME = "validatorName";
  @SerializedName(SERIALIZED_NAME_VALIDATOR_NAME)
  private String validatorName;

  public static final String SERIALIZED_NAME_DATASET_ID = "datasetId";
  @SerializedName(SERIALIZED_NAME_DATASET_ID)
  private String datasetId;

  public static final String SERIALIZED_NAME_DATASET_NAME = "datasetName";
  @SerializedName(SERIALIZED_NAME_DATASET_NAME)
  private String datasetName;

  /**
   * the Validator Run state
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    RUNNING("Running"),
    
    FINISHED("Finished"),
    
    ONERROR("OnError");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StateEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public static final String SERIALIZED_NAME_CONTAINER_ID = "containerId";
  @SerializedName(SERIALIZED_NAME_CONTAINER_ID)
  private String containerId;

  public static final String SERIALIZED_NAME_LOGS = "logs";
  @SerializedName(SERIALIZED_NAME_LOGS)
  private String logs;

  public ValidatorRun() {
  }

  public ValidatorRun(
     String id, 
     String validatorId, 
     String validatorName, 
     String datasetName, 
     StateEnum state, 
     String containerId, 
     String logs
  ) {
    this();
    this.id = id;
    this.validatorId = validatorId;
    this.validatorName = validatorName;
    this.datasetName = datasetName;
    this.state = state;
    this.containerId = containerId;
    this.logs = logs;
  }

   /**
   * the Validator Run id
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }



   /**
   * the Validator id
   * @return validatorId
  **/
  @javax.annotation.Nullable
  public String getValidatorId() {
    return validatorId;
  }



   /**
   * the validator name
   * @return validatorName
  **/
  @javax.annotation.Nullable
  public String getValidatorName() {
    return validatorName;
  }



  public ValidatorRun datasetId(String datasetId) {
    this.datasetId = datasetId;
    return this;
  }

   /**
   * the Dataset id to run the validator on
   * @return datasetId
  **/
  @javax.annotation.Nonnull
  public String getDatasetId() {
    return datasetId;
  }

  public void setDatasetId(String datasetId) {
    this.datasetId = datasetId;
  }


   /**
   * the Dataset name
   * @return datasetName
  **/
  @javax.annotation.Nullable
  public String getDatasetName() {
    return datasetName;
  }



   /**
   * the Validator Run state
   * @return state
  **/
  @javax.annotation.Nullable
  public StateEnum getState() {
    return state;
  }



   /**
   * the Validator Run container id
   * @return containerId
  **/
  @javax.annotation.Nullable
  public String getContainerId() {
    return containerId;
  }



   /**
   * the Validator Run logs
   * @return logs
  **/
  @javax.annotation.Nullable
  public String getLogs() {
    return logs;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidatorRun validatorRun = (ValidatorRun) o;
    return Objects.equals(this.id, validatorRun.id) &&
        Objects.equals(this.validatorId, validatorRun.validatorId) &&
        Objects.equals(this.validatorName, validatorRun.validatorName) &&
        Objects.equals(this.datasetId, validatorRun.datasetId) &&
        Objects.equals(this.datasetName, validatorRun.datasetName) &&
        Objects.equals(this.state, validatorRun.state) &&
        Objects.equals(this.containerId, validatorRun.containerId) &&
        Objects.equals(this.logs, validatorRun.logs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, validatorId, validatorName, datasetId, datasetName, state, containerId, logs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidatorRun {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    validatorId: ").append(toIndentedString(validatorId)).append("\n");
    sb.append("    validatorName: ").append(toIndentedString(validatorName)).append("\n");
    sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
    sb.append("    datasetName: ").append(toIndentedString(datasetName)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("validatorId");
    openapiFields.add("validatorName");
    openapiFields.add("datasetId");
    openapiFields.add("datasetName");
    openapiFields.add("state");
    openapiFields.add("containerId");
    openapiFields.add("logs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("datasetId");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ValidatorRun
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ValidatorRun.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ValidatorRun is not found in the empty JSON string", ValidatorRun.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ValidatorRun.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ValidatorRun` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ValidatorRun.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("validatorId") != null && !jsonObj.get("validatorId").isJsonNull()) && !jsonObj.get("validatorId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validatorId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validatorId").toString()));
      }
      if ((jsonObj.get("validatorName") != null && !jsonObj.get("validatorName").isJsonNull()) && !jsonObj.get("validatorName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validatorName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validatorName").toString()));
      }
      if (!jsonObj.get("datasetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datasetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datasetId").toString()));
      }
      if ((jsonObj.get("datasetName") != null && !jsonObj.get("datasetName").isJsonNull()) && !jsonObj.get("datasetName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datasetName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datasetName").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      // validate the optional field `state`
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) {
        StateEnum.validateJsonElement(jsonObj.get("state"));
      }
      if ((jsonObj.get("containerId") != null && !jsonObj.get("containerId").isJsonNull()) && !jsonObj.get("containerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `containerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("containerId").toString()));
      }
      if ((jsonObj.get("logs") != null && !jsonObj.get("logs").isJsonNull()) && !jsonObj.get("logs").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logs` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logs").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ValidatorRun.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ValidatorRun' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ValidatorRun> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ValidatorRun.class));

       return (TypeAdapter<T>) new TypeAdapter<ValidatorRun>() {
           @Override
           public void write(JsonWriter out, ValidatorRun value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ValidatorRun read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ValidatorRun given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ValidatorRun
  * @throws IOException if the JSON string is invalid with respect to ValidatorRun
  */
  public static ValidatorRun fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ValidatorRun.class);
  }

 /**
  * Convert an instance of ValidatorRun to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

