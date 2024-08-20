//Atributos: hora, dia, numserie,modelo
//Metodos: getdia, gethora, incrementardia, incrementarhora, limpiarPantalla
package TP2_lab1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 *
 * @author Lourdes
 */
public class Reloj {
    private LocalDate dia;
    protected LocalTime hora;
    protected String numSerie;
    protected String modelo;

    public Reloj(String numSerie, String modelo) {
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.dia = LocalDate.now();
        this.hora = LocalTime.now();
    }

    public LocalTime getHora() {
        return hora;
    }
    
    public void getDia(){
        DayOfWeek dianombre = dia.getDayOfWeek();
        Locale pais = new Locale("Es","AR");
        System.out.println(dianombre.getDisplayName(TextStyle.FULL, pais));
    }
    
    public void incrementarDia(int x){
     dia = dia.plusDays(x);
    }
    
    public void incrementarHora(int x){
        hora = hora.plusHours(x);
    }
    
    public void limpiarPantalla(){
        System.out.println("Limpiar pantalla.");
    }
    
}
