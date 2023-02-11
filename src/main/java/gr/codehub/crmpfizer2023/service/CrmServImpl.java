package gr.codehub.crmpfizer2023.service;

import gr.codehub.crmpfizer2023.model.Customer;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CrmServImpl implements CrmServices{


    @Override
    public Customer createCustomer(Customer customer) {
        return null;
    }

    @Override
    public List<Customer> readCustomer() {
        return null;
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
        return null;
    }
}
