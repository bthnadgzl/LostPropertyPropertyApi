package com.kayipesyaProperty.util.mapper;

import lombok.AllArgsConstructor;
import com.kayipesyaProperty.model.Property;
import com.kayipesyaProperty.model.dto.request.PropertyRequest;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Mapper {
    private final ModelMapper mapper;

    public Property propertyRequestToPropertyEntity(PropertyRequest propertyRequest){
        Property property = mapper.map(propertyRequest, Property.class);
        return property;
    }
    public <A,B> A mapSourceToTarget(B source,Class<A> targetClass){
        return mapper.map(source,targetClass);
    }







}
