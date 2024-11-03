/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractinterfacedemo;

/**
 *
 * @author harsh
 */
public class ElectricEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Electric engine starting...");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine stopping...");
    }
}
