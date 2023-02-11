package gr.codehub.crmpfizer2023.controller;

import gr.codehub.crmpfizer2023.exception.CrmException;
import gr.codehub.crmpfizer2023.model.Customer;
import gr.codehub.crmpfizer2023.model.Product;
import gr.codehub.crmpfizer2023.service.CrmServices;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@AllArgsConstructor
@Slf4j
public class CrmRestController {

     private CrmServices crmServices ;

    @GetMapping("/ping")
    public String ping(){
        log.info("The end point ping has been used");
         return crmServices.ping();
    }

    @GetMapping("/customer")
    public List<Customer> getCustomer(){
        log.info("The end point customer has been used");
      return crmServices.readCustomer();
    }

    @GetMapping("/customer/{id}")
    public Customer getCustomer(@PathVariable(name="id") int id) throws CrmException {
        log.info("The end point customer has been used");
        return crmServices.readCustomer(id);
    }

    @PostMapping("/customer")
    public  Customer createCustomer(@RequestBody Customer customer){
        log.info("The end point product has been used");
        return crmServices.createCustomer(customer);
    }

    @PutMapping("/customer/{id}")
    public boolean updateCustomer(@RequestBody Customer customer,
                                  @PathVariable(name="id") int id){
        return crmServices.updateCustomer(customer, id);
    }

    @DeleteMapping("/customer/{id}")
    public boolean deleteCustomer(@PathVariable(name="id") int id){
        return crmServices.deleteCustomer(id);
    }

}
