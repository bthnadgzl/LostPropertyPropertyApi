package com.kayipesyaProperty.service.impl;

import com.kayipesyaProperty.model.Property;
import com.kayipesyaProperty.service.PropertyService;
import lombok.AllArgsConstructor;
import com.kayipesyaProperty.model.dto.request.PropertyRequest;
import com.kayipesyaProperty.model.dto.response.PropertyResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.kayipesyaProperty.repository.PropertyRepository;
import com.kayipesyaProperty.util.mapper.Mapper;

@Service
@AllArgsConstructor
public class PropertyServiceImpl implements PropertyService {
    private PropertyRepository propertyRepository;
    private Mapper mapper;
    @Override
    public ResponseEntity<PropertyRequest> create(PropertyRequest propertyRequest) {
        Property property = mapper.propertyRequestToPropertyEntity(propertyRequest);
        propertyRepository.save(property);
        return ResponseEntity.ok(propertyRequest);
    }

    @Override
    public ResponseEntity<PropertyResponse> update(PropertyRequest propertyRequest) {
        return null;
    }

    @Override
    public ResponseEntity<PropertyResponse> delete(String username) {
        return null;
    }

    @Override
    public ResponseEntity<PropertyResponse> get() {
        return null;
    }

    @Override
    public ResponseEntity<PropertyResponse> get(String username) {
        return null;
    }
}
