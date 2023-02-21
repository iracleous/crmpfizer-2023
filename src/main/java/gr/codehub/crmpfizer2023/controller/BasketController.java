package gr.codehub.crmpfizer2023.controller;

import gr.codehub.crmpfizer2023.dto.ProductDto;
import gr.codehub.crmpfizer2023.service.BasketService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@AllArgsConstructor
public class BasketController {

    private BasketService basketService;
    @GetMapping("/ping1")
    public String ping(){
        log.info("The end point ping has been used");
        return "ping";
    }
    @PostMapping("product")
    public ProductDto createProduct(@RequestBody ProductDto productDto){
        return basketService.createProduct( productDto);
    }

    @GetMapping("product")
    public  List<ProductDto> findProduct(String name){
        return basketService.findProduct(name);
    }

    @PostMapping("basket/customer/{customerId}")
    boolean createBasket(@PathVariable int customerId){
        return basketService.createBasket(customerId);
    }

    @PostMapping("basket/{basketId}/product/{productId}")
    boolean addProductToBasket(@PathVariable int productId, @PathVariable int basketId){
        return basketService.addProductToBasket(productId,   basketId);
    }

    @GetMapping ("basket/{basketId}")
    List<String> getBasketProductNames(@PathVariable int basketId){
        return basketService.getBasketProductNames(basketId);
    }


}
