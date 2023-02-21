package gr.codehub.crmpfizer2023.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@Entity
public class ProductBasket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Basket basket;
    @ManyToOne
    private Product product;
    private int Quantity;
    private BigDecimal unitPrice;
}
