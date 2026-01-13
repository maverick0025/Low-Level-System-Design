package org.example.llds.atm.state;

import lombok.AllArgsConstructor;
import org.example.llds.atm.enums.ATMStatus;
import org.example.llds.atm.model.Card;
import org.example.llds.atm.service.ATMMachine;

@AllArgsConstructor
public class CardInsertedState implements ATMState{
    private ATMMachine atmMachine;

    @Override
    public void insertCard(Card card) {
        System.out.println("Card already inserted");
    }

    @Override
    public void enterPin(String pin) {
        System.out.println("Enter Pin");
    }

    @Override
    public void selectOption(String option) {
        System.out.println("Enter PIN first...");
    }

    @Override
    public void dispenseCash(double amount) {
        System.out.println("Enter PIN first...");
    }

    @Override
    public void ejectCard() {
        atmMachine.setCurrentCard(null);
        System.out.println("Card ejected...");
        atmMachine.setState(new IdleState(this.atmMachine));
    }

    @Override
    public ATMStatus getStatus() {
        return ATMStatus.CARD_INSERTED;
    }
}