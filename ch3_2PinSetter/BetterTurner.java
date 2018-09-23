import kareltherobot.*;

/**
 * 
 *  BetterTurner defines two methods for use in PinSetter.java.
 *
 *  @author  nvytla071
 *  @version Jan 12, 2017
 *  @author  Period: 7
 *  @author  Assignment: ch3_2PinSetter
 *
 *  @author  Sources: None
 */

public class BetterTurner extends UrRobot
{
    /**
     * 
     * @param st - street of the robot world
     * @param av - avenue of the robot world
     * @param dir - north, south, east, or west
     * @param beeps - number of beepers
     */
    public BetterTurner( int st, int av, Direction dir, int beeps )
    {
        super( st, av, dir, beeps );
    }

    /**
     * Class turnRight() allows the robot to turn left three times.
     */
    public void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    /**
     * Class turnAround() allows the robot to turn left twice.
     */
    public void turnAround()
    {
        turnLeft();
        turnLeft();
    }
}