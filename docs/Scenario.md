

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
**userList** | [**List&lt;ScenarioUser&gt;**](ScenarioUser.md) | the list of users Id with their role |  [optional]
**simulatorId** | **String** | the Simulator Id associated with this Scenario |  [optional] [readonly]
**analyses** | [**List&lt;ScenarioAnalysis&gt;**](ScenarioAnalysis.md) | the configuration for next Analysis |  [optional]
**successfulAnalyses** | [**List&lt;ScenarioSuccessfulAnalysis&gt;**](ScenarioSuccessfulAnalysis.md) | the configuration and information for last successful Analyses Runs |  [optional] [readonly]
**failedAnalyses** | [**List&lt;ScenarioFailedAnalysis&gt;**](ScenarioFailedAnalysis.md) | the configuration and information for last failed Analyses Runs |  [optional] [readonly]
**runningAnalyses** | [**List&lt;ScenarioRunningAnalysis&gt;**](ScenarioRunningAnalysis.md) | the configuration and information for currently running Analyses Runs |  [optional] [readonly]



