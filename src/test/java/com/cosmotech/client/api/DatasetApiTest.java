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
import com.cosmotech.client.model.Dataset;
import com.cosmotech.client.model.DatasetCompatibility;
import com.cosmotech.client.model.DatasetCopyParameters;
import com.cosmotech.client.model.DatasetSearch;
import java.io.File;
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
     * Copy a Dataset to another Dataset. Source must have a read capable connector and Target a write capable connector.
     *
     * 
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
                List<Dataset> response = api.findAllDatasets(organizationId);
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
     * Search Datasets
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
                List<Dataset> response = api.searchDatasets(organizationId, datasetSearch);
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
    
}
