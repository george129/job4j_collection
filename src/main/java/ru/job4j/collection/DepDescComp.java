package ru.job4j.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        List<String> left = new ArrayList<>();
        List<String> right = new ArrayList<>();
        left.addAll(Arrays.asList(o1.split("/")));
        right.addAll(Arrays.asList(o2.split("/")));
        if (left.size() == 0 && right.size() == 0) {
            return 0;
        }
        int minsize = Math.min(left.size(), right.size());
        for (int i = 0; i < minsize; i++) {
            int cmp = left.get(i).compareTo(right.get(i));
            if (cmp != 0) {
                return cmp;
            } else if (i == minsize - 1) {
                return Integer.compare(left.size(), right.size());
            }
// else {
//                return Integer.compare(left, )
//            }
        }
        return 0;
    }
}