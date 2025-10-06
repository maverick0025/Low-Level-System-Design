package org.example.Iterator_pattern.step2_implicit_and_iterator_iteration_same_menu_classes;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
