package org.example.patterns.templatePattern;

import java.util.AbstractList;

public class CustomList extends AbstractList<String> {
    private String[] myList;

    public CustomList() {
        this.myList = new String[]{"asd", "asdf", "hfds"};
    }

    @Override
    public String get(int index) {

        return myList[index];
    }

    @Override
    public int size() {
        return myList.length;
    }

    public String set(int index, String item){ // custom method for our list

        // returns the replaced string
        String old = myList[index];
        myList[index] = item;
        return old;
    }
    //can also call the other already implemented methods (like sublist) (sublist is implemented in Abstract class) when we are using the object of this CustomList class.
}
