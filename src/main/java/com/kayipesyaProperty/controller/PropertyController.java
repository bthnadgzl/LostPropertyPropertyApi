package com.kayipesyaProperty.controller;

import com.kayipesyaProperty.model.dto.request.PropertyRequest;
import com.kayipesyaProperty.service.PropertyService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/property")
@AllArgsConstructor
public class PropertyController {

    private final PropertyService propertyService;

    @PostMapping
    public ResponseEntity<PropertyRequest> create(@RequestBody PropertyRequest propertyRequest){
        return propertyService.create(propertyRequest);

    }


}
