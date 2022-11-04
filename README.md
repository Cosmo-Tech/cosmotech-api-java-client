# cosmotech-api-java-client

Cosmo Tech Plaform API
- API version: 0.1.0-SNAPSHOT
  - Build date: 2022-11-04T09:41:01.595984685Z[Etc/UTC]

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
  <version>0.1.0-SNAPSHOT</version>
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
     implementation "com.cosmotech:cosmotech-api-java-client:0.1.0-SNAPSHOT"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/cosmotech-api-java-client-0.1.0-SNAPSHOT.jar`
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
    try {
      List<Connector> result = apiInstance.findAllConnectors();
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
*ConnectorApi* | [**registerConnector**](docs/ConnectorApi.md#registerConnector) | **POST** /connectors | Register a new connector
*ConnectorApi* | [**unregisterConnector**](docs/ConnectorApi.md#unregisterConnector) | **DELETE** /connectors/{connector_id} | Unregister a connector
*DatasetApi* | [**addOrReplaceDatasetCompatibilityElements**](docs/DatasetApi.md#addOrReplaceDatasetCompatibilityElements) | **POST** /organizations/{organization_id}/datasets/{dataset_id}/compatibility | Add Dataset Compatibility elements.
*DatasetApi* | [**copyDataset**](docs/DatasetApi.md#copyDataset) | **POST** /organizations/{organization_id}/datasets/copy | Copy a Dataset to another Dataset. Source must have a read capable connector and Target a write capable connector.
*DatasetApi* | [**createDataset**](docs/DatasetApi.md#createDataset) | **POST** /organizations/{organization_id}/datasets | Create a new Dataset
*DatasetApi* | [**deleteDataset**](docs/DatasetApi.md#deleteDataset) | **DELETE** /organizations/{organization_id}/datasets/{dataset_id} | Delete a dataset
*DatasetApi* | [**findAllDatasets**](docs/DatasetApi.md#findAllDatasets) | **GET** /organizations/{organization_id}/datasets | List all Datasets
*DatasetApi* | [**findDatasetById**](docs/DatasetApi.md#findDatasetById) | **GET** /organizations/{organization_id}/datasets/{dataset_id} | Get the details of a Dataset
*DatasetApi* | [**removeAllDatasetCompatibilityElements**](docs/DatasetApi.md#removeAllDatasetCompatibilityElements) | **DELETE** /organizations/{organization_id}/datasets/{dataset_id}/compatibility | Remove all Dataset Compatibility elements from the Dataset specified
*DatasetApi* | [**searchDatasets**](docs/DatasetApi.md#searchDatasets) | **POST** /organizations/{organization_id}/datasets/search | Search Datasets
*DatasetApi* | [**updateDataset**](docs/DatasetApi.md#updateDataset) | **PATCH** /organizations/{organization_id}/datasets/{dataset_id} | Update a dataset
*OrganizationApi* | [**addOrReplaceUsersInOrganization**](docs/OrganizationApi.md#addOrReplaceUsersInOrganization) | **POST** /organizations/{organization_id}/users | Add (or replace) users in the Organization specified
*OrganizationApi* | [**findAllOrganizations**](docs/OrganizationApi.md#findAllOrganizations) | **GET** /organizations | List all Organizations
*OrganizationApi* | [**findOrganizationById**](docs/OrganizationApi.md#findOrganizationById) | **GET** /organizations/{organization_id} | Get the details of an Organization
*OrganizationApi* | [**registerOrganization**](docs/OrganizationApi.md#registerOrganization) | **POST** /organizations | Register a new organization
*OrganizationApi* | [**removeAllUsersInOrganization**](docs/OrganizationApi.md#removeAllUsersInOrganization) | **DELETE** /organizations/{organization_id}/users | Remove all users from the Organization specified
*OrganizationApi* | [**removeUserFromOrganization**](docs/OrganizationApi.md#removeUserFromOrganization) | **DELETE** /organizations/{organization_id}/users/{user_id} | Remove the specified user from the given Organization
*OrganizationApi* | [**unregisterOrganization**](docs/OrganizationApi.md#unregisterOrganization) | **DELETE** /organizations/{organization_id} | Unregister an organization
*OrganizationApi* | [**updateOrganization**](docs/OrganizationApi.md#updateOrganization) | **PATCH** /organizations/{organization_id} | Update an Organization
*OrganizationApi* | [**updateSolutionsContainerRegistryByOrganizationId**](docs/OrganizationApi.md#updateSolutionsContainerRegistryByOrganizationId) | **PATCH** /organizations/{organization_id}/services/solutionsContainerRegistry | Update the solutions container registry configuration for the Organization specified
*OrganizationApi* | [**updateStorageByOrganizationId**](docs/OrganizationApi.md#updateStorageByOrganizationId) | **PATCH** /organizations/{organization_id}/services/storage | Update storage configuration for the Organization specified
*OrganizationApi* | [**updateTenantCredentialsByOrganizationId**](docs/OrganizationApi.md#updateTenantCredentialsByOrganizationId) | **PATCH** /organizations/{organization_id}/services/tenantCredentials | Update tenant credentials for the Organization specified
*ScenarioApi* | [**addOrReplaceScenarioParameterValues**](docs/ScenarioApi.md#addOrReplaceScenarioParameterValues) | **POST** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/parameterValues | Add (or replace) Parameter Values for the Scenario specified
*ScenarioApi* | [**addOrReplaceUsersInScenario**](docs/ScenarioApi.md#addOrReplaceUsersInScenario) | **POST** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/users | Add (or replace) users in the Scenario specified
*ScenarioApi* | [**compareScenarios**](docs/ScenarioApi.md#compareScenarios) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/compare/{compared_scenario_id} | Compare the Scenario with another one and returns the difference for parameters values
*ScenarioApi* | [**createScenario**](docs/ScenarioApi.md#createScenario) | **POST** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios | Create a new Scenario
*ScenarioApi* | [**deleteAllScenarios**](docs/ScenarioApi.md#deleteAllScenarios) | **DELETE** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios | Delete all Scenarios of the Workspace
*ScenarioApi* | [**deleteScenario**](docs/ScenarioApi.md#deleteScenario) | **DELETE** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id} | Delete a scenario
*ScenarioApi* | [**downloadScenarioData**](docs/ScenarioApi.md#downloadScenarioData) | **POST** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/downloads | Download Scenario data
*ScenarioApi* | [**findAllScenarios**](docs/ScenarioApi.md#findAllScenarios) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios | List all Scenarios
*ScenarioApi* | [**findAllScenariosByValidationStatus**](docs/ScenarioApi.md#findAllScenariosByValidationStatus) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/{validationStatus} | List all Scenarios by validation status
*ScenarioApi* | [**findScenarioById**](docs/ScenarioApi.md#findScenarioById) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id} | Get the details of an scenario
*ScenarioApi* | [**getScenarioDataDownloadJobInfo**](docs/ScenarioApi.md#getScenarioDataDownloadJobInfo) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/downloads/{download_id} | Get Scenario data download URL
*ScenarioApi* | [**getScenarioValidationStatusById**](docs/ScenarioApi.md#getScenarioValidationStatusById) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/ValidationStatus | Get the validation status of an scenario
*ScenarioApi* | [**getScenariosTree**](docs/ScenarioApi.md#getScenariosTree) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/tree | Get the Scenarios Tree
*ScenarioApi* | [**removeAllScenarioParameterValues**](docs/ScenarioApi.md#removeAllScenarioParameterValues) | **DELETE** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/parameterValues | Remove all Parameter Values from the Scenario specified
*ScenarioApi* | [**removeAllUsersOfScenario**](docs/ScenarioApi.md#removeAllUsersOfScenario) | **DELETE** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/users | Remove all users from the Scenario specified
*ScenarioApi* | [**removeUserFromScenario**](docs/ScenarioApi.md#removeUserFromScenario) | **DELETE** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/users/{user_id} | Remove the specified user from the given Scenario
*ScenarioApi* | [**updateScenario**](docs/ScenarioApi.md#updateScenario) | **PATCH** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id} | Update a scenario
*ScenariorunApi* | [**deleteHistoricalDataOrganization**](docs/ScenariorunApi.md#deleteHistoricalDataOrganization) | **DELETE** /organizations/{organization_id}/scenarioruns/historicaldata | Delete all historical ScenarioRuns in the Organization
*ScenariorunApi* | [**deleteHistoricalDataWorkspace**](docs/ScenariorunApi.md#deleteHistoricalDataWorkspace) | **DELETE** /organizations/{organization_id}/workspaces/{workspace_id}/scenarioruns/historicaldata | Delete all historical ScenarioRuns in the Workspace
*ScenariorunApi* | [**deleteHistoricalScenarioRunsByScenario**](docs/ScenariorunApi.md#deleteHistoricalScenarioRunsByScenario) | **DELETE** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/scenarioruns | Delete all historical ScenarioRuns for the Scenario
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
*SolutionApi* | [**addOrReplaceParameterGroups**](docs/SolutionApi.md#addOrReplaceParameterGroups) | **POST** /organizations/{organization_id}/solutions/{solution_id}/parameterGroups | Add Parameter Groups. Any item with the same ID will be overwritten
*SolutionApi* | [**addOrReplaceParameters**](docs/SolutionApi.md#addOrReplaceParameters) | **POST** /organizations/{organization_id}/solutions/{solution_id}/parameters | Add Parameters. Any item with the same ID will be overwritten
*SolutionApi* | [**addOrReplaceRunTemplates**](docs/SolutionApi.md#addOrReplaceRunTemplates) | **POST** /organizations/{organization_id}/solutions/{solution_id}/runTemplates | Add Run Templates. Any item with the same ID will be overwritten
*SolutionApi* | [**createSolution**](docs/SolutionApi.md#createSolution) | **POST** /organizations/{organization_id}/solutions | Register a new solution
*SolutionApi* | [**deleteSolution**](docs/SolutionApi.md#deleteSolution) | **DELETE** /organizations/{organization_id}/solutions/{solution_id} | Delete a solution
*SolutionApi* | [**deleteSolutionRunTemplate**](docs/SolutionApi.md#deleteSolutionRunTemplate) | **DELETE** /organizations/{organization_id}/solutions/{solution_id}/runTemplates/{run_template_id} | Remove the specified Solution Run Template
*SolutionApi* | [**downloadRunTemplateHandler**](docs/SolutionApi.md#downloadRunTemplateHandler) | **GET** /organizations/{organization_id}/solutions/{solution_id}/runtemplates/{run_template_id}/handlers/{handler_id}/download | Download a Run Template step handler zip file
*SolutionApi* | [**findAllSolutions**](docs/SolutionApi.md#findAllSolutions) | **GET** /organizations/{organization_id}/solutions | List all Solutions
*SolutionApi* | [**findSolutionById**](docs/SolutionApi.md#findSolutionById) | **GET** /organizations/{organization_id}/solutions/{solution_id} | Get the details of a solution
*SolutionApi* | [**removeAllRunTemplates**](docs/SolutionApi.md#removeAllRunTemplates) | **DELETE** /organizations/{organization_id}/solutions/{solution_id}/runTemplates | Remove all Run Templates from the Solution specified
*SolutionApi* | [**removeAllSolutionParameterGroups**](docs/SolutionApi.md#removeAllSolutionParameterGroups) | **DELETE** /organizations/{organization_id}/solutions/{solution_id}/parameterGroups | Remove all Parameter Groups from the Solution specified
*SolutionApi* | [**removeAllSolutionParameters**](docs/SolutionApi.md#removeAllSolutionParameters) | **DELETE** /organizations/{organization_id}/solutions/{solution_id}/parameters | Remove all Parameters from the Solution specified
*SolutionApi* | [**updateSolution**](docs/SolutionApi.md#updateSolution) | **PATCH** /organizations/{organization_id}/solutions/{solution_id} | Update a solution
*SolutionApi* | [**updateSolutionRunTemplate**](docs/SolutionApi.md#updateSolutionRunTemplate) | **PATCH** /organizations/{organization_id}/solutions/{solution_id}/runTemplates/{run_template_id} | Update the specified Solution Run Template
*SolutionApi* | [**uploadRunTemplateHandler**](docs/SolutionApi.md#uploadRunTemplateHandler) | **POST** /organizations/{organization_id}/solutions/{solution_id}/runtemplates/{run_template_id}/handlers/{handler_id}/upload | Upload a Run Template step handler zip file
*UserApi* | [**authorizeUser**](docs/UserApi.md#authorizeUser) | **GET** /oauth2/authorize | Authorize an User with OAuth2. Delegated to configured OAuth2 service
*UserApi* | [**findAllUsers**](docs/UserApi.md#findAllUsers) | **GET** /users | List all Users
*UserApi* | [**findUserById**](docs/UserApi.md#findUserById) | **GET** /users/{user_id} | Get the details of an user
*UserApi* | [**getCurrentUser**](docs/UserApi.md#getCurrentUser) | **GET** /users/me | Get the details of the logged-in User
*UserApi* | [**getOrganizationCurrentUser**](docs/UserApi.md#getOrganizationCurrentUser) | **GET** /organizations/{organization_id}/me | Get the details of a logged-in User with roles for an Organization
*UserApi* | [**getWorkspaceCurrentUser**](docs/UserApi.md#getWorkspaceCurrentUser) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/me | Get the details of the logged-in user with roles for a Workspace
*UserApi* | [**registerUser**](docs/UserApi.md#registerUser) | **POST** /users | Register a new user
*UserApi* | [**testPlatform**](docs/UserApi.md#testPlatform) | **GET** /test | test platform API call
*UserApi* | [**unregisterUser**](docs/UserApi.md#unregisterUser) | **DELETE** /users/{user_id} | Unregister an user
*UserApi* | [**updateUser**](docs/UserApi.md#updateUser) | **PATCH** /users/{user_id} | Update a User
*ValidatorApi* | [**createValidator**](docs/ValidatorApi.md#createValidator) | **POST** /organizations/{organization_id}/datasets/validators | Register a new validator
*ValidatorApi* | [**createValidatorRun**](docs/ValidatorApi.md#createValidatorRun) | **POST** /organizations/{organization_id}/datasets/validators/{validator_id}/history | Register a new validator run
*ValidatorApi* | [**deleteValidator**](docs/ValidatorApi.md#deleteValidator) | **DELETE** /organizations/{organization_id}/datasets/validators/{validator_id} | Delete a validator
*ValidatorApi* | [**deleteValidatorRun**](docs/ValidatorApi.md#deleteValidatorRun) | **DELETE** /organizations/{organization_id}/datasets/validators/{validator_id}/history/{validatorrun_id} | Delete a validator run
*ValidatorApi* | [**findAllValidatorRuns**](docs/ValidatorApi.md#findAllValidatorRuns) | **GET** /organizations/{organization_id}/datasets/validators/{validator_id}/history | List all Validator Runs
*ValidatorApi* | [**findAllValidators**](docs/ValidatorApi.md#findAllValidators) | **GET** /organizations/{organization_id}/datasets/validators | List all Validators
*ValidatorApi* | [**findValidatorById**](docs/ValidatorApi.md#findValidatorById) | **GET** /organizations/{organization_id}/datasets/validators/{validator_id} | Get the details of a validator
*ValidatorApi* | [**findValidatorRunById**](docs/ValidatorApi.md#findValidatorRunById) | **GET** /organizations/{organization_id}/datasets/validators/{validator_id}/history/{validatorrun_id} | Get the details of a validator run
*ValidatorApi* | [**runValidator**](docs/ValidatorApi.md#runValidator) | **POST** /organizations/{organization_id}/datasets/validators/{validator_id}/run | Run a Validator
*WorkspaceApi* | [**addOrReplaceUsersInOrganizationWorkspace**](docs/WorkspaceApi.md#addOrReplaceUsersInOrganizationWorkspace) | **POST** /organizations/{organization_id}/workspaces/{workspace_id}/users | Add (or replace) users to the Workspace specified
*WorkspaceApi* | [**createWorkspace**](docs/WorkspaceApi.md#createWorkspace) | **POST** /organizations/{organization_id}/workspaces | Create a new workspace
*WorkspaceApi* | [**deleteAllWorkspaceFiles**](docs/WorkspaceApi.md#deleteAllWorkspaceFiles) | **DELETE** /organizations/{organization_id}/workspaces/{workspace_id}/files | Delete all Workspace files
*WorkspaceApi* | [**deleteWorkspace**](docs/WorkspaceApi.md#deleteWorkspace) | **DELETE** /organizations/{organization_id}/workspaces/{workspace_id} | Delete a workspace
*WorkspaceApi* | [**deleteWorkspaceFile**](docs/WorkspaceApi.md#deleteWorkspaceFile) | **DELETE** /organizations/{organization_id}/workspaces/{workspace_id}/files/delete | Delete a workspace file
*WorkspaceApi* | [**downloadWorkspaceFile**](docs/WorkspaceApi.md#downloadWorkspaceFile) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/files/download | Download the Workspace File specified
*WorkspaceApi* | [**findAllWorkspaceFiles**](docs/WorkspaceApi.md#findAllWorkspaceFiles) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/files | List all Workspace files
*WorkspaceApi* | [**findAllWorkspaces**](docs/WorkspaceApi.md#findAllWorkspaces) | **GET** /organizations/{organization_id}/workspaces | List all Workspaces
*WorkspaceApi* | [**findWorkspaceById**](docs/WorkspaceApi.md#findWorkspaceById) | **GET** /organizations/{organization_id}/workspaces/{workspace_id} | Get the details of an workspace
*WorkspaceApi* | [**removeAllUsersOfWorkspace**](docs/WorkspaceApi.md#removeAllUsersOfWorkspace) | **DELETE** /organizations/{organization_id}/workspaces/{workspace_id}/users | Remove all users from the Workspace specified
*WorkspaceApi* | [**removeUserFromOrganizationWorkspace**](docs/WorkspaceApi.md#removeUserFromOrganizationWorkspace) | **DELETE** /organizations/{organization_id}/workspaces/{workspace_id}/users/{user_id} | Remove the specified user from the given Organization Workspace
*WorkspaceApi* | [**updateWorkspace**](docs/WorkspaceApi.md#updateWorkspace) | **PATCH** /organizations/{organization_id}/workspaces/{workspace_id} | Update a workspace
*WorkspaceApi* | [**uploadWorkspaceFile**](docs/WorkspaceApi.md#uploadWorkspaceFile) | **POST** /organizations/{organization_id}/workspaces/{workspace_id}/files | Upload a file for the Workspace


## Documentation for Models

 - [Connector](docs/Connector.md)
 - [ConnectorParameter](docs/ConnectorParameter.md)
 - [ConnectorParameterGroup](docs/ConnectorParameterGroup.md)
 - [Dataset](docs/Dataset.md)
 - [DatasetCompatibility](docs/DatasetCompatibility.md)
 - [DatasetConnector](docs/DatasetConnector.md)
 - [DatasetCopyParameters](docs/DatasetCopyParameters.md)
 - [DatasetSearch](docs/DatasetSearch.md)
 - [DeleteHistoricalData](docs/DeleteHistoricalData.md)
 - [Organization](docs/Organization.md)
 - [OrganizationService](docs/OrganizationService.md)
 - [OrganizationServices](docs/OrganizationServices.md)
 - [OrganizationUser](docs/OrganizationUser.md)
 - [RunTemplate](docs/RunTemplate.md)
 - [RunTemplateHandlerId](docs/RunTemplateHandlerId.md)
 - [RunTemplateParameter](docs/RunTemplateParameter.md)
 - [RunTemplateParameterGroup](docs/RunTemplateParameterGroup.md)
 - [RunTemplateParameterValue](docs/RunTemplateParameterValue.md)
 - [RunTemplateStepSource](docs/RunTemplateStepSource.md)
 - [Scenario](docs/Scenario.md)
 - [ScenarioChangedParameterValue](docs/ScenarioChangedParameterValue.md)
 - [ScenarioComparisonResult](docs/ScenarioComparisonResult.md)
 - [ScenarioDataDownloadInfo](docs/ScenarioDataDownloadInfo.md)
 - [ScenarioDataDownloadJob](docs/ScenarioDataDownloadJob.md)
 - [ScenarioJobState](docs/ScenarioJobState.md)
 - [ScenarioLastRun](docs/ScenarioLastRun.md)
 - [ScenarioRun](docs/ScenarioRun.md)
 - [ScenarioRunContainer](docs/ScenarioRunContainer.md)
 - [ScenarioRunContainerArtifact](docs/ScenarioRunContainerArtifact.md)
 - [ScenarioRunContainerLogs](docs/ScenarioRunContainerLogs.md)
 - [ScenarioRunLogs](docs/ScenarioRunLogs.md)
 - [ScenarioRunSearch](docs/ScenarioRunSearch.md)
 - [ScenarioRunStartContainers](docs/ScenarioRunStartContainers.md)
 - [ScenarioRunState](docs/ScenarioRunState.md)
 - [ScenarioRunStatus](docs/ScenarioRunStatus.md)
 - [ScenarioRunStatusNode](docs/ScenarioRunStatusNode.md)
 - [ScenarioRunTemplateParameterValue](docs/ScenarioRunTemplateParameterValue.md)
 - [ScenarioUser](docs/ScenarioUser.md)
 - [ScenarioValidationStatus](docs/ScenarioValidationStatus.md)
 - [Solution](docs/Solution.md)
 - [User](docs/User.md)
 - [UserOrganization](docs/UserOrganization.md)
 - [UserWorkspace](docs/UserWorkspace.md)
 - [Validator](docs/Validator.md)
 - [ValidatorRun](docs/ValidatorRun.md)
 - [Workspace](docs/Workspace.md)
 - [WorkspaceFile](docs/WorkspaceFile.md)
 - [WorkspaceSolution](docs/WorkspaceSolution.md)
 - [WorkspaceUser](docs/WorkspaceUser.md)
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

