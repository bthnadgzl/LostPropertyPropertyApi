package com.kayipesyaProperty.model;

import com.kayipesyaProperty.constant.Location;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;
import java.util.UUID;

@Entity(name = "property")
@Table(name = "property")
@Data
@NoArgsConstructor
public class Property {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;
    private boolean isFound;
    private String name;
    private String description;
    private String foundOrLostDate;
    private boolean isDelivered;
    @Column(updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date deliveredDate;
}
