/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Marcilino_damaia_test4_practical.entities;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author maron
 */
public class Triangle_DamaiaTest {
    
    public Triangle_DamaiaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getBase method, of class Triangle_Damaia.
     */
    @Test
    public void testGetBase() {
        System.out.println("getBase");
        Triangle_Damaia instance = new Triangle_Damaia();
        double expResult = 0.0;
        double result = instance.getBase();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBase method, of class Triangle_Damaia.
     */
    @Test
    public void testSetBase() {
        System.out.println("setBase");
        double base = 0.0;
        Triangle_Damaia instance = new Triangle_Damaia();
        instance.setBase(base);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHeight method, of class Triangle_Damaia.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        Triangle_Damaia instance = new Triangle_Damaia();
        double expResult = 0.0;
        double result = instance.getHeight();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHeight method, of class Triangle_Damaia.
     */
    @Test
    public void testSetHeight() {
        System.out.println("setHeight");
        double height = 0.0;
        Triangle_Damaia instance = new Triangle_Damaia();
        instance.setHeight(height);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printArea method, of class Triangle_Damaia.
     */
    @Test
    public void testPrintArea() {
        System.out.println("printArea");
        Triangle_Damaia instance = new Triangle_Damaia();
        instance.printArea();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
