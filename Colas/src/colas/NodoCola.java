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
public class NodoCola {

    private Object elemento;
    private NodoCola siguiente;
// sobrecarga el elemento y siguiente

    public NodoCola(Object elemento,
            NodoCola siguiente) {
        this.elemento = elemento;
        this.siguiente = siguiente;
    }
// sobrecarga el elemento y siguiente

    public NodoCola(Object elemento) {
        this.elemento = elemento;
        this.siguiente = null;
    }

    public Object getElemento() {
        return elemento;
    }

    public NodoCola getSiguiente() {
        return siguiente;
    }

    public void insertarSiguiente(Object x) {
        NodoCola nuevoNodo = new NodoCola(x, this.siguiente);
        this.siguiente = nuevoNodo;
    }
}
