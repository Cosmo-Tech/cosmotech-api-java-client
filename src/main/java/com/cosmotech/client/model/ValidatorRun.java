/*
 * Cosmo Tech Plaform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 0.0.11-SNAPSHOT
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * a Validator Run
 */
@ApiModel(description = "a Validator Run")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-28T13:54:43.444271469Z[Etc/UTC]")
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
  @ApiModelProperty(value = "the Validator Run id")

  public String getId() {
    return id;
  }




   /**
   * the Validator id
   * @return validatorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Validator id")

  public String getValidatorId() {
    return validatorId;
  }




   /**
   * the validator name
   * @return validatorName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the validator name")

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
  @ApiModelProperty(required = true, value = "the Dataset id to run the validator on")

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
  @ApiModelProperty(value = "the Dataset name")

  public String getDatasetName() {
    return datasetName;
  }




   /**
   * the Validator Run state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Validator Run state")

  public StateEnum getState() {
    return state;
  }




   /**
   * the Validator Run container id
   * @return containerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Validator Run container id")

  public String getContainerId() {
    return containerId;
  }




   /**
   * the Validator Run logs
   * @return logs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Validator Run logs")

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

}

