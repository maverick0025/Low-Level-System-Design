package org.example.iteratorAndCompositePatterns.step3_mergeCafeMenu;


import java.util.Calendar;
import java.util.Iterator;

public class AlternatingDInerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] items;
    int position =0;

    public AlternatingDInerMenuIterator(MenuItem[] items, int position) {
        this.items = items;
        this.position = Calendar.DAY_OF_WEEK%2; //we wanna change menu every 2 days
    }

    @Override
    public boolean hasNext() {
        if(position >= items.length || items[position] == null){
            return false;
        }
        return true;
    }

    @Override
    public MenuItem next() {
        MenuItem item = items[position];
        position++;
        return item;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException(
                "Alternating Diner Menu Iterator doesn't support remove");
    }
}
