/*
 * First RoShamBo
 * Creado el 26-jul-2020 a las 10:15:57
 */
package angel.roshambo.first.enums;

/**
 * <strong>EndRoundState</strong> Enumerated that describes end-game status.
 * <p>It represents the way game has ended.<br>Extends {@link java.lang.Enum}</p>
 * <p>In the same sense, it converts status toString() for console representation</p>
 * <p>Allowed values</p>
 * <ul>
 * <li><b>FIRST</b> - Represents: First gamer wins</li>
 * <li><b>SECOND</b> - Represents: Second gamer wins</li>
 * <li><b>DRAW</b> - Represents: Tied gamers</li>
 * <li><b>UNKOWN</b> - Represents: Unknown status</li>
 * </ul>
 * @author Angel Montilla
 * @version 0.1
 * @see java.lang.Enum
 */
public enum EndRoundState {
    FIRST("First"), SECOND("Second"), DRAW("Draw"), UNKNOWN("Unknown");
    
    private final String status;
    
    EndRoundState(String status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return status;
    }    
}
