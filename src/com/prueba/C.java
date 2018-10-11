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
public class C extends A{
     public void foo( String s){
        System.out.println("C");
    }
     @Override
     public void comprobar(A a){
         try {

         
        }
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }  
     }
}
