package gr.codehub.crmpfizer2023.configuration;

import gr.codehub.crmpfizer2023.model.Customer;
import gr.codehub.crmpfizer2023.model.CustomerType;
import gr.codehub.crmpfizer2023.model.Product;
import gr.codehub.crmpfizer2023.repository.CustomerRepository;
import gr.codehub.crmpfizer2023.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Configuration
public class InitialConfiguration {

    @Bean
    CommandLineRunner commandLineRunner(
            CustomerRepository custRepository, ProductRepository prodRepository) {
        return args -> {
            Customer customer1 = new Customer( 0, "Malvina", "malvina@gmail.com", 36,
                    null, CustomerType.INDIVIDUAL,  null);
            Customer customer2 = new Customer( 0, "Kostas", "kostas@gmail.com", 37,
                    null, CustomerType.BUSINESS, null);
            List<Customer> list =  custRepository.saveAll(List.of(customer1, customer2));


            Product product1 = new Product( 0,  "Choco", new BigDecimal("1.20"), null);
            Product product2  = new Product( 0,  "Milk",
                    new BigDecimal("0.80"), null);
            Product product3 = prodRepository.save(product1);
            Product product4 = prodRepository.save(product2);
            //prodRepository.save(product2);
            // prodRepository.saveAll(List.of(product1, product2));


            System.out.println(product1);
            System.out.println(product3);
            System.out.println(product4);

        };
    }


}
