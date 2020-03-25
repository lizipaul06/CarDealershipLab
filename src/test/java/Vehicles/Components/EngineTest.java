package Vehicles.Components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {
    Engine engine;

    @Before
    public void before(){
        engine = new Engine("Toyota", "Strong");
    }

    @Test
    public void hasMade() {
        assertEquals("Toyota", engine.getMake());
    }
    @Test
    public void canSetMade() {
        engine.setMake("Honda");
        assertEquals("Honda", engine.getMake());
    }
    @Test
    public void hasType() {
        assertEquals("Strong", engine.getType());
    }
    @Test
    public void canSetType() {
        engine.setType("Weak");
        assertEquals("Weak", engine.getType());
    }

}

