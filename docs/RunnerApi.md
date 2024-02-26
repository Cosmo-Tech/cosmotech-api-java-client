# RunnerApi

All URIs are relative to *https://dev.api.cosmotech.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addRunnerAccessControl**](RunnerApi.md#addRunnerAccessControl) | **POST** /organizations/{organization_id}/workspaces/{workspace_id}/runners/{runner_id}/security/access | Add a control access to the Runner
[**createRunner**](RunnerApi.md#createRunner) | **POST** /organizations/{organization_id}/workspaces/{workspace_id}/runners | Create a new Runner
[**deleteRunner**](RunnerApi.md#deleteRunner) | **DELETE** /organizations/{organization_id}/workspaces/{workspace_id}/runners/{runner_id} | Delete a runner
[**getRunner**](RunnerApi.md#getRunner) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/runners/{runner_id} | Get the details of an runner
[**getRunnerAccessControl**](RunnerApi.md#getRunnerAccessControl) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/runners/{runner_id}/security/access/{identity_id} | Get a control access for the Runner
[**getRunnerPermissions**](RunnerApi.md#getRunnerPermissions) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/runners/{runner_id}/permissions/{role} | Get the Runner permission by given role
[**getRunnerSecurity**](RunnerApi.md#getRunnerSecurity) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/runners/{runner_id}/security | Get the Runner security information
[**getRunnerSecurityUsers**](RunnerApi.md#getRunnerSecurityUsers) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/runners/{runner_id}/security/users | Get the Runner security users list
[**listRunners**](RunnerApi.md#listRunners) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/runners | List all Runners
[**removeRunnerAccessControl**](RunnerApi.md#removeRunnerAccessControl) | **DELETE** /organizations/{organization_id}/workspaces/{workspace_id}/runners/{runner_id}/security/access/{identity_id} | Remove the specified access from the given Organization Runner
[**setRunnerDefaultSecurity**](RunnerApi.md#setRunnerDefaultSecurity) | **POST** /organizations/{organization_id}/workspaces/{workspace_id}/runners/{runner_id}/security/default | Set the Runner default security
[**startRun**](RunnerApi.md#startRun) | **POST** /organizations/{organization_id}/workspaces/{workspace_id}/runners/{runner_id}/start | Start a run with runner parameters
[**stopRun**](RunnerApi.md#stopRun) | **POST** /organizations/{organization_id}/workspaces/{workspace_id}/runners/{runner_id}/stop | Stop the last run
[**updateRunner**](RunnerApi.md#updateRunner) | **PATCH** /organizations/{organization_id}/workspaces/{workspace_id}/runners/{runner_id} | Update a runner
[**updateRunnerAccessControl**](RunnerApi.md#updateRunnerAccessControl) | **PATCH** /organizations/{organization_id}/workspaces/{workspace_id}/runners/{runner_id}/security/access/{identity_id} | Update the specified access to User for a Runner


<a name="addRunnerAccessControl"></a>
# **addRunnerAccessControl**
> RunnerAccessControl addRunnerAccessControl(organizationId, workspaceId, runnerId, runnerAccessControl)

Add a control access to the Runner

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.RunnerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    RunnerApi apiInstance = new RunnerApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    String runnerId = "runnerId_example"; // String | the Runner identifier
    RunnerAccessControl runnerAccessControl = new RunnerAccessControl(); // RunnerAccessControl | the new Runner security access to add.
    try {
      RunnerAccessControl result = apiInstance.addRunnerAccessControl(organizationId, workspaceId, runnerId, runnerAccessControl);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunnerApi#addRunnerAccessControl");
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
 **workspaceId** | **String**| the Workspace identifier |
 **runnerId** | **String**| the Runner identifier |
 **runnerAccessControl** | [**RunnerAccessControl**](RunnerAccessControl.md)| the new Runner security access to add. |

### Return type

[**RunnerAccessControl**](RunnerAccessControl.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | The Runner access |  -  |
**404** | the Runner specified is unknown or you don&#39;t have access to it |  -  |

<a name="createRunner"></a>
# **createRunner**
> Runner createRunner(organizationId, workspaceId, runner)

Create a new Runner

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.RunnerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    RunnerApi apiInstance = new RunnerApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    Runner runner = new Runner(); // Runner | the Runner to create
    try {
      Runner result = apiInstance.createRunner(organizationId, workspaceId, runner);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunnerApi#createRunner");
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
 **workspaceId** | **String**| the Workspace identifier |
 **runner** | [**Runner**](Runner.md)| the Runner to create |

### Return type

[**Runner**](Runner.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | the runner details |  -  |
**400** | Bad request |  -  |

<a name="deleteRunner"></a>
# **deleteRunner**
> deleteRunner(organizationId, workspaceId, runnerId)

Delete a runner

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.RunnerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    RunnerApi apiInstance = new RunnerApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    String runnerId = "runnerId_example"; // String | the Runner identifier
    try {
      apiInstance.deleteRunner(organizationId, workspaceId, runnerId);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunnerApi#deleteRunner");
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
 **workspaceId** | **String**| the Workspace identifier |
 **runnerId** | **String**| the Runner identifier |

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
**404** | the Runner specified is unknown or you don&#39;t have access to it |  -  |

<a name="getRunner"></a>
# **getRunner**
> Runner getRunner(organizationId, workspaceId, runnerId)

Get the details of an runner

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.RunnerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    RunnerApi apiInstance = new RunnerApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    String runnerId = "runnerId_example"; // String | the Runner identifier
    try {
      Runner result = apiInstance.getRunner(organizationId, workspaceId, runnerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunnerApi#getRunner");
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
 **workspaceId** | **String**| the Workspace identifier |
 **runnerId** | **String**| the Runner identifier |

### Return type

[**Runner**](Runner.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the Runner details |  -  |
**404** | the Runner specified is unknown or you don&#39;t have access to it |  -  |

<a name="getRunnerAccessControl"></a>
# **getRunnerAccessControl**
> RunnerAccessControl getRunnerAccessControl(organizationId, workspaceId, runnerId, identityId)

Get a control access for the Runner

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.RunnerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    RunnerApi apiInstance = new RunnerApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    String runnerId = "runnerId_example"; // String | the Runner identifier
    String identityId = "identityId_example"; // String | the User identifier
    try {
      RunnerAccessControl result = apiInstance.getRunnerAccessControl(organizationId, workspaceId, runnerId, identityId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunnerApi#getRunnerAccessControl");
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
 **workspaceId** | **String**| the Workspace identifier |
 **runnerId** | **String**| the Runner identifier |
 **identityId** | **String**| the User identifier |

### Return type

[**RunnerAccessControl**](RunnerAccessControl.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The Runner access |  -  |
**404** | the Runner or user specified is unknown or you don&#39;t have access to it |  -  |

<a name="getRunnerPermissions"></a>
# **getRunnerPermissions**
> List&lt;String&gt; getRunnerPermissions(organizationId, workspaceId, runnerId, role)

Get the Runner permission by given role

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.RunnerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    RunnerApi apiInstance = new RunnerApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    String runnerId = "runnerId_example"; // String | the Runner identifier
    String role = "role_example"; // String | the Role
    try {
      List<String> result = apiInstance.getRunnerPermissions(organizationId, workspaceId, runnerId, role);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunnerApi#getRunnerPermissions");
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
 **workspaceId** | **String**| the Workspace identifier |
 **runnerId** | **String**| the Runner identifier |
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
**200** | The Runners security permission list |  -  |

<a name="getRunnerSecurity"></a>
# **getRunnerSecurity**
> RunnerSecurity getRunnerSecurity(organizationId, workspaceId, runnerId)

Get the Runner security information

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.RunnerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    RunnerApi apiInstance = new RunnerApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    String runnerId = "runnerId_example"; // String | the Runner identifier
    try {
      RunnerSecurity result = apiInstance.getRunnerSecurity(organizationId, workspaceId, runnerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunnerApi#getRunnerSecurity");
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
 **workspaceId** | **String**| the Workspace identifier |
 **runnerId** | **String**| the Runner identifier |

### Return type

[**RunnerSecurity**](RunnerSecurity.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The Runner security |  -  |
**404** | the Runner specified is unknown or you don&#39;t have access to it |  -  |

<a name="getRunnerSecurityUsers"></a>
# **getRunnerSecurityUsers**
> List&lt;String&gt; getRunnerSecurityUsers(organizationId, workspaceId, runnerId)

Get the Runner security users list

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.RunnerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    RunnerApi apiInstance = new RunnerApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    String runnerId = "runnerId_example"; // String | the Runner identifier
    try {
      List<String> result = apiInstance.getRunnerSecurityUsers(organizationId, workspaceId, runnerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunnerApi#getRunnerSecurityUsers");
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
 **workspaceId** | **String**| the Workspace identifier |
 **runnerId** | **String**| the Runner identifier |

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
**200** | The Runner security users list |  -  |
**404** | the Runner specified is unknown or you don&#39;t have access to it |  -  |

<a name="listRunners"></a>
# **listRunners**
> List&lt;Runner&gt; listRunners(organizationId, workspaceId, page, size)

List all Runners

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.RunnerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    RunnerApi apiInstance = new RunnerApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    Integer page = 56; // Integer | page number to query
    Integer size = 56; // Integer | amount of result by page
    try {
      List<Runner> result = apiInstance.listRunners(organizationId, workspaceId, page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunnerApi#listRunners");
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
 **workspaceId** | **String**| the Workspace identifier |
 **page** | **Integer**| page number to query | [optional]
 **size** | **Integer**| amount of result by page | [optional]

### Return type

[**List&lt;Runner&gt;**](Runner.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the list of Runners |  -  |

<a name="removeRunnerAccessControl"></a>
# **removeRunnerAccessControl**
> removeRunnerAccessControl(organizationId, workspaceId, runnerId, identityId)

Remove the specified access from the given Organization Runner

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.RunnerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    RunnerApi apiInstance = new RunnerApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    String runnerId = "runnerId_example"; // String | the Runner identifier
    String identityId = "identityId_example"; // String | the User identifier
    try {
      apiInstance.removeRunnerAccessControl(organizationId, workspaceId, runnerId, identityId);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunnerApi#removeRunnerAccessControl");
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
 **workspaceId** | **String**| the Workspace identifier |
 **runnerId** | **String**| the Runner identifier |
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
**404** | the Runner or the user specified is unknown or you don&#39;t have access to them |  -  |

<a name="setRunnerDefaultSecurity"></a>
# **setRunnerDefaultSecurity**
> RunnerSecurity setRunnerDefaultSecurity(organizationId, workspaceId, runnerId, runnerRole)

Set the Runner default security

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.RunnerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    RunnerApi apiInstance = new RunnerApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    String runnerId = "runnerId_example"; // String | the Runner identifier
    RunnerRole runnerRole = new RunnerRole(); // RunnerRole | This change the runner default security. The default security is the role assigned to any person not on the Access Control List. If the default security is None, then nobody outside of the ACL can access the runner.
    try {
      RunnerSecurity result = apiInstance.setRunnerDefaultSecurity(organizationId, workspaceId, runnerId, runnerRole);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunnerApi#setRunnerDefaultSecurity");
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
 **workspaceId** | **String**| the Workspace identifier |
 **runnerId** | **String**| the Runner identifier |
 **runnerRole** | [**RunnerRole**](RunnerRole.md)| This change the runner default security. The default security is the role assigned to any person not on the Access Control List. If the default security is None, then nobody outside of the ACL can access the runner. |

### Return type

[**RunnerSecurity**](RunnerSecurity.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | The Runner default visibility |  -  |
**404** | the Runner specified is unknown or you don&#39;t have access to it |  -  |

<a name="startRun"></a>
# **startRun**
> RunnerLastRun startRun(organizationId, workspaceId, runnerId)

Start a run with runner parameters

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.RunnerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    RunnerApi apiInstance = new RunnerApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    String runnerId = "runnerId_example"; // String | the Runner identifier
    try {
      RunnerLastRun result = apiInstance.startRun(organizationId, workspaceId, runnerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunnerApi#startRun");
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
 **workspaceId** | **String**| the Workspace identifier |
 **runnerId** | **String**| the Runner identifier |

### Return type

[**RunnerLastRun**](RunnerLastRun.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | the Run id started |  -  |
**404** | the Runner specified is unknown or you don&#39;t have access to it |  -  |

<a name="stopRun"></a>
# **stopRun**
> stopRun(organizationId, workspaceId, runnerId)

Stop the last run

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.RunnerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    RunnerApi apiInstance = new RunnerApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    String runnerId = "runnerId_example"; // String | the Runner identifier
    try {
      apiInstance.stopRun(organizationId, workspaceId, runnerId);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunnerApi#stopRun");
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
 **workspaceId** | **String**| the Workspace identifier |
 **runnerId** | **String**| the Runner identifier |

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
**202** | the last Run has been stopped |  -  |
**404** | the Runner specified is unknown or you don&#39;t have access to it |  -  |

<a name="updateRunner"></a>
# **updateRunner**
> Runner updateRunner(organizationId, workspaceId, runnerId, runner)

Update a runner

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.RunnerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    RunnerApi apiInstance = new RunnerApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    String runnerId = "runnerId_example"; // String | the Runner identifier
    Runner runner = new Runner(); // Runner | the new Runner details. This endpoint can't be used to update security
    try {
      Runner result = apiInstance.updateRunner(organizationId, workspaceId, runnerId, runner);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunnerApi#updateRunner");
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
 **workspaceId** | **String**| the Workspace identifier |
 **runnerId** | **String**| the Runner identifier |
 **runner** | [**Runner**](Runner.md)| the new Runner details. This endpoint can&#39;t be used to update security |

### Return type

[**Runner**](Runner.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the runner details |  -  |
**400** | Bad request |  -  |
**404** | the Runner specified is unknown or you don&#39;t have access to it |  -  |

<a name="updateRunnerAccessControl"></a>
# **updateRunnerAccessControl**
> RunnerAccessControl updateRunnerAccessControl(organizationId, workspaceId, runnerId, identityId, runnerRole)

Update the specified access to User for a Runner

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.RunnerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    RunnerApi apiInstance = new RunnerApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    String runnerId = "runnerId_example"; // String | the Runner identifier
    String identityId = "identityId_example"; // String | the User identifier
    RunnerRole runnerRole = new RunnerRole(); // RunnerRole | The new Runner Access Control
    try {
      RunnerAccessControl result = apiInstance.updateRunnerAccessControl(organizationId, workspaceId, runnerId, identityId, runnerRole);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunnerApi#updateRunnerAccessControl");
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
 **workspaceId** | **String**| the Workspace identifier |
 **runnerId** | **String**| the Runner identifier |
 **identityId** | **String**| the User identifier |
 **runnerRole** | [**RunnerRole**](RunnerRole.md)| The new Runner Access Control |

### Return type

[**RunnerAccessControl**](RunnerAccessControl.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The Runner access |  -  |
**404** | The Organization specified is unknown or you don&#39;t have access to it |  -  |

