

# SimulationStartSolution

the parameters to run directly a Solution

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**solutionId** | **String** | the Solution Id |  [optional]
**runTemplateId** | **String** | the Solution Run Template id |  [optional]
**datasetList** | **List&lt;String&gt;** | the list of Dataset Id associated to this Analysis |  [optional]
**parametersValues** | [**List&lt;RunTemplateParameterValue&gt;**](RunTemplateParameterValue.md) | the list of Solution Run Template parameters values |  [optional]
**sendInputToDataWarehouse** | **Boolean** | whether or not the Dataset values and the input parameters values are send to the DataWarehouse prior to Simulation Run |  [optional]
**dataWarehouseDB** | **String** | the DataWarehouse database name to send data if sendInputToDataWarehouse is set |  [optional]
**resultsEventBusResourceUri** | **String** | the event bus which receive Workspace Simulation results messages. Message won&#39;t be send if this is not set |  [optional]
**simulationEventBusResourceUri** | **String** | the event bus which receive Workspace Simulation events messages. Message won&#39;t be send if this is not set |  [optional]



