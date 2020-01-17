/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author io
 */
public class Colas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cola cola = new Cola();
        Scanner guard = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 9) {
            System.out.println("\n1.Encolar datos de un fichero\n"
                    + "2.Desencolar primer dato descendiente de el fichero\n"
                    + "3.Imprimir cola\n"
                    + "4.Borrar toda la cola\n"
                    + "9.Salir\n");
            opcion = guard.nextInt();

            switch (opcion) {
                
                case 1:
                    System.out.println("---------------* Realizar la inserción de los datos del archivo *---------------\n");
                    try {
                        File file = new File("C:\\ficheros\\h.txt");
                        List<String> ContenidoF = new ArrayList<>(Files.readAllLines(file.toPath(), StandardCharsets.UTF_8));
                        System.out.println("Numero de pedidos totales " + ContenidoF.size());
                        for (int x = 0; x < ContenidoF.size(); x++) {
                            String linea = ContenidoF.get(x);
                            cola.insertarElementoPut(linea);
                        }
                        System.out.println("Los elementos del archivo fueron satisfacoriamente encolados.\n");

                    } catch (IOException ex) {
                        System.out.println("\n*************************************\n");
                        System.out.println("El archivo a buscar no existe o hubo algun error de ejecucion porfavor intente nuevamente");
                        System.out.println("\n*************************************\n");
                    }
                    break;
                case 2:
                    System.out.println("---------------* Desencolar pedido *---------------\n");
                    cola.borrarelemetoGet();
                    System.out.println("Se desencolo el primer pedido de la cola");
                    break;
                case 3:
                    System.out.println("---------------* Impresión de los pedidos *---------------\n");
                    cola.imprimir();
                    break;
                case 4:
                    System.out.println("---------------* vaciar   *---------------\n");
                    cola.vaciar();
                    System.out.println("Los elementos de toda la cola fueron eliminados");
                    break;
            }
        }

    }

}
