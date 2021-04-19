

# ScenarioBase

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



