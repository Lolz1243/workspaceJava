import kareltherobot.*;
import java.awt.Color;


/**
 *  Class WestWallBeeperGetter gets a beeper next to a wall.
 *  In the process, it ignore all other beepers and finally 
 *  returns to the start position.
 *
 *  @author  nvytla071
 *  @version Feb 9, 2017
 *  @author  Period: 7
 *  @author  Assignment: ch7_1_3RecursionWorld
 *
 *  @author  Sources: None
 */

public class WestWallBeeperGetter extends SmartBot
{
    /**
     * 
     * @param st initial street
     * @param av initial avenue
     * @param dir direction the robot is facing
     * @param beeps number of beepers in beeper bag
     * @param badge color of robot
     */
    public WestWallBeeperGetter( int st, int av, Direction dir, int beeps,
        Color badge )
    {
        super( st, av, dir, beeps, badge );
    }

    /**
     * 
     * getBeeper() finds the beeper next to the wall, picks it up, and
     * returns back to the start position.
     */
    public void getBeeper()
    {
        if ( !anyBeepersInBeeperBag() )
        {
            faceWest();
        }
        
        if ( !frontIsClear() && nextToABeeper() )
        {
            pickBeeper();
            turnAround();
            return;
        }
        
        move();
        getBeeper();
        move();
    }
}
