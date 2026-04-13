package project.angoty.customerservice.mappers;

import project.angoty.customerservice.dtos.CustomerDTO;
import project.angoty.customerservice.entities.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {
    public CustomerDTO toDTO(Customer customer) {
        return new CustomerDTO(
                customer.getId(),
                customer.getFirstName(),
                customer.getLastName(),
                customer.getEmail()
        );
    }

    public Customer toEntity(CustomerDTO dto) {
        if (dto == null) return null;
        return new Customer(null, dto.getFirstName(), dto.getLastName(), dto.getEmail());
    }
}
