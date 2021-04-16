

# PlatformServices

the list of Platform services

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**provider** | [**ProviderEnum**](#ProviderEnum) | the Cloud Provider for the services | 
**credentials** | **Map&lt;String, Object&gt;** | a freeform credentials object for the Platform. Structure depends on cloud provider |  [optional]
**storage** | [**PlatformService**](PlatformService.md) |  |  [optional]
**coreContainerRegistry** | [**PlatformService**](PlatformService.md) |  |  [optional]
**simulatorsContainerRegistry** | [**PlatformService**](PlatformService.md) |  |  [optional]
**eventBusCluster** | [**PlatformService**](PlatformService.md) |  |  [optional]
**dataWarehouseCluster** | [**PlatformService**](PlatformService.md) |  |  [optional]
**databaseCluster** | [**PlatformService**](PlatformService.md) |  |  [optional]
**keyVault** | [**PlatformService**](PlatformService.md) |  |  [optional]
**kubernetesCluster** | [**PlatformService**](PlatformService.md) |  |  [optional]
**directory** | [**PlatformService**](PlatformService.md) |  |  [optional]
**monitoring** | [**PlatformService**](PlatformService.md) |  |  [optional]
**analytic** | [**PlatformService**](PlatformService.md) |  |  [optional]



## Enum: ProviderEnum

Name | Value
---- | -----
AZURE | &quot;Azure&quot;



