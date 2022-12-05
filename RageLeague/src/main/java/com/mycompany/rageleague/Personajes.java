package com.mycompany.rageleague;
public class Personajes {
    private int mana= 100;  /*El mana se consume con los ataques fisicos o de magia,
    si llega a cero 0 no puedes atacar mas*/
    private int fuerza= 20; /*poder de ataque fisico, consume 25 de mana*/
    private int salud = 100; /*Salud total del personaje*/
    private String nombre;
    private int magia = 15;
    private int ataqueFisico;
    
    public void usarMago(){
        System.out.println("aqui va el codigo para usar el mago");       
    }
    public void usarGuerrero(){
        System.out.println("aqui va el codigo para usar el guerrero");
    }
    
    public int AtaqueFisico(){
        ataqueFisico= fuerza;
        System.out.println(nombre +" realizo un ataque fisico de: "+fuerza+" de daño.");
        System.out.println("La salud restante del enemigo es de: "+salud);
        return ataqueFisico;
           
    }
    public void AtaqueMagico(){
        salud= salud - magia;
        System.out.println(nombre +" realizo un ataque magico de: "+magia+" de daño.");
        System.out.println("La salud restante del enemigo es de: "+salud);
    }
    
    public void verEstado(){
        System.out.println(" Nombre:  '"+nombre+"'   Salud: '"+salud+"'   Ataque:   '"+fuerza+"'   Magia:   '"+ magia+"'");
    }
   
    
    
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getMagia() {
        return magia;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }
        
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    public String getNombre(){
        return nombre;
    }
    
}
