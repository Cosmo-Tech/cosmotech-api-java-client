

# Simulation


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | the Simulation |  [optional] [readonly]
**jobId** | **String** | the Platform compute cluster Job Id |  [optional] [readonly]
**ownerId** | **String** | the user id which own this simulation |  [optional] [readonly]
**workspaceId** | **String** | the Workspace Id |  [optional] [readonly]
**workspaceName** | **String** | the Workspace name |  [optional] [readonly]
**scenarioId** | **String** | the Scenario Id |  [optional] [readonly]
**scenarioName** | **String** | the Scenario name |  [optional] [readonly]
**simulatorId** | **String** | the Simulator Id |  [optional] [readonly]
**simulatorName** | **String** | the Simulator name |  [optional] [readonly]
**simulatorVersion** | **String** | the Simulator version |  [optional] [readonly]
**simulatorAnalysisId** | **String** | the Simulator Analysis id |  [optional] [readonly]
**simulatorAnalysisName** | **String** | the Simulator Analysis name |  [optional] [readonly]
**computeSize** | **String** | the compute size needed for this Analysis. Standard sizes are basic and highcpu. Default is basic |  [optional] [readonly]
**state** | **String** | the Simulation state |  [optional] [readonly]
**startTime** | **String** | the Simulation start Date Time |  [optional] [readonly]
**endTime** | **String** | the Simulation end Date Time |  [optional] [readonly]
**datasetList** | **List&lt;String&gt;** | the list of Dataset Id associated to this Analysis |  [optional] [readonly]
**parametersValues** | [**List&lt;SimulationAnalysisParameterValue&gt;**](SimulationAnalysisParameterValue.md) | the list of Simulator Analysis parameters values |  [optional] [readonly]
**sendInputToDataWarehouse** | **Boolean** | whether or not the Dataset values and the input parameters values are send to the DataWarehouse prior to Simulation Run |  [optional] [readonly]
**dataWarehouseDB** | **String** | the DataWarehouse database name to send data if sendInputToDataWarehouse is set |  [optional]
**resultsEventBusResourceUri** | **String** | the event bus which receive Workspace Simulation results messages. Message won&#39;t be send if this is not set |  [optional]
**simulationEventBusResourceUri** | **String** | the event bus which receive Workspace Simulation events messages. Message won&#39;t be send if this is not set |  [optional]
**nodeLabel** | **String** | the node label request |  [optional] [readonly]
**initContainers** | [**List&lt;SimulationContainers&gt;**](SimulationContainers.md) | the list of init containers |  [optional] [readonly]
**mainContainer** | [**SimulationContainers**](SimulationContainers.md) |  |  [optional]



