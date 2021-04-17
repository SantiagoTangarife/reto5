/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5;
import java.util.Scanner;
import reto5.Berserker;
import reto5.Batallon;
import reto5.AggArma;
/**
 *
 * @author saxss
 */
public class reto5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int soldado=0;
        
        System.out.println("MENU PRINCIPAL:"
                + "\n 1) Iniciar programa Vikingo"
                + "\n 2) Ver, Agregar, Modificar o Eliminar Armas"
                + "\n 3) Ver, Agregar, Modificar o Eliminar Berserker"
                + "\n ");
        Scanner lector= new Scanner(System.in);
        byte op= lector.nextByte();
        boolean ciclo=true;
        
        switch(op){
            case 1: while(ciclo==true){
                    System.out.println("Iniciar programa Vikingo"
                    + "\n 1) Modificar Berserker"
                    + "\n 2) Atacar"
                    + "\n 3) Regresar");
                    lector= new Scanner(System.in);
                    byte me=lector.nextByte();
                    if(me==1){
                        lector = new Scanner(System.in);
                        System.out.println("Ingrese el indice del nuevo soldado");
                        int j= lector.nextInt();
                        if(j>5 || j<0){
                            System.out.println("Indice fuera del rango");
                        }
                        else{
                            soldado=j;
                        }
                        
                    }
                    else if(me==2){
                        Berserker a=new Berserker();
                        
                        System.out.println("ataque: "+a.atacar(soldado));
                        System.out.println("");
                        
                    }
                    else if(me==3){
                        ciclo= false;
                    }
            }
                    
            
                    break;
            //2) Ver, Agregar, Modificar o Eliminar Armas        
            case 2:   while(ciclo==true){
                System.out.println("Ver, Agregar, Modificar o Eliminar Armas"
                    + "\n 1) Ver"
                    + "\n 2) Agregar Modificar"
                   
                    + "\n 3) Eliminar"
                    + "\n 4) regresar");
                lector= new Scanner(System.in);
                    byte me=lector.nextByte();
                    
                    if(me==1){
                        Berserker a=new Berserker();
                        a.verArmas();
                    }
                    if (me==2){
                        System.out.println("Indice a modificar o crear (entre 0 y 6):");
                        lector=new Scanner(System.in);
                        int b=lector.nextInt();
                        if(b<0 || b>6){
                            System.out.println("indice prohibido para el usuario.");
                            System.out.println("");
                            continue;
                        }
                        Berserker a=new Berserker();
                       
                        /*System.out.println("Identificador unico: ");
                        lector= new Scanner(System.in);
                        int codigo=lector.nextInt();*/

                        System.out.println("Nombre: ");
                        lector=new Scanner(System.in);
                        String nombre= lector.nextLine();

                        System.out.println("Puntaje de ataque: ");
                        lector=new Scanner(System.in);
                        float pataque= lector.nextFloat();

                        System.out.println("Puntaje de defenza: ");
                        lector=new Scanner(System.in);
                        float pdefenza= lector.nextFloat();
                        
                         
                        //a.armaAgg(b, d);
                         //a.armaNueva();
                         AggArma z=new AggArma();
                         Arma d= new Arma((b+1),nombre,pataque,pdefenza);
                         z.agregarArma(d, b);
                         //a.verArmas();
                        
                         
                        
                    }
                    if(me==3){
                         System.out.println("Indice a eliminar (entre 4 y 6):");
                        lector=new Scanner(System.in);
                        int b=lector.nextInt();
                        if(b<0 || b>6){
                            System.out.println("indice prohibido para el usuario.");
                            System.out.println("");
                            continue;
                        }
                        AggArma z=new AggArma();
                        Arma d= new Arma(0,null,0f,0f);
                        Berserker a=new Berserker();
                        z.agregarArma(d, b);
                        
                    }
                    else if(me==4){
                        ciclo= false;
                    }
                    
                    
                    }
            break;
            
            case 3:while(ciclo=true){
                System.out.println("Ver, Agregar, Modificar o Eliminar Berserker"
                        + "\n 1) Ver"
                        + "\n 2) Agregar o Modificar"
                        + "\n 3) Eliminar"
                        + "\n 4) Regresar");
                lector= new Scanner(System.in);
                    byte me=lector.nextByte();
                    
                    if(me==1){
                        System.out.println("Ingrese el inice del Berserker");
                        lector= new Scanner(System.in);
                        int b= lector.nextInt();
                        if(b<0 || b>6){
                            System.out.println("indice prohibido para el usuario.");
                            System.out.println("");
                            continue;}
                        Batallon a= new Batallon();
                        a.obtener(b);
                        System.out.println("");
                    }
                    
                    if(me==2){
                         System.out.println("Ingrese el inice del Berserker");
                        lector= new Scanner(System.in);
                        int b= lector.nextInt();
                        if(b<0 || b>6){
                            System.out.println("indice prohibido para el usuario.");
                            System.out.println("");
                            continue;}
                        System.out.println("Identificador unico: ");
                         lector= new Scanner(System.in);
                        int id=lector.nextInt();

                        System.out.println("Apodo de batalla: ");
                        lector=new Scanner(System.in);
                        String apodo= lector.nextLine();

                        System.out.println("Nombre completo: ");
                        lector=new Scanner(System.in);
                        String name= lector.nextLine();

                        System.out.println("Puntaje de fuerza: ");
                        lector=new Scanner(System.in);
                        float pfuerza= lector.nextFloat();
                        
                        Berserker a= new Berserker(id,apodo,name,pfuerza);
                        Batallon c= new Batallon();
                        c.agregar(a,b);}
                    
                     else if(me==4){
                        ciclo= false;
                    }
                    
                    
                    }
            break; 
        
    }}}