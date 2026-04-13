package project.angoty.customerservice.services;

import project.angoty.customerservice.dtos.CustomerDTO;
import java.util.List;

public interface CustomerService {
    List<CustomerDTO> findAll();
    CustomerDTO findById(Long id);
}

