# SubscriptionsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addSubscription**](SubscriptionsApi.md#addSubscription) | **POST** /subscriptions | Add new subscriptions for the authenticated user |
| [**deleteSubscription**](SubscriptionsApi.md#deleteSubscription) | **DELETE** /subscriptions/{guid} | Delete a single subscription entry |
| [**getDeletions**](SubscriptionsApi.md#getDeletions) | **GET** /deletions/{id} | Retrieve information subscription deletion |
| [**getSubscription**](SubscriptionsApi.md#getSubscription) | **GET** /subscriptions/{guid} | Retrieve information about a single subscription |
| [**getSubscriptions**](SubscriptionsApi.md#getSubscriptions) | **GET** /subscriptions | Retrieve all updated subscription information |
| [**updateSubscription**](SubscriptionsApi.md#updateSubscription) | **PATCH** /subscriptions/{guid} | Update a single subscription entry |


<a id="addSubscription"></a>
# **addSubscription**
> NewSubscriptions addSubscription(feedArray)

Add new subscriptions for the authenticated user

Add one or more new subscriptions for the authenticated user by passing an array of feed URLs in the request body

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubscriptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: podcast_auth
    OAuth podcast_auth = (OAuth) defaultClient.getAuthentication("podcast_auth");
    podcast_auth.setAccessToken("YOUR ACCESS TOKEN");

    SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
    FeedArray feedArray = new FeedArray(); // FeedArray | An array of feeds the user wants to subscribe to
    try {
      NewSubscriptions result = apiInstance.addSubscription(feedArray);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#addSubscription");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **feedArray** | [**FeedArray**](FeedArray.md)| An array of feeds the user wants to subscribe to | [optional] |

### Return type

[**NewSubscriptions**](NewSubscriptions.md)

### Authorization

[podcast_auth](../README.md#podcast_auth)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **401** | Unauthorized |  -  |
| **405** | Validation exception |  -  |

<a id="deleteSubscription"></a>
# **deleteSubscription**
> Success deleteSubscription(guid)

Delete a single subscription entry

Deletes a single subscription specified in the path

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubscriptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: podcast_auth
    OAuth podcast_auth = (OAuth) defaultClient.getAuthentication("podcast_auth");
    podcast_auth.setAccessToken("YOUR ACCESS TOKEN");

    SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
    String guid = "2d8bb39b-8d34-48d4-b223-a0d01eb27d71"; // String | 
    try {
      Success result = apiInstance.deleteSubscription(guid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#deleteSubscription");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **guid** | **String**|  | |

### Return type

[**Success**](Success.md)

### Authorization

[podcast_auth](../README.md#podcast_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The deletion request has been received and will be processed |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |
| **405** | Validation exception |  -  |

<a id="getDeletions"></a>
# **getDeletions**
> Deletion getDeletions(id)

Retrieve information subscription deletion

Retrieve information about a deletion by querying the ID sent in a deletion request

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubscriptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: podcast_auth
    OAuth podcast_auth = (OAuth) defaultClient.getAuthentication("podcast_auth");
    podcast_auth.setAccessToken("YOUR ACCESS TOKEN");

    SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
    BigDecimal id = new BigDecimal("25"); // BigDecimal | 
    try {
      Deletion result = apiInstance.getDeletions(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#getDeletions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **BigDecimal**|  | |

### Return type

[**Deletion**](Deletion.md)

### Authorization

[podcast_auth](../README.md#podcast_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The object was successfully deleted |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |
| **405** | Validation exception |  -  |

<a id="getSubscription"></a>
# **getSubscription**
> Subscription getSubscription(guid)

Retrieve information about a single subscription

Retrieve information about a single subscription specified in the path

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubscriptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: podcast_auth
    OAuth podcast_auth = (OAuth) defaultClient.getAuthentication("podcast_auth");
    podcast_auth.setAccessToken("YOUR ACCESS TOKEN");

    SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
    String guid = "968cb508-803c-493c-8ff2-9e397dadb83c"; // String | 
    try {
      Subscription result = apiInstance.getSubscription(guid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#getSubscription");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **guid** | **String**|  | |

### Return type

[**Subscription**](Subscription.md)

### Authorization

[podcast_auth](../README.md#podcast_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |
| **405** | Validation exception |  -  |
| **410** | Object deleted |  -  |

<a id="getSubscriptions"></a>
# **getSubscriptions**
> Subscriptions getSubscriptions(since, page, perPage)

Retrieve all updated subscription information

Retrieve all subscription information that has changed since the provided timestamp

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubscriptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: podcast_auth
    OAuth podcast_auth = (OAuth) defaultClient.getAuthentication("podcast_auth");
    podcast_auth.setAccessToken("YOUR ACCESS TOKEN");

    SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
    OffsetDateTime since = OffsetDateTime.parse("2022-04-23T18:25:43.511Z"); // OffsetDateTime | 
    BigDecimal page = new BigDecimal("1"); // BigDecimal | 
    BigDecimal perPage = new BigDecimal("5"); // BigDecimal | 
    try {
      Subscriptions result = apiInstance.getSubscriptions(since, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#getSubscriptions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **since** | **OffsetDateTime**|  | [optional] |
| **page** | **BigDecimal**|  | [optional] |
| **perPage** | **BigDecimal**|  | [optional] |

### Return type

[**Subscriptions**](Subscriptions.md)

### Authorization

[podcast_auth](../README.md#podcast_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **401** | Unauthorized |  -  |

<a id="updateSubscription"></a>
# **updateSubscription**
> PatchedSubscription updateSubscription(guid, subscriptionUpdate)

Update a single subscription entry

Update information about a single subscription specified in the path

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubscriptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: podcast_auth
    OAuth podcast_auth = (OAuth) defaultClient.getAuthentication("podcast_auth");
    podcast_auth.setAccessToken("YOUR ACCESS TOKEN");

    SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
    String guid = "968cb508-803c-493c-8ff2-9e397dadb83c"; // String | 
    SubscriptionUpdate subscriptionUpdate = new SubscriptionUpdate(); // SubscriptionUpdate | A request containing new information to update an existing subscription with
    try {
      PatchedSubscription result = apiInstance.updateSubscription(guid, subscriptionUpdate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionsApi#updateSubscription");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **guid** | **String**|  | |
| **subscriptionUpdate** | [**SubscriptionUpdate**](SubscriptionUpdate.md)| A request containing new information to update an existing subscription with | [optional] |

### Return type

[**PatchedSubscription**](PatchedSubscription.md)

### Authorization

[podcast_auth](../README.md#podcast_auth)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |
| **405** | Validation exception |  -  |

