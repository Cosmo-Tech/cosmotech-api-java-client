

# Connector

a version of a Connector

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | the Connector version unique identifier |  [optional] [readonly] |
|**key** | **String** | the Connector key which group Connector versions |  [optional] |
|**name** | **String** | the Connector name |  [optional] |
|**description** | **String** | the Connector description |  [optional] |
|**repository** | **String** | the registry repository containing the image |  [optional] |
|**version** | **String** | the Connector version MAJOR.MINOR.PATCH. Must be aligned with an existing repository tag |  [optional] |
|**tags** | **List&lt;String&gt;** | the list of tags |  [optional] |
|**ownerId** | **String** | the user id which own this connector version |  [optional] [readonly] |
|**url** | **String** | an optional URL link to connector page |  [optional] |
|**azureManagedIdentity** | **Boolean** | whether or not the connector uses Azure Managed Identity |  [optional] |
|**azureAuthenticationWithCustomerAppRegistration** | **Boolean** | whether to authenticate against Azure using the app registration credentials provided by the customer |  [optional] |
|**ioTypes** | **List&lt;IoTypesEnum&gt;** |  |  [optional] |
|**parameterGroups** | [**List&lt;ConnectorParameterGroup&gt;**](ConnectorParameterGroup.md) | the list of connector parameters groups |  [optional] |



