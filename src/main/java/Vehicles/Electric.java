package Vehicles;
import Vehicles.Components.Component;
import Vehicles.Components.Engine;

public class Electric extends Car{

    public Electric(double price, String colour){
        super(price, colour);
        Component engine = new Engine("Siemens", "Electric");
        addComponent(engine);
    }


}
