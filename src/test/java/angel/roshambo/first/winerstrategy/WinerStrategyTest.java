/*
 * First RoShamBo
 * Creado el 27-jul-2020 a las 22:50:24
 */
package angel.roshambo.first.winerstrategy;

import angel.roshambo.first.enums.EndRoundState;
import angel.roshambo.first.enums.RoundValue;
import static angel.roshambo.first.enums.RoundValue.*;
import static angel.roshambo.first.enums.EndRoundState.*;
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
        expResult.setRoundResult(EndRoundState.UNKNOWED);
        
        assertEquals(expResult, result);
    }
    
    /**
     * 2nd Test of getWiner method, of class WinerStrategy.
     */
    @Ignore
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
    
    @Test
    public void testGetWinnerN() {
        System.out.println("getWiner");
        WinerStrategy instance = new WinerStrategy();
        RoundResult expResult;
        RoundResult result;
        
        // ROCK
        
        Round theRound = new Round(ROCK, ROCK);                
        result = instance.getWiner(theRound);
        expResult = new RoundResult(ROCK, ROCK, DRAW);
        
        assertEquals(expResult, result);
        
        theRound = new Round(ROCK, PAPER);
        result = instance.getWiner(theRound);
        expResult = new RoundResult(ROCK, PAPER, SECOND);
        
        assertEquals(expResult, result);
        
        theRound = new Round(ROCK, SCISSORS);
        result = instance.getWiner(theRound);
        expResult = new RoundResult(ROCK, SCISSORS, FIRST);
        
        assertEquals(expResult, result);
        
        theRound = new Round(ROCK, UNKNOWN);
        result = instance.getWiner(theRound);
        expResult = new RoundResult(ROCK, UNKNOWN, UNKNOWED);
        
        assertEquals(expResult, result);
        
        // PAPER
        
        theRound = new Round(PAPER, ROCK);
        result = instance.getWiner(theRound);
        expResult = new RoundResult(PAPER, ROCK, FIRST);
        
        assertEquals(expResult, result);
        
        theRound = new Round(PAPER, PAPER);
        result = instance.getWiner(theRound);
        expResult = new RoundResult(PAPER, PAPER, DRAW);
        
        assertEquals(expResult, result);
        
        theRound = new Round(PAPER, SCISSORS);
        result = instance.getWiner(theRound);
        expResult = new RoundResult(PAPER, SCISSORS, SECOND);
        
        assertEquals(expResult, result);

        theRound = new Round(PAPER, UNKNOWN);
        result = instance.getWiner(theRound);
        expResult = new RoundResult(PAPER, UNKNOWN, UNKNOWED);
        
        assertEquals(expResult, result);
        
        // SCISSORS
        
        theRound = new Round(SCISSORS, ROCK);
        result = instance.getWiner(theRound);
        expResult = new RoundResult(SCISSORS, ROCK, SECOND);
        
        assertEquals(expResult, result);
        
        theRound = new Round(SCISSORS, PAPER);
        result = instance.getWiner(theRound);
        expResult = new RoundResult(SCISSORS, PAPER, FIRST);
        
        assertEquals(expResult, result);
        
        theRound = new Round(SCISSORS, SCISSORS);
        result = instance.getWiner(theRound);
        expResult = new RoundResult(SCISSORS, SCISSORS, DRAW);
        
        assertEquals(expResult, result);

        theRound = new Round(SCISSORS, UNKNOWN);
        result = instance.getWiner(theRound);
        expResult = new RoundResult(SCISSORS, UNKNOWN, UNKNOWED);
        
        assertEquals(expResult, result);
        
        // UNKNOWN
        
        theRound = new Round(UNKNOWN, ROCK);
        result = instance.getWiner(theRound);
        expResult = new RoundResult(UNKNOWN, ROCK, UNKNOWED);
        
        assertEquals(expResult, result);
        
        theRound = new Round(UNKNOWN, PAPER);
        result = instance.getWiner(theRound);
        expResult = new RoundResult(UNKNOWN, PAPER, UNKNOWED);
        
        assertEquals(expResult, result);
        
        theRound = new Round(UNKNOWN, SCISSORS);
        result = instance.getWiner(theRound);
        expResult = new RoundResult(UNKNOWN, SCISSORS, UNKNOWED);
        
        assertEquals(expResult, result);

        theRound = new Round(UNKNOWN, UNKNOWN);
        result = instance.getWiner(theRound);
        expResult = new RoundResult(UNKNOWN, UNKNOWN, UNKNOWED);
        
        assertEquals(expResult, result);
    }
    
    
}
