/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.0.18-SNAPSHOT
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.api;

import com.cosmotech.client.ApiException;
import java.io.File;
import com.cosmotech.client.model.GraphProperties;
import com.cosmotech.client.model.TwinGraphBatchResult;
import com.cosmotech.client.model.TwinGraphHash;
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
     * Run a query on a graph instance and return the result as a zip file in async mode
     *
     * Run a query on a graph instance and return the result as a zip file in async mode
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void batchQueryTest() throws ApiException {
        String organizationId = null;
        String graphId = null;
        TwinGraphQuery twinGraphQuery = null;
                TwinGraphHash response = api.batchQuery(organizationId, graphId, twinGraphQuery);
        // TODO: test validations
    }
    
    /**
     * Async batch update by loading a CSV file on a graph instance 
     *
     * Async batch update by loading a CSV file on a graph instance 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void batchUploadUpdateTest() throws ApiException {
        String organizationId = null;
        String graphId = null;
        TwinGraphQuery twinGraphQuery = null;
        File body = null;
                TwinGraphBatchResult response = api.batchUploadUpdate(organizationId, graphId, twinGraphQuery, body);
        // TODO: test validations
    }
    
    /**
     * Create new entities in a graph instance
     *
     * create new entities in a graph instance
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createEntitiesTest() throws ApiException {
        String organizationId = null;
        String graphId = null;
        String type = null;
        List<GraphProperties> graphProperties = null;
                String response = api.createEntities(organizationId, graphId, type, graphProperties);
        // TODO: test validations
    }
    
    /**
     * Create a new graph
     *
     * To create a new graph from flat files,  you need to create a Zip file. This Zip file must countain two folders named Edges and Nodes.  .zip hierarchy: *main_folder/Nodes *main_folder/Edges  In each folder you can place one or multiple csv files containing your Nodes or Edges data.  Your csv files must follow the following header (column name) requirements:  The Nodes CSVs requires at least one column (the 1st).Column name &#x3D; &#39;id&#39;. It will represent the nodes ID Ids must be populated with string  The Edges CSVs require three columns named, in order, * source * target * id  those colomns represent * The source of the edge * The target of the edge * The id of the edge  All following columns content are up to you. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createGraphTest() throws ApiException {
        String organizationId = null;
        String graphId = null;
        File body = null;
                api.createGraph(organizationId, graphId, body);
        // TODO: test validations
    }
    
    /**
     * Delete all versions of a graph and his metadatas
     *
     * Delete all versions of a graph and his metadatas
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
     * Delete entities in a graph instance
     *
     * delete entities in a graph instance
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteEntitiesTest() throws ApiException {
        String organizationId = null;
        String graphId = null;
        String type = null;
        List<String> ids = null;
                api.deleteEntities(organizationId, graphId, type, ids);
        // TODO: test validations
    }
    
    /**
     * Download a graph compressed in a zip file
     *
     * Download a graph compressed in a zip file
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadGraphTest() throws ApiException {
        String organizationId = null;
        String hash = null;
                File response = api.downloadGraph(organizationId, hash);
        // TODO: test validations
    }
    
    /**
     * Return the list of all graphs stored in the organization
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
     * Get entities in a graph instance
     *
     * get entities in a graph instance
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEntitiesTest() throws ApiException {
        String organizationId = null;
        String graphId = null;
        String type = null;
        List<String> ids = null;
                String response = api.getEntities(organizationId, graphId, type, ids);
        // TODO: test validations
    }
    
    /**
     * Return the metaData of the specified graph
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
     * Get the status of a job
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
     * Run a query on a graph instance
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
    
    /**
     * Update entities in a graph instance
     *
     * update entities in a graph instance
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateEntitiesTest() throws ApiException {
        String organizationId = null;
        String graphId = null;
        String type = null;
        List<GraphProperties> graphProperties = null;
                String response = api.updateEntities(organizationId, graphId, type, graphProperties);
        // TODO: test validations
    }
    
    /**
     * Update the metaData of the specified graph
     *
     * Update the metaData of the specified graph
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateGraphMetaDataTest() throws ApiException {
        String organizationId = null;
        String graphId = null;
        Map<String, String> requestBody = null;
                Object response = api.updateGraphMetaData(organizationId, graphId, requestBody);
        // TODO: test validations
    }
    
}
