/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

/**
 *
 * @author yasuly
 */
public class Cola {

    private NodoCola primero;
    private NodoCola ultimo;
    private int cont;

    public Cola() {
        this.primero = null;
        this.ultimo = null;
        this.cont = 0;
    }
// …

    public void vaciar() {
        this.primero = null;
        this.ultimo = null;
        this.cont = 0;
    }

    public boolean estaVacia() {
        return (this.primero == null);
    }

    public void insertarElementoPut(Object x) {
        if (primero == null) {
            this.primero = new NodoCola(x);
            this.ultimo = primero;
        } else {
            this.ultimo.insertarSiguiente(x);
            this.ultimo = this.ultimo.getSiguiente();
        }
        this.cont++;
    }

    public Object IrAlfrente() {
        if (this.primero != null) {
            return this.primero.getElemento();
        } else {
            return null;
        }
    }

    public Object borrarelemetoGet() {
        if (this.primero == null) {
            return null;
        } else {
            this.cont--;
            NodoCola nodoTmp = this.primero;
            this.primero = this.primero.getSiguiente();
            return nodoTmp.getElemento();
        }
    }

    public void imprimir() {
        NodoCola reco = primero;
        System.out.println("Listado de todos los elementos de la cola.\n");
        while (reco != null) {
            System.out.println("      -----------------------      ");
            System.out.println("  " +reco.getElemento() + "  ");
            System.out.println("      -----------------------      ");
            reco = reco.getSiguiente();
        }
        System.out.println();
    }

    public int tamanyo() {
        return this.cont;
    }

}
