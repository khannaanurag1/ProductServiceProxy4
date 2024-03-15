package org.example.productserviceproxy4.Controllers;

import org.example.productserviceproxy4.Dtos.ProductDto;
import org.example.productserviceproxy4.Dtos.SearchRequestDto;
import org.example.productserviceproxy4.Models.Category;
import org.example.productserviceproxy4.Models.Product;
import org.example.productserviceproxy4.Services.SearchService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/search")
public class SearchController {

    private SearchService searchService;

    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    @PostMapping
//    public List<ProductDto> searchProducts(@RequestBody SearchRequestDto searchRequestDto) {
//       List<Product> products = searchService.searchProducts(searchRequestDto.getQuery(), searchRequestDto.getPageNumber(), searchRequestDto.getSizeOfPage());
//       List<ProductDto> searchResults = new ArrayList<>();
//       for(Product p : products) {
//           searchResults.add(getProductDto(p));
//       }
//       return searchResults;
//    }
    public Page<Product> searchProducts(@RequestBody SearchRequestDto searchRequestDto) {
        Page<Product> products = searchService.searchProducts(searchRequestDto.getQuery(), searchRequestDto.getPageNumber(), searchRequestDto.getSizeOfPage());
        return products;

//         In case we want to return Page<ProductDto> , below logic may give incorrect result
//         List<ProductDto> searchResultsList = new ArrayList<>();
//         for(Product p : products.getContent()) {
//           searchResultsList.add(getProductDto(p));
//         }
//         Page<ProductDto> searchResultsPage = new PageImpl<>(searchResultsList);
//         return searchResultsPage;
    }

    private ProductDto getProductDto(Product product) {
        ProductDto productDto = new ProductDto();
        productDto.setId(product.getId());
        productDto.setTitle(product.getTitle());
        productDto.setImage(product.getImageUrl());
        productDto.setCategory(product.getCategory().getName());
        return productDto;
    }
}
