
/**
 * Groks are bad actors in a game.  Groks have the ability to ingest
 * a PowerPill to replenish their energy.  This makes them difficult
 * to kill.
 *
 * @author (You Again)
 * @version (0.1)
 */
public class Grok
{
    // implement this class per instructions in Required Activities.
    private static final int DEFAULT_POWER_LEVEL = 50;
    private int powerLevel;

    /**
     \* Initializes a Grok object to the default power level of 50.
     */
    public Grok(){
        powerLevel = DEFAULT_POWER_LEVEL;
    }

    public Grok(int powerLevel){
        this.powerLevel = powerLevel;
    }

    /**
     * Returns the power level of this Grok.
     * @return returns the power level of this Grok
     */
    public int getPowerLevel(){return powerLevel;}

    /**
     * Sets the power level of this Grok
     * @param powerLevel the power value to set for this Grok
     */
    public void setPowerLevel(int powerLevel){this.powerLevel = powerLevel;}

    /**
     * Set the power level of this Grok to the power level of the pill.
     * @param pill the PowerPill that this Grok took.
     * The power of the pill is added to the power level of this Grok
     */
    public void takePowerPill(PowerPill pill){powerLevel += pill.getPower();}

    public void tookHit(){powerLevel -= 5;}


}