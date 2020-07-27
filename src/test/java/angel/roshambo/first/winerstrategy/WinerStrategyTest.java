/*
 * First RoShamBo
 * Creado el 27-jul-2020 a las 22:50:24
 */
package angel.roshambo.first.winerstrategy;

import angel.roshambo.first.enums.EndRoundState;
import angel.roshambo.first.enums.RoundValue;
import angel.roshambo.first.round.Round;
import angel.roshambo.first.roundresult.RoundResult;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

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
     * 1st Test of getWiner method, of class WinerStrategy.
     */
    @Ignore
    @Test    
    public void testGetWiner1() {
        System.out.println("getWiner");
        Round theRound = new Round();
        theRound.setFirstPlayer(RoundValue.UNKNOWN);
        theRound.setSecondPlayer(RoundValue.UNKNOWN);
        WinerStrategy instance = new WinerStrategy();
        
        RoundResult result = instance.getWiner(theRound);
        
        RoundResult expResult = new RoundResult();
        expResult.setFirstUser(RoundValue.UNKNOWN);
        expResult.setSecondUser(RoundValue.UNKNOWN);
        expResult.setRoundResult(EndRoundState.UNKNOWN);
        
        assertEquals(expResult, result);
    }
    
    /**
     * 2nd Test of getWiner method, of class WinerStrategy.
     */
    @Test    
    public void testGetWiner2() {
        System.out.println("getWiner");
        Round theRound = new Round();
        theRound.setFirstPlayer(RoundValue.ROCK);
        theRound.setSecondPlayer(RoundValue.ROCK);
        WinerStrategy instance = new WinerStrategy();
        
        RoundResult result = instance.getWiner(theRound);
        
        RoundResult expResult = new RoundResult();
        expResult.setFirstUser(RoundValue.ROCK);
        expResult.setSecondUser(RoundValue.ROCK);
        expResult.setRoundResult(EndRoundState.DRAW);
        
        assertEquals(expResult, result);
    }
    
    
}
