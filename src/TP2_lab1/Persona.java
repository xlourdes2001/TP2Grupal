//Atributos: nombre,apellido,edad,altura, relojfit
//metodos: getnombre, get &set edad, hablar,comer, decirhora
package TP2_lab1;

/**
 *
 * @author Lourdes
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private double altura;
    private Reloj unreloj;

    public Persona(String nombre, String apellido, int edad, double altura, Reloj unreloj) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
        this.unreloj = unreloj;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void comer(){
        System.out.println("Estoy comiendo");
    }
    
    public void hablar(){
        System.out.println("Hola !!!");
    }

    public Reloj getUnreloj() {
        return unreloj;
    }
    
    
}
