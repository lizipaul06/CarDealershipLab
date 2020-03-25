package People;

import Vehicles.Car;
import Vehicles.Electric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CustomerTest {

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
        assertEquals(22, customer.getMoney(), 0.01);
    }

    @Test
    public void canAddCar(){
        customer.addCar(car);
        assertEquals(1, customer.getCarsLength());
        assertTrue(customer.checkHasCar(car));
    }

    @Test
    public void canBuyCar(){
        dealership.addCar(car);
        customer.buyCar(car, dealership);
        assertEquals(1, customer.getCarsLength());
        assertEquals(0, dealership.getCarsLength());
        assertEquals(12, customer.getMoney(), 0.01);
        assertEquals(30, dealership.getMoney(), 0.01);
    }

    @Test
    public void canSellCar(){
        customer.addCar(car);
        customer.sellCar(car, dealership);

        assertEquals(1, dealership.getCarsLength());
        assertEquals(0, customer.getCarsLength());
        assertEquals(10, dealership.getMoney(), 0.01);
    }

}
