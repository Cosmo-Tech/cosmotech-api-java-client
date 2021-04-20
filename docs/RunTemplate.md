

# RunTemplate

a Solution Run Template

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | the Solution Run Template id | 
**name** | **String** | the Run Template name | 
**description** | **String** | the Run Template description |  [optional]
**useDirectCsmSimulator** | **Boolean** | whether or not the Run Template use the main standard csmSimulator directly. False if there is an Engine set |  [optional] [readonly]
**csmSimulation** | **String** | the Cosmo Tech simulation name. This information is send to the Engine. Mandatory information if no Engine is defined |  [optional]
**tags** | **List&lt;String&gt;** | the list of Run Template tags |  [optional]
**computeSize** | **String** | the compute size needed for this Run Template. Standard sizes are basic and highcpu. Default is basic |  [optional]
**parametersHandlerResource** | [**RunTemplateResourceStorage**](RunTemplateResourceStorage.md) |  |  [optional]
**datasetValidatorResource** | [**RunTemplateResourceStorage**](RunTemplateResourceStorage.md) |  |  [optional]
**engineResource** | [**RunTemplateResourceStorage**](RunTemplateResourceStorage.md) |  |  [optional]
**datasetSchemaResource** | [**RunTemplateResourceStorage**](RunTemplateResourceStorage.md) |  |  [optional]
**parameterGroups** | [**List&lt;RunTemplateParameterGroup&gt;**](RunTemplateParameterGroup.md) | the list of parameters groups for the Run Template |  [optional]



