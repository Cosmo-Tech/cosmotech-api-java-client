# SolutionApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSolution**](SolutionApi.md#createSolution) | **POST** /organizations/{organization_id}/solutions | Register a new solution
[**deleteSolution**](SolutionApi.md#deleteSolution) | **DELETE** /organizations/{organization_id}/solutions/{solution_id} | Delete a solution
[**findAllSolutions**](SolutionApi.md#findAllSolutions) | **GET** /organizations/{organization_id}/solutions | List all Solutions
[**findSolutionById**](SolutionApi.md#findSolutionById) | **GET** /organizations/{organization_id}/solutions/{solution_id} | Get the details of a solution
[**updateSolution**](SolutionApi.md#updateSolution) | **PATCH** /organizations/{organization_id}/solutions/{solution_id} | Update a solution
[**upload**](SolutionApi.md#upload) | **POST** /organizations/{organization_id}/solutions/upload | Upload and register a new solution


<a name="createSolution"></a>
# **createSolution**
> Solution createSolution(organizationId, solution)

Register a new solution

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.SolutionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SolutionApi apiInstance = new SolutionApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    Solution solution = new Solution(); // Solution | the Solution to create
    try {
      Solution result = apiInstance.createSolution(organizationId, solution);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SolutionApi#createSolution");
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
 **solution** | [**Solution**](Solution.md)| the Solution to create |

### Return type

[**Solution**](Solution.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | the solution details |  -  |
**400** | Bad request |  -  |

<a name="deleteSolution"></a>
# **deleteSolution**
> Solution deleteSolution(organizationId, solutionId)

Delete a solution

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.SolutionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SolutionApi apiInstance = new SolutionApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String solutionId = "solutionId_example"; // String | the Solution identifier
    try {
      Solution result = apiInstance.deleteSolution(organizationId, solutionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SolutionApi#deleteSolution");
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
 **solutionId** | **String**| the Solution identifier |

### Return type

[**Solution**](Solution.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the solution details |  -  |
**400** | Bad request |  -  |
**404** | the Solution specified is unknown or you don&#39;t have access to it |  -  |

<a name="findAllSolutions"></a>
# **findAllSolutions**
> List&lt;Solution&gt; findAllSolutions(organizationId)

List all Solutions

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.SolutionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SolutionApi apiInstance = new SolutionApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    try {
      List<Solution> result = apiInstance.findAllSolutions(organizationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SolutionApi#findAllSolutions");
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

[**List&lt;Solution&gt;**](Solution.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the solution details |  -  |

<a name="findSolutionById"></a>
# **findSolutionById**
> Solution findSolutionById(organizationId, solutionId)

Get the details of a solution

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.SolutionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SolutionApi apiInstance = new SolutionApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String solutionId = "solutionId_example"; // String | the Solution identifier
    try {
      Solution result = apiInstance.findSolutionById(organizationId, solutionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SolutionApi#findSolutionById");
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
 **solutionId** | **String**| the Solution identifier |

### Return type

[**Solution**](Solution.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the Solution details |  -  |
**404** | the Solution specified is unknown or you don&#39;t have access to it |  -  |

<a name="updateSolution"></a>
# **updateSolution**
> Solution updateSolution(organizationId, solutionId, solution)

Update a solution

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.SolutionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SolutionApi apiInstance = new SolutionApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String solutionId = "solutionId_example"; // String | the Solution identifier
    Solution solution = new Solution(); // Solution | the new Solution details.
    try {
      Solution result = apiInstance.updateSolution(organizationId, solutionId, solution);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SolutionApi#updateSolution");
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
 **solutionId** | **String**| the Solution identifier |
 **solution** | [**Solution**](Solution.md)| the new Solution details. |

### Return type

[**Solution**](Solution.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the solution details |  -  |
**400** | Bad request |  -  |
**404** | the Solution specified is unknown or you don&#39;t have access to it |  -  |

<a name="upload"></a>
# **upload**
> Solution upload(organizationId, body)

Upload and register a new solution

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.SolutionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SolutionApi apiInstance = new SolutionApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    File body = new File("/path/to/file"); // File | the Solution to upload and register
    try {
      Solution result = apiInstance.upload(organizationId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SolutionApi#upload");
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
 **body** | **File**| the Solution to upload and register |

### Return type

[**Solution**](Solution.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/yaml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | the solution details |  -  |
**400** | Bad request |  -  |

