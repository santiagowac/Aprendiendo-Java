/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

import java.util.Scanner;

/**
 * curso: Estructura de datos
 * codigo: 1016113251
 * @author Welver Santiago Amado Camargo
 * Proyecto : Manejo de Pilas
 * 
 */
public class Pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Pila pila = new Pila();
         
        Scanner guard = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 9) {
            System.out.println("---------* Programa basado en el manejo de Pilas *-----------------------------");
            System.out.println("\n1.Crear Pila\n"
                    + "2.Eliminar elemento que se encuentra en la cima de la Pila\n"
                    + "3.Actualizar Valor Dentro de la Pila\n"
                    + "4.Eliminar Valor dentro de la Pila\n"
                    + "5.Buscar Valor en la Pila\n"
                    + "6.Eliminar Pila(Eliminar Todo)\n"
                    + "7.Consultar estado de la pila(Existe o no)\n"
                    + "8.Imprimir Pila\n"
                    + "9.Salir\n");
            opcion = guard.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("---------------* Crear Pila (Aplilar)  *---------------\n");
                    System.out.println("Ingrese la cantidad de valores a aplilar: ");
                    int Cantidad = guard.nextInt();
                    for(int i = 0; i<Cantidad; i++){
                        System.out.println("Ingrese el valor a aplilar");
                        int valorAp = guard.nextInt();
                        pila.apilarDato(valorAp);
                    }
                    break;
                case 2:
                    System.out.println("---------------* Eliminar cima  *---------------\n");
                    pila.eliminarCima();
                    System.out.println("---* Cima Eliminada *----");
                    break;
                case 3:
                    System.out.println("---------------* Actualizar Valor *---------------\n");
                    System.out.println("Ingrese el valor actual que se encuentra en la pila ");
                    int refDato = guard.nextInt();
                    System.out.println("Ingrese el valor nuevo ");
                    int DatoNuevo = guard.nextInt();
                    pila.editarValor(refDato,DatoNuevo);
                    break;
                case 4:
                    System.out.println("---------------* Eliminar Valor *---------------\n");
                    System.out.println("Ingrese el valor que quiere eliminar: ");
                    int ValElim = guard.nextInt();
                    pila.eliminarValor(ValElim);
                    break;
                case 5:
                    System.out.println("---------------* Buscar Valor *---------------\n");
                    System.out.println("Ingrese el valor que quiere buscar: ");
                    int valB = guard.nextInt();
                    pila.buscarElemento(valB);
                    if (pila.buscarElemento(valB) == true){
                        System.out.println("\nEl valor "+ valB +" se encuentra en la pila\n");
                    }
                    else{
                        System.out.println("\nEl valor "+valB+" no se encuentra en la pila\n");
                    }
                    
                    break;
                case 6:
                    System.out.println("---------------* Eliminar Pila *---------------\n");
                    pila.eliminarPila();
                    System.out.println("\nPila Eliminada\n");
                    break;
                case 7:
                    System.out.println("---------------* Consultar Estado *---------------\n");
                    if(pila.esVacia() == true){
                        System.out.println("\nPila actualmente sin datos\n");
                    }
                    else{
                        System.out.println("\nPila actualmente con datos\n");
                    }
                    break;
                case 8:
                    System.out.println("---------------* Pila Actual *---------------\n");
                    pila.imprimirPila();
                    System.out.println("\n---------------* Tamaño de la Pila *----------------------\n");
                    System.out.println(pila.getTam());
                    break;
            }
        } 
    }
}