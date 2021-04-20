# cosmotech-api-java-client

Cosmo Tech Plaform API
- API version: 0.0.1-SNAPSHOT
  - Build date: 2021-04-20T11:19:04.423677+02:00[Europe/Paris]

Cosmo Tech Platform API


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

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
  <version>0.0.1-SNAPSHOT</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.cosmotech:cosmotech-api-java-client:0.0.1-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/cosmotech-api-java-client-0.0.1-SNAPSHOT.jar`
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
    defaultClient.setBasePath("https://api.azure.cosmo-platform.com");
    
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

All URIs are relative to *https://api.azure.cosmo-platform.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ConnectorApi* | [**findAllConnectors**](docs/ConnectorApi.md#findAllConnectors) | **GET** /connectors | List all Connectors
*ConnectorApi* | [**findConnectorById**](docs/ConnectorApi.md#findConnectorById) | **GET** /connectors/{connector_id} | Get the details of an connector
*ConnectorApi* | [**registerConnector**](docs/ConnectorApi.md#registerConnector) | **POST** /connectors | Register a new connector
*ConnectorApi* | [**unregisterConnector**](docs/ConnectorApi.md#unregisterConnector) | **DELETE** /connectors/{connector_id} | Unregister an connector
*ConnectorApi* | [**uploadConnector**](docs/ConnectorApi.md#uploadConnector) | **POST** /connectors/upload | Upload and register a new connector
*DatasetApi* | [**copyDataset**](docs/DatasetApi.md#copyDataset) | **POST** /organizations/{organization_id}/datasets/copy | Copy a Dataset to another Dataset. Source must have a read capable connector and Target a write capable connector.
*DatasetApi* | [**createDataset**](docs/DatasetApi.md#createDataset) | **POST** /organizations/{organization_id}/datasets | Create a new dataset
*DatasetApi* | [**deleteDataset**](docs/DatasetApi.md#deleteDataset) | **DELETE** /organizations/{organization_id}/datasets/{dataset_id} | Delete a dataset
*DatasetApi* | [**findAllDatasets**](docs/DatasetApi.md#findAllDatasets) | **GET** /organizations/{organization_id}/datasets | List all Datasets
*DatasetApi* | [**findDatasetById**](docs/DatasetApi.md#findDatasetById) | **GET** /organizations/{organization_id}/datasets/{dataset_id} | Get the details of a dataset
*DatasetApi* | [**updateDataset**](docs/DatasetApi.md#updateDataset) | **PATCH** /organizations/{organization_id}/datasets/{dataset_id} | Update a dataset
*OrganizationApi* | [**findAllOrganizations**](docs/OrganizationApi.md#findAllOrganizations) | **GET** /organizations | List all Organizations
*OrganizationApi* | [**findOrganizationById**](docs/OrganizationApi.md#findOrganizationById) | **GET** /organizations/{organization_id} | Get the details of an organization
*OrganizationApi* | [**registerOrganization**](docs/OrganizationApi.md#registerOrganization) | **POST** /organizations | Register a new organization
*OrganizationApi* | [**unregisterOrganization**](docs/OrganizationApi.md#unregisterOrganization) | **DELETE** /organizations/{organization_id} | Unregister an organization
*OrganizationApi* | [**updateOrganization**](docs/OrganizationApi.md#updateOrganization) | **PATCH** /organizations/{organization_id} | Update an organization
*PlatformApi* | [**createPlatform**](docs/PlatformApi.md#createPlatform) | **POST** /platform | Create a new platform
*PlatformApi* | [**getPlatform**](docs/PlatformApi.md#getPlatform) | **GET** /platform | Get the details of the platform
*PlatformApi* | [**updatePlatform**](docs/PlatformApi.md#updatePlatform) | **PATCH** /platform | Update a platform
*ScenarioApi* | [**compareScenarios**](docs/ScenarioApi.md#compareScenarios) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/compare/{compared_scenario_id} | Compare the Scenario with another one and returns the difference for parameters values
*ScenarioApi* | [**createScenario**](docs/ScenarioApi.md#createScenario) | **POST** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios | Create a new scenario
*ScenarioApi* | [**deleteScenario**](docs/ScenarioApi.md#deleteScenario) | **DELETE** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id} | Delete a scenario
*ScenarioApi* | [**findAllScenarios**](docs/ScenarioApi.md#findAllScenarios) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios | List all Scenarios
*ScenarioApi* | [**findScenarioById**](docs/ScenarioApi.md#findScenarioById) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id} | Get the details of an scenario
*ScenarioApi* | [**getScenariosTree**](docs/ScenarioApi.md#getScenariosTree) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/tree | Get the Scenarios Tree
*ScenarioApi* | [**updateScenario**](docs/ScenarioApi.md#updateScenario) | **PATCH** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id} | Update a scenario
*ScenariorunApi* | [**deleteScenarioRun**](docs/ScenariorunApi.md#deleteScenarioRun) | **DELETE** /organizations/{organization_id}/scenarioruns/{scenariorun_id} | Delete a scenariorun
*ScenariorunApi* | [**findScenarioRunById**](docs/ScenariorunApi.md#findScenarioRunById) | **GET** /organizations/{organization_id}/scenarioruns/{scenariorun_id} | Get the details of a scenariorun
*ScenariorunApi* | [**getScenarioScenarioRun**](docs/ScenariorunApi.md#getScenarioScenarioRun) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/scenarioruns/{scenariorun_id} | get the ScenarioRun for the Scenario
*ScenariorunApi* | [**getScenarioScenarioRunLogs**](docs/ScenariorunApi.md#getScenarioScenarioRunLogs) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/scenarioruns/{scenariorun_id}/logs | get the logs for the ScenarioRun
*ScenariorunApi* | [**getScenarioScenarioRuns**](docs/ScenariorunApi.md#getScenarioScenarioRuns) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/scenarioruns | get the list of ScenarioRuns for the Scenario
*ScenariorunApi* | [**getWorkspaceScenarioRuns**](docs/ScenariorunApi.md#getWorkspaceScenarioRuns) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/scenarioruns | get the list of ScenarioRuns for the Workspace
*ScenariorunApi* | [**runScenario**](docs/ScenariorunApi.md#runScenario) | **POST** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/run | run a ScenarioRun for the Scenario
*ScenariorunApi* | [**searchScenarioRunLogs**](docs/ScenariorunApi.md#searchScenarioRunLogs) | **POST** /organizations/{organization_id}/scenarioruns/{scenariorun_id}/logs/search | Search the logs of a scenariorun
*ScenariorunApi* | [**searchScenarioRuns**](docs/ScenariorunApi.md#searchScenarioRuns) | **POST** /organizations/{organization_id}/scenarioruns/search | Search ScenarioRuns
*ScenariorunApi* | [**startScenarioRunContainers**](docs/ScenariorunApi.md#startScenarioRunContainers) | **POST** /organizations/{organization_id}/scenarioruns/startcontainers | Start a new scenariorun with raw containers definition
*ScenariorunApi* | [**startScenarioRunScenario**](docs/ScenariorunApi.md#startScenarioRunScenario) | **POST** /organizations/{organization_id}/scenarioruns/start | Start a new scenariorun for a Scenario
*ScenariorunApi* | [**startScenarioRunSolution**](docs/ScenariorunApi.md#startScenarioRunSolution) | **POST** /organizations/{organization_id}/scenarioruns/startsolution | Start a new scenariorun for a Solution Run Template
*SolutionApi* | [**createSolution**](docs/SolutionApi.md#createSolution) | **POST** /organizations/{organization_id}/solutions | Register a new solution
*SolutionApi* | [**deleteSolution**](docs/SolutionApi.md#deleteSolution) | **DELETE** /organizations/{organization_id}/solutions/{solution_id} | Delete a solution
*SolutionApi* | [**findAllSolutions**](docs/SolutionApi.md#findAllSolutions) | **GET** /organizations/{organization_id}/solutions | List all Solutions
*SolutionApi* | [**findSolutionById**](docs/SolutionApi.md#findSolutionById) | **GET** /organizations/{organization_id}/solutions/{solution_id} | Get the details of a solution
*SolutionApi* | [**updateSolution**](docs/SolutionApi.md#updateSolution) | **PATCH** /organizations/{organization_id}/solutions/{solution_id} | Update a solution
*SolutionApi* | [**upload**](docs/SolutionApi.md#upload) | **POST** /organizations/{organization_id}/solutions/upload | Upload and register a new solution
*UserApi* | [**authorizeUser**](docs/UserApi.md#authorizeUser) | **GET** /oauth2/authorize | Authorize an User with OAuth2. Delegated to configured OAuth2 service
*UserApi* | [**findAllUsers**](docs/UserApi.md#findAllUsers) | **GET** /users | List all Users
*UserApi* | [**findUserById**](docs/UserApi.md#findUserById) | **GET** /users/{user_id} | Get the details of an user
*UserApi* | [**getCurrentUser**](docs/UserApi.md#getCurrentUser) | **GET** /users/me | Get the details of an user
*UserApi* | [**getOrganizationCurrentUser**](docs/UserApi.md#getOrganizationCurrentUser) | **GET** /organizations/{organization_id}/me | Get the details of an user with roles for an Organization
*UserApi* | [**getWorkspaceCurrentUser**](docs/UserApi.md#getWorkspaceCurrentUser) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/me | Get the details of an user with roles for a Workspace
*UserApi* | [**registerUser**](docs/UserApi.md#registerUser) | **POST** /users | Register a new user
*UserApi* | [**unregisterUser**](docs/UserApi.md#unregisterUser) | **DELETE** /users/{user_id} | Unregister an user
*UserApi* | [**updateUser**](docs/UserApi.md#updateUser) | **PATCH** /users/{user_id} | Update an user
*ValidatorApi* | [**createValidator**](docs/ValidatorApi.md#createValidator) | **POST** /organizations/{organization_id}/datasets/validators | Register a new validator
*ValidatorApi* | [**createValidatorRun**](docs/ValidatorApi.md#createValidatorRun) | **POST** /organizations/{organization_id}/datasets/validators/{validator_id}/history | Register a new validator run
*ValidatorApi* | [**deleteValidator**](docs/ValidatorApi.md#deleteValidator) | **DELETE** /organizations/{organization_id}/datasets/validators/{validator_id} | Delete a validator
*ValidatorApi* | [**deleteValidatorRun**](docs/ValidatorApi.md#deleteValidatorRun) | **DELETE** /organizations/{organization_id}/datasets/validators/{validator_id}/history/{validatorrun_id} | Delete a validator run
*ValidatorApi* | [**findAllValidatorRuns**](docs/ValidatorApi.md#findAllValidatorRuns) | **GET** /organizations/{organization_id}/datasets/validators/{validator_id}/history | List all Validator Runs
*ValidatorApi* | [**findAllValidators**](docs/ValidatorApi.md#findAllValidators) | **GET** /organizations/{organization_id}/datasets/validators | List all Validators
*ValidatorApi* | [**findValidatorById**](docs/ValidatorApi.md#findValidatorById) | **GET** /organizations/{organization_id}/datasets/validators/{validator_id} | Get the details of a validator
*ValidatorApi* | [**findValidatorRunById**](docs/ValidatorApi.md#findValidatorRunById) | **GET** /organizations/{organization_id}/datasets/validators/{validator_id}/history/{validatorrun_id} | Get the details of a validator run
*ValidatorApi* | [**runValidator**](docs/ValidatorApi.md#runValidator) | **POST** /organizations/{organization_id}/datasets/validators/{validator_id}/run | Run a Validator
*WorkspaceApi* | [**createWorkspace**](docs/WorkspaceApi.md#createWorkspace) | **POST** /organizations/{organization_id}/workspaces | Create a new workspace
*WorkspaceApi* | [**deleteWorkspace**](docs/WorkspaceApi.md#deleteWorkspace) | **DELETE** /organizations/{organization_id}/workspaces/{workspace_id} | Delete a workspace
*WorkspaceApi* | [**deleteWorkspaceFile**](docs/WorkspaceApi.md#deleteWorkspaceFile) | **DELETE** /organizations/{organization_id}/workspaces/{workspace_id}/files | Delete a workspace file
*WorkspaceApi* | [**findAllWorkspaceFiles**](docs/WorkspaceApi.md#findAllWorkspaceFiles) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/files | List all Workspace files
*WorkspaceApi* | [**findAllWorkspaces**](docs/WorkspaceApi.md#findAllWorkspaces) | **GET** /organizations/{organization_id}/workspaces | List all Workspaces
*WorkspaceApi* | [**findWorkspaceById**](docs/WorkspaceApi.md#findWorkspaceById) | **GET** /organizations/{organization_id}/workspaces/{workspace_id} | Get the details of an workspace
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
 - [Organization](docs/Organization.md)
 - [OrganizationService](docs/OrganizationService.md)
 - [OrganizationServices](docs/OrganizationServices.md)
 - [OrganizationUser](docs/OrganizationUser.md)
 - [Platform](docs/Platform.md)
 - [PlatformService](docs/PlatformService.md)
 - [PlatformServices](docs/PlatformServices.md)
 - [RunTemplate](docs/RunTemplate.md)
 - [RunTemplateParameter](docs/RunTemplateParameter.md)
 - [RunTemplateParameterGroup](docs/RunTemplateParameterGroup.md)
 - [RunTemplateParameterValue](docs/RunTemplateParameterValue.md)
 - [RunTemplateResourceStorage](docs/RunTemplateResourceStorage.md)
 - [Scenario](docs/Scenario.md)
 - [ScenarioAllOf](docs/ScenarioAllOf.md)
 - [ScenarioBase](docs/ScenarioBase.md)
 - [ScenarioChangedParameterValue](docs/ScenarioChangedParameterValue.md)
 - [ScenarioComparisonResult](docs/ScenarioComparisonResult.md)
 - [ScenarioRun](docs/ScenarioRun.md)
 - [ScenarioRunAllOf](docs/ScenarioRunAllOf.md)
 - [ScenarioRunBase](docs/ScenarioRunBase.md)
 - [ScenarioRunContainerLog](docs/ScenarioRunContainerLog.md)
 - [ScenarioRunContainerLogs](docs/ScenarioRunContainerLogs.md)
 - [ScenarioRunContainers](docs/ScenarioRunContainers.md)
 - [ScenarioRunLogs](docs/ScenarioRunLogs.md)
 - [ScenarioRunLogsOptions](docs/ScenarioRunLogsOptions.md)
 - [ScenarioRunSearch](docs/ScenarioRunSearch.md)
 - [ScenarioRunStart](docs/ScenarioRunStart.md)
 - [ScenarioRunStartContainers](docs/ScenarioRunStartContainers.md)
 - [ScenarioRunStartSolution](docs/ScenarioRunStartSolution.md)
 - [ScenarioRunTemplateParameterValue](docs/ScenarioRunTemplateParameterValue.md)
 - [ScenarioUser](docs/ScenarioUser.md)
 - [Solution](docs/Solution.md)
 - [User](docs/User.md)
 - [UserDetails](docs/UserDetails.md)
 - [UserDetailsAllOf](docs/UserDetailsAllOf.md)
 - [UserOrganization](docs/UserOrganization.md)
 - [UserWorkspace](docs/UserWorkspace.md)
 - [Validator](docs/Validator.md)
 - [ValidatorRun](docs/ValidatorRun.md)
 - [Workspace](docs/Workspace.md)
 - [WorkspaceFile](docs/WorkspaceFile.md)
 - [WorkspaceService](docs/WorkspaceService.md)
 - [WorkspaceServices](docs/WorkspaceServices.md)
 - [WorkspaceSolution](docs/WorkspaceSolution.md)
 - [WorkspaceUser](docs/WorkspaceUser.md)
 - [WorkspaceWebApp](docs/WorkspaceWebApp.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### oAuth2AuthCode

- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: oauth2/authorize
- **Scopes**: N/A


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



