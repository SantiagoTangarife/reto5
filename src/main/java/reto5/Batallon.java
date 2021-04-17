/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5;

/**
 *
 * @author saxss
 */
public class Batallon implements ListaSoldados{
    //CONSTRUCTOR
    public Batallon(){
    this.listaDeBerserker=new Berserker[5];     //SOLO 5 PERSONAJES 3 DE LA MAQUINA 2 PARA CREAR
    this.listaDeBerserker[0]= new Berserker(1,"Odin","Victor Duque",120.3f);            // Crea BERSERKER'S
    this.listaDeBerserker[1]= new Berserker(2,"Luke","David Duque",175.5f);
    this.listaDeBerserker[2]= new Berserker(3,"Jhon","Victor Perez",100.94f);
    }
    
    //ATRIBUTOS
    
    private Berserker[] listaDeBerserker; 

    public Berserker[] getListaDeBerserker() {
        return listaDeBerserker;
    }

    public void setListaDeBerserker(Berserker[] listaDeBerserker) {
        this.listaDeBerserker = listaDeBerserker;
    }
    
    
    

    public void agregar(Berserker o,int i) {
         this.listaDeBerserker[i]=o;
        
        
    }


    public void eliminar(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public void obtener(int i) {
        System.out.println("ID: "+this.listaDeBerserker[i].getIdentificadorUnico());
        System.out.println("Apodo de batalla: "+this.listaDeBerserker[i].getApodoDeBatalla());
        System.out.println("Nombre completo: "+this.listaDeBerserker[i].getNombreCompleto());
        System.out.println("Puntaje de fuerza: "+this.listaDeBerserker[i].getPuntajeDeFuerza());
        //float sumatotal=0f;
        
       
    }
    
    public float fuerzaActual(int i){
        return (this.listaDeBerserker[i].getPuntajeDeFuerza());
    }
    
    
    
}
