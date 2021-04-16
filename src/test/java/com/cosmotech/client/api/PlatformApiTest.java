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
import com.cosmotech.client.model.Platform;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PlatformApi
 */
@Ignore
public class PlatformApiTest {

    private final PlatformApi api = new PlatformApi();

    
    /**
     * Create a new platform
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPlatformTest() throws ApiException {
        Platform platform = null;
        Platform response = api.createPlatform(platform);

        // TODO: test validations
    }
    
    /**
     * Get the details of the platform
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPlatformTest() throws ApiException {
        Platform response = api.getPlatform();

        // TODO: test validations
    }
    
    /**
     * Update a platform
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePlatformTest() throws ApiException {
        Platform platform = null;
        Platform response = api.updatePlatform(platform);

        // TODO: test validations
    }
    
}
