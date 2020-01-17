/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivos;

import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.stream.Collectors;

/**
 * Grupo 216 G1 
 * Materia: Estructura de datos 
 * Codigo: 1016113251
 * @author Amado Camargo Welver Santiago
 * Proyecto Manejo de Archivos.
 */
public class ManejoArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner guard = new Scanner(System.in);
        int opcion = 0;
        String nombreArchivo = "";
        String texto = "";
        while (opcion != 8) {
            System.out.println("---------* Programa basado en el manejo de archivos (Recuerde que los archvos se guardaran en la carpeta llamada ficheros, si no la tiene primero creela en el disco local C: para usar el programa) *-----------------------------");
            System.out.println("\n1.Crear Archivo\n"
                    + "2.Crear archivo y Escribir(Si el archivo ya esta creado el programa la borrara y creara una nueva con el mismo nombre)\n"
                    + "3.Actualizar Archivo(Seguir Escribiendo)\n"
                    + "4.Consultar Archivo\n"
                    + "5.Eliminar Registro del archivo (Los registros se eliminaran por lineas)\n"
                    + "6.Modificar Registro del archivo\n"
                    + "7.Eliminar Arhivo\n"
                    + "8.Salir\n");
            opcion = guard.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("---------------* Creacion de Archivo *---------------\n");
                    System.out.println("Ingrese el nombre del archivo: ");
                    nombreArchivo = guard.next();
                    CrearArchivo(nombreArchivo);
                    break;
                case 2:
                    System.out.println("---------------* Insercion Archivo (Escribir desde cero)   *---------------\n");
                    System.out.println("Ingrese el nombre del archivo: ");
                    nombreArchivo = guard.next();
                    insertarDatos(nombreArchivo);
                    break;
                case 3:
                    System.out.println("---------------* Actualizar Archivo(Seguir Escribiendo) *---------------\n");
                    System.out.println("Ingrese el nombre del archivo: ");
                    nombreArchivo = guard.next();
                    actualizarArchivo(nombreArchivo);
                    break;
                case 4:
                    System.out.println("---------------* Consultar Archivo (Leer Fichero)*---------------\n");
                    System.out.println("Ingrese el nombre del archivo: ");
                    nombreArchivo = guard.next();
                    consultarArchivo(nombreArchivo);
                    break;
                case 5:
                    System.out.println("---------------* Eliminar Registros del archivo *---------------\n");
                    System.out.println("Ingrese el nombre del archivo: ");
                    nombreArchivo = guard.next();
                    eliminarRegistro(nombreArchivo);
                    break;
                case 6:
                    System.out.println("---------------* Modificar Registros del archivo *---------------\n");
                    System.out.println("Ingrese el nombre del archivo: ");
                    nombreArchivo = guard.next();
                    actualizarRegistro(nombreArchivo);
                    break;
                case 7:
                    System.out.println("---------------* Eliminar archivo *---------------\n");
                    System.out.println("Ingrese el nombre del archivo: ");
                    nombreArchivo = guard.next();
                    eliminarArchivo(nombreArchivo);
                    break;
            }
        }

    }

    /* ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    public static void CrearArchivo(String nombreArchivo) {
        String ruta = "C:\\ficheros\\" + nombreArchivo + ".txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        try {
            if (archivo.exists()) {
                bw = new BufferedWriter(new FileWriter(archivo));
                System.out.println("*************************************\n");
                System.out.println("El fichero esta actualmente creado\n");
                System.out.println("*************************************\n");
            } else {
                bw = new BufferedWriter(new FileWriter(archivo));
                System.out.println("*************************************\n");
                System.out.println("Acaba de Crear un fichero llamado: " + nombreArchivo + "\n");
                System.out.println("*************************************\n");

            }
            bw.close();
        } catch (IOException ex) {
            System.out.println("\n*************************************\n");
            System.out.println("Error al cerrar el archivo");
            System.out.println("\n*************************************\n");
        }
    }

    /* ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    public static void insertarDatos(String nombreArchivo) {
        Scanner guard = new Scanner(System.in);
        File archivo = new File("C:\\ficheros\\" + nombreArchivo + ".txt");
        PrintWriter pw;
        try {
            // Comprobamos si el archivo no existe y si es asi creamos uno nuevo.
            if (!archivo.exists()) {
                System.out.println("El Archivo no existe");
            } else {
                pw = new PrintWriter(archivo);
                System.out.println("Ingrese el texto, introduzca la palabra *fin* para terminar");
                String texto;
                texto = guard.nextLine();
                while (!texto.equalsIgnoreCase("fin")) {
                    pw.println(texto);
                    texto = guard.nextLine();
                }
                pw.close();
            }
        } catch (Exception ex) {
            System.out.println("\n*************************************\n");
            System.out.println("Error al cerrar el archivo");
            System.out.println("\n*************************************\n");
        }

    }

    /* ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    public static void consultarArchivo(String nombreArchivo) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            archivo = new File("C:\\ficheros\\" + nombreArchivo + ".txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            System.out.println("*************************************\n");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            System.out.println("\n*************************************\n");
        } catch (Exception ex) {
            System.out.println("\n*************************************\n");
            System.out.println("El Archivo no existe");
            System.out.println("\n*************************************\n");
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception ex) {
                System.out.println("\n*************************************\n");
                System.out.println("Error al cerrar el archivo");
                System.out.println("\n*************************************\n");
                ex.printStackTrace();
            }
        }
    }
    /* ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    public static void actualizarArchivo(String nombreArchivo) {
        Scanner guard = new Scanner(System.in);
        File archivo = new File("C:\\ficheros\\" + nombreArchivo + ".txt");
        FileWriter fichero = null;
        try {
            fichero = new FileWriter("C:\\ficheros\\" + nombreArchivo + ".txt", true);
        } catch (IOException ex) {
            System.out.println("\n*************************************\n");
            System.out.println("El Archivo no existe");
            System.out.println("\n*************************************\n");
        }
        PrintWriter pw;
        try {
            if (!archivo.exists()) {
                System.out.println("\n*************************************\n");
                System.out.println("El Archivo no existe");
                System.out.println("\n*************************************\n");
            } else {
                pw = new PrintWriter(fichero);
                System.out.println("Ingrese el texto, introduzca la palabra *fin* para terminar");
                String texto;
                texto = guard.nextLine();
                while (!texto.equalsIgnoreCase("fin")) {
                    pw.println(texto);
                    texto = guard.nextLine();
                }
                pw.close();
            }
        } catch (Exception ex) {
            System.out.println("\n*************************************\n");
            System.out.println("Error al cerrar el archivo");
            System.out.println("\n*************************************\n");
        }

    }
    /* ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    public static void eliminarRegistro(String nombreArchivo) {
        try {
            Scanner guard = new Scanner(System.in);
            System.out.println("Ingrese el dato que quiere borrar");
            String textoAEliminar = guard.nextLine();
            File file = new File("C:\\ficheros\\" + nombreArchivo + ".txt");
            List<String> out = Files.lines(file.toPath())
                    .filter(line -> !line.contains(textoAEliminar))
                    .collect(Collectors.toList());
            Files.write(file.toPath(), out, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);

            System.out.println("\n*************************************\n");
            System.out.println("Acaba de borrar el registro " + textoAEliminar + " Satisfactoriamente");
            System.out.println("\n*************************************\n");
        } catch (IOException ex) {
            System.out.println("\n*************************************\n");
            System.out.println("El archivo a buscar no existe o hubo algun error de ejecucion porfavor intente nuevamente");
            System.out.println("\n*************************************\n");
        }

    }
    /* ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    public static void actualizarRegistro(String nombreArchivo) {
        try {
            File file = new File("C:\\ficheros\\" + nombreArchivo + ".txt");
            List<String> ContenidoF = new ArrayList<>(Files.readAllLines(file.toPath(), StandardCharsets.UTF_8));
            Scanner guard = new Scanner(System.in);
            System.out.println("Ingrese la palabra que quiere modificar");
            String textoAModificar = guard.nextLine();
            String line = textoAModificar;
            String textoAnteriorAct = line;
            for (int i = 0; i < ContenidoF.size(); i++) {
                if (ContenidoF.get(i).equals(line)) {
                    System.out.println("Ingrese la nueva palabra");
                    textoAModificar = guard.nextLine();
                    ContenidoF.set(i, textoAModificar);
                    break;
                }
            }
            Files.write(file.toPath(), ContenidoF, StandardCharsets.UTF_8);
            System.out.println("\n*************************************\n");
            System.out.println("Acaba de  modificar " + textoAnteriorAct + " por " + textoAModificar);
            System.out.println("\n*************************************\n");
        } catch (IOException ex) {
            System.out.println("\n*************************************\n");
            System.out.println("El archivo a buscar no existe o hubo algun error de ejecucion porfavor intente nuevamente");
            System.out.println("\n*************************************\n");
        }
    }
    /* ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    public static void eliminarArchivo(String nombreArchivo) {
        File archivo = new File("C:\\ficheros\\" + nombreArchivo + ".txt");
        if (archivo.delete()) {
            System.out.println("\n*************************************\n");
            System.out.println("Archvio Eliminado");
            System.out.println("\n*************************************\n");
        } else {
            System.out.println("\n*************************************\n");
            System.out.println("El Archivo no Existe o no se pudo Eliminar");
            System.out.println("\n*************************************\n");
        }
    }

}
