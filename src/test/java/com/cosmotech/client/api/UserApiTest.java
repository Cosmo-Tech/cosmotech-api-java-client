/*
 * Cosmo Tech Plaform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 2.1.10-dev
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.api;

import com.cosmotech.client.ApiException;
import java.io.File;
import com.cosmotech.client.model.User;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserApi
 */
@Ignore
public class UserApiTest {

    private final UserApi api = new UserApi();

    
    /**
     * Authorize an User with OAuth2. Delegated to configured OAuth2 service
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void authorizeUserTest() throws ApiException {
                api.authorizeUser();
        // TODO: test validations
    }
    
    /**
     * List all Users
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findAllUsersTest() throws ApiException {
                List<User> response = api.findAllUsers();
        // TODO: test validations
    }
    
    /**
     * Get the details of an user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findUserByIdTest() throws ApiException {
        String userId = null;
                User response = api.findUserById(userId);
        // TODO: test validations
    }
    
    /**
     * Get the details of the logged-in User
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCurrentUserTest() throws ApiException {
                User response = api.getCurrentUser();
        // TODO: test validations
    }
    
    /**
     * Get the details of a logged-in User with roles for an Organization
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrganizationCurrentUserTest() throws ApiException {
        String organizationId = null;
                User response = api.getOrganizationCurrentUser(organizationId);
        // TODO: test validations
    }
    
    /**
     * Get the details of the logged-in user with roles for a Workspace
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWorkspaceCurrentUserTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
                User response = api.getWorkspaceCurrentUser(organizationId, workspaceId);
        // TODO: test validations
    }
    
    /**
     * Register a new user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void registerUserTest() throws ApiException {
        User user = null;
                User response = api.registerUser(user);
        // TODO: test validations
    }
    
    /**
     * test platform API call
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testPlatformTest() throws ApiException {
                String response = api.testPlatform();
        // TODO: test validations
    }
    
    /**
     * Unregister an user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void unregisterUserTest() throws ApiException {
        String userId = null;
                api.unregisterUser(userId);
        // TODO: test validations
    }
    
    /**
     * Update a User
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserTest() throws ApiException {
        String userId = null;
        User user = null;
                User response = api.updateUser(userId, user);
        // TODO: test validations
    }
    
}
