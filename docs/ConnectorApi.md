# ConnectorApi

All URIs are relative to *https://dev.api.cosmotech.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findAllConnectors**](ConnectorApi.md#findAllConnectors) | **GET** /connectors | List all Connectors
[**findConnectorById**](ConnectorApi.md#findConnectorById) | **GET** /connectors/{connector_id} | Get the details of a connector
[**findConnectorByName**](ConnectorApi.md#findConnectorByName) | **GET** /connectors/name/{connector_name} | Get the details of a connector
[**registerConnector**](ConnectorApi.md#registerConnector) | **POST** /connectors | Register a new connector
[**unregisterConnector**](ConnectorApi.md#unregisterConnector) | **DELETE** /connectors/{connector_id} | Unregister a connector


<a name="findAllConnectors"></a>
# **findAllConnectors**
> List&lt;Connector&gt; findAllConnectors(page, size)

List all Connectors

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.ConnectorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ConnectorApi apiInstance = new ConnectorApi(defaultClient);
    Integer page = 56; // Integer | page number to query
    Integer size = 56; // Integer | amount of result by page
    try {
      List<Connector> result = apiInstance.findAllConnectors(page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorApi#findAllConnectors");
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
 **page** | **Integer**| page number to query | [optional]
 **size** | **Integer**| amount of result by page | [optional]

### Return type

[**List&lt;Connector&gt;**](Connector.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the list of Connectors |  -  |

<a name="findConnectorById"></a>
# **findConnectorById**
> Connector findConnectorById(connectorId)

Get the details of a connector

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.ConnectorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ConnectorApi apiInstance = new ConnectorApi(defaultClient);
    String connectorId = "connectorId_example"; // String | the Connector identifier
    try {
      Connector result = apiInstance.findConnectorById(connectorId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorApi#findConnectorById");
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
 **connectorId** | **String**| the Connector identifier |

### Return type

[**Connector**](Connector.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the Connector details |  -  |
**404** | the Connector specified is unknown or you don&#39;t have access to it |  -  |

<a name="findConnectorByName"></a>
# **findConnectorByName**
> Connector findConnectorByName(connectorName)

Get the details of a connector

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.ConnectorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ConnectorApi apiInstance = new ConnectorApi(defaultClient);
    String connectorName = "connectorName_example"; // String | the Connector name
    try {
      Connector result = apiInstance.findConnectorByName(connectorName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorApi#findConnectorByName");
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
 **connectorName** | **String**| the Connector name |

### Return type

[**Connector**](Connector.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the Connector details |  -  |

<a name="registerConnector"></a>
# **registerConnector**
> Connector registerConnector(connector)

Register a new connector

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.ConnectorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ConnectorApi apiInstance = new ConnectorApi(defaultClient);
    Connector connector = new Connector(); // Connector | the Connector to register
    try {
      Connector result = apiInstance.registerConnector(connector);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorApi#registerConnector");
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
 **connector** | [**Connector**](Connector.md)| the Connector to register |

### Return type

[**Connector**](Connector.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | the connector details |  -  |
**400** | Bad request |  -  |

<a name="unregisterConnector"></a>
# **unregisterConnector**
> unregisterConnector(connectorId)

Unregister a connector

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.ConnectorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ConnectorApi apiInstance = new ConnectorApi(defaultClient);
    String connectorId = "connectorId_example"; // String | the Connector identifier
    try {
      apiInstance.unregisterConnector(connectorId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorApi#unregisterConnector");
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
 **connectorId** | **String**| the Connector identifier |

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
**204** | Request successful |  -  |
**404** | the Connector specified is unknown or you don&#39;t have access to it |  -  |

