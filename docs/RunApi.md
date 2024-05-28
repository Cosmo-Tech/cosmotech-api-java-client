# RunApi

All URIs are relative to *https://dev.api.cosmotech.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteRun**](RunApi.md#deleteRun) | **DELETE** /organizations/{organization_id}/workspaces/{workspace_id}/runners/{runner_id}/runs/{run_id} | Delete a run |
| [**getRun**](RunApi.md#getRun) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/runners/{runner_id}/runs/{run_id} | Get the details of a run |
| [**getRunLogs**](RunApi.md#getRunLogs) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/runners/{runner_id}/runs/{run_id}/logs | get the logs for the Run |
| [**getRunStatus**](RunApi.md#getRunStatus) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/runners/{runner_id}/runs/{run_id}/status | get the status for the Run |
| [**listRuns**](RunApi.md#listRuns) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/runners/{runner_id}/runs | get the list of Runs for the Runner |
| [**queryRunData**](RunApi.md#queryRunData) | **POST** /organizations/{organization_id}/workspaces/{workspace_id}/runners/{runner_id}/runs/{run_id}/data/query | query the run data |
| [**sendRunData**](RunApi.md#sendRunData) | **POST** /organizations/{organization_id}/workspaces/{workspace_id}/runners/{runner_id}/runs/{run_id}/data/send | Send data associated to a run |


<a id="deleteRun"></a>
# **deleteRun**
> deleteRun(organizationId, workspaceId, runnerId, runId)

Delete a run

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.RunApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    RunApi apiInstance = new RunApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    String runnerId = "runnerId_example"; // String | the Runner identifier
    String runId = "runId_example"; // String | the Run identifier
    try {
      apiInstance.deleteRun(organizationId, workspaceId, runnerId, runId);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunApi#deleteRun");
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
| **runnerId** | **String**| the Runner identifier | |
| **runId** | **String**| the Run identifier | |

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
| **400** | Bad request |  -  |
| **404** | the Run specified is unknown or you don&#39;t have access to it |  -  |

<a id="getRun"></a>
# **getRun**
> Run getRun(organizationId, workspaceId, runnerId, runId)

Get the details of a run

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.RunApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    RunApi apiInstance = new RunApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    String runnerId = "runnerId_example"; // String | the Runner identifier
    String runId = "runId_example"; // String | the Run identifier
    try {
      Run result = apiInstance.getRun(organizationId, workspaceId, runnerId, runId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunApi#getRun");
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
| **runnerId** | **String**| the Runner identifier | |
| **runId** | **String**| the Run identifier | |

### Return type

[**Run**](Run.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the Run details |  -  |
| **404** | the Run specified is unknown or you don&#39;t have access to it |  -  |

<a id="getRunLogs"></a>
# **getRunLogs**
> RunLogs getRunLogs(organizationId, workspaceId, runnerId, runId)

get the logs for the Run

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.RunApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    RunApi apiInstance = new RunApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    String runnerId = "runnerId_example"; // String | the Runner identifier
    String runId = "runId_example"; // String | the Run identifier
    try {
      RunLogs result = apiInstance.getRunLogs(organizationId, workspaceId, runnerId, runId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunApi#getRunLogs");
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
| **runnerId** | **String**| the Runner identifier | |
| **runId** | **String**| the Run identifier | |

### Return type

[**RunLogs**](RunLogs.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the run logs details |  -  |

<a id="getRunStatus"></a>
# **getRunStatus**
> RunStatus getRunStatus(organizationId, workspaceId, runnerId, runId)

get the status for the Run

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.RunApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    RunApi apiInstance = new RunApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    String runnerId = "runnerId_example"; // String | the Runner identifier
    String runId = "runId_example"; // String | the Run identifier
    try {
      RunStatus result = apiInstance.getRunStatus(organizationId, workspaceId, runnerId, runId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunApi#getRunStatus");
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
| **runnerId** | **String**| the Runner identifier | |
| **runId** | **String**| the Run identifier | |

### Return type

[**RunStatus**](RunStatus.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the run status details |  -  |

<a id="listRuns"></a>
# **listRuns**
> List&lt;Run&gt; listRuns(organizationId, workspaceId, runnerId, page, size)

get the list of Runs for the Runner

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.RunApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    RunApi apiInstance = new RunApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    String runnerId = "runnerId_example"; // String | the Runner identifier
    Integer page = 56; // Integer | page number to query
    Integer size = 56; // Integer | amount of result by page
    try {
      List<Run> result = apiInstance.listRuns(organizationId, workspaceId, runnerId, page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunApi#listRuns");
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
| **runnerId** | **String**| the Runner identifier | |
| **page** | **Integer**| page number to query | [optional] |
| **size** | **Integer**| amount of result by page | [optional] |

### Return type

[**List&lt;Run&gt;**](Run.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the run details list |  -  |

<a id="queryRunData"></a>
# **queryRunData**
> QueryResult queryRunData(organizationId, workspaceId, runnerId, runId, runDataQuery)

query the run data

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.RunApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    RunApi apiInstance = new RunApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    String runnerId = "runnerId_example"; // String | the Runner identifier
    String runId = "runId_example"; // String | the Run identifier
    RunDataQuery runDataQuery = new RunDataQuery(); // RunDataQuery | the query to run
    try {
      QueryResult result = apiInstance.queryRunData(organizationId, workspaceId, runnerId, runId, runDataQuery);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunApi#queryRunData");
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
| **runnerId** | **String**| the Runner identifier | |
| **runId** | **String**| the Run identifier | |
| **runDataQuery** | [**RunDataQuery**](RunDataQuery.md)| the query to run | |

### Return type

[**QueryResult**](QueryResult.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the query response |  -  |

<a id="sendRunData"></a>
# **sendRunData**
> RunData sendRunData(organizationId, workspaceId, runnerId, runId, sendRunDataRequest)

Send data associated to a run

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.RunApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    RunApi apiInstance = new RunApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    String runnerId = "runnerId_example"; // String | the Runner identifier
    String runId = "runId_example"; // String | the Run identifier
    SendRunDataRequest sendRunDataRequest = new SendRunDataRequest(); // SendRunDataRequest | Custom data to register
    try {
      RunData result = apiInstance.sendRunData(organizationId, workspaceId, runnerId, runId, sendRunDataRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunApi#sendRunData");
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
| **runnerId** | **String**| the Runner identifier | |
| **runId** | **String**| the Run identifier | |
| **sendRunDataRequest** | [**SendRunDataRequest**](SendRunDataRequest.md)| Custom data to register | |

### Return type

[**RunData**](RunData.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Data stored |  -  |
| **400** | Data sent format is malformed |  -  |

