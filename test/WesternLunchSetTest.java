/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author op7
 */
public class WesternLunchSetTest {
    
    public WesternLunchSetTest() {
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
     * Test of placeOrder method, of class WesternLunchSet.
     */
    @Test
    public void testPlaceOrder() {
	System.out.println("placeOrder");
	Scanner sc = null;
	WesternLunchSet instance = new WesternLunchSet();
	instance.placeOrder(sc);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class WesternLunchSet.
     */
    @Test
    public void testToString() {
	System.out.println("toString");
	WesternLunchSet instance = new WesternLunchSet();
	String expResult = "";
	String result = instance.toString();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of orderDetails method, of class WesternLunchSet.
     */
    @Test
    public void testOrderDetails() {
	System.out.println("orderDetails");
	WesternLunchSet instance = new WesternLunchSet();
	String expResult = "";
	String result = instance.orderDetails();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getMenu method, of class WesternLunchSet.
     */
    @Test
    public void testGetMenu() {
	System.out.println("getMenu");
	WesternLunchSet instance = new WesternLunchSet();
	WesternMenu expResult = null;
	WesternMenu result = instance.getMenu();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }
    
}
