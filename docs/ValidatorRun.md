

# ValidatorRun

a Validator Run

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | the Validator Run id |  [optional] [readonly] |
|**validatorId** | **String** | the Validator id |  [optional] [readonly] |
|**validatorName** | **String** | the validator name |  [optional] [readonly] |
|**datasetId** | **String** | the Dataset id to run the validator on |  |
|**datasetName** | **String** | the Dataset name |  [optional] [readonly] |
|**state** | [**StateEnum**](#StateEnum) | the Validator Run state |  [optional] [readonly] |
|**containerId** | **String** | the Validator Run container id |  [optional] [readonly] |
|**logs** | **String** | the Validator Run logs |  [optional] [readonly] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| RUNNING | &quot;Running&quot; |
| FINISHED | &quot;Finished&quot; |
| ONERROR | &quot;OnError&quot; |



