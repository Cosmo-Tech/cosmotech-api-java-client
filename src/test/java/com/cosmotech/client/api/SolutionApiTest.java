/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.0.3-dev
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.api;

import com.cosmotech.client.ApiException;
import java.io.File;
import com.cosmotech.client.model.RunTemplate;
import com.cosmotech.client.model.RunTemplateHandlerId;
import com.cosmotech.client.model.RunTemplateParameter;
import com.cosmotech.client.model.RunTemplateParameterGroup;
import com.cosmotech.client.model.Solution;
import com.cosmotech.client.model.SolutionAccessControl;
import com.cosmotech.client.model.SolutionRole;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SolutionApi
 */
@Ignore
public class SolutionApiTest {

    private final SolutionApi api = new SolutionApi();

    
    /**
     * Add Parameter Groups. Any item with the same ID will be overwritten
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addOrReplaceParameterGroupsTest() throws ApiException {
        String organizationId = null;
        String solutionId = null;
        List<RunTemplateParameterGroup> runTemplateParameterGroup = null;
                List<RunTemplateParameterGroup> response = api.addOrReplaceParameterGroups(organizationId, solutionId, runTemplateParameterGroup);
        // TODO: test validations
    }
    
    /**
     * Add Parameters. Any item with the same ID will be overwritten
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addOrReplaceParametersTest() throws ApiException {
        String organizationId = null;
        String solutionId = null;
        List<RunTemplateParameter> runTemplateParameter = null;
                List<RunTemplateParameter> response = api.addOrReplaceParameters(organizationId, solutionId, runTemplateParameter);
        // TODO: test validations
    }
    
    /**
     * Add Run Templates. Any item with the same ID will be overwritten
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addOrReplaceRunTemplatesTest() throws ApiException {
        String organizationId = null;
        String solutionId = null;
        List<RunTemplate> runTemplate = null;
                List<RunTemplate> response = api.addOrReplaceRunTemplates(organizationId, solutionId, runTemplate);
        // TODO: test validations
    }
    
    /**
     * Add a control access to the Solution
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addSolutionAccessControlTest() throws ApiException {
        String organizationId = null;
        String solutionId = null;
        SolutionAccessControl solutionAccessControl = null;
                SolutionAccessControl response = api.addSolutionAccessControl(organizationId, solutionId, solutionAccessControl);
        // TODO: test validations
    }
    
    /**
     * Register a new solution
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSolutionTest() throws ApiException {
        String organizationId = null;
        Solution solution = null;
                Solution response = api.createSolution(organizationId, solution);
        // TODO: test validations
    }
    
    /**
     * Delete a solution
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSolutionTest() throws ApiException {
        String organizationId = null;
        String solutionId = null;
                api.deleteSolution(organizationId, solutionId);
        // TODO: test validations
    }
    
    /**
     * Remove the specified Solution Run Template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSolutionRunTemplateTest() throws ApiException {
        String organizationId = null;
        String solutionId = null;
        String runTemplateId = null;
                api.deleteSolutionRunTemplate(organizationId, solutionId, runTemplateId);
        // TODO: test validations
    }
    
    /**
     * Download a Run Template step handler zip file
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadRunTemplateHandlerTest() throws ApiException {
        String organizationId = null;
        String solutionId = null;
        String runTemplateId = null;
        RunTemplateHandlerId handlerId = null;
                File response = api.downloadRunTemplateHandler(organizationId, solutionId, runTemplateId, handlerId);
        // TODO: test validations
    }
    
    /**
     * List all Solutions
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findAllSolutionsTest() throws ApiException {
        String organizationId = null;
        Integer page = null;
        Integer size = null;
                List<Solution> response = api.findAllSolutions(organizationId, page, size);
        // TODO: test validations
    }
    
    /**
     * Get the details of a solution
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findSolutionByIdTest() throws ApiException {
        String organizationId = null;
        String solutionId = null;
                Solution response = api.findSolutionById(organizationId, solutionId);
        // TODO: test validations
    }
    
    /**
     * Get a control access for the Solution
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSolutionAccessControlTest() throws ApiException {
        String organizationId = null;
        String solutionId = null;
        String identityId = null;
                SolutionAccessControl response = api.getSolutionAccessControl(organizationId, solutionId, identityId);
        // TODO: test validations
    }
    
    /**
     * Get the Solution security users list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSolutionSecurityUsersTest() throws ApiException {
        String organizationId = null;
        String solutionId = null;
                List<String> response = api.getSolutionSecurityUsers(organizationId, solutionId);
        // TODO: test validations
    }
    
    /**
     * Remove all Run Templates from the Solution specified
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeAllRunTemplatesTest() throws ApiException {
        String organizationId = null;
        String solutionId = null;
                api.removeAllRunTemplates(organizationId, solutionId);
        // TODO: test validations
    }
    
    /**
     * Remove all Parameter Groups from the Solution specified
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeAllSolutionParameterGroupsTest() throws ApiException {
        String organizationId = null;
        String solutionId = null;
                api.removeAllSolutionParameterGroups(organizationId, solutionId);
        // TODO: test validations
    }
    
    /**
     * Remove all Parameters from the Solution specified
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeAllSolutionParametersTest() throws ApiException {
        String organizationId = null;
        String solutionId = null;
                api.removeAllSolutionParameters(organizationId, solutionId);
        // TODO: test validations
    }
    
    /**
     * Remove the specified access from the given Organization Solution
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeSolutionAccessControlTest() throws ApiException {
        String organizationId = null;
        String solutionId = null;
        String identityId = null;
                api.removeSolutionAccessControl(organizationId, solutionId, identityId);
        // TODO: test validations
    }
    
    /**
     * Update a solution
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSolutionTest() throws ApiException {
        String organizationId = null;
        String solutionId = null;
        Solution solution = null;
                Solution response = api.updateSolution(organizationId, solutionId, solution);
        // TODO: test validations
    }
    
    /**
     * Update the specified access to User for a Solution
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSolutionAccessControlTest() throws ApiException {
        String organizationId = null;
        String solutionId = null;
        String identityId = null;
        SolutionRole solutionRole = null;
                SolutionAccessControl response = api.updateSolutionAccessControl(organizationId, solutionId, identityId, solutionRole);
        // TODO: test validations
    }
    
    /**
     * Update the specified Solution Run Template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSolutionRunTemplateTest() throws ApiException {
        String organizationId = null;
        String solutionId = null;
        String runTemplateId = null;
        RunTemplate runTemplate = null;
                List<RunTemplate> response = api.updateSolutionRunTemplate(organizationId, solutionId, runTemplateId, runTemplate);
        // TODO: test validations
    }
    
    /**
     * Upload a Run Template step handler zip file
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadRunTemplateHandlerTest() throws ApiException {
        String organizationId = null;
        String solutionId = null;
        String runTemplateId = null;
        RunTemplateHandlerId handlerId = null;
        File body = null;
        Boolean overwrite = null;
                api.uploadRunTemplateHandler(organizationId, solutionId, runTemplateId, handlerId, body, overwrite);
        // TODO: test validations
    }
    
}
