package com.kayipesyaProperty.model.dto.request;

import com.kayipesyaProperty.constant.Location;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class PropertyRequest {

    private boolean isFound;
    private String name;
    private String description;
    private String foundOrLostDate;
    private boolean isDelivered;
}
