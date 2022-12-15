

# Workspace

a Workspace

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | the Workspace version unique identifier |  [optional] [readonly]
**key** | **String** | technical key for resource name convention and version grouping. Must be unique | 
**name** | **String** | the Workspace name | 
**description** | **String** | the Workspace description |  [optional]
**version** | **String** | the Workspace version MAJOR.MINOR.PATCH. |  [optional]
**tags** | **List&lt;String&gt;** | the list of tags |  [optional]
**ownerId** | **String** | the user id which own this workspace |  [optional] [readonly]
**solution** | [**WorkspaceSolution**](WorkspaceSolution.md) |  | 
**users** | [**List&lt;WorkspaceUser&gt;**](WorkspaceUser.md) | the list of users Id with their role |  [optional]
**webApp** | [**WorkspaceWebApp**](WorkspaceWebApp.md) |  |  [optional]
**sendInputToDataWarehouse** | **Boolean** | default setting for all Scenarios and Run Templates to set whether or not the Dataset values and the input parameters values are send to the DataWarehouse prior to the ScenarioRun |  [optional]
**useDedicatedEventHubNamespace** | **Boolean** | Set this property to true to use a dedicated Azure Event Hub Namespace for this Workspace. The Event Hub Namespace must be named \\&#39;&lt;organization_id\\&gt;-&lt;workspace_id\\&gt;\\&#39; (in lower case). This Namespace must also contain two Event Hubs named \\&#39;probesmeasures\\&#39; and \\&#39;scenariorun\\&#39;. |  [optional]
**dedicatedEventHubSasKeyName** | **String** | the Dedicated Event Hub SAS key name, default to RootManageSharedAccessKey. Use the /secret endpoint to set the key value |  [optional]
**dedicatedEventHubAuthenticationStrategy** | **String** | the Event Hub authentication strategy, SHARED_ACCESS_POLICY or TENANT_CLIENT_CREDENTIALS. Default to the one defined for the tenant. |  [optional]
**sendScenarioRunToEventHub** | **Boolean** | default setting for all Scenarios and Run Templates to set whether or not the ScenarioRun is send to the Event Hub |  [optional]
**sendScenarioMetadataToEventHub** | **Boolean** | Set this property to false to not send scenario metada to Azure Event Hub Namespace for this Workspace. The Event Hub Namespace must be named \\&#39;&lt;organization_id\\&gt;-&lt;workspace_id\\&gt;\\&#39; (in lower case). This Namespace must also contain two Event Hubs named \\&#39;scenariometadata\\&#39; and \\&#39;scenariorunmetadata\\&#39;. |  [optional]



