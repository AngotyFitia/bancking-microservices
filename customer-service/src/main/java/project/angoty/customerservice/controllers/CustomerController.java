package project.angoty.customerservice.controllers;

import project.angoty.customerservice.dtos.CustomerDTO;
import project.angoty.customerservice.services.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    public List<CustomerDTO> getCustomers() {
        return customerService.findAll();
    }

    @GetMapping("/customer/{id}")
    public CustomerDTO getCustomerById(@PathVariable Long id) {
        return customerService.findById(id);
    }
}






