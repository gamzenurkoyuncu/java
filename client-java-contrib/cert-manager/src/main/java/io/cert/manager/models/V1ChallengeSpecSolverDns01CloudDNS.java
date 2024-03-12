/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.21.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.cert.manager.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.cert.manager.models.V1ChallengeSpecSolverDns01AcmeDNSAccountSecretRef;
import java.io.IOException;

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
import java.util.Map.Entry;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * Use the Google Cloud DNS API to manage DNS01 challenge records.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T07:00:20.132973Z[Etc/UTC]")
public class V1ChallengeSpecSolverDns01CloudDNS {
  public static final String SERIALIZED_NAME_HOSTED_ZONE_NAME = "hostedZoneName";
  @SerializedName(SERIALIZED_NAME_HOSTED_ZONE_NAME)
  private String hostedZoneName;

  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  private String project;

  public static final String SERIALIZED_NAME_SERVICE_ACCOUNT_SECRET_REF = "serviceAccountSecretRef";
  @SerializedName(SERIALIZED_NAME_SERVICE_ACCOUNT_SECRET_REF)
  private V1ChallengeSpecSolverDns01AcmeDNSAccountSecretRef serviceAccountSecretRef;

  public V1ChallengeSpecSolverDns01CloudDNS() {
  }

  public V1ChallengeSpecSolverDns01CloudDNS hostedZoneName(String hostedZoneName) {
    
    this.hostedZoneName = hostedZoneName;
    return this;
  }

   /**
   * HostedZoneName is an optional field that tells cert-manager in which Cloud DNS zone the challenge record has to be created. If left empty cert-manager will automatically choose a zone.
   * @return hostedZoneName
  **/
  @jakarta.annotation.Nullable
  public String getHostedZoneName() {
    return hostedZoneName;
  }


  public void setHostedZoneName(String hostedZoneName) {
    this.hostedZoneName = hostedZoneName;
  }


  public V1ChallengeSpecSolverDns01CloudDNS project(String project) {
    
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @jakarta.annotation.Nonnull
  public String getProject() {
    return project;
  }


  public void setProject(String project) {
    this.project = project;
  }


  public V1ChallengeSpecSolverDns01CloudDNS serviceAccountSecretRef(V1ChallengeSpecSolverDns01AcmeDNSAccountSecretRef serviceAccountSecretRef) {
    
    this.serviceAccountSecretRef = serviceAccountSecretRef;
    return this;
  }

   /**
   * Get serviceAccountSecretRef
   * @return serviceAccountSecretRef
  **/
  @jakarta.annotation.Nullable
  public V1ChallengeSpecSolverDns01AcmeDNSAccountSecretRef getServiceAccountSecretRef() {
    return serviceAccountSecretRef;
  }


  public void setServiceAccountSecretRef(V1ChallengeSpecSolverDns01AcmeDNSAccountSecretRef serviceAccountSecretRef) {
    this.serviceAccountSecretRef = serviceAccountSecretRef;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ChallengeSpecSolverDns01CloudDNS v1ChallengeSpecSolverDns01CloudDNS = (V1ChallengeSpecSolverDns01CloudDNS) o;
    return Objects.equals(this.hostedZoneName, v1ChallengeSpecSolverDns01CloudDNS.hostedZoneName) &&
        Objects.equals(this.project, v1ChallengeSpecSolverDns01CloudDNS.project) &&
        Objects.equals(this.serviceAccountSecretRef, v1ChallengeSpecSolverDns01CloudDNS.serviceAccountSecretRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostedZoneName, project, serviceAccountSecretRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ChallengeSpecSolverDns01CloudDNS {\n");
    sb.append("    hostedZoneName: ").append(toIndentedString(hostedZoneName)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    serviceAccountSecretRef: ").append(toIndentedString(serviceAccountSecretRef)).append("\n");
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
    openapiFields.add("hostedZoneName");
    openapiFields.add("project");
    openapiFields.add("serviceAccountSecretRef");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("project");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1ChallengeSpecSolverDns01CloudDNS
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1ChallengeSpecSolverDns01CloudDNS.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ChallengeSpecSolverDns01CloudDNS is not found in the empty JSON string", V1ChallengeSpecSolverDns01CloudDNS.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1ChallengeSpecSolverDns01CloudDNS.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ChallengeSpecSolverDns01CloudDNS` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1ChallengeSpecSolverDns01CloudDNS.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("hostedZoneName") != null && !jsonObj.get("hostedZoneName").isJsonNull()) && !jsonObj.get("hostedZoneName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostedZoneName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostedZoneName").toString()));
      }
      if (!jsonObj.get("project").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project").toString()));
      }
      // validate the optional field `serviceAccountSecretRef`
      if (jsonObj.get("serviceAccountSecretRef") != null && !jsonObj.get("serviceAccountSecretRef").isJsonNull()) {
        V1ChallengeSpecSolverDns01AcmeDNSAccountSecretRef.validateJsonObject(jsonObj.getAsJsonObject("serviceAccountSecretRef"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ChallengeSpecSolverDns01CloudDNS.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ChallengeSpecSolverDns01CloudDNS' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ChallengeSpecSolverDns01CloudDNS> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ChallengeSpecSolverDns01CloudDNS.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ChallengeSpecSolverDns01CloudDNS>() {
           @Override
           public void write(JsonWriter out, V1ChallengeSpecSolverDns01CloudDNS value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ChallengeSpecSolverDns01CloudDNS read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1ChallengeSpecSolverDns01CloudDNS given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1ChallengeSpecSolverDns01CloudDNS
  * @throws IOException if the JSON string is invalid with respect to V1ChallengeSpecSolverDns01CloudDNS
  */
  public static V1ChallengeSpecSolverDns01CloudDNS fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ChallengeSpecSolverDns01CloudDNS.class);
  }

 /**
  * Convert an instance of V1ChallengeSpecSolverDns01CloudDNS to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
