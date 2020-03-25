package Vehicles;

import Vehicles.Components.Component;
import Vehicles.Components.Engine;
import Vehicles.Components.Tyre;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class ElectricTest {

    Electric electric;
    Tyre tyre;
    Engine engine;


    @Before
    public void before(){
        electric = new Electric(200, "Blue");
        tyre = new Tyre ("Honda", "crossCountry");
    }

    @Test
    public void canGetPrice(){
        assertEquals(200, electric.getPrice(), 0.01);
    }

    @Test
    public void canSetPrice(){
        electric.setPrice(20);
        assertEquals(20, electric.getPrice(), 0.01);
    }
    @Test
    public void canGetColour(){
        assertEquals("Blue", electric.getColour());
    }

    @Test
    public void canSetColour(){
        electric.setColour("Pink");
        assertEquals("Pink", electric.getColour());
    }

    @Test
    public void containsEngine(){
        assertEquals(1, electric.numberOfComponents());
    }
    @Test
    public void canGetDamage(){
        assertEquals(0, electric.getDamage());
    }

    @Test
    public void canIncreaseDamage(){
        electric.increaseDamage(10);
        assertEquals(10, electric.getDamage());
        assertEquals(180.0, electric.getPrice(), 0.01);

    }

    @Test
    public void canRepairCar(){
        electric.increaseDamage(10);
        assertEquals(10, electric.getDamage());
        assertEquals(180.0, electric.getPrice(), 0.01);
        electric.repairCar();
        assertEquals(0, electric.getDamage());
        assertEquals(200.0, electric.getPrice(),0.01);
    }

    @Test
    public void canAddComponent(){
        electric.addComponent(tyre);
        assertEquals(2, electric.numberOfComponents());
    }
}






