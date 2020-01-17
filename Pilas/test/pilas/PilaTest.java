/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

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
public class PilaTest {
    
    public PilaTest() {
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
     * Test of Pila method, of class Pila.
     */

    /**
     * Test of esVacia method, of class Pila.
     */
    @Test
    public void testEsVacia() {
        System.out.println("esVacia");
        Pila instance = new Pila();
        boolean expResult = true;
        boolean result = instance.esVacia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTam method, of class Pila.
     */
    @Test
    public void testGetTam() {
        System.out.println("getTam");
        Pila instance = new Pila();
        int expResult = 0;
        int result = instance.getTam();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testBuscarElemento() {
        System.out.println("buscarElemento");
        int refDato = 0;
        Pila instance = new Pila();
        boolean expResult = false;
        boolean result = instance.buscarElemento(refDato);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
}
