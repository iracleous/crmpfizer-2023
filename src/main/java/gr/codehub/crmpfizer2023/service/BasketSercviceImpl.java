package gr.codehub.crmpfizer2023.service;

import gr.codehub.crmpfizer2023.dto.ProductDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketSercviceImpl implements BasketService{
    @Override
    public ProductDto createProduct(ProductDto product) {
        return null;
    }

    @Override
    public List<ProductDto> findProduct(String name) {
        return null;
    }

    @Override
    public boolean createBasket(int customerId) {
        return false;
    }

    @Override
    public boolean addProductToBasket(int productId, int basketId) {
        return false;
    }

    @Override
    public List<String> getBasketProductNames(int basketId) {
        return null;
    }
}
