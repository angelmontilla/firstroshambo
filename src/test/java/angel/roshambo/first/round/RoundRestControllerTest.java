/*
 * First RoShamBo
 * Creado el 28-jul-2020 a las 13:40:15
 */
package angel.roshambo.first.round;

import angel.roshambo.first.enums.EndRoundState;
import angel.roshambo.first.enums.RoundValue;
import angel.roshambo.first.roundresult.RoundResult;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.mockito.Mockito.when;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Mono;

/**
 *
 * @author Angel
 */
@RunWith(SpringRunner.class)
@WebFluxTest(RoundRestController.class)
public class RoundRestControllerTest {
    
    @Autowired
    WebTestClient webTestClient;
    
    @MockBean
    private RoundService theService;
    
    public RoundRestControllerTest() {
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
     * Test of theRound method, of class RoundRestController.
     */
    @Test
    public void testTheRound() {
        System.out.println("theRound");
        
        RoundResult rr = new RoundResult(RoundValue.PAPER, RoundValue.ROCK, EndRoundState.FIRST);
        Mono<RoundResult> monoRr = Mono.just(rr);
        
        when (theService.winnerIsError()).thenReturn(monoRr);
        
        webTestClient.get()
                .uri("/roshambo/playround?r1=Paper&r2=Rock")
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .expectStatus().isOk()
                .expectBody(RoundResult.class)
                .isEqualTo(rr);
    }
    
    /**
     * Test of theRound method, of class RoundRestController.
     */
    @Test
    public void testTheRoundFails() {
        System.out.println("theRound fails");
        
        RoundResult rr = new RoundResult(RoundValue.UNKNOWN, RoundValue.UNKNOWN, EndRoundState.UNKNOWED);
        Mono<RoundResult> monoRr = Mono.just(rr);
        
        when (theService.winnerIsError()).thenReturn(monoRr);
        
        webTestClient.get()
                .uri("/roshambo/playround?r1=John&r2=Patrick")
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .expectStatus().isOk()
                .expectBody(RoundResult.class)
                .isEqualTo(rr);        
    }    
}
