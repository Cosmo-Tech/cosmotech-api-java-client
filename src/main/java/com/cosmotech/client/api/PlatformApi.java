/*
 * Cosmo Tech Plaform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 0.0.1-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.api;

import com.cosmotech.client.ApiCallback;
import com.cosmotech.client.ApiClient;
import com.cosmotech.client.ApiException;
import com.cosmotech.client.ApiResponse;
import com.cosmotech.client.Configuration;
import com.cosmotech.client.Pair;
import com.cosmotech.client.ProgressRequestBody;
import com.cosmotech.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.cosmotech.client.model.Platform;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlatformApi {
    private ApiClient localVarApiClient;

    public PlatformApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PlatformApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createPlatform
     * @param platform the Platform to create (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> the platform details </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createPlatformCall(Platform platform, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = platform;

        // create path and map variables
        String localVarPath = "/platform";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "oAuth2AuthCode" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createPlatformValidateBeforeCall(Platform platform, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'platform' is set
        if (platform == null) {
            throw new ApiException("Missing the required parameter 'platform' when calling createPlatform(Async)");
        }
        

        okhttp3.Call localVarCall = createPlatformCall(platform, _callback);
        return localVarCall;

    }

    /**
     * Create a new platform
     * 
     * @param platform the Platform to create (required)
     * @return Platform
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> the platform details </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
     */
    public Platform createPlatform(Platform platform) throws ApiException {
        ApiResponse<Platform> localVarResp = createPlatformWithHttpInfo(platform);
        return localVarResp.getData();
    }

    /**
     * Create a new platform
     * 
     * @param platform the Platform to create (required)
     * @return ApiResponse&lt;Platform&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> the platform details </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Platform> createPlatformWithHttpInfo(Platform platform) throws ApiException {
        okhttp3.Call localVarCall = createPlatformValidateBeforeCall(platform, null);
        Type localVarReturnType = new TypeToken<Platform>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a new platform (asynchronously)
     * 
     * @param platform the Platform to create (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> the platform details </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createPlatformAsync(Platform platform, final ApiCallback<Platform> _callback) throws ApiException {

        okhttp3.Call localVarCall = createPlatformValidateBeforeCall(platform, _callback);
        Type localVarReturnType = new TypeToken<Platform>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPlatform
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> the Platform details </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPlatformCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/platform";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "oAuth2AuthCode" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPlatformValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getPlatformCall(_callback);
        return localVarCall;

    }

    /**
     * Get the details of the platform
     * 
     * @return Platform
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> the Platform details </td><td>  -  </td></tr>
     </table>
     */
    public Platform getPlatform() throws ApiException {
        ApiResponse<Platform> localVarResp = getPlatformWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get the details of the platform
     * 
     * @return ApiResponse&lt;Platform&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> the Platform details </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Platform> getPlatformWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getPlatformValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<Platform>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get the details of the platform (asynchronously)
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> the Platform details </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPlatformAsync(final ApiCallback<Platform> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPlatformValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<Platform>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updatePlatform
     * @param platform the new Platform details. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> the platform details </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> the Platform specified is unknown or you don&#39;t have access to it </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updatePlatformCall(Platform platform, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = platform;

        // create path and map variables
        String localVarPath = "/platform";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "oAuth2AuthCode" };
        return localVarApiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updatePlatformValidateBeforeCall(Platform platform, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'platform' is set
        if (platform == null) {
            throw new ApiException("Missing the required parameter 'platform' when calling updatePlatform(Async)");
        }
        

        okhttp3.Call localVarCall = updatePlatformCall(platform, _callback);
        return localVarCall;

    }

    /**
     * Update a platform
     * 
     * @param platform the new Platform details. (required)
     * @return Platform
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> the platform details </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> the Platform specified is unknown or you don&#39;t have access to it </td><td>  -  </td></tr>
     </table>
     */
    public Platform updatePlatform(Platform platform) throws ApiException {
        ApiResponse<Platform> localVarResp = updatePlatformWithHttpInfo(platform);
        return localVarResp.getData();
    }

    /**
     * Update a platform
     * 
     * @param platform the new Platform details. (required)
     * @return ApiResponse&lt;Platform&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> the platform details </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> the Platform specified is unknown or you don&#39;t have access to it </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Platform> updatePlatformWithHttpInfo(Platform platform) throws ApiException {
        okhttp3.Call localVarCall = updatePlatformValidateBeforeCall(platform, null);
        Type localVarReturnType = new TypeToken<Platform>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update a platform (asynchronously)
     * 
     * @param platform the new Platform details. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> the platform details </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> the Platform specified is unknown or you don&#39;t have access to it </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updatePlatformAsync(Platform platform, final ApiCallback<Platform> _callback) throws ApiException {

        okhttp3.Call localVarCall = updatePlatformValidateBeforeCall(platform, _callback);
        Type localVarReturnType = new TypeToken<Platform>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
