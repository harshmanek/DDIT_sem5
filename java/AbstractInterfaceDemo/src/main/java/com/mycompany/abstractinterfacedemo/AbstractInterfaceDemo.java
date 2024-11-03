/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.abstractinterfacedemo;

/**
 *
 * @author harsh
 */
public class AbstractInterfaceDemo {

    public static void main(String[] args) {
        Engine petrolEngine = new PetrolEngine();
        Engine electricEngine = new ElectricEngine();

        Vehicle car = new Car("Sedan", petrolEngine);
        Vehicle bike = new Bike("Mountain Bike", electricEngine);
        
        
        System.out.println("Jeel Pansuriya H4 IT075");
        car.startEngine();
        car.drive();
        car.stopEngine();

        bike.startEngine();
        bike.drive();
        bike.stopEngine();
    }
}
