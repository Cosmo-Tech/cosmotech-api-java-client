/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.0.19-SNAPSHOT
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.api;

import com.cosmotech.client.ApiException;
import com.cosmotech.client.model.ComponentRolePermissions;
import java.io.File;
import com.cosmotech.client.model.Organization;
import com.cosmotech.client.model.OrganizationAccessControl;
import com.cosmotech.client.model.OrganizationRole;
import com.cosmotech.client.model.OrganizationSecurity;
import com.cosmotech.client.model.OrganizationService;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrganizationApi
 */
@Ignore
public class OrganizationApiTest {

    private final OrganizationApi api = new OrganizationApi();

    
    /**
     * Add a control access to the Organization
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addOrganizationAccessControlTest() throws ApiException {
        String organizationId = null;
        OrganizationAccessControl organizationAccessControl = null;
                OrganizationAccessControl response = api.addOrganizationAccessControl(organizationId, organizationAccessControl);
        // TODO: test validations
    }
    
    /**
     * List all Organizations
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findAllOrganizationsTest() throws ApiException {
        Integer page = null;
        Integer size = null;
                List<Organization> response = api.findAllOrganizations(page, size);
        // TODO: test validations
    }
    
    /**
     * Get the details of an Organization
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findOrganizationByIdTest() throws ApiException {
        String organizationId = null;
                Organization response = api.findOrganizationById(organizationId);
        // TODO: test validations
    }
    
    /**
     * Get all permissions per components
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllPermissionsTest() throws ApiException {
                List<ComponentRolePermissions> response = api.getAllPermissions();
        // TODO: test validations
    }
    
    /**
     * Get a control access for the Organization
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrganizationAccessControlTest() throws ApiException {
        String organizationId = null;
        String identityId = null;
                OrganizationAccessControl response = api.getOrganizationAccessControl(organizationId, identityId);
        // TODO: test validations
    }
    
    /**
     * Get the Organization permissions by given role
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrganizationPermissionsTest() throws ApiException {
        String organizationId = null;
        String role = null;
                List<String> response = api.getOrganizationPermissions(organizationId, role);
        // TODO: test validations
    }
    
    /**
     * Get the Organization security information
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrganizationSecurityTest() throws ApiException {
        String organizationId = null;
                OrganizationSecurity response = api.getOrganizationSecurity(organizationId);
        // TODO: test validations
    }
    
    /**
     * Get the Organization security users list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrganizationSecurityUsersTest() throws ApiException {
        String organizationId = null;
                List<String> response = api.getOrganizationSecurityUsers(organizationId);
        // TODO: test validations
    }
    
    /**
     * Register a new organization
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void registerOrganizationTest() throws ApiException {
        Organization organization = null;
                Organization response = api.registerOrganization(organization);
        // TODO: test validations
    }
    
    /**
     * Remove the specified access from the given Organization
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeOrganizationAccessControlTest() throws ApiException {
        String organizationId = null;
        String identityId = null;
                api.removeOrganizationAccessControl(organizationId, identityId);
        // TODO: test validations
    }
    
    /**
     * Set the Organization default security
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setOrganizationDefaultSecurityTest() throws ApiException {
        String organizationId = null;
        OrganizationRole organizationRole = null;
                OrganizationSecurity response = api.setOrganizationDefaultSecurity(organizationId, organizationRole);
        // TODO: test validations
    }
    
    /**
     * Unregister an organization
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void unregisterOrganizationTest() throws ApiException {
        String organizationId = null;
                api.unregisterOrganization(organizationId);
        // TODO: test validations
    }
    
    /**
     * Update an Organization
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateOrganizationTest() throws ApiException {
        String organizationId = null;
        Organization organization = null;
                Organization response = api.updateOrganization(organizationId, organization);
        // TODO: test validations
    }
    
    /**
     * Update the specified access to User for an Organization
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateOrganizationAccessControlTest() throws ApiException {
        String organizationId = null;
        String identityId = null;
        OrganizationRole organizationRole = null;
                OrganizationAccessControl response = api.updateOrganizationAccessControl(organizationId, identityId, organizationRole);
        // TODO: test validations
    }
    
    /**
     * Update the solutions container registry configuration for the Organization specified
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSolutionsContainerRegistryByOrganizationIdTest() throws ApiException {
        String organizationId = null;
        OrganizationService organizationService = null;
                OrganizationService response = api.updateSolutionsContainerRegistryByOrganizationId(organizationId, organizationService);
        // TODO: test validations
    }
    
    /**
     * Update storage configuration for the Organization specified
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateStorageByOrganizationIdTest() throws ApiException {
        String organizationId = null;
        OrganizationService organizationService = null;
                OrganizationService response = api.updateStorageByOrganizationId(organizationId, organizationService);
        // TODO: test validations
    }
    
    /**
     * Update tenant credentials for the Organization specified
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTenantCredentialsByOrganizationIdTest() throws ApiException {
        String organizationId = null;
        Map<String, Object> requestBody = null;
                Map<String, Object> response = api.updateTenantCredentialsByOrganizationId(organizationId, requestBody);
        // TODO: test validations
    }
    
}
