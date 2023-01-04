/*
 * Cosmo Tech Plaform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 2.1.10-dev
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


import com.cosmotech.client.model.TwinGraphImport;
import com.cosmotech.client.model.TwinGraphImportInfo;
import com.cosmotech.client.model.TwinGraphQuery;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwingraphApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TwingraphApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TwingraphApi(ApiClient apiClient) {
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
     * Build call for delete
     * @param organizationId the Organization identifier (required)
     * @param graphId the Graph Identifier (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteCall(String organizationId, String graphId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/organizations/{organization_id}/twingraph/{graph_id}"
            .replaceAll("\\{" + "organization_id" + "\\}", localVarApiClient.escapeString(organizationId.toString()))
            .replaceAll("\\{" + "graph_id" + "\\}", localVarApiClient.escapeString(graphId.toString()));

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
    private okhttp3.Call deleteValidateBeforeCall(String organizationId, String graphId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new ApiException("Missing the required parameter 'organizationId' when calling delete(Async)");
        }
        
        // verify the required parameter 'graphId' is set
        if (graphId == null) {
            throw new ApiException("Missing the required parameter 'graphId' when calling delete(Async)");
        }
        

        okhttp3.Call localVarCall = deleteCall(organizationId, graphId, _callback);
        return localVarCall;

    }

    /**
     * 
     * Launch a mass delete job
     * @param organizationId the Organization identifier (required)
     * @param graphId the Graph Identifier (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public void delete(String organizationId, String graphId) throws ApiException {
        deleteWithHttpInfo(organizationId, graphId);
    }

    /**
     * 
     * Launch a mass delete job
     * @param organizationId the Organization identifier (required)
     * @param graphId the Graph Identifier (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteWithHttpInfo(String organizationId, String graphId) throws ApiException {
        okhttp3.Call localVarCall = deleteValidateBeforeCall(organizationId, graphId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * Launch a mass delete job
     * @param organizationId the Organization identifier (required)
     * @param graphId the Graph Identifier (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteAsync(String organizationId, String graphId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteValidateBeforeCall(organizationId, graphId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for importGraph
     * @param organizationId the Organization identifier (required)
     * @param twinGraphImport the graph to import (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call importGraphCall(String organizationId, TwinGraphImport twinGraphImport, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = twinGraphImport;

        // create path and map variables
        String localVarPath = "/organizations/{organization_id}/twingraph/import"
            .replaceAll("\\{" + "organization_id" + "\\}", localVarApiClient.escapeString(organizationId.toString()));

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
    private okhttp3.Call importGraphValidateBeforeCall(String organizationId, TwinGraphImport twinGraphImport, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new ApiException("Missing the required parameter 'organizationId' when calling importGraph(Async)");
        }
        
        // verify the required parameter 'twinGraphImport' is set
        if (twinGraphImport == null) {
            throw new ApiException("Missing the required parameter 'twinGraphImport' when calling importGraph(Async)");
        }
        

        okhttp3.Call localVarCall = importGraphCall(organizationId, twinGraphImport, _callback);
        return localVarCall;

    }

    /**
     * 
     * Import a new version of a twin graph
     * @param organizationId the Organization identifier (required)
     * @param twinGraphImport the graph to import (required)
     * @return TwinGraphImportInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public TwinGraphImportInfo importGraph(String organizationId, TwinGraphImport twinGraphImport) throws ApiException {
        ApiResponse<TwinGraphImportInfo> localVarResp = importGraphWithHttpInfo(organizationId, twinGraphImport);
        return localVarResp.getData();
    }

    /**
     * 
     * Import a new version of a twin graph
     * @param organizationId the Organization identifier (required)
     * @param twinGraphImport the graph to import (required)
     * @return ApiResponse&lt;TwinGraphImportInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TwinGraphImportInfo> importGraphWithHttpInfo(String organizationId, TwinGraphImport twinGraphImport) throws ApiException {
        okhttp3.Call localVarCall = importGraphValidateBeforeCall(organizationId, twinGraphImport, null);
        Type localVarReturnType = new TypeToken<TwinGraphImportInfo>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Import a new version of a twin graph
     * @param organizationId the Organization identifier (required)
     * @param twinGraphImport the graph to import (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call importGraphAsync(String organizationId, TwinGraphImport twinGraphImport, final ApiCallback<TwinGraphImportInfo> _callback) throws ApiException {

        okhttp3.Call localVarCall = importGraphValidateBeforeCall(organizationId, twinGraphImport, _callback);
        Type localVarReturnType = new TypeToken<TwinGraphImportInfo>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for jobStatus
     * @param organizationId the Organization identifier (required)
     * @param jobId the job identifier (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call jobStatusCall(String organizationId, String jobId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/organizations/{organization_id}/job/{job_id}/status"
            .replaceAll("\\{" + "organization_id" + "\\}", localVarApiClient.escapeString(organizationId.toString()))
            .replaceAll("\\{" + "job_id" + "\\}", localVarApiClient.escapeString(jobId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/yaml", "application/json"
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
    private okhttp3.Call jobStatusValidateBeforeCall(String organizationId, String jobId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new ApiException("Missing the required parameter 'organizationId' when calling jobStatus(Async)");
        }
        
        // verify the required parameter 'jobId' is set
        if (jobId == null) {
            throw new ApiException("Missing the required parameter 'jobId' when calling jobStatus(Async)");
        }
        

        okhttp3.Call localVarCall = jobStatusCall(organizationId, jobId, _callback);
        return localVarCall;

    }

    /**
     * 
     * Get the status of a job
     * @param organizationId the Organization identifier (required)
     * @param jobId the job identifier (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public String jobStatus(String organizationId, String jobId) throws ApiException {
        ApiResponse<String> localVarResp = jobStatusWithHttpInfo(organizationId, jobId);
        return localVarResp.getData();
    }

    /**
     * 
     * Get the status of a job
     * @param organizationId the Organization identifier (required)
     * @param jobId the job identifier (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<String> jobStatusWithHttpInfo(String organizationId, String jobId) throws ApiException {
        okhttp3.Call localVarCall = jobStatusValidateBeforeCall(organizationId, jobId, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get the status of a job
     * @param organizationId the Organization identifier (required)
     * @param jobId the job identifier (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call jobStatusAsync(String organizationId, String jobId, final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = jobStatusValidateBeforeCall(organizationId, jobId, _callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for query
     * @param organizationId the Organization identifier (required)
     * @param graphId the Graph Identifier (required)
     * @param twinGraphQuery the query to run (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call queryCall(String organizationId, String graphId, TwinGraphQuery twinGraphQuery, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = twinGraphQuery;

        // create path and map variables
        String localVarPath = "/organizations/{organization_id}/twingraph/{graph_id}/query"
            .replaceAll("\\{" + "organization_id" + "\\}", localVarApiClient.escapeString(organizationId.toString()))
            .replaceAll("\\{" + "graph_id" + "\\}", localVarApiClient.escapeString(graphId.toString()));

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
    private okhttp3.Call queryValidateBeforeCall(String organizationId, String graphId, TwinGraphQuery twinGraphQuery, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new ApiException("Missing the required parameter 'organizationId' when calling query(Async)");
        }
        
        // verify the required parameter 'graphId' is set
        if (graphId == null) {
            throw new ApiException("Missing the required parameter 'graphId' when calling query(Async)");
        }
        
        // verify the required parameter 'twinGraphQuery' is set
        if (twinGraphQuery == null) {
            throw new ApiException("Missing the required parameter 'twinGraphQuery' when calling query(Async)");
        }
        

        okhttp3.Call localVarCall = queryCall(organizationId, graphId, twinGraphQuery, _callback);
        return localVarCall;

    }

    /**
     * 
     * Run a query on a graph instance
     * @param organizationId the Organization identifier (required)
     * @param graphId the Graph Identifier (required)
     * @param twinGraphQuery the query to run (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public String query(String organizationId, String graphId, TwinGraphQuery twinGraphQuery) throws ApiException {
        ApiResponse<String> localVarResp = queryWithHttpInfo(organizationId, graphId, twinGraphQuery);
        return localVarResp.getData();
    }

    /**
     * 
     * Run a query on a graph instance
     * @param organizationId the Organization identifier (required)
     * @param graphId the Graph Identifier (required)
     * @param twinGraphQuery the query to run (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<String> queryWithHttpInfo(String organizationId, String graphId, TwinGraphQuery twinGraphQuery) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(organizationId, graphId, twinGraphQuery, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Run a query on a graph instance
     * @param organizationId the Organization identifier (required)
     * @param graphId the Graph Identifier (required)
     * @param twinGraphQuery the query to run (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call queryAsync(String organizationId, String graphId, TwinGraphQuery twinGraphQuery, final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(organizationId, graphId, twinGraphQuery, _callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
