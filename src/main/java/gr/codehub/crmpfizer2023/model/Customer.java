package gr.codehub.crmpfizer2023.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;


@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;

    private CustomerType customerType;
    private LocalDate registrationDate;

    @OneToMany(mappedBy = "customer")
    private List<Basket> baskets;

}
