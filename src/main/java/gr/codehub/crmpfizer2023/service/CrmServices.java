package gr.codehub.crmpfizer2023.service;

import gr.codehub.crmpfizer2023.dto.CustomerDto;
import gr.codehub.crmpfizer2023.exception.CrmException;
import gr.codehub.crmpfizer2023.model.Customer;

import java.util.List;

public interface CrmServices {

      // Customer CRUD
    CustomerDto createCustomer(CustomerDto customer);
    List<CustomerDto>  readCustomer();
    List<CustomerDto> readCustomerByEmailNativeService(String match);
    CustomerDto readCustomer(int id) throws CrmException;
    boolean updateCustomer(CustomerDto customer, int id);
    boolean deleteCustomer(int id) ;

    String ping();
 }
