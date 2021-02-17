package com.solomonzelenko.getorders.services;

import com.solomonzelenko.getorders.models.Customer;
import com.solomonzelenko.getorders.views.OrderCount;
import java.util.List;

public interface CustomerServices
{
    public Customer save(Customer customer);

    List<Customer> findAllCustomersOrders();

    Customer findCustomerById(long custcode);
    List <Customer> findCustomerByLikeName(String likename);

    List<OrderCount> getOrderCount();
}