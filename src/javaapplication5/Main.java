/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main(String[] args){
        Cuenta cuenta = new Cuenta(1, 123, "f", 100);
        
        Cuenta.global = 50;
        
        System.out.println("Global: " + Cuenta.global + '\n');
        
        System.out.println("Numero: " + cuenta.getNumero());
        System.out.println("Clave: " + cuenta.getClave());
        System.out.println("Dueno: " + cuenta.getDueno());
        System.out.println("Saldo: " + cuenta.getSaldo());
        
        cuenta.setClave(3484);
        
        System.out.println("Clave: " + cuenta.getClave());
    }
}
