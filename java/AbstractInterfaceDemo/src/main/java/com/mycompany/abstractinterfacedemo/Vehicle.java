/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractinterfacedemo;

/**
 *
 * @author harsh
 */
public abstract class Vehicle {

    private String model;
    private Engine engine;

    public Vehicle(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public abstract void drive();

    public void startEngine() {
        engine.start();
    }

    public void stopEngine() {
        engine.stop();
    }

}
