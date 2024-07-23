package com.java.features.playground.problems.whatsapp.custom_list;

import java.util.*;
import java.util.function.Predicate;

public class CustomList<E> extends ArrayList<E> {

    @Override
    public boolean add(E element) {
        return !this.contains(element) && super.add(element);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return super.addAll(c.stream().filter(Predicate.not(this::contains)).toList());
    }
}
