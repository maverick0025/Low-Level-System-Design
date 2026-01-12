package org.example.patterns.iteratorAndCompositePatterns.step3_mergeCafeMenu;

import java.util.ArrayList;
import java.util.Arrays;

public class TestWaitressCompact {

    public static void main(String[] args) {


        WaitressCompactAkaClient waitress = new WaitressCompactAkaClient(
                new ArrayList<>(Arrays.asList( new PancakeHouseMenu(), new DinerMenu(), new CafeMenu()))
                );
        waitress.printMenu_usingIterator();
    }

}
