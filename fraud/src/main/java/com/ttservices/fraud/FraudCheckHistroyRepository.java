package com.ttservices.fraud;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FraudCheckHistroyRepository
        extends JpaRepository<FraudCheckHistory, Integer> {
}
