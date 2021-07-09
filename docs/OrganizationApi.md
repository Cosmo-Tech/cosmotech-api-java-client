# OrganizationApi

All URIs are relative to *https://api.cosmotech.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOrReplaceUsersInOrganization**](OrganizationApi.md#addOrReplaceUsersInOrganization) | **POST** /organizations/{organization_id}/users | Add (or replace) users in the Organization specified
[**findAllOrganizations**](OrganizationApi.md#findAllOrganizations) | **GET** /organizations | List all Organizations
[**findOrganizationById**](OrganizationApi.md#findOrganizationById) | **GET** /organizations/{organization_id} | Get the details of an Organization
[**registerOrganization**](OrganizationApi.md#registerOrganization) | **POST** /organizations | Register a new organization
[**removeAllUsersInOrganization**](OrganizationApi.md#removeAllUsersInOrganization) | **DELETE** /organizations/{organization_id}/users | Remove all users from the Organization specified
[**removeUserFromOrganization**](OrganizationApi.md#removeUserFromOrganization) | **DELETE** /organizations/{organization_id}/users/{user_id} | Remove the specified user from the given Organization
[**unregisterOrganization**](OrganizationApi.md#unregisterOrganization) | **DELETE** /organizations/{organization_id} | Unregister an organization
[**updateOrganization**](OrganizationApi.md#updateOrganization) | **PATCH** /organizations/{organization_id} | Update an Organization
[**updateSolutionsContainerRegistryByOrganizationId**](OrganizationApi.md#updateSolutionsContainerRegistryByOrganizationId) | **PATCH** /organizations/{organization_id}/services/solutionsContainerRegistry | Update the solutions container registry configuration for the Organization specified
[**updateStorageByOrganizationId**](OrganizationApi.md#updateStorageByOrganizationId) | **PATCH** /organizations/{organization_id}/services/storage | Update storage configuration for the Organization specified
[**updateTenantCredentialsByOrganizationId**](OrganizationApi.md#updateTenantCredentialsByOrganizationId) | **PATCH** /organizations/{organization_id}/services/tenantCredentials | Update tenant credentials for the Organization specified


<a name="addOrReplaceUsersInOrganization"></a>
# **addOrReplaceUsersInOrganization**
> List&lt;OrganizationUser&gt; addOrReplaceUsersInOrganization(organizationId, organizationUser)

Add (or replace) users in the Organization specified

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
    defaultClient.setBasePath("https://api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    OrganizationApi apiInstance = new OrganizationApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    List<OrganizationUser> organizationUser = Arrays.asList(); // List<OrganizationUser> | the Users to add. Any User with the same ID is overwritten
    try {
      List<OrganizationUser> result = apiInstance.addOrReplaceUsersInOrganization(organizationId, organizationUser);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#addOrReplaceUsersInOrganization");
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
 **organizationUser** | [**List&lt;OrganizationUser&gt;**](OrganizationUser.md)| the Users to add. Any User with the same ID is overwritten |

### Return type

[**List&lt;OrganizationUser&gt;**](OrganizationUser.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | the Organization Users |  -  |
**400** | Bad request |  -  |
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
    defaultClient.setBasePath("https://api.cosmotech.com");
    
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
    defaultClient.setBasePath("https://api.cosmotech.com");
    
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
    defaultClient.setBasePath("https://api.cosmotech.com");
    
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

<a name="removeAllUsersInOrganization"></a>
# **removeAllUsersInOrganization**
> removeAllUsersInOrganization(organizationId)

Remove all users from the Organization specified

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
    defaultClient.setBasePath("https://api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    OrganizationApi apiInstance = new OrganizationApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    try {
      apiInstance.removeAllUsersInOrganization(organizationId);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#removeAllUsersInOrganization");
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
**204** | the operation succeeded |  -  |
**404** | the Organization specified is unknown or you don&#39;t have access to it |  -  |

<a name="removeUserFromOrganization"></a>
# **removeUserFromOrganization**
> removeUserFromOrganization(organizationId, userId)

Remove the specified user from the given Organization

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
    defaultClient.setBasePath("https://api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    OrganizationApi apiInstance = new OrganizationApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String userId = "userId_example"; // String | the User identifier
    try {
      apiInstance.removeUserFromOrganization(organizationId, userId);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#removeUserFromOrganization");
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
 **userId** | **String**| the User identifier |

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
**404** | the Organization or the User specified is unknown or you don&#39;t have access to them |  -  |

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
    defaultClient.setBasePath("https://api.cosmotech.com");
    
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
    defaultClient.setBasePath("https://api.cosmotech.com");
    
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
    defaultClient.setBasePath("https://api.cosmotech.com");
    
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
    defaultClient.setBasePath("https://api.cosmotech.com");
    
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
    defaultClient.setBasePath("https://api.cosmotech.com");
    
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

