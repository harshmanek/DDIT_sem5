/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractinterfacedemo;

/**
 *
 * @author harsh
 */
public class Car extends Vehicle {

    public Car(String model, Engine engine) {
        super(model, engine);
    }

    @Override
    public void drive() {
        System.out.println("Driving a car: " + getModel());
    }
}
