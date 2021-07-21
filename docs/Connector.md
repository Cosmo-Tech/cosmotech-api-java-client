

# Connector

a version of a Connector

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | the Connector version unique identifier |  [optional] [readonly]
**key** | **String** | the Connector key which group Connector versions | 
**name** | **String** | the Connector name | 
**description** | **String** | the Connector description |  [optional]
**repository** | **String** | the registry repository containing the image | 
**version** | **String** | the Connector version MAJOR.MINOR.PATCH. Must be aligned with an existing repository tag | 
**tags** | **List&lt;String&gt;** | the list of tags |  [optional]
**ownerId** | **String** | the user id which own this connector version |  [optional] [readonly]
**url** | **String** | an optional URL link to connector page |  [optional]
**azureManagedIdentity** | **Boolean** | whether or not the connector uses Azure Managed Identity |  [optional]
**azureAuthenticationWithCustomerAppRegistration** | **Boolean** | whether to authenticate against Azure using the app registration credentials provided by the customer |  [optional]
**ioTypes** | [**List&lt;IoTypesEnum&gt;**](#List&lt;IoTypesEnum&gt;) |  | 
**parameterGroups** | [**List&lt;ConnectorParameterGroup&gt;**](ConnectorParameterGroup.md) | the list of connector parameters groups |  [optional]



## Enum: List&lt;IoTypesEnum&gt;

Name | Value
---- | -----
READ | &quot;read&quot;
WRITE | &quot;write&quot;



