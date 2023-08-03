package com.ttservices.trader;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Trader {

    @Id
    @SequenceGenerator(
            name="trader_id_sequence",
            sequenceName = "trader_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "trader_id_sequence"
    )
    private Integer Id;
    private String firstname;
    private String lastname;
    private String email;
}
