package gr.codehub.crmpfizer2023.dto;

import gr.codehub.crmpfizer2023.model.Customer;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
public class CustomerDto {
    private int id;
    private String name;
    private String email;
    private LocalDate registrationDate;

    public CustomerDto(Customer customer) {
        if (customer != null) {
            id = customer.getId();
            name = customer.getName();
            email = customer.getEmail();
            registrationDate = customer.getRegistrationDate();
        }
    }

    public Customer asCustomer() {
        Customer customer = new Customer();
        customer.setId(id);
        customer.setName(name);
        customer.setEmail(email);
        customer.setRegistrationDate(registrationDate);
        return customer;
    }

}
