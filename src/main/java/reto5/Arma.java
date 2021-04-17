/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5;



 
public class Arma {
    //CONSTRUCTORES
    public Arma(int identificadorUnico, String nombre, float puntajeDeEfectividadDeAtaque, float puntajeDeMagnitudDeDefenza) {
        this.identificadorUnico = identificadorUnico;
        this.nombre = nombre;
        this.puntajeDeEfectividadDeAtaque = puntajeDeEfectividadDeAtaque;
        this.puntajeDeMagnitudDeDefenza = puntajeDeMagnitudDeDefenza;
    }
    
    
    // ATRIBUTOS
    private int identificadorUnico;
    private String nombre;
    private float puntajeDeEfectividadDeAtaque;
    private float puntajeDeMagnitudDeDefenza;

    public int getIdentificadorUnico() {
        return identificadorUnico;
    }

    public void setIdentificadorUnico(int identificadorUnico) {
        this.identificadorUnico = identificadorUnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPuntajeDeEfectividadDeAtaque() {
        return puntajeDeEfectividadDeAtaque;
    }

    public void setPuntajeDeEfectividadDeAtaque(float puntajeDeEfectividadDeAtaque) {
        this.puntajeDeEfectividadDeAtaque = puntajeDeEfectividadDeAtaque;
    }

    public float getPuntajeDeMagnitudDeDefenza() {
        return puntajeDeMagnitudDeDefenza;
    }

    public void setPuntajeDeMagnitudDeDefenza(float puntajeDeMagnitudDeDefenza) {
        this.puntajeDeMagnitudDeDefenza = puntajeDeMagnitudDeDefenza;
    }
    
    
    //METODOS
    
    
}
