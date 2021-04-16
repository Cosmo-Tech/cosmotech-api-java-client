

# WorkspaceUserDetails


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | the User id | 
**name** | **String** | the User name |  [optional] [readonly]
**roles** | [**List&lt;RolesEnum&gt;**](#List&lt;RolesEnum&gt;) | the User roles | 
**organizationId** | **String** | the Organization Id context |  [optional] [readonly]
**organizationRoles** | **List&lt;String&gt;** | the Organizations roles for the User |  [optional] [readonly]
**workspaceId** | **String** | the Workspace Id context |  [optional] [readonly]



## Enum: List&lt;RolesEnum&gt;

Name | Value
---- | -----
ADMIN | &quot;Admin&quot;
USER | &quot;User&quot;
VIEWER | &quot;Viewer&quot;



