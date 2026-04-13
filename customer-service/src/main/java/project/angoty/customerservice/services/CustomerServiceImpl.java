package project.angoty.customerservice.services;

import project.angoty.customerservice.dtos.CustomerDTO;
import project.angoty.customerservice.entities.Customer;
import project.angoty.customerservice.mappers.CustomerMapper;
import project.angoty.customerservice.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    public CustomerServiceImpl(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    @Override
    public List<CustomerDTO> findAll() {
        return customerRepository.findAll()
                .stream()
                .map(customerMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CustomerDTO findById(Long id) {
        Customer customer = customerRepository.findById(id).orElse(null);
        return customer != null ? customerMapper.toDTO(customer) : null;
    }
}
