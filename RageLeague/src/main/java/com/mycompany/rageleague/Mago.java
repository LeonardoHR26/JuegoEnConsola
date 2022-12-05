package com.mycompany.rageleague;
import java.util.*;
public class Mago extends Personajes {
    
    @Override
    public void usarMago(){
        System.out.println("Cual es tu nombre Mago");
        Scanner sc = new Scanner(System.in);
        String nombreMago= sc.nextLine();
        Mago.this.setFuerza(15);
        Mago.this.setMagia(30);
        Mago.this.setSalud(200);
        Mago.this.setNombre(nombreMago);
        Mago.this.verEstado();
        System.out.println("*****************************");
        
    }
    
    

}
