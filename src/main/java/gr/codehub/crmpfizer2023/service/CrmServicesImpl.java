package gr.codehub.crmpfizer2023.service;

import gr.codehub.crmpfizer2023.model.Product;
import gr.codehub.crmpfizer2023.repository.CrmRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;


@Service
@Primary
@AllArgsConstructor
public class CrmServicesImpl implements CrmServices{


    private CrmRepository<Product,Integer> productIntegerCrmRepository;

    @Override
    public Product getProduct(int k) {
        return productIntegerCrmRepository.readByKey(k);
    }

    @Override
    public Product createProduct(String productName) {
        Product product = new Product();
        product.setName(productName);

        return productIntegerCrmRepository.create(product );
    }

    @Override
    public List<Product> getProducts() {
        return productIntegerCrmRepository.readAll();
    }

    @Override
    public String ping(){
        return "ping";
    }

}
