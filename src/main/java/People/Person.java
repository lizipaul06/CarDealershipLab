package People;

import Vehicles.Car;

import java.util.ArrayList;

public abstract class Person {

    ArrayList<Car> cars;
    String name;
    double money;

    public Person(double money, String name){
        this.cars = new ArrayList<Car>();
        this.name = name;
        this.money = money;
    }

    public int getCarsLength() {
        return cars.size();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public double getMoney() {
        return money;
    }

    public void decreaseMoney(double price){
        money -= price;
    }

    public void increaseMoney(double price){
        money += price;
    }

    public boolean checkHasCar(Car car){
        return cars.contains(car);
    }
}
