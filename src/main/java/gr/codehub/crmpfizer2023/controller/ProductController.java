package gr.codehub.crmpfizer2023.controller;

import gr.codehub.crmpfizer2023.model.Product;
import gr.codehub.crmpfizer2023.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@NoArgsConstructor
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/productex/{id}")
    public List<Product> findAllProductExclude(@PathVariable(name="id") int id) {
        return productRepository.findAllProductExclude(id);
    }

}
