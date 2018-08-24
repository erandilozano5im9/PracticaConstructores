/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Lanudo
 */
public abstract class telefonosAbs {
    
    public boolean encendido(boolean encendio){
        System.out.println(encendio);
        return encendio;
    }
    public String llamada(){
        System.out.println("bueno?");
        return "ok";
    }
    public String mensaje(String msj){
        System.out.println("llego?");
        return msj;
    }
    public boolean conectarIt(boolean con){
        System.out.println(con);
        return con;
    }
    public String foto(String fo){
        System.out.println("listo?");
        return fo;
    }
}
