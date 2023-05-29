package com.siyar25.productservice.controller;

import com.siyar25.productservice.dto.ProductRequest;
import com.siyar25.productservice.dto.ProductResponse;
import com.siyar25.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest){
        productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(OK)
    public List<ProductResponse> getAllProducts(){
        return productService.getAllProducts();
    }
}
