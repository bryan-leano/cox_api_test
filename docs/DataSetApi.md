# DataSetApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCheat**](DataSetApi.md#getCheat) | **GET** /api/{datasetId}/cheat | Get correct answer for dataset (cheat)
[**getDataSetId**](DataSetApi.md#getDataSetId) | **GET** /api/datasetId | Creates new dataset and returns its ID
[**postAnswer**](DataSetApi.md#postAnswer) | **POST** /api/{datasetId}/answer | Submit answer for dataset


<a name="getCheat"></a>
# **getCheat**
> Answer getCheat(datasetId)

Get correct answer for dataset (cheat)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DataSetApi;


DataSetApi apiInstance = new DataSetApi();
String datasetId = "datasetId_example"; // String | 
try {
    Answer result = apiInstance.getCheat(datasetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataSetApi#getCheat");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetId** | **String**|  |

### Return type

[**Answer**](Answer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getDataSetId"></a>
# **getDataSetId**
> DatasetIdResponse getDataSetId()

Creates new dataset and returns its ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DataSetApi;


DataSetApi apiInstance = new DataSetApi();
try {
    DatasetIdResponse result = apiInstance.getDataSetId();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataSetApi#getDataSetId");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DatasetIdResponse**](DatasetIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="postAnswer"></a>
# **postAnswer**
> AnswerResponse postAnswer(datasetId, answer)

Submit answer for dataset

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DataSetApi;


DataSetApi apiInstance = new DataSetApi();
String datasetId = "datasetId_example"; // String | 
Answer answer = new Answer(); // Answer | 
try {
    AnswerResponse result = apiInstance.postAnswer(datasetId, answer);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataSetApi#postAnswer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetId** | **String**|  |
 **answer** | [**Answer**](Answer.md)|  | [optional]

### Return type

[**AnswerResponse**](AnswerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

