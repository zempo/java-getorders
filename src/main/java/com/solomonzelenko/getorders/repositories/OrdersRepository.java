package com.solomonzelenko.getorders.repositories;

import com.solomonzelenko.getorders.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepository extends CrudRepository<Order, Long>
{
}