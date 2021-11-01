package com.phoebussoftware.technicalTest.service;

import com.phoebussoftware.technicalTest.DTO.CustomerDTO;
import com.phoebussoftware.technicalTest.model.CustomerEntity;
import com.phoebussoftware.technicalTest.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;


public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    //private  CustomerDTO customerDTO = new CustomerDTO();

   public void save(CustomerDTO customerDTO){
    customerRepository.save(CustomerEntity.builder().build());
   }
}
