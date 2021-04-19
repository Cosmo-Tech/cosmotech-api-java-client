

# SimulationAllOf

a Simulation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**datasetList** | **List&lt;String&gt;** | the list of Dataset Id associated to this Analysis |  [optional] [readonly]
**parametersValues** | [**List&lt;RunTemplateParameterValue&gt;**](RunTemplateParameterValue.md) | the list of Run Template parameters values |  [optional] [readonly]
**sendInputToDataWarehouse** | **Boolean** | whether or not the Dataset values and the input parameters values are send to the DataWarehouse prior to Simulation Run |  [optional] [readonly]
**dataWarehouseDB** | **String** | the DataWarehouse database name to send data if sendInputToDataWarehouse is set |  [optional]
**resultsEventBusResourceUri** | **String** | the event bus which receive Workspace Simulation results messages. Message won&#39;t be send if this is not set |  [optional]
**simulationEventBusResourceUri** | **String** | the event bus which receive Workspace Simulation events messages. Message won&#39;t be send if this is not set |  [optional]
**nodeLabel** | **String** | the node label request |  [optional] [readonly]
**initContainers** | [**List&lt;SimulationContainers&gt;**](SimulationContainers.md) | the list of init containers |  [optional] [readonly]
**mainContainer** | [**SimulationContainers**](SimulationContainers.md) |  |  [optional]



