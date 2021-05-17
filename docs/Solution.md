

# Solution

a version of a Solution

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | the Solution version unique identifier |  [optional] [readonly]
**key** | **String** | the Solution key which group Solution versions | 
**name** | **String** | the Solution name | 
**description** | **String** | the Solution description |  [optional]
**repository** | **String** | the registry repository containing the image | 
**csmSimulator** | **String** | the main Cosmo Tech simulator name used in standard Run Template |  [optional]
**version** | **String** | the Solution version MAJOR.MINOR.PATCH. Must be aligned with an existing repository tag | 
**ownerId** | **String** | the User id which own this Solution |  [optional] [readonly]
**url** | **String** | an optional URL link to solution page |  [optional]
**tags** | **List&lt;String&gt;** | the list of tags |  [optional]
**parameters** | [**List&lt;RunTemplateParameter&gt;**](RunTemplateParameter.md) | the list of Run Template Parameters |  [optional]
**parameterGroups** | [**List&lt;RunTemplateParameterGroup&gt;**](RunTemplateParameterGroup.md) | the list of parameters groups for the Run Templates |  [optional]
**runTemplates** | [**List&lt;RunTemplate&gt;**](RunTemplate.md) | list of Run Template | 



