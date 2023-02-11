package gr.codehub.crmpfizer2023.repository;

import gr.codehub.crmpfizer2023.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository
        extends JpaRepository<Customer, Integer> {
}
