package org.example.productserviceproxy4.Services;

import org.example.productserviceproxy4.Dtos.ProductDto;
import org.example.productserviceproxy4.Dtos.SearchRequestDto;
import org.example.productserviceproxy4.Models.Product;
import org.example.productserviceproxy4.Repositories.ProductRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class SearchService {

    private ProductRepo productRepo;

    public SearchService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }
    //public List<Product> searchProducts(String query, int pageNumber, int sizeOfPage) {
    public Page<Product> searchProducts(String query, int pageNumber, int sizeOfPage) {
        //return productRepo.findProductByTitle(query, PageRequest.of(pageNumber,sizeOfPage));
        return productRepo.findByTitleEquals(query, PageRequest.of(pageNumber,sizeOfPage));
    }
}
