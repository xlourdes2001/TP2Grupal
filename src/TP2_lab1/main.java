/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TP2_lab1;

/**
 *
 * @author Lourdes
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RelojFit reloj = new RelojFit("123","rolex");
        Persona p1 = new Persona("Lourdes","Escudero",22,1,reloj);
       
        
        //mostramos dia actual
        System.out.print("El dia es: ");
        p1.getUnreloj().getDia();
        
        //incrementamos el dia en uno
         System.out.print("El dia siguiente es: ");
        p1.getUnreloj().incrementarDia(1);
        p1.getUnreloj().getDia();
        
        //mostramos la hora actual
        System.out.print("La hora es: ");
         System.out.println(p1.getUnreloj().getHora());
        
        //incrementamos la hora actual en 3 horas
        p1.getUnreloj().incrementarHora(3);
        System.out.print("La hora incrementada en 3 horas es: ");
        System.out.println(p1.getUnreloj().getHora());
        
        //metodo limpiar pantalla
        p1.getUnreloj().limpiarPantalla();
        
        //probamos los metodos de RelojFit
        ((RelojFit) p1.getUnreloj()).cuentapasos(2, 2);
       
    }
    
}
