# CloudsApi

All URIs are relative to *http://localhost:8080/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cencelCloudById**](CloudsApi.md#cencelCloudById) | **DELETE** /clouds/{cloud_id} | Метод отмены заказа в облаке по ID
[**createCloud**](CloudsApi.md#createCloud) | **POST** /clouds | Создаем заказ в облаке
[**getAllClouds**](CloudsApi.md#getAllClouds) | **GET** /clouds | Метод получения списка ресурсов на облаке
[**getCloudById**](CloudsApi.md#getCloudById) | **GET** /clouds/{cloud_id} | Метод получения заказа на облако по ID

<a name="cencelCloudById"></a>
# **cencelCloudById**
> cencelCloudById(cloudId)

Метод отмены заказа в облаке по ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CloudsApi;


CloudsApi apiInstance = new CloudsApi();
String cloudId = "cloudId_example"; // String | индетификатор заказа в облаке
try {
    apiInstance.cencelCloudById(cloudId);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudsApi#cencelCloudById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudId** | **String**| индетификатор заказа в облаке |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: aplication/json

<a name="createCloud"></a>
# **createCloud**
> Cloud createCloud()

Создаем заказ в облаке

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CloudsApi;


CloudsApi apiInstance = new CloudsApi();
try {
    Cloud result = apiInstance.createCloud();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudsApi#createCloud");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Cloud**](Cloud.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: aplication/json

<a name="getAllClouds"></a>
# **getAllClouds**
> Cloud getAllClouds()

Метод получения списка ресурсов на облаке

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CloudsApi;


CloudsApi apiInstance = new CloudsApi();
try {
    Cloud result = apiInstance.getAllClouds();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudsApi#getAllClouds");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Cloud**](Cloud.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: aplication/json

<a name="getCloudById"></a>
# **getCloudById**
> getCloudById(cloudId)

Метод получения заказа на облако по ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CloudsApi;


CloudsApi apiInstance = new CloudsApi();
String cloudId = "cloudId_example"; // String | индетификатор заказа в облаке
try {
    apiInstance.getCloudById(cloudId);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudsApi#getCloudById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudId** | **String**| индетификатор заказа в облаке |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: aplication/json

