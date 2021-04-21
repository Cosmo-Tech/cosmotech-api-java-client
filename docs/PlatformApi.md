# PlatformApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPlatform**](PlatformApi.md#createPlatform) | **POST** /platform | Create a new platform
[**getPlatform**](PlatformApi.md#getPlatform) | **GET** /platform | Get the details of the platform
[**updatePlatform**](PlatformApi.md#updatePlatform) | **PATCH** /platform | Update a platform


<a name="createPlatform"></a>
# **createPlatform**
> Platform createPlatform(platform)

Create a new platform

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.PlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    PlatformApi apiInstance = new PlatformApi(defaultClient);
    Platform platform = new Platform(); // Platform | the Platform to create
    try {
      Platform result = apiInstance.createPlatform(platform);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlatformApi#createPlatform");
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
 **platform** | [**Platform**](Platform.md)| the Platform to create |

### Return type

[**Platform**](Platform.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | the platform details |  -  |
**400** | Bad request |  -  |

<a name="getPlatform"></a>
# **getPlatform**
> Platform getPlatform()

Get the details of the platform

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.PlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    PlatformApi apiInstance = new PlatformApi(defaultClient);
    try {
      Platform result = apiInstance.getPlatform();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlatformApi#getPlatform");
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

[**Platform**](Platform.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the Platform details |  -  |

<a name="updatePlatform"></a>
# **updatePlatform**
> Platform updatePlatform(platform)

Update a platform

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.PlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    PlatformApi apiInstance = new PlatformApi(defaultClient);
    Platform platform = new Platform(); // Platform | the new Platform details.
    try {
      Platform result = apiInstance.updatePlatform(platform);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlatformApi#updatePlatform");
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
 **platform** | [**Platform**](Platform.md)| the new Platform details. |

### Return type

[**Platform**](Platform.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the platform details |  -  |
**400** | Bad request |  -  |
**404** | the Platform specified is unknown or you don&#39;t have access to it |  -  |

