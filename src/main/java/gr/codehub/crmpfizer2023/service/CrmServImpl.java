package gr.codehub.crmpfizer2023.service;

import gr.codehub.crmpfizer2023.exception.CrmException;
import gr.codehub.crmpfizer2023.model.Customer;
import gr.codehub.crmpfizer2023.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Customer readCustomer(int id) throws CrmException {
        Optional<Customer> customerOptional = customerRepository.findById(id);
        if (customerOptional.isPresent())
            return customerOptional.get();
        throw new CrmException("Customer not found id= " + id);
    }

    @Override
    public boolean updateCustomer(Customer customer, int id) {
        boolean action;
        try {
            Customer dbCustomer = readCustomer(id);
            dbCustomer.setName(customer.getName());
            dbCustomer.setEmail(customer.getEmail());
            customerRepository.save(dbCustomer);
            action = true;
        } catch (CrmException e) {
            action = false;
        }
       return action;
    }

    @Override
    public boolean deleteCustomer(int id) {
        boolean action;
        try {
            Customer dbCustomer = readCustomer(id);
            customerRepository.delete(dbCustomer);
            action = true;
        } catch (CrmException e) {
            action = false;
        }
        return action;
    }

    @Override
    public String ping() {
        return "hello Pfizer CDI";
    }
}
