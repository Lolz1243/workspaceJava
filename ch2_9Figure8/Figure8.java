import kareltherobot.*;

/**
 *  Class Figure8 allows a robot to move in a figure eight pattern. 
 *  The robot first moves around each corner in an hourglass pattern.
 *  Finally it ends in the same position it started. 
 *
 *  @author  Nikhil Vytla
 *  @version 1/10/17
 *  @author  Period: 7
 *  @author  Assignment: KJR Chapter 2, Problem 9 - Figure8
 *
 *  @author  Sources: None
 */
public class Figure8 extends UrRobot
{
    /**
     * Default constructor for an UrRobot
     * 
     * @param st    street
     * @param ave   avenue
     * @param dir   direction robot is facing
     * @param beeps number of beepers
     */
    public Figure8( int st, int ave, Direction dir, int beeps )
    {
        super( st, ave, dir, beeps );
    }

    /**
     * The method completes a Figure Eight around two beepers
     */
    public void doFigure8()
    {
        turnRight();
        move();
        turnLeft();
        move();
        move();
        turnLeft();
        move();
        turnLeft();
        turnLeft();
        move();
        turnLeft();
        move();
        move();
        turnLeft();
        move();
        move();
        turnLeft();
        move();
        move();
        move();
        move();
        turnLeft();
        move();
        turnLeft();

    }
    
    /**
     * The method turnRight() allows the robot to turn left 3 times.
     */
    public void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
   
}
