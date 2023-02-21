package gr.codehub.crmpfizer2023.repository;

import gr.codehub.crmpfizer2023.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query(value = "Select p from Product p where p.id = :productId")
    List<Product> findAllProductExclude(int productId);

    List<Product> findAllByNameContaining(String name);
}
