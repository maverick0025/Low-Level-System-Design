package org.example.llds.atm.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class Card {

    private String cardNumber;
    private String pin;
    private Account account;
}
