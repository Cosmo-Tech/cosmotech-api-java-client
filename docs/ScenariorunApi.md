# ScenariorunApi

All URIs are relative to *https://api.cosmotech.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteScenarioRun**](ScenariorunApi.md#deleteScenarioRun) | **DELETE** /organizations/{organization_id}/scenarioruns/{scenariorun_id} | Delete a scenariorun
[**findScenarioRunById**](ScenariorunApi.md#findScenarioRunById) | **GET** /organizations/{organization_id}/scenarioruns/{scenariorun_id} | Get the details of a scenariorun
[**getScenarioRunCumulatedLogs**](ScenariorunApi.md#getScenarioRunCumulatedLogs) | **GET** /organizations/{organization_id}/scenarioruns/{scenariorun_id}/cumulatedlogs | Get the cumulated logs of a scenariorun
[**getScenarioRunLogs**](ScenariorunApi.md#getScenarioRunLogs) | **GET** /organizations/{organization_id}/scenarioruns/{scenariorun_id}/logs | get the logs for the ScenarioRun
[**getScenarioRunStatus**](ScenariorunApi.md#getScenarioRunStatus) | **GET** /organizations/{organization_id}/scenarioruns/{scenariorun_id}/status | get the status for the ScenarioRun
[**getScenarioRuns**](ScenariorunApi.md#getScenarioRuns) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/scenarioruns | get the list of ScenarioRuns for the Scenario
[**getWorkspaceScenarioRuns**](ScenariorunApi.md#getWorkspaceScenarioRuns) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/scenarioruns | get the list of ScenarioRuns for the Workspace
[**runScenario**](ScenariorunApi.md#runScenario) | **POST** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/run | run a ScenarioRun for the Scenario
[**searchScenarioRuns**](ScenariorunApi.md#searchScenarioRuns) | **POST** /organizations/{organization_id}/scenarioruns/search | Search ScenarioRuns
[**startScenarioRunContainers**](ScenariorunApi.md#startScenarioRunContainers) | **POST** /organizations/{organization_id}/scenarioruns/startcontainers | Start a new scenariorun with raw containers definition


<a name="deleteScenarioRun"></a>
# **deleteScenarioRun**
> deleteScenarioRun(organizationId, scenariorunId)

Delete a scenariorun

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.ScenariorunApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ScenariorunApi apiInstance = new ScenariorunApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String scenariorunId = "scenariorunId_example"; // String | the ScenarioRun identifier
    try {
      apiInstance.deleteScenarioRun(organizationId, scenariorunId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenariorunApi#deleteScenarioRun");
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
 **scenariorunId** | **String**| the ScenarioRun identifier |

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
**400** | Bad request |  -  |
**404** | the ScenarioRun specified is unknown or you don&#39;t have access to it |  -  |

<a name="findScenarioRunById"></a>
# **findScenarioRunById**
> ScenarioRun findScenarioRunById(organizationId, scenariorunId)

Get the details of a scenariorun

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.ScenariorunApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ScenariorunApi apiInstance = new ScenariorunApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String scenariorunId = "scenariorunId_example"; // String | the ScenarioRun identifier
    try {
      ScenarioRun result = apiInstance.findScenarioRunById(organizationId, scenariorunId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenariorunApi#findScenarioRunById");
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
 **scenariorunId** | **String**| the ScenarioRun identifier |

### Return type

[**ScenarioRun**](ScenarioRun.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the ScenarioRun details |  -  |
**404** | the ScenarioRun specified is unknown or you don&#39;t have access to it |  -  |

<a name="getScenarioRunCumulatedLogs"></a>
# **getScenarioRunCumulatedLogs**
> String getScenarioRunCumulatedLogs(organizationId, scenariorunId)

Get the cumulated logs of a scenariorun

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.ScenariorunApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ScenariorunApi apiInstance = new ScenariorunApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String scenariorunId = "scenariorunId_example"; // String | the ScenarioRun identifier
    try {
      String result = apiInstance.getScenarioRunCumulatedLogs(organizationId, scenariorunId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenariorunApi#getScenarioRunCumulatedLogs");
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
 **scenariorunId** | **String**| the ScenarioRun identifier |

### Return type

**String**

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the ScenarioRun cumulated logs |  -  |
**400** | Bad request |  -  |
**404** | the ScenarioRun specified is unknown or you don&#39;t have access to it |  -  |

<a name="getScenarioRunLogs"></a>
# **getScenarioRunLogs**
> ScenarioRunLogs getScenarioRunLogs(organizationId, scenariorunId)

get the logs for the ScenarioRun

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.ScenariorunApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ScenariorunApi apiInstance = new ScenariorunApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String scenariorunId = "scenariorunId_example"; // String | the ScenarioRun identifier
    try {
      ScenarioRunLogs result = apiInstance.getScenarioRunLogs(organizationId, scenariorunId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenariorunApi#getScenarioRunLogs");
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
 **scenariorunId** | **String**| the ScenarioRun identifier |

### Return type

[**ScenarioRunLogs**](ScenarioRunLogs.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the scenariorun logs details |  -  |

<a name="getScenarioRunStatus"></a>
# **getScenarioRunStatus**
> ScenarioRunStatus getScenarioRunStatus(organizationId, scenariorunId)

get the status for the ScenarioRun

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.ScenariorunApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ScenariorunApi apiInstance = new ScenariorunApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String scenariorunId = "scenariorunId_example"; // String | the ScenarioRun identifier
    try {
      ScenarioRunStatus result = apiInstance.getScenarioRunStatus(organizationId, scenariorunId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenariorunApi#getScenarioRunStatus");
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
 **scenariorunId** | **String**| the ScenarioRun identifier |

### Return type

[**ScenarioRunStatus**](ScenarioRunStatus.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the scenariorun status details |  -  |

<a name="getScenarioRuns"></a>
# **getScenarioRuns**
> List&lt;ScenarioRun&gt; getScenarioRuns(organizationId, workspaceId, scenarioId)

get the list of ScenarioRuns for the Scenario

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.ScenariorunApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ScenariorunApi apiInstance = new ScenariorunApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    String scenarioId = "scenarioId_example"; // String | the Scenario identifier
    try {
      List<ScenarioRun> result = apiInstance.getScenarioRuns(organizationId, workspaceId, scenarioId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenariorunApi#getScenarioRuns");
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
 **scenarioId** | **String**| the Scenario identifier |

### Return type

[**List&lt;ScenarioRun&gt;**](ScenarioRun.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the scenariorun details list |  -  |

<a name="getWorkspaceScenarioRuns"></a>
# **getWorkspaceScenarioRuns**
> List&lt;ScenarioRun&gt; getWorkspaceScenarioRuns(organizationId, workspaceId)

get the list of ScenarioRuns for the Workspace

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.ScenariorunApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ScenariorunApi apiInstance = new ScenariorunApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    try {
      List<ScenarioRun> result = apiInstance.getWorkspaceScenarioRuns(organizationId, workspaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenariorunApi#getWorkspaceScenarioRuns");
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

[**List&lt;ScenarioRun&gt;**](ScenarioRun.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the scenariorun details list |  -  |

<a name="runScenario"></a>
# **runScenario**
> ScenarioRun runScenario(organizationId, workspaceId, scenarioId)

run a ScenarioRun for the Scenario

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.ScenariorunApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ScenariorunApi apiInstance = new ScenariorunApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    String scenarioId = "scenarioId_example"; // String | the Scenario identifier
    try {
      ScenarioRun result = apiInstance.runScenario(organizationId, workspaceId, scenarioId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenariorunApi#runScenario");
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
 **scenarioId** | **String**| the Scenario identifier |

### Return type

[**ScenarioRun**](ScenarioRun.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the scenariorun details |  -  |

<a name="searchScenarioRuns"></a>
# **searchScenarioRuns**
> List&lt;ScenarioRun&gt; searchScenarioRuns(organizationId, scenarioRunSearch)

Search ScenarioRuns

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.ScenariorunApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ScenariorunApi apiInstance = new ScenariorunApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    ScenarioRunSearch scenarioRunSearch = new ScenarioRunSearch(); // ScenarioRunSearch | the ScenarioRun search parameters
    try {
      List<ScenarioRun> result = apiInstance.searchScenarioRuns(organizationId, scenarioRunSearch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenariorunApi#searchScenarioRuns");
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
 **scenarioRunSearch** | [**ScenarioRunSearch**](ScenarioRunSearch.md)| the ScenarioRun search parameters |

### Return type

[**List&lt;ScenarioRun&gt;**](ScenarioRun.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the scenariorun details |  -  |

<a name="startScenarioRunContainers"></a>
# **startScenarioRunContainers**
> ScenarioRun startScenarioRunContainers(organizationId, scenarioRunStartContainers)

Start a new scenariorun with raw containers definition

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.ScenariorunApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ScenariorunApi apiInstance = new ScenariorunApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    ScenarioRunStartContainers scenarioRunStartContainers = new ScenarioRunStartContainers(); // ScenarioRunStartContainers | the raw containers definition
    try {
      ScenarioRun result = apiInstance.startScenarioRunContainers(organizationId, scenarioRunStartContainers);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenariorunApi#startScenarioRunContainers");
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
 **scenarioRunStartContainers** | [**ScenarioRunStartContainers**](ScenarioRunStartContainers.md)| the raw containers definition |

### Return type

[**ScenarioRun**](ScenarioRun.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | the scenariorun details |  -  |
**400** | Bad request |  -  |
**404** | the Scenario specified is unknown or you don&#39;t have access to it |  -  |

