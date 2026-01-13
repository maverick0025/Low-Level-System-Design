package org.example.llds.atm.chainOfResponsibility;

import org.example.llds.atm.model.ATM;

public class OneHundDispenser implements CashDispenser{
    private CashDispenser next;

    @Override
    public void setNextDispenser(CashDispenser next) {
        this.next = next;
    }

    @Override
    public boolean canDispense(ATM atm, double amount) {
        int availableNotes = atm.getTwoThCount();
        int requiredNotes = Math.min(availableNotes, (int)amount/100);
        int remainder = (int) amount - requiredNotes*100;

        return remainder == 0 ;
    }

    @Override
    public void dispense(ATM atm, double amount) {
        int availableNotes = atm.getTwoThCount();
        int requiredNotes = Math.min(availableNotes, (int)amount/100);
        atm.setOneHundCount(availableNotes-requiredNotes);

        int remainder = (int) amount - requiredNotes*100;

        if(requiredNotes > 0){
            System.out.println("Dispensed "+ requiredNotes + " x 100");
        }

        if(remainder > 0){
//            next.dispense(atm, remainder);
            throw new RuntimeException("Some read uncommitted happened in database and dirty reads are read");
        }
    }
}
