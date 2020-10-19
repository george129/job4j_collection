package ru.job4j.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] left = o1.split("/");
        String[] right = o2.split("/");
        int cmp = right[0].compareTo(left[0]);
        return cmp == 0 ? o1.compareTo(o2) : cmp;
    }
}