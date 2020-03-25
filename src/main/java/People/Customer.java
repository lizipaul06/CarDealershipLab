package People;
import Vehicles.Car;

public class Customer extends Person{


    public Customer(double money, String name){
        super(money, name);
    }



    public void buyCar(Car car, Person dealership) {
        if(dealership.checkHasCar(car)){

            decreaseMoney(car.getPrice());
            dealership.increaseMoney(car.getPrice());
            dealership.removeCar(car);
            addCar(car);
        }

    }

    public void sellCar(Car car, Person dealership) {
        cars.remove(car);
        increaseMoney(car.getPrice());
        dealership.decreaseMoney(car.getPrice());
        dealership.addCar(car);
    }
}
