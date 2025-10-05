package org.example.Iterator_pattern;

public class TestWaitress {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        WaitressDiffMenuClasses waitressDiffMenuClasses = new WaitressDiffMenuClasses(pancakeHouseMenu, dinerMenu);
        waitressDiffMenuClasses.printMenu();
    }
}
