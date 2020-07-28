/*
 * First RoShamBo
 * Creado el 26-jul-2020 a las 17:07:11
 */
package angel.roshambo.first.round;

import angel.roshambo.first.enums.EndRoundState;
import angel.roshambo.first.roundresult.RoundResult;
import org.springframework.stereotype.Service;

import angel.roshambo.first.enums.RoundValue;
import static angel.roshambo.first.enums.RoundValue.*;
import static angel.roshambo.first.enums.EndRoundState.*;
import angel.roshambo.first.winerstrategy.IWinnerStrategy;
import angel.roshambo.first.winerstrategy.PaperStrategy;
import angel.roshambo.first.winerstrategy.RockStrategy;
import angel.roshambo.first.winerstrategy.ScissorsStrategy;
import angel.roshambo.first.winerstrategy.WinerStrategy;
import reactor.core.publisher.Mono;

/**
 * <strong>RoundService</strong> Service o component for resolve Roshambo requests
 * <p>In the first aproach to Roshambo with no state machine it's so simple</p>
 * @author Angel
 * @see RoundResult
 * @see GameLogic
 */
@Service
public class RoundService {

    /**
     * <strong>whoIsWinner</strong>
     * @param moves - moves recieved from player
     * @return Mono - that preserves move and result
     * @see RoundResult
     */
    public Mono<RoundResult> whoIsWinner(Round moves){        
        RoundResult res = new RoundResult(UNKNOWN, UNKNOWN, UNKNOWED);        
        
        if (moves.getFirstPlayer() != UNKNOWN && moves.getSecondPlayer() != UNKNOWN) {            
            WinerStrategy strategy = new WinerStrategy();
            IWinnerStrategy aplyStrategy = null;
            
            if (moves.getFirstPlayer() == ROCK)
                aplyStrategy = new RockStrategy();

            if (moves.getFirstPlayer() == PAPER)
                aplyStrategy = new PaperStrategy();

            if (moves.getFirstPlayer() == SCISSORS)
                aplyStrategy = new ScissorsStrategy();

            strategy.Context(aplyStrategy);
            res.setFirstUser(moves.getFirstPlayer());
            res.setSecondUser(moves.getSecondPlayer());
            res.setRoundResult(EndRoundState.valueOf(strategy.executeStrategy(moves.getSecondPlayer().toString())));
        }               
        
        return Mono.just(res);
    }
    
    /**
     * <strong>whoIsWinner</strong> Creates an object for indeterminated state
     * @return Mono - For indetermination
     * @see RoundResult
     * @see RoundValue
     * @see reactor.core.publisher.Mono
     */
    public Mono<RoundResult> winnerIsError(){
        Mono<RoundResult> res;

        RoundResult rrRes = new RoundResult();
        
        rrRes.setFirstUser(RoundValue.UNKNOWN);
        rrRes.setSecondUser(RoundValue.UNKNOWN);
        rrRes.setRoundResult(EndRoundState.UNKNOWED);
        
        res = Mono.just(rrRes);
        
        return res;
    }
    
}
