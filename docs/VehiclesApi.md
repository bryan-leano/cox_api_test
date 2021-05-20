# VehiclesApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIds**](VehiclesApi.md#getIds) | **GET** /api/{datasetId}/vehicles | Get a list of all vehicleids in dataset
[**getVehicle**](VehiclesApi.md#getVehicle) | **GET** /api/{datasetId}/vehicles/{vehicleid} | Get information about a vehicle


<a name="getIds"></a>
# **getIds**
> VehicleIdsResponse getIds(datasetId)

Get a list of all vehicleids in dataset

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VehiclesApi;


VehiclesApi apiInstance = new VehiclesApi();
String datasetId = "datasetId_example"; // String | 
try {
    VehicleIdsResponse result = apiInstance.getIds(datasetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehiclesApi#getIds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetId** | **String**|  |

### Return type

[**VehicleIdsResponse**](VehicleIdsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getVehicle"></a>
# **getVehicle**
> VehicleResponse getVehicle(datasetId, vehicleid)

Get information about a vehicle

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VehiclesApi;


VehiclesApi apiInstance = new VehiclesApi();
String datasetId = "datasetId_example"; // String | 
Integer vehicleid = 56; // Integer | 
try {
    VehicleResponse result = apiInstance.getVehicle(datasetId, vehicleid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehiclesApi#getVehicle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetId** | **String**|  |
 **vehicleid** | **Integer**|  |

### Return type

[**VehicleResponse**](VehicleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

