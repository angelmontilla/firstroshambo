/*
 * First RoShamBo
 * Creado el 26-jul-2020 a las 17:07:11
 */
package angel.roshambo.first.round;

import angel.roshambo.first.roundresult.RoundResult;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import angel.roshambo.first.enums.EndRoundState;
import reactor.core.publisher.Mono;

/**
 *
 * @author Angel
 */
@Service
public class RoundService {
    
    
    @Async
    public Mono<RoundResult> whoIsWinner(Round moves){
        Mono<RoundResult> res;
        
        RoundResult rrRes = new RoundResult();
        
        rrRes.firstUser = moves.firstPlayer;
        rrRes.firstUser = moves.secondPlayer;
        rrRes.roundResult = EndRoundState.FIRST;
        
        res = Mono.just(new RoundResult());
        
        return res;
    }
}
