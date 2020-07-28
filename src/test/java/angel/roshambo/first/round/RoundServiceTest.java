/*
 * First RoShamBo
 * Creado el 28-jul-2020 a las 9:20:48
 */
package angel.roshambo.first.round;

import angel.roshambo.first.roundresult.RoundResult;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import reactor.core.publisher.Mono;

/**
 *
 * @author Angel
 */
public class RoundServiceTest {
    
    public RoundServiceTest() {
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
     * Test of whoIsWinner method, of class RoundService.
     */
    @Test
    public void testWhoIsWinner() {
        System.out.println("whoIsWinner");
        Round moves = null;
        RoundService instance = new RoundService();
        Mono<RoundResult> expResult = null;
        Mono<RoundResult> result = instance.whoIsWinner(moves);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of winnerIsError method, of class RoundService.
     */
    @Test
    public void testWinnerIsError() {
        System.out.println("winnerIsError");
        RoundService instance = new RoundService();
        Mono<RoundResult> expResult = null;
        Mono<RoundResult> result = instance.winnerIsError();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
