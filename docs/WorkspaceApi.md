# WorkspaceApi

All URIs are relative to *https://dev.api.cosmotech.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOrReplaceUsersInOrganizationWorkspace**](WorkspaceApi.md#addOrReplaceUsersInOrganizationWorkspace) | **POST** /organizations/{organization_id}/workspaces/{workspace_id}/users | Add (or replace) users to the Workspace specified
[**createSecret**](WorkspaceApi.md#createSecret) | **POST** /organizations/{organization_id}/workspaces/{workspace_id}/secret | Create a secret for the Workspace
[**createWorkspace**](WorkspaceApi.md#createWorkspace) | **POST** /organizations/{organization_id}/workspaces | Create a new workspace
[**deleteAllWorkspaceFiles**](WorkspaceApi.md#deleteAllWorkspaceFiles) | **DELETE** /organizations/{organization_id}/workspaces/{workspace_id}/files | Delete all Workspace files
[**deleteWorkspace**](WorkspaceApi.md#deleteWorkspace) | **DELETE** /organizations/{organization_id}/workspaces/{workspace_id} | Delete a workspace
[**deleteWorkspaceFile**](WorkspaceApi.md#deleteWorkspaceFile) | **DELETE** /organizations/{organization_id}/workspaces/{workspace_id}/files/delete | Delete a workspace file
[**downloadWorkspaceFile**](WorkspaceApi.md#downloadWorkspaceFile) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/files/download | Download the Workspace File specified
[**findAllWorkspaceFiles**](WorkspaceApi.md#findAllWorkspaceFiles) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/files | List all Workspace files
[**findAllWorkspaces**](WorkspaceApi.md#findAllWorkspaces) | **GET** /organizations/{organization_id}/workspaces | List all Workspaces
[**findWorkspaceById**](WorkspaceApi.md#findWorkspaceById) | **GET** /organizations/{organization_id}/workspaces/{workspace_id} | Get the details of an workspace
[**removeAllUsersOfWorkspace**](WorkspaceApi.md#removeAllUsersOfWorkspace) | **DELETE** /organizations/{organization_id}/workspaces/{workspace_id}/users | Remove all users from the Workspace specified
[**removeUserFromOrganizationWorkspace**](WorkspaceApi.md#removeUserFromOrganizationWorkspace) | **DELETE** /organizations/{organization_id}/workspaces/{workspace_id}/users/{user_id} | Remove the specified user from the given Organization Workspace
[**updateWorkspace**](WorkspaceApi.md#updateWorkspace) | **PATCH** /organizations/{organization_id}/workspaces/{workspace_id} | Update a workspace
[**uploadWorkspaceFile**](WorkspaceApi.md#uploadWorkspaceFile) | **POST** /organizations/{organization_id}/workspaces/{workspace_id}/files | Upload a file for the Workspace


<a name="addOrReplaceUsersInOrganizationWorkspace"></a>
# **addOrReplaceUsersInOrganizationWorkspace**
> List&lt;WorkspaceUser&gt; addOrReplaceUsersInOrganizationWorkspace(organizationId, workspaceId, workspaceUser)

Add (or replace) users to the Workspace specified

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.WorkspaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    WorkspaceApi apiInstance = new WorkspaceApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    List<WorkspaceUser> workspaceUser = Arrays.asList(); // List<WorkspaceUser> | the Users to add. Any User with the same ID is overwritten
    try {
      List<WorkspaceUser> result = apiInstance.addOrReplaceUsersInOrganizationWorkspace(organizationId, workspaceId, workspaceUser);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkspaceApi#addOrReplaceUsersInOrganizationWorkspace");
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
 **workspaceUser** | [**List&lt;WorkspaceUser&gt;**](WorkspaceUser.md)| the Users to add. Any User with the same ID is overwritten |

### Return type

[**List&lt;WorkspaceUser&gt;**](WorkspaceUser.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the Workspace Users |  -  |
**404** | the Workspace specified is unknown or you don&#39;t have access to it |  -  |

<a name="createSecret"></a>
# **createSecret**
> createSecret(organizationId, workspaceId, workspaceSecret)

Create a secret for the Workspace

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.WorkspaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    WorkspaceApi apiInstance = new WorkspaceApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    WorkspaceSecret workspaceSecret = new WorkspaceSecret(); // WorkspaceSecret | the definition of the secret
    try {
      apiInstance.createSecret(organizationId, workspaceId, workspaceSecret);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkspaceApi#createSecret");
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
 **workspaceSecret** | [**WorkspaceSecret**](WorkspaceSecret.md)| the definition of the secret |

### Return type

null (empty response body)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Request succeeded |  -  |
**404** | the Workspace or the User specified is unknown or you don&#39;t have access to them |  -  |

<a name="createWorkspace"></a>
# **createWorkspace**
> Workspace createWorkspace(organizationId, workspace)

Create a new workspace

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.WorkspaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    WorkspaceApi apiInstance = new WorkspaceApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    Workspace workspace = new Workspace(); // Workspace | the Workspace to create
    try {
      Workspace result = apiInstance.createWorkspace(organizationId, workspace);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkspaceApi#createWorkspace");
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
 **workspace** | [**Workspace**](Workspace.md)| the Workspace to create |

### Return type

[**Workspace**](Workspace.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | the workspace details |  -  |
**400** | Bad request |  -  |

<a name="deleteAllWorkspaceFiles"></a>
# **deleteAllWorkspaceFiles**
> deleteAllWorkspaceFiles(organizationId, workspaceId)

Delete all Workspace files

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.WorkspaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    WorkspaceApi apiInstance = new WorkspaceApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    try {
      apiInstance.deleteAllWorkspaceFiles(organizationId, workspaceId);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkspaceApi#deleteAllWorkspaceFiles");
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
**404** | the Workspace specified is unknown or you don&#39;t have access to them |  -  |

<a name="deleteWorkspace"></a>
# **deleteWorkspace**
> Workspace deleteWorkspace(organizationId, workspaceId)

Delete a workspace

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.WorkspaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    WorkspaceApi apiInstance = new WorkspaceApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    try {
      Workspace result = apiInstance.deleteWorkspace(organizationId, workspaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkspaceApi#deleteWorkspace");
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

### Return type

[**Workspace**](Workspace.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the workspace details |  -  |
**400** | Bad request |  -  |
**404** | the Workspace specified is unknown or you don&#39;t have access to it |  -  |

<a name="deleteWorkspaceFile"></a>
# **deleteWorkspaceFile**
> deleteWorkspaceFile(organizationId, workspaceId, fileName)

Delete a workspace file

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.WorkspaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    WorkspaceApi apiInstance = new WorkspaceApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    String fileName = "fileName_example"; // String | the file name
    try {
      apiInstance.deleteWorkspaceFile(organizationId, workspaceId, fileName);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkspaceApi#deleteWorkspaceFile");
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
 **fileName** | **String**| the file name |

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
**404** | the Workspace or the file specified is unknown or you don&#39;t have access to them |  -  |

<a name="downloadWorkspaceFile"></a>
# **downloadWorkspaceFile**
> File downloadWorkspaceFile(organizationId, workspaceId, fileName)

Download the Workspace File specified

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.WorkspaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    WorkspaceApi apiInstance = new WorkspaceApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    String fileName = "fileName_example"; // String | the file name
    try {
      File result = apiInstance.downloadWorkspaceFile(organizationId, workspaceId, fileName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkspaceApi#downloadWorkspaceFile");
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
 **fileName** | **String**| the file name |

### Return type

[**File**](File.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the workspace file as a resource |  -  |
**404** | the Workspace file specified is unknown or you don&#39;t have access to it |  -  |

<a name="findAllWorkspaceFiles"></a>
# **findAllWorkspaceFiles**
> List&lt;WorkspaceFile&gt; findAllWorkspaceFiles(organizationId, workspaceId)

List all Workspace files

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.WorkspaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    WorkspaceApi apiInstance = new WorkspaceApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    try {
      List<WorkspaceFile> result = apiInstance.findAllWorkspaceFiles(organizationId, workspaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkspaceApi#findAllWorkspaceFiles");
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

### Return type

[**List&lt;WorkspaceFile&gt;**](WorkspaceFile.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the workspace files |  -  |
**404** | the Workspace specified is unknown or you don&#39;t have access to it |  -  |

<a name="findAllWorkspaces"></a>
# **findAllWorkspaces**
> List&lt;Workspace&gt; findAllWorkspaces(organizationId)

List all Workspaces

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.WorkspaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    WorkspaceApi apiInstance = new WorkspaceApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    try {
      List<Workspace> result = apiInstance.findAllWorkspaces(organizationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkspaceApi#findAllWorkspaces");
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

[**List&lt;Workspace&gt;**](Workspace.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the workspace details |  -  |

<a name="findWorkspaceById"></a>
# **findWorkspaceById**
> Workspace findWorkspaceById(organizationId, workspaceId)

Get the details of an workspace

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.WorkspaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    WorkspaceApi apiInstance = new WorkspaceApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    try {
      Workspace result = apiInstance.findWorkspaceById(organizationId, workspaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkspaceApi#findWorkspaceById");
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

### Return type

[**Workspace**](Workspace.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the Workspace details |  -  |
**404** | the Workspace specified is unknown or you don&#39;t have access to it |  -  |

<a name="removeAllUsersOfWorkspace"></a>
# **removeAllUsersOfWorkspace**
> removeAllUsersOfWorkspace(organizationId, workspaceId)

Remove all users from the Workspace specified

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.WorkspaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    WorkspaceApi apiInstance = new WorkspaceApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    try {
      apiInstance.removeAllUsersOfWorkspace(organizationId, workspaceId);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkspaceApi#removeAllUsersOfWorkspace");
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
**404** | the Workspace specified is unknown or you don&#39;t have access to it |  -  |

<a name="removeUserFromOrganizationWorkspace"></a>
# **removeUserFromOrganizationWorkspace**
> removeUserFromOrganizationWorkspace(organizationId, workspaceId, userId)

Remove the specified user from the given Organization Workspace

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.WorkspaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    WorkspaceApi apiInstance = new WorkspaceApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    String userId = "userId_example"; // String | the User identifier
    try {
      apiInstance.removeUserFromOrganizationWorkspace(organizationId, workspaceId, userId);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkspaceApi#removeUserFromOrganizationWorkspace");
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
**404** | the Workspace or the User specified is unknown or you don&#39;t have access to them |  -  |

<a name="updateWorkspace"></a>
# **updateWorkspace**
> Workspace updateWorkspace(organizationId, workspaceId, workspace)

Update a workspace

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.WorkspaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    WorkspaceApi apiInstance = new WorkspaceApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    Workspace workspace = new Workspace(); // Workspace | the new Workspace details.
    try {
      Workspace result = apiInstance.updateWorkspace(organizationId, workspaceId, workspace);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkspaceApi#updateWorkspace");
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
 **workspace** | [**Workspace**](Workspace.md)| the new Workspace details. |

### Return type

[**Workspace**](Workspace.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the workspace details |  -  |
**400** | Bad request |  -  |
**404** | the Workspace specified is unknown or you don&#39;t have access to it |  -  |

<a name="uploadWorkspaceFile"></a>
# **uploadWorkspaceFile**
> WorkspaceFile uploadWorkspaceFile(organizationId, workspaceId, _file, overwrite, destination)

Upload a file for the Workspace

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.WorkspaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    WorkspaceApi apiInstance = new WorkspaceApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    File _file = new File("/path/to/file"); // File | 
    Boolean overwrite = false; // Boolean | 
    String destination = "destination_example"; // String | Destination path. Must end with a '/' if specifying a folder. Note that paths may or may not start with a '/', but they are always treated as relative to the Workspace root location. 
    try {
      WorkspaceFile result = apiInstance.uploadWorkspaceFile(organizationId, workspaceId, _file, overwrite, destination);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkspaceApi#uploadWorkspaceFile");
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
 **_file** | **File**|  |
 **overwrite** | **Boolean**|  | [optional] [default to false]
 **destination** | **String**| Destination path. Must end with a &#39;/&#39; if specifying a folder. Note that paths may or may not start with a &#39;/&#39;, but they are always treated as relative to the Workspace root location.  | [optional]

### Return type

[**WorkspaceFile**](WorkspaceFile.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | the file resource details |  -  |
**400** | Bad request |  -  |

