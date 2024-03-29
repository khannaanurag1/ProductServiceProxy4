package org.example.productserviceproxy4.Dtos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.productserviceproxy4.Models.Category;

@Getter
@Setter
@ToString
public class ProductDto {
    private Long id;
    private String title;
    private String description;
    private String image;
    private RatingDto rating;
    private Double price;
    private String category;
}
