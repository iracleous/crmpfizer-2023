package gr.codehub.crmpfizer2023.service;

import gr.codehub.crmpfizer2023.model.Product;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CrmServicesImpl implements CrmServices{

    @Override
    public Product getProduct(){
        Product product = new Product();
        product.setCode(12);
        product.setName("Chips");
        product.setPrice(new BigDecimal("1.20"));
        return product;
    }

    @Override
    public String ping(){
        return "ping";
    }

}
