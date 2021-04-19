

# RunTemplateResourceStorage


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**storageType** | [**StorageTypeEnum**](#StorageTypeEnum) | the storage type. Use ${CSM_PROJECT_PATH} or ${CSM_STORAGE_SIMULATOR} behind the scene | 
**resourcePath** | **String** | the resource path | 
**customUri** | **String** | a custom Uri to provide the resource in resourcePath |  [optional]



## Enum: StorageTypeEnum

Name | Value
---- | -----
LOCAL | &quot;local&quot;
CLOUD | &quot;cloud&quot;
CUSTOMURI | &quot;customUri&quot;



