# TwingraphApi

All URIs are relative to *https://dev.api.cosmotech.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchQuery**](TwingraphApi.md#batchQuery) | **POST** /organizations/{organization_id}/twingraph/{graph_id}/batch-query | Run a query on a graph instance and return the result as a zip file in async mode
[**batchUploadUpdate**](TwingraphApi.md#batchUploadUpdate) | **POST** /organizations/{organization_id}/twingraph/{graph_id}/batch | Async batch update by loading a CSV file on a graph instance 
[**createEntities**](TwingraphApi.md#createEntities) | **POST** /organizations/{organization_id}/twingraph/{graph_id}/entity/{type} | Create new entities in a graph instance
[**createGraph**](TwingraphApi.md#createGraph) | **POST** /organizations/{organization_id}/twingraph/{graph_id} | Create a new graph
[**delete**](TwingraphApi.md#delete) | **DELETE** /organizations/{organization_id}/twingraph/{graph_id} | Delete all versions of a graph and his metadatas
[**deleteEntities**](TwingraphApi.md#deleteEntities) | **DELETE** /organizations/{organization_id}/twingraph/{graph_id}/entity/{type} | Delete entities in a graph instance
[**downloadGraph**](TwingraphApi.md#downloadGraph) | **GET** /organizations/{organization_id}/twingraph/download/{hash} | Download a graph compressed in a zip file
[**findAllTwingraphs**](TwingraphApi.md#findAllTwingraphs) | **GET** /organizations/{organization_id}/twingraphs | Return the list of all graphs stored in the organization
[**getEntities**](TwingraphApi.md#getEntities) | **GET** /organizations/{organization_id}/twingraph/{graph_id}/entity/{type} | Get entities in a graph instance
[**getGraphMetaData**](TwingraphApi.md#getGraphMetaData) | **GET** /organizations/{organization_id}/twingraph/{graph_id}/metadata | Return the metaData of the specified graph
[**jobStatus**](TwingraphApi.md#jobStatus) | **GET** /organizations/{organization_id}/job/{job_id}/status | Get the status of a job
[**query**](TwingraphApi.md#query) | **POST** /organizations/{organization_id}/twingraph/{graph_id}/query | Run a query on a graph instance
[**updateEntities**](TwingraphApi.md#updateEntities) | **PATCH** /organizations/{organization_id}/twingraph/{graph_id}/entity/{type} | Update entities in a graph instance
[**updateGraphMetaData**](TwingraphApi.md#updateGraphMetaData) | **PATCH** /organizations/{organization_id}/twingraph/{graph_id}/metadata | Update the metaData of the specified graph


<a name="batchQuery"></a>
# **batchQuery**
> TwinGraphHash batchQuery(organizationId, graphId, twinGraphQuery)

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
import com.cosmotech.client.api.TwingraphApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    TwingraphApi apiInstance = new TwingraphApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String graphId = "graphId_example"; // String | the Graph Identifier
    TwinGraphQuery twinGraphQuery = new TwinGraphQuery(); // TwinGraphQuery | the query to run
    try {
      TwinGraphHash result = apiInstance.batchQuery(organizationId, graphId, twinGraphQuery);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TwingraphApi#batchQuery");
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
 **graphId** | **String**| the Graph Identifier |
 **twinGraphQuery** | [**TwinGraphQuery**](TwinGraphQuery.md)| the query to run |

### Return type

[**TwinGraphHash**](TwinGraphHash.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="batchUploadUpdate"></a>
# **batchUploadUpdate**
> TwinGraphBatchResult batchUploadUpdate(organizationId, graphId, twinGraphQuery, body)

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
import com.cosmotech.client.api.TwingraphApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    TwingraphApi apiInstance = new TwingraphApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String graphId = "graphId_example"; // String | the Graph Identifier
    TwinGraphQuery twinGraphQuery = new TwinGraphQuery(); // TwinGraphQuery | 
    File body = id,name,rank
1,"John Doe",37
2,"Joe Bloggs",14
; // File | 
    try {
      TwinGraphBatchResult result = apiInstance.batchUploadUpdate(organizationId, graphId, twinGraphQuery, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TwingraphApi#batchUploadUpdate");
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
 **graphId** | **String**| the Graph Identifier |
 **twinGraphQuery** | [**TwinGraphQuery**](.md)|  |
 **body** | **File**|  |

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
**200** | csv file processed |  -  |
**400** | Bad request |  -  |

<a name="createEntities"></a>
# **createEntities**
> String createEntities(organizationId, graphId, type, graphProperties)

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
import com.cosmotech.client.api.TwingraphApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    TwingraphApi apiInstance = new TwingraphApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String graphId = "graphId_example"; // String | the Graph Identifier
    String type = "node"; // String | the entity model type
    List<GraphProperties> graphProperties = Arrays.asList(); // List<GraphProperties> | the entities to create
    try {
      String result = apiInstance.createEntities(organizationId, graphId, type, graphProperties);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TwingraphApi#createEntities");
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
 **graphId** | **String**| the Graph Identifier |
 **type** | **String**| the entity model type | [enum: node, relationship]
 **graphProperties** | [**List&lt;GraphProperties&gt;**](GraphProperties.md)| the entities to create |

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
**200** | Successful response |  -  |

<a name="createGraph"></a>
# **createGraph**
> createGraph(organizationId, graphId, body)

Create a new graph

To create a new graph from flat files,  you need to create a Zip file. This Zip file must countain two folders named Edges and Nodes.  .zip hierarchy: *main_folder/Nodes *main_folder/Edges  In each folder you can place one or multiple csv files containing your Nodes or Edges data.  Your csv files must follow the following header (column name) requirements:  The Nodes CSVs requires at least one column (the 1st).Column name &#x3D; &#39;id&#39;. It will represent the nodes ID Ids must be populated with string  The Edges CSVs require three columns named, in order, * source * target * id  those colomns represent * The source of the edge * The target of the edge * The id of the edge  All following columns content are up to you. 

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.TwingraphApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    TwingraphApi apiInstance = new TwingraphApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String graphId = "graphId_example"; // String | the Graph Identifier
    File body = new File("/path/to/file"); // File | 
    try {
      apiInstance.createGraph(organizationId, graphId, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling TwingraphApi#createGraph");
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
 **graphId** | **String**| the Graph Identifier |
 **body** | **File**|  | [optional]

### Return type

null (empty response body)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Successful response |  -  |

<a name="delete"></a>
# **delete**
> delete(organizationId, graphId)

Delete all versions of a graph and his metadatas

Delete all versions of a graph and his metadatas

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.TwingraphApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    TwingraphApi apiInstance = new TwingraphApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String graphId = "graphId_example"; // String | the Graph Identifier
    try {
      apiInstance.delete(organizationId, graphId);
    } catch (ApiException e) {
      System.err.println("Exception when calling TwingraphApi#delete");
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
 **graphId** | **String**| the Graph Identifier |

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
**204** | Successful response |  -  |

<a name="deleteEntities"></a>
# **deleteEntities**
> deleteEntities(organizationId, graphId, type, ids)

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
import com.cosmotech.client.api.TwingraphApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    TwingraphApi apiInstance = new TwingraphApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String graphId = "graphId_example"; // String | the Graph Identifier
    String type = "node"; // String | the entity model type
    List<String> ids = Arrays.asList(); // List<String> | the entities to delete
    try {
      apiInstance.deleteEntities(organizationId, graphId, type, ids);
    } catch (ApiException e) {
      System.err.println("Exception when calling TwingraphApi#deleteEntities");
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
 **graphId** | **String**| the Graph Identifier |
 **type** | **String**| the entity model type | [enum: node, relationship]
 **ids** | [**List&lt;String&gt;**](String.md)| the entities to delete |

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
**200** | Successful response |  -  |

<a name="downloadGraph"></a>
# **downloadGraph**
> File downloadGraph(organizationId, hash)

Download a graph compressed in a zip file

Download a graph compressed in a zip file

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.TwingraphApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    TwingraphApi apiInstance = new TwingraphApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String hash = "hash_example"; // String | the Graph download identifier
    try {
      File result = apiInstance.downloadGraph(organizationId, hash);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TwingraphApi#downloadGraph");
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
 **hash** | **String**| the Graph download identifier |

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
**200** | Successful response |  -  |

<a name="findAllTwingraphs"></a>
# **findAllTwingraphs**
> List&lt;String&gt; findAllTwingraphs(organizationId)

Return the list of all graphs stored in the organization

Return the list of all graphs stored in the organization

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.TwingraphApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    TwingraphApi apiInstance = new TwingraphApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    try {
      List<String> result = apiInstance.findAllTwingraphs(organizationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TwingraphApi#findAllTwingraphs");
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

**List&lt;String&gt;**

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="getEntities"></a>
# **getEntities**
> String getEntities(organizationId, graphId, type, ids)

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
import com.cosmotech.client.api.TwingraphApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    TwingraphApi apiInstance = new TwingraphApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String graphId = "graphId_example"; // String | the Graph Identifier
    String type = "node"; // String | the entity model type
    List<String> ids = Arrays.asList(); // List<String> | the entities to get
    try {
      String result = apiInstance.getEntities(organizationId, graphId, type, ids);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TwingraphApi#getEntities");
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
 **graphId** | **String**| the Graph Identifier |
 **type** | **String**| the entity model type | [enum: node, relationship]
 **ids** | [**List&lt;String&gt;**](String.md)| the entities to get |

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
**200** | Successful response |  -  |

<a name="getGraphMetaData"></a>
# **getGraphMetaData**
> Object getGraphMetaData(organizationId, graphId)

Return the metaData of the specified graph

Return the metaData of the specified graph

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.TwingraphApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    TwingraphApi apiInstance = new TwingraphApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String graphId = "graphId_example"; // String | the Graph Identifier
    try {
      Object result = apiInstance.getGraphMetaData(organizationId, graphId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TwingraphApi#getGraphMetaData");
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
 **graphId** | **String**| the Graph Identifier |

### Return type

**Object**

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="jobStatus"></a>
# **jobStatus**
> String jobStatus(organizationId, jobId)

Get the status of a job

Get the status of a job

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.TwingraphApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    TwingraphApi apiInstance = new TwingraphApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String jobId = "jobId_example"; // String | the job identifier
    try {
      String result = apiInstance.jobStatus(organizationId, jobId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TwingraphApi#jobStatus");
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
 **jobId** | **String**| the job identifier |

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
**200** | Successful response |  -  |

<a name="query"></a>
# **query**
> String query(organizationId, graphId, twinGraphQuery)

Run a query on a graph instance

Run a query on a graph instance

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.TwingraphApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    TwingraphApi apiInstance = new TwingraphApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String graphId = "graphId_example"; // String | the Graph Identifier
    TwinGraphQuery twinGraphQuery = new TwinGraphQuery(); // TwinGraphQuery | the query to run
    try {
      String result = apiInstance.query(organizationId, graphId, twinGraphQuery);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TwingraphApi#query");
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
 **graphId** | **String**| the Graph Identifier |
 **twinGraphQuery** | [**TwinGraphQuery**](TwinGraphQuery.md)| the query to run |

### Return type

**String**

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="updateEntities"></a>
# **updateEntities**
> String updateEntities(organizationId, graphId, type, graphProperties)

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
import com.cosmotech.client.api.TwingraphApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    TwingraphApi apiInstance = new TwingraphApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String graphId = "graphId_example"; // String | the Graph Identifier
    String type = "node"; // String | the entity model type
    List<GraphProperties> graphProperties = Arrays.asList(); // List<GraphProperties> | the entities to update
    try {
      String result = apiInstance.updateEntities(organizationId, graphId, type, graphProperties);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TwingraphApi#updateEntities");
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
 **graphId** | **String**| the Graph Identifier |
 **type** | **String**| the entity model type | [enum: node, relationship]
 **graphProperties** | [**List&lt;GraphProperties&gt;**](GraphProperties.md)| the entities to update |

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
**200** | Successful response |  -  |

<a name="updateGraphMetaData"></a>
# **updateGraphMetaData**
> Object updateGraphMetaData(organizationId, graphId, requestBody)

Update the metaData of the specified graph

Update the metaData of the specified graph

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.TwingraphApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    TwingraphApi apiInstance = new TwingraphApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String graphId = "graphId_example"; // String | the Graph Identifier
    Map<String, String> requestBody = {"graphName":"My Awesome Graph","graphRotation":"2"}; // Map<String, String> | the metaData to update
    try {
      Object result = apiInstance.updateGraphMetaData(organizationId, graphId, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TwingraphApi#updateGraphMetaData");
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
 **graphId** | **String**| the Graph Identifier |
 **requestBody** | [**Map&lt;String, String&gt;**](String.md)| the metaData to update |

### Return type

**Object**

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

