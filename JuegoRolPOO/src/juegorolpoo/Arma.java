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
public class Arma extends Item {

    public Arma(String nombreA) {
        super(nombreA);
        Integer atkA = (int) Math.floor(Math.random() * (100 - 20) + 20);
        Integer defA = (int) Math.floor(Math.random() * (20 - 10) + 10);
        Integer vdaA = (int) Math.floor(Math.random() * (50 - 10) + 10);
        Integer pgcA = (int) Math.floor(Math.random() * (15 - 10) + 10);
        Integer prvA = (int) Math.floor(Math.random() * 10);
        super.setValores(atkA, defA, vdaA, pgcA, prvA);
    }

}
