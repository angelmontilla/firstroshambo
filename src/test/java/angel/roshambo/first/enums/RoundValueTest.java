/*
 * First RoShamBo
 * Creado el 26-jul-2020 a las 23:38:27
 */
package angel.roshambo.first.enums;

import static angel.roshambo.first.enums.RoundValue.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
        System.out.println("TESTING values()");
        RoundValue[] expResult = {ROCK, PAPER, SCISSORS, UNKNOWN};
        RoundValue[] result = RoundValue.values();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of valueOf method, of class RoundValue.
     */
    @Test
    public void testValueOf() {
        System.out.println("TESTING valueOf()");

        RoundValue expResult = ROCK;
        RoundValue result = RoundValue.valueOf("ROCK");
        assertEquals(expResult, result);
        
        expResult = PAPER;
        result = RoundValue.valueOf("PAPER");
        assertEquals(expResult, result);
        
        expResult = SCISSORS;
        result = RoundValue.valueOf("SCISSORS");
        assertEquals(expResult, result);        
        
        expResult = UNKNOWN;
        result = RoundValue.valueOf("PAPER");
        assertNotEquals(expResult, result);
    }

    /**
     * Test ValueOf exceptions
     */
    @Test
    public void testExceptionValueOf() {
        System.out.println("TESTING ValueOf exception");
        
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            RoundValue iR = RoundValue.valueOf("Potato");
        });
        
        assertTrue(exception.getMessage().contains("Potato"));
    }

    /**
     * Test of toString method, of class RoundValue.
     */
    @Test
    public void testToString() {
        System.out.println("TESTING toString()");
        
        RoundValue instance = ROCK;
        String expResult = "Rock";
        String result = instance.toString();
        assertEquals(expResult, result);
        
        instance = PAPER;
        expResult = "Paper";
        result = instance.toString();
        assertEquals(expResult, result);
        
        instance = RoundValue.valueOf("SCISSORS");
        expResult = "Scissors";
        result = instance.toString();
        assertEquals(expResult, result);        
    }
    
}
