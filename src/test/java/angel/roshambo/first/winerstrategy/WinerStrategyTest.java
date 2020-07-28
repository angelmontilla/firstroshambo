/*
 * First RoShamBo
 * Creado el 27-jul-2020 a las 22:50:24
 */
package angel.roshambo.first.winerstrategy;

import angel.roshambo.first.enums.EndRoundState;
import static angel.roshambo.first.enums.RoundValue.*;
import static angel.roshambo.first.enums.EndRoundState.*;
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
        System.out.println("=== STARTING --> SIMPLE JUNIT unitary TEST FOR WinnerStrategy ===");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("=== ENDING   --> SIMPLE JUNIT unitary TEST FOR WinnerStrategy ===");
    }
    
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetWinnerN() {
        System.out.println("TESTING getWiner");
        
        WinerStrategy strategy = new WinerStrategy();
        IWinnerStrategy aplyStrategy;
        RoundResult expResult;
        RoundResult result;
        
        // ROCK        
        aplyStrategy = new RockStrategy();
        strategy.Context(aplyStrategy);
        result = new RoundResult(ROCK, ROCK, DRAW);
        expResult = new RoundResult(ROCK, ROCK, EndRoundState.valueOf(strategy.executeStrategy("ROCK")));
        
        assertEquals(expResult, result);
        
        result = new RoundResult(ROCK, SCISSORS, FIRST);
        expResult = new RoundResult(ROCK, SCISSORS, EndRoundState.valueOf(strategy.executeStrategy("SCISSORS")));
        
        assertEquals(expResult, result);
                        
        result = new RoundResult(ROCK, PAPER, SECOND);
        expResult = new RoundResult(ROCK, PAPER, EndRoundState.valueOf(strategy.executeStrategy("PAPER")));
        
        assertEquals(expResult, result);
                
        result = new RoundResult(ROCK, UNKNOWN, UNKNOWED);
        expResult = new RoundResult(ROCK, UNKNOWN, EndRoundState.valueOf(strategy.executeStrategy("UNKNOWN")));
        
        assertEquals(expResult, result);
        
        // PAPER
        
        aplyStrategy = new PaperStrategy();
        strategy.Context(aplyStrategy);
        result = new RoundResult(PAPER, PAPER, DRAW);
        expResult = new RoundResult(PAPER, PAPER, EndRoundState.valueOf(strategy.executeStrategy("PAPER")));
        
        assertEquals(expResult, result);
        
        result = new RoundResult(PAPER, ROCK, FIRST);
        expResult = new RoundResult(PAPER, ROCK, EndRoundState.valueOf(strategy.executeStrategy("ROCK")));
        
        assertEquals(expResult, result);
        
        result = new RoundResult(PAPER, SCISSORS, SECOND);
        expResult = new RoundResult(PAPER, SCISSORS, EndRoundState.valueOf(strategy.executeStrategy("SCISSORS")));
        
        assertEquals(expResult, result);

        result = new RoundResult(PAPER, UNKNOWN, UNKNOWED);
        expResult = new RoundResult(PAPER, UNKNOWN, EndRoundState.valueOf(strategy.executeStrategy("UNKNOWN")));
        
        assertEquals(expResult, result);
        
        // SCISSORS
        
        aplyStrategy = new ScissorsStrategy();
        strategy.Context(aplyStrategy);
        result = new RoundResult(SCISSORS, SCISSORS, DRAW);
        expResult = new RoundResult(SCISSORS, SCISSORS, EndRoundState.valueOf(strategy.executeStrategy("SCISSORS")));
        
        assertEquals(expResult, result);
        
        result = new RoundResult(SCISSORS, PAPER, FIRST);
        expResult = new RoundResult(SCISSORS, PAPER, EndRoundState.valueOf(strategy.executeStrategy("PAPER")));
        
        assertEquals(expResult, result);
        
        result = new RoundResult(SCISSORS, ROCK, SECOND);
        expResult = new RoundResult(SCISSORS, ROCK, EndRoundState.valueOf(strategy.executeStrategy("Rock")));
        
        assertEquals(expResult, result);
        
        result = new RoundResult(SCISSORS, UNKNOWN, UNKNOWED);
        expResult = new RoundResult(SCISSORS, UNKNOWN, EndRoundState.valueOf(strategy.executeStrategy("Unknow")));
        
        assertEquals(expResult, result);

    }
    
    
}
