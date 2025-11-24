package test.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

public class product {
    @Autowired
    private test.example.repository.ProductRepository productRepository;

    @GetMapping("/product/{id}")
    public String getProduct() {
        return "views/product";
    }
    public java.util.List<test.example.models.product> getAllProducts() {
    return productRepository.findAll();
    }

}
