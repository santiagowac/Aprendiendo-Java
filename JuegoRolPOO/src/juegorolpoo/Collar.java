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
public class Collar extends Item {

    public Collar(String nombreA) {
        super(nombreA);
        Integer atkA = (int) Math.floor(Math.random() * (50 - 1) + 1);
        Integer defA = (int) Math.floor(Math.random() * (50 - 1) + 1);
        Integer vdaA = (int) Math.floor(Math.random() * (50 - 1) + 1);
        Integer pgcA = (int) Math.floor(Math.random() * (10 - 1) + 1);
        Integer prvA = (int) Math.floor(Math.random() * (5 - 1) + 1);
        super.setValores(atkA, defA, vdaA, pgcA, prvA);
    }

}
