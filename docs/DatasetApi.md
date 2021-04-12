# DatasetApi

All URIs are relative to *https://api.azure.cosmo-platform.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**copyDataset**](DatasetApi.md#copyDataset) | **POST** /organizations/{organization_id}/datasets/copy | Copy a Dataset to another Dataset. Source must have a read capable connector and Target a write capable connector.
[**createDataset**](DatasetApi.md#createDataset) | **POST** /organizations/{organization_id}/datasets | Register a new dataset
[**deleteDataset**](DatasetApi.md#deleteDataset) | **DELETE** /organizations/{organization_id}/datasets/{dataset_id} | Delete a dataset
[**findAllDatasets**](DatasetApi.md#findAllDatasets) | **GET** /organizations/{organization_id}/datasets | List all Datasets
[**findDatasetById**](DatasetApi.md#findDatasetById) | **GET** /organizations/{organization_id}/datasets/{dataset_id} | Get the details of a dataset
[**updateDataset**](DatasetApi.md#updateDataset) | **PATCH** /organizations/{organization_id}/datasets/{dataset_id} | Update a dataset


<a name="copyDataset"></a>
# **copyDataset**
> DatasetCopyParameters copyDataset(organizationId, datasetCopyParameters)

Copy a Dataset to another Dataset. Source must have a read capable connector and Target a write capable connector.

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.DatasetApi;

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

    DatasetApi apiInstance = new DatasetApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    DatasetCopyParameters datasetCopyParameters = new DatasetCopyParameters(); // DatasetCopyParameters | the Dataset copy parameters
    try {
      DatasetCopyParameters result = apiInstance.copyDataset(organizationId, datasetCopyParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#copyDataset");
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
 **datasetCopyParameters** | [**DatasetCopyParameters**](DatasetCopyParameters.md)| the Dataset copy parameters |

### Return type

[**DatasetCopyParameters**](DatasetCopyParameters.md)

### Authorization

[AADOAuth2AuthCode](../README.md#AADOAuth2AuthCode), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the Dataset copy operation parameters |  -  |
**400** | Bad request |  -  |
**404** | the Dataset specified is unknown or you don&#39;t have access to it |  -  |

<a name="createDataset"></a>
# **createDataset**
> Dataset createDataset(organizationId, dataset)

Register a new dataset

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.DatasetApi;

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

    DatasetApi apiInstance = new DatasetApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    Dataset dataset = new Dataset(); // Dataset | the Dataset to create
    try {
      Dataset result = apiInstance.createDataset(organizationId, dataset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#createDataset");
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
 **dataset** | [**Dataset**](Dataset.md)| the Dataset to create |

### Return type

[**Dataset**](Dataset.md)

### Authorization

[AADOAuth2AuthCode](../README.md#AADOAuth2AuthCode), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | the dataset details |  -  |
**400** | Bad request |  -  |

<a name="deleteDataset"></a>
# **deleteDataset**
> Dataset deleteDataset(organizationId, datasetId)

Delete a dataset

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.DatasetApi;

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

    DatasetApi apiInstance = new DatasetApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String datasetId = "datasetId_example"; // String | the Dataset identifier
    try {
      Dataset result = apiInstance.deleteDataset(organizationId, datasetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#deleteDataset");
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
 **datasetId** | **String**| the Dataset identifier |

### Return type

[**Dataset**](Dataset.md)

### Authorization

[AADOAuth2AuthCode](../README.md#AADOAuth2AuthCode), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the dataset details |  -  |
**400** | Bad request |  -  |
**404** | the Dataset specified is unknown or you don&#39;t have access to it |  -  |

<a name="findAllDatasets"></a>
# **findAllDatasets**
> List&lt;Dataset&gt; findAllDatasets(organizationId)

List all Datasets

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.DatasetApi;

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

    DatasetApi apiInstance = new DatasetApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    try {
      List<Dataset> result = apiInstance.findAllDatasets(organizationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#findAllDatasets");
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

[**List&lt;Dataset&gt;**](Dataset.md)

### Authorization

[AADOAuth2AuthCode](../README.md#AADOAuth2AuthCode), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the dataset details |  -  |

<a name="findDatasetById"></a>
# **findDatasetById**
> Dataset findDatasetById(organizationId, datasetId)

Get the details of a dataset

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.DatasetApi;

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

    DatasetApi apiInstance = new DatasetApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String datasetId = "datasetId_example"; // String | the Dataset identifier
    try {
      Dataset result = apiInstance.findDatasetById(organizationId, datasetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#findDatasetById");
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
 **datasetId** | **String**| the Dataset identifier |

### Return type

[**Dataset**](Dataset.md)

### Authorization

[AADOAuth2AuthCode](../README.md#AADOAuth2AuthCode), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the Dataset details |  -  |
**404** | the Dataset specified is unknown or you don&#39;t have access to it |  -  |

<a name="updateDataset"></a>
# **updateDataset**
> Dataset updateDataset(organizationId, datasetId, dataset)

Update a dataset

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.DatasetApi;

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

    DatasetApi apiInstance = new DatasetApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String datasetId = "datasetId_example"; // String | the Dataset identifier
    Dataset dataset = new Dataset(); // Dataset | the new Dataset details.
    try {
      Dataset result = apiInstance.updateDataset(organizationId, datasetId, dataset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#updateDataset");
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
 **datasetId** | **String**| the Dataset identifier |
 **dataset** | [**Dataset**](Dataset.md)| the new Dataset details. |

### Return type

[**Dataset**](Dataset.md)

### Authorization

[AADOAuth2AuthCode](../README.md#AADOAuth2AuthCode), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the dataset details |  -  |
**400** | Bad request |  -  |
**404** | the Dataset specified is unknown or you don&#39;t have access to it |  -  |

