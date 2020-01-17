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
public class Cazador extends Jugador {

    public Cazador(String nombre) {
        super(nombre);
        Integer atk = (int) Math.floor(Math.random() * (250 - 100) + 100);
        Integer def = (int) Math.floor(Math.random() * (30 - 10) + 10);
        Integer vda = (int) Math.floor(Math.random() * (1400 - 700) + 700);
        Integer pgc = (int) Math.floor(Math.random() * (50 - 45) + 45);
        Integer prv = (int) Math.floor(Math.random() * 35);
        super.setValores(atk, def, vda, pgc, prv);

    }

}
