import kareltherobot.*;
import java.awt.Color;

/**
 * Class BeeperMover moves a row of beepers from one street to another,
 * which is several streets North. By using recursion, it picks up 
 * each beeper, remembers how many beepers it has picked up, and moves
 * that same number of streets North before finally placing those beepers
 * down again.
 *
 *  @author  nvytla071
 *  @version Feb 9, 2017
 *  @author  Period: 7
 *  @author  Assignment: ch7_1_3RecursionWorld
 *
 *  @author  Sources: None
 */
public class BeeperMover extends SmartBot
{
    /**
     * 
     * @param st initial street
     * @param av initial avenue
     * @param dir direction this robot is facing
     * @param beeps number of beepers this robot has in its beeper bag
     * @param badge color of the robot badge
     */
    public BeeperMover( int st, int av, Direction dir, int beeps, Color badge )
    {
        super( st, av, dir, 0, badge );
    }

    /**
     * 
     * moveBeepersNorth() moves all the beepers in a certain street a 
     * certain number of blocks north, then drops them off.
     */
    public void moveBeepersNorth()
    {
        findStart();
        pickAndTranslateSelfToTheNorth();
        faceWest();
        dropRow();
    }

    /**
     * 
     * findStart() lets Karel find the beginning of the line where it
     * started.
     */
    private void findStart()
    {
        if ( nextToABeeper() )
        {
            return;
        }
        move();
        findStart();
    }

    /**
     * 
     * pickAndTranslateSelfToTheNorth() picks up all the beepers in
     * that row and then moves all the way up to the North.
     */
    private void pickAndTranslateSelfToTheNorth()
    {
        if ( !nextToABeeper() )
        {
            turnAround();
            move();
            turnRight();
            return;
        }
        
        pickBeeper();
        move();
        pickAndTranslateSelfToTheNorth();
        move();
    }

    /**
     * 
     * dropRow() puts all the beepers down in a row the same length
     * as the row that Karel picked up.
     */
    private void dropRow()
    {
        if ( anyBeepersInBeeperBag() )
        {
            putBeeper();
            move();
        }
        else
        {
            return;
        }
        
        dropRow();
    }
}
