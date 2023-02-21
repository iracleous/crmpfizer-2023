package gr.codehub.crmpfizer2023.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@Entity
public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate date;
    @ManyToOne
    private Customer customer;
    @ManyToOne
    private Employee employee;

    @OneToMany(mappedBy = "basket")
    private List<ProductBasket> productBaskets;
}
