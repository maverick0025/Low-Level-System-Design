package org.example.patterns.iteratorAndCompositePatterns.step3_mergeCafeMenu;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {

    MenuItem[] list;
    int position = 0;
    public DinerMenuIterator(MenuItem[] items) {
        this.list = items;
    }

    @Override
    public boolean hasNext() {
        if(position >= list.length || list[position] == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem item = list[position];
        position++;
        return item;
    }

    public void remove(){
        if(position <=0){
            throw new IllegalStateException("Need atleast one item in menu to exist to remove");
        }
        if(list[position-1] != null){
            for(int i = position-1; i< list.length-1; i++){
                list[i] = list[i+1];
            }
            list[list.length-1] = null;
        }
    }
}
