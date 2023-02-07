package gr.codehub.crmpfizer2023.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Setter
@Getter
public class Product {
    private String name;
    private int code;
    private String description;
    private BigDecimal price;
}
