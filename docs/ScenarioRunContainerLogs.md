

# ScenarioRunContainerLogs

logs for a given container

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**containerId** | **String** | container ID for log source as seen by Docker engine |  [optional] [readonly]
**computer** | **String** | computer/node that&#39;s generating the log |  [optional] [readonly]
**logs** | [**List&lt;ScenarioRunContainerLog&gt;**](ScenarioRunContainerLog.md) | the list of container logs in structured format |  [optional] [readonly]
**textLog** | **String** | the plain text log if plainText option has been set |  [optional]



