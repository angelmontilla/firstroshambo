/*
 * First RoShamBo
 * Creado el 26-jul-2020 a las 20:42:19
 */
package angel.roshambo.first.roundresult;

import angel.roshambo.first.enums.EndRoundState;
import angel.roshambo.first.enums.RoundValue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Angel
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RoundResult {
    private RoundValue firstUser;
    private RoundValue secondUser;
    private EndRoundState roundResult;
}
