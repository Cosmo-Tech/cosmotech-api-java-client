

# ScenarioRunContainer

a ScenarioRun container description

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | the container Id |  [optional] [readonly] |
|**name** | **String** | the container name |  |
|**labels** | **Map&lt;String, String&gt;** | the metadata labels |  [optional] |
|**envVars** | **Map&lt;String, String&gt;** | environment variable map |  [optional] |
|**image** | **String** | the container image URI |  |
|**entrypoint** | **String** | the container entry point |  [optional] |
|**runArgs** | **List&lt;String&gt;** | the list of run arguments for the container |  [optional] |
|**dependencies** | **List&lt;String&gt;** | the list of dependencies container name to run this container |  [optional] |
|**solutionContainer** | **Boolean** | whether or not this container is a Cosmo Tech solution container |  [optional] [readonly] |
|**nodeLabel** | **String** | the node label request |  [optional] |
|**runSizing** | [**ContainerResourceSizing**](ContainerResourceSizing.md) |  |  [optional] |
|**artifacts** | [**List&lt;ScenarioRunContainerArtifact&gt;**](ScenarioRunContainerArtifact.md) | the list of artifacts |  [optional] |



