import kareltherobot.*;

/**
   Class Triathlete gains all the methods from BetterTurner.
   It allows the robot to go on a certain route through the
   main method of runRace().

   @author  Nikhil Vytla
   @version 1/17/17

   @author  Period - 7
   @author  Assignment - ch3_Olympics

   @author  Sources - None
 */
public class Triathlete extends BetterTurner
{
    /**
     * Default Triathlete constructor that extends BetterTurner
     * 
     * @param st     initial street of Karel world
     * @param av     initial avenue of Karel world
     * @param dir    direction this robot is facing
     * @param beeps  number of beepers this robot has in its beeper bag
     */
    public Triathlete( int st, int av, Direction dir, int beeps )
    {
        super( st, av, dir, beeps );
    }

    /**
     * 
     * Main method that allows the robot to go on a certain route.
     */
    public void runRace()
    {
        moveAndPick();
        moveAndPick();
        moveAndPick();
        moveAndPick();
        moveAndPick();
        moveAndPick();
        moveAndPick();
        move();
        turnLeft();
        move();
        turnRight();
        move();
        turnRight();
        move();
        turnLeft();
        move();
        upStair();
        upStair();
        upStair();
        upStair();
        move();
        putSeven();
        turnAround();
        moveFour();
        moveFour();
        moveFour();
        move();
        move();
        move();
        turnLeft();
        moveFour();
        turnLeft();
    }
    /**
     * 
     * allows the robot to move one space and
     * pick a beeper.
     */
    public void moveAndPick()
    {
        move();
        pickBeeper();
    }
    /**
     * 
     * allows the robot to move, turn left, move,
     * then turn right.
     */
    public void upStair()
    {
        move();
        turnLeft();
        move();
        turnRight();
    }
    /**
     * 
     * allows the robot to move 4 spaces in one
     * direction.
     */
    public void moveFour()
    {
        move();
        move();
        move();
        move();
    }
    /**
     * 
     * allows the robot to place 7 beepers down.
     */
    public void putSeven()
    {
        putBeeper();
        putBeeper();
        putBeeper();
        putBeeper();
        putBeeper();
        putBeeper();
        putBeeper();
    }
}