package org.example.productserviceproxy4;

import org.example.productserviceproxy4.Models.Product;
import org.example.productserviceproxy4.Repositories.ProductRepo;
import org.example.productserviceproxy4.Services.IProductService;
import org.example.productserviceproxy4.Services.SearchService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class ProductServiceProxy4ApplicationTests {
    @Autowired
    private IProductService productService;

    @Autowired
    private SearchService searchService;


    @Test
    void testingSortWithNulls() {
//        Product product1 = new Product();
//        product1.setDescription("");
//        product1.setTitle("dummy");
//        Product product2 = new Product();
//        product2.setDescription("abc");
//        product2.setTitle("dummy");
//        Product product3 = new Product();
//        product3.setDescription("acc");
//        product3.setTitle("dummy");
//        Product product4 = new Product();
//        product4.setDescription(null);
//        product4.setTitle("dummy");
//        Product product5 = new Product();
//        product5.setDescription("");
//        product5.setTitle("dummy");
//        productService.createProduct(product1);
//        productService.createProduct(product2);
//        productService.createProduct(product3);
//        productService.createProduct(product4);
//        productService.createProduct(product5);

        Page<Product> products = searchService.searchProducts("dummy",0,10);
        System.out.println("Debug");
    }
}
