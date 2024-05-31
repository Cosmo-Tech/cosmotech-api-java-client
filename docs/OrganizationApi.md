# OrganizationApi

All URIs are relative to *https://dev.api.cosmotech.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addOrganizationAccessControl**](OrganizationApi.md#addOrganizationAccessControl) | **POST** /organizations/{organization_id}/security/access | Add a control access to the Organization |
| [**findAllOrganizations**](OrganizationApi.md#findAllOrganizations) | **GET** /organizations | List all Organizations |
| [**findOrganizationById**](OrganizationApi.md#findOrganizationById) | **GET** /organizations/{organization_id} | Get the details of an Organization |
| [**getAllPermissions**](OrganizationApi.md#getAllPermissions) | **GET** /organizations/permissions | Get all permissions per components |
| [**getOrganizationAccessControl**](OrganizationApi.md#getOrganizationAccessControl) | **GET** /organizations/{organization_id}/security/access/{identity_id} | Get a control access for the Organization |
| [**getOrganizationPermissions**](OrganizationApi.md#getOrganizationPermissions) | **GET** /organizations/{organization_id}/permissions/{role} | Get the Organization permissions by given role |
| [**getOrganizationSecurity**](OrganizationApi.md#getOrganizationSecurity) | **GET** /organizations/{organization_id}/security | Get the Organization security information |
| [**getOrganizationSecurityUsers**](OrganizationApi.md#getOrganizationSecurityUsers) | **GET** /organizations/{organization_id}/security/users | Get the Organization security users list |
| [**registerOrganization**](OrganizationApi.md#registerOrganization) | **POST** /organizations | Register a new organization |
| [**removeOrganizationAccessControl**](OrganizationApi.md#removeOrganizationAccessControl) | **DELETE** /organizations/{organization_id}/security/access/{identity_id} | Remove the specified access from the given Organization |
| [**setOrganizationDefaultSecurity**](OrganizationApi.md#setOrganizationDefaultSecurity) | **POST** /organizations/{organization_id}/security/default | Set the Organization default security |
| [**unregisterOrganization**](OrganizationApi.md#unregisterOrganization) | **DELETE** /organizations/{organization_id} | Unregister an organization |
| [**updateOrganization**](OrganizationApi.md#updateOrganization) | **PATCH** /organizations/{organization_id} | Update an Organization |
| [**updateOrganizationAccessControl**](OrganizationApi.md#updateOrganizationAccessControl) | **PATCH** /organizations/{organization_id}/security/access/{identity_id} | Update the specified access to User for an Organization |


<a id="addOrganizationAccessControl"></a>
# **addOrganizationAccessControl**
> OrganizationAccessControl addOrganizationAccessControl(organizationId, organizationAccessControl)

Add a control access to the Organization

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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **organizationAccessControl** | [**OrganizationAccessControl**](OrganizationAccessControl.md)| the new Organization security access to add. | |

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
| **201** | The Organization access |  -  |
| **404** | the Organization specified is unknown or you don&#39;t have access to it |  -  |

<a id="findAllOrganizations"></a>
# **findAllOrganizations**
> List&lt;Organization&gt; findAllOrganizations(page, size)

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
    Integer page = 56; // Integer | page number to query
    Integer size = 56; // Integer | amount of result by page
    try {
      List<Organization> result = apiInstance.findAllOrganizations(page, size);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| page number to query | [optional] |
| **size** | **Integer**| amount of result by page | [optional] |

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
| **200** | the list of Organizations |  -  |

<a id="findOrganizationById"></a>
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |

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
| **200** | the Organization details |  -  |
| **404** | the Organization specified is unknown or you don&#39;t have access to it |  -  |

<a id="getAllPermissions"></a>
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
| **200** | The Scenarios security permission list |  -  |

<a id="getOrganizationAccessControl"></a>
# **getOrganizationAccessControl**
> OrganizationAccessControl getOrganizationAccessControl(organizationId, identityId)

Get a control access for the Organization

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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **identityId** | **String**| the User identifier | |

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
| **200** | The Organization access |  -  |
| **404** | The Organization or user specified is unknown or you don&#39;t have access to it |  -  |

<a id="getOrganizationPermissions"></a>
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **role** | **String**| the Role | |

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
| **200** | The Organization security permission list |  -  |

<a id="getOrganizationSecurity"></a>
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |

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
| **200** | The Organization security |  -  |
| **404** | the Organization specified is unknown or you don&#39;t have access to it |  -  |

<a id="getOrganizationSecurityUsers"></a>
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
    String organizationId = "organizationId_example"; // String | The Organization identifier
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| The Organization identifier | |

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
| **200** | The Organization security users list |  -  |
| **404** | the Organization specified is unknown or you don&#39;t have access to it |  -  |

<a id="registerOrganization"></a>
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organization** | [**Organization**](Organization.md)| the Organization to register | |

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
| **201** | the Organization details |  -  |
| **400** | Bad request |  -  |

<a id="removeOrganizationAccessControl"></a>
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **identityId** | **String**| the User identifier | |

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
| **204** | Request succeeded |  -  |
| **404** | the Organization or the user specified is unknown or you don&#39;t have access to them |  -  |

<a id="setOrganizationDefaultSecurity"></a>
# **setOrganizationDefaultSecurity**
> OrganizationSecurity setOrganizationDefaultSecurity(organizationId, organizationRole)

Set the Organization default security

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
    OrganizationRole organizationRole = new OrganizationRole(); // OrganizationRole | This change the organization default security. The default security is the role assigned to any person not on the Access Control List. If the default security is None, then nobody outside of the ACL can access the organization.
    try {
      OrganizationSecurity result = apiInstance.setOrganizationDefaultSecurity(organizationId, organizationRole);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **organizationRole** | [**OrganizationRole**](OrganizationRole.md)| This change the organization default security. The default security is the role assigned to any person not on the Access Control List. If the default security is None, then nobody outside of the ACL can access the organization. | |

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
| **201** | The Organization default visibility |  -  |
| **404** | the Organization specified is unknown or you don&#39;t have access to it |  -  |

<a id="unregisterOrganization"></a>
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |

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
| **204** | Request succeeded |  -  |
| **404** | the Organization specified is unknown or you don&#39;t have access to it |  -  |

<a id="updateOrganization"></a>
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
    Organization organization = new Organization(); // Organization | the new Organization details. This endpoint can't be used to update security
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **organization** | [**Organization**](Organization.md)| the new Organization details. This endpoint can&#39;t be used to update security | |

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
| **200** | the organization details |  -  |
| **400** | Bad request |  -  |
| **404** | the Organization specified is unknown or you don&#39;t have access to it |  -  |

<a id="updateOrganizationAccessControl"></a>
# **updateOrganizationAccessControl**
> OrganizationAccessControl updateOrganizationAccessControl(organizationId, identityId, organizationRole)

Update the specified access to User for an Organization

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
    OrganizationRole organizationRole = new OrganizationRole(); // OrganizationRole | The new Organization Access Control
    try {
      OrganizationAccessControl result = apiInstance.updateOrganizationAccessControl(organizationId, identityId, organizationRole);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updateOrganizationAccessControl");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **identityId** | **String**| the User identifier | |
| **organizationRole** | [**OrganizationRole**](OrganizationRole.md)| The new Organization Access Control | |

### Return type

[**OrganizationAccessControl**](OrganizationAccessControl.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Organization access |  -  |
| **404** | The Organization specified is unknown or you don&#39;t have access to it |  -  |

