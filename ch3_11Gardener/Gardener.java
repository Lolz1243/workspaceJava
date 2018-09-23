import kareltherobot.*;


/**
   Class Gardener creates a robot with the ability to follow around the path
   of a cross.
   The robot starts at the bottom and uses several methods to go around the
   cross. It begins and ends in the same position.

   @author  Nikhil Vytla
   @version 1/13/17

   @author  Period - 7
   @author  Assignment - ch3_Olympics

   @author  Sources - None
 */
public class Gardener extends BetterTurner
{
    /**
     * Default constructor for a Gardener. Invokes the
     * constructor of the BetterTurner superclass
     * 
     * @param st    intial street on which this robot is to be located
     * @param av    intial avenue on which this robot is to be located
     * @param dir   initial direction for this robot to face
     * @param beeps number of beepers in this robot's beeper bag
     */
    public Gardener( int st, int av, Direction dir, int beeps )
    {
        super( st, av, dir, beeps );
    }

    /**
     * The main method of the program. The only method called by
     * the driver. Plants beepers around the cross.
     */
    public void plantGarden()
    {
        moveToStart();
        move();
        putBeeper();
        move();
        putBeeper();
        turnLeft();
        moveAndPutThree();
        turnRight();
        moveAndPutThree();
        turnEnd();
        moveAndPutThree();
        turnRight();
        moveAndPutThree();
        turnEnd();
        moveAndPutThree();
        turnRight();
        moveAndPutThree();
        turnEnd();
        moveAndPutThree();
        turnRight();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        returnToStart();
    }
    /**
     * 
     * The robot moves to the start at the bottom of
     * the garden.
     */
    public void moveToStart()
    {
        turnLeft();
        move();
        move();
    }
    /**
     * 
     * The robot ends by returning to 2,2 facing South.
     */
    public void returnToStart()
    {
        turnRight();
        move();
        move();
        move();
        turnLeft();
    }
    /**
     * 
     * This method lets the robot go in a straight line
     * and place beepers for three spaces.
     */
    public void moveAndPutThree()
    {
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
    }
    /**
     * 
     * This method lets the robot turn around the ends
     * of the cross.
     */
    public void turnEnd()
    {
        turnLeft();
        move();
        putBeeper();
        turnLeft();
    }
}