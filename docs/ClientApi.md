# ClientApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generate**](ClientApi.md#generate) | **GET** /client/{language} | 
[**index**](ClientApi.md#index) | **GET** /client | 


<a name="generate"></a>
# **generate**
> generate(language)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClientApi;


ClientApi apiInstance = new ClientApi();
String language = "language_example"; // String | 
try {
    apiInstance.generate(language);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#generate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="index"></a>
# **index**
> index()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClientApi;


ClientApi apiInstance = new ClientApi();
try {
    apiInstance.index();
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#index");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

