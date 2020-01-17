/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reporteproduccion;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yasuly
 */
public class ReporteProduccionTest {
    
    public ReporteProduccionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of solicitarMesesACalcular method, of class ReporteProduccion.
     */
    @Test
    public void testSolicitarMesesACalcular() {
        System.out.println("solicitarMesesACalcular");
        ReporteProduccion instance = new ReporteProduccion();
        int expResult = 0;
        int result = instance.solicitarMesesACalcular();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    /**
     * Test of solicitarProduccion method, of class ReporteProduccion.
     */
    @Test
    public void testSolicitarProduccion() {
        System.out.println("solicitarProduccion");
        int[][] meses = null;
        String[] obreros = null;
        int numO = 0;
        int mesC = 0;
        ReporteProduccion instance = new ReporteProduccion();
        instance.solicitarProduccion(meses, obreros, numO, mesC);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularProduccionPorObrero method, of class ReporteProduccion.
     */
    @Test
    public void testCalcularProduccionPorObrero() {
        System.out.println("calcularProduccionPorObrero");
        int[][] meses = null;
        int numO = 0;
        int mesC = 0;
        int[] prod = null;
        ReporteProduccion instance = new ReporteProduccion();
        instance.calcularProduccionPorObrero(meses, numO, mesC, prod);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularProduccionTotal method, of class ReporteProduccion.
     */
    @Test
    public void testCalcularProduccionTotal() {
        System.out.println("calcularProduccionTotal");
        int[] prod = null;
        int numO = 0;
        ReporteProduccion instance = new ReporteProduccion();
        int expResult = 0;
        int result = instance.calcularProduccionTotal(prod, numO);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
}
