package org.example.productserviceproxy4.Services;

import org.example.productserviceproxy4.Models.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAllProducts();

    Product getProduct(Long id);

    Product createProduct(Product product);

    Product updateProduct(Product product, Long productId);

    String deleteProduct(Long id);

    Product getSpecialProduct(Long productId, Long userId);
}
