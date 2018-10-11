/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba;

/**
 *
 * @author administrador.pc
 */
public class A {
    public void foo( Object o){
        System.out.println("A");
    }
    public void comprobar(A a){
        try {
            int x=3/0;
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }  
    }
}
