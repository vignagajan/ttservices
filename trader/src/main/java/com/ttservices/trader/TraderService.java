package com.ttservices.trader;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class TraderService {

    private final TraderRepository traderRepository;
    private final RestTemplate restTemplate;
    public void register(TraderRegReq request){
        Trader trader = Trader.builder()
                .firstname(request.firstName())
                .lastname(request.lastName())
                .email(request.email())
                .build();
        // TODO: Validation
        traderRepository.saveAndFlush(trader);

        FraudCheckResponse fraudCheckResponse = restTemplate.getForObject(
                "http://FRAUD/api/v1/fraud-check/{customerId}",
                FraudCheckResponse.class,
                trader.getId()
        );

        if (fraudCheckResponse.isFraudster()){
            throw new IllegalStateException();
        }

    }
}
