package org.springlearning.beans;

import org.springframework.stereotype.Component;

//@Component is a generic stereotype annotation
@Component
public class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello(){
        System.out.println("Printing Hello from Component Vehicle Bean");
    }
}
