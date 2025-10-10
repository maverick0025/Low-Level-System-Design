package org.example.iteratorAndCompositePatterns.step3_mergeCafeMenu;

import java.util.ArrayList;
import java.util.Iterator;

public class WaitressCompactAkaClient {
    ArrayList<MenuIteratorInterface> menus;

    public WaitressCompactAkaClient(ArrayList<MenuIteratorInterface> menus) {
        this.menus = menus;
    }

    public void printMenu_usingIterator(){
        Iterator<?> menuIterator= menus.iterator();
        while(menuIterator.hasNext()){
            MenuIteratorInterface menu = (MenuIteratorInterface)menuIterator.next();
            printMenuItems(menu.createIterator());
        }
    }

    private void printMenuItems(Iterator<?> iterator){
        while(iterator.hasNext()){
            MenuItem item = (MenuItem)iterator.next();
            System.out.print(item.getName() + ", ");
            System.out.print("$"+item.getPrice() + " --");
            System.out.println(item.getDescription() + " -- ");
        }
    }

}
