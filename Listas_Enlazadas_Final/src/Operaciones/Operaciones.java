/**
 * Wilmar Amado Duarte
 * Codigo: 1018405327
 * Estructura datos
 * 23/10/2017
 * Ejercicio Listas
 */

package Operaciones;
import javax.swing.JOptionPane;

class Nodo 
    {
        //Definicion de variables de entrada para el nodo
        String Dato;
        Nodo siguiente;
    }
public class Operaciones 
{
    Nodo InicioNodo;
    Nodo UltimoNodo;
    
    private int ContTamano;
    
    public Operaciones()
    {
        InicioNodo = null;
        UltimoNodo = null;
        
    }
    
    //Metodo de ingresar datos en el nodo creado
    public void IngresarDatosNodo(String x)
    {
        Nodo AuxNodo = new Nodo();
        AuxNodo.Dato = x;
        if(InicioNodo == null)
            {
                InicioNodo = AuxNodo;
                InicioNodo.siguiente = null;
                UltimoNodo = InicioNodo;
            }
        else{
                UltimoNodo.siguiente = AuxNodo;
                AuxNodo.siguiente = null;
                UltimoNodo = AuxNodo;
            }
    }
    
    //Metodo de crear nodo al inicio 
    public void CrearNodoInicio(String x)
        {
            Nodo AuxNodo = new Nodo();
            AuxNodo.Dato = x;
            AuxNodo.siguiente = null;
            if(InicioNodo == null)
                {
                    InicioNodo = AuxNodo;
                }
            else{
                AuxNodo.siguiente = InicioNodo;
                InicioNodo = AuxNodo;
                }
        }
    
    //Metodo de crear nodo al Final 
    public void BorrarLista(String x)
        {
            InicioNodo = null;
            ContTamano = 0;
            
        }
    
    //Metodo de mostrar los datos en el nodo
    public void VerDatosNodo()
        {
            System.out.println("+++Mostrar lista de Estudiantes:+++");
            System.out.println("-------------------------------------");
            Nodo AuxNodo = new Nodo();
            AuxNodo = InicioNodo;  
            while (AuxNodo != null)
                {
                    System.out.println(AuxNodo.Dato);
                    AuxNodo = AuxNodo.siguiente;    
                }
        }
    
    //Metodo de buscar datos en el nodo creado
    public void BuscarDatosNodo(String x)
        {
            Nodo AuxNodo = new Nodo();
            AuxNodo = InicioNodo;  
            while (AuxNodo != null)
                {
                    if(AuxNodo.Dato.equals(x))
                        {
                            JOptionPane.showMessageDialog(null,"Estudiante ya esta inscrito para curso - " + x);
                        }
                            AuxNodo = AuxNodo.siguiente;
                }        
        }
    
    //Metodo de Editar datos en el nodo creado
    public void EditarDatosNodo(String x)
        {
            Nodo AuxNodo = new Nodo();
            AuxNodo = InicioNodo;  
            while (AuxNodo != null)
            {
                if(AuxNodo.Dato.equals(x))
                    {
                        AuxNodo.Dato = JOptionPane.showInputDialog("Ingrese el nombre del estudiante a modificar");
                    }
                        AuxNodo = AuxNodo.siguiente;
            }        
        }
    
    //Metodo de Eliminar datos en el nodo creado
    public void SuprimirDatosNodo(String x)
        {
            Nodo AuxNodo = new Nodo();
            Nodo anterior = new Nodo();
            AuxNodo = InicioNodo;
            anterior = null;
            while (AuxNodo != null)
                {
                if(AuxNodo.Dato.equals(x))
                    {
                        if(AuxNodo == InicioNodo)
                            {
                                InicioNodo = InicioNodo.siguiente;
                            }
                        else
                            {
                                anterior.siguiente = AuxNodo.siguiente;
                            }
                            JOptionPane.showMessageDialog(null,"Estudiante esta inactivo para el curso");
                    }
                anterior = AuxNodo;
                AuxNodo = AuxNodo.siguiente;
            }        
        }
}




