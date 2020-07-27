/*
 * First RoShamBo
 * Created 26-jul-2020 a las 17:07:40
 */
package angel.roshambo.first.round;

import angel.roshambo.first.roundresult.RoundResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import reactor.core.publisher.Mono;

import angel.roshambo.first.enums.RoundValue;
import static angel.roshambo.first.enums.RoundValue.UNKNOWN;

/**
 * <b>RoundRestController</b> Is a Rest controller for getting a round result.
 * <p>In this first aproximation to rock-paper-scissors it is not necesary<br>
 * using more patter design that Publisher/Subscriber, IoC where we are using<br>
 * a non-blocking, asynchronous and event directed service</p>
 * @author Angel
 */
@RestController()
@RequestMapping(path="/roshambo", 
                consumes=MediaType.APPLICATION_JSON_VALUE,
                produces=MediaType.APPLICATION_JSON_VALUE)
public class RoundRestController {
    
    @Autowired
    private RoundService theService;
    
    /**
     * <strong>theRound</strong> 
     * @param <error>
     * @param firstPlayer
     * @param secondPlayer
     * @return 
     */
//    @RequestMapping(value="/playround/{first}/{second}", method = RequestMethod.GET, produces = "" )
//    @ResponseBody
//    public Mono<RoundResult> theRound(@PathVariable String firstPlayer, @PathVariable String secondPlayer) {
//        
//    }
    

    /**
     * 
     * @param firstMove
     * @param secondMove
     * @return 
     */
    @GetMapping("/playround")
    @ResponseBody
    public Mono<RoundResult> theRound(@RequestParam(value="r1") String firstMove, @RequestParam(value="r2", defaultValue = "ROCK") String secondMove) {
        Round round = new Round();
        RoundValue rv1;
        RoundValue rv2;
        
        try {
            rv1 = RoundValue.valueOf(firstMove);
        } catch(IllegalArgumentException ex) {
            rv1 = UNKNOWN;
        }
        
        try {
            rv2 = RoundValue.valueOf(secondMove);
        } catch(IllegalArgumentException ex) {
            rv2 = UNKNOWN;
        }
        
        if (rv1 != UNKNOWN && rv2 != UNKNOWN) {
            round.firstPlayer = rv1;
            round.secondPlayer = rv2;
        } else {
            
        }
        
               
        return theService.whoIsWinner(round);
    }
    
}
