package org.example.Iterator_pattern.step2_implicit_and_iterator_iteration_same_menu_classes;

public class TestWaitress {
    public static void main(String[] args) {


        WaitressAkaClient waitress = new WaitressAkaClient(new PancakeHouseMenu(),
                new DinerMenu());

        //uses implicit iterator aka getMenuItems from Each Menu classes instead of iterator
        waitress.printMenu_implicitIteration();
        System.out.println();
        System.out.println("__________Now look at printing using iterator___________");
        System.out.println();

        waitress.printMenu_usingIterator();
    }
}
