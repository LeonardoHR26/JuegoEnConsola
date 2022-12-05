package com.mycompany.rageleague;
import java.util.*;
public class Guerrero extends Personajes{
    
        @Override
        public void usarGuerrero(){
        System.out.println("Cual es tu nombre Guerrero");
        Scanner sc = new Scanner(System.in);
        String nombreGuerrero= sc.nextLine();
        Guerrero.this.setNombre(nombreGuerrero);
        Guerrero.this.setFuerza(25);
        Guerrero.this.setSalud(225);
        Guerrero.this.setMagia(10);
        Guerrero.this.verEstado();
        System.out.println("*****************************");
    }

        
}
