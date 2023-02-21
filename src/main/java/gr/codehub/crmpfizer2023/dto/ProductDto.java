package gr.codehub.crmpfizer2023.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class ProductDto {
    private int id;
    private String name;
    private String description;
    private BigDecimal price;
}
