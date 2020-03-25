package People;
import Vehicles.Car;


public class Dealership extends Person implements IDeal{


    public Dealership(double money, String name){
        super(money, name);
    }




    public void buyCar(Car car, Person customer) {
        if (customer.checkHasCar(car)) {
            cars.add(car);
            decreaseMoney(car.getPrice());
            customer.removeCar(car);
            customer.increaseMoney(car.getPrice());
        }


    }


    public void sellCar(Car car, Person customer) {
        if (checkHasCar(car)) {
            cars.remove(car);
            increaseMoney(car.getPrice());
            customer.addCar(car);
            customer.decreaseMoney(car.getPrice());
        }

    }



    public void repairCar(Car car){
        int damage = car.getDamage();
        money -= damage;
        car.repairCar();
    }
}
