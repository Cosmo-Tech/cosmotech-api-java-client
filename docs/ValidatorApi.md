# ValidatorApi

All URIs are relative to *https://dev.api.cosmotech.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createValidator**](ValidatorApi.md#createValidator) | **POST** /organizations/{organization_id}/datasets/validators | Register a new validator
[**createValidatorRun**](ValidatorApi.md#createValidatorRun) | **POST** /organizations/{organization_id}/datasets/validators/{validator_id}/history | Register a new validator run
[**deleteValidator**](ValidatorApi.md#deleteValidator) | **DELETE** /organizations/{organization_id}/datasets/validators/{validator_id} | Delete a validator
[**deleteValidatorRun**](ValidatorApi.md#deleteValidatorRun) | **DELETE** /organizations/{organization_id}/datasets/validators/{validator_id}/history/{validatorrun_id} | Delete a validator run
[**findAllValidatorRuns**](ValidatorApi.md#findAllValidatorRuns) | **GET** /organizations/{organization_id}/datasets/validators/{validator_id}/history | List all Validator Runs
[**findAllValidators**](ValidatorApi.md#findAllValidators) | **GET** /organizations/{organization_id}/datasets/validators | List all Validators
[**findValidatorById**](ValidatorApi.md#findValidatorById) | **GET** /organizations/{organization_id}/datasets/validators/{validator_id} | Get the details of a validator
[**findValidatorRunById**](ValidatorApi.md#findValidatorRunById) | **GET** /organizations/{organization_id}/datasets/validators/{validator_id}/history/{validatorrun_id} | Get the details of a validator run
[**runValidator**](ValidatorApi.md#runValidator) | **POST** /organizations/{organization_id}/datasets/validators/{validator_id}/run | Run a Validator


<a name="createValidator"></a>
# **createValidator**
> Validator createValidator(organizationId, validator)

Register a new validator

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.ValidatorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ValidatorApi apiInstance = new ValidatorApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    Validator validator = new Validator(); // Validator | the Validator to create
    try {
      Validator result = apiInstance.createValidator(organizationId, validator);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidatorApi#createValidator");
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
 **validator** | [**Validator**](Validator.md)| the Validator to create |

### Return type

[**Validator**](Validator.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | the validator details |  -  |
**400** | Bad request |  -  |

<a name="createValidatorRun"></a>
# **createValidatorRun**
> ValidatorRun createValidatorRun(organizationId, validatorId, validatorRun)

Register a new validator run

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.ValidatorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ValidatorApi apiInstance = new ValidatorApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String validatorId = "validatorId_example"; // String | the ValidatorRun identifier
    ValidatorRun validatorRun = new ValidatorRun(); // ValidatorRun | the Validator Run to create
    try {
      ValidatorRun result = apiInstance.createValidatorRun(organizationId, validatorId, validatorRun);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidatorApi#createValidatorRun");
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
 **validatorId** | **String**| the ValidatorRun identifier |
 **validatorRun** | [**ValidatorRun**](ValidatorRun.md)| the Validator Run to create |

### Return type

[**ValidatorRun**](ValidatorRun.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | the validator run details |  -  |
**400** | Bad request |  -  |

<a name="deleteValidator"></a>
# **deleteValidator**
> deleteValidator(organizationId, validatorId)

Delete a validator

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.ValidatorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ValidatorApi apiInstance = new ValidatorApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String validatorId = "validatorId_example"; // String | the Validator identifier
    try {
      apiInstance.deleteValidator(organizationId, validatorId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidatorApi#deleteValidator");
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
 **validatorId** | **String**| the Validator identifier |

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
**404** | the Validator specified is unknown or you don&#39;t have access to it |  -  |

<a name="deleteValidatorRun"></a>
# **deleteValidatorRun**
> deleteValidatorRun(organizationId, validatorId, validatorrunId)

Delete a validator run

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.ValidatorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ValidatorApi apiInstance = new ValidatorApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String validatorId = "validatorId_example"; // String | the Validator identifier
    String validatorrunId = "validatorrunId_example"; // String | the Validator Run identifier
    try {
      apiInstance.deleteValidatorRun(organizationId, validatorId, validatorrunId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidatorApi#deleteValidatorRun");
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
 **validatorId** | **String**| the Validator identifier |
 **validatorrunId** | **String**| the Validator Run identifier |

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
**404** | the ValidatorRun specified is unknown or you don&#39;t have access to it |  -  |

<a name="findAllValidatorRuns"></a>
# **findAllValidatorRuns**
> List&lt;ValidatorRun&gt; findAllValidatorRuns(organizationId, validatorId)

List all Validator Runs

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.ValidatorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ValidatorApi apiInstance = new ValidatorApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String validatorId = "validatorId_example"; // String | the ValidatorRun identifier
    try {
      List<ValidatorRun> result = apiInstance.findAllValidatorRuns(organizationId, validatorId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidatorApi#findAllValidatorRuns");
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
 **validatorId** | **String**| the ValidatorRun identifier |

### Return type

[**List&lt;ValidatorRun&gt;**](ValidatorRun.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the validator run details |  -  |

<a name="findAllValidators"></a>
# **findAllValidators**
> List&lt;Validator&gt; findAllValidators(organizationId)

List all Validators

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.ValidatorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ValidatorApi apiInstance = new ValidatorApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    try {
      List<Validator> result = apiInstance.findAllValidators(organizationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidatorApi#findAllValidators");
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

[**List&lt;Validator&gt;**](Validator.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the validator details |  -  |

<a name="findValidatorById"></a>
# **findValidatorById**
> Validator findValidatorById(organizationId, validatorId)

Get the details of a validator

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.ValidatorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ValidatorApi apiInstance = new ValidatorApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String validatorId = "validatorId_example"; // String | the Validator identifier
    try {
      Validator result = apiInstance.findValidatorById(organizationId, validatorId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidatorApi#findValidatorById");
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
 **validatorId** | **String**| the Validator identifier |

### Return type

[**Validator**](Validator.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the Validator details |  -  |
**404** | the Validator specified is unknown or you don&#39;t have access to it |  -  |

<a name="findValidatorRunById"></a>
# **findValidatorRunById**
> ValidatorRun findValidatorRunById(organizationId, validatorId, validatorrunId)

Get the details of a validator run

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.ValidatorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ValidatorApi apiInstance = new ValidatorApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String validatorId = "validatorId_example"; // String | the Validator identifier
    String validatorrunId = "validatorrunId_example"; // String | the Validator Run identifier
    try {
      ValidatorRun result = apiInstance.findValidatorRunById(organizationId, validatorId, validatorrunId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidatorApi#findValidatorRunById");
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
 **validatorId** | **String**| the Validator identifier |
 **validatorrunId** | **String**| the Validator Run identifier |

### Return type

[**ValidatorRun**](ValidatorRun.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | the Validator Run details |  -  |
**404** | the ValidatorRun specified is unknown or you don&#39;t have access to it |  -  |

<a name="runValidator"></a>
# **runValidator**
> ValidatorRun runValidator(organizationId, validatorId, validatorRun)

Run a Validator

### Example
```java
// Import classes:
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.auth.*;
import com.cosmotech.client.models.*;
import com.cosmotech.client.api.ValidatorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.api.cosmotech.com");
    
    // Configure OAuth2 access token for authorization: oAuth2AuthCode
    OAuth oAuth2AuthCode = (OAuth) defaultClient.getAuthentication("oAuth2AuthCode");
    oAuth2AuthCode.setAccessToken("YOUR ACCESS TOKEN");

    ValidatorApi apiInstance = new ValidatorApi(defaultClient);
    String organizationId = "organizationId_example"; // String | the Organization identifier
    String validatorId = "validatorId_example"; // String | the ValidatorRun identifier
    ValidatorRun validatorRun = new ValidatorRun(); // ValidatorRun | the Validator to run
    try {
      ValidatorRun result = apiInstance.runValidator(organizationId, validatorId, validatorRun);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidatorApi#runValidator");
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
 **validatorId** | **String**| the ValidatorRun identifier |
 **validatorRun** | [**ValidatorRun**](ValidatorRun.md)| the Validator to run |

### Return type

[**ValidatorRun**](ValidatorRun.md)

### Authorization

[oAuth2AuthCode](../README.md#oAuth2AuthCode)

### HTTP request headers

 - **Content-Type**: application/json, application/yaml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | the validator run details |  -  |
**400** | Bad request |  -  |

