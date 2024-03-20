# ScenariorunresultApi

All URIs are relative to *https://dev.api.cosmotech.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getScenarioRunResult**](ScenariorunresultApi.md#getScenarioRunResult) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/scenarioruns/{scenariorun_id}/probes/{probe_id} | Get a ScenarioRunResult in the Organization
[**sendScenarioRunResult**](ScenariorunresultApi.md#sendScenarioRunResult) | **POST** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/scenarioruns/{scenariorun_id}/probes/{probe_id} | Create a new ScenarioRunResult in the Organization


<a name="getScenarioRunResult"></a>
# **getScenarioRunResult**
> ScenarioRunResult getScenarioRunResult(organizationId, workspaceId, scenarioId, scenariorunId, probeId)

Get a ScenarioRunResult in the Organization

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.ScenariorunresultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ScenariorunresultApi apiInstance = new ScenariorunresultApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    String scenarioId = "scenarioId_example"; // String | the Scenario identifier
    String scenariorunId = "scenariorunId_example"; // String | the ScenarioRun identifier
    String probeId = "probeId_example"; // String | the Probe identifier
    try {
      ScenarioRunResult result = apiInstance.getScenarioRunResult(organizationId, workspaceId, scenarioId, scenariorunId, probeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenariorunresultApi#getScenarioRunResult");
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
 **scenariorunId** | **String**| the ScenarioRun identifier |
 **probeId** | **String**| the Probe identifier |

### Return type

[**ScenarioRunResult**](ScenarioRunResult.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the Organization details |  -  |
**404** | the ScenarioRunResult specified is unknown or you don&#39;t have access to it |  -  |

<a name="sendScenarioRunResult"></a>
# **sendScenarioRunResult**
> ScenarioRunResult sendScenarioRunResult(organizationId, workspaceId, scenarioId, scenariorunId, probeId, requestBody)

Create a new ScenarioRunResult in the Organization

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.ScenariorunresultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ScenariorunresultApi apiInstance = new ScenariorunresultApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    String scenarioId = "scenarioId_example"; // String | the Scenario identifier
    String scenariorunId = "scenariorunId_example"; // String | the ScenarioRun identifier
    String probeId = "probeId_example"; // String | the Probe identifier
    Map<String, String> requestBody = new HashMap(); // Map<String, String> | the ScenarioRunResult to register
    try {
      ScenarioRunResult result = apiInstance.sendScenarioRunResult(organizationId, workspaceId, scenarioId, scenariorunId, probeId, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenariorunresultApi#sendScenarioRunResult");
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
 **scenariorunId** | **String**| the ScenarioRun identifier |
 **probeId** | **String**| the Probe identifier |
 **requestBody** | [**Map&lt;String, String&gt;**](String.md)| the ScenarioRunResult to register |

### Return type

[**ScenarioRunResult**](ScenarioRunResult.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the Organization details |  -  |
**400** | the ScenarioRunResult specified is unknown or you don&#39;t have access to it |  -  |

