import kareltherobot.*;

/**
 * 
 * Class PinSetter allows the robot to place pins in a triangle
 * form by repeating triangles.
 * The robot finally returns to its start position.
 *
 *  @author  nvytla071
 *  @version Jan 12, 2017
 *  @author  Period: 7
 *  @author  Assignment: ch3_2PinSetter
 *
 *  @author  Sources: None
 */
public class PinSetter extends BetterTurner
{
    /**
     * 
     * @param st - street of the robot world
     * @param av - avenue of the robot world
     * @param dir - north, south, east, or west
     * @param beeps - number of beepers
     */
    public PinSetter( int st, int av, Direction dir, int beeps )
    {
        super( st, av, dir, beeps );
    }

    /**
     * 
     * Method setPins() sets all pins. It is the main 
     * method called by the driver.
     */
    public void setPins()
    {
        move(); // moves to pin 1
        setTriangle();
        moveToPin6From3();
        setTriangle();
        moveToPin4From10();
        setTriangle();
        moveToPin5From8();
        putBeeper();
        moveBackHome();
    }
    
    /**
     * Method setTriangle() makes a triangle of pins.
     */
    private void setTriangle()
    {
        putBeeper();
        move();
        turnLeft();
        move();
        putBeeper();
        turnAround();
        move();
        move();
        putBeeper();
    }
    /**
     * moveToPin6From3 moves the robot from pin 3 to pin 6 and sets it up.
     */
    private void moveToPin6From3()
    {
        move();
        turnLeft();
        move();
    }
    /**
     * moveToPin4From10 moves the robot from pin 10 to pin 4 and sets it up.
     */
    private void moveToPin4From10()
    {
        turnAround();
        move();
        move();
        move();
        move();
        move();
        turnLeft();
        move();
        turnAround();
    }
    /**
     * moveToPin5From8 moves the robot from pin 8 to pin 5 and sets it up.
     */
    private void moveToPin5From8()
    {
        move();
        turnRight();
        move();
    }
    /** 
     * moveBackHome moves the robot to the initial start at (1, 5, North).
     */
    private void moveBackHome()
    {
        move();
        move();
        move();
        turnAround();
    }
}