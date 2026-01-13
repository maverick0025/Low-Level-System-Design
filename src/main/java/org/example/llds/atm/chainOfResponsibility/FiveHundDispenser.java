package org.example.llds.atm.chainOfResponsibility;

import org.example.llds.atm.model.ATM;

public class FiveHundDispenser implements CashDispenser{
    private CashDispenser next;

    @Override
    public void setNextDispenser(CashDispenser next) {
        this.next = next;
    }

    @Override
    public boolean canDispense(ATM atm, double amount) {
        int availableNotes = atm.getTwoThCount();
        int requiredNotes = Math.min(availableNotes, (int)amount/500);
        int remainder = (int) amount - requiredNotes*500;

        return remainder == 0 || next!=null && next.canDispense(atm, remainder);
    }

    @Override
    public void dispense(ATM atm, double amount) {
        int availableNotes = atm.getTwoThCount();
        int requiredNotes = Math.min(availableNotes, (int)amount/500);
        atm.setFiveHundCount(availableNotes-requiredNotes);

        int remainder = (int) amount - requiredNotes*500;

        if(requiredNotes > 0){
            System.out.println("Dispensed "+ requiredNotes + " x 500");
        }

        if(remainder > 0 && next != null){
            next.dispense(atm, remainder);
        }
    }
}
