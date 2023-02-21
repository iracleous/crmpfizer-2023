package gr.codehub.crmpfizer2023.service;

import gr.codehub.crmpfizer2023.dto.CustomerDto;
import gr.codehub.crmpfizer2023.exception.CrmException;
import gr.codehub.crmpfizer2023.model.Customer;
import gr.codehub.crmpfizer2023.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CrmServImpl implements CrmServices {

    @Autowired
    private final CustomerRepository customerRepository;

    @Override
    public CustomerDto createCustomer(CustomerDto customerDto) {
        //validation
        Customer customer = customerDto.asCustomer();
        return new CustomerDto(customerRepository.save(customer));
    }

    @Override
    public List<CustomerDto> readCustomer() {
        return customerRepository
                .findAll()
                .stream()
                .map(CustomerDto::new)
                .collect(Collectors.toList());
    }

    @Override
    public List<CustomerDto> readCustomerByEmailNativeService(String match) {
        return customerRepository
                .findCustomerByEmailNative(match)
                .stream()
                //.map(c -> new CustomerDto(c))
                .map(CustomerDto::new)
                .collect(Collectors.toList());
    }

    @Override
    public CustomerDto readCustomer(int id) throws CrmException {
        return new CustomerDto(readCustomerDb(id));
    }

    private Customer readCustomerDb(int id) throws CrmException {
        Optional<Customer> customerOptional = customerRepository.findById(id);
        if (customerOptional.isPresent())
            return customerOptional.get();
        throw new CrmException("Customer not found id= " + id);
    }

    @Override
    public boolean updateCustomer(CustomerDto customer, int id) {
        boolean action;
        try {
            Customer dbCustomer = readCustomerDb(id);
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
            Customer dbCustomer = readCustomerDb(id);
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
