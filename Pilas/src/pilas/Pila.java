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
public class Pila {

    private Nodo inicio;
    private int tamanoP;

    public void Pila() {
        inicio = null;
        tamanoP = 0;
    }

    public boolean esVacia() {
        return inicio == null;
    }

    public int getTam() {
        return tamanoP;
    }

    public void eliminarCima() {
        if (!esVacia()) {
            inicio = inicio.getSiguiente();
            tamanoP--;
        }
    }
    
    public void retirarValor() {
        if (!esVacia()) {
            inicio = inicio.getSiguiente();
            tamanoP--;
        }
    }
    
    public void apilarDato(int valor) {
        Nodo nuevo = new Nodo();
        nuevo.setDato(valor);
        if (esVacia()) {
            inicio = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        tamanoP++;
    }

    public boolean buscarElemento(int refDato) {
        Nodo aux = inicio;
        boolean existe = false;
        while (existe != true && aux != null) {
            if (refDato == aux.getDato()) {
                existe = true;
            } else {
                aux = aux.getSiguiente();
            }
        }
        return existe;
    }

    public void eliminarValor(int refDato) {
        if (buscarElemento(refDato)) {
            Nodo pilaAux = null;
            while (refDato != inicio.getDato()) {
                Nodo temp = new Nodo();
                temp.setDato(inicio.getDato());
                if (pilaAux == null) {
                    pilaAux = temp;
                } else {
                    temp.setSiguiente(pilaAux);
                    pilaAux = temp;
                }
                retirarValor();
            }
            retirarValor();
            while (pilaAux != null) {
                apilarDato(pilaAux.getDato());
                pilaAux = pilaAux.getSiguiente();
            }
            pilaAux = null;
        }
    }

    public void editarValor(int refDato, int DatoNuevo) {
        if (buscarElemento(refDato)) {
            Nodo pilaAux = null;
            while (refDato != inicio.getDato()) {
                Nodo temp = new Nodo();
                temp.setDato(inicio.getDato());
                if (pilaAux == null) {
                    pilaAux = temp;
                } else {
                    temp.setSiguiente(pilaAux);
                    pilaAux = temp;
                }
                retirarValor();
            }
            inicio.setDato(DatoNuevo);
            while (pilaAux != null) {
                apilarDato(pilaAux.getDato());
                pilaAux = pilaAux.getSiguiente();
            }
            pilaAux = null;
        }
    }

    public void eliminarPila() {
        inicio = null;
        tamanoP = 0;
    }

    public void imprimirPila() {
        Nodo aux = inicio;
        while (aux != null) {
            System.out.println("[\t" + aux.getDato() + "\t]");
            System.out.println("[---------------]");
            aux = aux.getSiguiente();
        }
    }
}
