package ru.job4j.collection;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        List<String> ret = new ArrayList<>();
        Set<String> depSet = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();
        for (String dep: deps) {
            String[] d = dep.split("/");
            for (int i = 0; i < d.length; i++) {
                for (int j = 0; j <= i; j++) {
                    sb.append(d[j] + (i > 0 && j < i ? "/" : ""));
                }
                depSet.add(sb.toString());
                sb.delete(0, sb.length());
            }
        }
        depSet.toArray();
        ret.addAll(depSet);
        return ret;
    }

    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs);
    }

    public static void sortDesc(List<String> orgs) {
        Collections.sort(orgs, new DepDescComp());
        //ArrayList.get(i).then ArrayList.size
    }
}
