package com.ttservices.trader;
import com.ttservices.trader.TraderService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/traders")
@AllArgsConstructor
public class TraderController{

    private final TraderService traderService;
    @PostMapping
    public void registerTrader(@RequestBody TraderRegReq traderRequest){
        log.info("New trader registration: {}",traderRequest);
        traderService.register(traderRequest);
    }
}
