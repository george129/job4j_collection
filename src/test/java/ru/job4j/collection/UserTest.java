package ru.job4j.collection;

import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class UserTest {
    @Test
    public void whenAsc() {
        Set<User> users = new TreeSet<>();
        users.add(new User("Petr", 32));
        users.add(new User("Ivan", 31));
        Iterator<User> it = users.iterator();
        assertThat(it.next(), is(new User("Ivan", 31)));
        assertThat(it.next(), is(new User("Petr", 32)));
    }

    @Test
    public void whenComparePertVSIvan() {
        int rsl = new User("Petr", 32)
                .compareTo(
                        new User("Ivan", 31)
                );
        assertTrue(rsl>0);
    }

    @Test
    public void diffAge() {
        Set<User> users = new TreeSet<>();
        users.add(new User("User1", 18));
        users.add(new User("User1", 19));
        assertEquals(new User("User1", 18), ((TreeSet<User>) users).pollFirst());
        assertEquals(new User("User1", 19), ((TreeSet<User>) users).pollFirst());
    }
}