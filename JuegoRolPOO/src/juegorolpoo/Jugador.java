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
public abstract class Jugador {

    private String nombre;
    private Integer atk;
    private Integer def;
    private Integer vda;
    private Integer pgc;
    private Integer prv;
    
    private Integer acumAtk = 0;
    private Integer acumDef = 0;
    private Integer acumVda = 0;
    private Integer acumPgc = 0;
    private Integer acumPrv = 0;
    
    private Item Arma;
    private Item Escudo;
    private Item Armadura;
    private Item Collar;
    private Item Anillo;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    protected void setValores(
            Integer atk,
            Integer def,
            Integer vda,
            Integer pgc,
            Integer prv) {
        this.atk = atk;
        this.def = def;
        this.vda = vda;
        this.pgc = pgc;
        this.prv = prv;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getAtk() {
        return atk;
    }

    public Integer getDef() {
        return def;
    }

    public Integer getVda() {
        return vda;
    }

    public Integer getPgc() {
        return pgc;
    }

    public Integer getPrv() {
        return prv;
    }
    
    public Integer getAcumAtk() {
        return acumAtk;
    }

    public Integer getAcumDef() {
        return acumDef;
    }

    public Integer getAcumVda() {
        return acumVda;
    }

    public Integer getAcumPgc() {
        return acumPgc;
    }

    public Integer getAcumPrv() {
        return acumPrv;
    }

    public Item getArma() {

        return Arma;

    }

    public Item getEscudo() {
        return Escudo;
    }

    public Item getArmadura() {
        return Armadura;
    }

    public Item getCollar() {
        return Collar;
    }

    public Item getAnillo() {
        return Anillo;
    }

    public void recibirDanno(Integer danno) {
        this.vda = this.vda - (int) (danno * (1 - (this.def / 100.0)));
        if (this.vda < 0) {
            this.vda = 0;
        }
    }

    public Integer atacar() {
        Integer suerte = (int) Math.floor(Math.random() * 101);
        Integer dannoTotal = 0;

        if (suerte <= this.pgc) {
            dannoTotal = this.atk * (2);
            suerte = (int) Math.floor(Math.random() * 101);
            if (suerte <= this.prv) {
                this.vda = this.vda + dannoTotal - this.atk;
                System.out.println(this.nombre + " !robo vida! por un valor de " + (dannoTotal - this.atk));
            }
        } else {
            dannoTotal = this.atk;
        }
        return dannoTotal;
    }

    public void recibirItem(Item armaRecibida) {
       
        
        this.atk = this.atk  - this.acumAtk + armaRecibida.getAtkA();
        this.def = this.def  - this.acumDef + armaRecibida.getDefA();
        this.vda = this.vda  - this.acumVda + armaRecibida.getVdaA();
        this.pgc = this.pgc  - this.acumPgc + armaRecibida.getPgcA();
        this.prv = this.prv  - this.acumPrv + armaRecibida.getPrvA();
       
        
        this.acumAtk = armaRecibida.getAtkA();
        this.acumDef = armaRecibida.getDefA();
        this.acumVda = armaRecibida.getVdaA();
        this.acumPgc = armaRecibida.getPgcA();
        this.acumPrv = armaRecibida.getPrvA(); 
        
    } 

    @Override
    public String toString() {
        System.out.println("Sus Estadisticas Son:");
        return "NAME: " + this.nombre + "\n"
                + "ATK: " + this.atk + "\n"
                + "DEF: " + this.def + "\n"
                + "VDA: " + this.vda + "\n"
                + "PGC: " + this.pgc + "\n"
                + "PRV: " + this.prv + "\n";
    }

}
