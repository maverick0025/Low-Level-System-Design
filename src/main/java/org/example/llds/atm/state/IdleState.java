package org.example.llds.atm.state;

import lombok.AllArgsConstructor;
import org.example.llds.atm.enums.ATMStatus;
import org.example.llds.atm.model.Card;
import org.example.llds.atm.service.ATMMachine;

@AllArgsConstructor
public class IdleState implements ATMState{
    private final ATMMachine atmMachine;

    @Override
    public void insertCard(Card card) {
        atmMachine.setCurrentCard(card);
        System.out.println("Card inserted...");
        atmMachine.setState(new CardInsertedState(this.atmMachine));
    }

    @Override
    public void enterPin(String pin) {
        System.out.println("No card inserted");
    }

    @Override
    public void selectOption(String option) {
        System.out.println("No card inserted");
    }

    @Override
    public void dispenseCash(double amount) {
        System.out.println("No card inserted");
    }

    @Override
    public void ejectCard() {
        System.out.println("No card inserted");
    }

    @Override
    public ATMStatus getStatus() {
        return ATMStatus.IDLE;
    }
}
