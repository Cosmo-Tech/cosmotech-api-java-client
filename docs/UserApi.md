# UserApi

All URIs are relative to *https://api.azure.cosmo-platform.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findAllUsers**](UserApi.md#findAllUsers) | **GET** /users | List all Users
[**findUserById**](UserApi.md#findUserById) | **GET** /users/{user_id} | Get the details of an user
[**registerUser**](UserApi.md#registerUser) | **POST** /users | Register a new user
[**unregisterUser**](UserApi.md#unregisterUser) | **DELETE** /users/{user_id} | Unregister an user
[**updateUser**](UserApi.md#updateUser) | **PATCH** /users/{user_id} | Update an user


<a name="findAllUsers"></a>
# **findAllUsers**
> List&lt;UserDetails&gt; findAllUsers()

List all Users

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azure.cosmo-platform.com");
    
    // Configure OAuth2 access token for authorization: AADOAuth2AuthCode
    OAuth AADOAuth2AuthCode = (OAuth) defaultClient.getAuthentication("AADOAuth2AuthCode");
    AADOAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    UserApi apiInstance = new UserApi(defaultClient);
    try {
      List<UserDetails> result = apiInstance.findAllUsers();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#findAllUsers");
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

[**List&lt;UserDetails&gt;**](UserDetails.md)

### Authorization

[AADOAuth2AuthCode](../README.md#AADOAuth2AuthCode), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the user details |  -  |

<a name="findUserById"></a>
# **findUserById**
> UserDetails findUserById(userId)

Get the details of an user

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azure.cosmo-platform.com");
    
    // Configure OAuth2 access token for authorization: AADOAuth2AuthCode
    OAuth AADOAuth2AuthCode = (OAuth) defaultClient.getAuthentication("AADOAuth2AuthCode");
    AADOAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    UserApi apiInstance = new UserApi(defaultClient);
    String userId = "userId_example"; // String | the User identifier
    try {
      UserDetails result = apiInstance.findUserById(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#findUserById");
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
 **userId** | **String**| the User identifier |

### Return type

[**UserDetails**](UserDetails.md)

### Authorization

[AADOAuth2AuthCode](../README.md#AADOAuth2AuthCode), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the User details |  -  |
**404** | the User specified is unknown or you don&#39;t have access to it |  -  |

<a name="registerUser"></a>
# **registerUser**
> UserDetails registerUser(user)

Register a new user

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azure.cosmo-platform.com");
    
    // Configure OAuth2 access token for authorization: AADOAuth2AuthCode
    OAuth AADOAuth2AuthCode = (OAuth) defaultClient.getAuthentication("AADOAuth2AuthCode");
    AADOAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    UserApi apiInstance = new UserApi(defaultClient);
    User user = new User(); // User | the User to register
    try {
      UserDetails result = apiInstance.registerUser(user);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#registerUser");
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
 **user** | [**User**](User.md)| the User to register |

### Return type

[**UserDetails**](UserDetails.md)

### Authorization

[AADOAuth2AuthCode](../README.md#AADOAuth2AuthCode), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | the user details |  -  |
**400** | Bad request |  -  |

<a name="unregisterUser"></a>
# **unregisterUser**
> UserDetails unregisterUser(userId)

Unregister an user

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azure.cosmo-platform.com");
    
    // Configure OAuth2 access token for authorization: AADOAuth2AuthCode
    OAuth AADOAuth2AuthCode = (OAuth) defaultClient.getAuthentication("AADOAuth2AuthCode");
    AADOAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    UserApi apiInstance = new UserApi(defaultClient);
    String userId = "userId_example"; // String | the User identifier
    try {
      UserDetails result = apiInstance.unregisterUser(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#unregisterUser");
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
 **userId** | **String**| the User identifier |

### Return type

[**UserDetails**](UserDetails.md)

### Authorization

[AADOAuth2AuthCode](../README.md#AADOAuth2AuthCode), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the user details |  -  |
**400** | Bad request |  -  |
**404** | the User specified is unknown or you don&#39;t have access to it |  -  |

<a name="updateUser"></a>
# **updateUser**
> UserDetails updateUser(userId, user)

Update an user

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.azure.cosmo-platform.com");
    
    // Configure OAuth2 access token for authorization: AADOAuth2AuthCode
    OAuth AADOAuth2AuthCode = (OAuth) defaultClient.getAuthentication("AADOAuth2AuthCode");
    AADOAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    UserApi apiInstance = new UserApi(defaultClient);
    String userId = "userId_example"; // String | the User identifier
    User user = new User(); // User | the new User details. Organization membership is handled in Organzation service.
    try {
      UserDetails result = apiInstance.updateUser(userId, user);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updateUser");
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
 **userId** | **String**| the User identifier |
 **user** | [**User**](User.md)| the new User details. Organization membership is handled in Organzation service. |

### Return type

[**UserDetails**](UserDetails.md)

### Authorization

[AADOAuth2AuthCode](../README.md#AADOAuth2AuthCode), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the user details |  -  |
**400** | Bad request |  -  |
**404** | the User specified is unknown or you don&#39;t have access to it |  -  |

