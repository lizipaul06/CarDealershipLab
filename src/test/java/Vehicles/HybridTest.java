package Vehicles;

import Vehicles.Components.Engine;
import Vehicles.Components.Tyre;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HybridTest {
    Hybrid hybrid;
    Tyre tyre;


    @Before
    public void before(){
        hybrid = new Hybrid(200, "Blue");
        tyre = new Tyre ("Honda", "crossCountry");
    }

    @Test
    public void canGetPrice(){
        assertEquals(200, hybrid.getPrice(), 0.01);
    }

    @Test
    public void canSetPrice(){
        hybrid.setPrice(20);
        assertEquals(20, hybrid.getPrice(), 0.01);
    }
    @Test
    public void canGetColour(){
        assertEquals("Blue", hybrid.getColour());
    }

    @Test
    public void canSetColour(){
        hybrid.setColour("Pink");
        assertEquals("Pink", hybrid.getColour());
    }

    @Test
    public void containsEngine(){
        assertEquals(1, hybrid.numberOfComponents());
    }
    @Test
    public void canGetDamage(){
        assertEquals(0, hybrid.getDamage());
    }

    @Test
    public void canIncreaseDamage(){
        hybrid.increaseDamage(10);
        assertEquals(10, hybrid.getDamage());
        assertEquals(180.0, hybrid.getPrice(), 0.01);

    }

    @Test
    public void canRepairCar(){
        hybrid.increaseDamage(10);
        assertEquals(10, hybrid.getDamage());
        assertEquals(180.0, hybrid.getPrice(), 0.01);
        hybrid.repairCar();
        assertEquals(0, hybrid.getDamage());
        assertEquals(200.0, hybrid.getPrice(),0.01);
    }

    @Test
    public void canAddComponent(){
        hybrid.addComponent(tyre);
        assertEquals(2, hybrid.numberOfComponents());
    }
}
