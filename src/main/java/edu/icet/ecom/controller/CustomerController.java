package edu.icet.ecom.controller;

import edu.icet.ecom.model.Dto.CustomerDto;
import edu.icet.ecom.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/save")
    public void saveCustomers(@RequestBody CustomerDto customerDto){
        customerService.saveCustomer(customerDto);



    }
}
