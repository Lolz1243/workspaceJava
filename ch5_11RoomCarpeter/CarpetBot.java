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
public class CarpetBot extends SmartBot
{
    /**
     * Default Robot constructor.
     * 
     * @param st         initial street
     * @param av         initial avenue
     * @param dir        direction this robot is facing
     * @param numBeepers number of beepers this robot has in its beeper bag
     */
    public CarpetBot( int st, int av, Direction dir, int numBeepers )
    {
        super( st, av, dir, numBeepers );
    }

    /**
     * 
     * Main method for CarpetBotTest.java.
     * Compiles all the other methods into a succinct method which is
     * simple and easy to use.
     */
    public void carpetRooms()
    {
        overLord();
        overLord();
        overLord();
        overLord();
        overLord();
        overLord();
        overLord();
        overLord();
        move();
    }

    /**
     * 
     * Method checkRoom() checks whether each "room" has three walls
     * on the front, left, and right.
     * @return true if there are three walls in the "room"
     */
    public boolean checkRoom()
    {
        if ( !frontIsClear() && !leftIsClear() && !rightIsClear() )
        {
            putBeeper();
            return true;
        }
        return false;
    }
    /**
     * 
     * Method moveIntoRoom() lets the robot move into each room in
     * an efficient manner.
     */
    public void moveIntoRoom()
    {
        move();
        turnLeft();
        move();
    }
    /**
     * 
     * Method moveOutOfRoom() lets the robot exit the room by
     * backing up and turning right.
     */
    public void moveOutOfRoom()
    {
        backUp();
        turnRight();
    }
    /**
     * 
     * Method overLord minimizes all the above code into three
     * lines, and repeats the methods moveIntoRoom(), check Room()
     * and moveOutOfRoom().
     */
    public void overLord()
    {
        moveIntoRoom();
        checkRoom();
        moveOutOfRoom();
           
    }
}             