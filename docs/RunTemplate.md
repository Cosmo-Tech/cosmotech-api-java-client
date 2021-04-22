

# RunTemplate

a Solution Run Template

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | the Solution Run Template id | 
**name** | **String** | the Run Template name | 
**description** | **String** | the Run Template description |  [optional]
**csmSimulation** | **String** | the Cosmo Tech simulation name. This information is send to the Engine. Mandatory information if no Engine is defined |  [optional]
**tags** | **List&lt;String&gt;** | the list of Run Template tags |  [optional]
**computeSize** | **String** | the compute size needed for this Run Template. Standard sizes are basic and highcpu. Default is basic |  [optional]
**parametersHandlerResource** | [**RunTemplateResourceStorage**](RunTemplateResourceStorage.md) |  |  [optional]
**datasetValidatorResource** | [**RunTemplateResourceStorage**](RunTemplateResourceStorage.md) |  |  [optional]
**preRunResource** | [**RunTemplateResourceStorage**](RunTemplateResourceStorage.md) |  |  [optional]
**engineResource** | [**RunTemplateResourceStorage**](RunTemplateResourceStorage.md) |  |  [optional]
**postRunResource** | [**RunTemplateResourceStorage**](RunTemplateResourceStorage.md) |  |  [optional]
**sendDatasetsToDataWarehouse** | **Boolean** | whether or not the Datasets values are send to the DataWarehouse prior to Simulation Run |  [optional]
**sendInputParametersToDataWarehouse** | **Boolean** | whether or not the input parameters values are send to the DataWarehouse prior to Simulation Run |  [optional]
**parameterGroups** | **List&lt;String&gt;** | the ordered list of parameters groups for the Run Template |  [optional]



