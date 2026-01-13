package org.example.llds.atm.chainOfResponsibility;

import org.example.llds.atm.model.ATM;

public interface CashDispenser {

    void setNextDispenser(CashDispenser next);
    boolean canDispense(ATM atm, double amount);
    void dispense(ATM atm, double amount);
}