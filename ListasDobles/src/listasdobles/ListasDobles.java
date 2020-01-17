package listasdobles;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author SANTIAGO
 */
public class ListasDobles {

    public static void main(String[] args) {
        int opcion;
        try {
            ListaEnlazada lista = new ListaEnlazada();
            do {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.Ingresar al inicio\n"
                        + "2.Ingresar al final\n"
                        + "3.Buscar valor\n"
                        + "4.Eliminar valor\n"
                        + "5.Imprimir Inicio - Fin\n"
                        + "6.Imprimir Fin - Inicio\n"
                        + "7.Salir", "Ingresar",
                        JOptionPane.INFORMATION_MESSAGE));
                switch (opcion) {
                    case 1:
                        lista.insertarInicio(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero",
                                "Ingresar al inicio", JOptionPane.INFORMATION_MESSAGE)));
                        break;
                    case 2:
                        lista.insertarFinal(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero",
                                "Ingresar al final", JOptionPane.INFORMATION_MESSAGE)));
                        break;
                    case 3:
                        lista.buscar(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero",
                                "Buscar", JOptionPane.INFORMATION_MESSAGE)));
                        break;
                    case 4:
                        lista.eliminaValor(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero",
                                "Eliminar", JOptionPane.INFORMATION_MESSAGE)));
                        break;
                    case 5:
                        if (lista.getInicio() == null) {
                            JOptionPane.showMessageDialog(null, "La lista esta vacia");
                        } else {
                            lista.imprimirInicioFin();
                        }
                        break;
                    case 6:
                        if (lista.getInicio() == null) {
                            JOptionPane.showMessageDialog(null, "La lista esta vacia");
                        } else {
                            lista.imprimirFinInicio();
                        }
                        break;
                    case 7:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "El valor ingresado no esta en la lista",
                                "Error", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
            } while (opcion != 7);
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
