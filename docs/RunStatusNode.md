

# RunStatusNode

status of a Run Node

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | the node id |  [optional] |
|**name** | **String** | the node unique name |  [optional] |
|**containerName** | **String** | the Run container name |  [optional] |
|**outboundNodes** | **List&lt;String&gt;** | the list of outbound nodes |  [optional] [readonly] |
|**resourcesDuration** | [**RunResourceRequested**](RunResourceRequested.md) |  |  [optional] |
|**estimatedDuration** | **Integer** | estimatedDuration in seconds |  [optional] |
|**hostNodeName** | **String** | HostNodeName name of the Kubernetes node on which the Pod is running, if applicable |  [optional] |
|**message** | **String** | a human readable message indicating details about why the node is in this condition |  [optional] |
|**phase** | **String** | high-level summary of where the node is in its lifecycle |  [optional] |
|**progress** | **String** | progress to completion |  [optional] |
|**startTime** | **String** | the node start time |  [optional] |
|**endTime** | **String** | the node end time |  [optional] |



