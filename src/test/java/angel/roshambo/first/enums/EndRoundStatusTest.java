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

import static angel.roshambo.first.enums.EndRoundState.*;

/**
 * <strong>EndRoundStatusTest</strong> Unitary test for EndRoundState
 * @author Angel
 */
public class EndRoundStatusTest {
    
    public EndRoundStatusTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("=== STARTING --> SIMPLE JUNIT unitary TEST FOR ENUMERATION EndRound Status ===");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("=== ENDING   --> SIMPLE JUNIT unitary TEST FOR ENUMERATION EndRound Status ===");
    }
    
    @Before
    public void setUp() {        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of values method, of class EndRoundState.
     */
    @Test
    public void testValues() {
        System.out.println("TESTING values()");
        EndRoundState[] expResult = {FIRST, SECOND, DRAW, UNKNOWN};                   
        EndRoundState[] result = EndRoundState.values();
        
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of valueOf method, of class EndRoundState.
     */
    @Test
    public void testValueOf() {
        System.out.println("TESTING valueOf()");
        String name = "FIRST";
        EndRoundState expResult = FIRST;
        EndRoundState result = EndRoundState.valueOf(name);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class EndRoundState.
     */
    @Test
    public void testToString() {
        System.out.println("TESTING toString()");

        String expResult = "";
        
        for (EndRoundState egs: EndRoundState.values())
            expResult += " " + egs.toString();
        
        EndRoundState instance = FIRST;
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
