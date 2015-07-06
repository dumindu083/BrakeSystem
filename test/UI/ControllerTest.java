/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hp
 */
public class ControllerTest {
    
    public ControllerTest() {
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
     * Test of setIcon method, of class Controller.
     */
    @Test
    public void testSetIcon() {
        System.out.println("setIcon");
        String imageName = "";
        Controller instance = new Controller();
        instance.setIcon(imageName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clearValues method, of class Controller.
     */
    @Test
    public void testClearValues() {
        System.out.println("clearValues");
        Controller instance = new Controller();
        instance.clearValues();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isNumeric method, of class Controller.
     */
    @Test
    public void testIsNumeric() {
        System.out.println("isNumeric");
        String number = "";
        Controller instance = new Controller();
        boolean expResult = false;
        boolean result = instance.isNumeric(number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showWarning method, of class Controller.
     */
    @Test
    public void testShowWarning() {
        System.out.println("showWarning");
        String message = "";
        Controller instance = new Controller();
        instance.showWarning(message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showError method, of class Controller.
     */
    @Test
    public void testShowError() {
        System.out.println("showError");
        String message = "";
        Controller instance = new Controller();
        instance.showError(message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewRules method, of class Controller.
     */
    @Test
    public void testViewRules() {
        System.out.println("viewRules");
        Controller instance = new Controller();
        instance.viewRules();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Controller.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Controller.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawShapes method, of class Controller.
     */
    @Test
    public void testDrawShapes() {
        System.out.println("drawShapes");
        Graphics g = null;
        Controller instance = new Controller();
        instance.drawShapes(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeObject method, of class Controller.
     */
    @Test
    public void testRemoveObject() {
        System.out.println("removeObject");
        Graphics g = null;
        int yCoordinate = 0;
        Controller instance = new Controller();
        instance.removeObject(g, yCoordinate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actionPerformed method, of class Controller.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent e = null;
        Controller instance = new Controller();
        instance.actionPerformed(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paint method, of class Controller.
     */
    @Test
    public void testPaint() {
        System.out.println("paint");
        Graphics g = null;
        Controller instance = new Controller();
        instance.paint(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetGraphics method, of class Controller.
     */
    @Test
    public void testResetGraphics() {
        System.out.println("resetGraphics");
        Graphics g = null;
        Controller instance = new Controller();
        instance.resetGraphics(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
