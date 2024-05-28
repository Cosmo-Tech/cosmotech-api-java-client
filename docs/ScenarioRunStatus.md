

# ScenarioRunStatus

a ScenarioRun status

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | the ScenarioRun id |  [optional] |
|**organizationId** | **String** | the ScenarioRun id |  [optional] |
|**workflowId** | **String** | the Cosmo Tech compute cluster Argo Workflow Id to search |  [optional] |
|**workflowName** | **String** | the Cosmo Tech compute cluster Argo Workflow Name |  [optional] |
|**startTime** | **String** | the ScenarioRun start Date Time |  [optional] |
|**endTime** | **String** | the ScenarioRun end Date Time |  [optional] |
|**phase** | **String** | high-level summary of where the workflow is in its lifecycle |  [optional] |
|**progress** | **String** | progress to completion |  [optional] |
|**message** | **String** | a  human readable message indicating details about why the workflow is in this condition |  [optional] |
|**estimatedDuration** | **Integer** | estimatedDuration in seconds |  [optional] |
|**nodes** | [**List&lt;ScenarioRunStatusNode&gt;**](ScenarioRunStatusNode.md) | status of ScenarioRun nodes |  [optional] |
|**state** | **ScenarioRunState** |  |  [optional] |



