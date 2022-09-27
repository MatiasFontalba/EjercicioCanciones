
package com.mycompany.ejerciciomusica;
import DTO.Canciones;
/**
 *
 * @author Cetecom
 */
public class Main {

    public static void main(String[] args) {
        
        Canciones Cancion = new Canciones();
        
        Cancion.setTitulo("Uwu");
        Cancion.setArtista("Pancho");
        Cancion.setDuracion(200);
        Cancion.setTiempoActual(1);
        Cancion.setEsFavorita(true);
        Cancion.setEsDescargada(true);
        
        System.out.println(Cancion.toString());
        System.out.println(Cancion.getLargoCancion());
        //tiempo inicial
        System.out.println(Cancion.getTiempoActual());
        
        //adelanto
        Cancion.adelantaCancion(80);
        //obtengo nuevo tiempo
        System.out.println(Cancion.getTiempoActual());
        
        
    }
    
}
