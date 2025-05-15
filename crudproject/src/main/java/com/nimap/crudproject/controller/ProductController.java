package com.nimap.crudproject.controller;

import com.nimap.crudproject.entity.Product;
import com.nimap.crudproject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/products")
public class ProductController {

        @Autowired
        private ProductService productService;

        @PostMapping
        public Product createProduct(@RequestBody Product product) {
            return productService.saveProduct(product);
        }

    @GetMapping("/paginated")
    public Page<Product> getAllProductsPaginated(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size
    ) {
        return productService.getPaginatedProducts(page, size);
    }

    @GetMapping
        public List<Product> getAllProducts() {
            return productService.getAllProducts();
        }

        @GetMapping("/{id}")
        public Optional<Product> getProductById(@PathVariable Long id) {
            return productService.getProductById(id);
        }

        @PutMapping("/{id}")
        public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
            return productService.updateProduct(id, product);
        }

        @DeleteMapping("/{id}")
        public void deleteProduct(@PathVariable Long id) {
            productService.deleteProduct(id);
        }
}
