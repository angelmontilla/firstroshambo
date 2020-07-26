/*
 * First RoShamBo
 * Creado el 26-jul-2020 a las 11:08:31
 */
package angel.roshambo.first.enums;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import static angel.roshambo.first.enums.EndRoundStatus.*;

/**
 *
 * @author Angel
 */
public class EndRoundStatusTest {
    
    public EndRoundStatusTest() {
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
     * Test of values method, of class EndRoundStatus.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        EndRoundStatus[] expResult = {FIRST, SECOND, DRAW, UNKNOWN};                   
        EndRoundStatus[] result = EndRoundStatus.values();
        
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of valueOf method, of class EndRoundStatus.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "FIRST";
        EndRoundStatus expResult = FIRST;
        EndRoundStatus result = EndRoundStatus.valueOf(name);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class EndRoundStatus.
     */
    @Test
    public void testToString() {
        System.out.println("toString");

        String expResult = "";
        
        for (EndRoundStatus egs: EndRoundStatus.values())
            expResult += " " + egs.toString();
        
        EndRoundStatus instance = FIRST;
        String result = " " + instance.toString();
        instance = SECOND;
        result += " " + instance.toString();
        instance = DRAW;
        result += " " + instance.toString();
        instance = UNKNOWN;
        result += " " + instance.toString();        
        
        assertEquals(expResult, result);
    }
    
}
