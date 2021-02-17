package com.solomonzelenko.getorders.services;

import com.solomonzelenko.getorders.models.Payment;
import com.solomonzelenko.getorders.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "paymentServices")
public class PaymentServiceImpl implements PaymentServices
{
    @Autowired
    private PaymentRepository paymentrepos;

    @Transactional
    @Override
    public Payment save(Payment payment){
        return paymentrepos.save(payment);
    }
}