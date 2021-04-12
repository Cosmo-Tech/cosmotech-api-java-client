

# Simulator

a version of a Simulator

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | the Simulator version unique identifier |  [optional] [readonly]
**simulatorKey** | **String** | the Simulator key which group Simulator versions | 
**name** | **String** | the Simulator name | 
**description** | **String** | the Simulator description |  [optional]
**repository** | **String** | the registry repository containing the image | 
**version** | **String** | the Simulator version MAJOR.MINOR.PATCH. Must be aligned with an existing repository tag | 
**ownerId** | **String** | the User id which own this Simulator |  [optional] [readonly]
**url** | **String** | an optional URL link to simulator page |  [optional]
**tags** | **List&lt;String&gt;** | the list of tags |  [optional]
**analysis** | [**List&lt;SimulatorAnalysis&gt;**](SimulatorAnalysis.md) | list of Simulator Analysis |  [optional]



