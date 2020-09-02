package ru.job4j.collection;

public class Task {
    private String number;
    private String description;

    public Task(String num, String descr) {
        number = num;
        description = descr;
    }

    public String getNumber() {
        return number;
    }
}
