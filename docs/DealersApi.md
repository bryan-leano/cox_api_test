# DealersApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDealer**](DealersApi.md#getDealer) | **GET** /api/{datasetId}/dealers/{dealerid} | Get information about a dealer


<a name="getDealer"></a>
# **getDealer**
> DealersResponse getDealer(datasetId, dealerid)

Get information about a dealer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DealersApi;


DealersApi apiInstance = new DealersApi();
String datasetId = "datasetId_example"; // String | 
Integer dealerid = 56; // Integer | 
try {
    DealersResponse result = apiInstance.getDealer(datasetId, dealerid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DealersApi#getDealer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetId** | **String**|  |
 **dealerid** | **Integer**|  |

### Return type

[**DealersResponse**](DealersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

