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

import com.cosmotech.client.ApiException;
import com.cosmotech.client.model.ScenarioRun;
import com.cosmotech.client.model.ScenarioRunLogs;
import com.cosmotech.client.model.ScenarioRunLogsOptions;
import com.cosmotech.client.model.ScenarioRunSearch;
import com.cosmotech.client.model.ScenarioRunStart;
import com.cosmotech.client.model.ScenarioRunStartContainers;
import com.cosmotech.client.model.ScenarioRunStartSolution;
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
        ScenarioRun response = api.deleteScenarioRun(organizationId, scenariorunId);

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
     * get the ScenarioRun for the Scenario
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getScenarioScenarioRunTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String scenarioId = null;
        String scenariorunId = null;
        ScenarioRun response = api.getScenarioScenarioRun(organizationId, workspaceId, scenarioId, scenariorunId);

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
    public void getScenarioScenarioRunLogsTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String scenarioId = null;
        String scenariorunId = null;
        ScenarioRunLogs response = api.getScenarioScenarioRunLogs(organizationId, workspaceId, scenarioId, scenariorunId);

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
    public void getScenarioScenarioRunsTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String scenarioId = null;
        List<ScenarioRun> response = api.getScenarioScenarioRuns(organizationId, workspaceId, scenarioId);

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
        List<ScenarioRun> response = api.getWorkspaceScenarioRuns(organizationId, workspaceId);

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
     * Search the logs of a scenariorun
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchScenarioRunLogsTest() throws ApiException {
        String organizationId = null;
        String scenariorunId = null;
        ScenarioRunLogsOptions scenarioRunLogsOptions = null;
        ScenarioRunLogs response = api.searchScenarioRunLogs(organizationId, scenariorunId, scenarioRunLogsOptions);

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
        List<ScenarioRun> response = api.searchScenarioRuns(organizationId, scenarioRunSearch);

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
     * Start a new scenariorun for a Scenario
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void startScenarioRunScenarioTest() throws ApiException {
        String organizationId = null;
        ScenarioRunStart scenarioRunStart = null;
        ScenarioRun response = api.startScenarioRunScenario(organizationId, scenarioRunStart);

        // TODO: test validations
    }
    
    /**
     * Start a new scenariorun for a Solution Run Template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void startScenarioRunSolutionTest() throws ApiException {
        String organizationId = null;
        ScenarioRunStartSolution scenarioRunStartSolution = null;
        ScenarioRun response = api.startScenarioRunSolution(organizationId, scenarioRunStartSolution);

        // TODO: test validations
    }
    
}
