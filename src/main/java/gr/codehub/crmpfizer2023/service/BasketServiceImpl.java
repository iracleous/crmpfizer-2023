package gr.codehub.crmpfizer2023.service;



import gr.codehub.crmpfizer2023.dto.ProductDto;
import gr.codehub.crmpfizer2023.model.Basket;
import gr.codehub.crmpfizer2023.model.Customer;
import gr.codehub.crmpfizer2023.model.Product;
import gr.codehub.crmpfizer2023.repository.BasketRepository;
import gr.codehub.crmpfizer2023.repository.CustomerRepository;
import gr.codehub.crmpfizer2023.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class BasketServiceImpl implements BasketService{

    private ProductRepository productRepository;
    private BasketRepository basketRepository;
    private CustomerRepository customerRepository;
    private ModelMapper mapper;

    @Override
    public ProductDto createProduct(ProductDto productDto) {
        Product product = mapper.map(productDto, Product.class);
        return mapper.map(productRepository.save(product), ProductDto.class);
    }

    @Override
    public List<ProductDto> findProduct(String name) {
        return productRepository
                .findAllByNameContaining(name)
                .stream()
                .map(product-> mapper.map(product, ProductDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public int createBasket(int customerId) {
        Basket basket = new Basket();
        Optional<Customer> customerOpt = customerRepository.findById(customerId);
        if (customerOpt.isEmpty()){
            return -1;
        }
        Customer customer = customerOpt.get();
        basket.setCustomer(customer);
        basketRepository.save(basket);
        return basket.getId();
    }

    @Override
    public int addProductToBasket(int productId, int basketId) {
        return -1;
    }

    @Override
    public List<String> getBasketProductNames(int basketId) {
        return null;
    }
}
