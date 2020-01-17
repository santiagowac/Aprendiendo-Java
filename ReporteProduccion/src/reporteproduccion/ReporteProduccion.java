/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reporteproduccion;

import java.util.Scanner;

/**
 *
 * @author yasuly
 */
public class ReporteProduccion {

    /**
    Curso 216 G2 Noche.
    *  Materia Estructura de datos.
    * Codigo 1016113251.
    * @author Amado Camargo Welver Santiago.
    * *******************************************************************************************************************************************************
    * Elaborar un algoritmo que lea estos datos en dos arreglos: 
    * uno unidimensional para los nombres de los 20 obreros 
    * otro bidimensional en el que se tendrán 20 renglones (uno paracada obrero) por 6 columnas (una para la producción de cada mes):
    * *******************************************************************************************************************************************************
    * Se pretende realizar el siguiente programa basado en la Programacion orientada a objetos.
    */
    public static void main(String[] args) {
        /* Declaracion de variables */
        int numObreros;
        int mesesCal;
        int totalProduccionObrero;
        /* Declaracion de la calse ReportePorudccion para poder Hacer llamado de todos los metodos creados */
         /* PSDT: !TODOS LOS METODOS SE LLAMAN MEDIANTE EL USO DE EL REFERENCIADOR "rP" seguido de un punto ejem rP.metodo¡*/
        ReporteProduccion rP = new ReporteProduccion();
        rP.hacerIntro();
        numObreros = rP.solicitarNumeroDeObreros(); 
        mesesCal = rP.solicitarMesesACalcular();
        String[] obreros = new String[numObreros];
        int[][] meses = new int[numObreros][mesesCal];
        int[] produccion = new int[numObreros];
        rP.solicitarNombresObreros(obreros, numObreros);
        rP.solicitarProduccion(meses, obreros, numObreros, mesesCal);
        rP.calcularProduccionPorObrero(meses, numObreros, mesesCal, produccion);
        totalProduccionObrero = rP.calcularProduccionTotal(produccion, numObreros);
        rP.imprimirProduccion(meses, obreros, produccion, numObreros, mesesCal, totalProduccionObrero);
    }
    //******************************************************************************************************************************************************************************************************
    //******************************************************************************************************************************************************************************************************
    //******************************************************************************************************************************************************************************************************
    //******************************************************************************************************************************************************************************************************
    //******************************************************************************************************************************************************************************************************
    //******************************************************************************************************************************************************************************************************
    
    
    
    
    
    
    /*                                                  Metodo que imprime la explicacion del programa                                                   */
    public void hacerIntro(){
        System.out.println("<-------------------------------- Bienvenido, este es un programa para calcular la produccion de ´x´ cantidad de obreros en ´x´ cantidad de meses -------------------------------> ");
    }
    /*                                                  Metodo que Solicita la cantidad de obreros que produciran                                        */
    public int solicitarNumeroDeObreros(){
        int numO;
        Scanner guard = new Scanner(System.in);
        System.out.println("Ingrese el numero de obreros");
        numO = guard.nextInt();
        return numO;   
    }
     /*                                                  Metodo que Solicita la cantidad de obreros que produciran                                        */
    public int solicitarMesesACalcular(){
        int mesCal;
        Scanner guard = new Scanner(System.in);
        System.out.println("Ingrese el numero de meses a calcular");
        mesCal = guard.nextInt();
        return mesCal;
    }
     /*                                                  Metodo que Solicita el nombre de los obreros que produciran (llena la matriz obrero)                      */
    public void solicitarNombresObreros(String obreros[], int numO){
        int x;
        Scanner guard = new Scanner(System.in);
        for(x=0;x<numO;x++){
        System.out.println("El nombre de el obrero numero "+(x+1));
        obreros[x] = guard.next();
        }        
    }
       /*                                                  Metodo que Solicita la produccion: es decir que llena la matris meses mediante un para anidado                */
    public void solicitarProduccion(int meses[][],String obreros[], int numO, int mesC){
        int x,y;
        Scanner guard = new Scanner(System.in);
        for(x=0; x<numO; x++){
            for(y=0; y<mesC;y++){
                System.out.println("Ingrese la produccion para el obrero numero "+ (x+1)+" es decir "+ obreros[x]+" en el mes "+(y+1));
                meses[x][y] = guard.nextInt();
                
            }
        }
    }
       /*                                                  Metodo que calcula la produccion por cada obrero mediante un para anidado                */ 
    public void calcularProduccionPorObrero(int meses[][], int numO, int mesC, int prod[]){
        int prodO ;
        int x,y;
        for(x=0; x<numO; x++){
            prodO = 0;
            for(y=0; y<mesC;y++){
                prodO = prodO + meses[x][y];
            }
            prod[x] = prodO;
        }
       
    }
      /*                                                  Metodo que calcula la produccion total que realizaron todos los obreros               */
    public int calcularProduccionTotal(int prod[],int numO){
        int totP = 0;
        int x;
        for(x=0;x<numO;x++){
         totP = totP + prod[x];
        }  
        return totP;
    }
      /*                                                  Metodo que imprime el informe solicitado mediante un para anidado                          */
    public void imprimirProduccion(int meses[][], String obreros[],int prod[], int numO, int mesC, int totP){
        int x,y;
        for(x=0; x<numO; x++){
            for(y=0; y<mesC;y++){
                
                System.out.println(obreros[x]+" Produjo "+meses[x][y]+"$ en el mes "+(y+1));
                
            }
            System.out.println("Con un total de "+prod[x]+"\n");
        }
        System.out.println("\nEl total producido por todos los obreros fue "+ totP+"$");
    }
    
    
}
