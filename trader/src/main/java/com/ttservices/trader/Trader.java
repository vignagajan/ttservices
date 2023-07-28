package com.ttservices.trader;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Trader {

    private String Id;
    private String firstname;
    private String lastname;
    private String email;
}
