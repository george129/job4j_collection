package ru.job4j.collection;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class JobTest {
    @Test
    public void compareByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobCmpNameDesc().thenComparing(new JobCmpPriorityDesc());
        int rsl = cmpNamePriority.compare(
                new Job("task0", 0),
                new Job("task0", 1)
        );
        assertTrue(rsl > 0);
    }

    @Test
     public void compareByPriorityAsc() {
        List<Job> jl = Arrays.asList(
                new Job("test1", 1),
                new Job("test2", 5),
                new Job("test1", 0),
                new Job("test2", 2),
                new Job("test1", 3),
                new Job("test2", 6));
        Collections.sort(jl, new JobCmpNameAsc().thenComparing(new JobCmpPriorityAsc()));
        assertEquals(Arrays.asList(
                new Job("test1", 0),
                new Job("test1", 1),
                new Job("test1", 3),
                new Job("test2", 2),
                new Job("test2", 5),
                new Job("test2", 6)),
                jl);
    }

    @Test
    public void compareByPriorityDescThenNameDesc() {
        List<Job> jl = Arrays.asList(
                new Job("test1", 1),
                new Job("test2", 5),
                new Job("test1", 0),
                new Job("test2", 2),
                new Job("test1", 3),
                new Job("test2", 6));

        Collections.sort(jl, new JobCmpPriorityDesc().thenComparing(new JobCmpNameDesc()));
        assertEquals(Arrays.asList(
                new Job("test2",6),
                new Job("test2",5),
                new Job("test1",3),
                new Job("test2",2),
                new Job("test1",1),
                new Job("test1",0)),
                jl);
    }

    @Test
    public void compareByNameLength() {
        List<Job> jl = Arrays.asList(
                new Job("test", 3),
                new Job("test0", 6),
                new Job("test12", 3),
                new Job("test12345", 2));
        Collections.sort(jl, new JobCmpNameLenDesc());
        assertEquals(Arrays.asList(
                new Job("test12345", 2),
                new Job("test12", 3),
                new Job("test0", 6),
                new Job("test", 3)
                ),
                jl);
    }
}