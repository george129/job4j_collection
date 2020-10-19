package ru.job4j.collection;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matcher.*;

public class DepDescCompTest {

    @Test
    public void compare() {
        int rsl = new DepDescComp().compare(
                "K2/SK1/SSK2",
                "K2/SK1/SSK1"
        );
        assertTrue(rsl>0);
    }

    @Test
    public void whenUpDepartmentGoBefore() {
        int rsl = new DepDescComp().compare(
                "K2",
                "K2/SK1"
        );
        assertTrue(rsl < 0);
    }

    @Test
    public void sameLengthDifferentFirst() {
        assertTrue(new DepDescComp().compare("K2/SK2", "K1/SK2") < 0);
    }
}