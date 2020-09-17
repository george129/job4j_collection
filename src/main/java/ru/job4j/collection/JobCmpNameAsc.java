package ru.job4j.collection;

import java.util.Comparator;

public class JobCmpNameAsc implements Comparator<Job> {

    @Override
    public int compare(Job job0, Job job1) {
        return job0.getName().compareTo(job1.getName());
    }
}
