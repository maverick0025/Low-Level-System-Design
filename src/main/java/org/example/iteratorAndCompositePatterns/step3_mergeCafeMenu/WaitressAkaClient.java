package org.example.iteratorAndCompositePatterns.step3_mergeCafeMenu;

import java.util.Iterator;
import java.util.List;

public class WaitressAkaClient {
    MenuIteratorInterface pancakeHouseMenu;
    MenuIteratorInterface dinerMenu;
    MenuIteratorInterface cafeMenu;
    public WaitressAkaClient(MenuIteratorInterface pancakeHouseMenu, MenuIteratorInterface DinerMenu, MenuIteratorInterface CafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = DinerMenu;
        this.cafeMenu = CafeMenu;
    }

    public void printMenu_usingIterator(){

        Iterator<MenuItem> breakfastMenuIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> lunchMenuIterator = dinerMenu.createIterator();
        Iterator<MenuItem> cafeMenuIterator = cafeMenu.createIterator();

        System.out.println("My name is Vi, I'm your waitress today");
        System.out.println("*** Let me read out the Breakfast menu! ***");
        printMenuItems(breakfastMenuIterator);

        System.out.println("*** Let me read out the Lunch menu! ***");
        printMenuItems(lunchMenuIterator);

        System.out.println("*** Let me read out the Snacks menu! ***");
        printMenuItems(cafeMenuIterator);
    }

    private void printMenuItems(Iterator<MenuItem> menuItems) {
        while(menuItems.hasNext()){
            MenuItem item = menuItems.next();
            printMenuItem(item);
        }
    }

    //implicitIteration
    public void printMenu_implicitIteration(){
        List<MenuItem> breakfastMenuItems = ((PancakeHouseMenu) pancakeHouseMenu).getMenuItems();
        for(MenuItem item: breakfastMenuItems){
            printMenuItem(item);
        }

        MenuItem[] lunchMenuItems = ((DinerMenu) dinerMenu).getMenuItems();
        for(MenuItem item: lunchMenuItems){
            printMenuItem(item);
        }
    }

    public void printMenuItem(MenuItem item){
        System.out.print(item.getName() + ", ");
        System.out.print("$"+item.getPrice() + " --");
        System.out.println(item.getDescription() + " -- ");
    }

}
