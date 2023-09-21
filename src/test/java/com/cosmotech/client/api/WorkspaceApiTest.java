/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.0.1-test
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
import com.cosmotech.client.model.WorkspaceAccessControl;
import com.cosmotech.client.model.WorkspaceFile;
import com.cosmotech.client.model.WorkspaceRole;
import com.cosmotech.client.model.WorkspaceSecret;
import com.cosmotech.client.model.WorkspaceSecurity;
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
     * Add a control access to the Workspace
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addWorkspaceAccessControlTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        WorkspaceAccessControl workspaceAccessControl = null;
                WorkspaceAccessControl response = api.addWorkspaceAccessControl(organizationId, workspaceId, workspaceAccessControl);
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
        Integer page = null;
        Integer size = null;
                List<Workspace> response = api.findAllWorkspaces(organizationId, page, size);
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
     * Get a control access for the Workspace
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWorkspaceAccessControlTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String identityId = null;
                WorkspaceAccessControl response = api.getWorkspaceAccessControl(organizationId, workspaceId, identityId);
        // TODO: test validations
    }
    
    /**
     * Get the Workspace permission by given role
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWorkspacePermissionsTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String role = null;
                List<String> response = api.getWorkspacePermissions(organizationId, workspaceId, role);
        // TODO: test validations
    }
    
    /**
     * Get the Workspace security information
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWorkspaceSecurityTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
                WorkspaceSecurity response = api.getWorkspaceSecurity(organizationId, workspaceId);
        // TODO: test validations
    }
    
    /**
     * Get the Workspace security users list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWorkspaceSecurityUsersTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
                List<String> response = api.getWorkspaceSecurityUsers(organizationId, workspaceId);
        // TODO: test validations
    }
    
    /**
     * Import a workspace
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void importWorkspaceTest() throws ApiException {
        String organizationId = null;
        Workspace workspace = null;
                Workspace response = api.importWorkspace(organizationId, workspace);
        // TODO: test validations
    }
    
    /**
     * Remove the specified access from the given Organization Workspace
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeWorkspaceAccessControlTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String identityId = null;
                api.removeWorkspaceAccessControl(organizationId, workspaceId, identityId);
        // TODO: test validations
    }
    
    /**
     * Set the Workspace default security
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setWorkspaceDefaultSecurityTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        WorkspaceRole workspaceRole = null;
                WorkspaceSecurity response = api.setWorkspaceDefaultSecurity(organizationId, workspaceId, workspaceRole);
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
     * Update the specified access to User for a Workspace
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateWorkspaceAccessControlTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String identityId = null;
        WorkspaceRole workspaceRole = null;
                WorkspaceAccessControl response = api.updateWorkspaceAccessControl(organizationId, workspaceId, identityId, workspaceRole);
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
