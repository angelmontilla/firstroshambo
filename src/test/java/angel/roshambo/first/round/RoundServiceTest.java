/*
 * First RoShamBo
 * Creado el 28-jul-2020 a las 9:20:48
 */
package angel.roshambo.first.round;

import angel.roshambo.first.enums.EndRoundState;
import angel.roshambo.first.enums.RoundValue;
import angel.roshambo.first.roundresult.RoundResult;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import reactor.core.publisher.Mono;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import reactor.test.StepVerifier;

/**
 *
 * @author Angel
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class RoundServiceTest {
    
    @Autowired
    private RoundService theService;
    
    public RoundServiceTest() {
    }    
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("=== STARTING --> SIMPLE JUNIT unitary TEST FOR RoundService ===");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("=== ENDING   --> SIMPLE JUNIT unitary TEST FOR RoundService ===");
    }
    
    
    /**
     * Test of winnerIsError method, of class RoundService.
     */
    @Test
    public void testWinnerIsError() {        
        System.out.println("winnerIsError()");
        Mono<RoundResult> expResult = theService.winnerIsError();
        RoundResult rr = new RoundResult(RoundValue.UNKNOWN,RoundValue.UNKNOWN,EndRoundState.UNKNOWED);
        
        StepVerifier.create(expResult).expectNext(rr).verifyComplete();
    }
    
    /**
     * Test of whoIsWinner
     */
    @Test
    public void testWhoIsWinner() {
        System.out.println("whoIsWinner()");
        Round moves = new Round(RoundValue.PAPER, RoundValue.ROCK);
        RoundResult rr = new RoundResult(RoundValue.PAPER, RoundValue.ROCK, EndRoundState.FIRST);
        
        Mono<RoundResult> expResult = theService.whoIsWinner(moves);

        StepVerifier.create(expResult).expectNext(rr).verifyComplete();
        
        
        moves = new Round(RoundValue.PAPER, RoundValue.SCISSORS);
        rr = new RoundResult(RoundValue.PAPER, RoundValue.SCISSORS, EndRoundState.SECOND);
        
        expResult = theService.whoIsWinner(moves);

        StepVerifier.create(expResult).expectNext(rr).verifyComplete();        
    }
    
}
