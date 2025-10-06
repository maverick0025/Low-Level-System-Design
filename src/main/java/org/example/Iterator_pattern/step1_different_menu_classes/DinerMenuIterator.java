package org.example.Iterator_pattern.step1_different_menu_classes;

public class DinerMenuIterator implements Iterator {
    int position = 0;
    MenuItem[] menuItems;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(position >= menuItems.length || menuItems[position] == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }
}