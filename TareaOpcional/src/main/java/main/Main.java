/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import control.Control;

/**
 *
 * @author Dalia Romero
 */
public class Main {
    
    public static void main(String args[]) {
       
        Control control = new Control();
        double salario = control.calcularSalario();

        System.out.println("salario"+salario);
    
    }
}
