/*
 * First RoShamBo
 * Creado el 27-jul-2020 a las 22:50:24
 */
package angel.roshambo.first.winerstrategy;

import angel.roshambo.first.enums.RoundValue;
import angel.roshambo.first.round.Round;
import angel.roshambo.first.roundresult.RoundResult;
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
public class WinerStrategyTest {
    
    public WinerStrategyTest() {
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
     * Test of getWiner method, of class WinerStrategy.
     */
    @Test
    public void testGetWiner() {
        System.out.println("getWiner");
        Round theRound = new Round();
        theRound.setFirstPlayer(RoundValue.PAPER);
        theRound.setSecondPlayer(RoundValue.ROCK);
        WinerStrategy instance = new WinerStrategy();
        
        RoundResult result = instance.getWiner(theRound);
        
        RoundResult expResult = null;
        
        assertEquals(expResult, result);
    }
    
}
