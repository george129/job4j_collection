package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    private int getNumbersPart(String s) {
        String test = s.split("\\b\\p{P}")[0];
        if (s.length() == 0 || test.length() == 0) {
            return -1;
        }
        try {
            return Integer.parseInt(test);
        } catch (NumberFormatException nfe) {
            return -1;
        }
    }

    @Override
    public int compare(String left, String right) {
        int intLeft = getNumbersPart(left);
        int intRight = getNumbersPart(right);
        if (intLeft < 0 || intRight < 0) {
            return left.compareTo(right);
        }
        return Integer.compare(intLeft, intRight);
    }
}