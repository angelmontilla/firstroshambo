/*
 * First RoShamBo
 * Creado el 26-jul-2020 a las 17:07:11
 */
package angel.roshambo.first.round;

import angel.roshambo.first.roundresult.RoundResult;
import org.springframework.stereotype.Service;

import angel.roshambo.first.enums.EndRoundState;
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
        Mono<RoundResult> res;
        
        
        
        RoundResult rrRes = new RoundResult();
        
        rrRes.setFirstUser(moves.getFirstPlayer());
        rrRes.setSecondUser(moves.getSecondPlayer());
        rrRes.setRoundResult(EndRoundState.FIRST);
        
        res = Mono.just(rrRes);
        
        return res;
    }
}
