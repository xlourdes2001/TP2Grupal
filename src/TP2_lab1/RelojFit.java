//metodos: cuentapasos(Coordenadas x,y), frecuenciaAleatoria
package TP2_lab1;

/**
 *
 * @author Lourdes
 */
public class RelojFit extends Reloj{
    private int[] coordenadas;

    public RelojFit(String numSerie, String modelo) {
        super(numSerie, modelo);
        this.coordenadas = new int[] {0,0};
    }
    
    public int cuentapasos(int x,int y){
        int distancia = (int)Math.sqrt((Math.pow((x-coordenadas[0]), 2))+ Math.pow(y-coordenadas[1], 2));
        coordenadas[0] = x;
        coordenadas[1] = y;
        return distancia;
        
                
    }
}
