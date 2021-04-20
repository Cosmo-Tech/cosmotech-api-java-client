

# ScenarioRun


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | the ScenarioRun |  [optional] [readonly]
**jobId** | **String** | the Platform compute cluster Job Id |  [optional] [readonly]
**ownerId** | **String** | the user id which own this scenariorun |  [optional] [readonly]
**workspaceId** | **String** | the Workspace Id |  [optional] [readonly]
**workspaceName** | **String** | the Workspace name |  [optional] [readonly]
**scenarioId** | **String** | the Scenario Id |  [optional] [readonly]
**scenarioName** | **String** | the Scenario name |  [optional] [readonly]
**solutionId** | **String** | the Solution Id |  [optional] [readonly]
**solutionName** | **String** | the Solution name |  [optional] [readonly]
**solutionVersion** | **String** | the Solution version |  [optional] [readonly]
**runTemplateId** | **String** | the Solution Run Template id |  [optional] [readonly]
**runTemplateName** | **String** | the Run Template name |  [optional] [readonly]
**computeSize** | **String** | the compute size needed for this Analysis. Standard sizes are basic and highcpu. Default is basic |  [optional] [readonly]
**state** | **String** | the ScenarioRun state |  [optional] [readonly]
**startTime** | **String** | the ScenarioRun start Date Time |  [optional] [readonly]
**endTime** | **String** | the ScenarioRun end Date Time |  [optional] [readonly]
**datasetList** | **List&lt;String&gt;** | the list of Dataset Id associated to this Analysis |  [optional] [readonly]
**parametersValues** | [**List&lt;RunTemplateParameterValue&gt;**](RunTemplateParameterValue.md) | the list of Run Template parameters values |  [optional] [readonly]
**sendInputToDataWarehouse** | **Boolean** | whether or not the Dataset values and the input parameters values are send to the DataWarehouse prior to ScenarioRun Run |  [optional] [readonly]
**dataWarehouseDB** | **String** | the DataWarehouse database name to send data if sendInputToDataWarehouse is set |  [optional]
**resultsEventBusResourceUri** | **String** | the event bus which receive Workspace ScenarioRun results messages. Message won&#39;t be send if this is not set |  [optional]
**scenariorunEventBusResourceUri** | **String** | the event bus which receive Workspace ScenarioRun events messages. Message won&#39;t be send if this is not set |  [optional]
**nodeLabel** | **String** | the node label request |  [optional] [readonly]
**initContainers** | [**List&lt;ScenarioRunContainers&gt;**](ScenarioRunContainers.md) | the list of init containers |  [optional] [readonly]
**mainContainer** | [**ScenarioRunContainers**](ScenarioRunContainers.md) |  |  [optional]



