

# WorkspaceUserDetails


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | the User id | 
**name** | **String** | the User name |  [optional] [readonly]
**role** | [**RoleEnum**](#RoleEnum) | the User role | 
**organizationId** | **String** | the Organization Id context |  [optional] [readonly]
**organizationRoles** | **List&lt;String&gt;** | the Organizations roles for the User |  [optional] [readonly]
**workspaceId** | **String** | the Workspace Id context |  [optional] [readonly]



## Enum: RoleEnum

Name | Value
---- | -----
ADMIN | &quot;Admin&quot;
USER | &quot;User&quot;
VIEWER | &quot;Viewer&quot;



