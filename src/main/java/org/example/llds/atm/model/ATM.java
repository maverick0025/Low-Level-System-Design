package org.example.llds.atm.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.example.llds.atm.enums.ATMStatus;

@Getter
public class ATM {

    private String id;
    @Setter
    private ATMStatus atmStatus;
    private double cashAvailable;
    @Setter
    private int twoThCount;
    @Setter
    private int fiveHundCount;
    @Setter
    private int oneHundCount;

    public ATM(String id, int twoThCount, int fiveHundCount, int oneHundCount) {
        this.id = id;
        this.cashAvailable = 2000*twoThCount + 500*fiveHundCount + 100*oneHundCount;
        this.atmStatus = ATMStatus.IDLE;
        this.twoThCount = twoThCount;
        this.fiveHundCount = fiveHundCount;
        this.oneHundCount = oneHundCount;
    }
}
