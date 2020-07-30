/*
 * First RoShamBo
 * Created 26-jul-2020 a las 17:07:40
 */
package angel.roshambo.first.round;

import angel.roshambo.first.roundresult.RoundResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import reactor.core.publisher.Mono;

import angel.roshambo.first.enums.RoundValue;
import static angel.roshambo.first.enums.RoundValue.UNKNOWN;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * <b>RoundRestController</b> Is a Rest controller for getting a round result.
 * <p>In this first aproximation to rock-paper-scissors it is not necesary<br>
 * using more patter design that Publisher/Subscriber, IoC where we are using<br>
 * a non-blocking, asynchronous and event directed service</p>
 * <p>We have open origin for Angular 9 using from local host</p>
 * @author Angel
 */
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController()
@RequestMapping(path="/roshambo")
public class RoundRestController {
    
    @Autowired
    private RoundService theService;
    
    /**
     * <strong>playround</strong>
     * @param firstMove String represents first player move
     * @param secondMove String represents second player move
     * @return RoundResult with play result
     */
    @GetMapping("/playround")
    @ResponseBody
    public Mono<RoundResult> theRound(@RequestParam(value="r1", required = true) String firstMove, @RequestParam(value="r2", defaultValue = "Rock") String secondMove) {
        Mono<RoundResult> res;
                
        RoundValue rv1;
        RoundValue rv2;
        
        // First gamer move
        try {
            rv1 = RoundValue.valueOf(firstMove);
        } catch(IllegalArgumentException ex) {
            rv1 = UNKNOWN;
        }
        
        // Second gamer move
        try {
            rv2 = RoundValue.valueOf(secondMove);
        } catch(IllegalArgumentException ex) {
            rv2 = UNKNOWN;
        }
        
        // Has been an error?
        if (rv1 != UNKNOWN && rv2 != UNKNOWN) {
            
            res = theService.whoIsWinner(new Round(rv1,rv2));
        } else {
            res = theService.winnerIsError();
        }
        
        return res;
    }
    
}
