package org.example.template_pattern.sorting;

import java.util.Arrays;

public class TestDuck {

    public static void main(String[] args) {
        Duck[] ducks = {new Duck("balu", 930),
                new Duck("soorigadu", 230),
                new Duck("appigaadu", 130),
                new Duck("pandhi gaadu", 320),
                new Duck("chintu gaadu", 390),
        };

        System.out.println("Before sorting: \n");
        displayDucks(ducks);
        Arrays.sort(ducks);
        System.out.println("After sorting: \n");
        displayDucks(ducks);
    }
    private static void displayDucks(Duck[] ducks){
        for(Duck d: ducks){
            System.out.println(d);
        }
    }
}
