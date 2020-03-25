package Vehicles;

import Vehicles.Components.Component;


import java.util.ArrayList;

public abstract class Car {

    private double price;
    private String colour;
    private int damage;
    private ArrayList<Component>  components;

    public Car(double price, String colour){
        this.price = price;
        this.colour = colour;
        this.components = new ArrayList<Component>();
        this.damage = 0;
    }

    public ArrayList<Component> getComponents() {
        return components;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getDamage() {
        return damage;
    }

    public void increaseDamage(int damage) {
        this.damage += damage;
        this.price -= (damage * 2);
    }

    public void repairCar() {
        this.price += (damage * 2);
        this.damage = 0;

    }

    public void addComponent(Component component){
        components.add(component);
    }

    public int numberOfComponents(){
        return components.size();
    }


}

