/*
 * OpenPodcast API
 * This is the OpenAPI specification for the OpenPodcast API
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Subscription;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * Subscriptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-17T20:17:50.894234-10:00[Pacific/Honolulu]", comments = "Generator version: 7.7.0")
public class Subscriptions {
  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private BigDecimal total;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private BigDecimal page;

  public static final String SERIALIZED_NAME_PER_PAGE = "per_page";
  @SerializedName(SERIALIZED_NAME_PER_PAGE)
  private BigDecimal perPage;

  public static final String SERIALIZED_NAME_NEXT = "next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  private String next;

  public static final String SERIALIZED_NAME_PREVIOUS = "previous";
  @SerializedName(SERIALIZED_NAME_PREVIOUS)
  private String previous;

  public static final String SERIALIZED_NAME_SUBSCRIPTIONS = "subscriptions";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTIONS)
  private List<Subscription> subscriptions = new ArrayList<>();

  public Subscriptions() {
  }

  public Subscriptions total(BigDecimal total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
   */
  @javax.annotation.Nonnull
  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }


  public Subscriptions page(BigDecimal page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
   */
  @javax.annotation.Nonnull
  public BigDecimal getPage() {
    return page;
  }

  public void setPage(BigDecimal page) {
    this.page = page;
  }


  public Subscriptions perPage(BigDecimal perPage) {
    this.perPage = perPage;
    return this;
  }

  /**
   * Get perPage
   * @return perPage
   */
  @javax.annotation.Nonnull
  public BigDecimal getPerPage() {
    return perPage;
  }

  public void setPerPage(BigDecimal perPage) {
    this.perPage = perPage;
  }


  public Subscriptions next(String next) {
    this.next = next;
    return this;
  }

  /**
   * Get next
   * @return next
   */
  @javax.annotation.Nullable
  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }


  public Subscriptions previous(String previous) {
    this.previous = previous;
    return this;
  }

  /**
   * Get previous
   * @return previous
   */
  @javax.annotation.Nullable
  public String getPrevious() {
    return previous;
  }

  public void setPrevious(String previous) {
    this.previous = previous;
  }


  public Subscriptions subscriptions(List<Subscription> subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

  public Subscriptions addSubscriptionsItem(Subscription subscriptionsItem) {
    if (this.subscriptions == null) {
      this.subscriptions = new ArrayList<>();
    }
    this.subscriptions.add(subscriptionsItem);
    return this;
  }

  /**
   * Get subscriptions
   * @return subscriptions
   */
  @javax.annotation.Nonnull
  public List<Subscription> getSubscriptions() {
    return subscriptions;
  }

  public void setSubscriptions(List<Subscription> subscriptions) {
    this.subscriptions = subscriptions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subscriptions subscriptions = (Subscriptions) o;
    return Objects.equals(this.total, subscriptions.total) &&
        Objects.equals(this.page, subscriptions.page) &&
        Objects.equals(this.perPage, subscriptions.perPage) &&
        Objects.equals(this.next, subscriptions.next) &&
        Objects.equals(this.previous, subscriptions.previous) &&
        Objects.equals(this.subscriptions, subscriptions.subscriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, page, perPage, next, previous, subscriptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subscriptions {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("total");
    openapiFields.add("page");
    openapiFields.add("per_page");
    openapiFields.add("next");
    openapiFields.add("previous");
    openapiFields.add("subscriptions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("total");
    openapiRequiredFields.add("page");
    openapiRequiredFields.add("per_page");
    openapiRequiredFields.add("subscriptions");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Subscriptions
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Subscriptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Subscriptions is not found in the empty JSON string", Subscriptions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Subscriptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Subscriptions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Subscriptions.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("next") != null && !jsonObj.get("next").isJsonNull()) && !jsonObj.get("next").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `next` to be a primitive type in the JSON string but got `%s`", jsonObj.get("next").toString()));
      }
      if ((jsonObj.get("previous") != null && !jsonObj.get("previous").isJsonNull()) && !jsonObj.get("previous").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `previous` to be a primitive type in the JSON string but got `%s`", jsonObj.get("previous").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("subscriptions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscriptions` to be an array in the JSON string but got `%s`", jsonObj.get("subscriptions").toString()));
      }

      JsonArray jsonArraysubscriptions = jsonObj.getAsJsonArray("subscriptions");
      // validate the required field `subscriptions` (array)
      for (int i = 0; i < jsonArraysubscriptions.size(); i++) {
        Subscription.validateJsonElement(jsonArraysubscriptions.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Subscriptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Subscriptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Subscriptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Subscriptions.class));

       return (TypeAdapter<T>) new TypeAdapter<Subscriptions>() {
           @Override
           public void write(JsonWriter out, Subscriptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Subscriptions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Subscriptions given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Subscriptions
   * @throws IOException if the JSON string is invalid with respect to Subscriptions
   */
  public static Subscriptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Subscriptions.class);
  }

  /**
   * Convert an instance of Subscriptions to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

