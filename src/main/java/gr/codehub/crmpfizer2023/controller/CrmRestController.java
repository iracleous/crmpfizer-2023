package gr.codehub.crmpfizer2023.controller;

import gr.codehub.crmpfizer2023.model.Customer;
import gr.codehub.crmpfizer2023.model.Product;
import gr.codehub.crmpfizer2023.service.CrmServices;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

    @PostMapping("/customer")
    public  Customer createCustomer(@RequestBody Customer customer){
        log.info("The end point product has been used");
        return crmServices.createCustomer(customer);
    }



}
