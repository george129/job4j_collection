package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String s0, String s1) {
        int cmp;
        for (int i = 0; i < Math.min(s0.length(), s1.length()); i++) {
            cmp = Character.compare(s0.charAt(i), s1.charAt(i));
            if (cmp != 0) {
                return cmp;
            } else if (i == Math.min(s0.length(), s1.length()) - 1 && cmp == 0) {
                return Integer.compare(s0.length(), s1.length());
            }
        }
        return 0;
    }
}
