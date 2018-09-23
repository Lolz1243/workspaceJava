import kareltherobot.*;

/**
 * 
 *  TODO Write a one-sentence summary of your class here.
 *  TODO Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author  Nikhil Vytla
 *  @version Jan 27, 2017
 *  @author  Period: 7
 *  @author  Assignment: ch6_17EscapeBot
 *
 *  @author  Sources: None
 */
public class EscapeBot implements Directions
{
    /**
     * The main method initializes a MazeWalker bot called jeff. This bot
     * follows the maze walls until it reaches a beeper.
     * @param args - the arg is the initialized MazeWalker jeff.
     */
    public static void main( String [] args )
    {
        MazeWalker jeff = new MazeWalker(1, 1, East, 0);
        
        while ( !jeff.nextToABeeper() )
        {
            jeff.followWallRight();
        }
        jeff.turnOff();
    }

//    static
//    {
//        World.reset();
//        World.readWorld( "ch6_17.wld" );
//        World.setDelay( 1 );
//        World.setVisible( true );
//    }
}
