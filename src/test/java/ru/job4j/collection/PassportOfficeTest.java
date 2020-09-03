package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PassportOfficeTest {

    @Test
    public void add() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport()), is(citizen));
    }

    @Test
    public void addFalse() {
        PassportOffice po = new PassportOffice();
        po.add(new Citizen("123456", "Ivan Sidorov"));
        po.add(new Citizen("123457", "Nikifor"));
        assertEquals(false, po.add(new Citizen("123456", "Any Name")));
        assertEquals(false, po.add(new Citizen("123457", "Any Name")));
    }

    @Test
    public void get() {
        PassportOffice po = new PassportOffice();
        po.add(new Citizen("123456 1234", "Ivan Ivanych"));
        po.add(new Citizen("123654 4321", "Ivan Sidorovich"));
        System.out.println(po.get("123456 1234").getUsername());
        System.out.println(po.get("123654 4321").getUsername());
        assertEquals("Ivan Ivanych", po.get("123456 1234").getUsername());
        assertEquals("Ivan Sidorovich", po.get("123654 4321").getUsername());
        assertEquals(null, po.get("1234"));
    }

}