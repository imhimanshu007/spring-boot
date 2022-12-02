package org.springlearning.beans;

public class Vehicle {
    private String name;

    public Vehicle(){
        System.out.println("Vehicle Constructor called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle name is : " + name;
    }
}
