/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegorolpoo;

/**
 *
 * @author yasuly
 */
public class Luchador extends Jugador {

    public Luchador(String nombre) {
        super(nombre);
        Integer atk = (int) Math.floor(Math.random() * (260 - 150) + 150);
        Integer def = (int) Math.floor(Math.random() * (20 - 10) + 10);
        Integer vda = (int) Math.floor(Math.random() * (1500 - 1000) + 1000);
        Integer pgc = (int) Math.floor(Math.random() * (70 - 5) + 5);
        Integer prv = (int) Math.floor(Math.random() * 10);
        super.setValores(atk, def, vda, pgc, prv);
    }

}
