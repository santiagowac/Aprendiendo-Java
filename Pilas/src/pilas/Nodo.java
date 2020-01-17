/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

/**
 * curso: Estructura de datos
 * codigo: 1016113251
 * @author Welver Santiago Amado Camargo
 * Proyecto : Manejo de Pilas
 * 
 */
public class Nodo {

    private int dato;
    private Nodo siguiente;

    public void Nodo() {
        this.dato = 0;
        this.siguiente = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
