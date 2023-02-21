package gr.codehub.crmpfizer2023.service;

import gr.codehub.crmpfizer2023.dto.ProductDto;

import java.util.List;

public interface BasketService {
    ProductDto createProduct(ProductDto product);
    List<ProductDto> findProduct(String name);
    boolean createBasket(int customerId);
    boolean addProductToBasket(int productId, int basketId);

    List<String> getBasketProductNames(int basketId);
}
