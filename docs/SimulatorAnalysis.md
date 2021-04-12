

# SimulatorAnalysis

a Simulator Analysis run template

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | the Simulator Analysis id | 
**name** | **String** | the Simulator Analysis name | 
**description** | **String** | the Simulator Analysis description |  [optional]
**simulation** | **String** | the simulation name | 
**tags** | **List&lt;String&gt;** | the list of Simulator Analysis tags |  [optional]
**computeSize** | **String** | the compute size needed for this Analysis. Standard sizes are basic and highcpu. Default is basic |  [optional]
**parametersHandlerResource** | [**AnalysisResourceStorage**](AnalysisResourceStorage.md) |  |  [optional]
**datasetValidatorResource** | [**AnalysisResourceStorage**](AnalysisResourceStorage.md) |  |  [optional]
**customDriverResource** | [**AnalysisResourceStorage**](AnalysisResourceStorage.md) |  |  [optional]
**parameterGroups** | [**List&lt;AnalysisParameterGroup&gt;**](AnalysisParameterGroup.md) | the list of parameters groups for the Analysis |  [optional]



