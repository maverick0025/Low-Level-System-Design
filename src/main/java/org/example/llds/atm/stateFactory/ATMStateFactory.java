package org.example.llds.atm.stateFactory;

import org.example.llds.atm.enums.ATMStatus;
import org.example.llds.atm.service.ATMMachine;
import org.example.llds.atm.state.*;

public class ATMStateFactory {

    public static ATMState getState(ATMStatus atmStatus, ATMMachine atmMachine){

        return switch(atmStatus){
            case IDLE -> new IdleState(atmMachine);
            case CARD_INSERTED -> new CardInsertedState(atmMachine);
            case AUTHENTICATED -> new AuthenticatedState(atmMachine);
            case DISPENSE_CASH -> new DispenseCashState(atmMachine);
            default -> throw new IllegalArgumentException("Unknown ATM Status" + atmStatus);
        };
    }
}
