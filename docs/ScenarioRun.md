

# ScenarioRun

a ScenarioRun with only base properties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | the ScenarioRun |  [optional] [readonly]
**state** | [**ScenarioRunState**](ScenarioRunState.md) |  |  [optional]
**organizationId** | **String** | the Organization id |  [optional]
**workflowId** | **String** | the Cosmo Tech compute cluster Argo Workflow Id to search |  [optional]
**csmSimulationRun** | **String** | the Cosmo Tech Simulation Run Id |  [optional] [readonly]
**generateName** | **String** | the base name for workflow name generation |  [optional]
**workflowName** | **String** | the Cosmo Tech compute cluster Argo Workflow Name |  [optional]
**ownerId** | **String** | the user id which own this scenariorun |  [optional] [readonly]
**workspaceId** | **String** | the Workspace Id |  [optional] [readonly]
**workspaceKey** | **String** | technical key for resource name convention and version grouping. Must be unique |  [optional] [readonly]
**scenarioId** | **String** | the Scenario Id |  [optional] [readonly]
**solutionId** | **String** | the Solution Id |  [optional] [readonly]
**runTemplateId** | **String** | the Solution Run Template id |  [optional] [readonly]
**computeSize** | **String** | the compute size needed for this Analysis. Standard sizes are basic and highcpu. Default is basic |  [optional] [readonly]
**sdkVersion** | **String** | the MAJOR.MINOR version used to build the solution solution |  [optional]
**noDataIngestionState** | **Boolean** | set to true if the run template does not use any Datawarehouse consumers (AMQP consumers for Azure) |  [optional]
**datasetList** | **List&lt;String&gt;** | the list of Dataset Id associated to this Analysis |  [optional] [readonly]
**parametersValues** | [**List&lt;RunTemplateParameterValue&gt;**](RunTemplateParameterValue.md) | the list of Run Template parameters values |  [optional] [readonly]
**sendDatasetsToDataWarehouse** | **Boolean** | whether or not the Datasets values are send to the DataWarehouse prior to Simulation Run. If not set follow the Workspace setting |  [optional] [readonly]
**sendInputParametersToDataWarehouse** | **Boolean** | whether or not the input parameters values are send to the DataWarehouse prior to Simulation Run. If not set follow the Workspace setting |  [optional] [readonly]
**nodeLabel** | **String** | the node label request |  [optional] [readonly]
**containers** | [**List&lt;ScenarioRunContainer&gt;**](ScenarioRunContainer.md) | the containers list. This information is not returned by the API. |  [optional]



