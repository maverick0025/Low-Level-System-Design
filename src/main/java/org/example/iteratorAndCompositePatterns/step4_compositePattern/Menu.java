package org.example.iteratorAndCompositePatterns.step4_compositePattern;

import java.util.ArrayList;

public class Menu extends MenuComponent{
    String name;
    String description;
    ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
    /*
    menu and it's description are printed.
    Then, it's child if there is a sub menu component or just a menu item, that will be printed.
     */
    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", "+ getDescription());
        System.out.println("--------------------------------");
        for(MenuComponent menuComponent :menuComponents){
            menuComponent.print();
        }
    }
}
