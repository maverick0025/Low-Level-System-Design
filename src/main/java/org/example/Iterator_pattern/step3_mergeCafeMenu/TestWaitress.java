package org.example.Iterator_pattern.step3_mergeCafeMenu;

public class TestWaitress {
    public static void main(String[] args) {


        WaitressAkaClient waitress = new WaitressAkaClient(new PancakeHouseMenu(),
                new DinerMenu(), new CafeMenu());

        //uses implicit iterator aka getMenuItems from Each Menu classes instead of iterator
        waitress.printMenu_implicitIteration();
        System.out.println();
        System.out.println("__________Now look at printing using iterator___________");
        System.out.println();

        waitress.printMenu_usingIterator();
    }
}
