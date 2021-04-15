

# Scenario


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | the Scenario unique identifier |  [optional] [readonly]
**name** | **String** | the Scenario name | 
**description** | **String** | the Scenario description |  [optional]
**tags** | **List&lt;String&gt;** | the list of tags |  [optional]
**parentId** | **String** | the Scenario parent id |  [optional]
**ownerId** | **String** | the user id which own this Scenario |  [optional] [readonly]
**simulatorId** | **String** | the Simulator Id associated with this Scenario |  [optional] [readonly]
**users** | [**List&lt;ScenarioUser&gt;**](ScenarioUser.md) | the list of users Id with their role |  [optional]
**simulatorName** | **String** |  |  [optional]
**simulatorAnalysisName** | **String** |  |  [optional]
**analysis** | [**ScenarioAnalysis**](ScenarioAnalysis.md) |  |  [optional]
**sendInputToDataWarehouse** | **Boolean** | default setting for all Analysis to set whether or not the Dataset values and the input parameters values are send to the DataWarehouse prior to Simulation Run |  [optional]



