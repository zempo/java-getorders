package com.solomonzelenko.getorders.services;

import com.solomonzelenko.getorders.models.Customer;
import com.solomonzelenko.getorders.repositories.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "customerServices")
public class CustomerServiceImpl implements CustomerServices
{
    @Autowired
    private CustomersRepository customersrepos;

    @Transactional
    @Override
    public Customer save(Customer customer) {
        return customersrepos.save(customer);
    }
}