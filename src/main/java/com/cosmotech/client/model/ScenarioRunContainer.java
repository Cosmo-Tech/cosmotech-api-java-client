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
import com.cosmotech.client.model.ContainerResourceSizing;
import com.cosmotech.client.model.ScenarioRunContainerArtifact;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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
 * a ScenarioRun container description
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-05T15:35:23.021239139Z[Etc/UTC]")
public class ScenarioRunContainer {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = new HashMap<>();

  public static final String SERIALIZED_NAME_ENV_VARS = "envVars";
  @SerializedName(SERIALIZED_NAME_ENV_VARS)
  private Map<String, String> envVars = new HashMap<>();

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_ENTRYPOINT = "entrypoint";
  @SerializedName(SERIALIZED_NAME_ENTRYPOINT)
  private String entrypoint;

  public static final String SERIALIZED_NAME_RUN_ARGS = "runArgs";
  @SerializedName(SERIALIZED_NAME_RUN_ARGS)
  private List<String> runArgs;

  public static final String SERIALIZED_NAME_DEPENDENCIES = "dependencies";
  @SerializedName(SERIALIZED_NAME_DEPENDENCIES)
  private List<String> dependencies;

  public static final String SERIALIZED_NAME_SOLUTION_CONTAINER = "solutionContainer";
  @SerializedName(SERIALIZED_NAME_SOLUTION_CONTAINER)
  private Boolean solutionContainer;

  public static final String SERIALIZED_NAME_NODE_LABEL = "nodeLabel";
  @SerializedName(SERIALIZED_NAME_NODE_LABEL)
  private String nodeLabel;

  public static final String SERIALIZED_NAME_RUN_SIZING = "runSizing";
  @SerializedName(SERIALIZED_NAME_RUN_SIZING)
  private ContainerResourceSizing runSizing;

  public static final String SERIALIZED_NAME_ARTIFACTS = "artifacts";
  @SerializedName(SERIALIZED_NAME_ARTIFACTS)
  private List<ScenarioRunContainerArtifact> artifacts;

  public ScenarioRunContainer() {
  }

  public ScenarioRunContainer(
     String id, 
     Boolean solutionContainer
  ) {
    this();
    this.id = id;
    this.solutionContainer = solutionContainer;
  }

   /**
   * the container Id
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }



  public ScenarioRunContainer name(String name) {
    this.name = name;
    return this;
  }

   /**
   * the container name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public ScenarioRunContainer labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public ScenarioRunContainer putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * the metadata labels
   * @return labels
  **/
  @javax.annotation.Nullable
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public ScenarioRunContainer envVars(Map<String, String> envVars) {
    this.envVars = envVars;
    return this;
  }

  public ScenarioRunContainer putEnvVarsItem(String key, String envVarsItem) {
    if (this.envVars == null) {
      this.envVars = new HashMap<>();
    }
    this.envVars.put(key, envVarsItem);
    return this;
  }

   /**
   * environment variable map
   * @return envVars
  **/
  @javax.annotation.Nullable
  public Map<String, String> getEnvVars() {
    return envVars;
  }

  public void setEnvVars(Map<String, String> envVars) {
    this.envVars = envVars;
  }


  public ScenarioRunContainer image(String image) {
    this.image = image;
    return this;
  }

