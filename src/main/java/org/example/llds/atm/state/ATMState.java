package org.example.llds.atm.state;

import org.example.llds.atm.enums.ATMStatus;
import org.example.llds.atm.model.Card;

public interface ATMState {

    void insertCard(Card card);
    void enterPin(String pin);
    void selectOption(String option);
    void dispenseCash(double amount);
    void ejectCard();
    ATMStatus getStatus();
}
