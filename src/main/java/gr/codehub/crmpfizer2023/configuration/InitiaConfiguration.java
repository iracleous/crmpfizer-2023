package gr.codehub.crmpfizer2023.configuration;

import gr.codehub.crmpfizer2023.model.Customer;
import gr.codehub.crmpfizer2023.model.Product;
import gr.codehub.crmpfizer2023.repository.CustomerRepository;
import gr.codehub.crmpfizer2023.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.util.List;

@Configuration
public class InitiaConfiguration {

    @Bean
    CommandLineRunner commandLineRunner(
            CustomerRepository custRepository, ProductRepository prodRepository){
        return args -> {
            Customer customer1 = new Customer( 0, "Malvina", "malvina@gmail.com");
            Customer customer2 = new Customer( 0, "Kostas", "kostas@gmail.com");
            custRepository.saveAll(  List.of(customer1, customer2)   );
            Product product1 = new Product( 0,  "Choco", "Candy",
                    new BigDecimal(1.20));
            Product product2  = new Product( 0,  "Milk", "Dairy",
                    new BigDecimal(0.80));
            prodRepository.saveAll(  List.of(product1, product2)   );

        };
    }



}
