/*
 * First RoShamBo
 * Creado el 27-jul-2020 a las 22:43:33
 */
package angel.roshambo.first.winerstrategy;

import angel.roshambo.first.round.Round;
import angel.roshambo.first.roundresult.RoundResult;

import static angel.roshambo.first.enums.RoundValue.*;
import static angel.roshambo.first.enums.EndRoundState.*;

/**
 * <strong>WinerStrategy</strong> Following SOLID pattern we area going to <br>uncople
 * Round and RoundResult classes.
 * <p>This class after a TDD process will be translated to an Strategy design pattern</p>
 * @author Angel
 */
public class WinerStrategy {
    

    public static RoundResult getWiner(Round theRound) {
        RoundResult res = new RoundResult(UNKNOWN, UNKNOWN, UNKNOWED);
        
        switch(theRound.getFirstPlayer()) {
            case ROCK:
                res.setFirstUser(ROCK);
                switch(theRound.getSecondPlayer()) {
                    case ROCK:
                        res.setSecondUser(ROCK);
                        res.setRoundResult(DRAW);
                        break;
                    case PAPER:
                        res.setSecondUser(PAPER);
                        res.setRoundResult(SECOND);
                        break;
                    case SCISSORS:
                        res.setSecondUser(SCISSORS);
                        res.setRoundResult(FIRST);
                        break;                                                
                    default:
                        break;
                }
                break;      
            case PAPER:
                res.setFirstUser(PAPER);
                switch(theRound.getSecondPlayer()) {
                    case ROCK:
                        res.setSecondUser(ROCK);
                        res.setRoundResult(FIRST);
                        break;
                    case PAPER:
                        res.setSecondUser(PAPER);
                        res.setRoundResult(DRAW);                        
                        break;                        
                    case SCISSORS:
                        res.setSecondUser(SCISSORS);
                        res.setRoundResult(SECOND);
                        break;                                                
                    default:
                        break;                        
                }
                break;
            case SCISSORS:
                res.setFirstUser(SCISSORS);
                switch(theRound.getSecondPlayer()) {
                    case ROCK:
                        res.setSecondUser(ROCK);
                        res.setRoundResult(SECOND);
                        break;
                    case PAPER:
                        res.setSecondUser(PAPER);
                        res.setRoundResult(FIRST);
                        break;                        
                    case SCISSORS:
                        res.setSecondUser(SCISSORS);
                        res.setRoundResult(DRAW);                        
                        break;                                                
                    default:
                        break;                        
                }
                break;
            case UNKNOWN:
                switch(theRound.getSecondPlayer()) {
                    case ROCK:
                        res.setSecondUser(ROCK);
                        break;
                    case PAPER:
                        res.setSecondUser(PAPER);
                        break;                        
                    case SCISSORS:
                        res.setSecondUser(SCISSORS);
                        break;                                                
                    default:
                        break;                        
                }
        }
        
        return res;
    }
}
