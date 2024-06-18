package com.java.features.playground.problems.whatsapp.custom_list;

import java.util.*;

public class CustomList<E> extends ArrayList<E> {

    @Override
    public boolean add(E element) {
        return !this.contains(element) && super.add(element);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        List<E> input = new ArrayList<>(c.stream().distinct().toList());
        input.removeAll(this);
        return super.addAll(input);
    }
}
