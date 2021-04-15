

# OrganizationUser

a User

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | the User unique identifier, in response |  [optional] [readonly]
**name** | **String** | the User name | 
**organizationId** | **String** | the Organization Id context |  [optional] [readonly]
**roles** | [**List&lt;RolesEnum&gt;**](#List&lt;RolesEnum&gt;) | the User&#39;s roles for the Organization | 



## Enum: List&lt;RolesEnum&gt;

Name | Value
---- | -----
ADMIN | &quot;Admin&quot;
USER | &quot;User&quot;
VIEWER | &quot;Viewer&quot;
DEVELOPER | &quot;Developer&quot;



