package com.solomonzelenko.getorders.services;

import com.solomonzelenko.getorders.models.Customer;
import com.solomonzelenko.getorders.repositories.CustomersRepository;
import com.solomonzelenko.getorders.views.OrderCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<Customer> findAllCustomersOrders() {
        List<Customer> customerOrderList = new ArrayList<>();
        customersrepos.findAll().iterator().forEachRemaining(customerOrderList::add);


        return customerOrderList;
    }

    @Override
    public Customer findCustomerById(long custcode) {
        Customer customer = customersrepos.findById(custcode).orElseThrow(() -> new EntityNotFoundException());
        return customer;
    }

    @Override
    public List<Customer> findCustomerByLikeName(String likename) {
        List<Customer> customerList = customersrepos.findCustomerByCustnameContainingIgnoringCase(likename);
        return customerList;
    }

    @Override
    public List<OrderCount> getOrderCount() {
        List<OrderCount> orderCount = customersrepos.getOrderCount();
        return orderCount;
    }
}