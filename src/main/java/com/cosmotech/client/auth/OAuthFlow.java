/*
 * Cosmo Tech Plaform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 0.0.11-SNAPSHOT
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.auth;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-31T08:50:35.115839271Z[Etc/UTC]")
public enum OAuthFlow {
    accessCode, //called authorizationCode  in OpenAPI 3.0
    implicit,
    password,
    application //called clientCredentials in OpenAPI 3.0
}
