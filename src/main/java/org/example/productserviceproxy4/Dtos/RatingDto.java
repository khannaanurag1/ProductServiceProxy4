package org.example.productserviceproxy4.Dtos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RatingDto {
    private Double rate;
    private Long count;
}
