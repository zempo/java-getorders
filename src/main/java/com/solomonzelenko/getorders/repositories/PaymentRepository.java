package com.solomonzelenko.getorders.repositories;

import com.solomonzelenko.getorders.models.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Long>
{
}