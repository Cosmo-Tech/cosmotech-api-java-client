# ScenarioApi

All URIs are relative to *https://dev.api.cosmotech.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOrReplaceScenarioParameterValues**](ScenarioApi.md#addOrReplaceScenarioParameterValues) | **POST** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/parameterValues | Add (or replace) Parameter Values for the Scenario specified
[**addOrReplaceUsersInScenario**](ScenarioApi.md#addOrReplaceUsersInScenario) | **POST** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/users | Add (or replace) users in the Scenario specified
[**compareScenarios**](ScenarioApi.md#compareScenarios) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/compare/{compared_scenario_id} | Compare the Scenario with another one and returns the difference for parameters values
[**createScenario**](ScenarioApi.md#createScenario) | **POST** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios | Create a new Scenario
[**deleteAllScenarios**](ScenarioApi.md#deleteAllScenarios) | **DELETE** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios | Delete all Scenarios of the Workspace
[**deleteScenario**](ScenarioApi.md#deleteScenario) | **DELETE** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id} | Delete a scenario
[**downloadScenarioData**](ScenarioApi.md#downloadScenarioData) | **POST** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/downloads | Download Scenario data
[**findAllScenarios**](ScenarioApi.md#findAllScenarios) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios | List all Scenarios
[**findScenarioById**](ScenarioApi.md#findScenarioById) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id} | Get the details of an scenario
[**getScenarioDataDownloadJobInfo**](ScenarioApi.md#getScenarioDataDownloadJobInfo) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/downloads/{download_id} | Get Scenario data download URL
[**getScenariosTree**](ScenarioApi.md#getScenariosTree) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/tree | Get the Scenarios Tree
[**removeAllScenarioParameterValues**](ScenarioApi.md#removeAllScenarioParameterValues) | **DELETE** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/parameterValues | Remove all Parameter Values from the Scenario specified
[**removeAllUsersOfScenario**](ScenarioApi.md#removeAllUsersOfScenario) | **DELETE** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/users | Remove all users from the Scenario specified
[**removeUserFromScenario**](ScenarioApi.md#removeUserFromScenario) | **DELETE** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/users/{user_id} | Remove the specified user from the given Scenario
[**updateScenario**](ScenarioApi.md#updateScenario) | **PATCH** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id} | Update a scenario


<a name="addOrReplaceScenarioParameterValues"></a>
# **addOrReplaceScenarioParameterValues**
> List&lt;ScenarioRunTemplateParameterValue&gt; addOrReplaceScenarioParameterValues(organizationId, workspaceId, scenarioId, scenarioRunTemplateParameterValue)

Add (or replace) Parameter Values for the Scenario specified

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.ScenarioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ScenarioApi apiInstance = new ScenarioApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    String scenarioId = "scenarioId_example"; // String | the Scenario identifier
    List<ScenarioRunTemplateParameterValue> scenarioRunTemplateParameterValue = Arrays.asList(); // List<ScenarioRunTemplateParameterValue> | the Parameter Value to add. Any Parameter Value with the same ID is overwritten
    try {
      List<ScenarioRunTemplateParameterValue> result = apiInstance.addOrReplaceScenarioParameterValues(organizationId, workspaceId, scenarioId, scenarioRunTemplateParameterValue);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioApi#addOrReplaceScenarioParameterValues");
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
 **scenarioRunTemplateParameterValue** | [**List&lt;ScenarioRunTemplateParameterValue&gt;**](ScenarioRunTemplateParameterValue.md)| the Parameter Value to add. Any Parameter Value with the same ID is overwritten |

### Return type

[**List&lt;ScenarioRunTemplateParameterValue&gt;**](ScenarioRunTemplateParameterValue.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | the Parameter values |  -  |
**400** | Bad request |  -  |
**404** | the Scenario specified is unknown or you don&#39;t have access to it |  -  |

<a name="addOrReplaceUsersInScenario"></a>
# **addOrReplaceUsersInScenario**
> List&lt;ScenarioUser&gt; addOrReplaceUsersInScenario(organizationId, workspaceId, scenarioId, scenarioUser)

Add (or replace) users in the Scenario specified

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.ScenarioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ScenarioApi apiInstance = new ScenarioApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    String scenarioId = "scenarioId_example"; // String | the Scenario identifier
    List<ScenarioUser> scenarioUser = Arrays.asList(); // List<ScenarioUser> | the Users to add. Any User with the same ID is overwritten
    try {
      List<ScenarioUser> result = apiInstance.addOrReplaceUsersInScenario(organizationId, workspaceId, scenarioId, scenarioUser);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioApi#addOrReplaceUsersInScenario");
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
 **scenarioUser** | [**List&lt;ScenarioUser&gt;**](ScenarioUser.md)| the Users to add. Any User with the same ID is overwritten |

### Return type

[**List&lt;ScenarioUser&gt;**](ScenarioUser.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | the Scenario Users |  -  |
**400** | Bad request |  -  |
**404** | the Scenario specified is unknown or you don&#39;t have access to it |  -  |

<a name="compareScenarios"></a>
# **compareScenarios**
> ScenarioComparisonResult compareScenarios(organizationId, workspaceId, scenarioId, comparedScenarioId)

Compare the Scenario with another one and returns the difference for parameters values

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.ScenarioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ScenarioApi apiInstance = new ScenarioApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    String scenarioId = "scenarioId_example"; // String | the Scenario identifier
    String comparedScenarioId = "comparedScenarioId_example"; // String | the Scenario identifier to compare to
    try {
      ScenarioComparisonResult result = apiInstance.compareScenarios(organizationId, workspaceId, scenarioId, comparedScenarioId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioApi#compareScenarios");
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
 **comparedScenarioId** | **String**| the Scenario identifier to compare to |

### Return type

[**ScenarioComparisonResult**](ScenarioComparisonResult.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the comparison result for parameters values |  -  |
**404** | one of the Scenarios specified is unknown or you don&#39;t have access to it |  -  |

<a name="createScenario"></a>
# **createScenario**
> Scenario createScenario(organizationId, workspaceId, scenario)

Create a new Scenario

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.ScenarioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ScenarioApi apiInstance = new ScenarioApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    Scenario scenario = new Scenario(); // Scenario | the Scenario to create
    try {
      Scenario result = apiInstance.createScenario(organizationId, workspaceId, scenario);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioApi#createScenario");
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
 **scenario** | [**Scenario**](Scenario.md)| the Scenario to create |

### Return type

[**Scenario**](Scenario.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | the scenario details |  -  |
**400** | Bad request |  -  |

<a name="deleteAllScenarios"></a>
# **deleteAllScenarios**
> deleteAllScenarios(organizationId, workspaceId)

Delete all Scenarios of the Workspace

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.ScenarioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ScenarioApi apiInstance = new ScenarioApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    try {
      apiInstance.deleteAllScenarios(organizationId, workspaceId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioApi#deleteAllScenarios");
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
**404** | the Scenario specified is unknown or you don&#39;t have access to it |  -  |

<a name="deleteScenario"></a>
# **deleteScenario**
> deleteScenario(organizationId, workspaceId, scenarioId, waitRelationshipPropagation)

Delete a scenario

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.ScenarioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ScenarioApi apiInstance = new ScenarioApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    String scenarioId = "scenarioId_example"; // String | the Scenario identifier
    Boolean waitRelationshipPropagation = false; // Boolean | whether to wait until child scenarios are effectively updated
    try {
      apiInstance.deleteScenario(organizationId, workspaceId, scenarioId, waitRelationshipPropagation);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioApi#deleteScenario");
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
 **waitRelationshipPropagation** | **Boolean**| whether to wait until child scenarios are effectively updated | [optional] [default to false]

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
**404** | the Scenario specified is unknown or you don&#39;t have access to it |  -  |

<a name="downloadScenarioData"></a>
# **downloadScenarioData**
> ScenarioDataDownloadJob downloadScenarioData(organizationId, workspaceId, scenarioId)

Download Scenario data

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.ScenarioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ScenarioApi apiInstance = new ScenarioApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    String scenarioId = "scenarioId_example"; // String | the Scenario identifier
    try {
      ScenarioDataDownloadJob result = apiInstance.downloadScenarioData(organizationId, workspaceId, scenarioId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioApi#downloadScenarioData");
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

[**ScenarioDataDownloadJob**](ScenarioDataDownloadJob.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | the Scenario Data response, once acknowledged. |  -  |
**404** | the Scenario specified is unknown or you don&#39;t have access to it |  -  |

<a name="findAllScenarios"></a>
# **findAllScenarios**
> List&lt;Scenario&gt; findAllScenarios(organizationId, workspaceId)

List all Scenarios

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.ScenarioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ScenarioApi apiInstance = new ScenarioApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    try {
      List<Scenario> result = apiInstance.findAllScenarios(organizationId, workspaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioApi#findAllScenarios");
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

[**List&lt;Scenario&gt;**](Scenario.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the list of Scenarios |  -  |

<a name="findScenarioById"></a>
# **findScenarioById**
> Scenario findScenarioById(organizationId, workspaceId, scenarioId)

Get the details of an scenario

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.ScenarioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ScenarioApi apiInstance = new ScenarioApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    String scenarioId = "scenarioId_example"; // String | the Scenario identifier
    try {
      Scenario result = apiInstance.findScenarioById(organizationId, workspaceId, scenarioId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioApi#findScenarioById");
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

[**Scenario**](Scenario.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the Scenario details |  -  |
**404** | the Scenario specified is unknown or you don&#39;t have access to it |  -  |

<a name="getScenarioDataDownloadJobInfo"></a>
# **getScenarioDataDownloadJobInfo**
> ScenarioDataDownloadInfo getScenarioDataDownloadJobInfo(organizationId, workspaceId, scenarioId, downloadId)

Get Scenario data download URL

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.ScenarioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ScenarioApi apiInstance = new ScenarioApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    String scenarioId = "scenarioId_example"; // String | the Scenario identifier
    String downloadId = "downloadId_example"; // String | the Scenario Download identifier
    try {
      ScenarioDataDownloadInfo result = apiInstance.getScenarioDataDownloadJobInfo(organizationId, workspaceId, scenarioId, downloadId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioApi#getScenarioDataDownloadJobInfo");
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
 **downloadId** | **String**| the Scenario Download identifier |

### Return type

[**ScenarioDataDownloadInfo**](ScenarioDataDownloadInfo.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the scenario data download URL. |  -  |
**404** | the Scenario specified is unknown or you don&#39;t have access to it |  -  |

<a name="getScenariosTree"></a>
# **getScenariosTree**
> List&lt;Scenario&gt; getScenariosTree(organizationId, workspaceId)

Get the Scenarios Tree

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.ScenarioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ScenarioApi apiInstance = new ScenarioApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    try {
      List<Scenario> result = apiInstance.getScenariosTree(organizationId, workspaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioApi#getScenariosTree");
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

[**List&lt;Scenario&gt;**](Scenario.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the scenario tree |  -  |

<a name="removeAllScenarioParameterValues"></a>
# **removeAllScenarioParameterValues**
> removeAllScenarioParameterValues(organizationId, workspaceId, scenarioId)

Remove all Parameter Values from the Scenario specified

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.ScenarioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ScenarioApi apiInstance = new ScenarioApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    String scenarioId = "scenarioId_example"; // String | the Scenario identifier
    try {
      apiInstance.removeAllScenarioParameterValues(organizationId, workspaceId, scenarioId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioApi#removeAllScenarioParameterValues");
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
**404** | the Scenario specified is unknown or you don&#39;t have access to it |  -  |

<a name="removeAllUsersOfScenario"></a>
# **removeAllUsersOfScenario**
> removeAllUsersOfScenario(organizationId, workspaceId, scenarioId)

Remove all users from the Scenario specified

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.ScenarioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ScenarioApi apiInstance = new ScenarioApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    String scenarioId = "scenarioId_example"; // String | the Scenario identifier
    try {
      apiInstance.removeAllUsersOfScenario(organizationId, workspaceId, scenarioId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioApi#removeAllUsersOfScenario");
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
**404** | the Scenario specified is unknown or you don&#39;t have access to it |  -  |

<a name="removeUserFromScenario"></a>
# **removeUserFromScenario**
> removeUserFromScenario(organizationId, workspaceId, scenarioId, userId)

Remove the specified user from the given Scenario

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.ScenarioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ScenarioApi apiInstance = new ScenarioApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    String scenarioId = "scenarioId_example"; // String | the Scenario identifier
    String userId = "userId_example"; // String | the User identifier
    try {
      apiInstance.removeUserFromScenario(organizationId, workspaceId, scenarioId, userId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioApi#removeUserFromScenario");
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
**404** | the Scenario or the User specified is unknown or you don&#39;t have access to them |  -  |

<a name="updateScenario"></a>
# **updateScenario**
> Scenario updateScenario(organizationId, workspaceId, scenarioId, scenario)

Update a scenario

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.ScenarioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ScenarioApi apiInstance = new ScenarioApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    String scenarioId = "scenarioId_example"; // String | the Scenario identifier
    Scenario scenario = new Scenario(); // Scenario | the new Scenario details.
    try {
      Scenario result = apiInstance.updateScenario(organizationId, workspaceId, scenarioId, scenario);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenarioApi#updateScenario");
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
 **scenario** | [**Scenario**](Scenario.md)| the new Scenario details. |

### Return type

[**Scenario**](Scenario.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the scenario details |  -  |
**400** | Bad request |  -  |
**404** | the Scenario specified is unknown or you don&#39;t have access to it |  -  |

