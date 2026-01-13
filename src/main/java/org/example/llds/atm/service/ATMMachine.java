package org.example.llds.atm.service;

import lombok.Getter;
import lombok.Setter;
import org.example.llds.atm.enums.ATMStatus;
import org.example.llds.atm.model.ATM;
import org.example.llds.atm.model.Card;
import org.example.llds.atm.repository.ATMRepository;
import org.example.llds.atm.state.ATMState;
import org.example.llds.atm.state.IdleState;
import org.example.llds.atm.stateFactory.ATMStateFactory;

@Getter
public class ATMMachine implements ATMState {

    private final ATMRepository atmRepository;
    private ATM atm;
    private ATMState atmState;

    @Setter
    private Card currentCard;

    public ATMMachine(String atmId, ATMRepository atmRepository) {
        this.atmRepository = atmRepository;
        this.atm = atmRepository.getById(atmId).orElseThrow(()->new RuntimeException("ATM not found"));
        this.atmState = ATMStateFactory.getState(atm.getAtmStatus(), this);
    }

    @Override
    public void insertCard(Card card) {
        atmState.insertCard(card);
    }

    @Override
    public void enterPin(String pin) {
        atmState.enterPin(pin);
    }

    @Override
    public void selectOption(String option) {
        atmState.selectOption(option);
    }

    @Override
    public void dispenseCash(double amount) {
        atmState.dispenseCash(amount);
    }

    @Override
    public void ejectCard() {
        atmState.ejectCard();
    }

    @Override
    public ATMStatus getStatus() {
        return atmState.getStatus();
    }

    public void setState(ATMState newState){
        this.atmState=newState;
    }
}
