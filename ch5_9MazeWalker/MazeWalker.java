import kareltherobot.*;
import kareltherobot.Directions.Direction;

/**
 * 
    MazeWalker is a class where a robot follows a right wall.
    The robot uses several if statements to accomplish this task.
 *
 *  @author  Nikhil Vytla
 *  @version Jan 27, 2017
 *  @author  Period: 7
 *  @author  Assignment: ch6_11EscapeBot
 *
 *  @author  Sources: None
 */

public class MazeWalker extends SmartBot
{
    /**
     * Default Robot constructor.
     * 
     * @param st     initial street
     * @param av     initial avenue
     * @param dir    direction this robot is facing
     * @param numBeepers  number of beepers this robot has in its beeper bag
     */
    public MazeWalker( int st, int av, Direction dir, int numBeepers )
    {
        super( st, av, dir, numBeepers );
    }

    /**
     * precondition: there is a wall directly to the right of this robot
     * postcondition: moves along the wall one step keeping its position so
     *                that the wall remains on its right
     */
    public void followWallRight()
    {
        if ( frontIsClear() )
        {
            if ( !rightIsClear() )
            {
                move();
                if (rightIsClear())
                {
                    turnRight();
                    move();
                    
                    if (rightIsClear())
                    {
                        turnRight();
                        move();
                    }
                }
            }
            else
            {
                turnRight();
                move();
            }
        }
        else
        {
            if ( !rightIsClear() )
            {
                turnLeft();
            }
            
        }
    }
}              