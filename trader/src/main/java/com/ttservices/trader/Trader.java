package com.ttservices.trader;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

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
            generator = "trader_id_sequence",
    )
    private String Id;
    private String firstname;
    private String lastname;
    private String email;
}
