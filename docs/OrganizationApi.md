# OrganizationApi

All URIs are relative to *https://dev.api.cosmotech.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOrganizationAccessControl**](OrganizationApi.md#addOrganizationAccessControl) | **POST** /organizations/{organization_id}/security/access | add a control acccess to the Organization
[**findAllOrganizations**](OrganizationApi.md#findAllOrganizations) | **GET** /organizations | List all Organizations
[**findOrganizationById**](OrganizationApi.md#findOrganizationById) | **GET** /organizations/{organization_id} | Get the details of an Organization
[**getAllPermissions**](OrganizationApi.md#getAllPermissions) | **GET** /organizations/permissions | Get all permissions per components
[**getOrganizationAccessControl**](OrganizationApi.md#getOrganizationAccessControl) | **GET** /organizations/{organization_id}/security/access/{identity_id} | get a control acccess for the Organization
[**getOrganizationPermissions**](OrganizationApi.md#getOrganizationPermissions) | **GET** /organizations/{organization_id}/permissions/{role} | Get the Organization permissions by given role
[**getOrganizationSecurity**](OrganizationApi.md#getOrganizationSecurity) | **GET** /organizations/{organization_id}/security | Get the Organization security information
[**getOrganizationSecurityUsers**](OrganizationApi.md#getOrganizationSecurityUsers) | **GET** /organizations/{organization_id}/security/users | Get the Organization security users list
[**registerOrganization**](OrganizationApi.md#registerOrganization) | **POST** /organizations | Register a new organization
[**removeOrganizationAccessControl**](OrganizationApi.md#removeOrganizationAccessControl) | **DELETE** /organizations/{organization_id}/security/access/{identity_id} | Remove the specified access from the given Organization
[**setOrganizationDefaultSecurity**](OrganizationApi.md#setOrganizationDefaultSecurity) | **POST** /organizations/{organization_id}/security/default | set the Organization default security
[**unregisterOrganization**](OrganizationApi.md#unregisterOrganization) | **DELETE** /organizations/{organization_id} | Unregister an organization
[**updateOrganization**](OrganizationApi.md#updateOrganization) | **PATCH** /organizations/{organization_id} | Update an Organization
[**updateSolutionsContainerRegistryByOrganizationId**](OrganizationApi.md#updateSolutionsContainerRegistryByOrganizationId) | **PATCH** /organizations/{organization_id}/services/solutionsContainerRegistry | Update the solutions container registry configuration for the Organization specified
[**updateStorageByOrganizationId**](OrganizationApi.md#updateStorageByOrganizationId) | **PATCH** /organizations/{organization_id}/services/storage | Update storage configuration for the Organization specified
[**updateTenantCredentialsByOrganizationId**](OrganizationApi.md#updateTenantCredentialsByOrganizationId) | **PATCH** /organizations/{organization_id}/services/tenantCredentials | Update tenant credentials for the Organization specified


<a name="addOrganizationAccessControl"></a>
# **addOrganizationAccessControl**
> OrganizationAccessControl addOrganizationAccessControl(organizationId, organizationAccessControl)

add a control acccess to the Organization

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.OrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    OrganizationApi apiInstance = new OrganizationApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    OrganizationAccessControl organizationAccessControl = new OrganizationAccessControl(); // OrganizationAccessControl | the new Organization security access to add.
    try {
      OrganizationAccessControl result = apiInstance.addOrganizationAccessControl(organizationId, organizationAccessControl);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#addOrganizationAccessControl");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| the Organization identifier |
 **organizationAccessControl** | [**OrganizationAccessControl**](OrganizationAccessControl.md)| the new Organization security access to add. |

### Return type

[**OrganizationAccessControl**](OrganizationAccessControl.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | The Organization access |  -  |
**404** | the Organization specified is unknown or you don&#39;t have access to it |  -  |

<a name="findAllOrganizations"></a>
# **findAllOrganizations**
> List&lt;Organization&gt; findAllOrganizations()

List all Organizations

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.OrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    OrganizationApi apiInstance = new OrganizationApi(defaultClient);
    try {
      List<Organization> result = apiInstance.findAllOrganizations();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#findAllOrganizations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Organization&gt;**](Organization.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the list of Organizations |  -  |

<a name="findOrganizationById"></a>
# **findOrganizationById**
> Organization findOrganizationById(organizationId)

Get the details of an Organization

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.OrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    OrganizationApi apiInstance = new OrganizationApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    try {
      Organization result = apiInstance.findOrganizationById(organizationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#findOrganizationById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| the Organization identifier |

### Return type

[**Organization**](Organization.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the Organization details |  -  |
**404** | the Organization specified is unknown or you don&#39;t have access to it |  -  |

<a name="getAllPermissions"></a>
# **getAllPermissions**
> List&lt;ComponentRolePermissions&gt; getAllPermissions()

Get all permissions per components

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.OrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    OrganizationApi apiInstance = new OrganizationApi(defaultClient);
    try {
      List<ComponentRolePermissions> result = apiInstance.getAllPermissions();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#getAllPermissions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ComponentRolePermissions&gt;**](ComponentRolePermissions.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The Scenarios security permission list |  -  |

<a name="getOrganizationAccessControl"></a>
# **getOrganizationAccessControl**
> OrganizationAccessControl getOrganizationAccessControl(organizationId, identityId)

get a control acccess for the Organization

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.OrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    OrganizationApi apiInstance = new OrganizationApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String identityId = "identityId_example"; // String | the User identifier
    try {
      OrganizationAccessControl result = apiInstance.getOrganizationAccessControl(organizationId, identityId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#getOrganizationAccessControl");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| the Organization identifier |
 **identityId** | **String**| the User identifier |

### Return type

[**OrganizationAccessControl**](OrganizationAccessControl.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The Organization access |  -  |
**404** | the Organization or user specified is unknown or you don&#39;t have access to it |  -  |

<a name="getOrganizationPermissions"></a>
# **getOrganizationPermissions**
> List&lt;String&gt; getOrganizationPermissions(organizationId, role)

Get the Organization permissions by given role

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.OrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    OrganizationApi apiInstance = new OrganizationApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String role = "role_example"; // String | the Role
    try {
      List<String> result = apiInstance.getOrganizationPermissions(organizationId, role);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#getOrganizationPermissions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| the Organization identifier |
 **role** | **String**| the Role |

### Return type

**List&lt;String&gt;**

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The Organization security permission list |  -  |

<a name="getOrganizationSecurity"></a>
# **getOrganizationSecurity**
> OrganizationSecurity getOrganizationSecurity(organizationId)

Get the Organization security information

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.OrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    OrganizationApi apiInstance = new OrganizationApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    try {
      OrganizationSecurity result = apiInstance.getOrganizationSecurity(organizationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#getOrganizationSecurity");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| the Organization identifier |

### Return type

[**OrganizationSecurity**](OrganizationSecurity.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The Organization security |  -  |
**404** | the Organization specified is unknown or you don&#39;t have access to it |  -  |

<a name="getOrganizationSecurityUsers"></a>
# **getOrganizationSecurityUsers**
> List&lt;String&gt; getOrganizationSecurityUsers(organizationId)

Get the Organization security users list

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.OrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    OrganizationApi apiInstance = new OrganizationApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    try {
      List<String> result = apiInstance.getOrganizationSecurityUsers(organizationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#getOrganizationSecurityUsers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| the Organization identifier |

### Return type

**List&lt;String&gt;**

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The Organization security users list |  -  |
**404** | the Organization specified is unknown or you don&#39;t have access to it |  -  |

<a name="registerOrganization"></a>
# **registerOrganization**
> Organization registerOrganization(organization)

Register a new organization

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.OrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    OrganizationApi apiInstance = new OrganizationApi(defaultClient);
    Organization organization = new Organization(); // Organization | the Organization to register
    try {
      Organization result = apiInstance.registerOrganization(organization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#registerOrganization");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | [**Organization**](Organization.md)| the Organization to register |

### Return type

[**Organization**](Organization.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | the Organization details |  -  |
**400** | Bad request |  -  |

<a name="removeOrganizationAccessControl"></a>
# **removeOrganizationAccessControl**
> removeOrganizationAccessControl(organizationId, identityId)

Remove the specified access from the given Organization

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.OrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    OrganizationApi apiInstance = new OrganizationApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String identityId = "identityId_example"; // String | the User identifier
    try {
      apiInstance.removeOrganizationAccessControl(organizationId, identityId);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#removeOrganizationAccessControl");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| the Organization identifier |
 **identityId** | **String**| the User identifier |

### Return type

null (empty response body)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Request succeeded |  -  |
**404** | the Organization or the user specified is unknown or you don&#39;t have access to them |  -  |

<a name="setOrganizationDefaultSecurity"></a>
# **setOrganizationDefaultSecurity**
> OrganizationSecurity setOrganizationDefaultSecurity(organizationId, body)

set the Organization default security

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.OrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    OrganizationApi apiInstance = new OrganizationApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String body = writer; // String | the new Organization default security.
    try {
      OrganizationSecurity result = apiInstance.setOrganizationDefaultSecurity(organizationId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#setOrganizationDefaultSecurity");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| the Organization identifier |
 **body** | **String**| the new Organization default security. |

### Return type

[**OrganizationSecurity**](OrganizationSecurity.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | The Organization default visibility |  -  |
**404** | the Organization specified is unknown or you don&#39;t have access to it |  -  |

<a name="unregisterOrganization"></a>
# **unregisterOrganization**
> unregisterOrganization(organizationId)

Unregister an organization

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.OrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    OrganizationApi apiInstance = new OrganizationApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    try {
      apiInstance.unregisterOrganization(organizationId);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#unregisterOrganization");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| the Organization identifier |

### Return type

null (empty response body)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Request succeeded |  -  |
**404** | the Organization specified is unknown or you don&#39;t have access to it |  -  |

<a name="updateOrganization"></a>
# **updateOrganization**
> Organization updateOrganization(organizationId, organization)

Update an Organization

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.OrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    OrganizationApi apiInstance = new OrganizationApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    Organization organization = new Organization(); // Organization | the new Organization details
    try {
      Organization result = apiInstance.updateOrganization(organizationId, organization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updateOrganization");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| the Organization identifier |
 **organization** | [**Organization**](Organization.md)| the new Organization details |

### Return type

[**Organization**](Organization.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the organization details |  -  |
**400** | Bad request |  -  |
**404** | the Organization specified is unknown or you don&#39;t have access to it |  -  |

<a name="updateSolutionsContainerRegistryByOrganizationId"></a>
# **updateSolutionsContainerRegistryByOrganizationId**
> OrganizationService updateSolutionsContainerRegistryByOrganizationId(organizationId, organizationService)

Update the solutions container registry configuration for the Organization specified

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.OrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    OrganizationApi apiInstance = new OrganizationApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    OrganizationService organizationService = new OrganizationService(); // OrganizationService | the new solutions container registry configuration to use
    try {
      OrganizationService result = apiInstance.updateSolutionsContainerRegistryByOrganizationId(organizationId, organizationService);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updateSolutionsContainerRegistryByOrganizationId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| the Organization identifier |
 **organizationService** | [**OrganizationService**](OrganizationService.md)| the new solutions container registry configuration to use |

### Return type

[**OrganizationService**](OrganizationService.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the Organization solutions container registry configuration |  -  |
**404** | the Organization specified is unknown or you don&#39;t have access to it |  -  |

<a name="updateStorageByOrganizationId"></a>
# **updateStorageByOrganizationId**
> OrganizationService updateStorageByOrganizationId(organizationId, organizationService)

Update storage configuration for the Organization specified

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.OrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    OrganizationApi apiInstance = new OrganizationApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    OrganizationService organizationService = new OrganizationService(); // OrganizationService | the new Storage configuration to use
    try {
      OrganizationService result = apiInstance.updateStorageByOrganizationId(organizationId, organizationService);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updateStorageByOrganizationId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| the Organization identifier |
 **organizationService** | [**OrganizationService**](OrganizationService.md)| the new Storage configuration to use |

### Return type

[**OrganizationService**](OrganizationService.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the Organization Storage configuration |  -  |
**404** | the Organization specified is unknown or you don&#39;t have access to it |  -  |

<a name="updateTenantCredentialsByOrganizationId"></a>
# **updateTenantCredentialsByOrganizationId**
> Map&lt;String, Object&gt; updateTenantCredentialsByOrganizationId(organizationId, requestBody)

Update tenant credentials for the Organization specified

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.OrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    OrganizationApi apiInstance = new OrganizationApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    Map<String, Object> requestBody = {"azureTenantId":"<my_azure_tenant_id>","azureClientId":"<my_azure_client_id>","azureClientSecret":"<my_azure_client_secret>"}; // Map<String, Object> | the new Tenant Credentials to use
    try {
      Map<String, Object> result = apiInstance.updateTenantCredentialsByOrganizationId(organizationId, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updateTenantCredentialsByOrganizationId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| the Organization identifier |
 **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)| the new Tenant Credentials to use |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the Organization Tenant Credentials |  -  |
**404** | the Organization specified is unknown or you don&#39;t have access to it |  -  |

