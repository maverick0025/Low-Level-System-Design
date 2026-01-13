package org.example.llds.atm;

import org.example.llds.atm.enums.ATMStatus;
import org.example.llds.atm.model.ATM;
import org.example.llds.atm.model.Account;
import org.example.llds.atm.model.Card;
import org.example.llds.atm.repository.ATMRepository;
import org.example.llds.atm.service.ATMMachine;

public class Main {

    public static void main(String[] args) {
        Card card = new Card(
                "CARD123",
                "1234",
                new Account("ACC123", 5000)
        );

        ATM atm1 = new ATM("ATM1", 5, 5, 20);
        ATM atm2 = new ATM("ATM2", 0, 2, 5);

        ATMRepository atmRepository = new ATMRepository();
        atmRepository.save(atm1);
        atmRepository.save(atm2);

        ATMMachine atmMachine = new ATMMachine(atm1.getId(), atmRepository);

        atmMachine.insertCard(card);
        atmMachine.enterPin("1234");
        atmMachine.selectOption("WITHDRAW");
        atmMachine.dispenseCash(1400);
//        atmMachine.dispenseCash(1410);
    }
}
