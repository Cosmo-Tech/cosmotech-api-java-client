# cosmotech-api-java-client

Cosmo Tech Platform API
- API version: 3.0.19-SNAPSHOT
  - Build date: 2023-12-06T09:27:24.559293471Z[Etc/UTC]

Cosmo Tech Platform API

  For more information, please visit [https://github.com/Cosmo-Tech/cosmotech-api](https://github.com/Cosmo-Tech/cosmotech-api)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.cosmotech</groupId>
  <artifactId>cosmotech-api-java-client</artifactId>
  <version>3.0.19-SNAPSHOT</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'cosmotech-api-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'cosmotech-api-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.cosmotech:cosmotech-api-java-client:3.0.19-SNAPSHOT"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/cosmotech-api-java-client-3.0.19-SNAPSHOT.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.ConnectorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ConnectorApi apiInstance = new ConnectorApi(defaultClient);
    Integer page = 56; // Integer | page number to query
    Integer size = 56; // Integer | amount of result by page
    try {
      List<Connector> result = apiInstance.findAllConnectors(page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorApi#findAllConnectors");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://dev.api.cosmotech.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ConnectorApi* | [**findAllConnectors**](docs/ConnectorApi.md#findAllConnectors) | **GET** /connectors | List all Connectors
*ConnectorApi* | [**findConnectorById**](docs/ConnectorApi.md#findConnectorById) | **GET** /connectors/{connector_id} | Get the details of a connector
*ConnectorApi* | [**findConnectorByName**](docs/ConnectorApi.md#findConnectorByName) | **GET** /connectors/name/{connector_name} | Get the details of a connector
*ConnectorApi* | [**registerConnector**](docs/ConnectorApi.md#registerConnector) | **POST** /connectors | Register a new connector
*ConnectorApi* | [**unregisterConnector**](docs/ConnectorApi.md#unregisterConnector) | **DELETE** /connectors/{connector_id} | Unregister a connector
*DatasetApi* | [**addDatasetAccessControl**](docs/DatasetApi.md#addDatasetAccessControl) | **POST** /organizations/{organization_id}/datasets/{dataset_id}/security/access | Add a control access to the Dataset
*DatasetApi* | [**addOrReplaceDatasetCompatibilityElements**](docs/DatasetApi.md#addOrReplaceDatasetCompatibilityElements) | **POST** /organizations/{organization_id}/datasets/{dataset_id}/compatibility | Add Dataset Compatibility elements.
*DatasetApi* | [**copyDataset**](docs/DatasetApi.md#copyDataset) | **POST** /organizations/{organization_id}/datasets/copy | Copy a Dataset to another Dataset.
*DatasetApi* | [**createDataset**](docs/DatasetApi.md#createDataset) | **POST** /organizations/{organization_id}/datasets | Create a new Dataset
*DatasetApi* | [**createSubDataset**](docs/DatasetApi.md#createSubDataset) | **POST** /organizations/{organization_id}/datasets/{dataset_id}/subdataset | Create a sub-dataset from the dataset in parameter
*DatasetApi* | [**createTwingraphEntities**](docs/DatasetApi.md#createTwingraphEntities) | **POST** /organizations/{organization_id}/datasets/{dataset_id}/twingraph/{type} | Create new entities in a graph instance
*DatasetApi* | [**deleteDataset**](docs/DatasetApi.md#deleteDataset) | **DELETE** /organizations/{organization_id}/datasets/{dataset_id} | Delete a dataset
*DatasetApi* | [**deleteTwingraphEntities**](docs/DatasetApi.md#deleteTwingraphEntities) | **DELETE** /organizations/{organization_id}/datasets/{dataset_id}/twingraph/{type} | Delete entities in a graph instance
*DatasetApi* | [**downloadTwingraph**](docs/DatasetApi.md#downloadTwingraph) | **GET** /organizations/{organization_id}/datasets/twingraph/download/{hash} | Download a graph as a zip file
*DatasetApi* | [**findAllDatasets**](docs/DatasetApi.md#findAllDatasets) | **GET** /organizations/{organization_id}/datasets | List all Datasets
*DatasetApi* | [**findDatasetById**](docs/DatasetApi.md#findDatasetById) | **GET** /organizations/{organization_id}/datasets/{dataset_id} | Get the details of a Dataset
*DatasetApi* | [**getDatasetAccessControl**](docs/DatasetApi.md#getDatasetAccessControl) | **GET** /organizations/{organization_id}/datasets/{dataset_id}/security/access/{identity_id} | Get a control access for the Dataset
*DatasetApi* | [**getDatasetSecurity**](docs/DatasetApi.md#getDatasetSecurity) | **GET** /organizations/{organization_id}/datasets/{dataset_id}/security | Get the Dataset security information
*DatasetApi* | [**getDatasetSecurityUsers**](docs/DatasetApi.md#getDatasetSecurityUsers) | **GET** /organizations/{organization_id}/datasets/{dataset_id}/security/users | Get the Dataset security users list
*DatasetApi* | [**getDatasetTwingraphStatus**](docs/DatasetApi.md#getDatasetTwingraphStatus) | **GET** /organizations/{organization_id}/datasets/{dataset_id}/status | Get the dataset&#39;s refresh job status
*DatasetApi* | [**getTwingraphEntities**](docs/DatasetApi.md#getTwingraphEntities) | **GET** /organizations/{organization_id}/datasets/{dataset_id}/twingraph/{type} | Get entities in a graph instance
*DatasetApi* | [**refreshDataset**](docs/DatasetApi.md#refreshDataset) | **POST** /organizations/{organization_id}/datasets/{dataset_id}/refresh | Refresh data on dataset from dataset&#39;s source
*DatasetApi* | [**removeAllDatasetCompatibilityElements**](docs/DatasetApi.md#removeAllDatasetCompatibilityElements) | **DELETE** /organizations/{organization_id}/datasets/{dataset_id}/compatibility | Remove all Dataset Compatibility elements from the Dataset specified
*DatasetApi* | [**removeDatasetAccessControl**](docs/DatasetApi.md#removeDatasetAccessControl) | **DELETE** /organizations/{organization_id}/datasets/{dataset_id}/security/access/{identity_id} | Remove the specified access from the given Dataset
*DatasetApi* | [**searchDatasets**](docs/DatasetApi.md#searchDatasets) | **POST** /organizations/{organization_id}/datasets/search | Search Datasets by tags
*DatasetApi* | [**setDatasetDefaultSecurity**](docs/DatasetApi.md#setDatasetDefaultSecurity) | **POST** /organizations/{organization_id}/datasets/{dataset_id}/security/default | Set the Dataset default security
*DatasetApi* | [**twingraphBatchQuery**](docs/DatasetApi.md#twingraphBatchQuery) | **POST** /organizations/{organization_id}/datasets/{dataset_id}/batch-query | Run a query on a graph instance and return the result as a zip file in async mode
*DatasetApi* | [**twingraphBatchUpdate**](docs/DatasetApi.md#twingraphBatchUpdate) | **POST** /organizations/{organization_id}/datasets/{dataset_id}/batch | Async batch update by loading a CSV file on a graph instance 
*DatasetApi* | [**twingraphQuery**](docs/DatasetApi.md#twingraphQuery) | **POST** /organizations/{organization_id}/datasets/{dataset_id}/twingraph | Return the result of a query made on the graph instance as a json
*DatasetApi* | [**updateDataset**](docs/DatasetApi.md#updateDataset) | **PATCH** /organizations/{organization_id}/datasets/{dataset_id} | Update a dataset
*DatasetApi* | [**updateDatasetAccessControl**](docs/DatasetApi.md#updateDatasetAccessControl) | **PATCH** /organizations/{organization_id}/datasets/{dataset_id}/security/access/{identity_id} | Update the specified access to User for a Dataset
*DatasetApi* | [**updateTwingraphEntities**](docs/DatasetApi.md#updateTwingraphEntities) | **PATCH** /organizations/{organization_id}/datasets/{dataset_id}/twingraph/{type} | Update entities in a graph instance
*DatasetApi* | [**uploadTwingraph**](docs/DatasetApi.md#uploadTwingraph) | **POST** /organizations/{organization_id}/datasets/{dataset_id} | Upload data from zip file to dataset&#39;s twingraph
*OrganizationApi* | [**addOrganizationAccessControl**](docs/OrganizationApi.md#addOrganizationAccessControl) | **POST** /organizations/{organization_id}/security/access | Add a control access to the Organization
*OrganizationApi* | [**findAllOrganizations**](docs/OrganizationApi.md#findAllOrganizations) | **GET** /organizations | List all Organizations
*OrganizationApi* | [**findOrganizationById**](docs/OrganizationApi.md#findOrganizationById) | **GET** /organizations/{organization_id} | Get the details of an Organization
*OrganizationApi* | [**getAllPermissions**](docs/OrganizationApi.md#getAllPermissions) | **GET** /organizations/permissions | Get all permissions per components
*OrganizationApi* | [**getOrganizationAccessControl**](docs/OrganizationApi.md#getOrganizationAccessControl) | **GET** /organizations/{organization_id}/security/access/{identity_id} | Get a control access for the Organization
*OrganizationApi* | [**getOrganizationPermissions**](docs/OrganizationApi.md#getOrganizationPermissions) | **GET** /organizations/{organization_id}/permissions/{role} | Get the Organization permissions by given role
*OrganizationApi* | [**getOrganizationSecurity**](docs/OrganizationApi.md#getOrganizationSecurity) | **GET** /organizations/{organization_id}/security | Get the Organization security information
*OrganizationApi* | [**getOrganizationSecurityUsers**](docs/OrganizationApi.md#getOrganizationSecurityUsers) | **GET** /organizations/{organization_id}/security/users | Get the Organization security users list
*OrganizationApi* | [**registerOrganization**](docs/OrganizationApi.md#registerOrganization) | **POST** /organizations | Register a new organization
*OrganizationApi* | [**removeOrganizationAccessControl**](docs/OrganizationApi.md#removeOrganizationAccessControl) | **DELETE** /organizations/{organization_id}/security/access/{identity_id} | Remove the specified access from the given Organization
*OrganizationApi* | [**setOrganizationDefaultSecurity**](docs/OrganizationApi.md#setOrganizationDefaultSecurity) | **POST** /organizations/{organization_id}/security/default | Set the Organization default security
*OrganizationApi* | [**unregisterOrganization**](docs/OrganizationApi.md#unregisterOrganization) | **DELETE** /organizations/{organization_id} | Unregister an organization
*OrganizationApi* | [**updateOrganization**](docs/OrganizationApi.md#updateOrganization) | **PATCH** /organizations/{organization_id} | Update an Organization
*OrganizationApi* | [**updateOrganizationAccessControl**](docs/OrganizationApi.md#updateOrganizationAccessControl) | **PATCH** /organizations/{organization_id}/security/access/{identity_id} | Update the specified access to User for an Organization
*OrganizationApi* | [**updateSolutionsContainerRegistryByOrganizationId**](docs/OrganizationApi.md#updateSolutionsContainerRegistryByOrganizationId) | **PATCH** /organizations/{organization_id}/services/solutionsContainerRegistry | Update the solutions container registry configuration for the Organization specified
*OrganizationApi* | [**updateStorageByOrganizationId**](docs/OrganizationApi.md#updateStorageByOrganizationId) | **PATCH** /organizations/{organization_id}/services/storage | Update storage configuration for the Organization specified
*OrganizationApi* | [**updateTenantCredentialsByOrganizationId**](docs/OrganizationApi.md#updateTenantCredentialsByOrganizationId) | **PATCH** /organizations/{organization_id}/services/tenantCredentials | Update tenant credentials for the Organization specified
*ScenarioApi* | [**addOrReplaceScenarioParameterValues**](docs/ScenarioApi.md#addOrReplaceScenarioParameterValues) | **POST** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/parameterValues | Add (or replace) Parameter Values for the Scenario specified
*ScenarioApi* | [**addScenarioAccessControl**](docs/ScenarioApi.md#addScenarioAccessControl) | **POST** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/security/access | Add a control access to the Scenario
*ScenarioApi* | [**compareScenarios**](docs/ScenarioApi.md#compareScenarios) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/compare/{compared_scenario_id} | Compare the Scenario with another one and returns the difference for parameters values
*ScenarioApi* | [**createScenario**](docs/ScenarioApi.md#createScenario) | **POST** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios | Create a new Scenario
*ScenarioApi* | [**deleteAllScenarios**](docs/ScenarioApi.md#deleteAllScenarios) | **DELETE** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios | Delete all Scenarios of the Workspace
*ScenarioApi* | [**deleteScenario**](docs/ScenarioApi.md#deleteScenario) | **DELETE** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id} | Delete a scenario
*ScenarioApi* | [**downloadScenarioData**](docs/ScenarioApi.md#downloadScenarioData) | **POST** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/downloads | Download Scenario data
*ScenarioApi* | [**findAllScenarios**](docs/ScenarioApi.md#findAllScenarios) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios | List all Scenarios
*ScenarioApi* | [**findAllScenariosByValidationStatus**](docs/ScenarioApi.md#findAllScenariosByValidationStatus) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/{validationStatus} | List all Scenarios by validation status
*ScenarioApi* | [**findScenarioById**](docs/ScenarioApi.md#findScenarioById) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id} | Get the details of an scenario
*ScenarioApi* | [**getScenarioAccessControl**](docs/ScenarioApi.md#getScenarioAccessControl) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/security/access/{identity_id} | Get a control access for the Scenario
*ScenarioApi* | [**getScenarioDataDownloadJobInfo**](docs/ScenarioApi.md#getScenarioDataDownloadJobInfo) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/downloads/{download_id} | Get Scenario data download URL
*ScenarioApi* | [**getScenarioPermissions**](docs/ScenarioApi.md#getScenarioPermissions) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/permissions/{role} | Get the Scenario permission by given role
*ScenarioApi* | [**getScenarioSecurity**](docs/ScenarioApi.md#getScenarioSecurity) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/security | Get the Scenario security information
*ScenarioApi* | [**getScenarioSecurityUsers**](docs/ScenarioApi.md#getScenarioSecurityUsers) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/security/users | Get the Scenario security users list
*ScenarioApi* | [**getScenarioValidationStatusById**](docs/ScenarioApi.md#getScenarioValidationStatusById) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/ValidationStatus | Get the validation status of an scenario
*ScenarioApi* | [**getScenariosTree**](docs/ScenarioApi.md#getScenariosTree) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/tree | Get the Scenarios Tree
*ScenarioApi* | [**removeAllScenarioParameterValues**](docs/ScenarioApi.md#removeAllScenarioParameterValues) | **DELETE** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/parameterValues | Remove all Parameter Values from the Scenario specified
*ScenarioApi* | [**removeScenarioAccessControl**](docs/ScenarioApi.md#removeScenarioAccessControl) | **DELETE** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/security/access/{identity_id} | Remove the specified access from the given Organization Scenario
*ScenarioApi* | [**setScenarioDefaultSecurity**](docs/ScenarioApi.md#setScenarioDefaultSecurity) | **POST** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/security/default | Set the Scenario default security
*ScenarioApi* | [**updateScenario**](docs/ScenarioApi.md#updateScenario) | **PATCH** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id} | Update a scenario
*ScenarioApi* | [**updateScenarioAccessControl**](docs/ScenarioApi.md#updateScenarioAccessControl) | **PATCH** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/security/access/{identity_id} | Update the specified access to User for a Scenario
*ScenariorunApi* | [**deleteHistoricalDataOrganization**](docs/ScenariorunApi.md#deleteHistoricalDataOrganization) | **DELETE** /organizations/{organization_id}/scenarioruns/historicaldata | Delete all historical ScenarioRuns in the Organization
*ScenariorunApi* | [**deleteHistoricalDataScenario**](docs/ScenariorunApi.md#deleteHistoricalDataScenario) | **DELETE** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/scenarioruns/historicaldata | Delete all historical ScenarioRuns in the Scenario
*ScenariorunApi* | [**deleteHistoricalDataWorkspace**](docs/ScenariorunApi.md#deleteHistoricalDataWorkspace) | **DELETE** /organizations/{organization_id}/workspaces/{workspace_id}/scenarioruns/historicaldata | Delete all historical ScenarioRuns in the Workspace
*ScenariorunApi* | [**deleteScenarioRun**](docs/ScenariorunApi.md#deleteScenarioRun) | **DELETE** /organizations/{organization_id}/scenarioruns/{scenariorun_id} | Delete a scenariorun
*ScenariorunApi* | [**findScenarioRunById**](docs/ScenariorunApi.md#findScenarioRunById) | **GET** /organizations/{organization_id}/scenarioruns/{scenariorun_id} | Get the details of a scenariorun
*ScenariorunApi* | [**getScenarioRunCumulatedLogs**](docs/ScenariorunApi.md#getScenarioRunCumulatedLogs) | **GET** /organizations/{organization_id}/scenarioruns/{scenariorun_id}/cumulatedlogs | Get the cumulated logs of a scenariorun
*ScenariorunApi* | [**getScenarioRunLogs**](docs/ScenariorunApi.md#getScenarioRunLogs) | **GET** /organizations/{organization_id}/scenarioruns/{scenariorun_id}/logs | get the logs for the ScenarioRun
*ScenariorunApi* | [**getScenarioRunStatus**](docs/ScenariorunApi.md#getScenarioRunStatus) | **GET** /organizations/{organization_id}/scenarioruns/{scenariorun_id}/status | get the status for the ScenarioRun
*ScenariorunApi* | [**getScenarioRuns**](docs/ScenariorunApi.md#getScenarioRuns) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/scenarioruns | get the list of ScenarioRuns for the Scenario
*ScenariorunApi* | [**getWorkspaceScenarioRuns**](docs/ScenariorunApi.md#getWorkspaceScenarioRuns) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/scenarioruns | get the list of ScenarioRuns for the Workspace
*ScenariorunApi* | [**runScenario**](docs/ScenariorunApi.md#runScenario) | **POST** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/run | run a ScenarioRun for the Scenario
*ScenariorunApi* | [**searchScenarioRuns**](docs/ScenariorunApi.md#searchScenarioRuns) | **POST** /organizations/{organization_id}/scenarioruns/search | Search ScenarioRuns
*ScenariorunApi* | [**startScenarioRunContainers**](docs/ScenariorunApi.md#startScenarioRunContainers) | **POST** /organizations/{organization_id}/scenarioruns/startcontainers | Start a new scenariorun with raw containers definition
*ScenariorunApi* | [**stopScenarioRun**](docs/ScenariorunApi.md#stopScenarioRun) | **POST** /organizations/{organization_id}/scenarioruns/{scenariorun_id}/stop | stop a ScenarioRun for the Scenario
*ScenariorunresultApi* | [**getScenarioRunResult**](docs/ScenariorunresultApi.md#getScenarioRunResult) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/scenarioruns/{scenariorun_id}/probes/{probe_id} | Get a ScenarioRunResult in the Organization
*ScenariorunresultApi* | [**sendScenarioRunResult**](docs/ScenariorunresultApi.md#sendScenarioRunResult) | **POST** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/scenarioruns/{scenariorun_id}/probes/{probe_id} | Create a new ScenarioRunResult in the Organization
*SolutionApi* | [**addOrReplaceParameterGroups**](docs/SolutionApi.md#addOrReplaceParameterGroups) | **POST** /organizations/{organization_id}/solutions/{solution_id}/parameterGroups | Add Parameter Groups. Any item with the same ID will be overwritten
*SolutionApi* | [**addOrReplaceParameters**](docs/SolutionApi.md#addOrReplaceParameters) | **POST** /organizations/{organization_id}/solutions/{solution_id}/parameters | Add Parameters. Any item with the same ID will be overwritten
*SolutionApi* | [**addOrReplaceRunTemplates**](docs/SolutionApi.md#addOrReplaceRunTemplates) | **POST** /organizations/{organization_id}/solutions/{solution_id}/runTemplates | Add Run Templates. Any item with the same ID will be overwritten
*SolutionApi* | [**addSolutionAccessControl**](docs/SolutionApi.md#addSolutionAccessControl) | **POST** /organizations/{organization_id}/solutions/{solution_id}/security/access | Add a control access to the Solution
*SolutionApi* | [**createSolution**](docs/SolutionApi.md#createSolution) | **POST** /organizations/{organization_id}/solutions | Register a new solution
*SolutionApi* | [**deleteSolution**](docs/SolutionApi.md#deleteSolution) | **DELETE** /organizations/{organization_id}/solutions/{solution_id} | Delete a solution
*SolutionApi* | [**deleteSolutionRunTemplate**](docs/SolutionApi.md#deleteSolutionRunTemplate) | **DELETE** /organizations/{organization_id}/solutions/{solution_id}/runTemplates/{run_template_id} | Remove the specified Solution Run Template
*SolutionApi* | [**downloadRunTemplateHandler**](docs/SolutionApi.md#downloadRunTemplateHandler) | **GET** /organizations/{organization_id}/solutions/{solution_id}/runtemplates/{run_template_id}/handlers/{handler_id}/download | Download a Run Template step handler zip file
*SolutionApi* | [**findAllSolutions**](docs/SolutionApi.md#findAllSolutions) | **GET** /organizations/{organization_id}/solutions | List all Solutions
*SolutionApi* | [**findSolutionById**](docs/SolutionApi.md#findSolutionById) | **GET** /organizations/{organization_id}/solutions/{solution_id} | Get the details of a solution
*SolutionApi* | [**getSolutionAccessControl**](docs/SolutionApi.md#getSolutionAccessControl) | **GET** /organizations/{organization_id}/solutions/{solution_id}/security/access/{identity_id} | Get a control access for the Solution
*SolutionApi* | [**getSolutionSecurity**](docs/SolutionApi.md#getSolutionSecurity) | **GET** /organizations/{organization_id}/solutions/{solution_id}/security | Get the Solution security information
*SolutionApi* | [**getSolutionSecurityUsers**](docs/SolutionApi.md#getSolutionSecurityUsers) | **GET** /organizations/{organization_id}/solutions/{solution_id}/security/users | Get the Solution security users list
*SolutionApi* | [**removeAllRunTemplates**](docs/SolutionApi.md#removeAllRunTemplates) | **DELETE** /organizations/{organization_id}/solutions/{solution_id}/runTemplates | Remove all Run Templates from the Solution specified
*SolutionApi* | [**removeAllSolutionParameterGroups**](docs/SolutionApi.md#removeAllSolutionParameterGroups) | **DELETE** /organizations/{organization_id}/solutions/{solution_id}/parameterGroups | Remove all Parameter Groups from the Solution specified
*SolutionApi* | [**removeAllSolutionParameters**](docs/SolutionApi.md#removeAllSolutionParameters) | **DELETE** /organizations/{organization_id}/solutions/{solution_id}/parameters | Remove all Parameters from the Solution specified
*SolutionApi* | [**removeSolutionAccessControl**](docs/SolutionApi.md#removeSolutionAccessControl) | **DELETE** /organizations/{organization_id}/solutions/{solution_id}/security/access/{identity_id} | Remove the specified access from the given Organization Solution
*SolutionApi* | [**setSolutionDefaultSecurity**](docs/SolutionApi.md#setSolutionDefaultSecurity) | **POST** /organizations/{organization_id}/solutions/{solution_id}/security/default | Set the Solution default security
*SolutionApi* | [**updateSolution**](docs/SolutionApi.md#updateSolution) | **PATCH** /organizations/{organization_id}/solutions/{solution_id} | Update a solution
*SolutionApi* | [**updateSolutionAccessControl**](docs/SolutionApi.md#updateSolutionAccessControl) | **PATCH** /organizations/{organization_id}/solutions/{solution_id}/security/access/{identity_id} | Update the specified access to User for a Solution
*SolutionApi* | [**updateSolutionRunTemplate**](docs/SolutionApi.md#updateSolutionRunTemplate) | **PATCH** /organizations/{organization_id}/solutions/{solution_id}/runTemplates/{run_template_id} | Update the specified Solution Run Template
*SolutionApi* | [**uploadRunTemplateHandler**](docs/SolutionApi.md#uploadRunTemplateHandler) | **POST** /organizations/{organization_id}/solutions/{solution_id}/runtemplates/{run_template_id}/handlers/{handler_id}/upload | Upload a Run Template step handler zip file
*TwingraphApi* | [**batchQuery**](docs/TwingraphApi.md#batchQuery) | **POST** /organizations/{organization_id}/twingraph/{graph_id}/batch-query | Run a query on a graph instance and return the result as a zip file in async mode
*TwingraphApi* | [**batchUploadUpdate**](docs/TwingraphApi.md#batchUploadUpdate) | **POST** /organizations/{organization_id}/twingraph/{graph_id}/batch | Async batch update by loading a CSV file on a graph instance 
*TwingraphApi* | [**createEntities**](docs/TwingraphApi.md#createEntities) | **POST** /organizations/{organization_id}/twingraph/{graph_id}/entity/{type} | Create new entities in a graph instance
*TwingraphApi* | [**createGraph**](docs/TwingraphApi.md#createGraph) | **POST** /organizations/{organization_id}/twingraph/{graph_id} | Create a new graph
*TwingraphApi* | [**delete**](docs/TwingraphApi.md#delete) | **DELETE** /organizations/{organization_id}/twingraph/{graph_id} | Delete all versions of a graph and his metadatas
*TwingraphApi* | [**deleteEntities**](docs/TwingraphApi.md#deleteEntities) | **DELETE** /organizations/{organization_id}/twingraph/{graph_id}/entity/{type} | Delete entities in a graph instance
*TwingraphApi* | [**downloadGraph**](docs/TwingraphApi.md#downloadGraph) | **GET** /organizations/{organization_id}/twingraph/download/{hash} | Download a graph compressed in a zip file
*TwingraphApi* | [**findAllTwingraphs**](docs/TwingraphApi.md#findAllTwingraphs) | **GET** /organizations/{organization_id}/twingraphs | Return the list of all graphs stored in the organization
*TwingraphApi* | [**getEntities**](docs/TwingraphApi.md#getEntities) | **GET** /organizations/{organization_id}/twingraph/{graph_id}/entity/{type} | Get entities in a graph instance
*TwingraphApi* | [**getGraphMetaData**](docs/TwingraphApi.md#getGraphMetaData) | **GET** /organizations/{organization_id}/twingraph/{graph_id}/metadata | Return the metaData of the specified graph
*TwingraphApi* | [**jobStatus**](docs/TwingraphApi.md#jobStatus) | **GET** /organizations/{organization_id}/job/{job_id}/status | Get the status of a job
*TwingraphApi* | [**query**](docs/TwingraphApi.md#query) | **POST** /organizations/{organization_id}/twingraph/{graph_id}/query | Run a query on a graph instance
*TwingraphApi* | [**updateEntities**](docs/TwingraphApi.md#updateEntities) | **PATCH** /organizations/{organization_id}/twingraph/{graph_id}/entity/{type} | Update entities in a graph instance
*TwingraphApi* | [**updateGraphMetaData**](docs/TwingraphApi.md#updateGraphMetaData) | **PATCH** /organizations/{organization_id}/twingraph/{graph_id}/metadata | Update the metaData of the specified graph
*ValidatorApi* | [**createValidator**](docs/ValidatorApi.md#createValidator) | **POST** /organizations/{organization_id}/datasets/validators | Register a new validator
*ValidatorApi* | [**createValidatorRun**](docs/ValidatorApi.md#createValidatorRun) | **POST** /organizations/{organization_id}/datasets/validators/{validator_id}/history | Register a new validator run
*ValidatorApi* | [**deleteValidator**](docs/ValidatorApi.md#deleteValidator) | **DELETE** /organizations/{organization_id}/datasets/validators/{validator_id} | Delete a validator
*ValidatorApi* | [**deleteValidatorRun**](docs/ValidatorApi.md#deleteValidatorRun) | **DELETE** /organizations/{organization_id}/datasets/validators/{validator_id}/history/{validatorrun_id} | Delete a validator run
*ValidatorApi* | [**findAllValidatorRuns**](docs/ValidatorApi.md#findAllValidatorRuns) | **GET** /organizations/{organization_id}/datasets/validators/{validator_id}/history | List all Validator Runs
*ValidatorApi* | [**findAllValidators**](docs/ValidatorApi.md#findAllValidators) | **GET** /organizations/{organization_id}/datasets/validators | List all Validators
*ValidatorApi* | [**findValidatorById**](docs/ValidatorApi.md#findValidatorById) | **GET** /organizations/{organization_id}/datasets/validators/{validator_id} | Get the details of a validator
*ValidatorApi* | [**findValidatorRunById**](docs/ValidatorApi.md#findValidatorRunById) | **GET** /organizations/{organization_id}/datasets/validators/{validator_id}/history/{validatorrun_id} | Get the details of a validator run
*ValidatorApi* | [**runValidator**](docs/ValidatorApi.md#runValidator) | **POST** /organizations/{organization_id}/datasets/validators/{validator_id}/run | Run a Validator
*WorkspaceApi* | [**addWorkspaceAccessControl**](docs/WorkspaceApi.md#addWorkspaceAccessControl) | **POST** /organizations/{organization_id}/workspaces/{workspace_id}/security/access | Add a control access to the Workspace
*WorkspaceApi* | [**createSecret**](docs/WorkspaceApi.md#createSecret) | **POST** /organizations/{organization_id}/workspaces/{workspace_id}/secret | Create a secret for the Workspace
*WorkspaceApi* | [**createWorkspace**](docs/WorkspaceApi.md#createWorkspace) | **POST** /organizations/{organization_id}/workspaces | Create a new workspace
*WorkspaceApi* | [**deleteAllWorkspaceFiles**](docs/WorkspaceApi.md#deleteAllWorkspaceFiles) | **DELETE** /organizations/{organization_id}/workspaces/{workspace_id}/files | Delete all Workspace files
*WorkspaceApi* | [**deleteWorkspace**](docs/WorkspaceApi.md#deleteWorkspace) | **DELETE** /organizations/{organization_id}/workspaces/{workspace_id} | Delete a workspace
*WorkspaceApi* | [**deleteWorkspaceFile**](docs/WorkspaceApi.md#deleteWorkspaceFile) | **DELETE** /organizations/{organization_id}/workspaces/{workspace_id}/files/delete | Delete a workspace file
*WorkspaceApi* | [**downloadWorkspaceFile**](docs/WorkspaceApi.md#downloadWorkspaceFile) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/files/download | Download the Workspace File specified
*WorkspaceApi* | [**findAllWorkspaceFiles**](docs/WorkspaceApi.md#findAllWorkspaceFiles) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/files | List all Workspace files
*WorkspaceApi* | [**findAllWorkspaces**](docs/WorkspaceApi.md#findAllWorkspaces) | **GET** /organizations/{organization_id}/workspaces | List all Workspaces
*WorkspaceApi* | [**findWorkspaceById**](docs/WorkspaceApi.md#findWorkspaceById) | **GET** /organizations/{organization_id}/workspaces/{workspace_id} | Get the details of an workspace
*WorkspaceApi* | [**getWorkspaceAccessControl**](docs/WorkspaceApi.md#getWorkspaceAccessControl) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/security/access/{identity_id} | Get a control access for the Workspace
*WorkspaceApi* | [**getWorkspacePermissions**](docs/WorkspaceApi.md#getWorkspacePermissions) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/permissions/{role} | Get the Workspace permission by given role
*WorkspaceApi* | [**getWorkspaceSecurity**](docs/WorkspaceApi.md#getWorkspaceSecurity) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/security | Get the Workspace security information
*WorkspaceApi* | [**getWorkspaceSecurityUsers**](docs/WorkspaceApi.md#getWorkspaceSecurityUsers) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/security/users | Get the Workspace security users list
*WorkspaceApi* | [**removeWorkspaceAccessControl**](docs/WorkspaceApi.md#removeWorkspaceAccessControl) | **DELETE** /organizations/{organization_id}/workspaces/{workspace_id}/security/access/{identity_id} | Remove the specified access from the given Organization Workspace
*WorkspaceApi* | [**setWorkspaceDefaultSecurity**](docs/WorkspaceApi.md#setWorkspaceDefaultSecurity) | **POST** /organizations/{organization_id}/workspaces/{workspace_id}/security/default | Set the Workspace default security
*WorkspaceApi* | [**updateWorkspace**](docs/WorkspaceApi.md#updateWorkspace) | **PATCH** /organizations/{organization_id}/workspaces/{workspace_id} | Update a workspace
*WorkspaceApi* | [**updateWorkspaceAccessControl**](docs/WorkspaceApi.md#updateWorkspaceAccessControl) | **PATCH** /organizations/{organization_id}/workspaces/{workspace_id}/security/access/{identity_id} | Update the specified access to User for a Workspace
*WorkspaceApi* | [**uploadWorkspaceFile**](docs/WorkspaceApi.md#uploadWorkspaceFile) | **POST** /organizations/{organization_id}/workspaces/{workspace_id}/files | Upload a file for the Workspace


## Documentation for Models

 - [ComponentRolePermissions](docs/ComponentRolePermissions.md)
 - [Connector](docs/Connector.md)
 - [ConnectorParameter](docs/ConnectorParameter.md)
 - [ConnectorParameterGroup](docs/ConnectorParameterGroup.md)
 - [ContainerResourceSizeInfo](docs/ContainerResourceSizeInfo.md)
 - [ContainerResourceSizing](docs/ContainerResourceSizing.md)
 - [Dataset](docs/Dataset.md)
 - [DatasetAccessControl](docs/DatasetAccessControl.md)
 - [DatasetCompatibility](docs/DatasetCompatibility.md)
 - [DatasetConnector](docs/DatasetConnector.md)
 - [DatasetCopyParameters](docs/DatasetCopyParameters.md)
 - [DatasetRole](docs/DatasetRole.md)
 - [DatasetSearch](docs/DatasetSearch.md)
 - [DatasetSecurity](docs/DatasetSecurity.md)
 - [DatasetSourceType](docs/DatasetSourceType.md)
 - [DatasetTwinGraphHash](docs/DatasetTwinGraphHash.md)
 - [DatasetTwinGraphInfo](docs/DatasetTwinGraphInfo.md)
 - [DatasetTwinGraphQuery](docs/DatasetTwinGraphQuery.md)
 - [DeleteHistoricalData](docs/DeleteHistoricalData.md)
 - [GraphProperties](docs/GraphProperties.md)
 - [Organization](docs/Organization.md)
 - [OrganizationAccessControl](docs/OrganizationAccessControl.md)
 - [OrganizationRole](docs/OrganizationRole.md)
 - [OrganizationSecurity](docs/OrganizationSecurity.md)
 - [OrganizationService](docs/OrganizationService.md)
 - [OrganizationServices](docs/OrganizationServices.md)
 - [ResourceSizeInfo](docs/ResourceSizeInfo.md)
 - [RunTemplate](docs/RunTemplate.md)
 - [RunTemplateHandlerId](docs/RunTemplateHandlerId.md)
 - [RunTemplateOrchestrator](docs/RunTemplateOrchestrator.md)
 - [RunTemplateParameter](docs/RunTemplateParameter.md)
 - [RunTemplateParameterGroup](docs/RunTemplateParameterGroup.md)
 - [RunTemplateParameterValue](docs/RunTemplateParameterValue.md)
 - [RunTemplateResourceSizing](docs/RunTemplateResourceSizing.md)
 - [RunTemplateStepSource](docs/RunTemplateStepSource.md)
 - [Scenario](docs/Scenario.md)
 - [ScenarioAccessControl](docs/ScenarioAccessControl.md)
 - [ScenarioChangedParameterValue](docs/ScenarioChangedParameterValue.md)
 - [ScenarioComparisonResult](docs/ScenarioComparisonResult.md)
 - [ScenarioDataDownloadInfo](docs/ScenarioDataDownloadInfo.md)
 - [ScenarioDataDownloadJob](docs/ScenarioDataDownloadJob.md)
 - [ScenarioJobState](docs/ScenarioJobState.md)
 - [ScenarioLastRun](docs/ScenarioLastRun.md)
 - [ScenarioResourceSizing](docs/ScenarioResourceSizing.md)
 - [ScenarioRole](docs/ScenarioRole.md)
 - [ScenarioRun](docs/ScenarioRun.md)
 - [ScenarioRunContainer](docs/ScenarioRunContainer.md)
 - [ScenarioRunContainerArtifact](docs/ScenarioRunContainerArtifact.md)
 - [ScenarioRunContainerLogs](docs/ScenarioRunContainerLogs.md)
 - [ScenarioRunLogs](docs/ScenarioRunLogs.md)
 - [ScenarioRunResourceRequested](docs/ScenarioRunResourceRequested.md)
 - [ScenarioRunResult](docs/ScenarioRunResult.md)
 - [ScenarioRunSearch](docs/ScenarioRunSearch.md)
 - [ScenarioRunStartContainers](docs/ScenarioRunStartContainers.md)
 - [ScenarioRunState](docs/ScenarioRunState.md)
 - [ScenarioRunStatus](docs/ScenarioRunStatus.md)
 - [ScenarioRunStatusNode](docs/ScenarioRunStatusNode.md)
 - [ScenarioRunTemplateParameterValue](docs/ScenarioRunTemplateParameterValue.md)
 - [ScenarioSecurity](docs/ScenarioSecurity.md)
 - [ScenarioValidationStatus](docs/ScenarioValidationStatus.md)
 - [Solution](docs/Solution.md)
 - [SolutionAccessControl](docs/SolutionAccessControl.md)
 - [SolutionRole](docs/SolutionRole.md)
 - [SolutionSecurity](docs/SolutionSecurity.md)
 - [SourceInfo](docs/SourceInfo.md)
 - [SubDatasetGraphQuery](docs/SubDatasetGraphQuery.md)
 - [TwinGraphBatchResult](docs/TwinGraphBatchResult.md)
 - [TwinGraphHash](docs/TwinGraphHash.md)
 - [TwinGraphQuery](docs/TwinGraphQuery.md)
 - [Validator](docs/Validator.md)
 - [ValidatorRun](docs/ValidatorRun.md)
 - [Workspace](docs/Workspace.md)
 - [WorkspaceAccessControl](docs/WorkspaceAccessControl.md)
 - [WorkspaceFile](docs/WorkspaceFile.md)
 - [WorkspaceRole](docs/WorkspaceRole.md)
 - [WorkspaceSecret](docs/WorkspaceSecret.md)
 - [WorkspaceSecurity](docs/WorkspaceSecurity.md)
 - [WorkspaceSolution](docs/WorkspaceSolution.md)
 - [WorkspaceWebApp](docs/WorkspaceWebApp.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### oAuth2AuthCode

- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: https://login.microsoftonline.com/common/oauth2/v2.0/authorize
- **Scopes**: 
  - http://dev.api.cosmotech.com/platform: Platform scope


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

platform@cosmotech.com

