/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegorolpoo;

import java.util.Scanner;

/**
 *
 * @author Estudiante 2018
 */
public class JuegoRolPOO {

    /**
     * @param args the command line arguments
     */
    private Jugador jA;
    private Jugador jB;

    public static void main(String[] args) {
        
        System.out.println("\n*************Este juego por consola esta enfocado en una batalla por turnos, estos turnos son automatizado es por esto que despues de que des la información de los dos jugadores aparecera toda la información de la batalla***********+\n");
        JuegoRolPOO jrpoo = new JuegoRolPOO();

        jrpoo.jA = jrpoo.selecionar(1);
        jrpoo.jB = jrpoo.selecionar(2);
        jrpoo.Imprimirnombre(jrpoo.jA, jrpoo.jB);
        jrpoo.IinicioDadosBatalla(jrpoo.jA, jrpoo.jB);

    }

    public Jugador selecionar(int e) {
        Scanner s = new Scanner(System.in);
        int seleccion = 0;
        String nombre = "";
        System.out.println("Seleccione jugador "+e+"\n"
                + "1. Asesino\n"
                + "2. Cazador\n"
                + "3. Guardian\n"
                + "4. Luchador");
        seleccion = s.nextInt();
        System.out.println("¿Cual es nombre del jugador?");
        nombre = s.next();

        switch (seleccion) {
            case 1:
                return new Asesino(nombre);
            case 2:
                return new Cazador(nombre);
            case 3:
                return new Guardian(nombre);
            case 4:
                return new Luchador(nombre);
            default:
                System.out.println("Selección no valida");
                return null;
        }
    }

    public void iniciarBatalla(Jugador j1, Jugador j2) {
        while (j1.getVda() > 0 && j2.getVda() > 0) {
            System.out.println("El jugador " + j1.getNombre() + " ataca");
            System.out.println("La vida de " + j2.getNombre() + " es " + j2.getVda());
            j2.recibirDanno(j1.atacar());
            System.out.println("Ahora la vida de " + j2.getNombre() + " es " + j2.getVda());
            System.out.println("-----------------------------------------------------------");
            System.out.println("El jugador " + j2.getNombre() + " ataca");
            System.out.println("La vida de " + j1.getNombre() + " es " + j1.getVda());
            j1.recibirDanno(j2.atacar());
            System.out.println("Ahora la vida de " + j1.getNombre() + " es " + j1.getVda());
            System.out.println("-----------------------------------------------------------");
            System.out.println("-----------------------------------------------------------");
            if ( j1.getVda() > 0){
            j1.recibirItem(EtregarItemJugador(j1));
            System.out.println(j1.toString()); 
            }
            if ( j2.getVda() > 0){
            j2.recibirItem(EtregarItemJugador(j2));
            System.out.println(j2.toString());
            }
            
        }

        System.out.println(j1.toString());
        System.out.println(j2.toString());
        if (j1.getVda() <= 1) {
            System.out.println("¡El ganador es " + j2.getNombre() + "!");
        } else {
            System.out.println("¡El ganador es " + j1.getNombre() + "!");
        }
    }

    public void Imprimirnombre(Jugador j1, Jugador j2) {
        System.out.println("-----" + j1.getNombre() + "-----");
        System.out.println(j1.toString());
        System.out.println("----------------------------------");
        System.out.println("-----" + j2.getNombre() + "-----");
        System.out.println(j2.toString());
        System.out.println("----------------------------------");

    }

    public void IinicioDadosBatalla(Jugador j1, Jugador j2) {

        int suerte = (int) Math.floor(Math.random() * (2 - 1) + 1);
        if (suerte == 1) {
            System.out.println("Inicia " + j1.getNombre());
            iniciarBatalla(j1, j2);
        } else {
            System.out.println("Inicia " + j2.getNombre());
            iniciarBatalla(j2, j1);
        }
    }

    public Item EtregarItemJugador(Jugador jg) {
        Scanner s = new Scanner(System.in);
        int suerte = (int) Math.floor(Math.random() * (6 - 1) + 1);
        switch (suerte) {
            case 1:
                System.out.println("El jugador " + jg.getNombre() + "gano una Espada Eficaz");
                return new Arma("Arma");
            case 2:
                System.out.println("El jugador" + jg.getNombre() + "gano un Escudo de Espinas");
                return new Escudo("Escudo");

            case 3:
                System.out.println("El jugador" + jg.getNombre() + " gano una Armadura Colosal");
                return new Armadura("Armadura");

            case 4:
                System.out.println("El jugador " + jg.getNombre() + "  gano un Collar del destino");
                return new Collar("Collar");
            case 5:
                System.out.println("El jugador" + jg.getNombre() + "   gano un Anillo del destino");
                return new Anillo("Anillo");
            default:
                System.out.println("El jugador" + jg.getNombre() + "  no gano ninguna arma");
                return null;
        }

    }

}
