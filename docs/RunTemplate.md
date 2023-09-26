

# RunTemplate

a Solution Run Template

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | the Solution Run Template id | 
**name** | **String** | the Run Template name |  [optional]
**description** | **String** | the Run Template description |  [optional]
**csmSimulation** | **String** | the Cosmo Tech simulation name. This information is send to the Engine. Mandatory information if no Engine is defined |  [optional]
**tags** | **List&lt;String&gt;** | the list of Run Template tags |  [optional]
**computeSize** | **String** | the compute size needed for this Run Template. Standard sizes are basic and highcpu. Default is basic |  [optional]
**runSizing** | [**RunTemplateResourceSizing**](RunTemplateResourceSizing.md) |  |  [optional]
**noDataIngestionState** | **Boolean** | set to true if the run template does not want to check data ingestion state (no probes or not control plane) |  [optional]
**fetchDatasets** | **Boolean** | whether or not the fetch dataset step is done |  [optional]
**scenarioDataDownloadTransform** | **Boolean** | whether or not the scenario data download transform step step is done |  [optional]
**fetchScenarioParameters** | **Boolean** | whether or not the fetch parameters step is done |  [optional]
**applyParameters** | **Boolean** | whether or not the apply parameter step is done |  [optional]
**validateData** | **Boolean** | whether or not the validate step is done |  [optional]
**sendDatasetsToDataWarehouse** | **Boolean** | whether or not the Datasets values are send to the DataWarehouse prior to Simulation Run. If not set follow the Workspace setting |  [optional]
**sendInputParametersToDataWarehouse** | **Boolean** | whether or not the input parameters values are send to the DataWarehouse prior to Simulation Run. If not set follow the Workspace setting |  [optional]
**preRun** | **Boolean** | whether or not the pre-run step is done |  [optional]
**run** | **Boolean** | whether or not the run step is done |  [optional]
**postRun** | **Boolean** | whether or not the post-run step is done |  [optional]
**parametersJson** | **Boolean** | whether or not to store the scenario parameters in json instead of csv |  [optional]
**parametersHandlerSource** | **RunTemplateStepSource** |  |  [optional]
**datasetValidatorSource** | **RunTemplateStepSource** |  |  [optional]
**preRunSource** | **RunTemplateStepSource** |  |  [optional]
**runSource** | **RunTemplateStepSource** |  |  [optional]
**postRunSource** | **RunTemplateStepSource** |  |  [optional]
**scenariodataTransformSource** | **RunTemplateStepSource** |  |  [optional]
**parameterGroups** | **List&lt;String&gt;** | the ordered list of parameters groups for the Run Template |  [optional]
**stackSteps** | **Boolean** | whether or not to stack adjacent scenario run steps in one container run which will chain steps |  [optional]
**gitRepositoryUrl** | **String** | an optional URL to the git repository |  [optional]
**gitBranchName** | **String** | an optional git branch name |  [optional]
**runTemplateSourceDir** | **String** | an optional directory where to find the run template source |  [optional]
**orchestratorType** | **RunTemplateOrchestrator** |  |  [optional]
**executionTimeout** | **Integer** | an optional duration in seconds in which a workflow is allowed to run |  [optional]
**deleteHistoricalData** | [**DeleteHistoricalData**](DeleteHistoricalData.md) |  |  [optional]



