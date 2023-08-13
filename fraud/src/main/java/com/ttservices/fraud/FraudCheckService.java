package com.ttservices.fraud;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class FraudCheckService {

    private final FraudCheckHistroyRepository fraudCheckHistroyRepository;

    public FraudCheckService(FraudCheckHistroyRepository fraudCheckHistroyRepository){
        this.fraudCheckHistroyRepository = fraudCheckHistroyRepository;
    }

    public boolean isFraudulentCustomer(Integer customerId){
        fraudCheckHistroyRepository.save(
                FraudCheckHistory.builder()
                        .customerId(customerId)
                        .IsFraudster(false)
                        .createdAt(LocalDateTime.now())
                        .build()
        );
        return false;
    }
}
