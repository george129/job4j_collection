package ru.job4j.collection;

import java.util.Comparator;

public class JobCmpNameDesc implements Comparator<Job> {
    @Override
    public int compare(Job job0, Job job1) {
    return job1.getName().compareTo(job0.getName());
    }
}
