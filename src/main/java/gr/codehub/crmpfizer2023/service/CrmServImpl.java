package gr.codehub.crmpfizer2023.service;

import gr.codehub.crmpfizer2023.model.Customer;
import gr.codehub.crmpfizer2023.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class CrmServImpl implements CrmServices{

private final CustomerRepository customerRepository;

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> readCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public Customer readCustomer(int id) {
        return null;
    }

    @Override
    public Customer updateCustomer(Customer customer, int id) {
        return null;
    }

    @Override
    public boolean deleteCustomer(int id) {
        return false;
    }

    @Override
    public String ping() {
        return "hello Pfizer CDI";
    }
}
