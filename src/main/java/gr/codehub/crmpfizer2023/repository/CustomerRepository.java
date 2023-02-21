package gr.codehub.crmpfizer2023.repository;

import gr.codehub.crmpfizer2023.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    // JPQL
    // SQL Native
    @Query( value = "SELECT * FROM Customer c WHERE c.email LIKE CONCAT('%', ?1, '%') ",
            nativeQuery = true)
    List<Customer> findCustomerByEmailNative(String match);

}
