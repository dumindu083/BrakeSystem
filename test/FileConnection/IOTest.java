/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileConnection;

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
public class IOTest {
    
    public IOTest() {
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
     * Test of getObstacle method, of class IO.
     */
    @Test
    public void testGetObstacle() {
        System.out.println("getObstacle");
        IO instance = new IO();
        double expResult = 0.0;
        double result = instance.getObstacle();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObstacle method, of class IO.
     */
    @Test
    public void testSetObstacle() {
        System.out.println("setObstacle");
        double Obstacle = 0.0;
        IO instance = new IO();
        instance.setObstacle(Obstacle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBrakeForce method, of class IO.
     */
    @Test
    public void testGetBrakeForce() {
        System.out.println("getBrakeForce");
        IO instance = new IO();
        double expResult = 0.0;
        double result = instance.getBrakeForce();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBrakeForce method, of class IO.
     */
    @Test
    public void testSetBrakeForce() {
        System.out.println("setBrakeForce");
        double BrakeForce = 0.0;
        IO instance = new IO();
        instance.setBrakeForce(BrakeForce);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSlipRatio method, of class IO.
     */
    @Test
    public void testGetSlipRatio() {
        System.out.println("getSlipRatio");
        IO instance = new IO();
        double expResult = 0.0;
        double result = instance.getSlipRatio();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSlipRatio method, of class IO.
     */
    @Test
    public void testSetSlipRatio() {
        System.out.println("setSlipRatio");
        double SlipRatio = 0.0;
        IO instance = new IO();
        instance.setSlipRatio(SlipRatio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPWM method, of class IO.
     */
    @Test
    public void testGetPWM() {
        System.out.println("getPWM");
        IO instance = new IO();
        double expResult = 0.0;
        double result = instance.getPWM();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPWM method, of class IO.
     */
    @Test
    public void testSetPWM() {
        System.out.println("setPWM");
        double PWM = 0.0;
        IO instance = new IO();
        instance.setPWM(PWM);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of evalutaePWM method, of class IO.
     */
    @Test
    public void testEvalutaePWM() {
        System.out.println("evalutaePWM");
        IO io = null;
        IO instance = new IO();
        instance.evalutaePWM(io);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of plotGraphs method, of class IO.
     */
    @Test
    public void testPlotGraphs() {
        System.out.println("plotGraphs");
        IO io = null;
        IO instance = new IO();
        instance.plotGraphs(io);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
