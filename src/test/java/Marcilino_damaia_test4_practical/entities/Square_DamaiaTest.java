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
public class Square_DamaiaTest {
    
    public Square_DamaiaTest() {
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
     * Test of getTheLength method, of class Square_Damaia.
     */
    @Test
    public void testGetTheLength() {
        System.out.println("getTheLength");
        Square_Damaia instance = new Square_Damaia();
        Double expResult = null;
        Double result = instance.getTheLength();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTheLength method, of class Square_Damaia.
     */
    @Test
    public void testSetTheLength() {
        System.out.println("setTheLength");
        Double theLength = null;
        Square_Damaia instance = new Square_Damaia();
        instance.setTheLength(theLength);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWidth method, of class Square_Damaia.
     */
    @Test
    public void testGetWidth() {
        System.out.println("getWidth");
        Square_Damaia instance = new Square_Damaia();
        double expResult = 0.0;
        double result = instance.getWidth();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWidth method, of class Square_Damaia.
     */
    @Test
    public void testSetWidth() {
        System.out.println("setWidth");
        double width = 0.0;
        Square_Damaia instance = new Square_Damaia();
        instance.setWidth(width);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printArea method, of class Square_Damaia.
     */
    @Test
    public void testPrintArea() {
        System.out.println("printArea");
        Square_Damaia instance = new Square_Damaia();
        instance.printArea();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
