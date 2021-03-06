/*
 * Cosmo Tech Plaform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 1.0.5-SNAPSHOT
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.api;

import com.cosmotech.client.ApiException;
import java.io.File;
import com.cosmotech.client.model.Organization;
import com.cosmotech.client.model.OrganizationService;
import com.cosmotech.client.model.OrganizationUser;
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
     * Add (or replace) users in the Organization specified
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addOrReplaceUsersInOrganizationTest() throws ApiException {
        String organizationId = null;
        List<OrganizationUser> organizationUser = null;
                List<OrganizationUser> response = api.addOrReplaceUsersInOrganization(organizationId, organizationUser);
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
                List<Organization> response = api.findAllOrganizations();
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
     * Remove all users from the Organization specified
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeAllUsersInOrganizationTest() throws ApiException {
        String organizationId = null;
                api.removeAllUsersInOrganization(organizationId);
        // TODO: test validations
    }
    
    /**
     * Remove the specified user from the given Organization
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeUserFromOrganizationTest() throws ApiException {
        String organizationId = null;
        String userId = null;
                api.removeUserFromOrganization(organizationId, userId);
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
