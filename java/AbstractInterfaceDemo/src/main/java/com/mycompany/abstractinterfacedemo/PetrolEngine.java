/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractinterfacedemo;

/**
 *
 * @author harsh
 */
public class PetrolEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Petrol engine starting...");
    }

    @Override
    public void stop() {
        System.out.println("Petrol engine stopping...");
    }

}
