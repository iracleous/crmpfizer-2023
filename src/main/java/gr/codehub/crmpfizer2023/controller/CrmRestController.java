package gr.codehub.crmpfizer2023.controller;

import gr.codehub.crmpfizer2023.dto.CustomerDto;
import gr.codehub.crmpfizer2023.exception.CrmException;
import gr.codehub.crmpfizer2023.service.CrmServices;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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

    @GetMapping("/Customer")
    public List<CustomerDto> getCustomerDto(){
        log.info("The end point CustomerDto has been used");
      return crmServices.readCustomer();
    }

    @GetMapping("/Customer/{id}")
    public CustomerDto getCustomerDto(@PathVariable(name="id") int id) throws CrmException {
        log.info("The end point CustomerDto has been used");
        return crmServices.readCustomer(id);
    }

    @PostMapping("/Customer")
    public  CustomerDto createCustomerDto(@RequestBody CustomerDto CustomerDto){
        log.info("The end point product has been used");
        return crmServices.createCustomer(CustomerDto);
    }

    @PutMapping("/Customer/{id}")
    public boolean updateCustomerDto(@RequestBody CustomerDto CustomerDto,
                                  @PathVariable(name="id") int id){
        return crmServices.updateCustomer(CustomerDto, id);
    }

    @DeleteMapping("/Customer/{id}")
    public boolean deleteCustomerDto(@PathVariable(name="id") int id){
        return crmServices.deleteCustomer(id);
    }

}
