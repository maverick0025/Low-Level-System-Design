package org.example.Iterator_pattern.step2_implicit_and_iterator_iteration_same_menu_classes;

import java.util.Iterator;
import java.util.List;

public class WaitressAkaClient {
    Menu pancakeHouseMenu;
    Menu dinerMenu;
    public WaitressAkaClient(Menu pancakeHouseMenu, Menu DinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = DinerMenu;
    }

    public void printMenu_usingIterator(){

        Iterator<MenuItem> breakfastMenuIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> lunchMenuIterator = dinerMenu.createIterator();

        printMenuItems(breakfastMenuIterator);
        printMenuItems(lunchMenuIterator);

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
