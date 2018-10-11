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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       A a= new C();
       a.foo("JAVA");
         C c= new C();
       c.foo("JAVA");
       B b= new D();
       b.foo(a);
       D d =new D();
       d.foo("JAVA");
       a.comprobar(c);
    }
    
}
