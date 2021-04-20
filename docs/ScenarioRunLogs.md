

# ScenarioRunLogs

the scenariorun logs returned by all containers

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scenariorunId** | **String** | the ScenarioRun Id |  [optional] [readonly]
**options** | [**ScenarioRunLogsOptions**](ScenarioRunLogsOptions.md) |  |  [optional]
**initLogs** | [**List&lt;ScenarioRunContainerLogs&gt;**](ScenarioRunContainerLogs.md) | the list of scenariorun logs for init containers |  [optional] [readonly]
**mainLogs** | [**ScenarioRunContainerLogs**](ScenarioRunContainerLogs.md) |  |  [optional]



