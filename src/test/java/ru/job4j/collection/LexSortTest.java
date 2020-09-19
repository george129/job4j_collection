package ru.job4j.collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import java.util.Arrays;
import java.util.Collections;

public class LexSortTest {
    @Test
    public void sortNum1and2and10() {
        String[] input = {
                "10. Task.",
                "1. Task.",
                "2. Task."
        };
        String[] out = {
                "1. Task.",
                "2. Task.",
                "10. Task."
        };
        Arrays.sort(input, new LexSort());
        assertEquals(input, out);
    }

    @Test
    public void emptyStringNoErrors() {
        Arrays.sort(new String[]{""}, new LexSort());
    }

    @Test
    public void stringsWithoutNumbers() {
        String[] s = {
          "Four",
          "And",
          "Hand"
        };
        Arrays.sort(s, new LexSort());
        assertEquals(new String[]{"And", "Four", "Hand"}, s);
    }
}