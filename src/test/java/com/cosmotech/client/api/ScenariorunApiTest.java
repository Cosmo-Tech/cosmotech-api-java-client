/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.0.10-dev
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.api;

import com.cosmotech.client.ApiException;
import java.io.File;
import com.cosmotech.client.model.ScenarioRun;
import com.cosmotech.client.model.ScenarioRunLogs;
import com.cosmotech.client.model.ScenarioRunSearch;
import com.cosmotech.client.model.ScenarioRunStartContainers;
import com.cosmotech.client.model.ScenarioRunStatus;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ScenariorunApi
 */
@Ignore
public class ScenariorunApiTest {

    private final ScenariorunApi api = new ScenariorunApi();

    
    /**
     * Delete all historical ScenarioRuns in the Organization
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteHistoricalDataOrganizationTest() throws ApiException {
        String organizationId = null;
        Boolean deleteUnknown = null;
                api.deleteHistoricalDataOrganization(organizationId, deleteUnknown);
        // TODO: test validations
    }
    
    /**
     * Delete all historical ScenarioRuns in the Scenario
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteHistoricalDataScenarioTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String scenarioId = null;
        Boolean deleteUnknown = null;
                api.deleteHistoricalDataScenario(organizationId, workspaceId, scenarioId, deleteUnknown);
        // TODO: test validations
    }
    
    /**
     * Delete all historical ScenarioRuns in the Workspace
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteHistoricalDataWorkspaceTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        Boolean deleteUnknown = null;
                api.deleteHistoricalDataWorkspace(organizationId, workspaceId, deleteUnknown);
        // TODO: test validations
    }
    
    /**
     * Delete a scenariorun
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteScenarioRunTest() throws ApiException {
        String organizationId = null;
        String scenariorunId = null;
                api.deleteScenarioRun(organizationId, scenariorunId);
        // TODO: test validations
    }
    
    /**
     * Get the details of a scenariorun
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findScenarioRunByIdTest() throws ApiException {
        String organizationId = null;
        String scenariorunId = null;
                ScenarioRun response = api.findScenarioRunById(organizationId, scenariorunId);
        // TODO: test validations
    }
    
    /**
     * Get the cumulated logs of a scenariorun
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getScenarioRunCumulatedLogsTest() throws ApiException {
        String organizationId = null;
        String scenariorunId = null;
                String response = api.getScenarioRunCumulatedLogs(organizationId, scenariorunId);
        // TODO: test validations
    }
    
    /**
     * get the logs for the ScenarioRun
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getScenarioRunLogsTest() throws ApiException {
        String organizationId = null;
        String scenariorunId = null;
                ScenarioRunLogs response = api.getScenarioRunLogs(organizationId, scenariorunId);
        // TODO: test validations
    }
    
    /**
     * get the status for the ScenarioRun
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getScenarioRunStatusTest() throws ApiException {
        String organizationId = null;
        String scenariorunId = null;
                ScenarioRunStatus response = api.getScenarioRunStatus(organizationId, scenariorunId);
        // TODO: test validations
    }
    
    /**
     * get the list of ScenarioRuns for the Scenario
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getScenarioRunsTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String scenarioId = null;
        Integer page = null;
        Integer size = null;
                List<ScenarioRun> response = api.getScenarioRuns(organizationId, workspaceId, scenarioId, page, size);
        // TODO: test validations
    }
    
    /**
     * get the list of ScenarioRuns for the Workspace
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWorkspaceScenarioRunsTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        Integer page = null;
        Integer size = null;
                List<ScenarioRun> response = api.getWorkspaceScenarioRuns(organizationId, workspaceId, page, size);
        // TODO: test validations
    }
    
    /**
     * run a ScenarioRun for the Scenario
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void runScenarioTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String scenarioId = null;
                ScenarioRun response = api.runScenario(organizationId, workspaceId, scenarioId);
        // TODO: test validations
    }
    
    /**
     * Search ScenarioRuns
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchScenarioRunsTest() throws ApiException {
        String organizationId = null;
        ScenarioRunSearch scenarioRunSearch = null;
        Integer page = null;
        Integer size = null;
                List<ScenarioRun> response = api.searchScenarioRuns(organizationId, scenarioRunSearch, page, size);
        // TODO: test validations
    }
    
    /**
     * Start a new scenariorun with raw containers definition
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void startScenarioRunContainersTest() throws ApiException {
        String organizationId = null;
        ScenarioRunStartContainers scenarioRunStartContainers = null;
                ScenarioRun response = api.startScenarioRunContainers(organizationId, scenarioRunStartContainers);
        // TODO: test validations
    }
    
    /**
     * stop a ScenarioRun for the Scenario
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void stopScenarioRunTest() throws ApiException {
        String organizationId = null;
        String scenariorunId = null;
                ScenarioRunStatus response = api.stopScenarioRun(organizationId, scenariorunId);
        // TODO: test validations
    }
    
}
