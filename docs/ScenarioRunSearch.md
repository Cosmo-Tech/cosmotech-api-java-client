

# ScenarioRunSearch

the search options

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**solutionId** | **String** | the Solution Id to search |  [optional]
**runTemplateId** | **String** | the Solution Analysis Id to search |  [optional]
**workspaceId** | **String** | the Workspace Id to search |  [optional]
**scenarioId** | **String** | the Scenario Id to search |  [optional]
**state** | [**StateEnum**](#StateEnum) | the state to search |  [optional]
**jobId** | **String** | the Cosmo Tech compute cluster Job Id to search |  [optional]
**ownerId** | **String** | the owner Id to search |  [optional]



## Enum: StateEnum

Name | Value
---- | -----
FETCHINGDATASETS | &quot;FetchingDatasets&quot;
FETCHINGSCENARIOPARAMETERS | &quot;FetchingScenarioParameters&quot;
APPLYINGSCENARIOPARAMETERS | &quot;ApplyingScenarioParameters&quot;
VALIDATINGSCENARIODATA | &quot;ValidatingScenarioData&quot;
SENDINGSCENARIODATATODATAWAREHOUSE | &quot;SendingScenarioDataToDataWarehouse&quot;
PRERUN | &quot;PreRun&quot;
RUNNING | &quot;Running&quot;
POSTRUN | &quot;PostRun&quot;
SUCCESS | &quot;Success&quot;
FAILED | &quot;Failed&quot;



