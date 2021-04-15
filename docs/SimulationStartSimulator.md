

# SimulationStartSimulator

the parameters to run directly a Simulator

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**simulatorId** | **String** | the Simulator Id |  [optional]
**simulatorAnalysisId** | **String** | the Simulator Analysis id |  [optional]
**datasetList** | **List&lt;String&gt;** | the list of Dataset Id associated to this Analysis |  [optional]
**parametersValues** | [**List&lt;SimulationAnalysisParameterValue&gt;**](SimulationAnalysisParameterValue.md) | the list of Simulator Analysis parameters values |  [optional]
**sendInputToDataWarehouse** | **Boolean** | whether or not the Dataset values and the input parameters values are send to the DataWarehouse prior to Simulation Run |  [optional]
**dataWarehouseDB** | **String** | the DataWarehouse database name to send data if sendInputToDataWarehouse is set |  [optional]
**resultsEventBusResourceUri** | **String** | the event bus which receive Workspace Simulation results messages. Message won&#39;t be send if this is not set |  [optional]
**simulationEventBusResourceUri** | **String** | the event bus which receive Workspace Simulation events messages. Message won&#39;t be send if this is not set |  [optional]



