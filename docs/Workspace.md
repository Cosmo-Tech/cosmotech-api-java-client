

# Workspace

a Workspace

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | the Workspace version unique identifier |  [optional] [readonly]
**name** | **String** | the Workspace name | 
**description** | **String** | the Workspace description |  [optional]
**version** | **String** | the Workspace version MAJOR.MINOR.PATCH. |  [optional]
**tags** | **List&lt;String&gt;** | the list of tags |  [optional]
**ownerId** | **String** | the user id which own this workspace |  [optional] [readonly]
**simulator** | [**WorkspaceSimulator**](WorkspaceSimulator.md) |  | 
**userList** | [**List&lt;WorkspaceUser&gt;**](WorkspaceUser.md) | the list of users Id with their role |  [optional]
**webApp** | [**WorkspaceWebApp**](WorkspaceWebApp.md) |  |  [optional]
**resources** | **Map&lt;String, Object&gt;** | a list of resources for the Workspace with resourceName/resourceUrl |  [optional] [readonly]



