package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Peter");
        names.add("Ivan");
        names.add("Stepan");
        for (String x: names) {
            System.out.println(x);
        }
    }
}
