/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.0.11-SNAPSHOT
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.cosmotech.client.model.DatasetCompatibility;
import com.cosmotech.client.model.DatasetConnector;
import com.cosmotech.client.model.DatasetSecurity;
import com.cosmotech.client.model.DatasetSourceType;
import com.cosmotech.client.model.SourceInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * a Dataset
 */
@ApiModel(description = "a Dataset")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-09T08:59:59.662744011Z[Etc/UTC]")
public class Dataset {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_OWNER_ID = "ownerId";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  public static final String SERIALIZED_NAME_ORGANIZATION_ID = "organizationId";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_ID)
  private String organizationId;

  public static final String SERIALIZED_NAME_PARENT_ID = "parentId";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private String parentId;

  public static final String SERIALIZED_NAME_TWINGRAPH_ID = "twingraphId";
  @SerializedName(SERIALIZED_NAME_TWINGRAPH_ID)
  private String twingraphId;

  public static final String SERIALIZED_NAME_MAIN = "main";
  @SerializedName(SERIALIZED_NAME_MAIN)
  private Boolean main;

  public static final String SERIALIZED_NAME_CREATION_DATE = "creationDate";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private Long creationDate;

  public static final String SERIALIZED_NAME_REFRESH_DATE = "refreshDate";
  @SerializedName(SERIALIZED_NAME_REFRESH_DATE)
  private Long refreshDate;

  public static final String SERIALIZED_NAME_SOURCE_TYPE = "sourceType";
  @SerializedName(SERIALIZED_NAME_SOURCE_TYPE)
  private DatasetSourceType sourceType;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private SourceInfo source;

  /**
   * the Dataset status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    DRAFT("DRAFT"),
    
    PENDING("PENDING"),
    
    ERROR("ERROR"),
    
    READY("READY");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_QUERIES = "queries";
  @SerializedName(SERIALIZED_NAME_QUERIES)
  private List<String> queries = null;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_CONNECTOR = "connector";
  @SerializedName(SERIALIZED_NAME_CONNECTOR)
  private DatasetConnector connector;

  public static final String SERIALIZED_NAME_FRAGMENTS_IDS = "fragmentsIds";
  @SerializedName(SERIALIZED_NAME_FRAGMENTS_IDS)
  private List<String> fragmentsIds = null;

  public static final String SERIALIZED_NAME_VALIDATOR_ID = "validatorId";
  @SerializedName(SERIALIZED_NAME_VALIDATOR_ID)
  private String validatorId;

  public static final String SERIALIZED_NAME_COMPATIBILITY = "compatibility";
  @SerializedName(SERIALIZED_NAME_COMPATIBILITY)
  private List<DatasetCompatibility> compatibility = null;

  public static final String SERIALIZED_NAME_SECURITY = "security";
  @SerializedName(SERIALIZED_NAME_SECURITY)
  private DatasetSecurity security;

  public Dataset() { 
  }

  
  public Dataset(
     String id, 
     String ownerId, 
     String organizationId, 
     Long creationDate, 
     Long refreshDate
  ) {
    this();
    this.id = id;
    this.ownerId = ownerId;
    this.organizationId = organizationId;
    this.creationDate = creationDate;
    this.refreshDate = refreshDate;
  }

   /**
   * the Dataset unique identifier
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Dataset unique identifier")

  public String getId() {
    return id;
  }




  public Dataset name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * the Dataset name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Dataset name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Dataset description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * the Dataset description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Dataset description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


   /**
   * the User id which own this Dataset
   * @return ownerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the User id which own this Dataset")

  public String getOwnerId() {
    return ownerId;
  }




   /**
   * the Organization Id related to this Dataset
   * @return organizationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Organization Id related to this Dataset")

  public String getOrganizationId() {
    return organizationId;
  }




  public Dataset parentId(String parentId) {
    
    this.parentId = parentId;
    return this;
  }

   /**
   * the Dataset id which is the parent of this Dataset
   * @return parentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Dataset id which is the parent of this Dataset")

  public String getParentId() {
    return parentId;
  }


  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  public Dataset twingraphId(String twingraphId) {
    
    this.twingraphId = twingraphId;
    return this;
  }

   /**
   * the twin graph id
   * @return twingraphId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the twin graph id")

  public String getTwingraphId() {
    return twingraphId;
  }


  public void setTwingraphId(String twingraphId) {
    this.twingraphId = twingraphId;
  }


  public Dataset main(Boolean main) {
    
    this.main = main;
    return this;
  }

   /**
   * is this the main dataset
   * @return main
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "is this the main dataset")

  public Boolean getMain() {
    return main;
  }


  public void setMain(Boolean main) {
    this.main = main;
  }


   /**
   * the Dataset creation date
   * @return creationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Dataset creation date")

  public Long getCreationDate() {
    return creationDate;
  }




   /**
   * the last time a refresh was done
   * @return refreshDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the last time a refresh was done")

  public Long getRefreshDate() {
    return refreshDate;
  }




  public Dataset sourceType(DatasetSourceType sourceType) {
    
    this.sourceType = sourceType;
    return this;
  }

   /**
   * Get sourceType
   * @return sourceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DatasetSourceType getSourceType() {
    return sourceType;
  }


  public void setSourceType(DatasetSourceType sourceType) {
    this.sourceType = sourceType;
  }


  public Dataset source(SourceInfo source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SourceInfo getSource() {
    return source;
  }


  public void setSource(SourceInfo source) {
    this.source = source;
  }


  public Dataset status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * the Dataset status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the Dataset status")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public Dataset queries(List<String> queries) {
    
    this.queries = queries;
    return this;
  }

  public Dataset addQueriesItem(String queriesItem) {
    if (this.queries == null) {
      this.queries = new ArrayList<String>();
    }
    this.queries.add(queriesItem);
    return this;
  }

   /**
   * the list of queries
   * @return queries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the list of queries")

  public List<String> getQueries() {
    return queries;
  }


  public void setQueries(List<String> queries) {
    this.queries = queries;
  }


  public Dataset tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public Dataset addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * the list of tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the list of tags")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public Dataset connector(DatasetConnector connector) {
    
    this.connector = connector;
    return this;
  }

   /**
   * Get connector
   * @return connector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DatasetConnector getConnector() {
    return connector;
  }


  public void setConnector(DatasetConnector connector) {
    this.connector = connector;
  }


  public Dataset fragmentsIds(List<String> fragmentsIds) {
    
    this.fragmentsIds = fragmentsIds;
    return this;
  }

  public Dataset addFragmentsIdsItem(String fragmentsIdsItem) {
    if (this.fragmentsIds == null) {
      this.fragmentsIds = new ArrayList<String>();
    }
    this.fragmentsIds.add(fragmentsIdsItem);
    return this;
  }

   /**
   * the list of other Datasets ids to compose as fragments
   * @return fragmentsIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the list of other Datasets ids to compose as fragments")

  public List<String> getFragmentsIds() {
    return fragmentsIds;
  }


  public void setFragmentsIds(List<String> fragmentsIds) {
    this.fragmentsIds = fragmentsIds;
  }


  public Dataset validatorId(String validatorId) {
    
    this.validatorId = validatorId;
    return this;
  }

   /**
   * the validator id
   * @return validatorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the validator id")

  public String getValidatorId() {
    return validatorId;
  }


  public void setValidatorId(String validatorId) {
    this.validatorId = validatorId;
  }


  public Dataset compatibility(List<DatasetCompatibility> compatibility) {
    
    this.compatibility = compatibility;
    return this;
  }

  public Dataset addCompatibilityItem(DatasetCompatibility compatibilityItem) {
    if (this.compatibility == null) {
      this.compatibility = new ArrayList<DatasetCompatibility>();
    }
    this.compatibility.add(compatibilityItem);
    return this;
  }

   /**
   * the list of compatible Solutions versions
   * @return compatibility
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the list of compatible Solutions versions")

  public List<DatasetCompatibility> getCompatibility() {
    return compatibility;
  }


  public void setCompatibility(List<DatasetCompatibility> compatibility) {
    this.compatibility = compatibility;
  }


  public Dataset security(DatasetSecurity security) {
    
    this.security = security;
    return this;
  }

   /**
   * Get security
   * @return security
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DatasetSecurity getSecurity() {
    return security;
  }


  public void setSecurity(DatasetSecurity security) {
    this.security = security;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dataset dataset = (Dataset) o;
    return Objects.equals(this.id, dataset.id) &&
        Objects.equals(this.name, dataset.name) &&
        Objects.equals(this.description, dataset.description) &&
        Objects.equals(this.ownerId, dataset.ownerId) &&
        Objects.equals(this.organizationId, dataset.organizationId) &&
        Objects.equals(this.parentId, dataset.parentId) &&
        Objects.equals(this.twingraphId, dataset.twingraphId) &&
        Objects.equals(this.main, dataset.main) &&
        Objects.equals(this.creationDate, dataset.creationDate) &&
        Objects.equals(this.refreshDate, dataset.refreshDate) &&
        Objects.equals(this.sourceType, dataset.sourceType) &&
        Objects.equals(this.source, dataset.source) &&
        Objects.equals(this.status, dataset.status) &&
        Objects.equals(this.queries, dataset.queries) &&
        Objects.equals(this.tags, dataset.tags) &&
        Objects.equals(this.connector, dataset.connector) &&
        Objects.equals(this.fragmentsIds, dataset.fragmentsIds) &&
        Objects.equals(this.validatorId, dataset.validatorId) &&
        Objects.equals(this.compatibility, dataset.compatibility) &&
        Objects.equals(this.security, dataset.security);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, ownerId, organizationId, parentId, twingraphId, main, creationDate, refreshDate, sourceType, source, status, queries, tags, connector, fragmentsIds, validatorId, compatibility, security);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dataset {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    twingraphId: ").append(toIndentedString(twingraphId)).append("\n");
    sb.append("    main: ").append(toIndentedString(main)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    refreshDate: ").append(toIndentedString(refreshDate)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    connector: ").append(toIndentedString(connector)).append("\n");
    sb.append("    fragmentsIds: ").append(toIndentedString(fragmentsIds)).append("\n");
    sb.append("    validatorId: ").append(toIndentedString(validatorId)).append("\n");
    sb.append("    compatibility: ").append(toIndentedString(compatibility)).append("\n");
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
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

