/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Operaciones;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author aitgal
 */
public class OperacionesTest {
    
    public OperacionesTest() {
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
     * Test of main method, of class Operaciones.
     */
    @Ignore
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Operaciones.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mutiplica method, of class Operaciones.
     */
    @Test
    public void testMutiplica() {
        System.out.println("mutiplica");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = Operaciones.mutiplica(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of factorial method, of class Operaciones.
     */
    @Test
    public void testFactorial() {
        System.out.println("factorial");
        int a = 0;
        int expResult = 0;
        int result = Operaciones.factorial(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of multiplica method with Timeout, of class Operaciones.
     */
    @Test(timeout=1)
    public void testMutiplicatTime() {
        System.out.println("mutiplica");
        int a = 35000;
        int b = 35000;
        int result =
        Operaciones.mutiplica(a, b);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
