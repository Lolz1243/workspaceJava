import kareltherobot.*;


/**
 * Class CarpetLayer extends the utility class BetterTurner. CarpetLayer allows
 * the robot to move and place beepers in a square pattern.
 * 
 * @author Nikhil Vytla
 * @version 1/18/17
 * 
 * @author Period - 7
 * @author Assignment - KJR Chapter 3, Problem 8 - CarpetLayer
 * 
 * @author Sources - None
 */

public class CarpetLayer extends BetterTurner
{
    /**
     * Default UrRobot constructor.
     * 
     * @param st
     *            initial street
     * @param av
     *            initial avenue
     * @param dir
     *            direction this robot is facing
     * @param beeps
     *            number of beepers this robot has in its beeper bag
     */
    public CarpetLayer( int st, int av, Direction dir, int beeps )
    {
        super( st, av, dir, beeps );
    }


    /**
     * 
     * Main method for CarpetLayer robot to follow. Moves in a rectangle motion.
     */
    public void layCarpet()
    {
        beeperLine();
        beeperLine();
        beeperLine();
        beeperLine();
        turnOff();
    }


    /**
     * 
     * Moves one space forward and places a beeper at the current corner.
     */
    public void moveAndPut()
    {
        move();
        putBeeper();
    }


    /**
     * 
     * Moves the CarpetLayer robot in a line and turns right at the carpet
     * corner.
     */
    public void beeperLine()
    {
        moveAndPut();
        moveAndPut();
        moveAndPut();
        moveAndPut();
        moveAndPut();
        moveAndPut();
        moveAndPut();
        turnLeft();
    }
}
