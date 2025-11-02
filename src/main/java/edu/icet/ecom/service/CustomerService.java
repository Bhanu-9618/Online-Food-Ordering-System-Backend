package edu.icet.ecom.service;

import edu.icet.ecom.model.Dto.CustomerDto;
import edu.icet.ecom.model.Entity.CustomerEntity;
import edu.icet.ecom.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public void saveCustomer(CustomerDto customerDto) {
        CustomerEntity customerEntity = new CustomerEntity(
                customerDto.getName(),
                customerDto.getEmail(),
                customerDto.getPassword(),
                customerDto.getAddress(),
                customerDto.getContactno()
        );
        customerRepository.save(customerEntity);
    }
}
