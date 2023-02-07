package gr.codehub.crmpfizer2023.controller;

import gr.codehub.crmpfizer2023.model.Product;
import gr.codehub.crmpfizer2023.service.CrmServices;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


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

    @GetMapping("/product")
    public Product getProduct(){
        log.info("The end point product has been used");
      return crmServices.getProduct();
    }

}
