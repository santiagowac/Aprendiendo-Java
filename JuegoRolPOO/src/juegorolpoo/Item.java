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
public class Item {

    private String nombreA;
    private Integer atkA;
    private Integer defA;
    private Integer vdaA;
    private Integer pgcA;
    private Integer prvA;

    public Item(String nombreA) {
        this.nombreA = nombreA;
    }

    protected void setValores(
            Integer atkA,
            Integer defA,
            Integer vdaA,
            Integer pgcA,
            Integer prvA) {
        this.atkA = atkA;
        this.defA = defA;
        this.vdaA = vdaA;
        this.pgcA = pgcA;
        this.prvA = prvA;
    }

    public String getNombreA() {
        return nombreA;
    }

    public Integer getAtkA() {
        return atkA;
    }

    public Integer getDefA() {
        return defA;
    }

    public Integer getVdaA() {
        return vdaA;
    }

    public Integer getPgcA() {
        return pgcA;
    }

    public Integer getPrvA() {
        return prvA;
    }
}
