/*
 * First RoShamBo
 * Creado el 26-jul-2020 a las 23:38:27
 */
package angel.roshambo.first.enums;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Angel
 */
public class RoundValueTest {
    
    public RoundValueTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("=== STARTING --> SIMPLE JUNIT unitary TEST FOR ENUMERATION RoundValue Status ===");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("=== ENDING   --> SIMPLE JUNIT unitary TEST FOR ENUMERATION RoundValue Status ===");
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of values method, of class RoundValue.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        RoundValue[] expResult = null;
        RoundValue[] result = RoundValue.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class RoundValue.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        RoundValue expResult = null;
        RoundValue result = RoundValue.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class RoundValue.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        RoundValue instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
