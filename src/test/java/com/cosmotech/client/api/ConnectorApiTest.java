/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 2.4.6-private
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.api;

import com.cosmotech.client.ApiException;
import com.cosmotech.client.model.Connector;
import java.io.File;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConnectorApi
 */
@Ignore
public class ConnectorApiTest {

    private final ConnectorApi api = new ConnectorApi();

    
    /**
     * List all Connectors
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findAllConnectorsTest() throws ApiException {
        Integer page = null;
        Integer size = null;
                List<Connector> response = api.findAllConnectors(page, size);
        // TODO: test validations
    }
    
    /**
     * Get the details of a connector
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findConnectorByIdTest() throws ApiException {
        String connectorId = null;
                Connector response = api.findConnectorById(connectorId);
        // TODO: test validations
    }
    
    /**
     * Import existing connector
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void importConnectorTest() throws ApiException {
        Connector connector = null;
                Connector response = api.importConnector(connector);
        // TODO: test validations
    }
    
    /**
     * Register a new connector
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void registerConnectorTest() throws ApiException {
        Connector connector = null;
                Connector response = api.registerConnector(connector);
        // TODO: test validations
    }
    
    /**
     * Unregister a connector
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void unregisterConnectorTest() throws ApiException {
        String connectorId = null;
                api.unregisterConnector(connectorId);
        // TODO: test validations
    }
    
}
