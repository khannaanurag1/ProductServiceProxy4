package org.example.productserviceproxy4.Dtos;

import lombok.Getter;
import lombok.Setter;
import org.example.productserviceproxy4.Models.SortParam;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class SearchRequestDto {
    private String query;
    private int pageNumber;
    private int sizeOfPage;
    private List<SortParam> sortParams = new ArrayList();
}
