/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5;

import reto5.Arma;

public class AggArma {
    public AggArma(){
     this.listaDeArmas= new Arma[7];
    }
    
    private Arma[] listaDeArmas;
    private int indice;
    
    
    public void agregarArma(Arma a,int i){
       this.indice=i;
        this.listaDeArmas[indice]=a;        //new Arma((i+1),nombre,puntaje,puntajeDefenza);
    }
    


    public Arma[] getListaDeArmas() {
        return listaDeArmas;
    }

    public void setListaDeArmas(Arma[] listaDeArmas) {
        this.listaDeArmas = listaDeArmas;
    }
    
    public void verArma(){
        
        for (int i=0;i<this.listaDeArmas.length;i++){
            System.out.println(i);
            try{
            System.out.println("Identificador Unico: "+this.listaDeArmas[i].getIdentificadorUnico());
              System.out.println("Nombre: "+this.listaDeArmas[i].getNombre());
            System.out.println("Puntaje De Efectividad De Ataque: "+ this.listaDeArmas[i].getPuntajeDeEfectividadDeAtaque());
            System.out.println("Puntaje De Magnitud De Defenza: "+this.listaDeArmas[i].getPuntajeDeMagnitudDeDefenza());
            System.out.println("\n");
        }
             catch(NullPointerException exception){
                 System.out.println("----");
             }}}
    
}
