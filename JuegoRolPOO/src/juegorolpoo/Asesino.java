/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegorolpoo;

/**
 *
 * @author Estudiante 2018
 */
public class Asesino extends Jugador {

    public Asesino(String nombre) {
        super(nombre);
        Integer atk = (int) Math.floor(Math.random() * (200 - 75) + 75);
        Integer def = (int) Math.floor(Math.random() * (30 - 10) + 10);
        Integer vda = (int) Math.floor(Math.random() * (1200 - 900) + 900);
        Integer pgc = (int) Math.floor(Math.random() * (60 - 40) + 40);
        Integer prv = (int) Math.floor(Math.random() * 50);
        super.setValores(atk, def, vda, pgc, prv);

    }

}
