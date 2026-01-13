package org.example.llds.atm.repository;

import org.example.llds.atm.enums.ATMStatus;
import org.example.llds.atm.model.ATM;

import javax.swing.text.html.Option;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ATMRepository {

    private Map<String, ATM> atms = new HashMap<>();

    public void save(ATM atm){
        atms.put(atm.getId(), atm);
    }

    public Optional<ATM> getById(String id){

        return Optional.ofNullable(atms.get(id));
    }

    public void updateATMStatusById(String id, ATMStatus newStatus){
        ATM atm = atms.get(id);
        atm.setAtmStatus(newStatus);
    }
}
