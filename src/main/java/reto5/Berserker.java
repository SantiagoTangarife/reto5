
package reto5;
import java.util.Scanner;
import reto5.Arma;
import reto5.AggArma;


public class Berserker extends Soldado {
     //CONSTRUCTORES
    public Berserker(){}
    
   
    public Berserker(int identificadorUnico, String apodoDeBatalla, String nombreCompleto, float puntajeDeFuerza){
        this.identificadorUnico=identificadorUnico;
        this.apodoDeBatalla=apodoDeBatalla;
        this.nombreCompleto=nombreCompleto;
        this.puntajeDeFuerza=puntajeDeFuerza;
        
        
        
        
        
}
    // ATRIBUTOS
    private int identificadorUnico;             //IDENTIFICADOR UNICO
    private String apodoDeBatalla;
    private String nombreCompleto;
    private float puntajeDeFuerza;
    
    
   

    
    
    
    //METODOS
    public int getIdentificadorUnico() {
        return identificadorUnico;
    }

    public void setIdentificadorUnico(int identificadorUnico) {
        this.identificadorUnico = identificadorUnico;
    }

    public String getApodoDeBatalla() {
        return apodoDeBatalla;
    }

    public void setApodoDeBatalla(String apodoDeBatalla) {
        this.apodoDeBatalla = apodoDeBatalla;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public float getPuntajeDeFuerza() {
        return puntajeDeFuerza;
    }

    public void setPuntajeDeFuerza(float puntajeDeFuerza) {
        this.puntajeDeFuerza = puntajeDeFuerza;
    }

    
    
   
    
    
    
    //METODOS
    
    public float atacar(int j) {
        
        AggArma lista= new AggArma();
        //listaDeArmas=lista.getListaDeArmas();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //float ataque=this.puntajeDeFuerza;
        float sumatotal=0f;
        for (int i=0;i<lista.getListaDeArmas().length;i++){
            sumatotal+=lista.getListaDeArmas()[i].getPuntajeDeEfectividadDeAtaque();
            
        }
        Batallon a=new Batallon();
        
        float ataque= (a.fuerzaActual(j))*sumatotal;
        
        return ataque;
        //System.out.println("");
            
    
    }
   
    
    public void verArmas(){
         AggArma a=new AggArma();
         a.verArma();
        
    }
    
    //public void armaNueva(int n, String nombre,float ataque, float defenza){
        
       // AggArma a=new AggArma(n,nombre,ataque,defenza);}
        //this.listaDeArmas[n]=new Arma(codigo, nombre,ataque,defenza);
        
        
        
        
    
    
    //}
    
   
    
   
    
    /*public void aggArmas(int n){
        if(n!=456){
        //armasDef();
        System.out.println("Identificador unico: ");
        Scanner lector= new Scanner(System.in);
        int codigo=lector.nextInt();
        
        System.out.println("Nombre: ");
        lector=new Scanner(System.in);
        String nombre= lector.nextLine();
        
        System.out.println("Puntaje de ataque: ");
        lector=new Scanner(System.in);
        float pataque= lector.nextFloat();
        
        System.out.println("Puntaje de defenza: ");
        lector=new Scanner(System.in);
        float pdefenza= lector.nextFloat();
        switch(n){
            case 4:this.listaDeArmas[4].setIdentificadorUnico(codigo);
        this.listaDeArmas[4].setNombre(nombre);
        this.listaDeArmas[4].setPuntajeDeEfectividadDeAtaque(pataque);
        this.listaDeArmas[4].setPuntajeDeMagnitudDeDefenza(pdefenza);
                break;
            case 5:this.listaDeArmas[5].setIdentificadorUnico(codigo);
        this.listaDeArmas[5].setNombre(nombre);
        this.listaDeArmas[5].setPuntajeDeEfectividadDeAtaque(pataque);
        this.listaDeArmas[5].setPuntajeDeMagnitudDeDefenza(pdefenza);
                break;
            case 6:this.listaDeArmas[6].setIdentificadorUnico(codigo);
        this.listaDeArmas[6].setNombre(nombre);
        this.listaDeArmas[6].setPuntajeDeEfectividadDeAtaque(pataque);
        this.listaDeArmas[6].setPuntajeDeMagnitudDeDefenza(pdefenza);
        break;
        }
        
        
        
        //this.listaDeArmas[4]=new Arma(codigo, nombre, pataque, pdefenza);
    }
    }*/
    
}
//importar lista de soldados
// Public  Batallon(listadesoldados[])
//public class Batallon implements ListaDeSoldados{...}     //reescribir los metodos