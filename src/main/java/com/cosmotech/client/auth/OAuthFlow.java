/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.0.14-SNAPSHOT
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client.auth;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-14T13:45:52.393452226Z[Etc/UTC]")
public enum OAuthFlow {
    accessCode, //called authorizationCode  in OpenAPI 3.0
    implicit,
    password,
    application //called clientCredentials in OpenAPI 3.0
}
