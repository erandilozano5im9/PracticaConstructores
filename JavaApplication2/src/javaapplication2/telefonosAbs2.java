package javaapplication2;

/**
 *
 * @author Lanudo
 */
public abstract class telefonosAbs2 {
    public abstract void llamada();
}

class telefonos extends telefonosAbs {
    void llamada(){
        System.out.print("Bueno?");
    }
    public static void main(String args[]){  
    telefonosAbs obj = new telefonos();  
    obj.llamada();  
    }  
}