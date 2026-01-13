package org.example.llds.atm.state;

import lombok.AllArgsConstructor;
import org.example.llds.atm.chainOfResponsibility.CashDispenser;
import org.example.llds.atm.chainOfResponsibility.CashDispenserChainBuilder;
import org.example.llds.atm.enums.ATMStatus;
import org.example.llds.atm.model.Card;
import org.example.llds.atm.service.ATMMachine;

@AllArgsConstructor
public class DispenseCashState implements ATMState{

    private final ATMMachine atmMachine;
    private final CashDispenser chain = CashDispenserChainBuilder.buildChain();

    @Override
    public void insertCard(Card card) {
        System.out.println("Transaction in progress...");
    }

    @Override
    public void enterPin(String pin) {
        System.out.println("Already authenticated");
    }

    @Override
    public void selectOption(String option) {
        System.out.println("Option already selected");
    }

    @Override
    public void dispenseCash(double amount) {
        System.out.println("Processing transaction...");

        //check if atmmachine has enough cash
        double cashAvailable = atmMachine.getAtm().getCashAvailable();
        double userBalance = atmMachine.getCurrentCard().getAccount().getBalance();

        if(cashAvailable <= amount){
            System.out.println("This Atm has insufficient cash. Hence can't dispense");
            this.ejectCard();
            return;
        }

        if(amount > userBalance){
            System.out.println("Insufficient account balance...");
        }

        if(chain.canDispense(this.atmMachine.getAtm(), amount)){
            //set remaining balance for account and also in current atm machine
            chain.dispense(this.atmMachine.getAtm(), amount);

            atmMachine.getCurrentCard().getAccount().setBalance(userBalance-amount);
            atmMachine.getAtm().setCashAvailable(cashAvailable-amount);

            ejectCard();
            System.out.println("Cash dispensed: "+ amount);
        }else{
            System.out.println("Cannot dispense cash due to unavailable denominations");
            ejectCard();
        }
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
