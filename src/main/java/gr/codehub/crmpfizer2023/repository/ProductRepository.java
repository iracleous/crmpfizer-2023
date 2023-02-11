package gr.codehub.crmpfizer2023.repository;

import gr.codehub.crmpfizer2023.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
