# WorkspaceApi

All URIs are relative to *https://dev.api.cosmotech.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addWorkspaceAccessControl**](WorkspaceApi.md#addWorkspaceAccessControl) | **POST** /organizations/{organization_id}/workspaces/{workspace_id}/security/access | Add a control access to the Workspace |
| [**createSecret**](WorkspaceApi.md#createSecret) | **POST** /organizations/{organization_id}/workspaces/{workspace_id}/secret | Create a secret for the Workspace |
| [**createWorkspace**](WorkspaceApi.md#createWorkspace) | **POST** /organizations/{organization_id}/workspaces | Create a new workspace |
| [**deleteAllWorkspaceFiles**](WorkspaceApi.md#deleteAllWorkspaceFiles) | **DELETE** /organizations/{organization_id}/workspaces/{workspace_id}/files | Delete all Workspace files |
| [**deleteWorkspace**](WorkspaceApi.md#deleteWorkspace) | **DELETE** /organizations/{organization_id}/workspaces/{workspace_id} | Delete a workspace |
| [**deleteWorkspaceFile**](WorkspaceApi.md#deleteWorkspaceFile) | **DELETE** /organizations/{organization_id}/workspaces/{workspace_id}/files/delete | Delete a workspace file |
| [**downloadWorkspaceFile**](WorkspaceApi.md#downloadWorkspaceFile) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/files/download | Download the Workspace File specified |
| [**findAllWorkspaceFiles**](WorkspaceApi.md#findAllWorkspaceFiles) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/files | List all Workspace files |
| [**findAllWorkspaces**](WorkspaceApi.md#findAllWorkspaces) | **GET** /organizations/{organization_id}/workspaces | List all Workspaces |
| [**findWorkspaceById**](WorkspaceApi.md#findWorkspaceById) | **GET** /organizations/{organization_id}/workspaces/{workspace_id} | Get the details of an workspace |
| [**getWorkspaceAccessControl**](WorkspaceApi.md#getWorkspaceAccessControl) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/security/access/{identity_id} | Get a control access for the Workspace |
| [**getWorkspacePermissions**](WorkspaceApi.md#getWorkspacePermissions) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/permissions/{role} | Get the Workspace permission by given role |
| [**getWorkspaceSecurity**](WorkspaceApi.md#getWorkspaceSecurity) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/security | Get the Workspace security information |
| [**getWorkspaceSecurityUsers**](WorkspaceApi.md#getWorkspaceSecurityUsers) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/security/users | Get the Workspace security users list |
| [**linkDataset**](WorkspaceApi.md#linkDataset) | **POST** /organizations/{organization_id}/workspaces/{workspace_id}/link |  |
| [**removeWorkspaceAccessControl**](WorkspaceApi.md#removeWorkspaceAccessControl) | **DELETE** /organizations/{organization_id}/workspaces/{workspace_id}/security/access/{identity_id} | Remove the specified access from the given Organization Workspace |
| [**setWorkspaceDefaultSecurity**](WorkspaceApi.md#setWorkspaceDefaultSecurity) | **POST** /organizations/{organization_id}/workspaces/{workspace_id}/security/default | Set the Workspace default security |
| [**unlinkDataset**](WorkspaceApi.md#unlinkDataset) | **POST** /organizations/{organization_id}/workspaces/{workspace_id}/unlink |  |
| [**updateWorkspace**](WorkspaceApi.md#updateWorkspace) | **PATCH** /organizations/{organization_id}/workspaces/{workspace_id} | Update a workspace |
| [**updateWorkspaceAccessControl**](WorkspaceApi.md#updateWorkspaceAccessControl) | **PATCH** /organizations/{organization_id}/workspaces/{workspace_id}/security/access/{identity_id} | Update the specified access to User for a Workspace |
| [**uploadWorkspaceFile**](WorkspaceApi.md#uploadWorkspaceFile) | **POST** /organizations/{organization_id}/workspaces/{workspace_id}/files | Upload a file for the Workspace |


<a id="addWorkspaceAccessControl"></a>
# **addWorkspaceAccessControl**
> WorkspaceAccessControl addWorkspaceAccessControl(organizationId, workspaceId, workspaceAccessControl)

Add a control access to the Workspace

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
    WorkspaceAccessControl workspaceAccessControl = new WorkspaceAccessControl(); // WorkspaceAccessControl | the new Workspace security access to add.
    try {
      WorkspaceAccessControl result = apiInstance.addWorkspaceAccessControl(organizationId, workspaceId, workspaceAccessControl);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkspaceApi#addWorkspaceAccessControl");
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
| **workspaceId** | **String**| the Workspace identifier | |
| **workspaceAccessControl** | [**WorkspaceAccessControl**](WorkspaceAccessControl.md)| the new Workspace security access to add. | |

### Return type

[**WorkspaceAccessControl**](WorkspaceAccessControl.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The Workspace access |  -  |
| **404** | the Workspace specified is unknown or you don&#39;t have access to it |  -  |

<a id="createSecret"></a>
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **workspaceId** | **String**| the Workspace identifier | |
| **workspaceSecret** | [**WorkspaceSecret**](WorkspaceSecret.md)| the definition of the secret | |

### Return type

null (empty response body)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Request succeeded |  -  |
| **404** | the Workspace or the User specified is unknown or you don&#39;t have access to them |  -  |

<a id="createWorkspace"></a>
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **workspace** | [**Workspace**](Workspace.md)| the Workspace to create | |

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
| **201** | the workspace details |  -  |
| **400** | Bad request |  -  |

<a id="deleteAllWorkspaceFiles"></a>
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **workspaceId** | **String**| the Workspace identifier | |

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
| **404** | the Workspace specified is unknown or you don&#39;t have access to them |  -  |

<a id="deleteWorkspace"></a>
# **deleteWorkspace**
> deleteWorkspace(organizationId, workspaceId)

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
      apiInstance.deleteWorkspace(organizationId, workspaceId);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **workspaceId** | **String**| the Workspace identifier | |

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
| **204** | the workspace details |  -  |
| **400** | Bad request |  -  |
| **404** | the Workspace specified is unknown or you don&#39;t have access to it |  -  |

<a id="deleteWorkspaceFile"></a>
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **workspaceId** | **String**| the Workspace identifier | |
| **fileName** | **String**| the file name | |

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
| **404** | the Workspace or the file specified is unknown or you don&#39;t have access to them |  -  |

<a id="downloadWorkspaceFile"></a>
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **workspaceId** | **String**| the Workspace identifier | |
| **fileName** | **String**| the file name | |

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
| **200** | the workspace file as a resource |  -  |
| **404** | the Workspace file specified is unknown or you don&#39;t have access to it |  -  |

<a id="findAllWorkspaceFiles"></a>
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **workspaceId** | **String**| the Workspace identifier | |

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
| **200** | the workspace files |  -  |
| **404** | the Workspace specified is unknown or you don&#39;t have access to it |  -  |

<a id="findAllWorkspaces"></a>
# **findAllWorkspaces**
> List&lt;Workspace&gt; findAllWorkspaces(organizationId, page, size)

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
    Integer page = 56; // Integer | page number to query
    Integer size = 56; // Integer | amount of result by page
    try {
      List<Workspace> result = apiInstance.findAllWorkspaces(organizationId, page, size);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **page** | **Integer**| page number to query | [optional] |
| **size** | **Integer**| amount of result by page | [optional] |

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
| **200** | the workspace details |  -  |

<a id="findWorkspaceById"></a>
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **workspaceId** | **String**| the Workspace identifier | |

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
| **200** | the Workspace details |  -  |
| **404** | The Workspace specified is unknown or you don&#39;t have access to it |  -  |

<a id="getWorkspaceAccessControl"></a>
# **getWorkspaceAccessControl**
> WorkspaceAccessControl getWorkspaceAccessControl(organizationId, workspaceId, identityId)

Get a control access for the Workspace

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
    String identityId = "identityId_example"; // String | the User identifier
    try {
      WorkspaceAccessControl result = apiInstance.getWorkspaceAccessControl(organizationId, workspaceId, identityId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkspaceApi#getWorkspaceAccessControl");
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
| **workspaceId** | **String**| the Workspace identifier | |
| **identityId** | **String**| the User identifier | |

### Return type

[**WorkspaceAccessControl**](WorkspaceAccessControl.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Workspace access |  -  |
| **404** | The Workspace or user specified is unknown or you don&#39;t have access to it |  -  |

<a id="getWorkspacePermissions"></a>
# **getWorkspacePermissions**
> List&lt;String&gt; getWorkspacePermissions(organizationId, workspaceId, role)

Get the Workspace permission by given role

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
    String role = "role_example"; // String | the Role
    try {
      List<String> result = apiInstance.getWorkspacePermissions(organizationId, workspaceId, role);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkspaceApi#getWorkspacePermissions");
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
| **workspaceId** | **String**| the Workspace identifier | |
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
| **200** | The Workspace security permission list |  -  |

<a id="getWorkspaceSecurity"></a>
# **getWorkspaceSecurity**
> WorkspaceSecurity getWorkspaceSecurity(organizationId, workspaceId)

Get the Workspace security information

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
      WorkspaceSecurity result = apiInstance.getWorkspaceSecurity(organizationId, workspaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkspaceApi#getWorkspaceSecurity");
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
| **workspaceId** | **String**| the Workspace identifier | |

### Return type

[**WorkspaceSecurity**](WorkspaceSecurity.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Workspace security |  -  |
| **404** | the Workspace specified is unknown or you don&#39;t have access to it |  -  |

<a id="getWorkspaceSecurityUsers"></a>
# **getWorkspaceSecurityUsers**
> List&lt;String&gt; getWorkspaceSecurityUsers(organizationId, workspaceId)

Get the Workspace security users list

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
      List<String> result = apiInstance.getWorkspaceSecurityUsers(organizationId, workspaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkspaceApi#getWorkspaceSecurityUsers");
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
| **workspaceId** | **String**| the Workspace identifier | |

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
| **200** | The Workspace security users list |  -  |
| **404** | the Workspace or the User specified is unknown or you don&#39;t have access to them |  -  |

<a id="linkDataset"></a>
# **linkDataset**
> Workspace linkDataset(organizationId, workspaceId, datasetId)



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
    String datasetId = "datasetId_example"; // String | dataset id to be linked to
    try {
      Workspace result = apiInstance.linkDataset(organizationId, workspaceId, datasetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkspaceApi#linkDataset");
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
| **workspaceId** | **String**| the Workspace identifier | |
| **datasetId** | **String**| dataset id to be linked to | |

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
| **200** | the workspace details |  -  |
| **400** | Bad request |  -  |
| **404** | the workspace specified is unknown or you don&#39;t have access to it |  -  |

<a id="removeWorkspaceAccessControl"></a>
# **removeWorkspaceAccessControl**
> removeWorkspaceAccessControl(organizationId, workspaceId, identityId)

Remove the specified access from the given Organization Workspace

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
    String identityId = "identityId_example"; // String | the User identifier
    try {
      apiInstance.removeWorkspaceAccessControl(organizationId, workspaceId, identityId);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkspaceApi#removeWorkspaceAccessControl");
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
| **workspaceId** | **String**| the Workspace identifier | |
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
| **404** | The Workspace or the user specified is unknown or you don&#39;t have access to them |  -  |

<a id="setWorkspaceDefaultSecurity"></a>
# **setWorkspaceDefaultSecurity**
> WorkspaceSecurity setWorkspaceDefaultSecurity(organizationId, workspaceId, workspaceRole)

Set the Workspace default security

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
    WorkspaceRole workspaceRole = new WorkspaceRole(); // WorkspaceRole | This change the workspace default security. The default security is the role assigned to any person not on the Access Control List. If the default security is None, then nobody outside of the ACL can access the workspace.
    try {
      WorkspaceSecurity result = apiInstance.setWorkspaceDefaultSecurity(organizationId, workspaceId, workspaceRole);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkspaceApi#setWorkspaceDefaultSecurity");
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
| **workspaceId** | **String**| the Workspace identifier | |
| **workspaceRole** | [**WorkspaceRole**](WorkspaceRole.md)| This change the workspace default security. The default security is the role assigned to any person not on the Access Control List. If the default security is None, then nobody outside of the ACL can access the workspace. | |

### Return type

[**WorkspaceSecurity**](WorkspaceSecurity.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The Workspace default visibility |  -  |
| **404** | the Workspace specified is unknown or you don&#39;t have access to it |  -  |

<a id="unlinkDataset"></a>
# **unlinkDataset**
> Workspace unlinkDataset(organizationId, workspaceId, datasetId)



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
    String datasetId = "datasetId_example"; // String | dataset id to be linked to
    try {
      Workspace result = apiInstance.unlinkDataset(organizationId, workspaceId, datasetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkspaceApi#unlinkDataset");
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
| **workspaceId** | **String**| the Workspace identifier | |
| **datasetId** | **String**| dataset id to be linked to | |

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
| **200** | the workspace details |  -  |
| **400** | Bad request |  -  |
| **404** | the Dataset specified is unknown or you don&#39;t have access to it |  -  |

<a id="updateWorkspace"></a>
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
    Workspace workspace = new Workspace(); // Workspace | The new Workspace details. This endpoint can't be used to update security
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **workspaceId** | **String**| the Workspace identifier | |
| **workspace** | [**Workspace**](Workspace.md)| The new Workspace details. This endpoint can&#39;t be used to update security | |

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
| **200** | the workspace details |  -  |
| **400** | Bad request |  -  |
| **404** | the Workspace specified is unknown or you don&#39;t have access to it |  -  |

<a id="updateWorkspaceAccessControl"></a>
# **updateWorkspaceAccessControl**
> WorkspaceAccessControl updateWorkspaceAccessControl(organizationId, workspaceId, identityId, workspaceRole)

Update the specified access to User for a Workspace

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
    String identityId = "identityId_example"; // String | the User identifier
    WorkspaceRole workspaceRole = new WorkspaceRole(); // WorkspaceRole | The new Workspace Access Control
    try {
      WorkspaceAccessControl result = apiInstance.updateWorkspaceAccessControl(organizationId, workspaceId, identityId, workspaceRole);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkspaceApi#updateWorkspaceAccessControl");
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
| **workspaceId** | **String**| the Workspace identifier | |
| **identityId** | **String**| the User identifier | |
| **workspaceRole** | [**WorkspaceRole**](WorkspaceRole.md)| The new Workspace Access Control | |

### Return type

[**WorkspaceAccessControl**](WorkspaceAccessControl.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Workspace access |  -  |
| **404** | The Workspace specified is unknown or you don&#39;t have access to it |  -  |

<a id="uploadWorkspaceFile"></a>
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **workspaceId** | **String**| the Workspace identifier | |
| **_file** | **File**|  | |
| **overwrite** | **Boolean**|  | [optional] [default to false] |
| **destination** | **String**| Destination path. Must end with a &#39;/&#39; if specifying a folder. Note that paths may or may not start with a &#39;/&#39;, but they are always treated as relative to the Workspace root location.  | [optional] |

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
| **201** | the file resource details |  -  |
| **400** | Bad request |  -  |

