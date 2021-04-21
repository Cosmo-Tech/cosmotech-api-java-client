

# Scenario

a Scenario with base information

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | the Scenario unique identifier |  [optional] [readonly]
**name** | **String** | the Scenario name | 
**description** | **String** | the Scenario description |  [optional]
**tags** | **List&lt;String&gt;** | the list of tags |  [optional]
**parentId** | **String** | the Scenario parent id |  [optional]
**ownerId** | **String** | the user id which own this Scenario |  [optional] [readonly]
**solutionId** | **String** | the Solution Id associated with this Scenario |  [optional] [readonly]
**runTemplateId** | **String** | the Solution Run Template Id associated with this Scenario |  [optional]
**users** | [**List&lt;ScenarioUser&gt;**](ScenarioUser.md) | the list of users Id with their role |  [optional]
**state** | [**StateEnum**](#StateEnum) | the Scenario state |  [optional] [readonly]
**creationDate** | **String** | the Scenario creation date |  [optional] [readonly]
**ownerName** | **String** | the name of the owner |  [optional] [readonly]
**solutionName** | **String** | the Solution name |  [optional] [readonly]
**runTemplateName** | **String** | the Solution Run Template name associated with this Scenario |  [optional] [readonly]
**datasetList** | **List&lt;String&gt;** | the list of Dataset Id associated to this Scenario Run Template |  [optional]
**parametersValues** | [**List&lt;ScenarioRunTemplateParameterValue&gt;**](ScenarioRunTemplateParameterValue.md) | the list of Solution Run Template parameters values |  [optional]



## Enum: StateEnum

Name | Value
---- | -----
CREATED | &quot;Created&quot;
RUNNING | &quot;Running&quot;
SUCCESSFUL | &quot;Successful&quot;
FAILED | &quot;Failed&quot;



