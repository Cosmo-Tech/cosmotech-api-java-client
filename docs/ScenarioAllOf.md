

# ScenarioAllOf

a Scenario with detailed information

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**solutionName** | **String** | the Solution name |  [optional] [readonly]
**runTemplateName** | **String** | the Solution Run Template name associated with this Scenario |  [optional] [readonly]
**datasetList** | **List&lt;String&gt;** | the list of Dataset Id associated to this Scenario Run Template |  [optional]
**parametersValues** | [**List&lt;ScenarioRunTemplateParameterValue&gt;**](ScenarioRunTemplateParameterValue.md) | the list of Solution Run Template parameters values |  [optional]
**sendInputToDataWarehouse** | **Boolean** | whether or not the Dataset values and the input parameters values are send to the DataWarehouse prior to Simulation Run |  [optional]



