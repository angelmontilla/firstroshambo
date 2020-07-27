/*
 * First RoShamBo
 * Creado el 27-jul-2020 a las 22:43:33
 */
package angel.roshambo.first.winerstrategy;

import angel.roshambo.first.enums.EndRoundState;
import angel.roshambo.first.enums.RoundValue;
import angel.roshambo.first.round.Round;
import angel.roshambo.first.roundresult.RoundResult;

/**
 * <strong>WinerStrategy</strong> Following SOLID pattern we area going to <br>uncople
 * Round and RoundResult classes.
 * <p>This class after a TDD process will be translated to an Strategy design pattern</p>
 * @author Angel
 */
public class WinerStrategy {
    public RoundResult getWiner(Round theRound) {
        RoundResult res = new RoundResult();
        
        switch(theRound.getFirstPlayer()) {
            case ROCK: {
                switch(theRound.getSecondPlayer()) {
                    case ROCK:
                        res.setFirstUser(RoundValue.ROCK);
                        res.setSecondUser(RoundValue.ROCK);
                        res.setRoundResult(EndRoundState.DRAW);
                        break;
                }
                break;
            }
            case PAPER:
            case SCISSORS:
                res.setFirstUser(RoundValue.UNKNOWN);
                res.setSecondUser(RoundValue.UNKNOWN);
                res.setRoundResult(EndRoundState.UNKNOWN);
        }
        
        return res;
    }
}
