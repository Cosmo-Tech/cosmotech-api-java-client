

# Dataset

a Dataset

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | the Dataset unique identifier |  [optional] [readonly]
**name** | **String** | the Dataset name |  [optional]
**description** | **String** | the Dataset description |  [optional]
**ownerId** | **String** | the User id which own this Dataset |  [optional] [readonly]
**organizationId** | **String** | the Organization Id related to this Dataset |  [optional] [readonly]
**parentId** | **String** | the Dataset id which is the parent of this Dataset |  [optional]
**twingraphId** | **String** | the twin graph id |  [optional]
**main** | **Boolean** | is this the main dataset |  [optional]
**creationDate** | **Long** | the Dataset creation date |  [optional] [readonly]
**refreshDate** | **Long** | the last time a refresh was done |  [optional] [readonly]
**sourceType** | **DatasetSourceType** |  |  [optional]
**source** | [**SourceInfo**](SourceInfo.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | the Dataset status |  [optional]
**queries** | **List&lt;String&gt;** | the list of queries |  [optional]
**tags** | **List&lt;String&gt;** | the list of tags |  [optional]
**connector** | [**DatasetConnector**](DatasetConnector.md) |  |  [optional]
**fragmentsIds** | **List&lt;String&gt;** | the list of other Datasets ids to compose as fragments |  [optional]
**validatorId** | **String** | the validator id |  [optional]
**compatibility** | [**List&lt;DatasetCompatibility&gt;**](DatasetCompatibility.md) | the list of compatible Solutions versions |  [optional]
**security** | [**DatasetSecurity**](DatasetSecurity.md) |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
DRAFT | &quot;DRAFT&quot;
PENDING | &quot;PENDING&quot;
ERROR | &quot;ERROR&quot;
READY | &quot;READY&quot;



