package com.kayipesyaProperty.service;

import com.kayipesyaProperty.model.dto.request.PropertyRequest;
import com.kayipesyaProperty.model.dto.response.PropertyResponse;
import org.springframework.http.ResponseEntity;

public interface PropertyService {
    ResponseEntity<PropertyRequest> create(PropertyRequest propertyRequest);
    ResponseEntity<PropertyResponse> update(PropertyRequest propertyRequest);
    ResponseEntity<PropertyResponse> delete(String username);
    ResponseEntity<PropertyResponse> get();
    ResponseEntity<PropertyResponse> get(String username);
}