   /**
   * the container image URI
   * @return image
  **/
  @javax.annotation.Nonnull
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }


  public ScenarioRunContainer entrypoint(String entrypoint) {
    this.entrypoint = entrypoint;
    return this;
  }

   /**
   * the container entry point
   * @return entrypoint
  **/
  @javax.annotation.Nullable
  public String getEntrypoint() {
    return entrypoint;
  }

  public void setEntrypoint(String entrypoint) {
    this.entrypoint = entrypoint;
  }


  public ScenarioRunContainer runArgs(List<String> runArgs) {
    this.runArgs = runArgs;
    return this;
  }

  public ScenarioRunContainer addRunArgsItem(String runArgsItem) {
    if (this.runArgs == null) {
      this.runArgs = new ArrayList<>();
    }
    this.runArgs.add(runArgsItem);
    return this;
  }

   /**
   * the list of run arguments for the container
   * @return runArgs
  **/
  @javax.annotation.Nullable
  public List<String> getRunArgs() {
    return runArgs;
  }

  public void setRunArgs(List<String> runArgs) {
    this.runArgs = runArgs;
  }


  public ScenarioRunContainer dependencies(List<String> dependencies) {
    this.dependencies = dependencies;
    return this;
  }

  public ScenarioRunContainer addDependenciesItem(String dependenciesItem) {
    if (this.dependencies == null) {
      this.dependencies = new ArrayList<>();
    }
    this.dependencies.add(dependenciesItem);
    return this;
  }

   /**
   * the list of dependencies container name to run this container
   * @return dependencies
  **/
  @javax.annotation.Nullable
  public List<String> getDependencies() {
    return dependencies;
  }

  public void setDependencies(List<String> dependencies) {
    this.dependencies = dependencies;
  }


   /**
   * whether or not this container is a Cosmo Tech solution container
   * @return solutionContainer
  **/
  @javax.annotation.Nullable
  public Boolean getSolutionContainer() {
    return solutionContainer;
  }



  public ScenarioRunContainer nodeLabel(String nodeLabel) {
    this.nodeLabel = nodeLabel;
    return this;
  }

   /**
   * the node label request
   * @return nodeLabel
  **/
  @javax.annotation.Nullable
  public String getNodeLabel() {
    return nodeLabel;
  }

  public void setNodeLabel(String nodeLabel) {
    this.nodeLabel = nodeLabel;
  }


  public ScenarioRunContainer runSizing(ContainerResourceSizing runSizing) {
    this.runSizing = runSizing;
    return this;
  }

   /**
   * Get runSizing
   * @return runSizing
  **/
  @javax.annotation.Nullable
  public ContainerResourceSizing getRunSizing() {
    return runSizing;
  }

  public void setRunSizing(ContainerResourceSizing runSizing) {
    this.runSizing = runSizing;
  }


  public ScenarioRunContainer artifacts(List<ScenarioRunContainerArtifact> artifacts) {
    this.artifacts = artifacts;
    return this;
  }

  public ScenarioRunContainer addArtifactsItem(ScenarioRunContainerArtifact artifactsItem) {
    if (this.artifacts == null) {
      this.artifacts = new ArrayList<>();
    }
    this.artifacts.add(artifactsItem);
    return this;
  }

   /**
   * the list of artifacts
   * @return artifacts
  **/
  @javax.annotation.Nullable
  public List<ScenarioRunContainerArtifact> getArtifacts() {
    return artifacts;
  }

  public void setArtifacts(List<ScenarioRunContainerArtifact> artifacts) {
    this.artifacts = artifacts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScenarioRunContainer scenarioRunContainer = (ScenarioRunContainer) o;
    return Objects.equals(this.id, scenarioRunContainer.id) &&
        Objects.equals(this.name, scenarioRunContainer.name) &&
        Objects.equals(this.labels, scenarioRunContainer.labels) &&
        Objects.equals(this.envVars, scenarioRunContainer.envVars) &&
        Objects.equals(this.image, scenarioRunContainer.image) &&
        Objects.equals(this.entrypoint, scenarioRunContainer.entrypoint) &&
        Objects.equals(this.runArgs, scenarioRunContainer.runArgs) &&
        Objects.equals(this.dependencies, scenarioRunContainer.dependencies) &&
        Objects.equals(this.solutionContainer, scenarioRunContainer.solutionContainer) &&
        Objects.equals(this.nodeLabel, scenarioRunContainer.nodeLabel) &&
        Objects.equals(this.runSizing, scenarioRunContainer.runSizing) &&
        Objects.equals(this.artifacts, scenarioRunContainer.artifacts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, labels, envVars, image, entrypoint, runArgs, dependencies, solutionContainer, nodeLabel, runSizing, artifacts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScenarioRunContainer {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    envVars: ").append(toIndentedString(envVars)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    entrypoint: ").append(toIndentedString(entrypoint)).append("\n");
    sb.append("    runArgs: ").append(toIndentedString(runArgs)).append("\n");
    sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
    sb.append("    solutionContainer: ").append(toIndentedString(solutionContainer)).append("\n");
    sb.append("    nodeLabel: ").append(toIndentedString(nodeLabel)).append("\n");
    sb.append("    runSizing: ").append(toIndentedString(runSizing)).append("\n");
    sb.append("    artifacts: ").append(toIndentedString(artifacts)).append("\n");
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
    openapiFields.add("labels");
    openapiFields.add("envVars");
    openapiFields.add("image");
    openapiFields.add("entrypoint");
    openapiFields.add("runArgs");
    openapiFields.add("dependencies");
    openapiFields.add("solutionContainer");
    openapiFields.add("nodeLabel");
    openapiFields.add("runSizing");
    openapiFields.add("artifacts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("image");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ScenarioRunContainer
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ScenarioRunContainer.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ScenarioRunContainer is not found in the empty JSON string", ScenarioRunContainer.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ScenarioRunContainer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ScenarioRunContainer` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ScenarioRunContainer.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image").toString()));
      }
      if ((jsonObj.get("entrypoint") != null && !jsonObj.get("entrypoint").isJsonNull()) && !jsonObj.get("entrypoint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entrypoint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entrypoint").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("runArgs") != null && !jsonObj.get("runArgs").isJsonNull() && !jsonObj.get("runArgs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `runArgs` to be an array in the JSON string but got `%s`", jsonObj.get("runArgs").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("dependencies") != null && !jsonObj.get("dependencies").isJsonNull() && !jsonObj.get("dependencies").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `dependencies` to be an array in the JSON string but got `%s`", jsonObj.get("dependencies").toString()));
      }
      if ((jsonObj.get("nodeLabel") != null && !jsonObj.get("nodeLabel").isJsonNull()) && !jsonObj.get("nodeLabel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nodeLabel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nodeLabel").toString()));
      }
      // validate the optional field `runSizing`
      if (jsonObj.get("runSizing") != null && !jsonObj.get("runSizing").isJsonNull()) {
        ContainerResourceSizing.validateJsonElement(jsonObj.get("runSizing"));
      }
      if (jsonObj.get("artifacts") != null && !jsonObj.get("artifacts").isJsonNull()) {
        JsonArray jsonArrayartifacts = jsonObj.getAsJsonArray("artifacts");
        if (jsonArrayartifacts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("artifacts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `artifacts` to be an array in the JSON string but got `%s`", jsonObj.get("artifacts").toString()));
          }

          // validate the optional field `artifacts` (array)
          for (int i = 0; i < jsonArrayartifacts.size(); i++) {
            ScenarioRunContainerArtifact.validateJsonElement(jsonArrayartifacts.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ScenarioRunContainer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ScenarioRunContainer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ScenarioRunContainer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ScenarioRunContainer.class));

       return (TypeAdapter<T>) new TypeAdapter<ScenarioRunContainer>() {
           @Override
           public void write(JsonWriter out, ScenarioRunContainer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ScenarioRunContainer read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ScenarioRunContainer given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ScenarioRunContainer
  * @throws IOException if the JSON string is invalid with respect to ScenarioRunContainer
  */
  public static ScenarioRunContainer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ScenarioRunContainer.class);
  }

 /**
  * Convert an instance of ScenarioRunContainer to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

