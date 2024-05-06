/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.1.1-SNAPSHOT
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.api;

import com.cosmotech.client.ApiException;
import java.io.File;
import com.cosmotech.client.model.Validator;
import com.cosmotech.client.model.ValidatorRun;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ValidatorApi
 */
@Disabled
public class ValidatorApiTest {

    private final ValidatorApi api = new ValidatorApi();

    /**
     * Register a new validator
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createValidatorTest() throws ApiException {
        String organizationId = null;
        Validator validator = null;
        Validator response = api.createValidator(organizationId, validator);
        // TODO: test validations
    }

    /**
     * Register a new validator run
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createValidatorRunTest() throws ApiException {
        String organizationId = null;
        String validatorId = null;
        ValidatorRun validatorRun = null;
        ValidatorRun response = api.createValidatorRun(organizationId, validatorId, validatorRun);
        // TODO: test validations
    }

    /**
     * Delete a validator
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteValidatorTest() throws ApiException {
        String organizationId = null;
        String validatorId = null;
        api.deleteValidator(organizationId, validatorId);
        // TODO: test validations
    }

    /**
     * Delete a validator run
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteValidatorRunTest() throws ApiException {
        String organizationId = null;
        String validatorId = null;
        String validatorrunId = null;
        api.deleteValidatorRun(organizationId, validatorId, validatorrunId);
        // TODO: test validations
    }

    /**
     * List all Validator Runs
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findAllValidatorRunsTest() throws ApiException {
        String organizationId = null;
        String validatorId = null;
        List<ValidatorRun> response = api.findAllValidatorRuns(organizationId, validatorId);
        // TODO: test validations
    }

    /**
     * List all Validators
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findAllValidatorsTest() throws ApiException {
        String organizationId = null;
        List<Validator> response = api.findAllValidators(organizationId);
        // TODO: test validations
    }

    /**
     * Get the details of a validator
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findValidatorByIdTest() throws ApiException {
        String organizationId = null;
        String validatorId = null;
        Validator response = api.findValidatorById(organizationId, validatorId);
        // TODO: test validations
    }

    /**
     * Get the details of a validator run
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findValidatorRunByIdTest() throws ApiException {
        String organizationId = null;
        String validatorId = null;
        String validatorrunId = null;
        ValidatorRun response = api.findValidatorRunById(organizationId, validatorId, validatorrunId);
        // TODO: test validations
    }

    /**
     * Run a Validator
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void runValidatorTest() throws ApiException {
        String organizationId = null;
        String validatorId = null;
        ValidatorRun validatorRun = null;
        ValidatorRun response = api.runValidator(organizationId, validatorId, validatorRun);
        // TODO: test validations
    }

}
