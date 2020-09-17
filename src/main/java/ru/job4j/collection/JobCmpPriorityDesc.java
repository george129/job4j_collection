package ru.job4j.collection;

import java.util.Comparator;

public class JobCmpPriorityDesc implements Comparator<Job> {
    @Override
    public int compare(Job job0, Job job1) {
        return Integer.compare(job1.getPriority(), job0.getPriority());
    }
}
