/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 2.3.16
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.api;

import com.cosmotech.client.ApiException;
import com.cosmotech.client.model.TwinGraphImport;
import com.cosmotech.client.model.TwinGraphImportInfo;
import com.cosmotech.client.model.TwinGraphQuery;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TwingraphApi
 */
@Ignore
public class TwingraphApiTest {

    private final TwingraphApi api = new TwingraphApi();

    
    /**
     * 
     *
     * Launch a mass delete job
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTest() throws ApiException {
        String organizationId = null;
        String graphId = null;
                api.delete(organizationId, graphId);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Return the list of all graphs stored in the organization
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findAllTwingraphsTest() throws ApiException {
        String organizationId = null;
                List<String> response = api.findAllTwingraphs(organizationId);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Return the metaData of the specified graph
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGraphMetaDataTest() throws ApiException {
        String organizationId = null;
        String graphId = null;
                Object response = api.getGraphMetaData(organizationId, graphId);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Import a new version of a twin graph
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void importGraphTest() throws ApiException {
        String organizationId = null;
        TwinGraphImport twinGraphImport = null;
                TwinGraphImportInfo response = api.importGraph(organizationId, twinGraphImport);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get the status of a job
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void jobStatusTest() throws ApiException {
        String organizationId = null;
        String jobId = null;
                String response = api.jobStatus(organizationId, jobId);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Run a query on a graph instance
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void queryTest() throws ApiException {
        String organizationId = null;
        String graphId = null;
        TwinGraphQuery twinGraphQuery = null;
                String response = api.query(organizationId, graphId, twinGraphQuery);
        // TODO: test validations
    }
    
}
