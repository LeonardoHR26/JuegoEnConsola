package com.mycompany.rageleague;
import java.util.*;
public class RageLeague {
    
    public static void main(String[] args) throws Exception {
        Personajes p1m = new Mago();
        Personajes p2g = new Guerrero();
      
        System.out.println("Bienvenidos a RagueLeague Usuarios :3");
        System.out.println("*******************************");
        System.out.println("jugador 1,  eres un ''MAGO'' ");
        System.out.println("jugador 2, eres un ''GUERRERO''");
        
        p1m.usarMago(); // p1m es jugador #1 que es un mago
        p2g.usarGuerrero(); // p2g es jugador #2 que es un guerrero 
        int turnos;
        Scanner sc= new Scanner(System.in);
        
        for(turnos=1;turnos<10;turnos++){
            
            String ap= "a";
            String comparar= "";
            System.out.println("Es el turno #"+turnos);
            System.out.println("Jugador 1, "+p1m.getNombre()+ " es tu momento de atacar!!! ");
            System.out.println("**************************************");
            System.out.println("que ataque usas: 'a' Ataque Magico, u 'Otra tecla' Ataque Fisico ");
            comparar= sc.nextLine();
            String esperar= "";
            
            //Ataque Magico de Jugador 1 a Jugador 2
            if (comparar.equals(ap)){
                System.out.println("''");
                System.out.println("*********************************************");
                System.out.println(p1m.getNombre()+" Haz realizado un ataque Magico!!! a "+p2g.getNombre());
                System.out.println("has metido "+p1m.getMagia()+" de daño magico!!!");
                p2g.setSalud(p2g.getSalud()-p1m.getMagia());
                System.out.println("la salud del oponente '"+p2g.getNombre()+"' es: "+p2g.getSalud());
                p1m.setMagia(p1m.getMagia()+10);
                System.out.println("Tu ataque magico aumenta en 10, ahora tienes: "+p1m.getMagia()+" Ataque magico");
                System.out.println("'presiona una tecla para pasar al siguiente turno'");
                esperar= sc.nextLine();
                System.out.println("*************************************");
            }
            // Ataque FISICO de Jugador 1 a Jugador 2
            else { 
                System.out.println("''");
                System.out.println("*********************************");
                System.out.println(p1m.getNombre()+" Haz realizado un ataque Fisico!!! a "+p2g.getNombre());
                System.out.println("has metido "+p1m.getFuerza()+" de daño Fisico!!! a: "+p2g.getNombre());
                p2g.setSalud(p2g.getSalud()-p1m.getFuerza());
                System.out.println("la salud del oponente '"+p2g.getNombre()+"' es: "+p2g.getSalud());
                p1m.setFuerza(p1m.getFuerza()+5);
                System.out.println("Tu ataque Fisico aumenta en 5, ahora tienes: "+p1m.getFuerza()+ " Ataque Fisico");
                System.out.println("'presione una tecla para pasar al siguiente turno'");
                esperar= sc.nextLine();
                System.out.println("*************************************");
                
            }
            //JUGADOR DOS AL ATAQUE
            
            System.out.println("Jugador 2, "+p2g.getNombre()+ " es tu momento de atacar!!! ");
            System.out.println("**************************************");
            System.out.println("que ataque usas: 'a' Ataque Magico, u 'Otra tecla' Ataque Fisico ");
            comparar= sc.nextLine();
            
            //ataque Magico de Jugador 2 a Jugador 1
            if (comparar.equals(ap)){
                System.out.println("''");
                System.out.println("*********************************************");
                System.out.println(p2g.getNombre()+" Haz realizado un ataque Magico!!! a "+p1m.getNombre());
                System.out.println("has metido "+p2g.getMagia()+" de daño magico!!!");
                p1m.setSalud(p1m.getSalud()-p2g.getMagia());
                System.out.println("la salud del oponente '"+p1m.getNombre()+"' es: "+p1m.getSalud());
                p2g.setMagia(p2g.getMagia()+5);
                System.out.println("Tu ataque magico aumenta en 5, ahora tienes: "+p2g.getMagia()+" Ataque magico");
                System.out.println("'presiona una tecla para pasar al siguiente turno'");
                esperar= sc.nextLine();
                System.out.println("*************************************");
            }
            //Ataque Fisico de Jugador 2 a Jugador 1
            else {
                System.out.println("''");
                System.out.println("*********************************");
                System.out.println(p2g.getNombre()+" Haz realizado un ataque Fisico!!! a "+p1m.getNombre());
                System.out.println("has metido "+p2g.getFuerza()+" de daño magico!!! a: "+p1m.getNombre());
                p1m.setSalud(p1m.getSalud()-p2g.getFuerza());
                System.out.println("la salud del oponente '"+p1m.getNombre()+"' es: "+p1m.getSalud());
                p2g.setFuerza(p2g.getFuerza()+10);
                System.out.println("Tu ataque Fisico aumenta en 10, ahora tienes: "+p2g.getFuerza()+" Ataque Fisico");
                System.out.println("'presione una tecla para pasar al siguiente turno'");
                esperar= sc.nextLine();
                System.out.println("*************************************");
                
            }
                 if (p2g.getSalud()<=0){
                System.out.println("Jugador #1 " +p1m.getNombre()+" GANO EL JUEGO");
                System.out.println("Felicidades!!!");
                esperar= sc.nextLine();
                throw new Exception("Jugador #1 GANO EL JUEGO");
            }
            if (p1m.getSalud()<=0){
                System.out.println("Jugador #2 " +p2g.getNombre()+" GANO EL JUEGO");
                System.out.println("Felicidades!!!");
                esperar= sc.nextLine();
                throw new Exception ("Jugador #2 GANO EL JUEGO");
            }
            
            
        }
    
    }
}
