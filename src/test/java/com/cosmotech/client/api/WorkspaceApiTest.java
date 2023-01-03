/*
 * Cosmo Tech Plaform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.api;

import com.cosmotech.client.ApiException;
import java.io.File;
import com.cosmotech.client.model.Workspace;
import com.cosmotech.client.model.WorkspaceFile;
import com.cosmotech.client.model.WorkspaceSecret;
import com.cosmotech.client.model.WorkspaceUser;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WorkspaceApi
 */
@Ignore
public class WorkspaceApiTest {

    private final WorkspaceApi api = new WorkspaceApi();

    
    /**
     * Add (or replace) users to the Workspace specified
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addOrReplaceUsersInOrganizationWorkspaceTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        List<WorkspaceUser> workspaceUser = null;
                List<WorkspaceUser> response = api.addOrReplaceUsersInOrganizationWorkspace(organizationId, workspaceId, workspaceUser);
        // TODO: test validations
    }
    
    /**
     * Create a secret for the Workspace
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSecretTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        WorkspaceSecret workspaceSecret = null;
                api.createSecret(organizationId, workspaceId, workspaceSecret);
        // TODO: test validations
    }
    
    /**
     * Create a new workspace
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createWorkspaceTest() throws ApiException {
        String organizationId = null;
        Workspace workspace = null;
                Workspace response = api.createWorkspace(organizationId, workspace);
        // TODO: test validations
    }
    
    /**
     * Delete all Workspace files
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAllWorkspaceFilesTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
                api.deleteAllWorkspaceFiles(organizationId, workspaceId);
        // TODO: test validations
    }
    
    /**
     * Delete a workspace
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteWorkspaceTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
                Workspace response = api.deleteWorkspace(organizationId, workspaceId);
        // TODO: test validations
    }
    
    /**
     * Delete a workspace file
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteWorkspaceFileTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String fileName = null;
                api.deleteWorkspaceFile(organizationId, workspaceId, fileName);
        // TODO: test validations
    }
    
    /**
     * Download the Workspace File specified
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadWorkspaceFileTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String fileName = null;
                File response = api.downloadWorkspaceFile(organizationId, workspaceId, fileName);
        // TODO: test validations
    }
    
    /**
     * List all Workspace files
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findAllWorkspaceFilesTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
                List<WorkspaceFile> response = api.findAllWorkspaceFiles(organizationId, workspaceId);
        // TODO: test validations
    }
    
    /**
     * List all Workspaces
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findAllWorkspacesTest() throws ApiException {
        String organizationId = null;
                List<Workspace> response = api.findAllWorkspaces(organizationId);
        // TODO: test validations
    }
    
    /**
     * Get the details of an workspace
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findWorkspaceByIdTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
                Workspace response = api.findWorkspaceById(organizationId, workspaceId);
        // TODO: test validations
    }
    
    /**
     * Remove all users from the Workspace specified
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeAllUsersOfWorkspaceTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
                api.removeAllUsersOfWorkspace(organizationId, workspaceId);
        // TODO: test validations
    }
    
    /**
     * Remove the specified user from the given Organization Workspace
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeUserFromOrganizationWorkspaceTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String userId = null;
                api.removeUserFromOrganizationWorkspace(organizationId, workspaceId, userId);
        // TODO: test validations
    }
    
    /**
     * Update a workspace
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateWorkspaceTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        Workspace workspace = null;
                Workspace response = api.updateWorkspace(organizationId, workspaceId, workspace);
        // TODO: test validations
    }
    
    /**
     * Upload a file for the Workspace
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadWorkspaceFileTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        File _file = null;
        Boolean overwrite = null;
        String destination = null;
                WorkspaceFile response = api.uploadWorkspaceFile(organizationId, workspaceId, _file, overwrite, destination);
        // TODO: test validations
    }
    
}
