package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("box1@maildomain.com", "Chehov Anton Palych");
        map.put("box2@maildomain.com", "Tolstoy Lev Nikolaevich");
        map.put("box3@maildomain.com", "Pushkin Alexandr Sergeich");
        map.put("box4@maildomain.com", "Gogol Nikolai Vasilievich");
        for (String key: map.keySet()) {
            System.out.println(map.get(key) + ": " + key);
        }
    }
}
