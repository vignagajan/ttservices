package com.ttservices.trader;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TraderService {

    private final TraderRepository traderRepository;
    public void register(TraderRegReq request){
        Trader trader = Trader.builder()
                .firstname(request.firstName())
                .lastname(request.lastName())
                .email(request.email())
                .build();
        // TODO: Validation
        traderRepository.save(trader);
    }
}
