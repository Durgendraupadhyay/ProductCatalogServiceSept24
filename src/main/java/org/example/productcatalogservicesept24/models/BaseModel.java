package org.example.productcatalogservicesept24.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public abstract class BaseModel {

    private Long id;

    private Date createdAt;

    private Date lastUpdatedAt;

    private State state;

}
