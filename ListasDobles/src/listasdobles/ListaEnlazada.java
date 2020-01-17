package listasdobles;

import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author SANTIAGO
 */
public class ListaEnlazada {

    Nodo inicio;

    public void insertarInicio(Integer dato) {
        Nodo nuevo = new Nodo(dato);
        if (esNulo()) {
            inicio = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }
    }

    public void insertarFinal(Integer dato) {
        Nodo nuevo = new Nodo(dato);
        if (esNulo()) {
            inicio = nuevo;
        } else {
            Nodo aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();

            }
            aux.setSiguiente(nuevo);
            nuevo.setAnterior(aux);
        }

    }

    public void eliminaValor(Integer dato) {
        if (!esNulo()) {
            Nodo aux = inicio;
            Nodo anterior = null;
            while (aux != null) {
                if (Objects.equals(aux.getDato(), dato)) {
                    if (anterior == null) {
                        inicio = inicio.getSiguiente();
                        aux.setSiguiente(null);
                        aux = inicio;

                    } else {
                        anterior.setSiguiente(aux.getSiguiente());
                        aux.setSiguiente(null);
                        aux = anterior.getSiguiente();
                    }
                } else {
                    anterior = aux;
                    aux = aux.getSiguiente();
                }
            }
        }

    }

    public void buscar(Integer dato) {
        if (inicio != null) {
            Nodo aux = inicio;
            while (aux != null) {
                if (Objects.equals(aux.getDato(), dato)) {
                    JOptionPane.showMessageDialog(null, "si existe el valor en la lista",
                            "¿Existe?", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "no existe en la lista",
                    "¿Existe?", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void imprimirInicioFin() {
        System.out.println("\nImprimiendo inicio - fin");
        Nodo dato;
        dato = inicio;
        while (dato != null) {
            System.out.print("[" + dato.getDato() + "]<=>");
            dato = dato.getSiguiente();
        }

    }

    public void imprimirFinInicio() {
        System.out.println("\nImprimiendo fin - inicio");
        Nodo dato;
        dato = inicio;
        while (dato.getSiguiente() != null) {
            dato = dato.getSiguiente();
        }
        while (dato != null) {
            System.out.print("[" + dato.getDato() + "]<=>");
            dato = dato.getAnterior();
        }

    }

    public boolean esNulo() {
        return inicio == null;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

}
