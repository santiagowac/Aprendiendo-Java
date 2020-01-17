package listasdobles;

/**
 *
 * @author SANTIAGO ESPITIA, SANTIAGO AMADO
 */
public class Nodo {

    private Integer dato;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo() {
    }

    public Nodo(Integer dato) {
        this.dato = dato;
    }

    public Integer getDato() {
        return dato;
    }

    public void setDato(Integer dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

}
