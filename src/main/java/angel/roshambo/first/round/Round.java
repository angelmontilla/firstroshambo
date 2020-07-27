/*
 * First RoShamBo
 * Creado el 26-jul-2020 a las 20:37:28
 */
package angel.roshambo.first.round;

import angel.roshambo.first.enums.RoundValue;
import lombok.Data;

/**
 * <strong>Round</strong> Following DTO design pattern a Round representation
 * <p>It represents a round send by user</p>
 * <p>It is more simple representation</p>
 * @author Angel
 */
@Data
public class Round {
    private RoundValue firstPlayer;
    private RoundValue secondPlayer;
}
