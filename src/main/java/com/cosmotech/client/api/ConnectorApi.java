/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.0.6-SNAPSHOT
 * Contact: platform@cosmotech.com
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


import com.cosmotech.client.model.Connector;
import java.io.File;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConnectorApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ConnectorApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ConnectorApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for findAllConnectors
     * @param page page number to query (optional)
     * @param size amount of result by page (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> the list of Connectors </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findAllConnectorsCall(Integer page, Integer size, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/connectors";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (size != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("size", size));
        }

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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oAuth2AuthCode" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call findAllConnectorsValidateBeforeCall(Integer page, Integer size, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = findAllConnectorsCall(page, size, _callback);
        return localVarCall;

    }

    /**
     * List all Connectors
     * 
     * @param page page number to query (optional)
     * @param size amount of result by page (optional)
     * @return List&lt;Connector&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> the list of Connectors </td><td>  -  </td></tr>
     </table>
     */
    public List<Connector> findAllConnectors(Integer page, Integer size) throws ApiException {
        ApiResponse<List<Connector>> localVarResp = findAllConnectorsWithHttpInfo(page, size);
        return localVarResp.getData();
    }

    /**
     * List all Connectors
     * 
     * @param page page number to query (optional)
     * @param size amount of result by page (optional)
     * @return ApiResponse&lt;List&lt;Connector&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> the list of Connectors </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Connector>> findAllConnectorsWithHttpInfo(Integer page, Integer size) throws ApiException {
        okhttp3.Call localVarCall = findAllConnectorsValidateBeforeCall(page, size, null);
        Type localVarReturnType = new TypeToken<List<Connector>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List all Connectors (asynchronously)
     * 
     * @param page page number to query (optional)
     * @param size amount of result by page (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> the list of Connectors </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findAllConnectorsAsync(Integer page, Integer size, final ApiCallback<List<Connector>> _callback) throws ApiException {

        okhttp3.Call localVarCall = findAllConnectorsValidateBeforeCall(page, size, _callback);
        Type localVarReturnType = new TypeToken<List<Connector>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for findConnectorById
     * @param connectorId the Connector identifier (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> the Connector details </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> the Connector specified is unknown or you don&#39;t have access to it </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findConnectorByIdCall(String connectorId, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/connectors/{connector_id}"
            .replaceAll("\\{" + "connector_id" + "\\}", localVarApiClient.escapeString(connectorId.toString()));

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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oAuth2AuthCode" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call findConnectorByIdValidateBeforeCall(String connectorId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'connectorId' is set
        if (connectorId == null) {
            throw new ApiException("Missing the required parameter 'connectorId' when calling findConnectorById(Async)");
        }
        

        okhttp3.Call localVarCall = findConnectorByIdCall(connectorId, _callback);
        return localVarCall;

    }

    /**
     * Get the details of a connector
     * 
     * @param connectorId the Connector identifier (required)
     * @return Connector
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> the Connector details </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> the Connector specified is unknown or you don&#39;t have access to it </td><td>  -  </td></tr>
     </table>
     */
    public Connector findConnectorById(String connectorId) throws ApiException {
        ApiResponse<Connector> localVarResp = findConnectorByIdWithHttpInfo(connectorId);
        return localVarResp.getData();
    }

    /**
     * Get the details of a connector
     * 
     * @param connectorId the Connector identifier (required)
     * @return ApiResponse&lt;Connector&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> the Connector details </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> the Connector specified is unknown or you don&#39;t have access to it </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Connector> findConnectorByIdWithHttpInfo(String connectorId) throws ApiException {
        okhttp3.Call localVarCall = findConnectorByIdValidateBeforeCall(connectorId, null);
        Type localVarReturnType = new TypeToken<Connector>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get the details of a connector (asynchronously)
     * 
     * @param connectorId the Connector identifier (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> the Connector details </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> the Connector specified is unknown or you don&#39;t have access to it </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findConnectorByIdAsync(String connectorId, final ApiCallback<Connector> _callback) throws ApiException {

        okhttp3.Call localVarCall = findConnectorByIdValidateBeforeCall(connectorId, _callback);
        Type localVarReturnType = new TypeToken<Connector>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for findConnectorByName
     * @param connectorName the Connector name (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> the Connector details </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findConnectorByNameCall(String connectorName, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/connectors/name/{connector_name}"
            .replaceAll("\\{" + "connector_name" + "\\}", localVarApiClient.escapeString(connectorName.toString()));

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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oAuth2AuthCode" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call findConnectorByNameValidateBeforeCall(String connectorName, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'connectorName' is set
        if (connectorName == null) {
            throw new ApiException("Missing the required parameter 'connectorName' when calling findConnectorByName(Async)");
        }
        

        okhttp3.Call localVarCall = findConnectorByNameCall(connectorName, _callback);
        return localVarCall;

    }

    /**
     * Get the details of a connector
     * 
     * @param connectorName the Connector name (required)
     * @return Connector
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> the Connector details </td><td>  -  </td></tr>
     </table>
     */
    public Connector findConnectorByName(String connectorName) throws ApiException {
        ApiResponse<Connector> localVarResp = findConnectorByNameWithHttpInfo(connectorName);
        return localVarResp.getData();
    }

    /**
     * Get the details of a connector
     * 
     * @param connectorName the Connector name (required)
     * @return ApiResponse&lt;Connector&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> the Connector details </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Connector> findConnectorByNameWithHttpInfo(String connectorName) throws ApiException {
        okhttp3.Call localVarCall = findConnectorByNameValidateBeforeCall(connectorName, null);
        Type localVarReturnType = new TypeToken<Connector>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get the details of a connector (asynchronously)
     * 
     * @param connectorName the Connector name (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> the Connector details </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findConnectorByNameAsync(String connectorName, final ApiCallback<Connector> _callback) throws ApiException {

        okhttp3.Call localVarCall = findConnectorByNameValidateBeforeCall(connectorName, _callback);
        Type localVarReturnType = new TypeToken<Connector>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for registerConnector
     * @param connector the Connector to register (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> the connector details </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call registerConnectorCall(Connector connector, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = connector;

        // create path and map variables
        String localVarPath = "/connectors";

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
            "application/json", "application/yaml"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oAuth2AuthCode" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call registerConnectorValidateBeforeCall(Connector connector, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'connector' is set
        if (connector == null) {
            throw new ApiException("Missing the required parameter 'connector' when calling registerConnector(Async)");
        }
        

        okhttp3.Call localVarCall = registerConnectorCall(connector, _callback);
        return localVarCall;

    }

    /**
     * Register a new connector
     * 
     * @param connector the Connector to register (required)
     * @return Connector
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> the connector details </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
     */
    public Connector registerConnector(Connector connector) throws ApiException {
        ApiResponse<Connector> localVarResp = registerConnectorWithHttpInfo(connector);
        return localVarResp.getData();
    }

    /**
     * Register a new connector
     * 
     * @param connector the Connector to register (required)
     * @return ApiResponse&lt;Connector&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> the connector details </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Connector> registerConnectorWithHttpInfo(Connector connector) throws ApiException {
        okhttp3.Call localVarCall = registerConnectorValidateBeforeCall(connector, null);
        Type localVarReturnType = new TypeToken<Connector>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Register a new connector (asynchronously)
     * 
     * @param connector the Connector to register (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> the connector details </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call registerConnectorAsync(Connector connector, final ApiCallback<Connector> _callback) throws ApiException {

        okhttp3.Call localVarCall = registerConnectorValidateBeforeCall(connector, _callback);
        Type localVarReturnType = new TypeToken<Connector>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for unregisterConnector
     * @param connectorId the Connector identifier (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Request successful </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> the Connector specified is unknown or you don&#39;t have access to it </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call unregisterConnectorCall(String connectorId, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/connectors/{connector_id}"
            .replaceAll("\\{" + "connector_id" + "\\}", localVarApiClient.escapeString(connectorId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oAuth2AuthCode" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call unregisterConnectorValidateBeforeCall(String connectorId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'connectorId' is set
        if (connectorId == null) {
            throw new ApiException("Missing the required parameter 'connectorId' when calling unregisterConnector(Async)");
        }
        

        okhttp3.Call localVarCall = unregisterConnectorCall(connectorId, _callback);
        return localVarCall;

    }

    /**
     * Unregister a connector
     * 
     * @param connectorId the Connector identifier (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Request successful </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> the Connector specified is unknown or you don&#39;t have access to it </td><td>  -  </td></tr>
     </table>
     */
    public void unregisterConnector(String connectorId) throws ApiException {
        unregisterConnectorWithHttpInfo(connectorId);
    }

    /**
     * Unregister a connector
     * 
     * @param connectorId the Connector identifier (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Request successful </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> the Connector specified is unknown or you don&#39;t have access to it </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> unregisterConnectorWithHttpInfo(String connectorId) throws ApiException {
        okhttp3.Call localVarCall = unregisterConnectorValidateBeforeCall(connectorId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Unregister a connector (asynchronously)
     * 
     * @param connectorId the Connector identifier (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Request successful </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> the Connector specified is unknown or you don&#39;t have access to it </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call unregisterConnectorAsync(String connectorId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = unregisterConnectorValidateBeforeCall(connectorId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
