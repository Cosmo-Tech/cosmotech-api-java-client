

# ScenarioRunLogs

the scenariorun logs returned by all containers

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scenariorunId** | **String** | the ScenarioRun Id |  [optional] [readonly]
**options** | [**ScenarioRunLogsOptions**](ScenarioRunLogsOptions.md) |  |  [optional]
**fetchDatasetLogs** | [**List&lt;ScenarioRunContainerLogs&gt;**](ScenarioRunContainerLogs.md) | logs for the containers which fetch the Scenario Datasets |  [optional] [readonly]
**fetchScenarioParametersLog** | [**ScenarioRunContainerLogs**](ScenarioRunContainerLogs.md) |  |  [optional]
**applyParametersLogs** | [**ScenarioRunContainerLogs**](ScenarioRunContainerLogs.md) |  |  [optional]
**validateDataLogs** | [**ScenarioRunContainerLogs**](ScenarioRunContainerLogs.md) |  |  [optional]
**sendDataWarehouseLogs** | [**ScenarioRunContainerLogs**](ScenarioRunContainerLogs.md) |  |  [optional]
**preRunLogs** | [**ScenarioRunContainerLogs**](ScenarioRunContainerLogs.md) |  |  [optional]
**runLogs** | [**ScenarioRunContainerLogs**](ScenarioRunContainerLogs.md) |  |  [optional]
**postRunLogs** | [**ScenarioRunContainerLogs**](ScenarioRunContainerLogs.md) |  |  [optional]



