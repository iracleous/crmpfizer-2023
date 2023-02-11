package gr.codehub.crmpfizer2023.service;

import gr.codehub.crmpfizer2023.model.Customer;

import java.util.List;

public interface CrmServices {

      // Customer CRUD


    Customer createCustomer(Customer customer);
    List<Customer>  readCustomer();
    Customer readCustomer(int id);
    Customer updateCustomer(Customer customer, int id);
    boolean deleteCustomer(int id) ;

      String ping();
 }
