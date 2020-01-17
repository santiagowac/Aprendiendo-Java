/**
 * *********************** 
 * Ejercicio Listas Simple
 */

package listas_enlazadas;
import javax.swing.JOptionPane;
import Operaciones.Operaciones;

public class Listas_Enlazadas 
{
    public static void main(String[] args) 
    {
        //Definicion de variables de entrada para la invocacion de los metodos en el menu
        int opcion;
        String X;
        Operaciones C = new Operaciones();
        do
        {
            //Menu de invocacion de metodos de la funcionalidad
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu\n 1. Crear Lista de Estudiantes\n 2. Buscar en Lista de Estudiantes\n 3. Mostrar Lista\n 4. Modificar Estudiante\n 5. Retirar Estudiante\n 6. Ingresar estudiante al Inicio de la Lista\n 7. Borrar Lista\n 8. Salir"));
            switch(opcion)
                {   
                    //contador de insesion de datos en el nodo
                    case 1:
                        int ContTamano = Integer.parseInt(JOptionPane.showInputDialog("Cuantos estudiantes son en el curso?"));
                        for(int i=0;i<ContTamano;i++)
                        
                        //metodo de invocacion de creacion de datos en el nodo
                        {
                            C.IngresarDatosNodo(X = JOptionPane.showInputDialog("Ingrese el nombre del estudiante#"+(i+1)+"")); 
                        }
                        break;
                        //metodo de creacion de nodos al inicio
                    case 6:
                        C.CrearNodoInicio(X = JOptionPane.showInputDialog("Ingrese el nuevo estudiante al inicio:"));
                        break;
                        //metodo de borrado de la lista
                    case 7:
                        C.BorrarLista(X = JOptionPane.showInputDialog("Desea Borrar lista? En caso de Si introduzca cualquier texto en el Espacio, Si no de en el boton Cancelar"));
                        break;
                        //metodo de mostrar los datos del nodo
                    case 3:
                        C.VerDatosNodo();
                        JOptionPane.showMessageDialog(null,"Verifique los datos de su lista:");
                        break;
                        //metodo de Buscar datos en el nodo
                    case 2:
                        X = JOptionPane.showInputDialog("Cual es el estudiante que desea Buscar:");
                        C.BuscarDatosNodo(X);
                        break;
                        //metodo de modificacion de datos en el nodo
                    case 4:
                        X = JOptionPane.showInputDialog("Cual es el nombre del estudiante que va a modificar:");
                        C.EditarDatosNodo(X);
                        break;
                        //metodo de Eliminar datos en el nodo
                    case 5:
                        X = JOptionPane.showInputDialog("Cual es el nombre del estudiante que se va a retirar?:");
                        C.SuprimirDatosNodo(X);
                        break;
                }
            }
        //metodo de salir de la funcion 
        while(opcion!=8);
    }
}


