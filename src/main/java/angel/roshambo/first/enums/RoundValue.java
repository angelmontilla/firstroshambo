/*
 * First RoShamBo
 * Creado el 26-jul-2020 a las 20:15:14
 */
package angel.roshambo.first.enums;

/**
 * <strong>RoundValue</strong> Enumerated that describes Round valid values.
 * <p>It represents the diferents options a gamer can take.<br>Extends {@link java.lang.Enum}</p>
 * <p>In the same sense, it converts options toString() for representation</p>
 * <p>Allowed values</p>
 * <ul>
 * <li><b>ROCK</b> - Represents: Rock move option</li>
 * <li><b>PAPER</b> - Represents: Paper move option</li>
 * <li><b>SCISSORS</b> - Represents: Scissors move option</li>
 * <li><b>UNKNOWN</b> - Represents: Indeterminated state</li>
 * </ul>
 * @author Angel Montilla
 * @version 0.1
 * @see java.lang.Enum
 */
public enum RoundValue {
    ROCK("Rock"), PAPER("Paper"), SCISSORS("Scissors"), UNKNOWN("Unknown");
    
    /* Not JavaDoc
     * Wrapper on int for value
     */
    private final String value;
        
    /**
     * <b>RoundValue</b> With no wrap
     * @param value int value to take
     * @throws IllegalArgumentException if not allowed value
     * @see java.lang.ExceptionInInitializerError
     */
    RoundValue(String value) {
        if (value.toUpperCase().equals("ROCK") || 
            value.toUpperCase().equals("PAPER") || 
            value.toUpperCase().equals("SCISSORS") || 
            value.toUpperCase().equals("UNKNOWN"))
            this.value = value;
        else
            throw new IllegalArgumentException("RoundValue can´t create " + value + " RoundValue");
    }
    
    /**
     * <b>toString</b> Convert RoundValue to representative String
     * <p>Allowed return values are:
     * <ul>
     * <li>Rock</li>
     * <li>Paper</li>
     * <li>Scissors</li>
     * <li>Unknown</li>
     * </ul>
     * </p>
     * @return String that represents RoundValue Content
     */
    @Override
    public String toString() {        
        return value;
    }
}
