/*
 * Cosmo Tech Plaform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 1.1.2-SNAPSHOT
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.api;

import com.cosmotech.client.ApiException;
import java.io.File;
import com.cosmotech.client.model.Scenario;
import com.cosmotech.client.model.ScenarioComparisonResult;
import com.cosmotech.client.model.ScenarioDataDownloadInfo;
import com.cosmotech.client.model.ScenarioDataDownloadJob;
import com.cosmotech.client.model.ScenarioRunTemplateParameterValue;
import com.cosmotech.client.model.ScenarioUser;
import com.cosmotech.client.model.ScenarioValidationStatus;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ScenarioApi
 */
@Ignore
public class ScenarioApiTest {

    private final ScenarioApi api = new ScenarioApi();

    
    /**
     * Add (or replace) Parameter Values for the Scenario specified
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addOrReplaceScenarioParameterValuesTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String scenarioId = null;
        List<ScenarioRunTemplateParameterValue> scenarioRunTemplateParameterValue = null;
                List<ScenarioRunTemplateParameterValue> response = api.addOrReplaceScenarioParameterValues(organizationId, workspaceId, scenarioId, scenarioRunTemplateParameterValue);
        // TODO: test validations
    }
    
    /**
     * Add (or replace) users in the Scenario specified
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addOrReplaceUsersInScenarioTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String scenarioId = null;
        List<ScenarioUser> scenarioUser = null;
                List<ScenarioUser> response = api.addOrReplaceUsersInScenario(organizationId, workspaceId, scenarioId, scenarioUser);
        // TODO: test validations
    }
    
    /**
     * Compare the Scenario with another one and returns the difference for parameters values
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void compareScenariosTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String scenarioId = null;
        String comparedScenarioId = null;
                ScenarioComparisonResult response = api.compareScenarios(organizationId, workspaceId, scenarioId, comparedScenarioId);
        // TODO: test validations
    }
    
    /**
     * Create a new Scenario
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createScenarioTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        Scenario scenario = null;
                Scenario response = api.createScenario(organizationId, workspaceId, scenario);
        // TODO: test validations
    }
    
    /**
     * Delete all Scenarios of the Workspace
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAllScenariosTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
                api.deleteAllScenarios(organizationId, workspaceId);
        // TODO: test validations
    }
    
    /**
     * Delete a scenario
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteScenarioTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String scenarioId = null;
        Boolean waitRelationshipPropagation = null;
                api.deleteScenario(organizationId, workspaceId, scenarioId, waitRelationshipPropagation);
        // TODO: test validations
    }
    
    /**
     * Download Scenario data
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadScenarioDataTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String scenarioId = null;
                ScenarioDataDownloadJob response = api.downloadScenarioData(organizationId, workspaceId, scenarioId);
        // TODO: test validations
    }
    
    /**
     * List all Scenarios
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findAllScenariosTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
                List<Scenario> response = api.findAllScenarios(organizationId, workspaceId);
        // TODO: test validations
    }
    
    /**
     * List all Scenarios by validation status
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findAllScenariosByValidationStatusTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        ScenarioValidationStatus validationStatus = null;
                List<Scenario> response = api.findAllScenariosByValidationStatus(organizationId, workspaceId, validationStatus);
        // TODO: test validations
    }
    
    /**
     * Get the details of an scenario
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findScenarioByIdTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String scenarioId = null;
                Scenario response = api.findScenarioById(organizationId, workspaceId, scenarioId);
        // TODO: test validations
    }
    
    /**
     * Get Scenario data download URL
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getScenarioDataDownloadJobInfoTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String scenarioId = null;
        String downloadId = null;
                ScenarioDataDownloadInfo response = api.getScenarioDataDownloadJobInfo(organizationId, workspaceId, scenarioId, downloadId);
        // TODO: test validations
    }
    
    /**
     * Get the validation status of an scenario
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getScenarioValidationStatusByIdTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String scenarioId = null;
                ScenarioValidationStatus response = api.getScenarioValidationStatusById(organizationId, workspaceId, scenarioId);
        // TODO: test validations
    }
    
    /**
     * Get the Scenarios Tree
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getScenariosTreeTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
                List<Scenario> response = api.getScenariosTree(organizationId, workspaceId);
        // TODO: test validations
    }
    
    /**
     * Remove all Parameter Values from the Scenario specified
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeAllScenarioParameterValuesTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String scenarioId = null;
                api.removeAllScenarioParameterValues(organizationId, workspaceId, scenarioId);
        // TODO: test validations
    }
    
    /**
     * Remove all users from the Scenario specified
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeAllUsersOfScenarioTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String scenarioId = null;
                api.removeAllUsersOfScenario(organizationId, workspaceId, scenarioId);
        // TODO: test validations
    }
    
    /**
     * Remove the specified user from the given Scenario
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeUserFromScenarioTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String scenarioId = null;
        String userId = null;
                api.removeUserFromScenario(organizationId, workspaceId, scenarioId, userId);
        // TODO: test validations
    }
    
    /**
     * Update a scenario
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateScenarioTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String scenarioId = null;
        Scenario scenario = null;
                Scenario response = api.updateScenario(organizationId, workspaceId, scenarioId, scenario);
        // TODO: test validations
    }
    
}
