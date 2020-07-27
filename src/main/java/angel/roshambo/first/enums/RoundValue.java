/*
 * First RoShamBo
 * Creado el 26-jul-2020 a las 20:15:14
 */
package angel.roshambo.first.enums;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <strong>RoundValue</strong> Enumerated that describes Round valid values.
 * <p>It represents the diferents options a gamer can take.<br>Extends {@link java.lang.Enum}</p>
 * <p>In the same sense, it converts options toString() for representation</p>
 * <p>Allowed values</p>
 * <ul>
 * <li><b>0 - ROCK</b> - Represents: Rock move option</li>
 * <li><b>1 - PAPER</b> - Represents: Paper move option</li>
 * <li><b>2 - SCISSORS</b> - Represents: Scissors move option</li>
 * <li><b>3 - UNKNOWN</b> - Represents: Indeterminated state</li>
 * </ul>
 * @author Angel Montilla
 * @version 0.1
 * @see java.lang.Enum
 */
public enum RoundValue {
    ROCK(0), PAPER(1), SCISSORS(2), UNKNOWN(3);
    
    /* Not JavaDoc
     * Wrapper on int for value
     */
    private final Integer value;
    /* Not JavaDoc
     * ConcurrentHashMap for making valueOf and values work!
     */
    private static final Map<Integer, RoundValue> internalMap = new ConcurrentHashMap<Integer, RoundValue>();
    
    /**
     * <strong>static</strong> Initialice for getValue and valueOf
     * <p>It has been done in static context</p>
     * <p>For concurrency</p>
     */
    static {
        for (RoundValue rv : RoundValue.values())
            internalMap.put(rv.value, rv);
    }
    
    /**
     * <b>RoundValue</b> With no wrap
     * @param value int value to take
     * @throws IllegalArgumentException if not allowed value
     * @see java.lang.IllegalArgumentException
     */
    RoundValue(int value) {        
        if (value>=0 && value<=3)
            this.value = value;
        else
        {
            this.value = 3;
            throw new IllegalArgumentException("RoundValue: Only admits Rock, Paper or Scissor values (also Unknown)");
        }
    }
    
    /**
     * <b>valueOf</b> Get the RoundValue Enum from a valid int number
     * <p>Getting the Enumerated RoundValue object from that int value</p>
     * @param value int between 0 to 3 indicating rock, paper, scissors or unknown
     * @return RoundValue the enum
     * @throws IllegalArgumentException
     * @see java.lang.IllegalArgumentException
     */
    public static RoundValue valueOf(int value) {
        if (value<0 || value>3)
            throw new IllegalArgumentException("RoundValue valueOf(): can't create enum with not allowed values");
        
        return (RoundValue)internalMap.get(value);
    }
    
    /**
     *
     * @param value
     * @return
     */
    public static RoundValue valueOfString(String value) {
        return (RoundValue)internalMap.get(0);
    }
    
    /**
     * <b>getValue</b> Helper for several programming situations
     * <p>Getting RoundValue value as int</p>
     * @return int RoundValue value
     */
    public int getValue() {
        return value;
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
        String res="";
        
        switch(value) {
            case 0:
                res = "Rock";
                break;
            case 1:
                res = "Paper";
                break;
            case 2:
                res = "Scissors";
                break;
            case 3:
                res = "Unknown";
                break;
            default:
                throw new IllegalArgumentException("RoundValue toString(): RoundValue in an illegal state");
        }
        
        return res;
    }
}
