package com.example.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Component
//@Service
//@RestController
//@Repository
@ConditionalOnProperty(name = "payment.provider", havingValue = "razorpay")
public class RazorPayPaymentService implements PaymentService{

    @Override
    public String pay(){
        String payment = "Razorpay payment";
        System.out.println("Paying from......" + payment);
        return payment;
    }
}
