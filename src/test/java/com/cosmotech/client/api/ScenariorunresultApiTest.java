/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.0.3-test
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.api;

import com.cosmotech.client.ApiException;
import com.cosmotech.client.model.ScenarioRunResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ScenariorunresultApi
 */
@Ignore
public class ScenariorunresultApiTest {

    private final ScenariorunresultApi api = new ScenariorunresultApi();

    
    /**
     * Get a ScenarioRunResult in the Organization
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getScenarioRunResultTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String scenarioId = null;
        String scenariorunId = null;
        String probeId = null;
                ScenarioRunResult response = api.getScenarioRunResult(organizationId, workspaceId, scenarioId, scenariorunId, probeId);
        // TODO: test validations
    }
    
    /**
     * Create a new ScenarioRunResult in the Organization
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendScenarioRunResultTest() throws ApiException {
        String organizationId = null;
        String workspaceId = null;
        String scenarioId = null;
        String scenariorunId = null;
        String probeId = null;
        Map<String, String> requestBody = null;
                ScenarioRunResult response = api.sendScenarioRunResult(organizationId, workspaceId, scenarioId, scenariorunId, probeId, requestBody);
        // TODO: test validations
    }
    
}
