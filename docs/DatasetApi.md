# DatasetApi

All URIs are relative to *https://dev.api.cosmotech.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addDatasetAccessControl**](DatasetApi.md#addDatasetAccessControl) | **POST** /organizations/{organization_id}/datasets/{dataset_id}/security/access | Add a control access to the Dataset |
| [**addOrReplaceDatasetCompatibilityElements**](DatasetApi.md#addOrReplaceDatasetCompatibilityElements) | **POST** /organizations/{organization_id}/datasets/{dataset_id}/compatibility | Add Dataset Compatibility elements. |
| [**copyDataset**](DatasetApi.md#copyDataset) | **POST** /organizations/{organization_id}/datasets/copy | Copy a Dataset to another Dataset. |
| [**createDataset**](DatasetApi.md#createDataset) | **POST** /organizations/{organization_id}/datasets | Create a new Dataset |
| [**createSubDataset**](DatasetApi.md#createSubDataset) | **POST** /organizations/{organization_id}/datasets/{dataset_id}/subdataset | Create a sub-dataset from the dataset in parameter |
| [**createTwingraphEntities**](DatasetApi.md#createTwingraphEntities) | **POST** /organizations/{organization_id}/datasets/{dataset_id}/twingraph/{type} | Create new entities in a graph instance |
| [**deleteDataset**](DatasetApi.md#deleteDataset) | **DELETE** /organizations/{organization_id}/datasets/{dataset_id} | Delete a dataset |
| [**deleteTwingraphEntities**](DatasetApi.md#deleteTwingraphEntities) | **DELETE** /organizations/{organization_id}/datasets/{dataset_id}/twingraph/{type} | Delete entities in a graph instance |
| [**downloadTwingraph**](DatasetApi.md#downloadTwingraph) | **GET** /organizations/{organization_id}/datasets/twingraph/download/{hash} | Download a graph as a zip file |
| [**findAllDatasets**](DatasetApi.md#findAllDatasets) | **GET** /organizations/{organization_id}/datasets | List all Datasets |
| [**findDatasetById**](DatasetApi.md#findDatasetById) | **GET** /organizations/{organization_id}/datasets/{dataset_id} | Get the details of a Dataset |
| [**getDatasetAccessControl**](DatasetApi.md#getDatasetAccessControl) | **GET** /organizations/{organization_id}/datasets/{dataset_id}/security/access/{identity_id} | Get a control access for the Dataset |
| [**getDatasetSecurity**](DatasetApi.md#getDatasetSecurity) | **GET** /organizations/{organization_id}/datasets/{dataset_id}/security | Get the Dataset security information |
| [**getDatasetSecurityUsers**](DatasetApi.md#getDatasetSecurityUsers) | **GET** /organizations/{organization_id}/datasets/{dataset_id}/security/users | Get the Dataset security users list |
| [**getDatasetTwingraphStatus**](DatasetApi.md#getDatasetTwingraphStatus) | **GET** /organizations/{organization_id}/datasets/{dataset_id}/status | Get the dataset&#39;s refresh job status |
| [**getTwingraphEntities**](DatasetApi.md#getTwingraphEntities) | **GET** /organizations/{organization_id}/datasets/{dataset_id}/twingraph/{type} | Get entities in a graph instance |
| [**linkWorkspace**](DatasetApi.md#linkWorkspace) | **POST** /organizations/{organization_id}/datasets/{dataset_id}/link |  |
| [**refreshDataset**](DatasetApi.md#refreshDataset) | **POST** /organizations/{organization_id}/datasets/{dataset_id}/refresh | Refresh data on dataset from dataset&#39;s source |
| [**removeAllDatasetCompatibilityElements**](DatasetApi.md#removeAllDatasetCompatibilityElements) | **DELETE** /organizations/{organization_id}/datasets/{dataset_id}/compatibility | Remove all Dataset Compatibility elements from the Dataset specified |
| [**removeDatasetAccessControl**](DatasetApi.md#removeDatasetAccessControl) | **DELETE** /organizations/{organization_id}/datasets/{dataset_id}/security/access/{identity_id} | Remove the specified access from the given Dataset |
| [**rollbackRefresh**](DatasetApi.md#rollbackRefresh) | **POST** /organizations/{organization_id}/datasets/{dataset_id}/refresh/rollback | Rollback the dataset after a failed refresh |
| [**searchDatasets**](DatasetApi.md#searchDatasets) | **POST** /organizations/{organization_id}/datasets/search | Search Datasets by tags |
| [**setDatasetDefaultSecurity**](DatasetApi.md#setDatasetDefaultSecurity) | **POST** /organizations/{organization_id}/datasets/{dataset_id}/security/default | Set the Dataset default security |
| [**twingraphBatchQuery**](DatasetApi.md#twingraphBatchQuery) | **POST** /organizations/{organization_id}/datasets/{dataset_id}/batch-query | Run a query on a graph instance and return the result as a zip file in async mode |
| [**twingraphBatchUpdate**](DatasetApi.md#twingraphBatchUpdate) | **POST** /organizations/{organization_id}/datasets/{dataset_id}/batch | Async batch update by loading a CSV file on a graph instance  |
| [**twingraphQuery**](DatasetApi.md#twingraphQuery) | **POST** /organizations/{organization_id}/datasets/{dataset_id}/twingraph | Return the result of a query made on the graph instance as a json |
| [**unlinkWorkspace**](DatasetApi.md#unlinkWorkspace) | **POST** /organizations/{organization_id}/datasets/{dataset_id}/unlink |  |
| [**updateDataset**](DatasetApi.md#updateDataset) | **PATCH** /organizations/{organization_id}/datasets/{dataset_id} | Update a dataset |
| [**updateDatasetAccessControl**](DatasetApi.md#updateDatasetAccessControl) | **PATCH** /organizations/{organization_id}/datasets/{dataset_id}/security/access/{identity_id} | Update the specified access to User for a Dataset |
| [**updateTwingraphEntities**](DatasetApi.md#updateTwingraphEntities) | **PATCH** /organizations/{organization_id}/datasets/{dataset_id}/twingraph/{type} | Update entities in a graph instance |
| [**uploadTwingraph**](DatasetApi.md#uploadTwingraph) | **POST** /organizations/{organization_id}/datasets/{dataset_id} | Upload data from zip file to dataset&#39;s twingraph |


<a id="addDatasetAccessControl"></a>
# **addDatasetAccessControl**
> DatasetAccessControl addDatasetAccessControl(organizationId, datasetId, datasetAccessControl)

Add a control access to the Dataset

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
    DatasetAccessControl datasetAccessControl = new DatasetAccessControl(); // DatasetAccessControl | the new Dataset security access to add.
    try {
      DatasetAccessControl result = apiInstance.addDatasetAccessControl(organizationId, datasetId, datasetAccessControl);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#addDatasetAccessControl");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **datasetId** | **String**| the Dataset identifier | |
| **datasetAccessControl** | [**DatasetAccessControl**](DatasetAccessControl.md)| the new Dataset security access to add. | |

### Return type

[**DatasetAccessControl**](DatasetAccessControl.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The Dataset access |  -  |
| **404** | the Dataset specified is unknown or you don&#39;t have access to it |  -  |

<a id="addOrReplaceDatasetCompatibilityElements"></a>
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **datasetId** | **String**| the Dataset identifier | |
| **datasetCompatibility** | [**List&lt;DatasetCompatibility&gt;**](DatasetCompatibility.md)| the Dataset Compatibility elements | |

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
| **201** | the Dataset Compatibility elements |  -  |
| **400** | Bad request |  -  |
| **404** | the Dataset specified is unknown or you don&#39;t have access to it |  -  |

<a id="copyDataset"></a>
# **copyDataset**
> DatasetCopyParameters copyDataset(organizationId, datasetCopyParameters)

Copy a Dataset to another Dataset.

Not implemented!

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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **datasetCopyParameters** | [**DatasetCopyParameters**](DatasetCopyParameters.md)| the Dataset copy parameters | |

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
| **201** | the Dataset copy operation parameters |  -  |
| **400** | Bad request |  -  |
| **404** | the Dataset specified as Source or Target is unknown or you don&#39;t have access to it |  -  |

<a id="createDataset"></a>
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **dataset** | [**Dataset**](Dataset.md)| the Dataset to create | |

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
| **201** | the dataset details |  -  |
| **400** | Bad request |  -  |

<a id="createSubDataset"></a>
# **createSubDataset**
> Dataset createSubDataset(organizationId, datasetId, subDatasetGraphQuery)

Create a sub-dataset from the dataset in parameter

Create a copy of the dataset using the results of the list of queries given in parameter.

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
    SubDatasetGraphQuery subDatasetGraphQuery = new SubDatasetGraphQuery(); // SubDatasetGraphQuery | the Cypher query to filter
    try {
      Dataset result = apiInstance.createSubDataset(organizationId, datasetId, subDatasetGraphQuery);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#createSubDataset");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **datasetId** | **String**| the Dataset identifier | |
| **subDatasetGraphQuery** | [**SubDatasetGraphQuery**](SubDatasetGraphQuery.md)| the Cypher query to filter | |

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
| **200** | Successful response |  -  |

<a id="createTwingraphEntities"></a>
# **createTwingraphEntities**
> String createTwingraphEntities(organizationId, datasetId, type, graphProperties)

Create new entities in a graph instance

create new entities in a graph instance

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
    String datasetId = "datasetId_example"; // String | the Dataset Identifier
    String type = "node"; // String | the entity model type
    List<GraphProperties> graphProperties = Arrays.asList(); // List<GraphProperties> | the entities to create
    try {
      String result = apiInstance.createTwingraphEntities(organizationId, datasetId, type, graphProperties);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#createTwingraphEntities");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **datasetId** | **String**| the Dataset Identifier | |
| **type** | **String**| the entity model type | [enum: node, relationship] |
| **graphProperties** | [**List&lt;GraphProperties&gt;**](GraphProperties.md)| the entities to create | |

### Return type

**String**

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="deleteDataset"></a>
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **datasetId** | **String**| the Dataset identifier | |

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
| **204** | Request successful |  -  |
| **404** | the Dataset specified is unknown or you don&#39;t have access to it |  -  |

<a id="deleteTwingraphEntities"></a>
# **deleteTwingraphEntities**
> deleteTwingraphEntities(organizationId, datasetId, type, ids)

Delete entities in a graph instance

delete entities in a graph instance

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
    String datasetId = "datasetId_example"; // String | the Dataset Identifier
    String type = "node"; // String | the entity model type
    List<String> ids = Arrays.asList(); // List<String> | the entities to delete
    try {
      apiInstance.deleteTwingraphEntities(organizationId, datasetId, type, ids);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#deleteTwingraphEntities");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **datasetId** | **String**| the Dataset Identifier | |
| **type** | **String**| the entity model type | [enum: node, relationship] |
| **ids** | [**List&lt;String&gt;**](String.md)| the entities to delete | |

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
| **200** | Successful response |  -  |

<a id="downloadTwingraph"></a>
# **downloadTwingraph**
> File downloadTwingraph(organizationId, hash)

Download a graph as a zip file

Download the compressed graph reference by the hash in a zip file

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
    String hash = "hash_example"; // String | the Graph download identifier
    try {
      File result = apiInstance.downloadTwingraph(organizationId, hash);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#downloadTwingraph");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **hash** | **String**| the Graph download identifier | |

### Return type

[**File**](File.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="findAllDatasets"></a>
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **page** | **Integer**| page number to query | [optional] |
| **size** | **Integer**| amount of result by page | [optional] |

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
| **200** | the list of Datasets |  -  |

<a id="findDatasetById"></a>
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **datasetId** | **String**| the Dataset identifier | |

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
| **200** | the Dataset details |  -  |
| **404** | the Dataset specified is unknown or you don&#39;t have access to it |  -  |

<a id="getDatasetAccessControl"></a>
# **getDatasetAccessControl**
> DatasetAccessControl getDatasetAccessControl(organizationId, datasetId, identityId)

Get a control access for the Dataset

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
    String identityId = "identityId_example"; // String | the User identifier
    try {
      DatasetAccessControl result = apiInstance.getDatasetAccessControl(organizationId, datasetId, identityId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#getDatasetAccessControl");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **datasetId** | **String**| the Dataset identifier | |
| **identityId** | **String**| the User identifier | |

### Return type

[**DatasetAccessControl**](DatasetAccessControl.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Dataset access |  -  |
| **404** | The Dataset or user specified is unknown or you don&#39;t have access to it |  -  |

<a id="getDatasetSecurity"></a>
# **getDatasetSecurity**
> DatasetSecurity getDatasetSecurity(organizationId, datasetId)

Get the Dataset security information

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
      DatasetSecurity result = apiInstance.getDatasetSecurity(organizationId, datasetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#getDatasetSecurity");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **datasetId** | **String**| the Dataset identifier | |

### Return type

[**DatasetSecurity**](DatasetSecurity.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Dataset security |  -  |
| **404** | the Dataset specified is unknown or you don&#39;t have access to it |  -  |

<a id="getDatasetSecurityUsers"></a>
# **getDatasetSecurityUsers**
> List&lt;String&gt; getDatasetSecurityUsers(organizationId, datasetId)

Get the Dataset security users list

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
      List<String> result = apiInstance.getDatasetSecurityUsers(organizationId, datasetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#getDatasetSecurityUsers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **datasetId** | **String**| the Dataset identifier | |

### Return type

**List&lt;String&gt;**

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Dataset security users list |  -  |
| **404** | the Dataset or the User specified is unknown or you don&#39;t have access to them |  -  |

<a id="getDatasetTwingraphStatus"></a>
# **getDatasetTwingraphStatus**
> String getDatasetTwingraphStatus(organizationId, datasetId)

Get the dataset&#39;s refresh job status

Get the status of the import workflow lauch on the dataset&#39;s refresh. This endpoint needs to be called to update a dataset IngestionStatus or TwincacheStatus

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
    String datasetId = "datasetId_example"; // String | the dataset identifier
    try {
      String result = apiInstance.getDatasetTwingraphStatus(organizationId, datasetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#getDatasetTwingraphStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **datasetId** | **String**| the dataset identifier | |

### Return type

**String**

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/yaml, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="getTwingraphEntities"></a>
# **getTwingraphEntities**
> String getTwingraphEntities(organizationId, datasetId, type, ids)

Get entities in a graph instance

get entities in a graph instance

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
    String datasetId = "datasetId_example"; // String | the Dataset Identifier
    String type = "node"; // String | the entity model type
    List<String> ids = Arrays.asList(); // List<String> | the entities to get
    try {
      String result = apiInstance.getTwingraphEntities(organizationId, datasetId, type, ids);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#getTwingraphEntities");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **datasetId** | **String**| the Dataset Identifier | |
| **type** | **String**| the entity model type | [enum: node, relationship] |
| **ids** | [**List&lt;String&gt;**](String.md)| the entities to get | |

### Return type

**String**

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="linkWorkspace"></a>
# **linkWorkspace**
> Dataset linkWorkspace(organizationId, datasetId, workspaceId)



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
    String workspaceId = "workspaceId_example"; // String | workspace id to be linked to
    try {
      Dataset result = apiInstance.linkWorkspace(organizationId, datasetId, workspaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#linkWorkspace");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **datasetId** | **String**| the Dataset identifier | |
| **workspaceId** | **String**| workspace id to be linked to | |

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
| **200** | the dataset details |  -  |
| **400** | Bad request |  -  |
| **404** | the Dataset specified is unknown or you don&#39;t have access to it |  -  |

<a id="refreshDataset"></a>
# **refreshDataset**
> DatasetTwinGraphInfo refreshDataset(organizationId, datasetId)

Refresh data on dataset from dataset&#39;s source

Refresh dataset from parent source. At date, sources can be:      dataset (refresh from another dataset)      Azure Digital twin       Azure storage      Local File (import a new file)  During refresh, datas are overwritten 

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
      DatasetTwinGraphInfo result = apiInstance.refreshDataset(organizationId, datasetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#refreshDataset");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **datasetId** | **String**| the Dataset identifier | |

### Return type

[**DatasetTwinGraphInfo**](DatasetTwinGraphInfo.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="removeAllDatasetCompatibilityElements"></a>
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **datasetId** | **String**| the Dataset identifier | |

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
| **204** | the operation succeeded |  -  |
| **404** | the Dataset specified is unknown or you don&#39;t have access to it |  -  |

<a id="removeDatasetAccessControl"></a>
# **removeDatasetAccessControl**
> removeDatasetAccessControl(organizationId, datasetId, identityId)

Remove the specified access from the given Dataset

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
    String identityId = "identityId_example"; // String | the User identifier
    try {
      apiInstance.removeDatasetAccessControl(organizationId, datasetId, identityId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#removeDatasetAccessControl");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **datasetId** | **String**| the Dataset identifier | |
| **identityId** | **String**| the User identifier | |

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
| **204** | Request succeeded |  -  |
| **404** | The Dataset or the user specified is unknown or you don&#39;t have access to them |  -  |

<a id="rollbackRefresh"></a>
# **rollbackRefresh**
> String rollbackRefresh(organizationId, datasetId)

Rollback the dataset after a failed refresh

Rollback the twingraph on a dataset after a failed refresh

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
      String result = apiInstance.rollbackRefresh(organizationId, datasetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#rollbackRefresh");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **datasetId** | **String**| the Dataset identifier | |

### Return type

**String**

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="searchDatasets"></a>
# **searchDatasets**
> List&lt;Dataset&gt; searchDatasets(organizationId, datasetSearch, page, size)

Search Datasets by tags

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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **datasetSearch** | [**DatasetSearch**](DatasetSearch.md)| the Dataset search parameters | |
| **page** | **Integer**| page number to query | [optional] |
| **size** | **Integer**| amount of result by page | [optional] |

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
| **200** | the list of Datasets |  -  |

<a id="setDatasetDefaultSecurity"></a>
# **setDatasetDefaultSecurity**
> DatasetSecurity setDatasetDefaultSecurity(organizationId, datasetId, datasetRole)

Set the Dataset default security

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
    DatasetRole datasetRole = new DatasetRole(); // DatasetRole | This change the dataset default security. The default security is the role assigned to any person not on the Access Control List. If the default security is None, then nobody outside of the ACL can access the dataset.
    try {
      DatasetSecurity result = apiInstance.setDatasetDefaultSecurity(organizationId, datasetId, datasetRole);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#setDatasetDefaultSecurity");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **datasetId** | **String**| the Dataset identifier | |
| **datasetRole** | [**DatasetRole**](DatasetRole.md)| This change the dataset default security. The default security is the role assigned to any person not on the Access Control List. If the default security is None, then nobody outside of the ACL can access the dataset. | |

### Return type

[**DatasetSecurity**](DatasetSecurity.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The Dataset default visibility |  -  |
| **404** | the Dataset specified is unknown or you don&#39;t have access to it |  -  |

<a id="twingraphBatchQuery"></a>
# **twingraphBatchQuery**
> DatasetTwinGraphHash twingraphBatchQuery(organizationId, datasetId, datasetTwinGraphQuery)

Run a query on a graph instance and return the result as a zip file in async mode

Run a query on a graph instance and return the result as a zip file in async mode

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
    String datasetId = "datasetId_example"; // String | the Graph Identifier
    DatasetTwinGraphQuery datasetTwinGraphQuery = new DatasetTwinGraphQuery(); // DatasetTwinGraphQuery | the query to run
    try {
      DatasetTwinGraphHash result = apiInstance.twingraphBatchQuery(organizationId, datasetId, datasetTwinGraphQuery);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#twingraphBatchQuery");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **datasetId** | **String**| the Graph Identifier | |
| **datasetTwinGraphQuery** | [**DatasetTwinGraphQuery**](DatasetTwinGraphQuery.md)| the query to run | |

### Return type

[**DatasetTwinGraphHash**](DatasetTwinGraphHash.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="twingraphBatchUpdate"></a>
# **twingraphBatchUpdate**
> TwinGraphBatchResult twingraphBatchUpdate(organizationId, datasetId, twinGraphQuery, body)

Async batch update by loading a CSV file on a graph instance 

Async batch update by loading a CSV file on a graph instance 

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
    String datasetId = "datasetId_example"; // String | the Dataset Identifier
    DatasetTwinGraphQuery twinGraphQuery = new DatasetTwinGraphQuery(); // DatasetTwinGraphQuery | 
    File body = id,name,rank
1,"John Doe",37
2,"Joe Bloggs",14
; // File | 
    try {
      TwinGraphBatchResult result = apiInstance.twingraphBatchUpdate(organizationId, datasetId, twinGraphQuery, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#twingraphBatchUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **datasetId** | **String**| the Dataset Identifier | |
| **twinGraphQuery** | [**DatasetTwinGraphQuery**](.md)|  | |
| **body** | **File**|  | |

### Return type

[**TwinGraphBatchResult**](TwinGraphBatchResult.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: text/csv, application/octet-stream
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | csv file processed |  -  |
| **400** | Bad request |  -  |

<a id="twingraphQuery"></a>
# **twingraphQuery**
> List&lt;Object&gt; twingraphQuery(organizationId, datasetId, datasetTwinGraphQuery)

Return the result of a query made on the graph instance as a json

Run a query on a graph instance and return the result as a json

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
    DatasetTwinGraphQuery datasetTwinGraphQuery = new DatasetTwinGraphQuery(); // DatasetTwinGraphQuery | the query to run
    try {
      List<Object> result = apiInstance.twingraphQuery(organizationId, datasetId, datasetTwinGraphQuery);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#twingraphQuery");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **datasetId** | **String**| the Dataset identifier | |
| **datasetTwinGraphQuery** | [**DatasetTwinGraphQuery**](DatasetTwinGraphQuery.md)| the query to run | |

### Return type

**List&lt;Object&gt;**

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="unlinkWorkspace"></a>
# **unlinkWorkspace**
> Dataset unlinkWorkspace(organizationId, datasetId, workspaceId)



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
    String workspaceId = "workspaceId_example"; // String | workspace id to be linked to
    try {
      Dataset result = apiInstance.unlinkWorkspace(organizationId, datasetId, workspaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#unlinkWorkspace");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **datasetId** | **String**| the Dataset identifier | |
| **workspaceId** | **String**| workspace id to be linked to | |

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
| **200** | the dataset details |  -  |
| **400** | Bad request |  -  |
| **404** | the Dataset specified is unknown or you don&#39;t have access to it |  -  |

<a id="updateDataset"></a>
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
    Dataset dataset = new Dataset(); // Dataset | the new Dataset details. This endpoint can't be used to update security
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **datasetId** | **String**| the Dataset identifier | |
| **dataset** | [**Dataset**](Dataset.md)| the new Dataset details. This endpoint can&#39;t be used to update security | |

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
| **200** | the dataset details |  -  |
| **400** | Bad request |  -  |
| **404** | the Dataset specified is unknown or you don&#39;t have access to it |  -  |

<a id="updateDatasetAccessControl"></a>
# **updateDatasetAccessControl**
> DatasetAccessControl updateDatasetAccessControl(organizationId, datasetId, identityId, datasetRole)

Update the specified access to User for a Dataset

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
    String identityId = "identityId_example"; // String | the User identifier
    DatasetRole datasetRole = new DatasetRole(); // DatasetRole | The new Dataset Access Control
    try {
      DatasetAccessControl result = apiInstance.updateDatasetAccessControl(organizationId, datasetId, identityId, datasetRole);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#updateDatasetAccessControl");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **datasetId** | **String**| the Dataset identifier | |
| **identityId** | **String**| the User identifier | |
| **datasetRole** | [**DatasetRole**](DatasetRole.md)| The new Dataset Access Control | |

### Return type

[**DatasetAccessControl**](DatasetAccessControl.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Dataset access |  -  |
| **404** | The Dataset specified is unknown or you don&#39;t have access to it |  -  |

<a id="updateTwingraphEntities"></a>
# **updateTwingraphEntities**
> String updateTwingraphEntities(organizationId, datasetId, type, graphProperties)

Update entities in a graph instance

update entities in a graph instance

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
    String datasetId = "datasetId_example"; // String | the Dataset Identifier
    String type = "node"; // String | the entity model type
    List<GraphProperties> graphProperties = Arrays.asList(); // List<GraphProperties> | the entities to update
    try {
      String result = apiInstance.updateTwingraphEntities(organizationId, datasetId, type, graphProperties);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#updateTwingraphEntities");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **datasetId** | **String**| the Dataset Identifier | |
| **type** | **String**| the entity model type | [enum: node, relationship] |
| **graphProperties** | [**List&lt;GraphProperties&gt;**](GraphProperties.md)| the entities to update | |

### Return type

**String**

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

<a id="uploadTwingraph"></a>
# **uploadTwingraph**
> FileUploadValidation uploadTwingraph(organizationId, datasetId, body)

Upload data from zip file to dataset&#39;s twingraph

To create a new graph from flat files,  you need to create a Zip file. This Zip file must countain two folders named Edges and Nodes.  .zip hierarchy: *main_folder/Nodes *main_folder/Edges  In each folder you can place one or multiple csv files containing your Nodes or Edges data.  Your csv files must follow the following header (column name) requirements:  The Nodes CSVs requires at least one column (the 1st).Column name &#x3D; &#39;id&#39;. It will represent the nodes ID Ids must be populated with string  The Edges CSVs require three columns named, in order, * source * target * id  those colomns represent * The source of the edge * The target of the edge * The id of the edge  All following columns content are up to you. 

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
    File body = new File("/path/to/file"); // File | 
    try {
      FileUploadValidation result = apiInstance.uploadTwingraph(organizationId, datasetId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#uploadTwingraph");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organizationId** | **String**| the Organization identifier | |
| **datasetId** | **String**| the Dataset identifier | |
| **body** | **File**|  | |

### Return type

[**FileUploadValidation**](FileUploadValidation.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | File uploaded successfully. Processing... |  -  |

