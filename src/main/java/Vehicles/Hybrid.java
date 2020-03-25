package Vehicles;

import Vehicles.Components.Component;
import Vehicles.Components.Engine;

public class Hybrid extends Car{


    public Hybrid(double price, String colour) {
        super(price, colour);
        Component engine = new Engine("Toyota", "Hybrid");
        addComponent(engine);
    }
}
