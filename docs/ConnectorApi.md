# ConnectorApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findAllConnectors**](ConnectorApi.md#findAllConnectors) | **GET** /connectors | List all Connectors
[**findConnectorById**](ConnectorApi.md#findConnectorById) | **GET** /connectors/{connector_id} | Get the details of an connector
[**registerConnector**](ConnectorApi.md#registerConnector) | **POST** /connectors | Register a new connector
[**unregisterConnector**](ConnectorApi.md#unregisterConnector) | **DELETE** /connectors/{connector_id} | Unregister an connector
[**uploadConnector**](ConnectorApi.md#uploadConnector) | **POST** /connectors/upload | Upload and register a new connector


<a name="findAllConnectors"></a>
# **findAllConnectors**
> List&lt;Connector&gt; findAllConnectors()

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
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ConnectorApi apiInstance = new ConnectorApi(defaultClient);
    try {
      List<Connector> result = apiInstance.findAllConnectors();
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
This endpoint does not need any parameter.

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
**200** | the connector details |  -  |

<a name="findConnectorById"></a>
# **findConnectorById**
> Connector findConnectorById(connectorId)

Get the details of an connector

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
    defaultClient.setBasePath("http://localhost:8080");
    
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
    defaultClient.setBasePath("http://localhost:8080");
    
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

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | the connector details |  -  |
**400** | Bad request |  -  |

<a name="unregisterConnector"></a>
# **unregisterConnector**
> Connector unregisterConnector(connectorId)

Unregister an connector

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
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ConnectorApi apiInstance = new ConnectorApi(defaultClient);
    String connectorId = "connectorId_example"; // String | the Connector identifier
    try {
      Connector result = apiInstance.unregisterConnector(connectorId);
      System.out.println(result);
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

[**Connector**](Connector.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the connector details |  -  |
**400** | Bad request |  -  |
**404** | the Connector specified is unknown or you don&#39;t have access to it |  -  |

<a name="uploadConnector"></a>
# **uploadConnector**
> Connector uploadConnector(body)

Upload and register a new connector

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
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ConnectorApi apiInstance = new ConnectorApi(defaultClient);
    File body = new File("/path/to/file"); // File | the Connector to upload and register
    try {
      Connector result = apiInstance.uploadConnector(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorApi#uploadConnector");
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
 **body** | **File**| the Connector to upload and register |

### Return type

[**Connector**](Connector.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/yaml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | the connector details |  -  |
**400** | Bad request |  -  |

