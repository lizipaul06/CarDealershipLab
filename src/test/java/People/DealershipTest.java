package People;

import Vehicles.Car;
import Vehicles.Electric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DealershipTest {
    Customer customer;
    Car car;
    Dealership dealership;

    @Before
    public void before(){
        customer = new Customer(22, "Tom");
        car = new Electric(10, "Red");
        dealership = new Dealership(20, "Derick");

    }

    @Test
    public void hasMoney(){
        assertEquals(20, dealership.getMoney(), 0.01);
    }

    @Test
    public void canAddCar(){
        dealership.addCar(car);
        assertEquals(1, dealership.getCarsLength());
        assertTrue(dealership.checkHasCar(car));
    }

    @Test
    public void canBuyCar(){
        customer.addCar(car);
        dealership.buyCar(car, customer);

        assertEquals(1, dealership.getCarsLength());
        assertEquals(10, dealership.getMoney(), 0.01);
    }

    @Test
    public void canSellCar(){
        dealership.addCar(car);
        dealership.sellCar(car, customer);

        assertEquals(1, customer.getCarsLength());
        assertEquals(0, dealership.getCarsLength());
        assertEquals(12, customer.getMoney(), 0.01);
    }

}
