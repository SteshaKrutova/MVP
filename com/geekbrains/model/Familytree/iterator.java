package com.geekbrains.model.Familytree;


import com.geekbrains.model.human.Human;

import java.util.Iterator;
import java.util.List;

public class iterator implements  Iterator<Human> {
    private int index;
    private List<Human> family;

    public iterator(List<Human> family) {
        this.family = family;
    }

    @Override
    public boolean hasNext() {
        return index < family.size();
    }

    @Override
    public Human next() {
        return family.get(index++);
    }
}
