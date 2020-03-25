package Vehicles.Components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {

    Tyre tyre;

    @Before
    public void before(){
        tyre = new Tyre("Toyota", "Winter");
    }

    @Test
    public void hasMade() {
        assertEquals("Toyota", tyre.getMake());
    }
    @Test
    public void canSetMade() {
        tyre.setMake("Honda");
        assertEquals("Honda", tyre.getMake());
    }
    @Test
    public void hasType() {
        assertEquals("Winter", tyre.getType());
    }
    @Test
    public void canSetType() {
        tyre.setType("CrossCountry");
        assertEquals("CrossCountry", tyre.getType());
    }
}
