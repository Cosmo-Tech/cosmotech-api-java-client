# SolutionApi

All URIs are relative to *https://dev.api.cosmotech.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOrReplaceParameterGroups**](SolutionApi.md#addOrReplaceParameterGroups) | **POST** /organizations/{organization_id}/solutions/{solution_id}/parameterGroups | Add Parameter Groups. Any item with the same ID will be overwritten
[**addOrReplaceParameters**](SolutionApi.md#addOrReplaceParameters) | **POST** /organizations/{organization_id}/solutions/{solution_id}/parameters | Add Parameters. Any item with the same ID will be overwritten
[**addOrReplaceRunTemplates**](SolutionApi.md#addOrReplaceRunTemplates) | **POST** /organizations/{organization_id}/solutions/{solution_id}/runTemplates | Add Run Templates. Any item with the same ID will be overwritten
[**addSolutionAccessControl**](SolutionApi.md#addSolutionAccessControl) | **POST** /organizations/{organization_id}/solutions/{solution_id}/security/access | Add a control access to the Solution
[**createSolution**](SolutionApi.md#createSolution) | **POST** /organizations/{organization_id}/solutions | Register a new solution
[**deleteSolution**](SolutionApi.md#deleteSolution) | **DELETE** /organizations/{organization_id}/solutions/{solution_id} | Delete a solution
[**deleteSolutionRunTemplate**](SolutionApi.md#deleteSolutionRunTemplate) | **DELETE** /organizations/{organization_id}/solutions/{solution_id}/runTemplates/{run_template_id} | Remove the specified Solution Run Template
[**downloadRunTemplateHandler**](SolutionApi.md#downloadRunTemplateHandler) | **GET** /organizations/{organization_id}/solutions/{solution_id}/runtemplates/{run_template_id}/handlers/{handler_id}/download | Download a Run Template step handler zip file
[**findAllSolutions**](SolutionApi.md#findAllSolutions) | **GET** /organizations/{organization_id}/solutions | List all Solutions
[**findSolutionById**](SolutionApi.md#findSolutionById) | **GET** /organizations/{organization_id}/solutions/{solution_id} | Get the details of a solution
[**getSolutionAccessControl**](SolutionApi.md#getSolutionAccessControl) | **GET** /organizations/{organization_id}/solutions/{solution_id}/security/access/{identity_id} | Get a control access for the Solution
[**getSolutionSecurity**](SolutionApi.md#getSolutionSecurity) | **GET** /organizations/{organization_id}/solutions/{solution_id}/security | Get the Solution security information
[**getSolutionSecurityUsers**](SolutionApi.md#getSolutionSecurityUsers) | **GET** /organizations/{organization_id}/solutions/{solution_id}/security/users | Get the Solution security users list
[**removeAllRunTemplates**](SolutionApi.md#removeAllRunTemplates) | **DELETE** /organizations/{organization_id}/solutions/{solution_id}/runTemplates | Remove all Run Templates from the Solution specified
[**removeAllSolutionParameterGroups**](SolutionApi.md#removeAllSolutionParameterGroups) | **DELETE** /organizations/{organization_id}/solutions/{solution_id}/parameterGroups | Remove all Parameter Groups from the Solution specified
[**removeAllSolutionParameters**](SolutionApi.md#removeAllSolutionParameters) | **DELETE** /organizations/{organization_id}/solutions/{solution_id}/parameters | Remove all Parameters from the Solution specified
[**removeSolutionAccessControl**](SolutionApi.md#removeSolutionAccessControl) | **DELETE** /organizations/{organization_id}/solutions/{solution_id}/security/access/{identity_id} | Remove the specified access from the given Organization Solution
[**setSolutionDefaultSecurity**](SolutionApi.md#setSolutionDefaultSecurity) | **POST** /organizations/{organization_id}/solutions/{solution_id}/security/default | Set the Solution default security
[**updateSolution**](SolutionApi.md#updateSolution) | **PATCH** /organizations/{organization_id}/solutions/{solution_id} | Update a solution
[**updateSolutionAccessControl**](SolutionApi.md#updateSolutionAccessControl) | **PATCH** /organizations/{organization_id}/solutions/{solution_id}/security/access/{identity_id} | Update the specified access to User for a Solution
[**updateSolutionRunTemplate**](SolutionApi.md#updateSolutionRunTemplate) | **PATCH** /organizations/{organization_id}/solutions/{solution_id}/runTemplates/{run_template_id} | Update the specified Solution Run Template
[**uploadRunTemplateHandler**](SolutionApi.md#uploadRunTemplateHandler) | **POST** /organizations/{organization_id}/solutions/{solution_id}/runtemplates/{run_template_id}/handlers/{handler_id}/upload | Upload a Run Template step handler zip file


<a name="addOrReplaceParameterGroups"></a>
# **addOrReplaceParameterGroups**
> List&lt;RunTemplateParameterGroup&gt; addOrReplaceParameterGroups(organizationId, solutionId, runTemplateParameterGroup)

Add Parameter Groups. Any item with the same ID will be overwritten

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
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SolutionApi apiInstance = new SolutionApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String solutionId = "solutionId_example"; // String | the Solution identifier
    List<RunTemplateParameterGroup> runTemplateParameterGroup = Arrays.asList(); // List<RunTemplateParameterGroup> | the Parameter Groups
    try {
      List<RunTemplateParameterGroup> result = apiInstance.addOrReplaceParameterGroups(organizationId, solutionId, runTemplateParameterGroup);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SolutionApi#addOrReplaceParameterGroups");
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
 **runTemplateParameterGroup** | [**List&lt;RunTemplateParameterGroup&gt;**](RunTemplateParameterGroup.md)| the Parameter Groups |

### Return type

[**List&lt;RunTemplateParameterGroup&gt;**](RunTemplateParameterGroup.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | the Parameter Groups |  -  |
**400** | Bad request |  -  |
**404** | the Solution specified is unknown or you don&#39;t have access to it |  -  |

<a name="addOrReplaceParameters"></a>
# **addOrReplaceParameters**
> List&lt;RunTemplateParameter&gt; addOrReplaceParameters(organizationId, solutionId, runTemplateParameter)

Add Parameters. Any item with the same ID will be overwritten

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
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SolutionApi apiInstance = new SolutionApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String solutionId = "solutionId_example"; // String | the Solution identifier
    List<RunTemplateParameter> runTemplateParameter = Arrays.asList(); // List<RunTemplateParameter> | the Parameters
    try {
      List<RunTemplateParameter> result = apiInstance.addOrReplaceParameters(organizationId, solutionId, runTemplateParameter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SolutionApi#addOrReplaceParameters");
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
 **runTemplateParameter** | [**List&lt;RunTemplateParameter&gt;**](RunTemplateParameter.md)| the Parameters |

### Return type

[**List&lt;RunTemplateParameter&gt;**](RunTemplateParameter.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | the Parameters |  -  |
**400** | Bad request |  -  |
**404** | the Solution specified is unknown or you don&#39;t have access to it |  -  |

<a name="addOrReplaceRunTemplates"></a>
# **addOrReplaceRunTemplates**
> List&lt;RunTemplate&gt; addOrReplaceRunTemplates(organizationId, solutionId, runTemplate)

Add Run Templates. Any item with the same ID will be overwritten

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
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SolutionApi apiInstance = new SolutionApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String solutionId = "solutionId_example"; // String | the Solution identifier
    List<RunTemplate> runTemplate = Arrays.asList(); // List<RunTemplate> | the Run Templates
    try {
      List<RunTemplate> result = apiInstance.addOrReplaceRunTemplates(organizationId, solutionId, runTemplate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SolutionApi#addOrReplaceRunTemplates");
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
 **runTemplate** | [**List&lt;RunTemplate&gt;**](RunTemplate.md)| the Run Templates |

### Return type

[**List&lt;RunTemplate&gt;**](RunTemplate.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | the Parameters |  -  |
**400** | Bad request |  -  |
**404** | the Solution specified is unknown or you don&#39;t have access to it |  -  |

<a name="addSolutionAccessControl"></a>
# **addSolutionAccessControl**
> SolutionAccessControl addSolutionAccessControl(organizationId, solutionId, solutionAccessControl)

Add a control access to the Solution

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
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SolutionApi apiInstance = new SolutionApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String solutionId = "solutionId_example"; // String | the Solution identifier
    SolutionAccessControl solutionAccessControl = new SolutionAccessControl(); // SolutionAccessControl | the new Solution security access to add.
    try {
      SolutionAccessControl result = apiInstance.addSolutionAccessControl(organizationId, solutionId, solutionAccessControl);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SolutionApi#addSolutionAccessControl");
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
 **solutionAccessControl** | [**SolutionAccessControl**](SolutionAccessControl.md)| the new Solution security access to add. |

### Return type

[**SolutionAccessControl**](SolutionAccessControl.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | The Solution access |  -  |
**404** | the Solution specified is unknown or you don&#39;t have access to it |  -  |

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
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
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

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | the solution details |  -  |
**400** | Bad request |  -  |

<a name="deleteSolution"></a>
# **deleteSolution**
> deleteSolution(organizationId, solutionId)

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
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SolutionApi apiInstance = new SolutionApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String solutionId = "solutionId_example"; // String | the Solution identifier
    try {
      apiInstance.deleteSolution(organizationId, solutionId);
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

null (empty response body)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Request succeeded |  -  |
**404** | the Solution specified is unknown or you don&#39;t have access to it |  -  |

<a name="deleteSolutionRunTemplate"></a>
# **deleteSolutionRunTemplate**
> deleteSolutionRunTemplate(organizationId, solutionId, runTemplateId)

Remove the specified Solution Run Template

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
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SolutionApi apiInstance = new SolutionApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String solutionId = "solutionId_example"; // String | the Solution identifier
    String runTemplateId = "runTemplateId_example"; // String | the Run Template identifier
    try {
      apiInstance.deleteSolutionRunTemplate(organizationId, solutionId, runTemplateId);
    } catch (ApiException e) {
      System.err.println("Exception when calling SolutionApi#deleteSolutionRunTemplate");
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
 **runTemplateId** | **String**| the Run Template identifier |

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
**404** | the Solution specified is unknown or you don&#39;t have access to it |  -  |

<a name="downloadRunTemplateHandler"></a>
# **downloadRunTemplateHandler**
> File downloadRunTemplateHandler(organizationId, solutionId, runTemplateId, handlerId)

Download a Run Template step handler zip file

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
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SolutionApi apiInstance = new SolutionApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String solutionId = "solutionId_example"; // String | the Solution identifier
    String runTemplateId = "runTemplateId_example"; // String | the Run Template identifier
    RunTemplateHandlerId handlerId = RunTemplateHandlerId.fromValue("parameters_handler"); // RunTemplateHandlerId | the Handler identifier
    try {
      File result = apiInstance.downloadRunTemplateHandler(organizationId, solutionId, runTemplateId, handlerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SolutionApi#downloadRunTemplateHandler");
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
 **runTemplateId** | **String**| the Run Template identifier |
 **handlerId** | [**RunTemplateHandlerId**](.md)| the Handler identifier | [enum: parameters_handler, validator, prerun, engine, postrun, scenariodata_transform]

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
**200** | the run template handle file as a resource |  -  |
**404** | the Run Template Handler file specified is unknown or you don&#39;t have access to it |  -  |

<a name="findAllSolutions"></a>
# **findAllSolutions**
> List&lt;Solution&gt; findAllSolutions(organizationId, page, size)

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
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SolutionApi apiInstance = new SolutionApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    Integer page = 56; // Integer | page number to query
    Integer size = 56; // Integer | amount of result by page
    try {
      List<Solution> result = apiInstance.findAllSolutions(organizationId, page, size);
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
 **page** | **Integer**| page number to query | [optional]
 **size** | **Integer**| amount of result by page | [optional]

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
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
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

<a name="getSolutionAccessControl"></a>
# **getSolutionAccessControl**
> SolutionAccessControl getSolutionAccessControl(organizationId, solutionId, identityId)

Get a control access for the Solution

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
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SolutionApi apiInstance = new SolutionApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String solutionId = "solutionId_example"; // String | the Solution identifier
    String identityId = "identityId_example"; // String | the User identifier
    try {
      SolutionAccessControl result = apiInstance.getSolutionAccessControl(organizationId, solutionId, identityId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SolutionApi#getSolutionAccessControl");
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
 **identityId** | **String**| the User identifier |

### Return type

[**SolutionAccessControl**](SolutionAccessControl.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The Solution access |  -  |
**404** | The Solution or user specified is unknown or you don&#39;t have access to it |  -  |

<a name="getSolutionSecurity"></a>
# **getSolutionSecurity**
> SolutionSecurity getSolutionSecurity(organizationId, solutionId)

Get the Solution security information

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
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SolutionApi apiInstance = new SolutionApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String solutionId = "solutionId_example"; // String | the Solution identifier
    try {
      SolutionSecurity result = apiInstance.getSolutionSecurity(organizationId, solutionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SolutionApi#getSolutionSecurity");
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

[**SolutionSecurity**](SolutionSecurity.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The Solution security |  -  |
**404** | the Solution specified is unknown or you don&#39;t have access to it |  -  |

<a name="getSolutionSecurityUsers"></a>
# **getSolutionSecurityUsers**
> List&lt;String&gt; getSolutionSecurityUsers(organizationId, solutionId)

Get the Solution security users list

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
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SolutionApi apiInstance = new SolutionApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String solutionId = "solutionId_example"; // String | the Solution identifier
    try {
      List<String> result = apiInstance.getSolutionSecurityUsers(organizationId, solutionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SolutionApi#getSolutionSecurityUsers");
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

**List&lt;String&gt;**

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The Solution security users list |  -  |
**404** | the Solution or the User specified is unknown or you don&#39;t have access to them |  -  |

<a name="removeAllRunTemplates"></a>
# **removeAllRunTemplates**
> removeAllRunTemplates(organizationId, solutionId)

Remove all Run Templates from the Solution specified

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
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SolutionApi apiInstance = new SolutionApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String solutionId = "solutionId_example"; // String | the Solution identifier
    try {
      apiInstance.removeAllRunTemplates(organizationId, solutionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling SolutionApi#removeAllRunTemplates");
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
**404** | the Solution specified is unknown or you don&#39;t have access to it |  -  |

<a name="removeAllSolutionParameterGroups"></a>
# **removeAllSolutionParameterGroups**
> removeAllSolutionParameterGroups(organizationId, solutionId)

Remove all Parameter Groups from the Solution specified

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
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SolutionApi apiInstance = new SolutionApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String solutionId = "solutionId_example"; // String | the Solution identifier
    try {
      apiInstance.removeAllSolutionParameterGroups(organizationId, solutionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling SolutionApi#removeAllSolutionParameterGroups");
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
**404** | the Solution specified is unknown or you don&#39;t have access to it |  -  |

<a name="removeAllSolutionParameters"></a>
# **removeAllSolutionParameters**
> removeAllSolutionParameters(organizationId, solutionId)

Remove all Parameters from the Solution specified

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
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SolutionApi apiInstance = new SolutionApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String solutionId = "solutionId_example"; // String | the Solution identifier
    try {
      apiInstance.removeAllSolutionParameters(organizationId, solutionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling SolutionApi#removeAllSolutionParameters");
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
**404** | the Solution specified is unknown or you don&#39;t have access to it |  -  |

<a name="removeSolutionAccessControl"></a>
# **removeSolutionAccessControl**
> removeSolutionAccessControl(organizationId, solutionId, identityId)

Remove the specified access from the given Organization Solution

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
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SolutionApi apiInstance = new SolutionApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String solutionId = "solutionId_example"; // String | the Solution identifier
    String identityId = "identityId_example"; // String | the User identifier
    try {
      apiInstance.removeSolutionAccessControl(organizationId, solutionId, identityId);
    } catch (ApiException e) {
      System.err.println("Exception when calling SolutionApi#removeSolutionAccessControl");
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
 **identityId** | **String**| the User identifier |

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
**204** | Request succeeded |  -  |
**404** | The Solution or the user specified is unknown or you don&#39;t have access to them |  -  |

<a name="setSolutionDefaultSecurity"></a>
# **setSolutionDefaultSecurity**
> SolutionSecurity setSolutionDefaultSecurity(organizationId, solutionId, solutionRole)

Set the Solution default security

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
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SolutionApi apiInstance = new SolutionApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String solutionId = "solutionId_example"; // String | the Solution identifier
    SolutionRole solutionRole = new SolutionRole(); // SolutionRole | This change the solution default security. The default security is the role assigned to any person not on the Access Control List. If the default security is None, then nobody outside of the ACL can access the solution.
    try {
      SolutionSecurity result = apiInstance.setSolutionDefaultSecurity(organizationId, solutionId, solutionRole);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SolutionApi#setSolutionDefaultSecurity");
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
 **solutionRole** | [**SolutionRole**](SolutionRole.md)| This change the solution default security. The default security is the role assigned to any person not on the Access Control List. If the default security is None, then nobody outside of the ACL can access the solution. |

### Return type

[**SolutionSecurity**](SolutionSecurity.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | The Solution default visibility |  -  |
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
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
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

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the solution details |  -  |
**400** | Bad request |  -  |
**404** | the Solution specified is unknown or you don&#39;t have access to it |  -  |

<a name="updateSolutionAccessControl"></a>
# **updateSolutionAccessControl**
> SolutionAccessControl updateSolutionAccessControl(organizationId, solutionId, identityId, solutionRole)

Update the specified access to User for a Solution

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
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SolutionApi apiInstance = new SolutionApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String solutionId = "solutionId_example"; // String | the Solution identifier
    String identityId = "identityId_example"; // String | the User identifier
    SolutionRole solutionRole = new SolutionRole(); // SolutionRole | The new Solution Access Control
    try {
      SolutionAccessControl result = apiInstance.updateSolutionAccessControl(organizationId, solutionId, identityId, solutionRole);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SolutionApi#updateSolutionAccessControl");
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
 **identityId** | **String**| the User identifier |
 **solutionRole** | [**SolutionRole**](SolutionRole.md)| The new Solution Access Control |

### Return type

[**SolutionAccessControl**](SolutionAccessControl.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The Solution access |  -  |
**404** | The Solution specified is unknown or you don&#39;t have access to it |  -  |

<a name="updateSolutionRunTemplate"></a>
# **updateSolutionRunTemplate**
> List&lt;RunTemplate&gt; updateSolutionRunTemplate(organizationId, solutionId, runTemplateId, runTemplate)

Update the specified Solution Run Template

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
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SolutionApi apiInstance = new SolutionApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String solutionId = "solutionId_example"; // String | the Solution identifier
    String runTemplateId = "runTemplateId_example"; // String | the Run Template identifier
    RunTemplate runTemplate = new RunTemplate(); // RunTemplate | the Run Templates
    try {
      List<RunTemplate> result = apiInstance.updateSolutionRunTemplate(organizationId, solutionId, runTemplateId, runTemplate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SolutionApi#updateSolutionRunTemplate");
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
 **runTemplateId** | **String**| the Run Template identifier |
 **runTemplate** | [**RunTemplate**](RunTemplate.md)| the Run Templates |

### Return type

[**List&lt;RunTemplate&gt;**](RunTemplate.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the Parameters |  -  |
**400** | Bad request |  -  |
**404** | the Solution or Run Template specified is unknown or you don&#39;t have access to it |  -  |

<a name="uploadRunTemplateHandler"></a>
# **uploadRunTemplateHandler**
> uploadRunTemplateHandler(organizationId, solutionId, runTemplateId, handlerId, body, overwrite)

Upload a Run Template step handler zip file

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
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    SolutionApi apiInstance = new SolutionApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String solutionId = "solutionId_example"; // String | the Solution identifier
    String runTemplateId = "runTemplateId_example"; // String | the Run Template identifier
    RunTemplateHandlerId handlerId = RunTemplateHandlerId.fromValue("parameters_handler"); // RunTemplateHandlerId | the Handler identifier
    File body = new File("/path/to/file"); // File | 
    Boolean overwrite = false; // Boolean | whether to overwrite any existing handler resource
    try {
      apiInstance.uploadRunTemplateHandler(organizationId, solutionId, runTemplateId, handlerId, body, overwrite);
    } catch (ApiException e) {
      System.err.println("Exception when calling SolutionApi#uploadRunTemplateHandler");
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
 **runTemplateId** | **String**| the Run Template identifier |
 **handlerId** | [**RunTemplateHandlerId**](.md)| the Handler identifier | [enum: parameters_handler, validator, prerun, engine, postrun, scenariodata_transform]
 **body** | **File**|  |
 **overwrite** | **Boolean**| whether to overwrite any existing handler resource | [optional] [default to false]

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
**201** | zip file uploaded |  -  |
**400** | Bad request |  -  |

