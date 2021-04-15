# SimulationApi

All URIs are relative to *https://api.azure.cosmo-platform.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteSimulation**](SimulationApi.md#deleteSimulation) | **DELETE** /organizations/{organization_id}/simulations/{simulation_id} | Delete a simulation
[**findSimulationById**](SimulationApi.md#findSimulationById) | **GET** /organizations/{organization_id}/simulations/{simulation_id} | Get the details of a simulation
[**getScenarioSimulation**](SimulationApi.md#getScenarioSimulation) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/simulations/{simulation_id} | get the Simulation for the Scenario
[**getScenarioSimulationLogs**](SimulationApi.md#getScenarioSimulationLogs) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/simulations/{simulation_id}/logs | get the logs for the Simulation
[**getScenarioSimulations**](SimulationApi.md#getScenarioSimulations) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/simulations | get the list of Simulations for the Scenario
[**getWorkspaceSimulations**](SimulationApi.md#getWorkspaceSimulations) | **GET** /organizations/{organization_id}/workspaces/{workspace_id}/simulations | get the list of Simulations for the Workspace
[**runScenario**](SimulationApi.md#runScenario) | **POST** /organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/run | run a Simulation for the Scenario
[**searchSimulationLogs**](SimulationApi.md#searchSimulationLogs) | **POST** /organizations/{organization_id}/simulations/{simulation_id}/logs/search | Search the logs of a simulation
[**searchSimulations**](SimulationApi.md#searchSimulations) | **POST** /organizations/{organization_id}/simulations/search | Search Simulations
[**startSimulationContainers**](SimulationApi.md#startSimulationContainers) | **POST** /organizations/{organization_id}/simulations/startcontainers | Start a new simulation with raw containers definition
[**startSimulationScenario**](SimulationApi.md#startSimulationScenario) | **POST** /organizations/{organization_id}/simulations/start | Start a new simulation for a Scenario
[**startSimulationSimulator**](SimulationApi.md#startSimulationSimulator) | **POST** /organizations/{organization_id}/simulations/startsimulator | Start a new simulation for a Simulator Analysis


<a name="deleteSimulation"></a>
# **deleteSimulation**
> Simulation deleteSimulation(organizationId, simulationId)

Delete a simulation

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.SimulationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azure.cosmo-platform.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SimulationApi apiInstance = new SimulationApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String simulationId = "simulationId_example"; // String | the Simulation identifier
    try {
      Simulation result = apiInstance.deleteSimulation(organizationId, simulationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SimulationApi#deleteSimulation");
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
 **simulationId** | **String**| the Simulation identifier |

### Return type

[**Simulation**](Simulation.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the simulation details |  -  |
**400** | Bad request |  -  |
**404** | the Simulation specified is unknown or you don&#39;t have access to it |  -  |

<a name="findSimulationById"></a>
# **findSimulationById**
> Simulation findSimulationById(organizationId, simulationId)

Get the details of a simulation

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.SimulationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azure.cosmo-platform.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SimulationApi apiInstance = new SimulationApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String simulationId = "simulationId_example"; // String | the Simulation identifier
    try {
      Simulation result = apiInstance.findSimulationById(organizationId, simulationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SimulationApi#findSimulationById");
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
 **simulationId** | **String**| the Simulation identifier |

### Return type

[**Simulation**](Simulation.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the Simulation details |  -  |
**404** | the Simulation specified is unknown or you don&#39;t have access to it |  -  |

<a name="getScenarioSimulation"></a>
# **getScenarioSimulation**
> Simulation getScenarioSimulation(organizationId, workspaceId, scenarioId, simulationId)

get the Simulation for the Scenario

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.SimulationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azure.cosmo-platform.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SimulationApi apiInstance = new SimulationApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    String scenarioId = "scenarioId_example"; // String | the Scenario identifier
    String simulationId = "simulationId_example"; // String | the Simulation identifier
    try {
      Simulation result = apiInstance.getScenarioSimulation(organizationId, workspaceId, scenarioId, simulationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SimulationApi#getScenarioSimulation");
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
 **simulationId** | **String**| the Simulation identifier |

### Return type

[**Simulation**](Simulation.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the simulation details |  -  |

<a name="getScenarioSimulationLogs"></a>
# **getScenarioSimulationLogs**
> SimulationLogs getScenarioSimulationLogs(organizationId, workspaceId, scenarioId, simulationId)

get the logs for the Simulation

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.SimulationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azure.cosmo-platform.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SimulationApi apiInstance = new SimulationApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    String scenarioId = "scenarioId_example"; // String | the Scenario identifier
    String simulationId = "simulationId_example"; // String | the Simulation identifier
    try {
      SimulationLogs result = apiInstance.getScenarioSimulationLogs(organizationId, workspaceId, scenarioId, simulationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SimulationApi#getScenarioSimulationLogs");
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
 **simulationId** | **String**| the Simulation identifier |

### Return type

[**SimulationLogs**](SimulationLogs.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the simulation logs details |  -  |

<a name="getScenarioSimulations"></a>
# **getScenarioSimulations**
> List&lt;SimulationBase&gt; getScenarioSimulations(organizationId, workspaceId, scenarioId)

get the list of Simulations for the Scenario

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.SimulationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azure.cosmo-platform.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SimulationApi apiInstance = new SimulationApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    String scenarioId = "scenarioId_example"; // String | the Scenario identifier
    try {
      List<SimulationBase> result = apiInstance.getScenarioSimulations(organizationId, workspaceId, scenarioId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SimulationApi#getScenarioSimulations");
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

[**List&lt;SimulationBase&gt;**](SimulationBase.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the simulation details list |  -  |

<a name="getWorkspaceSimulations"></a>
# **getWorkspaceSimulations**
> List&lt;SimulationBase&gt; getWorkspaceSimulations(organizationId, workspaceId)

get the list of Simulations for the Workspace

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.SimulationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azure.cosmo-platform.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SimulationApi apiInstance = new SimulationApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    try {
      List<SimulationBase> result = apiInstance.getWorkspaceSimulations(organizationId, workspaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SimulationApi#getWorkspaceSimulations");
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

[**List&lt;SimulationBase&gt;**](SimulationBase.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the simulation details list |  -  |

<a name="runScenario"></a>
# **runScenario**
> SimulationBase runScenario(organizationId, workspaceId, scenarioId)

run a Simulation for the Scenario

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.SimulationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azure.cosmo-platform.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SimulationApi apiInstance = new SimulationApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String workspaceId = "workspaceId_example"; // String | the Workspace identifier
    String scenarioId = "scenarioId_example"; // String | the Scenario identifier
    try {
      SimulationBase result = apiInstance.runScenario(organizationId, workspaceId, scenarioId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SimulationApi#runScenario");
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

[**SimulationBase**](SimulationBase.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the simulation details |  -  |

<a name="searchSimulationLogs"></a>
# **searchSimulationLogs**
> SimulationLogs searchSimulationLogs(organizationId, simulationId, simulationLogsOptions)

Search the logs of a simulation

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.SimulationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azure.cosmo-platform.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SimulationApi apiInstance = new SimulationApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String simulationId = "simulationId_example"; // String | the Simulation identifier
    SimulationLogsOptions simulationLogsOptions = new SimulationLogsOptions(); // SimulationLogsOptions | the options to search logs
    try {
      SimulationLogs result = apiInstance.searchSimulationLogs(organizationId, simulationId, simulationLogsOptions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SimulationApi#searchSimulationLogs");
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
 **simulationId** | **String**| the Simulation identifier |
 **simulationLogsOptions** | [**SimulationLogsOptions**](SimulationLogsOptions.md)| the options to search logs |

### Return type

[**SimulationLogs**](SimulationLogs.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the Simulation logs |  -  |
**400** | Bad request |  -  |
**404** | the Simulation specified is unknown or you don&#39;t have access to it |  -  |

<a name="searchSimulations"></a>
# **searchSimulations**
> List&lt;SimulationBase&gt; searchSimulations(organizationId, simulationSearch)

Search Simulations

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.SimulationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azure.cosmo-platform.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SimulationApi apiInstance = new SimulationApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    SimulationSearch simulationSearch = new SimulationSearch(); // SimulationSearch | the Simulation search parameters
    try {
      List<SimulationBase> result = apiInstance.searchSimulations(organizationId, simulationSearch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SimulationApi#searchSimulations");
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
 **simulationSearch** | [**SimulationSearch**](SimulationSearch.md)| the Simulation search parameters |

### Return type

[**List&lt;SimulationBase&gt;**](SimulationBase.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the simulation details |  -  |

<a name="startSimulationContainers"></a>
# **startSimulationContainers**
> Simulation startSimulationContainers(organizationId, simulationStartContainers)

Start a new simulation with raw containers definition

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.SimulationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azure.cosmo-platform.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SimulationApi apiInstance = new SimulationApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    SimulationStartContainers simulationStartContainers = new SimulationStartContainers(); // SimulationStartContainers | the raw containers definition
    try {
      Simulation result = apiInstance.startSimulationContainers(organizationId, simulationStartContainers);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SimulationApi#startSimulationContainers");
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
 **simulationStartContainers** | [**SimulationStartContainers**](SimulationStartContainers.md)| the raw containers definition |

### Return type

[**Simulation**](Simulation.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | the simulation details |  -  |
**400** | Bad request |  -  |
**404** | the Scenario specified is unknown or you don&#39;t have access to it |  -  |

<a name="startSimulationScenario"></a>
# **startSimulationScenario**
> Simulation startSimulationScenario(organizationId, simulationStartScenario)

Start a new simulation for a Scenario

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.SimulationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azure.cosmo-platform.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SimulationApi apiInstance = new SimulationApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    SimulationStartScenario simulationStartScenario = new SimulationStartScenario(); // SimulationStartScenario | the Scenario information to start
    try {
      Simulation result = apiInstance.startSimulationScenario(organizationId, simulationStartScenario);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SimulationApi#startSimulationScenario");
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
 **simulationStartScenario** | [**SimulationStartScenario**](SimulationStartScenario.md)| the Scenario information to start |

### Return type

[**Simulation**](Simulation.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | the simulation details |  -  |
**400** | Bad request |  -  |
**404** | the Scenario specified is unknown or you don&#39;t have access to it |  -  |

<a name="startSimulationSimulator"></a>
# **startSimulationSimulator**
> Simulation startSimulationSimulator(organizationId, simulationStartSimulator)

Start a new simulation for a Simulator Analysis

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.SimulationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azure.cosmo-platform.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SimulationApi apiInstance = new SimulationApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    SimulationStartSimulator simulationStartSimulator = new SimulationStartSimulator(); // SimulationStartSimulator | the Simulator Analysis information to start
    try {
      Simulation result = apiInstance.startSimulationSimulator(organizationId, simulationStartSimulator);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SimulationApi#startSimulationSimulator");
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
 **simulationStartSimulator** | [**SimulationStartSimulator**](SimulationStartSimulator.md)| the Simulator Analysis information to start |

### Return type

[**Simulation**](Simulation.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | the simulation details |  -  |
**400** | Bad request |  -  |
**404** | the Scenario specified is unknown or you don&#39;t have access to it |  -  |

