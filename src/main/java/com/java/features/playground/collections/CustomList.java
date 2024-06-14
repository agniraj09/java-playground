package com.java.features.playground.collections;

import java.util.*;

public class CustomList<E> extends ArrayList<E> {

    @Override
    public boolean add(E element) {
        return !this.contains(element) && super.add(element);

    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        List<E> input = new ArrayList<>((List<E>) new LinkedHashSet<>(c).stream().toList());
        input.removeAll(this);
        return super.addAll(input);
    }
}
