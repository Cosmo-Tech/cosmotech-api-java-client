# DatasetApi

All URIs are relative to *https://dev.api.cosmotech.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOrReplaceDatasetCompatibilityElements**](DatasetApi.md#addOrReplaceDatasetCompatibilityElements) | **POST** /organizations/{organization_id}/datasets/{dataset_id}/compatibility | Add Dataset Compatibility elements.
[**copyDataset**](DatasetApi.md#copyDataset) | **POST** /organizations/{organization_id}/datasets/copy | Copy a Dataset to another Dataset. Source must have a read capable connector and Target a write capable connector.
[**createDataset**](DatasetApi.md#createDataset) | **POST** /organizations/{organization_id}/datasets | Create a new Dataset
[**deleteDataset**](DatasetApi.md#deleteDataset) | **DELETE** /organizations/{organization_id}/datasets/{dataset_id} | Delete a dataset
[**findAllDatasets**](DatasetApi.md#findAllDatasets) | **GET** /organizations/{organization_id}/datasets | List all Datasets
[**findDatasetById**](DatasetApi.md#findDatasetById) | **GET** /organizations/{organization_id}/datasets/{dataset_id} | Get the details of a Dataset
[**importDataset**](DatasetApi.md#importDataset) | **POST** /organizations/{organization_id}/datasets/import | Import a new Dataset
[**removeAllDatasetCompatibilityElements**](DatasetApi.md#removeAllDatasetCompatibilityElements) | **DELETE** /organizations/{organization_id}/datasets/{dataset_id}/compatibility | Remove all Dataset Compatibility elements from the Dataset specified
[**searchDatasets**](DatasetApi.md#searchDatasets) | **POST** /organizations/{organization_id}/datasets/search | Search Datasets
[**updateDataset**](DatasetApi.md#updateDataset) | **PATCH** /organizations/{organization_id}/datasets/{dataset_id} | Update a dataset


<a name="addOrReplaceDatasetCompatibilityElements"></a>
# **addOrReplaceDatasetCompatibilityElements**
> List&lt;DatasetCompatibility&gt; addOrReplaceDatasetCompatibilityElements(organizationId, datasetId, datasetCompatibility)

Add Dataset Compatibility elements.

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
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    DatasetApi apiInstance = new DatasetApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String datasetId = "datasetId_example"; // String | the Dataset identifier
    List<DatasetCompatibility> datasetCompatibility = Arrays.asList(); // List<DatasetCompatibility> | the Dataset Compatibility elements
    try {
      List<DatasetCompatibility> result = apiInstance.addOrReplaceDatasetCompatibilityElements(organizationId, datasetId, datasetCompatibility);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#addOrReplaceDatasetCompatibilityElements");
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
 **datasetCompatibility** | [**List&lt;DatasetCompatibility&gt;**](DatasetCompatibility.md)| the Dataset Compatibility elements |

### Return type

[**List&lt;DatasetCompatibility&gt;**](DatasetCompatibility.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | the Dataset Compatibility elements |  -  |
**400** | Bad request |  -  |
**404** | the Dataset specified is unknown or you don&#39;t have access to it |  -  |

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
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

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

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | the Dataset copy operation parameters |  -  |
**400** | Bad request |  -  |
**404** | the Dataset specified as Source or Target is unknown or you don&#39;t have access to it |  -  |

<a name="createDataset"></a>
# **createDataset**
> Dataset createDataset(organizationId, dataset)

Create a new Dataset

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
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

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

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | the dataset details |  -  |
**400** | Bad request |  -  |

<a name="deleteDataset"></a>
# **deleteDataset**
> deleteDataset(organizationId, datasetId)

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
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    DatasetApi apiInstance = new DatasetApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String datasetId = "datasetId_example"; // String | the Dataset identifier
    try {
      apiInstance.deleteDataset(organizationId, datasetId);
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
**404** | the Dataset specified is unknown or you don&#39;t have access to it |  -  |

<a name="findAllDatasets"></a>
# **findAllDatasets**
> List&lt;Dataset&gt; findAllDatasets(organizationId, page, size)

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
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    DatasetApi apiInstance = new DatasetApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    Integer page = 56; // Integer | page number to query
    Integer size = 56; // Integer | amount of result by page
    try {
      List<Dataset> result = apiInstance.findAllDatasets(organizationId, page, size);
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
 **page** | **Integer**| page number to query | [optional]
 **size** | **Integer**| amount of result by page | [optional]

### Return type

[**List&lt;Dataset&gt;**](Dataset.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the list of Datasets |  -  |

<a name="findDatasetById"></a>
# **findDatasetById**
> Dataset findDatasetById(organizationId, datasetId)

Get the details of a Dataset

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
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

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

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the Dataset details |  -  |
**404** | the Dataset specified is unknown or you don&#39;t have access to it |  -  |

<a name="importDataset"></a>
# **importDataset**
> Dataset importDataset(organizationId, dataset)

Import a new Dataset

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
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    DatasetApi apiInstance = new DatasetApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    Dataset dataset = new Dataset(); // Dataset | the Dataset to import
    try {
      Dataset result = apiInstance.importDataset(organizationId, dataset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#importDataset");
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
 **dataset** | [**Dataset**](Dataset.md)| the Dataset to import |

### Return type

[**Dataset**](Dataset.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | the dataset details |  -  |
**400** | Bad request |  -  |

<a name="removeAllDatasetCompatibilityElements"></a>
# **removeAllDatasetCompatibilityElements**
> removeAllDatasetCompatibilityElements(organizationId, datasetId)

Remove all Dataset Compatibility elements from the Dataset specified

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
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    DatasetApi apiInstance = new DatasetApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String datasetId = "datasetId_example"; // String | the Dataset identifier
    try {
      apiInstance.removeAllDatasetCompatibilityElements(organizationId, datasetId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#removeAllDatasetCompatibilityElements");
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
**404** | the Dataset specified is unknown or you don&#39;t have access to it |  -  |

<a name="searchDatasets"></a>
# **searchDatasets**
> List&lt;Dataset&gt; searchDatasets(organizationId, datasetSearch, page, size)

Search Datasets

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
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    DatasetApi apiInstance = new DatasetApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    DatasetSearch datasetSearch = new DatasetSearch(); // DatasetSearch | the Dataset search parameters
    Integer page = 56; // Integer | page number to query
    Integer size = 56; // Integer | amount of result by page
    try {
      List<Dataset> result = apiInstance.searchDatasets(organizationId, datasetSearch, page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#searchDatasets");
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
 **datasetSearch** | [**DatasetSearch**](DatasetSearch.md)| the Dataset search parameters |
 **page** | **Integer**| page number to query | [optional]
 **size** | **Integer**| amount of result by page | [optional]

### Return type

[**List&lt;Dataset&gt;**](Dataset.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the list of Datasets |  -  |

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
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

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

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the dataset details |  -  |
**400** | Bad request |  -  |
**404** | the Dataset specified is unknown or you don&#39;t have access to it |  -  |

