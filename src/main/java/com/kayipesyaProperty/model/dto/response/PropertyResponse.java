package com.kayipesyaProperty.model.dto.response;

import com.kayipesyaProperty.constant.Location;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PropertyResponse {
    private Location location;
    private boolean isFound;
    private String name;
    private String description;
    private String foundOrLostDate;
    private boolean isDelivered;
}
