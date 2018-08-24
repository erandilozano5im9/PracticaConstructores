package javaapplication2;

/**
 *
 * @author Alumno
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        telefonos tel1 = new telefonos();
        tel1.setMarca("Samsung");
        tel1.setColor("negro");
        telefonos tel2 = new telefonos(15000,6609);
        telefonos tel3 = new telefonos("G1", true);
        telefonos tel4 = new telefonos("Erandi","Telcel","Juan M");
        telefonos tel5 = new telefonos(50,"Frontal");
        
        System.out.println("hola"); 
        System.out.println(tel1);
        System.out.println(tel2);
        System.out.println(tel3);
        System.out.println(tel4);
        System.out.println(tel5);
    }
    
}
