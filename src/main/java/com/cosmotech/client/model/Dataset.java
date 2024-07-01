/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.2.2-SNAPSHOT
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.model;

import java.util.Objects;
import com.cosmotech.client.model.DatasetCompatibility;
import com.cosmotech.client.model.DatasetConnector;
import com.cosmotech.client.model.DatasetSecurity;
import com.cosmotech.client.model.DatasetSourceType;
import com.cosmotech.client.model.IngestionStatusEnum;
import com.cosmotech.client.model.SourceInfo;
import com.cosmotech.client.model.TwincacheStatusEnum;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * a Dataset
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-01T14:52:43.277140163Z[Etc/UTC]")
@com.redis.om.spring.annotations.Document
public class Dataset {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @org.springframework.data.annotation.Id
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @com.redis.om.spring.annotations.Searchable
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_OWNER_ID = "ownerId";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  public static final String SERIALIZED_NAME_OWNER_NAME = "ownerName";
  @SerializedName(SERIALIZED_NAME_OWNER_NAME)
  private String ownerName;

  public static final String SERIALIZED_NAME_ORGANIZATION_ID = "organizationId";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_ID)
  @com.redis.om.spring.annotations.Indexed
  private String organizationId;

  public static final String SERIALIZED_NAME_PARENT_ID = "parentId";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private String parentId;

  public static final String SERIALIZED_NAME_LINKED_WORKSPACE_ID_LIST = "linkedWorkspaceIdList";
  @SerializedName(SERIALIZED_NAME_LINKED_WORKSPACE_ID_LIST)
  private List<String> linkedWorkspaceIdList;

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

  public static final String SERIALIZED_NAME_INGESTION_STATUS = "ingestionStatus";
  @SerializedName(SERIALIZED_NAME_INGESTION_STATUS)
  private IngestionStatusEnum ingestionStatus;

  public static final String SERIALIZED_NAME_TWINCACHE_STATUS = "twincacheStatus";
  @SerializedName(SERIALIZED_NAME_TWINCACHE_STATUS)
  private TwincacheStatusEnum twincacheStatus;

  public static final String SERIALIZED_NAME_QUERIES = "queries";
  @SerializedName(SERIALIZED_NAME_QUERIES)
  private List<String> queries;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  @com.redis.om.spring.annotations.Indexed
  private List<String> tags;

  public static final String SERIALIZED_NAME_CONNECTOR = "connector";
  @SerializedName(SERIALIZED_NAME_CONNECTOR)
  @com.redis.om.spring.annotations.Indexed
  private DatasetConnector connector;

  public static final String SERIALIZED_NAME_FRAGMENTS_IDS = "fragmentsIds";
  @SerializedName(SERIALIZED_NAME_FRAGMENTS_IDS)
  private List<String> fragmentsIds;

  public static final String SERIALIZED_NAME_VALIDATOR_ID = "validatorId";
  @SerializedName(SERIALIZED_NAME_VALIDATOR_ID)
  private String validatorId;

  public static final String SERIALIZED_NAME_COMPATIBILITY = "compatibility";
  @SerializedName(SERIALIZED_NAME_COMPATIBILITY)
  private List<DatasetCompatibility> compatibility;

  public static final String SERIALIZED_NAME_SECURITY = "security";
  @SerializedName(SERIALIZED_NAME_SECURITY)
  @com.redis.om.spring.annotations.Indexed
  private DatasetSecurity security;

  public Dataset() {
  }

  public Dataset(
     String id, 
     String ownerId, 
     String ownerName, 
     String organizationId, 
     Long creationDate, 
     Long refreshDate
  ) {
    this();
    this.id = id;
    this.ownerId = ownerId;
    this.ownerName = ownerName;
    this.organizationId = organizationId;
    this.creationDate = creationDate;
    this.refreshDate = refreshDate;
  }

   /**
   * the Dataset unique identifier
   * @return id
  **/
  @javax.annotation.Nullable
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
  public String getOwnerId() {
    return ownerId;
  }



   /**
   * the name of the owner
   * @return ownerName
  **/
  @javax.annotation.Nullable
  public String getOwnerName() {
    return ownerName;
  }



   /**
   * the Organization Id related to this Dataset
   * @return organizationId
  **/
  @javax.annotation.Nullable
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
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  public Dataset linkedWorkspaceIdList(List<String> linkedWorkspaceIdList) {
    this.linkedWorkspaceIdList = linkedWorkspaceIdList;
    return this;
  }

  public Dataset addLinkedWorkspaceIdListItem(String linkedWorkspaceIdListItem) {
    if (this.linkedWorkspaceIdList == null) {
      this.linkedWorkspaceIdList = new ArrayList<>();
    }
    this.linkedWorkspaceIdList.add(linkedWorkspaceIdListItem);
    return this;
  }

   /**
   * list of workspace linked to this dataset
   * @return linkedWorkspaceIdList
  **/
  @javax.annotation.Nullable
  public List<String> getLinkedWorkspaceIdList() {
    return linkedWorkspaceIdList;
  }

  public void setLinkedWorkspaceIdList(List<String> linkedWorkspaceIdList) {
    this.linkedWorkspaceIdList = linkedWorkspaceIdList;
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
  public Long getCreationDate() {
    return creationDate;
  }



   /**
   * the last time a refresh was done
   * @return refreshDate
  **/
  @javax.annotation.Nullable
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
  public SourceInfo getSource() {
    return source;
  }

  public void setSource(SourceInfo source) {
    this.source = source;
  }


  public Dataset ingestionStatus(IngestionStatusEnum ingestionStatus) {
    this.ingestionStatus = ingestionStatus;
    return this;
  }

   /**
   * Get ingestionStatus
   * @return ingestionStatus
  **/
  @javax.annotation.Nullable
  public IngestionStatusEnum getIngestionStatus() {
    return ingestionStatus;
  }

  public void setIngestionStatus(IngestionStatusEnum ingestionStatus) {
    this.ingestionStatus = ingestionStatus;
  }


  public Dataset twincacheStatus(TwincacheStatusEnum twincacheStatus) {
    this.twincacheStatus = twincacheStatus;
    return this;
  }

   /**
   * Get twincacheStatus
   * @return twincacheStatus
  **/
  @javax.annotation.Nullable
  public TwincacheStatusEnum getTwincacheStatus() {
    return twincacheStatus;
  }

  public void setTwincacheStatus(TwincacheStatusEnum twincacheStatus) {
    this.twincacheStatus = twincacheStatus;
  }


  public Dataset queries(List<String> queries) {
    this.queries = queries;
    return this;
  }

  public Dataset addQueriesItem(String queriesItem) {
    if (this.queries == null) {
      this.queries = new ArrayList<>();
    }
    this.queries.add(queriesItem);
    return this;
  }

   /**
   * the list of queries
   * @return queries
  **/
  @javax.annotation.Nullable
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
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * the list of tags
   * @return tags
  **/
  @javax.annotation.Nullable
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
      this.fragmentsIds = new ArrayList<>();
    }
    this.fragmentsIds.add(fragmentsIdsItem);
    return this;
  }

   /**
   * the list of other Datasets ids to compose as fragments
   * @return fragmentsIds
  **/
  @javax.annotation.Nullable
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
      this.compatibility = new ArrayList<>();
    }
    this.compatibility.add(compatibilityItem);
    return this;
  }

   /**
   * the list of compatible Solutions versions
   * @return compatibility
  **/
  @javax.annotation.Nullable
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
        Objects.equals(this.ownerName, dataset.ownerName) &&
        Objects.equals(this.organizationId, dataset.organizationId) &&
        Objects.equals(this.parentId, dataset.parentId) &&
        Objects.equals(this.linkedWorkspaceIdList, dataset.linkedWorkspaceIdList) &&
        Objects.equals(this.twingraphId, dataset.twingraphId) &&
        Objects.equals(this.main, dataset.main) &&
        Objects.equals(this.creationDate, dataset.creationDate) &&
        Objects.equals(this.refreshDate, dataset.refreshDate) &&
        Objects.equals(this.sourceType, dataset.sourceType) &&
        Objects.equals(this.source, dataset.source) &&
        Objects.equals(this.ingestionStatus, dataset.ingestionStatus) &&
        Objects.equals(this.twincacheStatus, dataset.twincacheStatus) &&
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
    return Objects.hash(id, name, description, ownerId, ownerName, organizationId, parentId, linkedWorkspaceIdList, twingraphId, main, creationDate, refreshDate, sourceType, source, ingestionStatus, twincacheStatus, queries, tags, connector, fragmentsIds, validatorId, compatibility, security);
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
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    linkedWorkspaceIdList: ").append(toIndentedString(linkedWorkspaceIdList)).append("\n");
    sb.append("    twingraphId: ").append(toIndentedString(twingraphId)).append("\n");
    sb.append("    main: ").append(toIndentedString(main)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    refreshDate: ").append(toIndentedString(refreshDate)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    ingestionStatus: ").append(toIndentedString(ingestionStatus)).append("\n");
    sb.append("    twincacheStatus: ").append(toIndentedString(twincacheStatus)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("ownerId");
    openapiFields.add("ownerName");
    openapiFields.add("organizationId");
    openapiFields.add("parentId");
    openapiFields.add("linkedWorkspaceIdList");
    openapiFields.add("twingraphId");
    openapiFields.add("main");
    openapiFields.add("creationDate");
    openapiFields.add("refreshDate");
    openapiFields.add("sourceType");
    openapiFields.add("source");
    openapiFields.add("ingestionStatus");
    openapiFields.add("twincacheStatus");
    openapiFields.add("queries");
    openapiFields.add("tags");
    openapiFields.add("connector");
    openapiFields.add("fragmentsIds");
    openapiFields.add("validatorId");
    openapiFields.add("compatibility");
    openapiFields.add("security");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Dataset
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Dataset.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Dataset is not found in the empty JSON string", Dataset.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Dataset.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Dataset` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("ownerId") != null && !jsonObj.get("ownerId").isJsonNull()) && !jsonObj.get("ownerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ownerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ownerId").toString()));
      }
      if ((jsonObj.get("ownerName") != null && !jsonObj.get("ownerName").isJsonNull()) && !jsonObj.get("ownerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ownerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ownerName").toString()));
      }
      if ((jsonObj.get("organizationId") != null && !jsonObj.get("organizationId").isJsonNull()) && !jsonObj.get("organizationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organizationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organizationId").toString()));
      }
      if ((jsonObj.get("parentId") != null && !jsonObj.get("parentId").isJsonNull()) && !jsonObj.get("parentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("linkedWorkspaceIdList") != null && !jsonObj.get("linkedWorkspaceIdList").isJsonNull() && !jsonObj.get("linkedWorkspaceIdList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `linkedWorkspaceIdList` to be an array in the JSON string but got `%s`", jsonObj.get("linkedWorkspaceIdList").toString()));
      }
      if ((jsonObj.get("twingraphId") != null && !jsonObj.get("twingraphId").isJsonNull()) && !jsonObj.get("twingraphId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `twingraphId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("twingraphId").toString()));
      }
      // validate the optional field `sourceType`
      if (jsonObj.get("sourceType") != null && !jsonObj.get("sourceType").isJsonNull()) {
        DatasetSourceType.validateJsonElement(jsonObj.get("sourceType"));
      }
      // validate the optional field `source`
      if (jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()) {
        SourceInfo.validateJsonElement(jsonObj.get("source"));
      }
      // validate the optional field `ingestionStatus`
      if (jsonObj.get("ingestionStatus") != null && !jsonObj.get("ingestionStatus").isJsonNull()) {
        IngestionStatusEnum.validateJsonElement(jsonObj.get("ingestionStatus"));
      }
      // validate the optional field `twincacheStatus`
      if (jsonObj.get("twincacheStatus") != null && !jsonObj.get("twincacheStatus").isJsonNull()) {
        TwincacheStatusEnum.validateJsonElement(jsonObj.get("twincacheStatus"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("queries") != null && !jsonObj.get("queries").isJsonNull() && !jsonObj.get("queries").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `queries` to be an array in the JSON string but got `%s`", jsonObj.get("queries").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull() && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      // validate the optional field `connector`
      if (jsonObj.get("connector") != null && !jsonObj.get("connector").isJsonNull()) {
        DatasetConnector.validateJsonElement(jsonObj.get("connector"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("fragmentsIds") != null && !jsonObj.get("fragmentsIds").isJsonNull() && !jsonObj.get("fragmentsIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `fragmentsIds` to be an array in the JSON string but got `%s`", jsonObj.get("fragmentsIds").toString()));
      }
      if ((jsonObj.get("validatorId") != null && !jsonObj.get("validatorId").isJsonNull()) && !jsonObj.get("validatorId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validatorId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validatorId").toString()));
      }
      if (jsonObj.get("compatibility") != null && !jsonObj.get("compatibility").isJsonNull()) {
        JsonArray jsonArraycompatibility = jsonObj.getAsJsonArray("compatibility");
        if (jsonArraycompatibility != null) {
          // ensure the json data is an array
          if (!jsonObj.get("compatibility").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `compatibility` to be an array in the JSON string but got `%s`", jsonObj.get("compatibility").toString()));
          }

          // validate the optional field `compatibility` (array)
          for (int i = 0; i < jsonArraycompatibility.size(); i++) {
            DatasetCompatibility.validateJsonElement(jsonArraycompatibility.get(i));
          };
        }
      }
      // validate the optional field `security`
      if (jsonObj.get("security") != null && !jsonObj.get("security").isJsonNull()) {
        DatasetSecurity.validateJsonElement(jsonObj.get("security"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Dataset.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Dataset' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Dataset> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Dataset.class));

       return (TypeAdapter<T>) new TypeAdapter<Dataset>() {
           @Override
           public void write(JsonWriter out, Dataset value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Dataset read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Dataset given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Dataset
  * @throws IOException if the JSON string is invalid with respect to Dataset
  */
  public static Dataset fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Dataset.class);
  }

 /**
  * Convert an instance of Dataset to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

