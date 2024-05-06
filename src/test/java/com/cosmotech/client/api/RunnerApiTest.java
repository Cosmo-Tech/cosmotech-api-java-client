/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.1.5
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.api;

import com.cosmotech.client.ApiException;
import java.io.File;
import com.cosmotech.client.model.Runner;
import com.cosmotech.client.model.RunnerAccessControl;
import com.cosmotech.client.model.RunnerLastRun;
import com.cosmotech.client.model.RunnerRole;
import com.cosmotech.client.model.RunnerSecurity;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RunnerApi
 */
@Ignore
public class RunnerApiTest {

    private final RunnerApi api = new RunnerApi();

    
    /**
     * Add a control access to the Runner
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addRunnerAccessControlTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String runnerId = null;
        RunnerAccessControl runnerAccessControl = null;
                RunnerAccessControl response = api.addRunnerAccessControl(organizationId, workspaceId, runnerId, runnerAccessControl);
        // TODO: test validations
    }
    
    /**
     * Create a new Runner
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createRunnerTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        Runner runner = null;
                Runner response = api.createRunner(organizationId, workspaceId, runner);
        // TODO: test validations
    }
    
    /**
     * Delete a runner
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRunnerTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String runnerId = null;
                api.deleteRunner(organizationId, workspaceId, runnerId);
        // TODO: test validations
    }
    
    /**
     * Get the details of an runner
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRunnerTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String runnerId = null;
                Runner response = api.getRunner(organizationId, workspaceId, runnerId);
        // TODO: test validations
    }
    
    /**
     * Get a control access for the Runner
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRunnerAccessControlTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String runnerId = null;
        String identityId = null;
                RunnerAccessControl response = api.getRunnerAccessControl(organizationId, workspaceId, runnerId, identityId);
        // TODO: test validations
    }
    
    /**
     * Get the Runner permission by given role
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRunnerPermissionsTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String runnerId = null;
        String role = null;
                List<String> response = api.getRunnerPermissions(organizationId, workspaceId, runnerId, role);
        // TODO: test validations
    }
    
    /**
     * Get the Runner security information
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRunnerSecurityTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String runnerId = null;
                RunnerSecurity response = api.getRunnerSecurity(organizationId, workspaceId, runnerId);
        // TODO: test validations
    }
    
    /**
     * Get the Runner security users list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRunnerSecurityUsersTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String runnerId = null;
                List<String> response = api.getRunnerSecurityUsers(organizationId, workspaceId, runnerId);
        // TODO: test validations
    }
    
    /**
     * List all Runners
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listRunnersTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        Integer page = null;
        Integer size = null;
                List<Runner> response = api.listRunners(organizationId, workspaceId, page, size);
        // TODO: test validations
    }
    
    /**
     * Remove the specified access from the given Organization Runner
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeRunnerAccessControlTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String runnerId = null;
        String identityId = null;
                api.removeRunnerAccessControl(organizationId, workspaceId, runnerId, identityId);
        // TODO: test validations
    }
    
    /**
     * Set the Runner default security
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setRunnerDefaultSecurityTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String runnerId = null;
        RunnerRole runnerRole = null;
                RunnerSecurity response = api.setRunnerDefaultSecurity(organizationId, workspaceId, runnerId, runnerRole);
        // TODO: test validations
    }
    
    /**
     * Start a run with runner parameters
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void startRunTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String runnerId = null;
                RunnerLastRun response = api.startRun(organizationId, workspaceId, runnerId);
        // TODO: test validations
    }
    
    /**
     * Stop the last run
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void stopRunTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String runnerId = null;
                api.stopRun(organizationId, workspaceId, runnerId);
        // TODO: test validations
    }
    
    /**
     * Update a runner
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRunnerTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String runnerId = null;
        Runner runner = null;
                Runner response = api.updateRunner(organizationId, workspaceId, runnerId, runner);
        // TODO: test validations
    }
    
    /**
     * Update the specified access to User for a Runner
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRunnerAccessControlTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String runnerId = null;
        String identityId = null;
        RunnerRole runnerRole = null;
                RunnerAccessControl response = api.updateRunnerAccessControl(organizationId, workspaceId, runnerId, identityId, runnerRole);
        // TODO: test validations
    }
    
}
