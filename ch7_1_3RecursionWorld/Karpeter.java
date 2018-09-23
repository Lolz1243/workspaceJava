import kareltherobot.*;
import java.awt.Color;

/**
 * Class Karpeter moves Karel around a rectangle. While moving around
 * this rectangle, Karel puts beepers on every spot until it reaches
 * a beeper. Then it stops and counts the number of beepers it has
 * placed.
 *
 *  @author  nvytla071
 *  @version Feb 7, 2017
 *  @author  Period: 7
 *  @author  Assignment: ch7_1_3RecursionWorld
 *
 *  @author  Sources: None
 */
public class Karpeter extends SmartBot
{
    /**
     * 
     * @param st initial street
     * @param av initial avenue
     * @param dir direction the robot is facing
     * @param beeps number of beepers in beeper bag
     * @param badge color of robot
     */
    public Karpeter( int st, int av, Direction dir, int beeps, Color badge )
    {
        super( st, av, dir, beeps, badge );
    }

    /**
     * 
     * carpetHallway() is the main method in the class Karpeter. It places
     * beepers in a rectangular fashion and counts the number of beepers it
     * has placed.
     * @return integer carpetHallway() lets the robot count how many beepers
     * it put down
     */
    public int carpetHallway()
    {
        if (nextToABeeper())
        {
            return 0;
        }
        
        if ( !frontIsClear() )
        {
            turnRight();
        }
        
        if ( !nextToABeeper() )
            {
                putBeeper();
                move();
            }
            
            return carpetHallway() + 1;
    }
}
