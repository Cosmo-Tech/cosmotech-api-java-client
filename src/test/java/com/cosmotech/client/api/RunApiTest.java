/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.1.1-SNAPSHOT
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.api;

import com.cosmotech.client.ApiException;
import com.cosmotech.client.model.Run;
import com.cosmotech.client.model.RunLogs;
import com.cosmotech.client.model.RunStatus;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RunApi
 */
@Ignore
public class RunApiTest {

    private final RunApi api = new RunApi();

    
    /**
     * Delete a run
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRunTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String runnerId = null;
        String runId = null;
                api.deleteRun(organizationId, workspaceId, runnerId, runId);
        // TODO: test validations
    }
    
    /**
     * Get the details of a run
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRunTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String runnerId = null;
        String runId = null;
                Run response = api.getRun(organizationId, workspaceId, runnerId, runId);
        // TODO: test validations
    }
    
    /**
     * get the logs for the Run
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRunLogsTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String runnerId = null;
        String runId = null;
                RunLogs response = api.getRunLogs(organizationId, workspaceId, runnerId, runId);
        // TODO: test validations
    }
    
    /**
     * get the status for the Run
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRunStatusTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String runnerId = null;
        String runId = null;
                RunStatus response = api.getRunStatus(organizationId, workspaceId, runnerId, runId);
        // TODO: test validations
    }
    
    /**
     * get the list of Runs for the Runner
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listRunsTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String runnerId = null;
        Integer page = null;
        Integer size = null;
                List<Run> response = api.listRuns(organizationId, workspaceId, runnerId, page, size);
        // TODO: test validations
    }
    
}
