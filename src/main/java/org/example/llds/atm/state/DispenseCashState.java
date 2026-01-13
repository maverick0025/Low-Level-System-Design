package org.example.llds.atm.state;

import lombok.AllArgsConstructor;
import org.example.llds.atm.enums.ATMStatus;
import org.example.llds.atm.model.Card;
import org.example.llds.atm.service.ATMMachine;

@AllArgsConstructor
public class DispenseCashState implements ATMState{

    private final ATMMachine atmMachine;
    @Override
    public void insertCard(Card card) {

    }

    @Override
    public void enterPin(String pin) {

    }

    @Override
    public void selectOption(String option) {

    }

    @Override
    public void dispenseCash(double amount) {

    }

    @Override
    public void ejectCard() {

        atmMachine.setCurrentCard(null);
        System.out.println("Card ejected...");
        atmMachine.setState(new IdleState(this.atmMachine));
    }

    @Override
    public ATMStatus getStatus() {
        return ATMStatus.DISPENSE_CASH;
    }
}
