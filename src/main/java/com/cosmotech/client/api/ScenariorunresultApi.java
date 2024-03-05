/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.1.2-dev
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


import com.cosmotech.client.model.ScenarioRunResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScenariorunresultApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ScenariorunresultApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ScenariorunresultApi(ApiClient apiClient) {
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
     * Build call for getScenarioRunResult
     * @param organizationId the Organization identifier (required)
     * @param workspaceId the Workspace identifier (required)
     * @param scenarioId the Scenario identifier (required)
     * @param scenariorunId the ScenarioRun identifier (required)
     * @param probeId the Probe identifier (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> the Organization details </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> the ScenarioRunResult specified is unknown or you don&#39;t have access to it </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getScenarioRunResultCall(String organizationId, String workspaceId, String scenarioId, String scenariorunId, String probeId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/scenarioruns/{scenariorun_id}/probes/{probe_id}"
            .replaceAll("\\{" + "organization_id" + "\\}", localVarApiClient.escapeString(organizationId.toString()))
            .replaceAll("\\{" + "workspace_id" + "\\}", localVarApiClient.escapeString(workspaceId.toString()))
            .replaceAll("\\{" + "scenario_id" + "\\}", localVarApiClient.escapeString(scenarioId.toString()))
            .replaceAll("\\{" + "scenariorun_id" + "\\}", localVarApiClient.escapeString(scenariorunId.toString()))
            .replaceAll("\\{" + "probe_id" + "\\}", localVarApiClient.escapeString(probeId.toString()));

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
    private okhttp3.Call getScenarioRunResultValidateBeforeCall(String organizationId, String workspaceId, String scenarioId, String scenariorunId, String probeId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new ApiException("Missing the required parameter 'organizationId' when calling getScenarioRunResult(Async)");
        }
        
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling getScenarioRunResult(Async)");
        }
        
        // verify the required parameter 'scenarioId' is set
        if (scenarioId == null) {
            throw new ApiException("Missing the required parameter 'scenarioId' when calling getScenarioRunResult(Async)");
        }
        
        // verify the required parameter 'scenariorunId' is set
        if (scenariorunId == null) {
            throw new ApiException("Missing the required parameter 'scenariorunId' when calling getScenarioRunResult(Async)");
        }
        
        // verify the required parameter 'probeId' is set
        if (probeId == null) {
            throw new ApiException("Missing the required parameter 'probeId' when calling getScenarioRunResult(Async)");
        }
        

        okhttp3.Call localVarCall = getScenarioRunResultCall(organizationId, workspaceId, scenarioId, scenariorunId, probeId, _callback);
        return localVarCall;

    }

    /**
     * Get a ScenarioRunResult in the Organization
     * 
     * @param organizationId the Organization identifier (required)
     * @param workspaceId the Workspace identifier (required)
     * @param scenarioId the Scenario identifier (required)
     * @param scenariorunId the ScenarioRun identifier (required)
     * @param probeId the Probe identifier (required)
     * @return ScenarioRunResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> the Organization details </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> the ScenarioRunResult specified is unknown or you don&#39;t have access to it </td><td>  -  </td></tr>
     </table>
     */
    public ScenarioRunResult getScenarioRunResult(String organizationId, String workspaceId, String scenarioId, String scenariorunId, String probeId) throws ApiException {
        ApiResponse<ScenarioRunResult> localVarResp = getScenarioRunResultWithHttpInfo(organizationId, workspaceId, scenarioId, scenariorunId, probeId);
        return localVarResp.getData();
    }

    /**
     * Get a ScenarioRunResult in the Organization
     * 
     * @param organizationId the Organization identifier (required)
     * @param workspaceId the Workspace identifier (required)
     * @param scenarioId the Scenario identifier (required)
     * @param scenariorunId the ScenarioRun identifier (required)
     * @param probeId the Probe identifier (required)
     * @return ApiResponse&lt;ScenarioRunResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> the Organization details </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> the ScenarioRunResult specified is unknown or you don&#39;t have access to it </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ScenarioRunResult> getScenarioRunResultWithHttpInfo(String organizationId, String workspaceId, String scenarioId, String scenariorunId, String probeId) throws ApiException {
        okhttp3.Call localVarCall = getScenarioRunResultValidateBeforeCall(organizationId, workspaceId, scenarioId, scenariorunId, probeId, null);
        Type localVarReturnType = new TypeToken<ScenarioRunResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a ScenarioRunResult in the Organization (asynchronously)
     * 
     * @param organizationId the Organization identifier (required)
     * @param workspaceId the Workspace identifier (required)
     * @param scenarioId the Scenario identifier (required)
     * @param scenariorunId the ScenarioRun identifier (required)
     * @param probeId the Probe identifier (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> the Organization details </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> the ScenarioRunResult specified is unknown or you don&#39;t have access to it </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getScenarioRunResultAsync(String organizationId, String workspaceId, String scenarioId, String scenariorunId, String probeId, final ApiCallback<ScenarioRunResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = getScenarioRunResultValidateBeforeCall(organizationId, workspaceId, scenarioId, scenariorunId, probeId, _callback);
        Type localVarReturnType = new TypeToken<ScenarioRunResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for sendScenarioRunResult
     * @param organizationId the Organization identifier (required)
     * @param workspaceId the Workspace identifier (required)
     * @param scenarioId the Scenario identifier (required)
     * @param scenariorunId the ScenarioRun identifier (required)
     * @param probeId the Probe identifier (required)
     * @param requestBody the ScenarioRunResult to register (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> the Organization details </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> the ScenarioRunResult specified is unknown or you don&#39;t have access to it </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sendScenarioRunResultCall(String organizationId, String workspaceId, String scenarioId, String scenariorunId, String probeId, Map<String, String> requestBody, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = requestBody;

        // create path and map variables
        String localVarPath = "/organizations/{organization_id}/workspaces/{workspace_id}/scenarios/{scenario_id}/scenarioruns/{scenariorun_id}/probes/{probe_id}"
            .replaceAll("\\{" + "organization_id" + "\\}", localVarApiClient.escapeString(organizationId.toString()))
            .replaceAll("\\{" + "workspace_id" + "\\}", localVarApiClient.escapeString(workspaceId.toString()))
            .replaceAll("\\{" + "scenario_id" + "\\}", localVarApiClient.escapeString(scenarioId.toString()))
            .replaceAll("\\{" + "scenariorun_id" + "\\}", localVarApiClient.escapeString(scenariorunId.toString()))
            .replaceAll("\\{" + "probe_id" + "\\}", localVarApiClient.escapeString(probeId.toString()));

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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oAuth2AuthCode" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call sendScenarioRunResultValidateBeforeCall(String organizationId, String workspaceId, String scenarioId, String scenariorunId, String probeId, Map<String, String> requestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new ApiException("Missing the required parameter 'organizationId' when calling sendScenarioRunResult(Async)");
        }
        
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling sendScenarioRunResult(Async)");
        }
        
        // verify the required parameter 'scenarioId' is set
        if (scenarioId == null) {
            throw new ApiException("Missing the required parameter 'scenarioId' when calling sendScenarioRunResult(Async)");
        }
        
        // verify the required parameter 'scenariorunId' is set
        if (scenariorunId == null) {
            throw new ApiException("Missing the required parameter 'scenariorunId' when calling sendScenarioRunResult(Async)");
        }
        
        // verify the required parameter 'probeId' is set
        if (probeId == null) {
            throw new ApiException("Missing the required parameter 'probeId' when calling sendScenarioRunResult(Async)");
        }
        
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new ApiException("Missing the required parameter 'requestBody' when calling sendScenarioRunResult(Async)");
        }
        

        okhttp3.Call localVarCall = sendScenarioRunResultCall(organizationId, workspaceId, scenarioId, scenariorunId, probeId, requestBody, _callback);
        return localVarCall;

    }

    /**
     * Create a new ScenarioRunResult in the Organization
     * 
     * @param organizationId the Organization identifier (required)
     * @param workspaceId the Workspace identifier (required)
     * @param scenarioId the Scenario identifier (required)
     * @param scenariorunId the ScenarioRun identifier (required)
     * @param probeId the Probe identifier (required)
     * @param requestBody the ScenarioRunResult to register (required)
     * @return ScenarioRunResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> the Organization details </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> the ScenarioRunResult specified is unknown or you don&#39;t have access to it </td><td>  -  </td></tr>
     </table>
     */
    public ScenarioRunResult sendScenarioRunResult(String organizationId, String workspaceId, String scenarioId, String scenariorunId, String probeId, Map<String, String> requestBody) throws ApiException {
        ApiResponse<ScenarioRunResult> localVarResp = sendScenarioRunResultWithHttpInfo(organizationId, workspaceId, scenarioId, scenariorunId, probeId, requestBody);
        return localVarResp.getData();
    }

    /**
     * Create a new ScenarioRunResult in the Organization
     * 
     * @param organizationId the Organization identifier (required)
     * @param workspaceId the Workspace identifier (required)
     * @param scenarioId the Scenario identifier (required)
     * @param scenariorunId the ScenarioRun identifier (required)
     * @param probeId the Probe identifier (required)
     * @param requestBody the ScenarioRunResult to register (required)
     * @return ApiResponse&lt;ScenarioRunResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> the Organization details </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> the ScenarioRunResult specified is unknown or you don&#39;t have access to it </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ScenarioRunResult> sendScenarioRunResultWithHttpInfo(String organizationId, String workspaceId, String scenarioId, String scenariorunId, String probeId, Map<String, String> requestBody) throws ApiException {
        okhttp3.Call localVarCall = sendScenarioRunResultValidateBeforeCall(organizationId, workspaceId, scenarioId, scenariorunId, probeId, requestBody, null);
        Type localVarReturnType = new TypeToken<ScenarioRunResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a new ScenarioRunResult in the Organization (asynchronously)
     * 
     * @param organizationId the Organization identifier (required)
     * @param workspaceId the Workspace identifier (required)
     * @param scenarioId the Scenario identifier (required)
     * @param scenariorunId the ScenarioRun identifier (required)
     * @param probeId the Probe identifier (required)
     * @param requestBody the ScenarioRunResult to register (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> the Organization details </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> the ScenarioRunResult specified is unknown or you don&#39;t have access to it </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sendScenarioRunResultAsync(String organizationId, String workspaceId, String scenarioId, String scenariorunId, String probeId, Map<String, String> requestBody, final ApiCallback<ScenarioRunResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = sendScenarioRunResultValidateBeforeCall(organizationId, workspaceId, scenarioId, scenariorunId, probeId, requestBody, _callback);
        Type localVarReturnType = new TypeToken<ScenarioRunResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
