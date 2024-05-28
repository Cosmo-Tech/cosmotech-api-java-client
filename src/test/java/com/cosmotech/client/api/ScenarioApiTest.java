/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.2.3
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
import com.cosmotech.client.model.ScenarioAccessControl;
import com.cosmotech.client.model.ScenarioComparisonResult;
import com.cosmotech.client.model.ScenarioDataDownloadInfo;
import com.cosmotech.client.model.ScenarioDataDownloadJob;
import com.cosmotech.client.model.ScenarioRole;
import com.cosmotech.client.model.ScenarioRunTemplateParameterValue;
import com.cosmotech.client.model.ScenarioSecurity;
import com.cosmotech.client.model.ScenarioValidationStatus;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ScenarioApi
 */
@Disabled
public class ScenarioApiTest {

    private final ScenarioApi api = new ScenarioApi();

    /**
     * Add (or replace) Parameter Values for the Scenario specified
     *
     * @throws ApiException if the Api call fails
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
     * Add a control access to the Scenario
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addScenarioAccessControlTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String scenarioId = null;
        ScenarioAccessControl scenarioAccessControl = null;
        ScenarioAccessControl response = api.addScenarioAccessControl(organizationId, workspaceId, scenarioId, scenarioAccessControl);
        // TODO: test validations
    }

    /**
     * Compare the Scenario with another one and returns the difference for parameters values
     *
     * @throws ApiException if the Api call fails
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
     * @throws ApiException if the Api call fails
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
     * @throws ApiException if the Api call fails
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
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteScenarioTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String scenarioId = null;
        api.deleteScenario(organizationId, workspaceId, scenarioId);
        // TODO: test validations
    }

    /**
     * Download Scenario data
     *
     * @throws ApiException if the Api call fails
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
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findAllScenariosTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        Integer page = null;
        Integer size = null;
        List<Scenario> response = api.findAllScenarios(organizationId, workspaceId, page, size);
        // TODO: test validations
    }

    /**
     * List all Scenarios by validation status
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findAllScenariosByValidationStatusTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        ScenarioValidationStatus validationStatus = null;
        Integer page = null;
        Integer size = null;
        List<Scenario> response = api.findAllScenariosByValidationStatus(organizationId, workspaceId, validationStatus, page, size);
        // TODO: test validations
    }

    /**
     * Get the details of an scenario
     *
     * @throws ApiException if the Api call fails
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
     * Get a control access for the Scenario
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getScenarioAccessControlTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String scenarioId = null;
        String identityId = null;
        ScenarioAccessControl response = api.getScenarioAccessControl(organizationId, workspaceId, scenarioId, identityId);
        // TODO: test validations
    }

    /**
     * Get Scenario data download URL
     *
     * @throws ApiException if the Api call fails
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
     * Get the Scenario permission by given role
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getScenarioPermissionsTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String scenarioId = null;
        String role = null;
        List<String> response = api.getScenarioPermissions(organizationId, workspaceId, scenarioId, role);
        // TODO: test validations
    }

    /**
     * Get the Scenario security information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getScenarioSecurityTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String scenarioId = null;
        ScenarioSecurity response = api.getScenarioSecurity(organizationId, workspaceId, scenarioId);
        // TODO: test validations
    }

    /**
     * Get the Scenario security users list
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getScenarioSecurityUsersTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String scenarioId = null;
        List<String> response = api.getScenarioSecurityUsers(organizationId, workspaceId, scenarioId);
        // TODO: test validations
    }

    /**
     * Get the validation status of an scenario
     *
     * @throws ApiException if the Api call fails
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
     * @throws ApiException if the Api call fails
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
     * @throws ApiException if the Api call fails
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
     * Remove the specified access from the given Organization Scenario
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeScenarioAccessControlTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String scenarioId = null;
        String identityId = null;
        api.removeScenarioAccessControl(organizationId, workspaceId, scenarioId, identityId);
        // TODO: test validations
    }

    /**
     * Set the Scenario default security
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setScenarioDefaultSecurityTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String scenarioId = null;
        ScenarioRole scenarioRole = null;
        ScenarioSecurity response = api.setScenarioDefaultSecurity(organizationId, workspaceId, scenarioId, scenarioRole);
        // TODO: test validations
    }

    /**
     * Update a scenario
     *
     * @throws ApiException if the Api call fails
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

    /**
     * Update the specified access to User for a Scenario
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateScenarioAccessControlTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String scenarioId = null;
        String identityId = null;
        ScenarioRole scenarioRole = null;
        ScenarioAccessControl response = api.updateScenarioAccessControl(organizationId, workspaceId, scenarioId, identityId, scenarioRole);
        // TODO: test validations
    }

}
