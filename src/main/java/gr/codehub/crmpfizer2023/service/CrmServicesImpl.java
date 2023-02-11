package gr.codehub.crmpfizer2023.service;

import gr.codehub.crmpfizer2023.model.Product;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Primary
@AllArgsConstructor
public class CrmServicesImpl implements CrmServices{


    @Override
    public Product getProduct(int k) {
        return null;
    }

    @Override
    public Product createProduct(String productName) {
        return null;
    }

    @Override
    public List<Product> getProducts() {
        return null;
    }

    @Override
    public String ping() {
        return null;
    }
}
