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
public class Guardian extends Jugador {

    public Guardian(String nombre) {
        super(nombre);
        Integer atk = (int) Math.floor(Math.random() * (115 - 20) + 20);
        Integer def = (int) Math.floor(Math.random() * (50 - 10) + 10);
        Integer vda = (int) Math.floor(Math.random() * (2000 - 1100) + 1100);
        Integer pgc = (int) Math.floor(Math.random() * (45 - 10) + 10);
        Integer prv = (int) Math.floor(Math.random() * 20);
        super.setValores(atk, def, vda, pgc, prv);
    }

}
