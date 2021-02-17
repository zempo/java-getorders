package com.solomonzelenko.getorders.repositories;

import com.solomonzelenko.getorders.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomersRepository extends CrudRepository<Customer, Long>
{
}