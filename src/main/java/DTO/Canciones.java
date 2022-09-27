/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

public class Canciones {
    private String Titulo;
    private String Artista;
    private int Duracion;
    private boolean esFavorita;
    private boolean esDescargada;
    private int TiempoActual;
  
  
  public Canciones(){
      this.Titulo="";
      this.Artista="";
      this.Duracion=0;
      this.esFavorita=false;
      this.esDescargada=false;
      this.TiempoActual = 1; 
      
  }

    public Canciones(String Titulo, String Artista, int Duracion, boolean esFavorita, boolean esDescargada, int TiempoActual) {
        this.Titulo = Titulo;
        this.Artista = Artista;
        this.Duracion = Duracion;
        this.esFavorita = esFavorita;
        this.esDescargada = esDescargada;
        this.TiempoActual = TiempoActual;
    }

    public int getTiempoActual() {
        return TiempoActual;
    }

    public void setTiempoActual(int TiempoActual) {
        this.TiempoActual = TiempoActual;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String Artista) {
        this.Artista = Artista;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }

    public boolean isEsFavorita() {
        return esFavorita;
    }

    public void setEsFavorita(boolean esFavorita) {
        this.esFavorita = esFavorita;
    }

    public boolean isEsDescargada() {
        return esDescargada;
    }

    public void setEsDescargada(boolean esDescargada) {
        this.esDescargada = esDescargada;
    }

    public String getLargoCancion() {
        if (this.Duracion > 300){
            return "La cancion es larga";
        }
        return "La cancion es corta";
    }
    
    public void adelantaCancion(int Segundos) {
        if (Segundos <= this.Duracion){
            this.TiempoActual = this.TiempoActual + Segundos;
        }
        
    }

    @Override
    public String toString() {

        String Descargada = "";
        String Favorito = "";

        if (this.esDescargada){
            Descargada = "Esta descargada";
        }
        else
        {
            Descargada = "No esta descargada";
        }

        if (this.esFavorita){
            Favorito = "Marcado como favorito";
        }
        else
        {
            Favorito = "No esta marcado como favorito";
        }

        return "Canciones:" + "Titulo= " + Titulo + ", Artista= " + Artista + ", Duracion= " + Duracion/60 + "min., esFavorita= " + Favorito + ", esDescargada= " + Descargada ;
    }


   
}
