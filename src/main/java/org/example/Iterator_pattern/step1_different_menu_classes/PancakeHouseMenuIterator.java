package org.example.Iterator_pattern.step1_different_menu_classes;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator{
    int position = 0;
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(position >= menuItems.size() || menuItems.get(position) == null) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem item = menuItems.get(position);
        position++;
        return item;
    }
}
