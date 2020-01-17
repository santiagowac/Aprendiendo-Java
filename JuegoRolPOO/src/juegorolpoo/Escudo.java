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
public class Escudo extends Item {

    public Escudo(String nombreA) {
        super(nombreA);
        Integer atkA = (int) Math.floor(Math.random() * (25 - 10) + 10);
        Integer defA = (int) Math.floor(Math.random() * (100 - 50) + 50);
        Integer vdaA = (int) Math.floor(Math.random() * (70 - 10) + 10);
        Integer pgcA = (int) Math.floor(Math.random() * (10 - 2) + 2);
        Integer prvA = (int) Math.floor(Math.random() * 2);
        super.setValores(atkA, defA, vdaA, pgcA, prvA);
    }

}
