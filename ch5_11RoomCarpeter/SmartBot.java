import kareltherobot.*;


/**
 * 
 *  TODO Write a one-sentence summary of your class here.
 *  TODO Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author  Nikhil Vytla
 *  @version Jan 26, 2017
 *  @author  Period: 7
 *  @author  Assignment: ch5_11RoomCarpeter
 *
 *  @author  Sources: None
 */

public class SmartBot extends Robot
{
    /**
     * Default Robot constructor.
     * 
     * @param st         initial street
     * @param av         initial avenue
     * @param dir        direction this robot is facing
     * @param numBeepers number of beepers this robot has in its beeper bag
     */
    public SmartBot( int st, int av, Direction dir, int numBeepers )
    {
        super( st, av, dir, numBeepers );
    }

    /**
     * Change this robot's position 90 degrees to the right.
     */
    public void turnAround()
    {
        turnLeft();
        turnLeft();
    }

    /**
     * Change this robot's position 90 degrees to the right.
     */
    public void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    /**
     * Move this robot back one corner.
     */
    public void backUp()
    {
        turnAround();
        move();
        turnAround();
    }

    /**
     * @return true if there is no left wall.
     */
    public boolean leftIsClear()
    {
        turnLeft();
        
        if ( frontIsClear() )
        {
            turnRight();
            return true;
        }
        
        turnRight();
        return false;
    }

    /**
     * @return true if there is no right wall.
     */
    public boolean rightIsClear()
    {
        turnRight();
        
        if ( frontIsClear() )
        {
            turnLeft();
            return true;
        }
        
        turnLeft();
        return false;
    }
}
