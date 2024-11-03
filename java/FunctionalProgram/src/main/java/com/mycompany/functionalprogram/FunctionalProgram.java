/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.functionalprogram;

/**
 *
 * @author harsh
 */
interface Operation {

    float op(float a, float b);
}

public class FunctionalProgram {

    public static void main(String[] args) {
        Operation add = (n1, n2) -> {
            return (n1 + n2);
        };

        Operation mul = (n1, n2) -> {
            return (n1 * n2);
        };

        Operation div = (n1, n2) -> {
            return (n1 / n2);
        };

        Operation sub = (n1, n2) -> {
            return (n1 - n2);
        };

        float n1 = 20, n2 = 10;
        System.out.println("Jeel Pansuriya H4 IT075");
        System.out.println("Addtion: " + add.op(n1, n2));
        System.out.println("Subtraction: " + sub.op(n1, n2));
        System.out.println("Multiply: " + mul.op(n1, n2));
        System.out.println("Division: " + div.op(n1, n2));
//        add.method();
    }
}
