import kareltherobot.*;

/**
 *  Draws an 'H' on a blank 10 x 10 world by placing beepers.
 *
 *  @author  Nikhil Vytla
 *  @version 1/5/17
 *  @author  Period: 7
 *  @author  Assignment: HBotProj
 *
 *  @author  Sources: None
 */
public class HBot extends UrRobot
{
    public HBot( int street, int avenue, Direction direction, int beepers )
    {
       super( street, avenue, direction, beepers );
    }

    public void drawH()
    {
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        turnLeft();
        turnLeft();
        move();
        turnLeft();
        move();
        putBeeper();
        move();
        putBeeper();
        turnLeft();
        move();
        putBeeper();
        turnLeft();
        turnLeft();
        move();
        move();
        putBeeper();
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        move();
        turnLeft();
        turnLeft();
        turnLeft();
        // TODO: Complete method
    }
}
