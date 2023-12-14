/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.0.15-SNAPSHOT
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.api;

import com.cosmotech.client.ApiException;
import com.cosmotech.client.model.Dataset;
import com.cosmotech.client.model.DatasetAccessControl;
import com.cosmotech.client.model.DatasetCompatibility;
import com.cosmotech.client.model.DatasetCopyParameters;
import com.cosmotech.client.model.DatasetRole;
import com.cosmotech.client.model.DatasetSearch;
import com.cosmotech.client.model.DatasetSecurity;
import com.cosmotech.client.model.DatasetTwinGraphHash;
import com.cosmotech.client.model.DatasetTwinGraphInfo;
import com.cosmotech.client.model.DatasetTwinGraphQuery;
import java.io.File;
import com.cosmotech.client.model.FileUploadValidation;
import com.cosmotech.client.model.GraphProperties;
import com.cosmotech.client.model.SubDatasetGraphQuery;
import com.cosmotech.client.model.TwinGraphBatchResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DatasetApi
 */
@Ignore
public class DatasetApiTest {

    private final DatasetApi api = new DatasetApi();

    
    /**
     * Add a control access to the Dataset
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addDatasetAccessControlTest() throws ApiException {
        String organizationId = null;
        String datasetId = null;
        DatasetAccessControl datasetAccessControl = null;
                DatasetAccessControl response = api.addDatasetAccessControl(organizationId, datasetId, datasetAccessControl);
        // TODO: test validations
    }
    
    /**
     * Add Dataset Compatibility elements.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addOrReplaceDatasetCompatibilityElementsTest() throws ApiException {
        String organizationId = null;
        String datasetId = null;
        List<DatasetCompatibility> datasetCompatibility = null;
                List<DatasetCompatibility> response = api.addOrReplaceDatasetCompatibilityElements(organizationId, datasetId, datasetCompatibility);
        // TODO: test validations
    }
    
    /**
     * Copy a Dataset to another Dataset.
     *
     * Not implemented!
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void copyDatasetTest() throws ApiException {
        String organizationId = null;
        DatasetCopyParameters datasetCopyParameters = null;
                DatasetCopyParameters response = api.copyDataset(organizationId, datasetCopyParameters);
        // TODO: test validations
    }
    
    /**
     * Create a new Dataset
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDatasetTest() throws ApiException {
        String organizationId = null;
        Dataset dataset = null;
                Dataset response = api.createDataset(organizationId, dataset);
        // TODO: test validations
    }
    
    /**
     * Create a sub-dataset from the dataset in parameter
     *
     * Create a copy of the dataset using the results of the list of queries given in parameter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSubDatasetTest() throws ApiException {
        String organizationId = null;
        String datasetId = null;
        SubDatasetGraphQuery subDatasetGraphQuery = null;
                Dataset response = api.createSubDataset(organizationId, datasetId, subDatasetGraphQuery);
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
    public void createTwingraphEntitiesTest() throws ApiException {
        String organizationId = null;
        String datasetId = null;
        String type = null;
        List<GraphProperties> graphProperties = null;
                String response = api.createTwingraphEntities(organizationId, datasetId, type, graphProperties);
        // TODO: test validations
    }
    
    /**
     * Delete a dataset
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDatasetTest() throws ApiException {
        String organizationId = null;
        String datasetId = null;
                api.deleteDataset(organizationId, datasetId);
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
    public void deleteTwingraphEntitiesTest() throws ApiException {
        String organizationId = null;
        String datasetId = null;
        String type = null;
        List<String> ids = null;
                api.deleteTwingraphEntities(organizationId, datasetId, type, ids);
        // TODO: test validations
    }
    
    /**
     * Download a graph as a zip file
     *
     * Download the compressed graph reference by the hash in a zip file
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadTwingraphTest() throws ApiException {
        String organizationId = null;
        String hash = null;
                File response = api.downloadTwingraph(organizationId, hash);
        // TODO: test validations
    }
    
    /**
     * List all Datasets
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findAllDatasetsTest() throws ApiException {
        String organizationId = null;
        Integer page = null;
        Integer size = null;
                List<Dataset> response = api.findAllDatasets(organizationId, page, size);
        // TODO: test validations
    }
    
    /**
     * Get the details of a Dataset
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findDatasetByIdTest() throws ApiException {
        String organizationId = null;
        String datasetId = null;
                Dataset response = api.findDatasetById(organizationId, datasetId);
        // TODO: test validations
    }
    
    /**
     * Get a control access for the Dataset
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDatasetAccessControlTest() throws ApiException {
        String organizationId = null;
        String datasetId = null;
        String identityId = null;
                DatasetAccessControl response = api.getDatasetAccessControl(organizationId, datasetId, identityId);
        // TODO: test validations
    }
    
    /**
     * Get the Dataset security information
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDatasetSecurityTest() throws ApiException {
        String organizationId = null;
        String datasetId = null;
                DatasetSecurity response = api.getDatasetSecurity(organizationId, datasetId);
        // TODO: test validations
    }
    
    /**
     * Get the Dataset security users list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDatasetSecurityUsersTest() throws ApiException {
        String organizationId = null;
        String datasetId = null;
                List<String> response = api.getDatasetSecurityUsers(organizationId, datasetId);
        // TODO: test validations
    }
    
    /**
     * Get the dataset&#39;s refresh job status
     *
     * Get the status of the import workflow lauch on the dataset&#39;s refresh.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDatasetTwingraphStatusTest() throws ApiException {
        String organizationId = null;
        String datasetId = null;
                String response = api.getDatasetTwingraphStatus(organizationId, datasetId);
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
    public void getTwingraphEntitiesTest() throws ApiException {
        String organizationId = null;
        String datasetId = null;
        String type = null;
        List<String> ids = null;
                String response = api.getTwingraphEntities(organizationId, datasetId, type, ids);
        // TODO: test validations
    }
    
    /**
     * Refresh data on dataset from dataset&#39;s source
     *
     * Refresh dataset from parent source. At date, sources can be:      dataset (refresh from another dataset)      Azure Digital twin       Azure storage      Local File (import a new file)  During refresh, datas are overwritten 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void refreshDatasetTest() throws ApiException {
        String organizationId = null;
        String datasetId = null;
                DatasetTwinGraphInfo response = api.refreshDataset(organizationId, datasetId);
        // TODO: test validations
    }
    
    /**
     * Remove all Dataset Compatibility elements from the Dataset specified
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeAllDatasetCompatibilityElementsTest() throws ApiException {
        String organizationId = null;
        String datasetId = null;
                api.removeAllDatasetCompatibilityElements(organizationId, datasetId);
        // TODO: test validations
    }
    
    /**
     * Remove the specified access from the given Dataset
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeDatasetAccessControlTest() throws ApiException {
        String organizationId = null;
        String datasetId = null;
        String identityId = null;
                api.removeDatasetAccessControl(organizationId, datasetId, identityId);
        // TODO: test validations
    }
    
    /**
     * Rollback the dataset after a failed refresh
     *
     * Rollback the twingraph on a dataset after a failed refresh
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rollbackRefreshTest() throws ApiException {
        String organizationId = null;
        String datasetId = null;
                String response = api.rollbackRefresh(organizationId, datasetId);
        // TODO: test validations
    }
    
    /**
     * Search Datasets by tags
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchDatasetsTest() throws ApiException {
        String organizationId = null;
        DatasetSearch datasetSearch = null;
        Integer page = null;
        Integer size = null;
                List<Dataset> response = api.searchDatasets(organizationId, datasetSearch, page, size);
        // TODO: test validations
    }
    
    /**
     * Set the Dataset default security
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setDatasetDefaultSecurityTest() throws ApiException {
        String organizationId = null;
        String datasetId = null;
        DatasetRole datasetRole = null;
                DatasetSecurity response = api.setDatasetDefaultSecurity(organizationId, datasetId, datasetRole);
        // TODO: test validations
    }
    
    /**
     * Run a query on a graph instance and return the result as a zip file in async mode
     *
     * Run a query on a graph instance and return the result as a zip file in async mode
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void twingraphBatchQueryTest() throws ApiException {
        String organizationId = null;
        String datasetId = null;
        DatasetTwinGraphQuery datasetTwinGraphQuery = null;
                DatasetTwinGraphHash response = api.twingraphBatchQuery(organizationId, datasetId, datasetTwinGraphQuery);
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
    public void twingraphBatchUpdateTest() throws ApiException {
        String organizationId = null;
        String datasetId = null;
        DatasetTwinGraphQuery twinGraphQuery = null;
        File body = null;
                TwinGraphBatchResult response = api.twingraphBatchUpdate(organizationId, datasetId, twinGraphQuery, body);
        // TODO: test validations
    }
    
    /**
     * Return the result of a query made on the graph instance as a json
     *
     * Run a query on a graph instance and return the result as a json
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void twingraphQueryTest() throws ApiException {
        String organizationId = null;
        String datasetId = null;
        DatasetTwinGraphQuery datasetTwinGraphQuery = null;
                String response = api.twingraphQuery(organizationId, datasetId, datasetTwinGraphQuery);
        // TODO: test validations
    }
    
    /**
     * Update a dataset
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDatasetTest() throws ApiException {
        String organizationId = null;
        String datasetId = null;
        Dataset dataset = null;
                Dataset response = api.updateDataset(organizationId, datasetId, dataset);
        // TODO: test validations
    }
    
    /**
     * Update the specified access to User for a Dataset
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDatasetAccessControlTest() throws ApiException {
        String organizationId = null;
        String datasetId = null;
        String identityId = null;
        DatasetRole datasetRole = null;
                DatasetAccessControl response = api.updateDatasetAccessControl(organizationId, datasetId, identityId, datasetRole);
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
    public void updateTwingraphEntitiesTest() throws ApiException {
        String organizationId = null;
        String datasetId = null;
        String type = null;
        List<GraphProperties> graphProperties = null;
                String response = api.updateTwingraphEntities(organizationId, datasetId, type, graphProperties);
        // TODO: test validations
    }
    
    /**
     * Upload data from zip file to dataset&#39;s twingraph
     *
     * To create a new graph from flat files,  you need to create a Zip file. This Zip file must countain two folders named Edges and Nodes.  .zip hierarchy: *main_folder/Nodes *main_folder/Edges  In each folder you can place one or multiple csv files containing your Nodes or Edges data.  Your csv files must follow the following header (column name) requirements:  The Nodes CSVs requires at least one column (the 1st).Column name &#x3D; &#39;id&#39;. It will represent the nodes ID Ids must be populated with string  The Edges CSVs require three columns named, in order, * source * target * id  those colomns represent * The source of the edge * The target of the edge * The id of the edge  All following columns content are up to you. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadTwingraphTest() throws ApiException {
        String organizationId = null;
        String datasetId = null;
        File body = null;
                FileUploadValidation response = api.uploadTwingraph(organizationId, datasetId, body);
        // TODO: test validations
    }
    
}
