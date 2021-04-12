

# ScenarioAllOf

a Scenario with detailed information

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**simulatorId** | **String** | the Simulator Id associated with this Scenario |  [optional] [readonly]
**analyses** | [**List&lt;ScenarioAnalysis&gt;**](ScenarioAnalysis.md) | the configuration for next Analysis |  [optional]
**successfulAnalyses** | [**List&lt;ScenarioSuccessfulAnalysis&gt;**](ScenarioSuccessfulAnalysis.md) | the configuration and information for last successful Analyses Runs |  [optional] [readonly]
**failedAnalyses** | [**List&lt;ScenarioFailedAnalysis&gt;**](ScenarioFailedAnalysis.md) | the configuration and information for last failed Analyses Runs |  [optional] [readonly]
**runningAnalyses** | [**List&lt;ScenarioRunningAnalysis&gt;**](ScenarioRunningAnalysis.md) | the configuration and information for currently running Analyses Runs |  [optional] [readonly]



