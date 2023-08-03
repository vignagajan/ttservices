package com.ttservices.trader;

public record TraderService(TraderRepository traderRepository) {

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
