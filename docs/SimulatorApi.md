# SimulatorApi

All URIs are relative to *https://api.azure.cosmo-platform.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSimulator**](SimulatorApi.md#createSimulator) | **POST** /organizations/{organization_id}/simulators | Register a new simulator
[**deleteSimulator**](SimulatorApi.md#deleteSimulator) | **DELETE** /organizations/{organization_id}/simulators/{simulator_id} | Delete a simulator
[**findAllSimulators**](SimulatorApi.md#findAllSimulators) | **GET** /organizations/{organization_id}/simulators | List all Simulators
[**findSimulatorById**](SimulatorApi.md#findSimulatorById) | **GET** /organizations/{organization_id}/simulators/{simulator_id} | Get the details of a simulator
[**updateSimulator**](SimulatorApi.md#updateSimulator) | **PATCH** /organizations/{organization_id}/simulators/{simulator_id} | Update a simulator
[**upload**](SimulatorApi.md#upload) | **POST** /organizations/{organization_id}/simulators/upload | Upload and register a new simulator


<a name="createSimulator"></a>
# **createSimulator**
> Simulator createSimulator(organizationId, simulator)

Register a new simulator

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.SimulatorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azure.cosmo-platform.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SimulatorApi apiInstance = new SimulatorApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    Simulator simulator = new Simulator(); // Simulator | the Simulator to create
    try {
      Simulator result = apiInstance.createSimulator(organizationId, simulator);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SimulatorApi#createSimulator");
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
 **simulator** | [**Simulator**](Simulator.md)| the Simulator to create |

### Return type

[**Simulator**](Simulator.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | the simulator details |  -  |
**400** | Bad request |  -  |

<a name="deleteSimulator"></a>
# **deleteSimulator**
> Simulator deleteSimulator(organizationId, simulatorId)

Delete a simulator

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.SimulatorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azure.cosmo-platform.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SimulatorApi apiInstance = new SimulatorApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String simulatorId = "simulatorId_example"; // String | the Simulator identifier
    try {
      Simulator result = apiInstance.deleteSimulator(organizationId, simulatorId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SimulatorApi#deleteSimulator");
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
 **simulatorId** | **String**| the Simulator identifier |

### Return type

[**Simulator**](Simulator.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the simulator details |  -  |
**400** | Bad request |  -  |
**404** | the Simulator specified is unknown or you don&#39;t have access to it |  -  |

<a name="findAllSimulators"></a>
# **findAllSimulators**
> List&lt;Simulator&gt; findAllSimulators(organizationId)

List all Simulators

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.SimulatorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azure.cosmo-platform.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SimulatorApi apiInstance = new SimulatorApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    try {
      List<Simulator> result = apiInstance.findAllSimulators(organizationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SimulatorApi#findAllSimulators");
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

[**List&lt;Simulator&gt;**](Simulator.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the simulator details |  -  |

<a name="findSimulatorById"></a>
# **findSimulatorById**
> Simulator findSimulatorById(organizationId, simulatorId)

Get the details of a simulator

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.SimulatorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azure.cosmo-platform.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SimulatorApi apiInstance = new SimulatorApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String simulatorId = "simulatorId_example"; // String | the Simulator identifier
    try {
      Simulator result = apiInstance.findSimulatorById(organizationId, simulatorId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SimulatorApi#findSimulatorById");
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
 **simulatorId** | **String**| the Simulator identifier |

### Return type

[**Simulator**](Simulator.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the Simulator details |  -  |
**404** | the Simulator specified is unknown or you don&#39;t have access to it |  -  |

<a name="updateSimulator"></a>
# **updateSimulator**
> Simulator updateSimulator(organizationId, simulatorId, simulator)

Update a simulator

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.SimulatorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azure.cosmo-platform.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SimulatorApi apiInstance = new SimulatorApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String simulatorId = "simulatorId_example"; // String | the Simulator identifier
    Simulator simulator = new Simulator(); // Simulator | the new Simulator details.
    try {
      Simulator result = apiInstance.updateSimulator(organizationId, simulatorId, simulator);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SimulatorApi#updateSimulator");
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
 **simulatorId** | **String**| the Simulator identifier |
 **simulator** | [**Simulator**](Simulator.md)| the new Simulator details. |

### Return type

[**Simulator**](Simulator.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the simulator details |  -  |
**400** | Bad request |  -  |
**404** | the Simulator specified is unknown or you don&#39;t have access to it |  -  |

<a name="upload"></a>
# **upload**
> Simulator upload(organizationId, body)

Upload and register a new simulator

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.SimulatorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azure.cosmo-platform.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SimulatorApi apiInstance = new SimulatorApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    File body = new File("/path/to/file"); // File | the Simulator to upload and register
    try {
      Simulator result = apiInstance.upload(organizationId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SimulatorApi#upload");
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
 **body** | **File**| the Simulator to upload and register |

### Return type

[**Simulator**](Simulator.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/yaml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | the simulator details |  -  |
**400** | Bad request |  -  |

