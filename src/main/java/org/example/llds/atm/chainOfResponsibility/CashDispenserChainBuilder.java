package org.example.llds.atm.chainOfResponsibility;

public class CashDispenserChainBuilder {

    public static CashDispenser buildChain(){
        CashDispenser d1 = new TwoThouDispenser();
        CashDispenser d2 = new FiveHundDispenser();
        CashDispenser d3 = new OneHundDispenser();

        d1.setNextDispenser(d2);
        d2.setNextDispenser(d3);
        return d1;
    }
}
