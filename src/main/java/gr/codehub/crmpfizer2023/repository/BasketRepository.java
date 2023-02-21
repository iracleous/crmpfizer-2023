package gr.codehub.crmpfizer2023.repository;

import gr.codehub.crmpfizer2023.model.Basket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasketRepository extends JpaRepository<Basket, Integer> {
}
