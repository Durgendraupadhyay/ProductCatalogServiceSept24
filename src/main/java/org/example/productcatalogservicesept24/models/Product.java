package org.example.productcatalogservicesept24.models;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Product extends BaseModel{

    private String title;

    private String description;

    private String imageUrl;

    private double amount;

    private Category category;

}
